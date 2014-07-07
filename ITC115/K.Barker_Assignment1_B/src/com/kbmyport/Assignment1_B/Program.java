package com.kbmyport.Assignment1_B;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Program p = new Program();
		p.twoDimensionalArray();

	}
	private void twoDimensionalArray(){
		  String[] [] books = new String[10][10];
		  books[0][0]="Green Eggs and Ham";
		  books[0][1]="Seuss";
		  books[1][0]="It";
		  books[1][1]="King";
		  books[2][0]="Romeo and Juliet";
		  books[2][1]="Shakespeare";
		  books[3][0]="Death on the Nile";
		  books[3][1]="Christie";
		  books[4][0]="Harry Potter";
		  books[4][1]="Rowling";
		  books[5][0]="War and Peace";
		  books[5][1]="Tolstoy";
		  books[6][0]="The City";
		  books[6][1]="Koontz";
		  books[7][0]="Just One Day";
		  books[7][1]="Forman";
		  books[8][0]="Grey Mountain";
		  books[8][1]="Grisham";
		  books[9][0]="Me Before You";
		  books[9][1]="Moyes";
		  
		  System.out.println("Enter an author's name");
		  Scanner scan = new Scanner(System.in);
		  String author=scan.next();
		  
		  for(int i=0;i<books.length;i++){
		   if(books[i][1].equals(author)){
		    System.out.println(books[i][0]);
		   }
		  }
		 }
	
	
	
}
