package projects;

import java.awt.Image;
import java.util.ArrayList;

public class Queen extends Piece{
	public Queen(int turn, Image img) {
		super(turn, img);
	}
	@Override
	public ArrayList<int[]> getMoves(Board board, int r, int c) {
		// moves right
		ArrayList<int[]> moves = new ArrayList<int[]>();
		for (int i = 1; i < 8; i++) {
			if (r + i >= 0 && r + i < 8) {
				if (board.getBoard()[r+i][c].getTeam() != getTeam()) {
					int[]move = {r+i,c};
					moves.add(move);
				}
				if (board.getBoard()[r+i][c].getTeam() != -1) {
					break;
				}
			}
			
		}
		// moves up
		for (int i = 1; i < 8; i++) {
			if (c + i >= 0 && c + i < 8) {
				if (board.getBoard()[r][c+i].getTeam() != getTeam()) {
					int[]move = {r,c + i};
					moves.add(move);
				}
				if (board.getBoard()[r][c+i].getTeam() != -1) {
					break;
				}
			}
		}
		// moves left
		for (int i = 1; i < 8; i++) {
			if (r - i >= 0 && r - i < 8) {
				if (board.getBoard()[r-i][c].getTeam() != getTeam()) {
					int[]move = {r-i,c};
					moves.add(move);
				}
				if (board.getBoard()[r-i][c].getTeam() != -1) {
					break;
				}
			}
		}
		// moves down
		for (int i = 1; i < 8; i++) {
			if (c - i >= 0 && c - i < 8) {
				if (board.getBoard()[r][c-i].getTeam() != getTeam()) {
					int[]move = {r,c-i};
					moves.add(move);
				}
				if (board.getBoard()[r][c-i].getTeam() != -1) {
					break;
				}
			}
		}
		// moves up and right
		for (int i = 1; i < 8; i++) {
			if (r + i >= 0 && r + i < 8 && c + i >=0 && c+i <8) {
				if (board.getBoard()[r+i][c+i].getTeam() != getTeam()) {
					int[]move = {r+i,c+i};
					moves.add(move);
				}
				if (board.getBoard()[r+i][c+i].getTeam() != -1) {
					break;
				}
			}
			
		}
		// moves up and left
		for (int i = 1; i < 8; i++) {
			if (c + i >= 0 && c + i < 8  && r - i >=0 && r - i <8) {
				if (board.getBoard()[r-i][c+i].getTeam() != getTeam()) {
					int[]move = {r-i,c + i};
					moves.add(move);
				}
				if (board.getBoard()[r-i][c+i].getTeam() != -1) {
					break;
				}
			}
		}
		// moves down and right
		for (int i = 1; i < 8; i++) {
			if (r + i >= 0 && r + i < 8  && c - i >=0 && c-i <8) {
				if (board.getBoard()[r+i][c-i].getTeam() != getTeam()) {
					int[]move = {r+i,c-i};
					moves.add(move);
				}
				if (board.getBoard()[r+i][c-i].getTeam() != -1) {
					break;
				}
			}
		}
		// moves down and left
		for (int i = 1; i < 8; i++) {
			if (c - i >= 0 && c - i < 8  && r - i >=0 && r - i <8) {
				if (board.getBoard()[r-i][c-i].getTeam() != getTeam()) {
					int[]move = {r-i,c-i};
					moves.add(move);
				}
				if (board.getBoard()[r-i][c-i].getTeam() != -1) {
					break;
				}
			}
			
		}
		return moves;
	}
	@Override
	public boolean isEmpty() {
		
		return false;
	}
	@Override
	public boolean check(int kingr, int kingc, int r, int c, Board board) {
		ArrayList<int[]> moves = new ArrayList<int[]>();
		moves = getMoves(board,r,c);
		for (int[] cord : moves) {
			if (cord[0] == kingr && cord[1] == kingc) {
				return true;
			}
		}
		return false;
	}
}
