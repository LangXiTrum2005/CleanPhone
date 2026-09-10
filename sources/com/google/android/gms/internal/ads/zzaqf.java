package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqf {
    public final int zza;
    public final long zzb;

    private zzaqf(int i2, long j) {
        this.zza = i2;
        this.zzb = j;
    }

    public static zzaqf zza(zzaep zzaepVar, zzer zzerVar) throws IOException {
        zzaepVar.zzi(zzerVar.zzi(), 0, 8);
        zzerVar.zzh(0);
        return new zzaqf(zzerVar.zzB(), zzerVar.zzA());
    }
}
