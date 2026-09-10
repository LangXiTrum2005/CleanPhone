package com.airbnb.lottie;

import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;

/* JADX INFO: loaded from: classes.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f9507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile NetworkFetcher f9508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile NetworkCache f9509c;

    public static void a() {
        int i2 = f9507a;
        if (i2 > 0) {
            f9507a = i2 - 1;
        }
    }
}
