package com.kamesh;

public class AnwserCall {
	public boolean answerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(!isMorning && !isMom && !isAsleep) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		AnwserCall ac = new AnwserCall();
		System.out.println(ac.answerCall(false, false, false));	
		System.out.println(ac.answerCall(false, false, true));	
		System.out.println(ac.answerCall(true, false, false));	
	}

}
