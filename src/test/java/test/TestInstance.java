package test;

import java.util.Map;

import service.MapMonAn;

public class TestInstance {
	public static void main(String[] args) {
		MapMonAn.getInstance().start();
		Map<Object, Integer> map=MapMonAn.getInstance().getMapMonAn();
		map.put("a", 1);
		map.put("b", 2);
		System.out.println(map);
		Map<Object, Integer> map2=MapMonAn.getInstance().getMapMonAn();
		System.out.println(map2);
	}
}
