package com.kagiso.ChallengeApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class ChallengeController {
   //Declare an Array list to hold Challenge object
	private List<Challenge> challenges = new ArrayList<>();
	
	//List all the challenges
	@GetMapping("/challenges")
	public List<Challenge> getAllChallenges (){
		
		return challenges;
	}
	
	//Add a challenge to the application
	@PostMapping("/challenges")
	public String addChallenge(@RequestBody Challenge challenge) {
		challenges.add(challenge);
		return "Challenge added succesfully";
	}
}
