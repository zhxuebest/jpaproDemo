# jpapro

pom中添加
<dependency>
  <groupId>com.github.zhxuebest</groupId>
  <artifactId>JpaPro</artifactId>
  <version>0.0.1-RELEASE</version>
</dependency>

对于复杂查询，封装了一个baseService，只要继承这个service，可以根据obj进行查询，查询的条件就是obj不为空的字段
public class OrderService extends BaseService<Order>{
	private static final Log logger = LogFactory.getLog(OrderService.class);

	@Autowired
	private OrderDao orderDao;
	
	public List<Order> findbyObj(Order order) throws IllegalArgumentException, IllegalAccessException{
		List<Order> orders = getListByObj(order);
		logger.info(orders);
		return orders;
	}
	
大爷赏一个吧
 <img src="https://github.com/zhxuebest/jpapro/blob/master/src/main/resources/241522636282_.pic.jpg" width="20%" height="20%" alt="还在路上，稍等..."/> 
