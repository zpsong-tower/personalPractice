package pers.tower;

import pers.tower.questions.*;

/**
 * 测试类，测试当前题目输出是否符合预期
 *
 * @author zpsong-tower <pingzisong2012@gmail.com>
 * @since 2020/11/6 3:01
 */
public class Test {
	public static void main(String[] str) {
		Question242 q = new Question242();
		String s = "anagram";
		String t = "nagaram";
		System.out.println(q.isAnagram(s, t)); // true
		s = "rat";
		t = "car";
		System.out.println(q.isAnagram(s, t)); // false
	}
}
