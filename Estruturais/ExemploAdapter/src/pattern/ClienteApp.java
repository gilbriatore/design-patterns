package pattern;

import pattern.domain.JSON;
import pattern.domain.JsonImpl;
import pattern.domain.XML;
import pattern.domain.XmlImpl;
import pattern.service.ConteudoService;

public class ClienteApp {
	
	
	public static void main(String[] args) {
		
		ConteudoService service = new ConteudoService();
		
		JSON json = new JsonImpl();
		XML xml = new XmlImpl();
//		XMLAdapter adapter = new XMLAdapter(xml);

		System.out.println(xml);
		System.out.println();
		
		service.set(json);
		System.out.println(service.get());
		System.out.println();
		
//		service.set(adapter);
//		System.out.println(endPoint.get());
	}
}
