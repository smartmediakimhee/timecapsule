import java.util.Scanner;

public class Login_Main_test {

	public static void main(String[] args) {
		TimeCapsule_DAO dao = new TimeCapsule_DAO();
		Scanner sc = new Scanner(System.in);
		
		//��������

//		System.out.print("���̵� �Է� : ");
//		String id = sc.next();
//		System.out.print("�н����� �Է� : ");
//		int pw = sc.nextInt();
//		System.out.print("�̸��� �Է�: ");
//		String email = sc.next();
//		
//		dao.createAcc(id, pw, email);
		
		//�α���
		System.out.print("�̸��� �Է� : ");
		String email = sc.next();
		System.out.print("�н����� �Է� : ");
		int pw = sc.nextInt();
		
		if(dao.login(email,pw)){
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
	}

}
