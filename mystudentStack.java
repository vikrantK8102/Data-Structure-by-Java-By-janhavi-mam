package datastructure;

import java.util.Scanner;

public class mystudentStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentStack stud1 = null;
		int ch;

		do {
			System.out.println("\n<---------- Menu ----------->");
			System.out.println("1. Push student");
			System.out.println("2. Pop student");
			System.out.println("3. Peek student");
			System.out.println("4. Display stack");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch (ch) {
				case 1: {
					System.out.print("Enter number of students to push: ");
					int d = sc.nextInt();
					stud1 = new StudentStack(d);

					for (int j = 0; j < d; j++) {
						System.out.println("\nEnter student " + (j + 1) + " details:");

						System.out.print("Enter roll: ");
						int roll = sc.nextInt();

						System.out.print("Enter name: ");
						String name = sc.next();

						System.out.print("Enter class: ");
						int studclass = sc.nextInt();

						Student s = new Student(roll, name, studclass);
						stud1.push(s);
					}
					break;
				}

				case 2: {
					if (stud1 != null) {
						Student popped = stud1.pop();
						if (popped != null)
							System.out.println("Popped student: " + popped);
						stud1.displayStud();
					} else {
						System.out.println("Stack not initialized.");
					}
					break;
				}

				case 3: {
					if (stud1 != null) {
						Student peeked = stud1.peek();
						if (peeked != null)
							System.out.println("Top student: " + peeked);
						stud1.displayStud();
					} else {
						System.out.println("Stack not initialized.");
					}
					break;
				}

				case 4: {
					if (stud1 != null) {
						stud1.displayStud();
					} else {
						System.out.println("Stack not initialized.");
					}
					break;
				}

				case 5: {
					System.out.println("Exiting...");
					break;
				}

				default:
					System.out.println("Invalid choice.");
			}

		} while (ch != 5);

		sc.close();
	}
}
