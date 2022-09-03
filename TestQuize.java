package sanika.client;

import java.time.LocalDate;
import java.util.Scanner;
import java.awt.Desktop;
import java.awt.desktop.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import sanika.logic.DoublyLinkedList;
import sanika.logic.DoublyLinkedList.Node;
import sanika.logic.Quetion;
import sanika.logic.QuetionLogic;

public class TestQuize {
	public static void main(String[] args) throws IOException, URISyntaxException {
		DoublyLinkedList dll = new DoublyLinkedList();

		System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!**!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!!*!*!**!*!*!!*!*!**!");
		System.out.println("	********************     Welcome To Quize Application    ********************");
		System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!**!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!!*!*!**!*!*!!*!*!**!");
		LocalDate date = LocalDate.now();

		System.out.println();

		System.out.println(
				"                               	     	         +-----------------------------------------+");
		System.out.println("						 | Date		: " + date + "  	 	   |");
		System.out.println("						 | Good Thought : " + "Shine in your own way!!  |");

		System.out.println("                          	               	 +-----------------------------------------+");

		int choice;
		do {
			choice = 0;
			System.out.println();

			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println("	1.Study material");
			System.out.println("	2.Test");
			System.out.println("	3.Exit");
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			Scanner inp = new Scanner(System.in);
			System.out.print("			Enter your choice :	");
			choice = inp.nextInt();
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			switch (choice) {
			case 1:
				int ch;
				System.out.println();
				System.out.println("			*****************     Happy Studying   ***************");
				System.out.println();
				do {
					ch = 0;
					System.out.println(
							"-------------------------------------------------------------------------------------------");
					System.out.println("	1.Counting");
					System.out.println("	2.ABCD");
					System.out.println("	3.Sum");
					System.out.println("	4.Exit");
					System.out.println(
							"-------------------------------------------------------------------------------------------");
					System.out.print("			 enter your choice:		");
					ch = inp.nextInt();
					System.out.println(
							"-------------------------------------------------------------------------------------------");
					switch (ch) {
					case 1:
						System.out.println("	Lets have tour of Counting !!!");
						Desktop ob = Desktop.getDesktop();
						ob.browse(new URI("https://www.youtube.com/watch?v=YRl4VyAIJhM"));
						break;
					case 2:
						System.out.println("	Lets have tour of Difference !!!");
						Desktop ob1 = Desktop.getDesktop();
						ob1.browse(new URI("https://www.youtube.com/watch?v=p-kAI-qOeJA"));

						break;
					case 3:
						System.out.println("	Lets have tour of Summation !!!");
						Desktop ob2 = Desktop.getDesktop();
						ob2.browse(new URI("https://www.youtube.com/watch?v=xjnlymFLSdM"));
						break;

					case 4:
						System.out.println("			*****************     Thank You!  	 ***************");
						break;
					default:
						System.out.print("		You entered invalid choice ,please choose among given choice");
					}
				} while (ch != 4);

				break;
			case 2:
				System.out.println("				+--------------+   +---------------+   ");
				System.out.println("				|1.vesrsion :1 |   | 2.version :2  |   ");
				System.out.println("				+--------------+   +---------------+   ");
				System.out.print("			Enter youe choice  :	");
				int version=inp.nextInt();
				System.out.println(
						"-------------------------------------------------------------------------------------------");
				switch(version) {
				case 1:
					dll.createDll(dll);
					break;
				case 2:
					dll.createDll2(dll);
					break;
			
					default:
						System.out.print("		You entered invalid choice ,please choose among given choice");
				}
			
				Node current;
				System.out.println();
				System.out.println("			*****************     All The Best    ***************");
				System.out.println();
				System.out.println("				 +-------+-------+-------+-------+-----+");
				System.out.println("				 |   1   |   2   |   3   |   4   |  5  | ");
				System.out.println("				 +-------+-------+-------+-------+-----+");
				current = dll.firstQ(dll);
				int c;
				do {
					c = 0;
					System.out.println(
							"-------------------------------------------------------------------------------------------");
					System.out.println("		    	   +-------------+   +-----------+   +----------+");
					System.out.println("		    	   |1.previous   |   | 2.Next    |   |3.Submit  |");
					System.out.println("		    	   +-------------+   +-----------+   +----------+");

					System.out.print("			Enter youe choice button :	");
					c = inp.nextInt();
					System.out.println(
							"-------------------------------------------------------------------------------------------");
					current = dll.choiceImplement(dll, c, current);
				} while (c != 3);

				break;
			case 3:
				System.out.println("			*****************     Thank You!  		 ***************");
				System.out.println(
						"-------------------------------------------------------------------------------------------");
				System.out.println(
						"-------------------------------------------------------------------------------------------");
				System.out.println(
						"-------------------------------------------------------------------------------------------");

				break;
			default:
				System.out.print("		You entered invalid choice! please enter among given choices!");
			}
		} while (choice != 3);

	}

}
