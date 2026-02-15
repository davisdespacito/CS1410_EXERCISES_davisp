package unitTesting;

import static org.junit.Assert.assertThrows;
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
	void treasureChest_PositiveNumberOfCoins_AllCoinsStoredInTreasureChest() {
		TreasureChest treasure7 = new TreasureChest(7);
		int expected = 7;
		int actual = treasure7.getGold();
		assertEquals(expected, actual);
	}
	
	@Test
	void treasureChest_ZeroCoins_NoCoinsStoredInTreasureChest() {
		TreasureChest treasure0 = new TreasureChest(0);
		int expected = 0;
		int actual = treasure0.getGold();
		assertEquals(expected, actual);
	}

	@Test
	void treasureChest_NegativeNumberOfCoins_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {new TreasureChest(-2);});
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
	void restSetGoldPrice() {
		
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
