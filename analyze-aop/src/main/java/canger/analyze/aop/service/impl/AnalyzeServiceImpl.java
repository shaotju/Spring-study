package canger.analyze.aop.service.impl;

import canger.analyze.aop.service.AnalyzeService;

public class AnalyzeServiceImpl  implements AnalyzeService {
    public final int div(int a, int b) {
        System.out.println("AnalyzeService " + a + " divide by " +b);
        return a/b;
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("AnalyzeService " + a + " plus " +b);
        return a + b;
    }
}
