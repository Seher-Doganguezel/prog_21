package augabe2;

	public class MyInteger 
	{
	private static boolean charIsDigit(char c)
	{
		return (c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' ||
				c=='6' || c=='7' || c=='8' || c=='9');
		return (c >= '0' && c <= '9');
	}


		int exponent = 1;
		int zahl = 0;
		
		//s.length()-1 ist der letzte Character im String, fangen wir vom hinten an, also von Einer (miavor)
		//s.length()-1 -> von Einer
		for(int i = s.length()-1; i>=0; i--)
		{
			zahl = zahl + charToInt(s.charAt(i))*exponent;

		
		}
	}
