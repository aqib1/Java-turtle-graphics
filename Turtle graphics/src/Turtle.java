
public class Turtle {
	private int currentRow = 0;
	private int currentColumn = 0;
	private int[][] tray;

	public Turtle(int[][] tray) {
		this.tray = tray;
	}

	public void createTurtle() {
		this.tray[currentRow][currentColumn] = 1;
	}

	public void moveLeft() {
		currentColumn--;
		if (validMove()) {
			this.tray[currentRow][currentColumn] = 1;
		} else {
			System.err.println("Invalid left move");
		}
	}

	public void moveRight() {
		currentColumn++;
		if (validMove()) {
			this.tray[currentRow][currentColumn] = 1;
		} else {
			System.err.println("Invalid Right move");
		}
	}

	public void moveUp() {
		currentRow--;
		if (validMove()) {
			this.tray[currentRow][currentColumn] = 1;
		} else {
			System.err.println("Invalid Up move");
		}
	}

	public void moveDown() {
		currentRow++;
		if (validMove()) {
			this.tray[currentRow][currentColumn] = 1;
		} else {
			System.err.println("Invalid Down move");
		}
	}

	private boolean validMove() {
		boolean valid = false;
		if (currentRow >= 0 && currentColumn >= 0 && currentRow < this.tray.length
				&& currentColumn < this.tray[currentRow].length) {
			valid = true;
		}
		if (currentRow >= this.tray.length) {
			resetterForMostRow();
		}
		if (currentRow < 0) {
			resetterForLeastRow();
		}
		if (currentColumn >= this.tray[currentRow].length) {
			resetterForMostCol();
		}
		if (currentColumn < 0) {
			resetterForLeastCol();
		}
		return valid;
	}

	private void resetterForLeastCol() {
		currentColumn = 0;
	}

	private void resetterForLeastRow() {
		currentRow = 0;
	}

	private void resetterForMostRow() {
		currentRow = this.tray.length - 1;
	}

	private void resetterForMostCol() {
		currentColumn = this.tray[currentRow].length - 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int[] rows : tray) {
			for (int col : rows) {
				builder.append(col + " ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
