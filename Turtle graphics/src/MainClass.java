import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char input = '\u0000';
		Turtle turtle = new Turtle(new int[20][20]);
		turtle.createTurtle();
		System.out.println(turtle);
		loop: while (input != 'e' || input != 'E') {
			System.out.println(
					"Enter L/l for left, Enter R/r for right\nEnter U/u for up, Enter D/d for down\nEnter e/E for exit.");
			input = scanner.next().charAt(0);
			switch (input) {
			case 'L':
			case 'l':
				System.out.println("Left Move");
				turtle.moveLeft();
				System.out.println(turtle);
				break;
			case 'R':
			case 'r':
				System.out.println("Right Move");
				turtle.moveRight();
				System.out.println(turtle);
				break;
			case 'U':
			case 'u':
				System.out.println("Up Move");
				turtle.moveUp();
				System.out.println(turtle);
				break;
			case 'd':
			case 'D':
				System.out.println("Down move");
				try {
				turtle.moveDown();
				}catch (Exception e) {
					System.out.println("kjgkj");
				}
				System.out.println(turtle);
				break;
			case 'e':
			case 'E':
				System.out.println("Exit");
				break loop;
			default:
				System.out.println("Invalid Option");
			}
		}
		scanner.close();

	}
}
