package com.abhishek;

import java.util.List;

public class Question {
	
	private  int questionId;
	private String question;
	private String answers;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "["+questionId+","+question+","+answers+"]";
		
		
		
	}
	
	
}
