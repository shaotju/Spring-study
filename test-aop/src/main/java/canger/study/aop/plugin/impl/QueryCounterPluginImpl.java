package canger.study.aop.plugin.impl;

import canger.study.aop.plugin.QueryCounterPlugin;

public class QueryCounterPluginImpl implements QueryCounterPlugin {
    private int counter = 0;
    @Override
    public int queryCount() {
        counter++;
        System.out.println("The " + counter + " query");
        return counter;
    }

    @Override
    public void printCounter() {
        System.out.println("The " + counter + " query");
    }
}
