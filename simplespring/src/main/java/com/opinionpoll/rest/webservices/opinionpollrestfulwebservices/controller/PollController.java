package com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.model.Poll;
import com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.repository.PollRepository;

@RestController
public class PollController {

	@Autowired
	private PollRepository pollRepository;

	@GetMapping("/allpolls")
	public List<Poll> getAllPolls() {
		return this.pollRepository.findAll();
	}
}
