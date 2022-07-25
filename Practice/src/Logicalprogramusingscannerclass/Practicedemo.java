package Logicalprogramusingscannerclass;

import java.util.Scanner;

public class Practicedemo {
	//Remove Junk
	public static void main(String[] args) {
		String s= "I love Automation123456!@#$%";
		s=s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(s);
		}
	
	
}