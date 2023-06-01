package geekbrains.lesson5.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class TelephoneDirectory {
    private Map<String, List<String>> map;

    public TelephoneDirectory() {
        this.map = new LinkedHashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> strings = (ArrayList<String>) this.map.get(lastName);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phoneNumber);
            this.map.put(lastName, listOfPhones);
        } else {
            strings.add(phoneNumber);
            this.map.put(lastName, strings);
        }
    }

    public List<String> get(String lastName) {
       return this.map.get(lastName);
    }
}
