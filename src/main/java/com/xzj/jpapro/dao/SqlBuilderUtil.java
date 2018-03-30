package com.xzj.jpapro.dao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.persistence.Column;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SqlBuilderUtil {

	private static final Log logger = LogFactory.getLog(SqlBuilderUtil.class);

	private static final String AND = " and ";

	public static String buildSqlByObject(Object object, Class clazz, String tableName) throws IllegalArgumentException, IllegalAccessException {
		
		
		if (clazz.isInstance(object)) {
			String sql = "select ";
			String selectFiled = "";
			String conditions = "";
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				Annotation annotation = field.getAnnotation(Column.class);
	            String column = ((Column)annotation).name();
				selectFiled += "," + column;
				conditions = addOneCon(object, conditions, field, column);
			}
			if (StringUtils.isEmpty(conditions)) {
				logger.info("there is no any conditions");
				return null;
			}
			selectFiled = selectFiled.substring(1);
			conditions =  conditions.substring(4);
			sql +=  " * from " + tableName + " where " + conditions;
			return sql;
		}
		return null;
	}

	

	private static String addOneCon(Object object, String conditions, Field field, String column) throws IllegalAccessException {
		
		String name = field.getName();
		name = name.substring(0,1).toUpperCase() + name.substring(1); //将属性的首字符大写，方便构造get，set方法
		String type = field.getType().toString();
		field.setAccessible(true);
		if(type.equals("class java.lang.String")){ //如果type是类类型，则前面包含"class "，后面跟类名
			String stringValue = (String) field.get(object);
			if (StringUtils.isNotEmpty(stringValue)) {
				conditions += AND + column + "=" + field.get(object);
			}
		}else  if(type.equals("class java.lang.Integer")){
			Integer intValue = (Integer) field.get(object);
			if (intValue!= null && intValue != 0) {
				conditions += AND + column + "=" + intValue;
			}
		}else if(type.equals("class java.lang.Short")){
			Short shortValue = (Short) field.get(object);
			if (shortValue!= null && shortValue != 0) {
				conditions += AND + column + "=" + shortValue;
			}
		}else if(type.equals("class java.lang.Double")){
			Double doubleValue = (Double) field.get(object);
			if (doubleValue!= null && doubleValue != 0) {
				conditions += AND + column + "=" + doubleValue;
			}
		}else if(type.equals("class java.lang.Long")){
			Long longValue = (Long) field.get(object);
			if (longValue!= null && longValue != 0) {
				conditions += AND + column + "=" + longValue;
			}
		}else {
			if (field.get(object)!= null) {
				conditions += AND + column + "=" + field.get(object);
			}
		}
		
		return conditions;
	}
	
}
