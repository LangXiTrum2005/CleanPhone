package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzael implements zzaga {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzu(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzv(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i2));
        if (iZza != -1) {
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzw(zzer zzerVar, int i2, int i3) {
        zzerVar.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzx(long j, int i2, int i3, int i4, zzafz zzafzVar) {
    }
}
