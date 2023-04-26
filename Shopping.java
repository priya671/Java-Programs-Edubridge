package com.edu;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}	
	
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
}

class ShoppingWebsite{
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException{
		if(i.isInStock==false) {
			throw new ItemOutOfStockException("item is out of stock");
		}
		else if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		else {
			return "Order Successful";
		}
		
		/*
		 * try { if(i.isInStock=false) { throw new
		 * ItemOutOfStockException("item is out of stock"); }
		 * }catch(ItemOutOfStockException e) { e.printStackTrace(); }
		 * 
		 * try { if(i.price>c.walletBalance) { throw new
		 * InsufficientBalanceException("customer wallet balance is not sufficient"); }
		 * else { return "Order Successful"; } }catch(InsufficientBalanceException e) {
		 * e.printStackTrace(); }
		 */
		
		
	}
}

class ItemOutOfStockException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemOutOfStockException(String message){
		super(message);
	}
}

class InsufficientBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class Shopping {

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		Customer cusDet = new Customer(927329,"Steve",5000.0,"USA");
		Item itemDet = new Item(27392,"T-shirt","US polo",800,true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDet);
		System.out.println(out);
	}

}
