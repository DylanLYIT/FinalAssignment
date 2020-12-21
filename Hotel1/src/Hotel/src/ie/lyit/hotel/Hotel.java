package ie.lyit.hotel;

import java.util.ArrayList;

// Dylan Robinson
// L00147115

public class Hotel {
	private Room rooms;
	private Booking bookings;
	private int number;
	private boolean allocated;
	private int maxKids;
	private int pricePerNight;
	private int maxAdults;
	private int noAdults;
	private int noKids;
	
	// Default Constructor
	// Called when object is created like
	// Hotel h1 = new Hotel();
	public Hotel() {
		ArrayList<Room> rooms=new ArrayList<Room>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
	}
	
	// Overloaded Initialization Constructor
	// Called when object is created like
	// Room rooms = Room(0, 0, 0, 0);
	// Booking bookings = Booking(null, 0 , 0 , 0, null, rooms);
	
	public Hotel (Room rooms, Booking bookings) {
	
	this.rooms = rooms;
	this.bookings = bookings;
	}
	
	public String toString() {
		return "ROOM " + number + " [" + maxAdults + " adult(s),"+ maxKids + " kid(s) @ €" + pricePerNight + " p/n," + (allocated ? "allocated" : "NOT allocated") + "]";
 
	}
	
	public void populateRooms() {
		ArrayList<Room> rooms=new ArrayList<Room>();
		
		// Creating 10 double rooms
		// 2 adults, 0 kids
		// cost 85.00 per night
		// numbered 1 to 10
		for(int i=1;i<=10;i++)
			  rooms.add(new Room(2,0,85.00,i));
		
		// Creating 8 family rooms
		// 2 adults, 2 kids
		// cost 120.00 per night
		// numbered 11 to 18
		for(int i=11;1<18;i++)
			  rooms.add(new Room(2,2,120.00,i));
		
		
		
	}
	
	
	public Room findAvailableRoom() {
		ArrayList<Room> rooms=new ArrayList<Room>();

		
		// Loop around every room in array list
		for(Room room:rooms)
		{
			if(maxAdults >= noAdults && maxKids >= noKids && allocated == false )
			{
				allocated = true;
				return room;
			}
		}
		
		
		
		return null;
	}
	

	public Booking addBooking() {
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		int numberNights = 0;
			Date checkInDate = null;
			Guest guestDetails = null;
	    
	    Booking bookingA=new Booking(checkInDate,numberNights,noAdults,noKids,guestDetails,new Room(1,0,60.00,0));


		return null;
	}
	
}
