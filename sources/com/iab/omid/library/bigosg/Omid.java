package com.iab.omid.library.bigosg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Omid {
    private static b INSTANCE = new b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.a(str);
    }
}
