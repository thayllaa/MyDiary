package com.projeto.MyDiary.model;

public class Task {
	
	private int id;
	private String name, category, description;
	private String start, finish;
	
	public Task() {}
	
	public Task(int id, String name, String category, String description,
			String start, String finish) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.start = start;
		this.finish = finish;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}
}
