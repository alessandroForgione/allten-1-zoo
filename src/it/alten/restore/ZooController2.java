package it.alten.restore;

import it.alten.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ZooController2 {

    public ZooController2(ArrayList<Lion> lions, List<Tiger> tigers, List<Eagle> eagles){
        this.lions = lions;
        this.tigers = tigers;
        this.eagles = eagles;
    }

    public Lion getMaxLionHeight(){
        Lion maxLion = lions.get(0);

        for(Lion l: lions){
            if(l.getHeight()>=maxLion.getHeight()){
                maxLion = l;
            }
        }

        return maxLion;
    }

    public Lion getMinLionHeight(){
        Lion minLion = lions.get(0);

        for(Lion l: lions){
            if(l.getHeight()<=minLion.getHeight()){
                minLion = l;
            }
        }

        return minLion;
    }

    public Tiger getMaxTigerHeight(){
        Tiger maxTiger = tigers.get(0);

        for(Tiger t: tigers){
            if(t.getHeight()>=maxTiger.getHeight()){
                maxTiger = t;
            }
        }

        return maxTiger;
    }

    public Tiger getMinTigerHeight(){
        Tiger minTiger = tigers.get(0);

        for(Tiger t: tigers){
            if(t.getHeight()<=minTiger.getHeight()){
                minTiger = t;
            }
        }

        return minTiger;
    }

    public Eagle getMaxEagleHeight(){
        Eagle maxEagle = eagles.get(0);

        for(Eagle e: eagles){
            if(e.getHeight()>=maxEagle.getHeight()){
                maxEagle = e;
            }
        }

        return maxEagle;
    }

    public Eagle getMinEagleHeight(){
        Eagle minEagle = eagles.get(0);

        for(Eagle e: eagles){
            if(e.getHeight()<=minEagle.getHeight()){
                minEagle = e;
            }
        }

        return minEagle;
    }

    public Lion getMaxLionWeight(){
        Lion maxLion = lions.get(0);

        for(Lion l: lions){
            if(l.getWeight()>=maxLion.getWeight()){
                maxLion = l;
            }
        }

        return maxLion;
    }

    public Lion getMinLionWeight(){
        Lion minLion = lions.get(0);

        for(Lion l: lions){
            if(l.getWeight()<=minLion.getWeight()){
                minLion = l;
            }
        }

        return minLion;
    }

    public Tiger getMaxTigerWeight(){
        Tiger maxTiger = tigers.get(0);

        for(Tiger t: tigers){
            if(t.getWeight()>=maxTiger.getWeight()){
                maxTiger = t;
            }
        }

        return maxTiger;
    }

    public Tiger getMinTigerWeight(){
        Tiger minTiger = tigers.get(0);

        for(Tiger t: tigers){
            if(t.getWeight()<=minTiger.getWeight()){
                minTiger = t;
            }
        }

        return minTiger;
    }

    public Eagle getMaxEagleWeight(){
        Eagle maxEagle = eagles.get(0);

        for(Eagle e: eagles){
            if(e.getWeight()>=maxEagle.getWeight()){
                maxEagle = e;
            }
        }

        return maxEagle;
    }

    public Eagle getMinEagleWeight(){
        Eagle minEagle = eagles.get(0);

        for(Eagle e: eagles){
            if(e.getWeight()<=minEagle.getWeight()){
                minEagle = e;
            }
        }

        return minEagle;
    }

    public Mammifero getMammiferoWithMaxCoda(){
        Mammifero mammifero = lions.get(0);

        for(Mammifero m: lions){
            if(m.getTail()>=mammifero.getTail()){
                mammifero = m;
            }
        }

        for(Mammifero m: tigers){
            if(m.getTail()>=m.getTail()){
                mammifero = m;
            }
        }

        return mammifero;
    }

    public Volatile getVolatileWithMaxCoda(){
        Volatile v = eagles.get(0);
        for(Eagle e: eagles){
            if(e.getWings()>=v.getWings()){
                v = e;
            }
        }

        return v;
    }

    private List<Lion> lions;
    private List<Tiger> tigers;
    private List<Eagle> eagles;
}
