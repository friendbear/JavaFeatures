package com.jff.java9.processApi;

import java.util.Optional;

public class ProcessApiDemo {

	public static void main(String[] args) {

		int pid = 29156;// from Task manager get actual value
		int pid2 = 99156;// dummy value

		Optional<ProcessHandle> processHandle1 = ProcessHandle.of(pid);
		Optional<ProcessHandle> processHandle2 = ProcessHandle.of(pid2);
		System.out.println(processHandle1.isPresent());
		System.out.println(processHandle2.isPresent());

		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println(processHandle.info());
		// o/p

		// cmd: C:\Program Files\Java\jdk-11.0.1\bin\javaw.exe, startTime:
		// Optional[2019-01-04T11:10:21.743Z], totalTime: Optional[PT0.1875S]]

	}
}
