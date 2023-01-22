package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field: fields) {
            try {
                field.setAccessible(true);
                String value = (String)field.get(address);

                if (field.isAnnotationPresent(NotNull.class) && value == null) {

                    result.add(field.getName());
                }
             } catch (Exception e) {

            }


        }
        return result;


    }
}
// END
