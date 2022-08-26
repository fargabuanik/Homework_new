package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
	System.out.println("Raglur class CoiumbiaUniversity");
	CoiumbiaUniversity coiumbiaUniversity = new CoiumbiaUniversity();
	coiumbiaUniversity.coiumbiaUniverstiyInfo();
	coiumbiaUniversity.anatomyLab();
	coiumbiaUniversity.biochemistryLab();
	coiumbiaUniversity.biology();
	coiumbiaUniversity.cafeteria();
	coiumbiaUniversity.caring();
	coiumbiaUniversity.classSize();
	coiumbiaUniversity.commonRoom();
	coiumbiaUniversity.dorm();
	coiumbiaUniversity.emergencyRoom();
	coiumbiaUniversity.gymnasium();
	coiumbiaUniversity.hygiene();
	coiumbiaUniversity.laboratory();
	coiumbiaUniversity.lanauageClub();
	coiumbiaUniversity.morgue();
	coiumbiaUniversity.playGround();
	coiumbiaUniversity.surgeryRomm();
	coiumbiaUniversity.teacher();
	coiumbiaUniversity.lowInfo();
	
	System.out.println("interface Univetsity");
	Univetsity univetsity = new Univetsity() {
		
		@Override
		public void surgeryRomm() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void emergencyRoom() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void cafeteria() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lanauageClub() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void laboratory() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void commonRoom() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void teacher() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void playGround() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void classSize() {
			// TODO Auto-generated method stub
			
		}
	};
	
}
}
