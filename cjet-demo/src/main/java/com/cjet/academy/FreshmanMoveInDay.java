package com.cjet.academy;

import java.util.Arrays;

public class FreshmanMoveInDay {
	String[] roomItems = {"Alarm clock", "Bed linens", "Clothes hangers", "Computer", "Laundry basket" };
	
	public boolean DormroomCheckList(String[] items) {
		if ( Arrays.equals(roomItems, items)) {
			System.out.println("Dorm room move in checklist completed.");
			return true;
		}
		else {
			System.out.println("Dorm room move in checklist incompleted.");
			return false;
		}
	}
	
	public String[] createBackpack() {
		String[] bag = { "Books", "laptop", "Pens" };
		System.out.println("My school bag contains: " + Arrays.toString(bag));
		return bag;
	}

	public String[] addPencils() {
		String[] bag = { "Books", "laptop", "Pens", "Pencils" };
		System.out.println("Now my backpack contains: " + Arrays.toString(bag));
		return bag;
	}
}
