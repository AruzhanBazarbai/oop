public class ApplicationLab5 {
	public static void main(String[] args) {
		HTTPConnection conn = HTTPConnection.getConnection("10.10.0.10", "8000", "qwewqewe");
		HTTPConnection conn1 = HTTPConnection.getConnection("10.10.0.11", "8080", "qwewqewe");

		Call call = new GetCall();
		call.setHttp(conn);
		call.setRoute("/blog/posts");
		call.setMethod("GET");

		System.out.println(conn);
		System.out.println(conn1);
		System.out.println(makeCall(call));
	}

	public static String makeCall(Call call) {
		return call.performCall();
	}
}