public class Statistic {
	public static void main(String[] args) {
		String a = args[0];
		StringBuilder teamA = new StringBuilder("");
		StringBuilder teamB = new StringBuilder("");
		StringBuilder countA = new StringBuilder("");
		StringBuilder countB = new StringBuilder("");
		int count1 = 0;
		int count2 = 0;
		int k = 0;
		int k1 = 0;
		String temp = "";
		for (int i=0; i < a.length(); i++) {
			k = i;
			if (a.charAt(i) != '-') {
				teamA.append(a.charAt(i));
			}
			else 
				break;
		}	
		for (int i = k + 1; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				teamB.append(a.charAt(i));
			}
			else 
				break;
		}
		for(int i = 1; i < args.length; i++) {
			for(int j = 0; j < args[i].length(); j ++) {
				k1=j;
			 	if (args[i].charAt(j) != ':') {
			 		countA.append(args[i].charAt(j));
			 	}
			 	else 
			 		break;	 	
			}
			for(int j = k1+1; j < args[i].length(); j ++) {
			 		countB.append(args[i].charAt(j));
			}

			count1 = count1 + Integer.valueOf(countA.toString());
			count2 = count2 + Integer.valueOf(countB.toString());	
			countA.delete(0, countA.length());
			countB.delete(0, countB.length()); 	
		} 	
		System.out.println(teamA + ": " + getBeautifullString(count1));
		System.out.println(teamB + ": " + getBeautifullString(count2));
	}
	public static String getBeautifullString(int a){
		StringBuilder b = new StringBuilder();
		if ((a%100 > 10) && (a%100 < 20)){
			b.append(a + " golov");
		}
		else{
			switch(a % 10){
				case 1:
					b.append(a + " gol");
					break;
				case 2:
				case 3:
				case 4:
					b.append(a + " gola");
					break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 0:
					b.append(a + " golov");
					break;
			}
		}
		return b.toString();
	}
}