package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("Miura Manabu");
		m.setAge(30);
		m.setRank(1);
		;

		m.showMember();
		m.rankUp();

	}
}
