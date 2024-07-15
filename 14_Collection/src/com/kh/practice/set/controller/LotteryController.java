package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	// 추첨 대상을 담을 HashSet 객체 생성(lottery)
	// 당첨 대상을 담을 HashSet 객체 생성(win)

	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();

	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		
		return lottery.add(l);
		
	}

	public boolean deleteObject(Lottery l) {
		// 전달 받은 l을 lottery에서 삭제
		boolean removed = lottery.remove(l);
		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		// 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		if (removed && win != null) {
			win.remove(l);
		}
		return removed;
	}

	public HashSet winObject() {
		if (lottery.size() < 4) {
			System.out.println("추첨 대상자가 부족합니다.");
			return null;
		}
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		ArrayList lotteryList = new ArrayList(lottery); // lotteryList.addAll(lottery)

		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 4명만 뽑히지 않음


		// 인덱스를 이용해 win에 당첨자 저장
		while (lotteryList.size() < 4) {
			int randomIndex = (int) (Math.random() * lotteryList.size());
			win.add(lotteryList.get(randomIndex));
		}

		// TODO : 로직필요없음..?
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면 --> 추첨자 목록에는 없는데 당첨 목록에는 있는
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움


		return win;
	}

	public TreeSet sortedWinObject() {
		
		// 정렬기준을 가지고 정렬된 결과를 반환
		TreeSet<Lottery> sortedWin = new TreeSet<>();
		sortedWin.addAll(win);
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함

		return sortedWin;
	}

	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		return win.contains(l);
	}
}
