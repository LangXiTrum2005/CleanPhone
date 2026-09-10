package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f10338a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10339b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10340c;

    public static MonitorCrash a() {
        if (f10338a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f10338a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f10338a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f10339b == -1) {
            f10339b = 5;
        }
        int i2 = f10340c;
        if (i2 < f10339b) {
            f10340c = i2 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
