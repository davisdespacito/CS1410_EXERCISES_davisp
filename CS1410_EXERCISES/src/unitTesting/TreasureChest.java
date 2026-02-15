package unitTesting;

import java.math.BigDecimal;

/**
 * Treasure Chest that is defined by the amount of gold coins that are in it. In
 * this class we assume that each coin is a twenty-dollar Liberty Gold Coin.
 * This assumption combined with the knowledge of the gold price and the amount
 * of gold in each coin allows us to calculate the dollar value of the treasure
 * chest.
 * 
 * @author davisp
 */
public class TreasureChest {

	private int gold;
	// TODO private static final BigDecimal GOLD_PER_COIN = ; must be initialized

	/**
	 * Amount of gold per coin measured in ounces
	 */
	private static BigDecimal goldPrice;

	/**
	 * 
	 * @param gold
	 */
	public TreasureChest(int goldCoins) {

		this.gold = goldCoins;

	}

	/**
	 * 
	 * @return the gold
	 */
	public int getGold() {

		return gold;

	}

	/**
	 * 
	 * @param numberOfCoins
	 */
	public void addGold(int numberOfCoins) {

	}

	/**
	 * 
	 * @param numberOfCoins
	 * @return
	 */
	public int removeGold(int numberOfCoins) {

		return 0; // TODO

	}

	/**
	 * 
	 * @return the goldPrice
	 */
	public static BigDecimal getGoldPrice() {

		return goldPrice;

	}

	/**
	 * 
	 * @return gold valueInDollars
	 */
	public BigDecimal valueInDollars() {

		return null; // TODO

	}

	@Override
	public String toString() {

		return null; // TODO

	}

}
