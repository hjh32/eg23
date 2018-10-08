package datas;

import java.util.ArrayList;
import java.util.List;

public class GlobalObjects {

	public static List<Teacher> teachers = new ArrayList<Teacher>();
	public static List<UE> ues = new ArrayList<UE>();
	
	
	public static void setUpObjects() {
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		Teacher teacher3 = new Teacher();
		UE ue1 = new UE();
		UE ue2 = new UE();
		UE ue3 = new UE();
		UE ue4 = new UE();
		
		List<String> types1 = new ArrayList<String>();
		types1.add("Contractuel");
		types1.add("Professeur");
		List<UE> ues1 = new ArrayList<UE>();
		ues1.add(ue1);
		ues1.add(ue2);
		teacher1.setUp("1", "MARTIN", "Jean", types1, ues1, "2000", "01/01/2010");
		
		List<String> types2 = new ArrayList<String>();
		types2.add("Contractuel");
		types2.add("Maitre de conferences");
		List<UE> ues2 = new ArrayList<UE>();
		ues2.add(ue3);
		teacher2.setUp("2", "MARTIN", "Philippe", types2, ues2, "2200", "01/07/2009");
		
		List<String> types3 = new ArrayList<String>();
		types3.add("Contractuel");
		types3.add("Prag");
		List<UE> ues3 = new ArrayList<UE>();
		ues3.add(ue4);
		teacher3.setUp("3", "BERNARD", "Jean", types3, ues3, "2400", "01/01/2009");
		
		List<UEStatistic> stats = new ArrayList<UEStatistic>();
		UEStatistic stat1 = new UEStatistic();
		stat1.setUp("2017", 10, 20, 30, 30, 20, 10, 5, 5);
		UEStatistic stat2 = new UEStatistic();
		stat2.setUp("2016", 5, 15, 40, 40, 30, 3, 2, 1);
		stats.add(stat1);
		stats.add(stat2);
		ue1.setUp("LO12", "CS", teacher1, stats);
		ue2.setUp("NF16", "CS", teacher1, stats);
		ue3.setUp("LO02", "TM", teacher2, stats);
		ue4.setUp("EG23", "TM", teacher3, stats);
		
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		ues.add(ue1);
		ues.add(ue2);
		ues.add(ue3);
		ues.add(ue4);
	}
	
}
