package cc.nisc.sample;

/**
 * Created by eric on 10/13/2014.
 */
public class Phone {
    public enum Type{SMART_PHONE, BASIC_PHONE, SOMETHING_NEW_AND_COOL_THAT_YOUVE_NEVER_EVEN_HEARD_OF}

    private Type type;
    private Integer key;

    public Phone(Type type, Integer key) {
        this.type = type;
        this.key = key;
    }

    public Type getType() {
        return type;
    }

    public Integer getKey() {
        return key;
    }
}
