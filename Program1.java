import java.io.*;
class Program1{
	public static void main(String args[]) {
		String str="";
		String str2="";
		try{
			int i;
			char c;
			FileReader f=new FileReader("../Swap.txt");
			while((i = f.read()) != -1) {
				c = (char) i;
				str=str+c;
				}
			}catch(IOException e) {
				System.out.println("IO Exception");
				}catch(Exception e) {
					e.printStackTrace();
					}
					 
					for(int i=0; i < str.length(); i++) {
						String str1 = str.charAt(i) + "";
						if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
							str1 = str1.toUpperCase();
							str2 = str2 + str1;
							}else if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
								str1 = str1.toLowerCase();
							    str2 = str2 + str1;
								}else{
									str2 = str2 + str1;
									}
						}
						System.out.println(str2);
		}
	}

    
