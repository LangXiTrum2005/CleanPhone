package com.yolo.networklibrary.common.util;

import java.util.Random;

/* JADX INFO: compiled from: RandomUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Random f23960attabal = new Random();

    public static double attabal(double d, double d2) {
        kowloon.attabal(d2 >= d, "Start value must be smaller or equal to end value.", new Object[0]);
        kowloon.attabal(d >= 0.0d, "Both range values must be non-negative.", new Object[0]);
        return d == d2 ? d : d + ((d2 - d) * f23960attabal.nextDouble());
    }

    public static long saneness(long j, long j2) {
        kowloon.attabal(j2 >= j, "Start value must be smaller or equal to end value.", new Object[0]);
        kowloon.attabal(j >= 0, "Both range values must be non-negative.", new Object[0]);
        return j == j2 ? j : (long) attabal(j, j2);
    }
}
