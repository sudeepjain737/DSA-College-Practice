package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTrail {

    HashMap<String,String >M1 = new HashMap<>();

    public void saveCountryCapital(String CountryName,String Capital){
        M1.put(CountryName,Capital);
    }

    public String getCapital(String CountryName){
            return M1.getOrDefault(CountryName,"Country Name Not Exist");
    }

    public String getCountry(String Capital){
        for(Map.Entry<String,String>e : M1.entrySet()){
            if(Capital.equals(e.getValue())) {
                return e.getKey();
            }
        }
        return "Invalid Capital";
    }

    public HashMap<String,String > mapSwapping(HashMap<String ,String > m1){
        HashMap<String,String>M2 = new HashMap<>();
        for(Map.Entry<String,String>e : m1.entrySet()){
            M2.put(e.getValue(),e.getKey());
        }
        return M2;
    }

    public ArrayList<String> keysArray(HashMap<String,String >m1){
        ArrayList<String>arr = new ArrayList<>();
        for(Map.Entry<String ,String >e : m1.entrySet()){
            arr.add(e.getKey());
        }
        return arr;
    }

    public static void main(String[] args) {
        HashMapTrail obj = new HashMapTrail();
        obj.saveCountryCapital("India","Delhi");
        obj.saveCountryCapital("Japan","Tokya");
        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokya"));
        System.out.println(obj. mapSwapping(obj.M1));
        System.out.println(obj.keysArray(obj.M1));
    }
}
