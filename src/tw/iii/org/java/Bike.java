package tw.iii.org.java;

public class Bike {
	double speed;
	int color ;
	//�غc���άۦP���O�W�٪�l��
	Bike(){
		color=3 ; 
	}
	Bike(int r){
		
		color=r ; 
	}

	void upspeed() {
      speed = (speed<1? 1:speed*1.2) ;
	}
	void upspeed(int gear) {
	      speed = (speed<1? 1:(speed*1.2+gear)) ;
		}
	void downspeed() {
	      speed = (speed<1? 0:speed*0.8) ;
		}
	void getspeed(){
		return ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mybike go ";
	}
	
}
