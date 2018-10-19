package esrome.mcchoc.capabilities.thirst;

public class Thirst implements IThirst {

	private float thirst = 20.0F; 

	public void setThirst(float points) 
	{ 
		this.thirst = points; 
	} 

	public void addThirst(float points) 
	{ 
		this.thirst += points;
		
		if(this.thirst>20.0F){
			this.thirst = 20.0F;
		}
	} 

	public void subtractThirst(float points) 
	{ 
		this.thirst -= points;
		
		if(this.thirst<0.0F){
			this.thirst = 0.0F;
		}
	} 

	public float getThirst() 
	{ 
		return this.thirst; 
	} 

}
