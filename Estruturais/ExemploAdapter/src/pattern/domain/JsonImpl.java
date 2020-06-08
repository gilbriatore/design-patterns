package pattern.domain;

public class JsonImpl implements JSON {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\"pessoa\": {\n");
  	    sb.append("   \"peso\": \"70kg\"\n");
		sb.append("   \"nome\": \"Paulo\"\n");
		sb.append("   \"id\": 1\n");
		sb.append("}}");
		return sb.toString();
	}
}
