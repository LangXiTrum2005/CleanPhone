package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface zzaga {
    void zzu(zzv zzvVar);

    int zzv(zzj zzjVar, int i2, boolean z2, int i3) throws IOException;

    void zzw(zzer zzerVar, int i2, int i3);

    void zzx(long j, int i2, int i3, int i4, zzafz zzafzVar);

    default int zzy(zzj zzjVar, int i2, boolean z2) throws IOException {
        return zzv(zzjVar, i2, z2, 0);
    }

    default void zzz(zzer zzerVar, int i2) {
        zzw(zzerVar, i2, 0);
    }
}
