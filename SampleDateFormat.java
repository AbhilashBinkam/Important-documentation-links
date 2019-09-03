public class Sample {
	
	public static void main(String[] args) {

//        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        Calendar cal = Calendar.getInstance();
//        System.out.println(dateFormat.format(cal.getTime()));
        
        
        String ou = convertToValidDateFormat("YYYY-MM-DD");
        System.out.println(ou);
        
        
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.getTime().toString());
	}
	
	
	private static String convertToValidDateFormat(String localeDF) {

		int localeDFLength = localeDF.length();
		StringBuilder localeStringBuffer = new StringBuilder(localeDF);

		for (int eachIndex = 0; eachIndex < localeDFLength; eachIndex++) {
			Character eachChar = localeDF.charAt(eachIndex);

			if (eachChar.equals('D') || eachChar.equals('Y')) {
				localeStringBuffer.replace(eachIndex, eachIndex + 1, Character.toLowerCase(eachChar) + "");
			}

		}

		return localeStringBuffer.toString();
	}
	
	
	

}
