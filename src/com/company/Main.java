package com.company;

public class Main {

    public static void main(String[] args) {
	String str=new String();

	int counter=0;
	str="Сам делал,честно,отвечаю.";
	    if(str.charAt(0)==' '||str.charAt(0)=='\t')
	        counter++;

        for (int i = 1; i <str.length() ; i++) {
            if( (str.charAt(i)==' ')||(str.charAt(i)=='.')||(str.charAt(i)==','))
                counter++;
        }
        System.out.println("Количество слов в предложении ="+counter);



        String[] array= str.split("[,;:\\s]");
        System.out.println("Количество слов в предложении ="+array.length);

    }




}
