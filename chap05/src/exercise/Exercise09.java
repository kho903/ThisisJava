package exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.printf("학생 수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					max = (max < scores[i]) ? scores[i] : max;
				}
				avg = (double) sum / studentNum;
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("평균 점수 : %.1f\n", avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
