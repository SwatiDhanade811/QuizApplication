package sanika.logic;

public class DoublyLinkedList {
	public class Node {
		Quetion data;
		Node previous;
		Node next;

		public Node(Quetion data) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

	}

	Node head;

//insert nodes containing Quetion to list
	public DoublyLinkedList insertDll(DoublyLinkedList dll, Quetion q) {
		Node currentNode = dll.head;
		Node newNode = new Node(q);
		if (dll.head == null) {
			dll.head = newNode;
		} else {
			currentNode = dll.head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.previous = currentNode;
		}
		return dll;
	}

//create quetions 
	QuetionLogic q = new QuetionLogic();
	int a1[] = { 2, 6, 8, 7, 2, 9 };
	int a2[] = { 5, 8, 9, 0, 2, 19 };
	int a3[] = { 12, 6, 18, 11, 2, 4 };
	int a4[] = { 21, 66, 18, 17, 22, 7 };
	int a5[] = { 61, 0, 1, 77, 92, 19 };
	int a6[] = { 12, 100, -5, -2 };
	int a7[] = { 22, 80, 5, 9,3 };
	int a8[] = { 11, 10, 31, 17, 82, 9 };
	int a9[] = { 2, 10, -5, -2,11 };
	int a10[] = { 32, 30, 15, 19,34 };

	Quetion q1 = new Quetion("Q1)	Find out the sum of all the elements given below  ", q.sum(a1), a1, 1);
	Quetion q2 = new Quetion("Q2) Find out the index of the element '9' in the given array from left ",
			q.binarysearch(a2, 9), a2, 1);
	Quetion q3 = new Quetion("Q3) Find the alternative elements of array   ", q.printAlternate(a3, a3.length), a3,
			(a3.length / 2));
	Quetion q4 = new Quetion("Q4) Find 2nd largest element of given array ", q.print2largest(a4, a4.length), a4, 1);
	Quetion q5 = new Quetion("Q5) Find the largest number in length among array ", q.largest(a5, a5.length), a5, 1);
	Quetion q6 = new Quetion("Q1)Find all elements in array except largest two", q.findElements(a6), a6, a6.length-2);
	Quetion q7 = new Quetion("Q2) swap 3rd element from beggining with 2nd element from last ", q.swapKth(a7, 3, 2), a7, a7.length);
	Quetion q8 = new Quetion("Q3) Find the largest number in length among array ", q.largest(a8, a8.length), a8, 1);
	Quetion q9 = new Quetion("Q4) Find out the index of the element '-5' in the given array from left",q.binarysearch(a9, -5), a9, 1);
	Quetion q10 = new Quetion("Q5) Find 2nd largest element of given array ", q.print2largest(a10, a10.length), a10, 1);
//create quize
	public Node createDll(DoublyLinkedList dll) {
		dll.head = null;

		insertDll(dll, q1);
		insertDll(dll, q2);
		insertDll(dll, q3);
		insertDll(dll, q4);
		insertDll(dll, q5);
		Node current = dll.head;
		return current;
	}
	
	
	public Node createDll2(DoublyLinkedList dll) {
		dll.head = null;

		insertDll(dll, q6);
		insertDll(dll, q7);
		insertDll(dll, q8);
		insertDll(dll, q9);
		insertDll(dll, q10);
		Node current = dll.head;
		return current;
	}

//to get length of list
	public int countList(DoublyLinkedList dll) {
		Node currentNode;
		int count2 = 0;
		if (dll.head == null) {
			System.out.println("List is Empty ");
		} else {
			currentNode = dll.head;
			while (currentNode != null) {
				currentNode = currentNode.next;
				count2++;
			}

		}
		return count2;
	}

//calculate result
	public int check(DoublyLinkedList dll) {
		Node cur = dll.head;
		int sum = 0;
		int k;
		for (int i = 0; i < countList(dll); i++) {
			k = 0;
			for (int j = 0; j < cur.data.getLength(); j++) {
				if (cur.data.getAnswer()[j] == cur.data.getUserAns()[j]) {
					k++;
					
				}
				
			}
			if (k == cur.data.getLength()) {
				sum=sum+10;
				
			}
			cur = cur.next;
		}
		return sum;
	}

//present 1st quetion
	public Node firstQ(DoublyLinkedList dll) {
		Node current = dll.head;
		current.data.displayQuetion();
		current.data.collectAnswer();

		return current;
	}

//hit previous
	public Node goBack(DoublyLinkedList dll, Node current) {
		current = current.previous;
		current.data.displayQuetion();
		current.data.collectAnswer();

		return current;
	}

	//hit next
	public Node goAhead(DoublyLinkedList dll, Node current) {
		current = current.next;
		current.data.displayQuetion();
		current.data.collectAnswer();

		return current;
	}

	// make list empty
	public void makeEmpty(DoublyLinkedList dll) {
		Node c = dll.head;
		for (int k = 0; k < countList(dll); k++) {
			for (int i = 0; i < c.data.getLength(); i++) {
				c.data.getUserAns()[i] = 0;

			}
			c = c.next;
		}
	}

//user choice of hit
	public Node choiceImplement(DoublyLinkedList dll, int choice, Node current) {

		switch (choice) {
		case 1:
			if (current == dll.head) {
				System.out.println("No previous ,please select next or submit!");
			} else {
				current = dll.goBack(dll, current);
			}

			break;
		case 2:
			if (current.next == null) {
				System.out.println("No next , please select previous or submit! ");
			} else {
				current = dll.goAhead(dll, current);
			}
			break;
		case 3:
			System.out.println("			*****************	  Result  	***************");
			System.out.println("					   +--------------+");
			System.out.println("					   | Score : " + check(dll) + "/50 |");
			System.out.println("					   +--------------+");
			if (check(dll) <= 20) {
				System.out.println("					Practice makes man perfect!");
			} else if (check(dll) < 40 && check(dll) > 20) {
				System.out.println("					Good try!");
			} else {
				System.out.println("					Keep it up!");
			}
			makeEmpty(dll);
			break;
		default:
			System.out.println("You entered invalid choice,please choose among given choice");
		}
		return current;
	}
}
