package com.telstra.assignment.service;

import org.springframework.stereotype.Service;

import com.telstra.assignment.error.InvalidSideException;

@Service
public interface TriangleService {

	public String findType(String a,String b, String c) throws InvalidSideException;

}
