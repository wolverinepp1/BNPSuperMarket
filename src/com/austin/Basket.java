package com.austin;

public class Basket
{
	private int appleAmount;

	private int orangeAmount;

	private int waterMelonAmount;

	private SpecialOffer so;

	public int getAppleAmount()
	{
		return appleAmount + so.appleAddedAmount();
	}

	public int getOrangeAmount()
	{
		return orangeAmount;
	}

	public int getWaterMelonAmount()
	{
		return waterMelonAmount;
	}

	public Basket(int appleAmount, int orangeAmount, int waterMelonAmount)
	{
		this.appleAmount = appleAmount;
		this.orangeAmount = orangeAmount;
		this.waterMelonAmount = waterMelonAmount;
		so = new SpecialOffer(appleAmount, waterMelonAmount);
	}

	public double sumPrice()
	{
		double finalPrice = doubleOperation.subDouble(
				doubleOperation.addDouble(
				doubleOperation.addDouble(appleAmount * PriceTable.APPLE_PRICE, orangeAmount * PriceTable.ORANGE_PRICE), waterMelonAmount * PriceTable.WATERMELON_PRICE),
				so.waterMelonDiscount());
		return finalPrice;
	}

}
