import java.io.*;
class Program2{
	String str;
	String str2 = "";
	String swap(String st) {
		this.str = st;
		for (int i = 0; i < str.length(); i++) {
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
        return str2;
        }
        }

class FileReaderDemo{
	public static void main(String[] args) {
		Program2 p =new Program2();
		String s = "";
		char c;
		int i;
		try{
		FileReader fr=new FileReader("../Swap.txt");
		while((i = fr.read()) != -1) {
				c = (char) i;
				s = s+c;
				}
				fr.close();
			}catch(IOException e) {
				System.out.println("IO Exception");
				}catch(Exception e) {
					e.printStackTrace();
					}
					System.out.println(p.swap(s));
		}
	}
