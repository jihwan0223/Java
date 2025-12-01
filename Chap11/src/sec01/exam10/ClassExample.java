package sec01.exam10;

public class ClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//String photo1Path = clazz.getResource("asdf.png").getPath();
		String photo2Path = clazz.getResource("images/time.jpeg").getPath();
		
		//System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
