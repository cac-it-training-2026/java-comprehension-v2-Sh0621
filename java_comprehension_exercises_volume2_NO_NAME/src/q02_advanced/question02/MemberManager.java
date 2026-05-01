package q02_advanced.question02;

public class MemberManager {
	private MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(Member[] members) {
		for (Member m : members) {
			m.showMember();

		}

	}

	public static void updatePassword(Member[] members, int targetId, String newPassword) {
		boolean isNotExistMember = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				break;
			} else {
				isNotExistMember = true;
			}
		}
	}

}
