package cc.nisc.sample;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by eric on 10/13/2014.
 */
public class PredicateTest {

    static int counter = 0;


    public static void main(String[] args) {

        List<Phone> phones = Data.getLotsOfPhones();

        Iterable<Phone> smartPhones = (Iterables.filter(phones, new SmartPhones()));

        phones.clear();

        countCallsToPredicate(smartPhones);
    }



    private static void countCallsToPredicate(Iterable<Phone> smartPhones) {
        doSomethingWithPhone(smartPhones);
        doSomethingWithPhone(smartPhones);

        System.out.println(counter);
    }


    private static void doSomethingWithPhone(Iterable<Phone> phones){
        for (Phone phone : phones){
            System.out.println(phone.getKey());
        }
    }



    private static class SmartPhones implements Predicate<Phone> {

        @Override
        public boolean apply(Phone phone) {
            counter++;
            if(Phone.Type.SMART_PHONE.equals(phone.getType())){
                return true;
            }else {
                return false;
            }

        }
    }
}
