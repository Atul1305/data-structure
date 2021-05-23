package com.quest.ds.stack;

import com.quest.ds.stack.exception.StackUnderflowException;

public class Stack<T> {

	private static int MAX_SIZE = 40;
	private Element<T> top;
	private int size = 0;
	
	
	public synchronized void push(T data) {
		if(size == MAX_SIZE) {
			throw new StackOverflowError();
		}else {
			Element<T> element = new Element<T>(data, top);
			top = element;
			size++;
		}
	}
	
	public synchronized T pop() throws StackUnderflowException {
		if(size <= 0) {
			throw new StackUnderflowException();
		}else {
			T data = top.getData();
			top = top.getNext();
			size--;
			return data;
		}
	}
	
	public T peek() throws StackUnderflowException {
		if(size <= 0) {
			throw new StackUnderflowException();
		}else {
			return top.getData();
		}
	}
}
