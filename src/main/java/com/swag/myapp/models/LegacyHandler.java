package com.swag.myapp.models;

import java.util.Hashtable;
import java.util.Vector;

public class LegacyHandler {
    public void useOldStuff() {
        Hashtable<String, String> table = new Hashtable<>(); // ❌ Deprecated API
        Vector<String> list = new Vector<>(); // ❌ Deprecated API
        Thread t = new Thread(() -> System.out.println("Running")); // ❌ Raw Thread
        t.start();
    }
}
