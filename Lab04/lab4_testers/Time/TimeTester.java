public class TimeTester
{
	public static void main(String[] args)
	{
		String error;
		error = testSecondsToMinutes();
		if (error != null) { System.out.println(error); return;}
		error = testSecondsToHours();
		if (error != null) { System.out.println(error); return;}
		error = testSecondsToDays();
		if (error != null) { System.out.println(error); return;}
		error = testSecondsToYears();
		if (error != null) { System.out.println(error); return;}
		error = testMinutesToSeconds();
		if (error != null) { System.out.println(error); return;}
		error = testHoursToSeconds();
		if (error != null) { System.out.println(error); return;}
		error = testDaysToSeconds();
		if (error != null) { System.out.println(error); return;}
		error = testYearsToSeconds();
		if (error != null) { System.out.println(error); return;}
		System.out.println("Time: Correct!");
	}

	public static String testSecondsToMinutes()
	{
		double time;

		time = Time.secondsToMinutes(0);
		if (time != 0.0) return "Time.secondsToMinutes(0)";
		time = Time.secondsToMinutes(60);
		if (time != 1.0) return "Time.secondsToMinutes(60)";
		time = Time.secondsToMinutes(3600);
		if (time != 60.0) return "Time.secondsToMinutes(3600)";
		time = Time.secondsToMinutes(999999);
		if (time != 16666.65) return "Time.secondsToMinutes(999999)";
		return null;
	}

	public static String testSecondsToHours()
	{
		double time;

		time = Time.secondsToHours(0);
		if (time != 0.0) return "Time.secondsToHours(0)";
		time = Time.secondsToHours(60);
		if (time != 0.016666666666666666) return "Time.secondsToHours(60)";
		time = Time.secondsToHours(3600);
		if (time != 1.0) return "Time.secondsToHours(3600)";
		time = Time.secondsToHours(999999);
		if (time != 277.77750000000003) return "Time.gettimeCirlce(999999)";
		return null;
		
	}

	public static String testSecondsToDays()
	{
		double time;

		time = Time.secondsToDays(0);
		if (time != 0) return "Time.secondsToDays(0)";
		time = Time.secondsToDays(60);
		if (time != 6.944444444444445E-4) return "Time.secondsToDays(60)";
		time = Time.secondsToDays(3600);
		if (time != 0.041666666666666664) return "Time.secondsToDays(3600)";
		time = Time.secondsToDays(999999);
		if (time != 11.574062500000002) return "Time.secondsToDays(999999)";
		return null;
	}

	public static String testSecondsToYears()
	{
		double time;

		time = Time.secondsToYears(0);
		if (time != 0.0) return "Time.secondsToYears(0)";
		time = Time.secondsToYears(60);
		if (time != 1.9025875190258753E-6) return "Time.secondsToYears(60)";
		time = Time.secondsToYears(3600);
		if (time != 1.1415525114155251E-4) return "Time.secondsToYears(3600)";
		time = Time.secondsToYears(999999);
		if (time != 0.031709760273972605) return "Time.secondsToYears(999999)";
		return null;
	}

	public static String testMinutesToSeconds()
	{
		double time;

		time = Time.minutesToSeconds(1);
		if (time != 60.0) return "Time.minutesToSeconds(1)";
		time = Time.minutesToSeconds(60);
		if (time != 3600.0) return "Time.minutesToSeconds(60)";
		time = Time.minutesToSeconds(3600);
		if (time != 216000.0) return "Time.minutesToSeconds(3600)";
		time = Time.minutesToSeconds(999999);
		if (time != 5.999994E7) return "Time.gettimeCirlce(999999)";
		return null;
	}

	public static String testHoursToSeconds()
	{
		double time;

		time = Time.hoursToSeconds(1);
		if (time != 3600.0) return "Time.hoursToSeconds(1)";
		time = Time.hoursToSeconds(60);
		if (time != 216000.0) return "Time.hoursToSeconds(60)";
		time = Time.hoursToSeconds(3600);
		if (time != 1.296E7) return "Time.hoursToSeconds(3600)";
		time = Time.hoursToSeconds(999999);
		if (time != 3.5999964E9) return "Time.hoursToSeconds(999999)";
		return null;
	}

	public static String testDaysToSeconds()
	{
		double time;

		time = Time.daysToSeconds(1);
		if (time != 86400.0) return "Time.daysToSeconds(1)";
		time = Time.daysToSeconds(60);
		if (time != 5184000.0) return "Time.daysToSeconds(60)";
		time = Time.daysToSeconds(3600);
		if (time != 3.1104E8) return "Time.daysToSeconds(3600)";
		time = Time.daysToSeconds(999999);
		if (time != 8.63999136E10) return "Time.daysToSeconds(999999)";
		return null;
	}

	public static String testYearsToSeconds()
	{
		double time;

		time = Time.yearsToSeconds(1);
		if (time != 3.1536E7) return "Time.yearsToSeconds(1)";
		time = Time.yearsToSeconds(60);
		if (time != 1.89216E9) return "Time.yearsToSeconds(60)";
		time = Time.yearsToSeconds(3600);
		if (time != 1.135296E11) return "Time.yearsToSeconds(3600)";
		time = Time.yearsToSeconds(999999);
		if (time != 3.1535968464E13) return "Time.yearsToSeconds(999999)";
		return null;
	}




}