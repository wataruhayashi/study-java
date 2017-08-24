package hayashi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class File {
	public static void main(String[] args){
		try{
			BufferedReader br =
					new BufferedReader(new FileReader("test1.txt"));
			String line = br.readLine();
			System.out.println(line);
			int max = Integer.parseInt(line);
			int min = Integer.parseInt(line);
			while((line = br.readLine())  != null){
				int val = Integer.parseInt(line);
				System.out.println(val);
				if(max < val){
					max = val;
				}else if(min > val){
					min = val;
				}
			}
			System.out.println("最高点は"+max+"です。");
			System.out.println("最低点は"+min+"です。");
			br.close();
		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}
	}
}
