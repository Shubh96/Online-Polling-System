package onlinePollingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator {

	@SuppressWarnings("unused")
	void RegisterCandidate() throws IOException {
		String name, party, gender;
		int age, ID = 0;

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(input);
		Candidate candid;

		System.out.println("Candidate name: ");
		name = read.readLine();

		System.out.println("Candidate age: ");
		age = read.read();

		System.out.println("Candidate party: ");
		party = read.readLine();

		System.out.println("Candidate gender: ");
		gender = read.readLine();

		candid = new Candidate(ID, age, name, party, gender);

	};

}
