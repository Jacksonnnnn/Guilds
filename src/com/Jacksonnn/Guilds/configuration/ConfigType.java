package com.Jacksonnn.Guilds.configuration;

import java.util.HashMap;

public class ConfigType {
	
	private static final HashMap<String, ConfigType> ALL_TYPES = new HashMap<>();
	
	
	public static final ConfigType DEFAULT = new ConfigType("Default");
	public static final ConfigType LANGUAGE = new ConfigType("Language");
	public static final ConfigType[] CORE_TYPES = { DEFAULT, LANGUAGE };
	
	public ConfigType(String string) {
		ALL_TYPES.put(string, this);
	}
}
