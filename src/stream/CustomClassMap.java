package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomClassMap {
    Long id;
    String name;
    String add;

    public CustomClassMap(){}
    public CustomClassMap(Long id, String name, String add) {
        this.name = name;
        this.id = id;
        this.add = add;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public static void main(String[] args) {
        List<CustomClassMap> customClassMaps = new ArrayList<>();
        customClassMaps.add(new CustomClassMap(1L, "sd","df"));
        customClassMaps.add(new CustomClassMap(2L, "sdad","dfafs"));
        customClassMaps.add(new CustomClassMap(1L, "sdad","dfafs"));
        Map<Long, String> map = customClassMaps.stream().collect(Collectors.toMap(obj->obj.getId(),
                obj->obj.getName(),
                (existingVal, newVal)->newVal
        ));

        Map<Long, List<String>> map1 = customClassMaps.stream().collect(Collectors.groupingBy(obj->obj.getId(),
                Collectors.mapping(obj->obj.getName(), Collectors.toList())));
        System.out.println(map1);
    }
}
