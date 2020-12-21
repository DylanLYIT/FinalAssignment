/////////////////////////////////////////////////////
/////////////////////////////////////////////////////
//                                                //
// I've uploaded this to GitHub & also Blackboard //
//                                                //
////////////////////////////////////////////////////
////////////////////////////////////////////////////

// Dylan Robinson
// L00147115

package ie.lyit.testers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ie.lyit.hotel.Room;

class RoomTest {
	private Room rooms;	

	
	@BeforeEach
	void setUp() throws Exception {
		ArrayList<Room> rooms=new ArrayList<Room>();

	}

	@Test
	void testRoomIntIntDoubleInt() {
		for(int i=1;i<=5;i++)
			  rooms.add(new Room(1,0,60.00,i));
		// Check rooms is 1
		assertEquals(1, rooms.getMaxAdults());
		// Check rooms is 0
		assertEquals(0, rooms.getMaxKids());
		// Check room is allocated

		
	}
	
	@Test(expected = IllegalArgument Exception.class)
	public void testRoomIntIntDoubleIntForException() {
		rooms.add(new Room(2,1,60.00, 1));
	}
	
	
	@Test
	public void testToString() {
		assertEquals("Room should have values for adults, kids, price, number and allocated state", rooms.toString());
	}
	
	
	@Test
	public void testsetMaxAdults{
		rooms.setMaxAdults(2);
		assertTrue("MaxAdults should be 2", 2==rooms.getMaxAdults());
	}

	
	@Test
	public void testsetMaxKids{
		rooms.setMaxKids(3);
		assertTrue("MaxKids should be 3", 3==rooms.getMaxKids());
	}
	
	@Test 
	public void testsetPricePerNight {
		rooms.setPricePerNight(60.00);
		assertTrue("PricePerNight should be 60.00", 60.00=rooms.getPricePerNight());
		
	}
	
	@Test 
	public void testsetAllocated{
		rooms.setAllocated(true);
		assertTrue("Allocated is set to true", true=rooms.getAllocated());
	}
	
	
}
