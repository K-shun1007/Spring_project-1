package com.example.demo.repository;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AnimalsAPIRepository {
	private static final String API_URL = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";
	
	public List<Animal> getAllAnimals() throws Exception {
		URL url = new URL(API_URL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRepuestMethod("GET");
		
		BufferedReader in = new BufferedReader(new inputStreeamReader(conn.getInputStream()));
		String inputLine;
		StringBuilder content = new StringBuilder();
		while ((inputLine = in.readLine()) != null) {
			contet.append(inputLine);
		}
		in.close();
		
		ObjectWapper mapper = new Objectmapper();
		return mapper.readValue(content.toString(), new TypeReference<List<Animal>>() {});
	}
	
	public Animal getAnimalById(int id) throws Exception {
		URL url = new URL(API_URL + "?id" + id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
	}
        in.close();

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, toString(), Animal.class);
}
