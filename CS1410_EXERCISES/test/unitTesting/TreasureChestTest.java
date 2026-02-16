package unitTesting;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {

	private TreasureChest treasure;
	private TreasureChest emptyChest;
	private final BigDecimal DELTA = new BigDecimal(0.000001);

	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		emptyChest = new TreasureChest(0);
		TreasureChest.setGoldPrice(new BigDecimal(1426.90));
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
	void addGold_AddingPositiveNumberOfCoins_IncreaseNumberOfCoinsInTreasureChest() {
		
		treasure.addGold(5);
		int expected = 15;
		int actual =treasure.getGold();
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void addGold_AddingZeroCoins_LeavesNumberOfCoinsInTreasureChestUnchanged() {
		
		treasure.addGold(0);
		int expected = 10;
		int actual = treasure.getGold();
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void addGold_AddingNegativeCoins_ThrowsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {treasure.addGold(-1);});
		
	}

	@Test
	void removeGold_RemovingSomeOfTheAvailableCoins_ReducesNumberOfCoinsInTreasureChest() {

		treasure.removeGold(2);
		assertEquals(8, treasure.getGold());
		
	}

	@Test
	void remvoeGold_RemovingAllAvailableCoins_EmpiesTreasureChest() {
		
		treasure.removeGold(10);
		assertEquals(0, treasure.getGold());
		
	}
	
	@Test
	void removeGold_RemovingZeroCoins_LeavesNumberOfCoinsInTreasureChestUnchanged() {
		
		treasure.removeGold(0);
		assertEquals(10, treasure.getGold());
		
	}
	
	@Test
	void removeGold_RemovingMoreCoinsThanAvailable_ThrowsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {treasure.removeGold(11);});
		
	}
	
	@Test
	void removeGold_RemovingNegativeNumberOfCoins_ThrowsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {treasure.removeGold(-1);});
		
	}
	
	@Test
	void removeGold_RemovingSomeOfTheAvailableCoins_ReturnsReducedNumberOfCoinsInTreasureChest() {
		
		assertEquals(8, treasure.removeGold(2));
		
	}
	
	@Test
	void removeGold_RemovingAllOfTheAvailableCoins_Returns0() {
		
		assertEquals(0, treasure.removeGold(10));
		
	}
	
	@Test
	void removeGold_RemovingZeroCoins_ReturnsUnchangedNumberOfCoinsInTreasureChest() {
		
		assertEquals(10, treasure.removeGold(0));
		
	}

	
	@Test
	void valueInDollars_FilledTreasureChest_ReturnsTotalAmountOfGoldMultipliedWithPrice() {
		
		BigDecimal difference = (new BigDecimal(13805.2575).subtract(treasure.valueInDollars()).abs());
		assertTrue(!(difference.compareTo(DELTA) > 1));
		
	}
	
	@Test
	void ValueIntoDollars_EmptyTreasureChest_Returns0() {
		
		BigDecimal difference = (BigDecimal.ZERO.subtract(emptyChest.valueInDollars()).abs());
		assertTrue(!(difference.compareTo(DELTA) > 1));
		
	}
	
	@Test
	void setGoldPrice_SettingPositiveValue_UpdatesGoldPrice() {
		
		TreasureChest.setGoldPrice(new BigDecimal(1376.57));
		assertEquals(new BigDecimal(1376.57), TreasureChest.getGoldPrice());
		
		
	}
	
	@Test
	void setGoldPrice_Setting0_UpdatesGoldPrice() {
		
		TreasureChest.setGoldPrice(BigDecimal.ZERO);
		assertEquals(BigDecimal.ZERO, TreasureChest.getGoldPrice());
		
		
	}
	
	@Test
	void setGoldPrice_SettingNegativeValue_ThrowsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> 
			{TreasureChest.setGoldPrice(new BigDecimal(-0.001));});
		
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
