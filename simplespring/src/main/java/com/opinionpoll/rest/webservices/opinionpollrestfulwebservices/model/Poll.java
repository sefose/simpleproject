package com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String token;
	private String question;

	public Poll() {

	}

	public Poll(Long id, String token, String question) {
		super();
		this.id = id;
		this.token = token;
		this.question = question;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Poll [id=" + this.id + ", token=" + this.token + ", question=" + this.question + "]";
	}
}
