package P4;

public class EDevice {
	int clock_frequency;
	String core;
	public void set_freq(int a)
	{
		clock_frequency =a;
	}
	public void set_core(String b)
	{
		core=b;
	}
	public void System_info()
	{
		System.out.println("My laptop has" +core+"with operating speed"+clock_frequency+"GHZ");
		
	}

}
class laptop extends EDevice{
	public void speciality()
	{
	specialities sp= new specialities();
	sp.extra_features();
}
}
class specialities
{
	public void extra_features()
	{
		System.out.println("My laptop also have touch screen and HDMI Port");
	}
}