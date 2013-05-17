package com.ivano.bst;

/**
 * Provides method to print BSTs.
 * 
 * @author ivano
 */
public class BSTPrinter {

	/**
	 * Prints values of a BinarySearchTree in order.
	 * 
	 * @param root
	 */
	public void print(BST root) {

		printNode(root);
	}

	private void printNode(BST node) {

		if (node.getLeftChild() != null) {
			printNode(node.getLeftChild());
		}

		System.out.print(node.getValue());

		if (node.getRightChild() != null) {
			printNode(node.getRightChild());
		}
	}
}
