package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {

	private TreasureChest treasure;
	
	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
	}

	@Test
	void testTreasureChest() {
		fail("Not yet implemented");
	}

	@Test
	void testAddGold() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveGold() {
		fail("Not yet implemented");
	}

	@Test
	void testValueInDollars() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		String expected = "[ 10 coins ]";
		String actual = treasure.toString();
		assertEquals(expected, actual);
		}

}
