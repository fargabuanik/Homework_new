package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		System.out.println("\n Regular class ColumbiaUniversity -\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.columbiaUniverstiyInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.gymnasium();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.lanauageClub();
		columbiaUniversity.morgue();
		columbiaUniversity.playGround();
		columbiaUniversity.surgeryRomm();
		columbiaUniversity.teacher();
		columbiaUniversity.lawInfo();
		columbiaUniversity.lawInfo1();
		System.out.println("\n interface class Univercity");
		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.lanauageClub();
		university.morgue();
		university.playGround();
		university.surgeryRomm();
		university.teacher();
		System.out.println("\nabstract class Medicalschol ");
		Medicalschool medicalschol = new ColumbiaUniversity();
		medicalschol.anatomyLab();
		medicalschol.biochemistryLab();
		medicalschol.caring();
		medicalschol.hygiene();
		medicalschol.lawInfo();	
		medicalschol.lawInfo1();
	}
}