package assignment02;

import java.util.Random;

import components.set.Set;
import components.set.Set1L;
import components.set.Set2;
import components.set.Set3;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.stopwatch.Stopwatch;
import components.stopwatch.Stopwatch1;

/**
 * CS 2420 / Fall 2019 / Lab 01 - Analyzing Set methods by running timing
 * experiments and plotting graphs.
 * 
 * @author Swaroop Joshi
 *
 */
public class SetPerformance {

	/**
	 * A pseudo-random number generator.
	 */
	private static Random rnd;
	/**
	 * Timer to calculate time elapsed between two points in the program.
	 */
	private static Stopwatch timer;
	/**
	 * A constant for 1000, used to convert nanoseconds to microseconds.
	 */
	private final static int THOUSAND = 1;

	/**
	 * Adds the given number of random integers to the given set {@code numTrials}
	 * number of times and returns the average time taken in microseconds.
	 * 
	 * @param s         Set to which the random integers are added
	 * @param howMany   number of random integers to be added
	 * @param numTrials number of trials of this experiment
	 * @return time taken in microseconds
	 * 
	 * @modifies s
	 */
	private static long addExperiment(Set<Integer> s, int howMany, int numTrials) {
		long accumulatedTime = 0;
		for (int i = 0; i < numTrials; i++) {
			timer.reset(); // reset the stopwatch
			timer.start(); // start the stopwatch
			s.clear();
			addRandomIntsToSet(s, howMany); // operation to be timed
			timer.stop(); // stop the stopwatch
			accumulatedTime += timer.elapsed() / THOUSAND;
		}
		return accumulatedTime / numTrials;
	}

	/**
	 * Adds {@code n} random integers to the {@code Set s}.
	 * 
	 * @param s set to which the integers are added
	 * @param n number of integers to add
	 * @modifies s
	 */
	private static void addRandomIntsToSet(Set<Integer> s, int n) {
		for (int i = 0; i < n; i++) {
			int x = rnd.nextInt();
			if(!s.contains(x)) {
				s.add(x);
			}
		}
	}

	/**
	 * Searches the given number of random integers in the set {@code s} and returns
	 * the average time taken in microseconds.
	 * 
	 * @param s       Set to which the random integers are added
	 * @param howMany number to be searched
	 * @return time taken in nanoseconds
	 * 
	 */
	private static long searchExperiment(Set<Integer> s, int howMany) {
		long accumulatedTime = 0;

		for (int i = 0; i < howMany; i++) {
			int x = rnd.nextInt();
			timer.reset(); // reset the stopwatch
			timer.start(); // start the stopwatch
			s.contains(x); // operation to be timed
			timer.stop(); // stop the stopwatch
			accumulatedTime += timer.elapsed() / THOUSAND;
		}
		return accumulatedTime / howMany;
	}

	/**
	 * The main method.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		final int numTrials = 50;

		rnd = new Random(); // random number generator
		timer = new Stopwatch1(); // timer to record running times of different operations

		SimpleWriter out = new SimpleWriter1L();

		// various values of number of items
		final int[] items = { 10, 20, 50, 75, 100, 1000, 5000, 10000, 50000};

		SetOnArrayList<Integer> s;
		out.println("Add Expt -------");
		out.println("n,SetOnArrayList");
		for (int i = 0; i < items.length; i++) {
			int n = items[i];
			out.print(n);

			s = new SetOnArrayList<>(); // this experiment runs on a Set1L instance
			out.print(", " + addExperiment(s, n, numTrials));

			out.println();
		}

		out.println();

		// TODO: Add the search experiments code here *after* you are done graphing the
		// addExperiment results

		out.println("Search  Expt  -------");
		out.println("n,SetOnArrayList");
		for (int i = 0; i < items.length; i++) {
			int n = items[i];
			out.print(n);
			s = new SetOnArrayList <>(); // this  experiment  runs on a Set1L  instance
			addRandomIntsToSet(s, n); // this is not  timed
			out.print(", " + searchExperiment(s, numTrials ));
			out.println ();}

		out.close();
	}

}
