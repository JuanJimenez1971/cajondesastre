package com.pgrsoft.cajondesastre.interfacesfuncionales;

import java.util.Comparator;

public class CompardorString implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}
