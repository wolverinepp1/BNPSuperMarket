package com.austin;

public class SpecialOffer
{
	private int appleAmount;

	private int watermelonAmount;

	public SpecialOffer(int appleAmount, int watermelonAmount)
	{
		this.appleAmount = appleAmount;
		this.watermelonAmount = watermelonAmount;
	}

	public int appleAddedAmount()
	{
		int apaa = appleAmount;
		System.out.println("Offered apple(s): " + apaa);
		return apaa;
	}

	/*3 watermelons have 1 watermelons discount*/
	public double waterMelonDiscount()
	{
		double wmds;
		if (watermelonAmount < 3)
		{
			wmds = 0;
		}else {
			wmds = (watermelonAmount / 3) * PriceTable.WATERMELON_PRICE;
		}
		System.out.println("\nWatermelon Discount: " + wmds + "£");
		return wmds;
	}

}
