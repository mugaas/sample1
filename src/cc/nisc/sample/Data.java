package cc.nisc.sample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by eric on 10/13/2014.
 */
public class Data {

    static List<Phone> getLotsOfPhones(){
        LinkedList<Phone> phones = new LinkedList<Phone>();
        Phone.Type[] all = Phone.Type.values();
        for (int i=0; i<100; i++){
            phones.add(new Phone(all[i%all.length], i));
        }
        return phones;
    }
}
