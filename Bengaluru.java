public class Bengaluru{
static String[] locations = {"Pune","Bengaluru","Hydrabad","Chennai"};
public static void main (String args[]){
for (int l=0; l<locations.length;l++){
if(locations[l]== "Bengaluru"){
System.out.println("Job Location is "+locations[l]+" Matches the preferred Location\n");
}
else
{
System.out.println("Job Location is "+locations[l]+" thus, does not Match the preferred Location\n");
}
}
}
}