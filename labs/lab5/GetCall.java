public class GetCall implements Call {
	HTTPConnection conn;
	String route;
	String method;

	public void setHttp(HTTPConnection conn) {
		this.conn = conn;
	}
	public void setRoute(String c) {
		route = c;
	}
	public void setMethod(String c) {
		method = c;
	}

	public String performCall() {
		String call = "[" + method + "]" + "http://" + conn.getAddress() + ":" + conn.getPort() + route + "/token=" + conn.getToken();

		System.out.println(call);

		return "{\"status\":200}";
	}
}