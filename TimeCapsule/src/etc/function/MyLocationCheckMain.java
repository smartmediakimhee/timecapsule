package etc.function;
public class MyLocationCheckMain {

	public static void main(String[] args) {
		MyLocation ml = new MyLocation();
		String location = ml.getLocation();
		//������ ������ ������ ��ȯ�ϴ� �޼ҵ� : ���� ���� ���ϵ�
		
		String city = location.split(" ")[0];
		//�ּ� �߿� "��" ������ ��ȯ : ����
		
		MyWeather mw = new MyWeather();
		System.out.println(mw.getWeather(city));
		//"��" ���� �����ϸ� �ش� ���� ������ String Ÿ������ ��ȯ : ��������
		
		NowTime nt = new NowTime();
		System.out.println(nt.getTime());
		//"����" �ð��� ���ͳ��� ���� �޾ƿ��� 
		
	}

}
