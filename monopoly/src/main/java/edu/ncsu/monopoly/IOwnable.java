package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	boolean isAvailable();

	void playAction();

	void setAvailable(boolean available);

	void setName(String name);

	void setTheOwner(Player owner);

	String toString();

}