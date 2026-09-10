package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwa {
    final /* synthetic */ zzfwb zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfwa(zzfwb zzfwbVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfwbVar);
        this.zza = zzfwbVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfwb zzfwbVar = this.zza;
            if (zzfwbVar.zzb) {
                zzfwe zzfweVar = zzfwbVar.zza;
                zzfweVar.zzg(this.zzb);
                zzfweVar.zzh(this.zzc);
                zzfweVar.zzi(this.zzd);
                zzfweVar.zzf(null);
                zzfweVar.zze();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }

    public final zzfwa zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzfwa zzc(int i2) {
        this.zzd = i2;
        return this;
    }
}
