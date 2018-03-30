package com.xzj.jpapro.service;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xzj.jpapro.dao.SqlBuilderUtil;

public class BaseService<T> {

	@Autowired private EntityManager em;
	
	public List<T> getListByObj(Object object) throws IllegalArgumentException, IllegalAccessException{
			
			Class <T> entityClass = (Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
			String tableName = entityClass.getAnnotation(Table.class).name();
			String sql = SqlBuilderUtil.buildSqlByObject(object, entityClass, tableName);
			if (StringUtils.isEmpty(sql)) {
				return null;
			}
			List<T> results = (List<T>) em.createNativeQuery(sql, entityClass).getResultList();
		
		return results;
		
	}
}
