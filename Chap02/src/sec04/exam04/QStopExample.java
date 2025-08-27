package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
			if(KeyCode == 113) {
				break;		//소문자 q 입력시 종료;
			}
		}
		System.out.println("종료");
	}

}
