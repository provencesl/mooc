package com.edu.util;

import java.util.UUID;

import org.json.*;



public class GuidUtil {
	public static String getNewGuid(){
		UUID uuid = UUID.randomUUID();
		  return uuid.toString();  
	}
}
