package com.jff.java9.tryenhancement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceEnhancementDemo {

	public static void main(String[] args) throws FileNotFoundException {
		beforeJava9();
		fromJava9();

	}

	private static void beforeJava9() {

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\trywithres.txt"))
				) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void fromJava9() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\trywithres.txt"));

		try (br) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
