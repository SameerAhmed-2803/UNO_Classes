public class CookingTester
{
	public static void main(String[] args)
	{
		String error;
		error = testTeaspoonToTablespoon();
		if (error != null) { System.out.println(error); return;}
		error = testtablespoonsToTeaspoons();
		if (error != null) { System.out.println(error); return;}
		error = testtablespoonsToCups();
		if (error != null) { System.out.println(error); return;}
		error = testcupsToTablespoons();
		if (error != null) { System.out.println(error); return;}
		error = testouncesToCups();
		if (error != null) { System.out.println(error); return;}
		error = testcupsToOunces();
		if (error != null) { System.out.println(error); return;}
		error = testpintsToCups();
		if (error != null) { System.out.println(error); return;}
		error = testcupsToPints();
		if (error != null) { System.out.println(error); return;}
		System.out.println("Cooking: Correct!");
	}

	public static String testTeaspoonToTablespoon()
	{
		double portion;

		portion = Cooking.teaspoonsToTablespoons(0);
		if (portion != 0.0) return "Cooking.teaspoonToTablespoon(0)";
		portion = Cooking.teaspoonsToTablespoons(60);
		if (portion != 20.0) return "Cooking.teaspoonToTablespoon(60)";
		portion = Cooking.teaspoonsToTablespoons(3600);
		if (portion != 1200.0) return "Cooking.teaspoonToTablespoon(3600)";
		portion = Cooking.teaspoonsToTablespoons(999999);
		if (portion != 333333.0) return "Cooking.teaspoonToTablespoon(999999)";
		return null;
	}

	public static String testtablespoonsToTeaspoons()
	{
		double portion;

		portion = Cooking.tablespoonsToTeaspoons(0);
		if (portion != 0.0) return "Cooking.tablespoonsToTeaspoons(0)";
		portion = Cooking.tablespoonsToTeaspoons(60);
		if (portion != 180.0) return "Cooking.tablespoonsToTeaspoons(60)";
		portion = Cooking.tablespoonsToTeaspoons(3600);
		if (portion != 10800.0) return "Cooking.tablespoonsToTeaspoons(3600)";
		portion = Cooking.tablespoonsToTeaspoons(999999);
		if (portion != 2999997.0) return "Cooking.getportionCirlce(999999)";
		return null;
		
	}

	public static String testtablespoonsToCups()
	{
		double portion;

		portion = Cooking.tablespoonsToCups(0);
		if (portion != 0) return "Cooking.tablespoonsToCups(0)";
		portion = Cooking.tablespoonsToCups(60);
		if (portion != 3.75) return "Cooking.tablespoonsToCups(60)";
		portion = Cooking.tablespoonsToCups(3600);
		if (portion != 225.0) return "Cooking.tablespoonsToCups(3600)";
		portion = Cooking.tablespoonsToCups(999999);
		if (portion != 62499.9375) return "Cooking.tablespoonsToCups(999999)";
		return null;
	}

	public static String testcupsToTablespoons()
	{
		double portion;

		portion = Cooking.cupsToTablespoons(0);
		if (portion != 0.0) return "Cooking.cupsToTablespoons(0)";
		portion = Cooking.cupsToTablespoons(60);
		if (portion != 960.0) return "Cooking.cupsToTablespoons(60)";
		portion = Cooking.cupsToTablespoons(3600);
		if (portion != 57600.0) return "Cooking.cupsToTablespoons(3600)";
		portion = Cooking.cupsToTablespoons(999999);
		if (portion != 15999984.0) return "Cooking.cupsToTablespoons(999999)";
		return null;
	}

	public static String testouncesToCups()
	{
		double portion;

		portion = Cooking.ouncesToCups(1);
		if (portion != 0.125) return "Cooking.ouncesToCups(1)";
		portion = Cooking.ouncesToCups(60);
		if (portion != 7.5) return "Cooking.ouncesToCups(60)";
		portion = Cooking.ouncesToCups(3600);
		if (portion != 450.0) return "Cooking.ouncesToCups(3600)";
		portion = Cooking.ouncesToCups(999999);
		if (portion != 124999.875) return "Cooking.getportionCirlce(999999)";
		return null;
	}

	public static String testcupsToOunces()
	{
		double portion;

		portion = Cooking.cupsToOunces(1);
		if (portion != 8.0) return "Cooking.cupsToOunces(1)";
		portion = Cooking.cupsToOunces(60);
		if (portion != 480.0) return "Cooking.cupsToOunces(60)";
		portion = Cooking.cupsToOunces(3600);
		if (portion != 28800.0) return "Cooking.cupsToOunces(3600)";
		portion = Cooking.cupsToOunces(999999);
		if (portion != 7999992.0) return "Cooking.cupsToOunces(999999)";
		return null;
	}

	public static String testpintsToCups()
	{
		double portion;

		portion = Cooking.pintsToCups(1);
		if (portion != 2.0) return "Cooking.pintsToCups(1)";
		portion = Cooking.pintsToCups(60);
		if (portion != 120.0) return "Cooking.pintsToCups(60)";
		portion = Cooking.pintsToCups(3600);
		if (portion != 7200.0) return "Cooking.pintsToCups(3600)";
		portion = Cooking.pintsToCups(999999);
		if (portion != 1999998.0) return "Cooking.pintsToCups(999999)";
		return null;
	}

	public static String testcupsToPints()
	{
		double portion;

		portion = Cooking.cupsToPints(1);
		if (portion != 0.5) return "Cooking.cupsToPints(1)";
		portion = Cooking.cupsToPints(60);
		if (portion != 30.0) return "Cooking.cupsToPints(60)";
		portion = Cooking.cupsToPints(3600);
		if (portion != 1800.0) return "Cooking.cupsToPints(3600)";
		portion = Cooking.cupsToPints(999999);
		if (portion != 499999.5) return "Cooking.cupsToPints(999999)";
		return null;
	}




}
