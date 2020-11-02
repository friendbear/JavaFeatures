package com.jff.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingDemo {
	static String contents = "Java New Features\r\n" + "Introduced in\r\n"
			+ "Java 7, Java 8, Java 9, Java 10 and Java 11\r\n" + "By S.M.Shah";
	static String fileName = "D:/jfftest/testwriteaaa.txt";

	public static void main(String[] args) {
		//beforeJava7();
		fromJava7();
	}

	private static void beforeJava7() {
		System.out.println("Start beforeJava7:");
		FileOutputStream fos = null;
		try {
			File file = new File(fileName);
			fos = new FileOutputStream(file);
			fos.write(contents.getBytes());
			System.out.println("Done");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void fromJava7() {
		System.out.println("Start fromJava7:");
		try {
			Path path = Paths.get(fileName);
			Files.write(path, contents.getBytes());
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}