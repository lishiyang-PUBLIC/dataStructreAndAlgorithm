package assignment02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import components.set.AbstractSet;

/**
 * {@code Set<E>} represented as a {@code java.util.ArrayList<E>} with
 * implementation of primary methods.
 * 
 * @author Shirley (Shiyang) Li, u1160160
 *
 * @param <E> type of element
 */
public class SetOnArrayList<E> extends AbstractSet<E> {
	/*
	 * Private members
	 */
	/**
	 * Underlying ArrayList representation
	 */
	private List<E> rep;

	/**
	 * No-argument constructor; builds an empty set.
	 * 
	 */
	public SetOnArrayList() {
		rep = new ArrayList<E>();
	}

	public void clear() {
		rep = new ArrayList<E>();
	}

	@Override
	public void add(E x) { 
		assert x != null : "Violation of x is not null";
		assert !this.contains(x) : "Violation of x is in this";//

		rep.add(x);
	}

	@Override
	public boolean contains(E x) {
		assert x != null : "Violation of x is not null";

		for(int i = 0; i < rep.size(); i++) {
			if(x.equals(this.rep.get(i))) {
				return true;
			}
		}
		return false;
	}


	@Override
	public void remove(E x) {
		assert x != null : "Violation of x is not null";
		assert this.contains(x) : "Violation of x is in this";

		rep.remove(x);
	}

	@Override
	public int size() {
		return rep.size();
	}

	@Override
	public Iterator<E> iterator() {
		return this.rep.iterator();
	}

}
