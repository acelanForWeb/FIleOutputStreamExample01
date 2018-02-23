package tw.acelan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args){
		//�إߤ@��content.txt�ɮ�
		File file = new File("content.txt");
		OutputStream out = null;
		
		try{
			/*
			 * �z�L�l���OFileOutputStream���͹���æV�W�૬�������O
			 * �]�i�H�����ŧiFileOutputStream�����ܼƴ��NOutputStream�����ܼ�
			 * �t�~�A�]��FileOutputStream�غc�l�|��XFileNotFoundException�ҥ~�A�ҥH�����������C
			 * �Өϥ�Exception�i�H�����Ҧ��ҥ~���p�C
			 */
			out = new FileOutputStream(file);
			
			//���g�J�ɮת����
			String content = "Hello World!";
			
			//�NString����ରbyte�}�C�C
			byte[] bytes = content.getBytes();
			
			//�Nbyte��Ƽg�J�ɮ�
			out.write(bytes);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			/*
			 * �̫�n������X�y�A�_�h�귽�|�@���Q�j�e��
			 */
			if(out != null){
				try{out.close();}catch(Exception e){e.printStackTrace();}
			}
		}
		
	}
}
