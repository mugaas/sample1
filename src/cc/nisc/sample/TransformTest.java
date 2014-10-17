package cc.nisc.sample;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by eric on 10/16/2014.
 */
public class TransformTest {

    static int counter = 0;

    public static void main(String[] args) {

        List<Phone> phones = Data.getLotsOfPhones();

        List<AnotherPhone> anotherPhoneList = Lists.transform(phones, new Function<Phone, AnotherPhone>() {
            @Override
            public AnotherPhone apply(Phone phone) {
                counter++;
                return new AnotherPhone(phone.getKey());
            }
        });

        System.out.println(anotherPhoneList.get(5));
        System.out.println(counter);
        doSomethingWithList(anotherPhoneList);
        System.out.println(counter);
        doSomethingWithList(anotherPhoneList);
        System.out.println(counter);


    }

    private static void doSomethingWithList(List<AnotherPhone> anotherPhoneList){
        for (AnotherPhone anotherPhone : anotherPhoneList){
//                anotherPhone.getKey();
//            System.out.println(anotherPhone.getKey());
        }
    }
}
