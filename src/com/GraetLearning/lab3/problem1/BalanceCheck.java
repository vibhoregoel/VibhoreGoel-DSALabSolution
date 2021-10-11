package com.GraetLearning.lab3.problem1;

import java.util.Stack;

public class BalanceCheck {
	public boolean balanceChecking(String str) {
		Stack<Character> st = new Stack<>();
		char[] arr = str.toCharArray();
		char x;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				st.push(arr[i]);
				continue;
			}
			if (st.isEmpty())
				return false;

			switch (arr[i]) {
			case ')':
				x = st.pop();
				if (x == '{' || x == '[')
					return false;
				break;

			case '}':
				x = st.pop();
				if (x == '(' || x == '[')
					return false;
				break;

			case ']':
				x = st.pop();
				if (x == '{' || x == '(')
					return false;
				break;
			}
		}
		return st.isEmpty();
	}
}
