package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private static String ik = "";
    private static int lr = 4;
    private static boolean ri = false;

    public static boolean ik() {
        return ri;
    }

    public static void lr() {
        ri = false;
        ri(7);
    }

    public static void ri(String str) {
        ik = str;
    }

    public static void ri(int i) {
        lr = i;
    }

    public static void ri() {
        ri = true;
        ri(3);
    }
}
