package datas;

import java.util.List;

public class Teacher {

	private String id;
	private String nom;
	private String prenom;
	private List<String> types;
	private List<UE> ues;
	private String hour;
	private String date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<UE> getUes() {
		return ues;
	}

	public void setUes(List<UE> ues) {
		this.ues = ues;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void setUp(String id, String nom, String prenom, List<String> types, List<UE> ues, String hour, String date) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.types = types;
		this.ues = ues;
		this.hour = hour;
		this.date = date;
	}
	
	public boolean isEqual(String id, String nom, String prenom) {
		if(!isValid(id) && !isValid(nom) && !isValid(prenom)) {
			return false;
		}
		
		boolean idEqual = true;
		boolean nomEqual = true;
		boolean prenomEqual = true;
		if(isValid(id)) {
			idEqual = this.id.equals(id);
		}
		if(isValid(nom)) {
			nomEqual = this.nom.equals(nom);
		}
		if(isValid(prenom)) {
			prenomEqual = this.prenom.equals(prenom);
		}
		return idEqual && nomEqual && prenomEqual;
	}
	
	private boolean isValid(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		return true;
	}
	
	public String getTypesString() {
		String types = "";
		for (String type : this.types) {
			types += type;
			types += ", ";
		}
		return types.substring(0, types.length() - 2);
	}
	
	public String getUEsString() {
		String ues = "";
		for (UE ue : this.ues) {
			ues += ue.getId();
			ues += ", ";
		}
		return ues.substring(0, ues.length() - 2);
	}
	
	public String getFullName() {
		return nom + " " + prenom;
	}

}
