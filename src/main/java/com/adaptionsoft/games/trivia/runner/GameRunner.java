
package com.adaptionsoft.games.trivia.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;

public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Random rand = new Random();
		playGame(rand);

	}

	public static void playGame(Random rand) {
		List<String> players = new ArrayList<String>();
		LinkedList<String> popQuestions = new LinkedList<String>();
		LinkedList<String> scienceQuestions = new LinkedList<String>();
		LinkedList<String> sportsQuestions = new LinkedList<String>();
		LinkedList<String> rockQuestions = new LinkedList<String>();
		Game aGame = new Game(players);
		aGame.addTo();
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}

		} while (notAWinner);
	}
}
