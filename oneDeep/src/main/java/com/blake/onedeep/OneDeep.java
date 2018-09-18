package com.blake.onedeep;

import com.blake.twodeep.TwoDeep;

public class OneDeep {
	public OneDeep() {
		TwoDeep t = new TwoDeep();

		System.out.println(t);
	}

	@Override
	public String toString() {
		return "OneDeep";
	}
}
