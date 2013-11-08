package com.wjsams.javasandbox.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopOverHashMapTest {

    @Rule
    public MethodRule watchman = new TestWatchman() {
        public void starting(FrameworkMethod method) {
            System.out.println("Starting test: " + method.getName());
        }
    };

    @Test
    public void simpleForLoop() {
        Map<String, String> map = new HashMap<>();
        map.put("entry1", "Testing entry1");
        map.put("entry2", "Testing entry2");
        map.put("entry3", "Testing entry3");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + " value = " + value);
        }
    }

    @Test
    public void loopWithIterator() {
        Map<String, String> map = new HashMap<>();
        map.put("entry1", "Testing entry1");
        map.put("entry2", "Testing entry2");
        map.put("entry3", "Testing entry3");

        List<String> arrayList = new ArrayList<>(map.keySet());

        ListIterator<String> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("key = " + key + " value = " + value);
        }
    }

    @Test
    public void loopWithIteratorInReverseOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("entry1", "Testing entry1");
        map.put("entry2", "Testing entry2");
        map.put("entry3", "Testing entry3");

        List<String> arrayList = new ArrayList<>(map.keySet());

        ListIterator<String> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()) {
            String key = iterator.previous();
            String value = map.get(key);
            System.out.println("key = " + key + " value = " + value);
        }
    }
}
