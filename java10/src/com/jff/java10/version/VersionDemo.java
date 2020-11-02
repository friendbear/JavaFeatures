package com.jff.java10.version;

public class VersionDemo {
	public static void main(String[] args) {
		Runtime.Version version = Runtime.version();

		System.out.println("Feature: " + version.feature());
		System.out.println("Feature-Major: " + version.major());
		System.out.println("Interim: " + version.interim());
		System.out.println("Update: " + version.update());
		System.out.println("Patch: " + version.patch());
	}

}