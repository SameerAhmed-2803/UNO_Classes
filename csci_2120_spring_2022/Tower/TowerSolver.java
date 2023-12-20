public class TowerSolver {

	private static int totalNumMoves = 0;

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Usage:\n\tjava TowerSolver #disks");
			System.exit(1);
		}

		int numDisks = Integer.parseInt(args[0]);
		solveTower(numDisks,1,3);
		System.out.println("Total Moves: " + totalNumMoves);

	}

	public static void solveTower(int numDisks, int startPeg, int destPeg) {

		// base case
		if (numDisks == 1) {
			System.out.println("Move disk from "  + startPeg + " to " + destPeg);
			totalNumMoves++;
		}
		else {
			int other = 6 - (startPeg + destPeg);
			solveTower(numDisks-1, startPeg, other);
			solveTower(1, startPeg, destPeg);
			solveTower(numDisks-1, other, destPeg);
		}

	}



}
