package ie.dit;

public class Star
{
    private int hab;
    private String displayName;

    private float distance;
    
    private PVecter cooders;
    private float absMag;

    public Star(processing.data.TableRow row);
    {
        displayName = row.getString("Display Name");
    }
    public void sethub(int hab)
    {
        return hab;
        
    }

    public String getDistance(float distance)
    {
        return distance;
    }

    public void setCoords(float xG, float yG, float zG)
    {
        coords = new PVector(xG, yG, zG);
    }

    public Pvector getCoords()
    {
        return getCoords;
    }
}