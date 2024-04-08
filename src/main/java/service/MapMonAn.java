package service;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMonAn {
	private static MapMonAn instance;
	private Map<Object, Integer> mapMonAn;
	
	public static MapMonAn getInstance() {
		if (instance == null) {
			instance = new MapMonAn();
		}
		return instance;
	}
	
	private MapMonAn() {
	}
	
	public  Map<Object, Integer> getMapMonAn() {
		return mapMonAn;
	}
	
	public void start() {
		mapMonAn = new LinkedHashMap<Object, Integer>();
	}
}
