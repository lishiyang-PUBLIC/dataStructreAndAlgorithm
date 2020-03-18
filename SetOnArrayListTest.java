package assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

import components.set.Set;
import components.set.Set1L;

public class SetOnArrayListTest {
	/**
	 * Creates and returns a Set under test, i.e. a set with dynamic type
	 * SetOnArrayList, populated with the given words.
	 * @author Shirley(Shiyang) Li, u1160160
	 * @param words Strings to populate the set with
	 * @return generated set with the proper dynamic type
	 */
	private Set<String> createFromArgsUUT(String... words) {
		Set<String> s = new SetOnArrayList<>();
		for (String w : words) {
			if (!s.contains(w)) {
				s.add(w);
			}
		}
		return s;
	}

	/**
	 * Creates and returns a Set for reference, i.e. a set with dynamic type Set1L,
	 * populated with the given words.
	 * 
	 * @param words Strings to populate the set with
	 * @return generated set with the proper dynamic type
	 */
	private Set<String> createFromArgsRef(String... words) {
		Set<String> s = new Set1L<>();
		for (String w : words) {
			if (!s.contains(w)) {
				s.add(w);
			}
		}
		return s;
	}

	@Test
	public final void testAddToEmpty() {
		// Creates and empty set s (SetOnArrayList)
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT();
		// Adds the string "red" to the empty set s
		s.add("red");
		// Creates a Set1L with a string "red" in it
		Set1L<String> sExpected = (Set1L)createFromArgsRef("red");
		// Checks if the two sets are equal
		assertEquals(s, sExpected);
	}

	@Test
	public final void testAddToNoDup() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley");
		s.add("Li");
		Set1L<String> sExpected = (Set1L)createFromArgsRef("Shirley", "Li");
		assertEquals(s,sExpected);
	}

	@Test
	public final void testAddToDup() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		try {
			s.add("Li");
		}
		catch(AssertionError e) {

		}
	}

	@Test
	public final void testAddNull() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley");
		try{
			s.add("null"); 
		}
		catch(AssertionError e) {

		}
	}

	@Test
	public final void testContainsNull() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley");
		try {
			s.contains(null);
		}
		catch(AssertionError e) {

		}
	}

	@Test
	public final void testContains() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		assertEquals(s.contains("Li"),true);
	}

	@Test
	public final void testContainsNot() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		assertEquals(s.contains("good"),false);
	}

	@Test
	public final void testRemoveNull() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		try {
			s.remove(null);
		}
		catch(AssertionError e) {

		}
	}

	@Test
	public final void testRemoveNotContains() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		try {
			s.remove("Lee");
		}
		catch(AssertionError e) {

		}
	}

	@Test
	public final void testRemove() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		Set1L<String> sExpected = (Set1L)createFromArgsRef( "Li");
		s.remove("Shirley");
		assertEquals(s, sExpected);
	}


	@Test
	public final void testEmptySize() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT();
		assertEquals(s.size(), 0);
	}

	@Test
	public final void testSize() {
		SetOnArrayList<String> s = (SetOnArrayList)createFromArgsUUT("Shirley", "Li");
		assertEquals(s.size(), 2);
	}
}
