package com.google.common.collect;

/* JADX INFO: compiled from: CollectPreconditions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lotta {
    public static void attabal(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static long dern(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }

    public static void marial(boolean z) {
        com.google.common.base.formularize.adultoid(z, "no calls to next() since the last call to remove()");
    }

    public static int saneness(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void wireman(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i);
    }
}
