package com.swag.myapp;

public class LegacySubClass extends BaseHandler {
    @Override
    public void process() {
        throw new UnsupportedOperationException("Not supported");
    }
}

abstract class BaseHandler {
    public abstract void process();
}