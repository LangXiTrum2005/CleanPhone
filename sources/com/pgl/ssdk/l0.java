package com.pgl.ssdk;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2442a = -1;

    public static void a(int i) {
        f2442a = i;
    }

    public static String b() {
        int i = f2442a;
        if (i != 0) {
            return i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token";
        }
        return "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }

    public static String a() {
        int i = f2442a;
        if (i != 0) {
            return i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r";
        }
        return "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }
}
