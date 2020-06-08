package pattern.domain;

public class XmlImpl implements XML {
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" ?>\n");
		sb.append("<pessoa>\n");
		sb.append("   <peso>55kg</peso>\n");
		sb.append("   <nome>Ana</nome>\n");
		sb.append("   <id>2</id>\n");
		sb.append("</pessoa>");
		return sb.toString();
	}
	
}
