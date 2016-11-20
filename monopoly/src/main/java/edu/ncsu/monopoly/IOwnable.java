package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	boolean isAvailable();

	boolean playAction(String msg);

	void setAvailable(boolean available);

	void setName(String name);

	void setTheOwner(Player owner);

	String toString();

}