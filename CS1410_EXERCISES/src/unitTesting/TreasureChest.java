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

	/**
	 * Number of gold coins.
	 */
	private int gold;
	
	/**
	 * Amount of gold per coin measured in ounces.
	 */
	private static final BigDecimal GOLD_PER_COIN = new BigDecimal(0.9675); 

	/**
	 * Price of an ounce of gold.
	 */
	private static BigDecimal goldPrice;

	/**
	 * Initializes a newly created TreasureChest with the specified number 
	 * of gold coins.
	 * 
	 * @param gold
	 * @throws IllegalArgumentException if <code>goldCoins</code> is negative.
	 */
	public TreasureChest(int goldCoins) {
		if(goldCoins < 0) {
			
			throw new IllegalArgumentException("The number of gold coins in the treasure"
					+ " chest can't be negative.");
			
		}
		
		this.gold = goldCoins;

	}

	/**
	 * 
	 * @return the amount of gold in this treasure chest.
	 */
	public int getGold() {

		return gold;

	}

	/**
	 * Adds the specified number of coins to this treasure chest.
	 * <p>
	 * @param numberOfCoins
	 * @throws IllegalArgumentException if the <code>numberOfCoins</code> is negative.
	 */
	public void addGold(int numberOfCoins) {

		if (numberOfCoins < 0) {
			
			throw new IllegalArgumentException("Cannot add negative coins to the"
					+ " treasure chest.");
		}
		
		gold += numberOfCoins;
		
	}

	/**
	 * Removes the specified number of coins from this treasure chest.
	 * <p>			
	 * @param numberOfCoins
	 * @return the number of gold coins left in the treasure chest
	 * @throws IllegalArgumentException if the <code> numberOfCoins</code> is negative 
	 * or if the <code>numberOfCoins</code> exceeds the number of gold coins in this 
	 * treasure chest.
	 */
	public int removeGold(int numberOfCoins) {

		if (numberOfCoins > this.gold || numberOfCoins < 0)
			throw new IllegalArgumentException("Removing negative coins is not allowed, neither"
					+ " is removing more than are in the chest.");
		
		this.gold -= numberOfCoins;
		return this.gold;

	}
	
	
	/**
	 * 
	 * @return the goldPrice
	 */
	public static BigDecimal getGoldPrice() {

		return goldPrice;

	}

	/**
	 * Updates the price of gold with the <code>goldPrice</code> provided.
	 * <p>
	 * @param goldPrice the gold price to set
	 * @throws IllegalArgumentException if the <code>goldPrice</code> is negative.
	 */
	public static void setGoldPrice(BigDecimal goldPrice) {
		
		if (goldPrice.compareTo(BigDecimal.ZERO) < 0)
			throw new IllegalArgumentException("Gold price cannot be negative.");
		
		TreasureChest.goldPrice = goldPrice;
		
	}
	
	/**
	 * Calculates the dollar value of all the gold coins in the treasure chest.
	 * <p>
	 * @return gold valueInDollars
	 */
	public BigDecimal valueInDollars() {

		return new BigDecimal(gold).multiply(GOLD_PER_COIN).multiply(goldPrice);

	}

	@Override
	public String toString() {

		return "[ " + gold + " coins ]";

	}

}
