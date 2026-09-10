package com.google.common.primitives;

/* JADX INFO: compiled from: Booleans.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {
    public static int attabal(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static boolean saneness(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }
}
