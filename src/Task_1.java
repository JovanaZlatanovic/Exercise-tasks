import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		/*
		 * Write a program that draws a timeline on a YouTube video. The user enters the
		 * length of the video in seconds and the current time in the video, and the
		 * program draws the timeline by drawing the part that is viewed with asterisks
		 * and the rest with dashes. Timeline is a control that has exactly 100
		 * characters.
		  Execution example: Enter video length (s): 203 Enter the current
		 * video time (s): 20 (Explanation: If the video has 203s and we are at 20s, it
		 * means that 9.85% of the videos have been viewed (we will round it up to 9
		 * stars, the rest up to 100 are dashes)
		 ********* ----------------------------------------- --------------------------------------------------- 
		 * Convert times to minutes and seconds and place them below the display: Execution example:
		 * Enter video length (s): 203 Enter the current video time (s): 20
		 * (Explanation: If the video has 203s and we are at 20s, it means that 9.85% of
		 * the videos have been viewed (we will round it up to 9 stars, the rest up to
		 * 100 are dashes)
		********* --------------------------------------------------------------------------------------------
		 */
		Scanner s = new Scanner(System.in);

		String timeline = "";

		System.out.println("Enter the length of the video in seconds: ");
		int lenght = s.nextInt();

		System.out.println("Enter the current time in the video: ");
		int moment = s.nextInt();

		int percent = moment * 100 / lenght;

		int minutesFull = lenght / 60;
		int secondsFull = lenght % 60;

		int minutesMoment = (lenght - (lenght - moment)) / 60;
		int secondsMoment = (lenght - (lenght - moment)) % 60;

		for (int i = 0; i < 100; i++) {
			if (i <= percent) {
				timeline = timeline + "*";
			} else {
				timeline = timeline + "-";
			}
		}
		System.out.println(timeline);
		System.out.println(minutesMoment + ":" + secondsMoment + " / " + minutesFull + ":" + secondsFull);
	}

}
