package math.com;
import org.apache.commons.lang3.*;
import Arrays
	

public class Main {
	
	public void subString() {
		 String text = "hello educative";
	        int start = 10;
	        int end = 6;
	        //possible ways of variable
	        int a;
	        int a11;
	        int _a;
	        int athe_a;
	        int at22_nn;
	        //possible ways.......
	        System.out.println("StringUtils.substring('%s','%s')");

	        System.out.printf("StringUtils.substring('%s', %s, %s) = '%s'\n", text, start, end, StringUtils.substring(text, start, end));

	        end = -5;
	        System.out.printf("StringUtils.substring('%s', %s, %s) = '%s'\n", text, start, end, StringUtils.substring(text, start, end));
	   
	}
	public void capitali() {
		 System.out.println(StringUtils.capitalize("ababaaMathewaabbbcccac"));
	        System.out.println(StringUtils.capitalize("'hareesh'"));
	}
	public void joins() {
		String[] strings = {"hareesh", "mathew", "java"};
        char sep = '-';
        System.out.printf("StringUtils.join('%s', %s) = '%s'", Arrays.toString(strings), sep, StringUtils.join(strings, sep));
        System.out.println();
	}
	
	public static void main(String[] args) {
        String s = "543234";
        System.out.printf("The output of StringUtils.isBlank() for the string - '%s' is %s", s, StringUtils.isBlank(s));
        System.out.println();

       String s1 = "";
        System.out.printf("The output of StringUtils.isBlank() for the string - '%s' is %s", s1, StringUtils.isBlank(s1));
        System.out.println();

        String s2 = null;
        System.out.printf("The output of StringUtils.isBlank() for the string - '%s' is %s", s2, StringUtils.isBlank(s2));
        System.out.println();

        String s3 = "    \n\t";
        System.out.printf("The output of StringUtils.isBlank() for the string - '%s' is %s", s3, StringUtils.isBlank(s3));
        System.out.println();
        Main obj = new Main();
        obj.capitali();
        obj.joins();
        obj.subString();
       
    }

}
