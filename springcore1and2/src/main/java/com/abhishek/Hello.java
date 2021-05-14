package com.abhishek;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hello {

	private List<Question> list;

	public void getList() {
		for (Question q : list) {
			System.out.println(q.getAnswers());
		}
	}

	public void setList(List<Question> list) {
		this.list = list;
	}

	private Set<Question> set;

	public void getSet() {
		for (Question q : set) {
			System.out.println(q.getAnswers());
		}
	}

	public void setSet(Set<Question> set) {
		this.set = set;
	}

	private Map<Integer, Question> map;

	public void getMap() {
		for (Map.Entry<Integer, Question> q : map.entrySet()) {
			System.out.println(q.getKey() + "=" + q.getValue().getAnswers());
		}

	}

	public void setMap(Map<Integer, Question> map) {
		this.map = map;
	}

}
