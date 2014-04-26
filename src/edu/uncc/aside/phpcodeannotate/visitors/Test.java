package edu.uncc.aside.phpcodeannotate.visitors;

public class Test {
	public static void main(String[] args){
		String t = "get_record_sql";
		if(t.substring(t.length() - 3).equals("sql"))
			System.out.println("matched");
		else
			return;
	}

}
