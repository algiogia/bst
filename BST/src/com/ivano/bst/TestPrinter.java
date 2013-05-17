package com.ivano.bst;

/**
 * Simple test for BSTPrinter
 * 
 * @author ivano
 * 
 */
public class TestPrinter {

	public static void main(String[] args) {

		BSTPrinter printer = new BSTPrinter();

		DefaultBST bst1 = new DefaultBST(5);
		bst1.put(4);
		bst1.put(9);
		bst1.put(3);
		bst1.put(1);
		bst1.put(6);
		bst1.put(7);
		bst1.put(2);
		bst1.put(8);

		System.out.println("Printing BST 1: ");
		printer.print(bst1);

		DefaultBST bst2 = new DefaultBST(3);
		bst2.put(5);
		bst2.put(1);
		bst2.put(8);
		bst2.put(2);
		bst2.put(6);
		bst2.put(7);
		bst2.put(4);
		bst2.put(9);

		System.out.println("\n\nPrinting BST 2: ");
		printer.print(bst2);
	}
}
