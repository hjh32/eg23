package datas;

import java.util.List;

public class UE {

	private String id;
	private String description;
	private Teacher teacher;
	private List<UEStatistic> statistics;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<UEStatistic> getStatistics() {
		return statistics;
	}

	public void setStatistics(List<UEStatistic> statistics) {
		this.statistics = statistics;
	}
	
	public void setUp(String id, String description, Teacher teacher, List<UEStatistic> statistics) {
		this.id = id;
		this.description = description;
		this.teacher = teacher;
		this.statistics = statistics;
	}
	
	public boolean isEqual(String id, String description) {
		if(!isValid(id) && !isValid(description)) {
			return false;
		}
		
		boolean idEqual = true;
		boolean descriptionEqual = true;
		if(isValid(id)) {
			idEqual = this.id.equals(id);
		}
		if(isValid(description)) {
			descriptionEqual = this.description.equals(description);
		}
		return idEqual && descriptionEqual;
	}
	
	private boolean isValid(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		return true;
	}

}
