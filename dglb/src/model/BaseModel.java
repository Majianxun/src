package model;
import java.io.Serializable;

public class BaseModel implements Serializable {
	
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
