package tw.acelan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args){
		//建立一個content.txt檔案
		File file = new File("content.txt");
		OutputStream out = null;
		
		try{
			/*
			 * 透過子類別FileOutputStream產生實體並向上轉型為父類別
			 * 也可以直接宣告FileOutputStream物件變數替代OutputStream物件變數
			 * 另外，因為FileOutputStream建構子會丟出FileNotFoundException例外，所以必須捕捉之。
			 * 而使用Exception可以捕捉所有例外情況。
			 */
			out = new FileOutputStream(file);
			
			//欲寫入檔案的資料
			String content = "Hello World!";
			
			//將String資料轉為byte陣列。
			byte[] bytes = content.getBytes();
			
			//將byte資料寫入檔案
			out.write(bytes);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			/*
			 * 最後要關閉輸出流，否則資源會一直被強占著
			 */
			if(out != null){
				try{out.close();}catch(Exception e){e.printStackTrace();}
			}
		}
		
	}
}
