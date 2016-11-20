package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getTheOwner()
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getPrice()
	 */
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#isAvailable()
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#playAction()
	 */
	public abstract boolean playAction(String msg);

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setAvailable(boolean)
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setTheOwner(edu.ncsu.monopoly.Player)
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#toString()
	 */
    public String toString() {
        return name;
    }
}
