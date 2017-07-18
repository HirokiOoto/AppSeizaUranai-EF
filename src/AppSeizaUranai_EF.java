import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AppSeizaUranai_EF {
	Random ra;
	static ArrayList<Integer> rankArray;
	Scanner sc;

	public AppSeizaUranai_EF(){
		ra = new Random();
		rankArray = new ArrayList<Integer>();
		sc = new Scanner(System.in);

		for(int i = 0;i < 8;i++){
			int num = ra.nextInt(12) + 1;
			while(rankArray.contains(num)){
				num = ra.nextInt(12) + 1;
			}
			rankArray.add(num);
		}
	}
	public static void main(String[] args){

		System.out.println("�`�`�`�`�`�`�����̐肢�`�`�`�`�`�`");

		aries(rankArray.get(0));
		taurus(rankArray.get(1));
		gemini(rankArray.get(2));
		cancer(rankArray.get(3));
		leo(rankArray.get(4));
		virgo(rankArray.get(5));
		libra(rankArray.get(6));
		scorpio(rankArray.get(7));

		System.out.println("�`�`�`�`�`�`�ǂ������!�`�`�`�`�`�`");


	}
	public static void aries(int rank){
		//���R ��炳��
	}
	public static void taurus(int rank){
		//��� �T�M����
		switch(rank){
			case 1:
				System.out.println("���ʁF1��");
				System.out.println("�l���ɉe�����y�ڂ��l�Ƃ̏o���");
				break;
			case 2:
				System.out.println("���ʁF2��");
				System.out.println("�K�^�̏��_�����΂ނ��Ă��Ȉ��");
				break;
			case 3:
				System.out.println("���ʁF3��");
				System.out.println("�I�[�v���ȑԓx�ŉ߂����̂��厖");
				break;
			case 4:
				System.out.println("���ʁF4��");
				System.out.println("��炵�̒��ɐV���Ȃ��̂��������Ƌg");
				break;
			case 5:
				System.out.println("���ʁF5��");
				System.out.println("�����Ƃ��߂��V�[���ɑ��������");
				break;
			case 6:
				System.out.println("���ʁF6��");
				System.out.println("�C���[�W�`�F���W�ɓK���Ă����");
				break;
			case 7:
				System.out.println("���ʁF7��");
				System.out.println("�����Ƃ��߂��悤�Ȃ��̂�������ꂻ��");
				break;
			case 8:
				System.out.println("���ʁF8��");
				System.out.println("�h�������߂Ė`�����������Ȃ肻��");
				break;
			case 9:
				System.out.println("���ʁF9��");
				System.out.println("�h����ω������߂��");
				break;
			case 10:
				System.out.println("���ʁF10��");
				System.out.println("�����Ȗ񑩂����Ȃ��悤�ɒ���");
				break;
			case 11:
				System.out.println("���ʁF11��");
				System.out.println("�y���݂������ď��ɋC���]����");
				break;
			case 12:
				System.out.println("���ʁF12��");
				System.out.println("�v���X�v�l�ł����܂��傤");
				break;
		}
	}
	public static void gemini(int rank){
		//�ԉ� �Ă���
	}
	public static void cancer(int rank){
		//���i
	}
	public static void leo(int rank){
		//��R �Ö킳��
	}
	public static void virgo(int rank){
		//�㏗�� ������
	}
	public static void libra(int rank){
		//�ɐ��E�l����
	}
	public static void scorpio(int rank){
		//�ɓ��C������
	}
}
