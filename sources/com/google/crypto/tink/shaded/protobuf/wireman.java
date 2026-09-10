package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f22390attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final boolean f22391dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?> f22392saneness = attabal("libcore.io.Memory");

    static {
        f22391dern = (f22390attabal || attabal("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> attabal(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean dern() {
        if (f22390attabal) {
            return true;
        }
        return (f22392saneness == null || f22391dern) ? false : true;
    }

    public static Class<?> saneness() {
        return f22392saneness;
    }
}
