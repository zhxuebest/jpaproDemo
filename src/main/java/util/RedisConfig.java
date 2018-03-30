package util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis 配置解析
 */
@Service
public class RedisConfig {

	@Autowired
	private Environment environment;

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(environment.getRequiredProperty("spring.redis.host"));
		factory.setPort(environment.getRequiredProperty("spring.redis.port", Integer.class));
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(environment.getRequiredProperty("spring.redis.pool.max-idle", Integer.class));
		config.setMinIdle(environment.getRequiredProperty("spring.redis.pool.min-idle", Integer.class));
		config.setMaxWaitMillis(environment.getRequiredProperty("spring.redis.pool.max-wait", Long.class));
		config.setTestOnBorrow(true);
		config.setTestOnReturn(true);
		factory.setPoolConfig(config);
		return factory;
	}

	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<Object, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(factory);
		template.setKeySerializer(new StringRedisSerializer());
		// template.setValueSerializer(new StringRedisSerializer());
		return template;
	}

}
