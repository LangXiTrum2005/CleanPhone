package com.airbnb.lottie.utils;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LogcatLogger f9943a = new LogcatLogger();

    public static void a() {
        f9943a.getClass();
    }

    public static void b(String str) {
        f9943a.getClass();
        HashSet hashSet = LogcatLogger.f9942a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f9943a.getClass();
        HashSet hashSet = LogcatLogger.f9942a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
