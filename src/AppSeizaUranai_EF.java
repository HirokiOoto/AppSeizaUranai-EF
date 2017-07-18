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
		String fortune[] = {"", "�P�ʁI�I�I�I�I �󂭂��𔃂��܂��傤�B",
								"�Q�ʁI�I�I�I �Ȃɂ��y�������Ƃ��N���肻���B�B",
								"�R�ʁI�I�I �ƂĂ��������ɂȂ肻���B",
								"�S�ʁI�I �F�l���牽�����炦�����B",
								"�T�ʁI �Ȃɂ��ǂ����Ƃ��N���肻���B",
								"�U�� �����ƕς��Ȃ����ɂȂ肻���B",
								"�V�� �������Ȃ��Ƃ����肻���B",
								"�W�� �h�����Ƃ��N���肻���B",
								"�X�� �߂������Ƃ��N���肻���B",
								"�P�O�� �O�o�̍ۂ͋C��t���āB",
								"�P�P�� �铹�ɋC��t���āB",
								"�P�Q�� ������������!!!!!"	};

		System.out.println("���Ђ����̂��Ȃ���" + fortune);
	}
	public static void taurus(int rank){
		//��� �T�M����
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
		
		System.out.println("���Ƃߍ��̋M���͑� " + rank + " ��!!!";
		switch(rank) {
			case 1:
				System.out.println("�}���V�������꓏�������Ⴈ��");
				System.out.println("���b�L�[�A�C�e�� : �y�v�V�E�R�[��");
				break;
			case 2:
				System.out.println("�ڕW�ɏ��������߂Â�����...?");
				System.out.println("���b�L�[�A�C�e�� : �R�J�E�R�[��");
				break;
			case 3:
				System.out.println("�T�O�~�����[�ɗ����Ă邩���I��Ԃ�");
				System.out.println("���b�L�[�A�C�e�� : ���ɂ����΂̃��N���g�݂����Ȃ��");
				break;
			case 4:
				System.out.println("�S�g���F�R�[�f�ŋ��^�A�b�v");
				System.out.println("���b�L�[�A�C�e�� : ��₵���ؑ吷");
				break;
			case 5:
				System.out.println("�������[������H�ׂĕ�����");
				System.out.println("���b�L�[�A�C�e�� : �ϊ������[����");
				break;
			case 6:
				System.out.println("���R���Y������H�ׂ�Ɖ^�C�A�b�v...?");
				System.out.println("���b�L�[�A�C�e�� : ���R���Y����");
				break;
			case 7:
				System.out.println("�V�������Ƃɒ��킵�Ă݂悤");
				System.out.println("���b�L�[�A�C�e�� : �m�[�g�p�\�R��");
				break;
			case 8:
				System.out.println("�����̓A�c�D�C���琅���⋋��Y�ꂸ��");
				System.out.println("���b�L�[�A�C�e�� : �l�얃�k����");
				break;
			case 9:
				System.out.println("�D���Ȃ��ƂŐH�ׂĂ������I�������܂���������...");
				System.out.println("���b�L�[�A�C�e�� : LUMIX GH5");
				break;
			case 10:
				System.out.println("�����͑��߂ɐQ�悤");
				System.out.println("���b�L�[�A�C�e�� : ���ӂƂ���Ƃ��ӂ��Ӗѕz");
				break;
			case 11:
				System.out.println("���������͊w�Z���x�񂾂ق�����������");
				System.out.println("���b�L�[�A�C�e�� : �����");
				break;
			case 12:
				System.out.println("�ǂ��������Ă���]");
				System.out.println("���b�L�[�A�C�e�� : �k���`���N");
				break;
		}
	}
	public static void libra(int rank){
		//�ɐ��E�l����
	}
	public static void scorpio(int rank){
		//�ɓ��C������
	}
}
