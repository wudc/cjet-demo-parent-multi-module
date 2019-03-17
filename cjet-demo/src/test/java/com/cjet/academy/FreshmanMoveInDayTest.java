package com.cjet.academy;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FreshmanMoveInDayTest {
	FreshmanMoveInDay moveIn = new FreshmanMoveInDay();
	String[] backpack1 = { "Books", "laptop", "Pens" };
	String[] backpack2 = { "Books", "laptop", "Pens", "Pencils" };
	String[] moveInItems = { "Alarm clock", "Bed linens", "Clothes hangers", "Computer", "Laundry basket" };
	
	@Test
	public void testDormroomCheckList() {
		System.out.println("Inside testDormroomCheckList()");
		assertTrue(moveIn.DormroomCheckList(moveInItems));
		
		moveInItems[3] = "Laptop";
		
		assertFalse(moveIn.DormroomCheckList(moveInItems));
	}

	@Test
	public void testCreateBackpack() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(backpack1, moveIn.createBackpack());
	}

	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(backpack2, moveIn.addPencils());
	}
}
