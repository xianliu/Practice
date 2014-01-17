package com.liuxian.pattern.composite;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = 
				new Menu("PANCAKE HOUSE MENU", "Breakfast");
		
		MenuComponent dinerMenu = 
				new Menu("Diner MENU", "Lunch");
		
		MenuComponent dessertMenu = 
				new Menu("Dessert Menu", "Dessert of Menu");
		
		MenuComponent allMenus = 
				new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("egg", "the tea egg", false, 1.00));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("pie", "the fresh pie", false, 3.50));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
	}
}
