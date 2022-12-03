package kr.ac.sejong.kmooc.data_engineering.linkedlist.impl;

public class MyNode<E> {
	private E item;
	private MyNode<E> prev;
	private MyNode<E> next;

	/**
	 * MyLinkedList용 새로운 MyNode 생성
	 * 
	 * @param item 아이템
	 * @param prev 이전 노드
	 * @param next 다음 노드
	 *  
	 */
	
	public MyNode(E item, MyNode<E> prev, MyNode<E> next) {
		this.item = item;
		this.prev = prev;
		this.next = next;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public MyNode<E> getPrev() {
		return prev;
	}

	public void setPrev(MyNode<E> prev) {
		this.prev = prev;
	}

	public MyNode<E> getNext() {
		return next;
	}

	public void setNext(MyNode<E> next) {
		this.next = next;
	}

}
