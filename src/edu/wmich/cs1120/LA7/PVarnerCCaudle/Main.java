package edu.wmich.cs1120.LA7.PVarnerCCaudle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	/**
	 * Handles the flow of the program and uses the .txt files as parameters for the
	 * called objects.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		PriorityQueue<Request> requestQueue = new PriorityQueue<Request>();
		LinkedList<Course> courses = new LinkedList<Course>();
		BufferedReader fileIn = new BufferedReader(new FileReader("course.txt"));
		BufferedReader fileIn1 = new BufferedReader(new FileReader("request.txt"));
		IController control = new Controller(requestQueue, courses, fileIn, fileIn1);
		control.readCourseFile();
		control.readRequestFile();
		control.processRequests();
		control.printClassList();
	}

}
