package pattern.service;

import pattern.domain.JSON;

public class ConteudoService {
	
	private JSON json;
	
	public JSON get() {
		return json;
	}
	
	public void set(JSON json) {
		this.json = json;
	}
}
