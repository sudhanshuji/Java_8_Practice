package com.modernjava.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Hello World!");
//		Optional<String> optionalString = Optional.of(null); It will throw the error
//		Exception in thread "main" java.lang.NullPointerException
		System.out.println("Optional String : "+optionalString);
		
		System.out.println("getWords : "+getWords());
		
	}
	
	public static Optional<String> getWords(){
		String[] words = new String[10];
		words[1] = "test";
		Optional<String> optionalS = Optional.ofNullable(words[1]);
		if (optionalS.isPresent()) {
			return optionalS;
		}
		else
			return Optional.empty();
	}

}
