package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface zzmk {
    static boolean zzaa(int i2, boolean z2) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z2 && i3 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar) throws zzit;

    int zzu() throws zzit;

    default void zzv(zzmj zzmjVar) {
    }

    default void zzw() {
    }
}
