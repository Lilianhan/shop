package helloboy;


public class PhraseOMatic {
	public static void main(String[] args){
		
		// make three sets of words to choose from.
		String[] who = {"Jason","Lilian","Dayong"};
		String[] where = {"school","Wendy's","home"};
		String[] doWhat = {"sleeping","eating","drinking"};
		
		//find out how many word are in each list
		int oneLength = who.length;
		int twoLength = where.length;
		int threeLength = doWhat.length;
		
		//generate three random numbers
		int rand1 =  (int)(Math.random()*oneLength);
		int rand2 =  (int)(Math.random()*twoLength);
		int rand3 =  (int)(Math.random()*threeLength);
		
		//build words
		String words = who[rand1]+" is "+doWhat[rand2]+" in "+where[rand3];
		System.out.println(words);
	}

}
