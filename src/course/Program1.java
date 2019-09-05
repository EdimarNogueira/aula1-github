package course;

public class Program1 {

	public static void main(String[] args) {
		String original="abcdf FGHF ABBBB";
		
		String s01= original.toLowerCase();
		String s02= original.toUpperCase();
		String s03= original.trim();
		String s04= original.substring(2);
		String s05= original.substring(2,9);
		String s06= original.replace('a', 'X');
		int i= original.indexOf("bc");
		int j= original.lastIndexOf("bc");
		
		System.out.println("Original: " + original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
		System.out.println("SPLIT-------------------------------------------");
		
		String s= "bata maça e limão";
		
		String[] vect= s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
