package com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opinionpoll.rest.webservices.opinionpollrestfulwebservices.model.Poll;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {

}
