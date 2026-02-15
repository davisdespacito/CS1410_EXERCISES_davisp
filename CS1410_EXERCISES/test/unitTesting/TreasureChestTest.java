package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {

	private TreasureChest treasure;
	private TreasureChest emptyChest;
	
	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		emptyChest = new TreasureChest(0);
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
	void toString_PositiveNumberOfCoins_ReturnNumberCoinsInBracket() {
		String expected = "[ 10 coins ]";
		String actual = treasure.toString();
		assertEquals(expected, actual);
		}
	
	@Test
	void toString_NoCoins_ReturnNumberCoinsInBracket() {
		String expected = "[ 0 coins ]";
		String actual = emptyChest.toString();
		assertEquals(expected, actual);
		}

}
