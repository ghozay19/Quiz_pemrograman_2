package com.ghozay19.quizzzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by {$user} on 25/02/2019.
 * at 10:25
 * Copyright (c) 2019 Naghom Dev All rights reserved.
 */
public class SampleDataProvider {
    public static List<Model> dataItemList;
    public static Map<String, Model> dataItemMap;

    static {


        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();
        addItem(new Model("Balls", "ini Balls", 10000, "balls.jpg"));
        addItem(new Model("bengbeng", "ini bengbeng", 1000, "bengbeng.jpg"));
        addItem(new Model("Cheetos", "ini cheetos", 10000, "cheetos.jpg"));
        addItem(new Model("Coca Cola", "ini Coca Cola", 5000, "coca.png"));
        addItem(new Model("Fanta", "ini Fanta", 5000, "fanta.jpg"));
    }

    private static void addItem(Model item) {
        dataItemList.add(item);
        dataItemMap.put(item.getNama(), item);
    }
}
