
public class Sonos implements Sample{


    public int lowestValue(int[] lowValue){
        if(lowValue == null)
            return 0;
        else{
            int counter = lowValue[0];
        for(Object element :lowValue){
         if(counter >= (Integer)element)
             counter = (Integer)element;
         else
             continue;
        }
         return counter;
        }
    }
    public int secondlowest(int[] secondValue) {
        if(secondValue == null){
            return 0;
        }
        else {
        int[] counter = new int[2];
        int number = 0;
        counter[0] = secondValue[0];
        counter[1] = secondValue[1];
        for (Object element: secondValue) {
            if(counter[0] >= (Integer)element)
                counter[0] = (Integer)element;
            else
                if(counter[1] >= (Integer)element && counter[0] <= counter[1])
                     number = (Integer)element;
                else
                    continue;
        }
        return number;
       }
    }
}
