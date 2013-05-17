package com.ivano.bst;

/**
 * Interface representing a BinarySearchTree
 * 
 * @author ivano
 * 
 */
public interface BST {

	/**
	 * @return value of the node
	 */
	public int getValue();

	/**
	 * @return left child of the node or <code>null</code>
	 */
	public BST getLeftChild();

	/**
	 * @return right child of the node or <code>null</code>
	 */
	public BST getRightChild();
}
