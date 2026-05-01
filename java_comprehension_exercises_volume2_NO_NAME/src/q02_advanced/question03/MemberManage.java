package q02_advanced.question03;

public class MemberManage {

	private MemberManage() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(Member[] members, int targetId, String newPassword) {

		for (Member m : members) {
			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				return;
			}

		}

	}
}
