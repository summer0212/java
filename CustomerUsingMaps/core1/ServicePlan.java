package core1;

public enum ServicePlan 
{
    
    SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
    private int adtnCharges;//name(),ordinal()

    private ServicePlan(int adtnCharges)
    {
        this.adtnCharges=adtnCharges;
    }

    public int getPlanForAddtnCharges()
    {
        return adtnCharges;
    }

    @Override// because the Object class function will return the hashcode version and we want the name.
    public String toString()
    {
        return name() +" "+ adtnCharges;
    }
   
}
    
    

