package com.telstra.assignment.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.telstra.assignment.controller.ServiceController;
import com.telstra.assignment.error.InvalidSideException;

@Service
public class TriangleServiceImpl implements TriangleService {
	private static final Logger log = LoggerFactory.getLogger(ServiceController.class);

	@Override
	public String findType(String a, String b, String c) throws InvalidSideException {
		String type = "Scalene";

		try {
			log.info("Inside try of triagnle");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			int z = Integer.parseInt(c);
			if (x <= 0 || y <= 0 || z <= 0)
				throw new InvalidSideException("Invalid side,only integers allowed", "200",
						LocalDateTime.now().toString());
			if (x + y <= z || x + z <= y || y + z <= x)
				type = "Invalid side,some of two sides is less than one side ";
			if (x == y || y == z || z == x)
				type = "Isocless triangle";
			if (x == y && y == z)
				type = "Equilateral triangle";

		}

		catch (NumberFormatException ne) {

			throw new InvalidSideException("Invalid side,only integers allowed", "200", "mytimeis here");

		}
		return type;

	}

}
