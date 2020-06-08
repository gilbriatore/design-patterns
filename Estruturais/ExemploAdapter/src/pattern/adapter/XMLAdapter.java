package pattern.adapter;

import org.json.JSONException;
import org.json.JSONObject;

import pattern.domain.JSON;
import pattern.domain.XML;

public class XMLAdapter implements JSON {
	
	private StringBuilder conteudo;
	
	public XMLAdapter(XML xml) {
	
		try {
        
			JSONObject jsonObj = org.json.XML.toJSONObject(xml.toString());
            String json = jsonObj.toString(3);
    		this.conteudo = new StringBuilder();
    		this.conteudo.append(json);
        
		} catch (JSONException je) {
            System.out.println(je.toString());
        }
	}

	@Override
	public String toString() {
		return conteudo.toString();
	}
	
}
