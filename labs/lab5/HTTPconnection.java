public class HTTPConnection {
	private String address;
	private String port;
	private String token;

	private static HTTPConnection connection;

	private HTTPConnection(Builder builder) {
		this.address = builder.address;
		this.port = builder.port;
		this.token = builder.token;
	}

	public static HTTPConnection getConnection(String address, String port, String token) {
		if (connection == null) {
			connection = HTTPConnection.builder().
				setAddress(address).
				setPort(port).
				setToken(token).
				build();
			return connection;
		}
		return connection;
	}

	public String getAddress() {
		return address;
	}

	public String getPort() {
		return port;
	}

	public String getToken() {
		return token;
	}

	public String toString() {
		return address + " " + token + " " + port;
	}

	public static Builder builder() {
		if (connection != null) {
			throw new IllegalStateException("Builder created");
		}
		return new Builder();

	}

	public static class Builder {
		private String address;
		private String port;
		private String token;

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setPort(String port) {
			this.port = port;
			return this;
		}

		public Builder setToken(String token) {
			this.token = token;
			return this;
		}

		public HTTPConnection build() {
			return new HTTPConnection(this);
		}
	}

}


