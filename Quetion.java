package sanika.logic;

import java.util.Scanner;

public class Quetion {
	private String statement;
	private int answer[];
	private int userAns[];
	private int qArray[];
	private int length;

	public Quetion(String statement, int[] answer, int[] qArray, int length) {
         this.userAns=new int[length];
		this.statement = statement;
		this.answer = answer;
		this.qArray = qArray;
		this.length = length;
		this.userAns = new int[length];
	}

	public int[] getUserAns() {
		return this.userAns;
	}

	public int getLength() {
		return this.length;
	}

	public void setUserAns(int[] userAns) {
		this.userAns = userAns;
	}

	public String getStatement() {
		return this.statement;
	}

	public int[] getAnswer() {
		return this.answer;
	}

	public int[] getqArray() {
		return this.qArray;
	}

//auxillary fun
	public boolean isEmpty(int ar[]) {
		boolean check = true;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				check = false;
				break;
			}
		}
		return check;
	}

//display quetion to user
	public void displayQuetion() {
		System.out.println();
		System.out.println(		this.statement);
		System.out.print("	{");
		for (int i = 0; i < this.qArray.length; i++) {
			System.out.print(this.qArray[i] + " , ");
		}
		System.out.print("}");
		if (!isEmpty(this.userAns)) {
			System.out.println();
			for (int i = 0; i < this.userAns.length; i++) {
				System.out.println("	previous answer : " + this.userAns[i] + ", ");
			}
		}

	}

//collect ans from user
	public int[] collectAnswer() {
		System.out.println();
		System.out.print("	Enter your complete answer :	 ");
		Scanner inp = new Scanner(System.in);
		for (int j = 0; j < this.userAns.length; j++) {
			this.userAns[j] = inp.nextInt();
			
		}

		return this.userAns;
	}

}
