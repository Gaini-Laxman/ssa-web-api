package com.klinnovations.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsaRestController {

	@GetMapping("/ssn/{ssn}")
	public String getStateName(@PathVariable String ssn) {

		if (ssn.startsWith("6")) {
			return "New Jersey";
		} else if (ssn.startsWith("5")) {
			return "Rhode Island";
		} else if (ssn.startsWith("4")) {
			return "Ohio";
		} else if (ssn.startsWith("3")) {
			return "California";
		} else {
			return "Invalid SSN";
		}
	}

}
