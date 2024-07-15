package com.kh.model.vo;

public class User {
	
	private String nickName;
	
	private int score;
	
	public User(String name, int score) {
		nickName = name;
		this.score = score;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [nickName= " + nickName + ", score= " + score + "]";
	}

}
