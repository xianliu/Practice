package com.liuxian.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent meunComponent) {
		menuComponents.remove(meunComponent);
	}
	
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.println(getName() + "\n");
		System.out.println(getDescription() + "\n");
		System.out.println("======================");
		
		Iterator iterator = menuComponents.iterator();
		
		while(iterator.hasNext()) {
			MenuComponent meunComponent = (MenuComponent) iterator.next();
			meunComponent.print();
		}
	}
	
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	
}
