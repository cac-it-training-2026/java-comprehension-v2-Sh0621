package q02_advanced.question02;

import java.io.IOException;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();

		Member m1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		Member[] members = { m1, m2 };

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);
		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPassword;

		try {
			System.out.print("input target id>>");
			targetId = cr.inputNumber();

			System.out.print("input new password>>");
			newPassword = cr.inputString();

		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPassword);

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}

}
