interface Call {
	void setHttp(HTTPConnection conn);
	void setRoute(String c);
	void setMethod(String c);
	String performCall();
}