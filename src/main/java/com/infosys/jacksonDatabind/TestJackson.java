package com.infosys.jacksonDatabind;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Student student = new Student("Rishi", 54, "Pune");
		
		objectMapper.writeValue(new File("target/std1.json"), student);
		
		
		File file = new File("src/main/resources/Student.json");
		
		Student student2 = objectMapper.readValue(file, Student.class);
		
		System.out.println("Student 2 after reading JSOn : "+ student2);
	}
}
