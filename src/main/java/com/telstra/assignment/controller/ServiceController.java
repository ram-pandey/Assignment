package com.telstra.assignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.assignment.error.InvalidSideException;
import com.telstra.assignment.service.TriangleService;

@RestController
@RequestMapping("/api")

public class ServiceController {

	@Autowired
	TriangleService triangleService;

	private static final Logger log = LoggerFactory.getLogger(ServiceController.class);

	@RequestMapping("/TriangleType")

	ResponseEntity<String> TriangleType(@RequestParam String a, @RequestParam String b,

			@RequestParam String c) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("pragma", "no-cache");
		headers.add("cache-control", "no-cache");

		try {
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(triangleService.findType(a, b, c));
		} catch (InvalidSideException ie) {
			return ResponseEntity.status(HttpStatus.OK).headers(headers).body(ie.toString());
		}

	}

	@RequestMapping("/Fibonacci")

	String fibonacci() {

		log.info("Hi I am in fibonacci");
		return "Hi THis is Ram shyam";
	}

	@RequestMapping("/ReverseWords")

	String reverseWords() {

		return "Hi THis is Ram Ram";
	}

	@RequestMapping("/makeonearray")

	String makeonearray() {

		return "Hi THis is Ram Ram";
	}

}
