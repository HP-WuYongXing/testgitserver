package com.yx.tool;

import java.io.ByteArrayOutputStream;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils<T>{
	private JsonGenerator jsonGenerator = null;
	private ObjectMapper objectMapper = null;
	
	public String getJSONFromObject(T t){
		objectMapper = new ObjectMapper();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String result=null;
		try{
			jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(bos,JsonEncoding.UTF8);
			jsonGenerator.writeObject(t);
			result = bos.toString();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return result;
	}
}
