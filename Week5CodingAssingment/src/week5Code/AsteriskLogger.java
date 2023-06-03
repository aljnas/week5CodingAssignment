package week5Code;

 
    class AsteriskLogger implements Logger{

		@Override
		public void log(String message) {
			// TODO Auto-generated method stub
			System.out.println("***" + message +"***");
		}

		@Override
		public void error(String message) {
			// TODO Auto-generated method stub
			int n = message.length();
			String stars = "";
			for (int i = 0; i < n; i++) {
				stars += "*";
			}
			System.out.println(stars);
			System.out.println("***Error: "+ message+ "***");
			System.out.println(stars);
		}

	}


     class SpacedLogger implements Logger{

		@Override
		public void log(String message) {
			// TODO Auto-generated method stub
			String spaced = "";
			for (int i = 0; i<message.length();i++) {
				spaced+=message.charAt(i)+ "";
			}
			System.out.println(spaced);
		}

		@Override
		public void error(String message) {
			// TODO Auto-generated method stub
			String spaced = "";
			for (int i = 0;i < message.length();i++) {
				spaced += message.charAt(i) + "";
			}
			System.out.println("ERROR: " + spaced);
		}
    	 
     }