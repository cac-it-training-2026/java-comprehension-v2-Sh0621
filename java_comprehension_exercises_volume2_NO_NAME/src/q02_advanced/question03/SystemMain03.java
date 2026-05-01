package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		ConsoleReader cr = new ConsoleReader();
		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		Member loginUser = null;

		while (!isLogin) {

			int inputId;
			String inputPassword;

			try {
				System.out.print("input id>>");
				inputId = cr.inputNumber();

				System.out.print("input password>>");
				inputPassword = cr.inputString();

			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
				continue;

			} catch (Exception e) {
				e.printStackTrace();
				return;
			}

			// ログイン処理
			loginUser = loginService.doLogin(inputId, inputPassword);

			if (loginUser == null) {
				System.out.println("ID またはパスワードが違っています。再度入力してください。");
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		System.out.println(loginUser);
	}

}
