package com.jff.java7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadingDemo {
	public static void main(String[] args) {
		beforeJava7();
		fromJava7();
	}

	private static void beforeJava7() {
		System.out.println("Start beforeJava7###########");
		FileInputStream fis = null;
		String fileName = "D:/jfftest/test.txt";
		try {
			File file = new File(fileName);
			fis = new FileInputStream(file);
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void fromJava7() {
		System.out.println("Start fromJava7:#########");
		String contents;
		String fileName = "D:/jfftest/test.txt";
		try {
			Path path = Paths.get(fileName);
			contents = new String(Files.readAllBytes(path));
			System.out.println(contents);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}