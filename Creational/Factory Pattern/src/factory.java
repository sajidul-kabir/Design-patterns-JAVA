public class factory {
    public transport getTransport(String vehicle){
        if(vehicle.equalsIgnoreCase("ship")){
            return new ship();
        }
        else if(vehicle.equalsIgnoreCase("truck")){
            return new truck();
        }
        else return null;

    }
}
