import java.util.Scanner;

public class Login_Main_test {

	public static void main(String[] args) {
		TimeCapsule_DAO dao = new TimeCapsule_DAO();
		Scanner sc = new Scanner(System.in);
		
		//계정생성

//		System.out.print("아이디 입력 : ");
//		String id = sc.next();
//		System.out.print("패스워드 입력 : ");
//		int pw = sc.nextInt();
//		System.out.print("이메일 입력: ");
//		String email = sc.next();
//		
//		dao.createAcc(id, pw, email);
		
		//로그인
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		System.out.print("패스워드 입력 : ");
		int pw = sc.nextInt();
		
		if(dao.login(email,pw)){
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
	}

}
