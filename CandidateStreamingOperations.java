package com.citiustech.Day1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
	
		//list candidate names from Pune city
		System.out.println("=======List of Pune Candidates:==========");
		InterviewRepository.getCandidateList().stream().filter(p->(p.getCity().equalsIgnoreCase("pune"))).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//list city and count of candidates per city
		System.out.println("=======Candidate count per city=======");
		long pune_count = InterviewRepository.getCandidateList().stream().filter(p->(p.getCity().equalsIgnoreCase("pune"))).count();
		long chennai_count = InterviewRepository.getCandidateList().stream().filter(p->(p.getCity().equalsIgnoreCase("Chennai"))).count();
		long banglore_count = InterviewRepository.getCandidateList().stream().filter(p->(p.getCity().equalsIgnoreCase("Banglore"))).count();
		long mumbai_count = InterviewRepository.getCandidateList().stream().filter(p->(p.getCity().equalsIgnoreCase("Mumbai"))).count();
		
		System.out.println("Pune City Candidate count = "+pune_count);
		System.out.println("Chennai City Candidate count = "+chennai_count);
		System.out.println("Banglore City Candidate count = "+banglore_count);
		System.out.println("Mumbai City Candidate count = "+mumbai_count+"\n");
		
		
		

		//list technical expertise and count of candidates
		System.out.println("=======Candidate count by Technical Expertise=======");
		long csharp_count = InterviewRepository.getCandidateList().stream().filter(t->t.getTechnicalExpertise().equalsIgnoreCase("C#")).count();
		long cplus_count = InterviewRepository.getCandidateList().stream().filter(t->t.getTechnicalExpertise().equalsIgnoreCase("C++")).count();
		long java_count = InterviewRepository.getCandidateList().stream().filter(t->t.getTechnicalExpertise().equalsIgnoreCase("Java")).count();
		
		System.out.println("C# Count : "+csharp_count);
		System.out.println("C++ Count : "+cplus_count);
		System.out.println("Java Count : "+java_count+"\n");
		
		//list fresher candidates
		System.out.println("=======Fresher Candidate list=======");
		InterviewRepository.getCandidateList().stream().filter(e->e.getYearsOfExperience()==0 || e.getYearsOfExperience()==1).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		//listing candidates with highest experience
		System.out.println("============Sorted List of Candidates by Experience============");
		List<Candidate> candi_list=InterviewRepository.getCandidateList();
		Collections.sort(candi_list, Comparator.comparing(Candidate::getYearsOfExperience).thenComparingInt(Candidate::getYearsOfExperience).reversed());
		candi_list.stream().forEach(System.out::println);

		//sort the candidates by city name
		printLine();
		System.out.println("========-Sorted List of Candidates by City Name===============");
		
		Collections.sort(InterviewRepository.getCandidateList(),(o1,o2)->(o1.getCity().compareTo(o2.getCity())));
		candi_list.stream().forEach(System.out::println);
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}