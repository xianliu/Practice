package com.liuxian.pattern.composite;

public class NullIterator {
	
	public Object next() {
		return null;
	}
	
	public boolean hasNext() {
		return false;
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
