package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member m1 = new Member();

		m1.setName(null);
		m1.setAge(0);
		m1.setRank(0);

		Member m2 = new Member("Miura Manabu", 28, 2);

		m1.showMember();
		m2.showMember();

	}

}
