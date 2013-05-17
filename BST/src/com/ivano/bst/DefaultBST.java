package com.ivano.bst;

/**
 * Simple implementation for {@link BST}
 * 
 * @author ivano
 */
public class DefaultBST implements BST {

	private final int value;
	private DefaultBST leftChild;
	private DefaultBST rightChild;

	public DefaultBST(int value) {
		this.value = value;
	}

	public void put(int childValue) {

		if (childValue < this.value) {
			if (leftChild == null) {
				leftChild = new DefaultBST(childValue);
			} else {
				leftChild.put(childValue);
			}
		} else {
			if (rightChild == null) {
				rightChild = new DefaultBST(childValue);
			} else {
				rightChild.put(childValue);
			}
		}
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public BST getLeftChild() {
		return leftChild;
	}

	@Override
	public BST getRightChild() {
		return rightChild;
	}

}
