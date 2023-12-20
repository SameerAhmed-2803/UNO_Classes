public class TemperatureTester
{
	public static void main(String[] args)
	{
		String error;
		error = testCelsiusToFahrenheit();
		if (error != null) { System.out.println(error); return;}
		error = testCelsiusToKelvin();
		if (error != null) { System.out.println(error); return;}
		error = testFahrenheitToCelsius();
		if (error != null) { System.out.println(error); return;}
		error = testFahrenheitToKelvin();
		if (error != null) { System.out.println(error); return;}
		error = testKelvinToFahrenheit();
		if (error != null) { System.out.println(error); return;}
		error = testKelvinToCelsius();
		if (error != null) { System.out.println(error); return;}
		System.out.println("Temperature: Correct!");
	}

	public static String testCelsiusToFahrenheit()
	{
		double degrees;

		degrees = Temperature.celsiusToFahrenheit(0);
		if (degrees != 32.0) return "Temperature.celsiusToFahrenheit(0)";
		degrees = Temperature.celsiusToFahrenheit(100);
		if (degrees != 212.00) return "Temperature.celsiusToFahrenheit(100)";
		degrees = Temperature.celsiusToFahrenheit(9999999);
		if (degrees != 1.80000302E7) return "Temperature.celsiusToFahrenheit(9999999)";
		degrees = Temperature.celsiusToFahrenheit(-100);
		if (degrees != -148.0) return "Temperature.celsiusToFahrenheit(-100)";
		return null;
	}

	public static String testCelsiusToKelvin()
	{
		double degrees;

		degrees = Temperature.celsiusToKelvin(0);
		if (degrees != 273.15) return "Temperature.celsiusToKelvin(0)";
		degrees = Temperature.celsiusToKelvin(100);
		if (degrees != 373.15) return "Temperature.celsiusToKelvin(100)";
		degrees = Temperature.celsiusToKelvin(9999999);
		if (degrees != 1.000027215E7) return "Temperature.celsiusToKelvin(9999999)";
		degrees = Temperature.celsiusToKelvin(-100);
		if (degrees != 173.14999999999998) return "Temperature.getdegreesCirlce(-100)";
		return null;
		
	}

	public static String testFahrenheitToCelsius()
	{
		double degrees;

		degrees = Temperature.fahrenheitToCelsius(0);
		if (degrees != -17.77777777777778) return "Temperature.fahrenheitToCelsius(0)";
		degrees = Temperature.fahrenheitToCelsius(100);
		if (degrees != 37.77777777777778) return "Temperature.fahrenheitToCelsius(100)";
		degrees = Temperature.fahrenheitToCelsius(9999999);
		if (degrees != 5555537.222222222) return "Temperature.fahrenheitToCelsius(9999999)";
		//degrees = Temperature.fahrenheitToCelsius(-100);
		//if (degrees != -73.33333333333333) return "Temperature.fahrenheitToCelsius(-100)";
		return null;
	}

	public static String testFahrenheitToKelvin()
	{
		double degrees;

		//degrees = Temperature.fahrenheitToKelvin(0);
		//if (degrees != 255.3722222222222) return "Temperature.fahrenheitToKelvin(0)";
		degrees = Temperature.fahrenheitToKelvin(100);
		if (degrees != 310.9277777777778) return "Temperature.fahrenheitToKelvin(100)";
		degrees = Temperature.fahrenheitToKelvin(9999999);
		if (degrees != 5555810.372222222) return "Temperature.fahrenheitToKelvin(9999999)";
		degrees = Temperature.fahrenheitToKelvin(-100);
		if (degrees != 199.8166666666667) return "Temperature.fahrenheitToKelvin(-100)";
		return null;
	}

	public static String testKelvinToFahrenheit()
	{
		double degrees;

		degrees = Temperature.kelvinToFahrenheit(0);
		if (degrees != -459.67) return "Temperature.kelvinToFahrenheit(0)";
		degrees = Temperature.kelvinToFahrenheit(100);
		if (degrees != -279.67) return "Temperature.kelvinToFahrenheit(100)";
		degrees = Temperature.kelvinToFahrenheit(9999999);
		if (degrees != 1.7999538529999997E7) return "Temperature.kelvinToFahrenheit(9999999)";
		degrees = Temperature.kelvinToFahrenheit(-100);
		if (degrees != -639.6700000000001) return "Temperature.getdegreesCirlce(-100)";
		return null;
	}

	public static String testKelvinToCelsius()
	{
		double degrees;

		degrees = Temperature.kelvinToCelsius(0);
		if (degrees != -273.15) return "Temperature.kelvinToCelsius(0)";
		degrees = Temperature.kelvinToCelsius(100);
		if (degrees != -173.14999999999998) return "Temperature.kelvinToCelsius(100)";
		degrees = Temperature.kelvinToCelsius(9999999);
		if (degrees != 9999725.85) return "Temperature.kelvinToCelsius(9999999)";
		degrees = Temperature.kelvinToCelsius(-100);
		if (degrees != -373.15) return "Temperature.kelvinToCelsius(-100)";
		return null;
	}




}
