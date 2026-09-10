package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfn {
    final /* synthetic */ zzbfo zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbfn(zzbfo zzbfoVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbfoVar);
        this.zza = zzbfoVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbfo zzbfoVar = this.zza;
            if (zzbfoVar.zzb) {
                zzbfoVar.zza.zzh(this.zzb);
                zzbfoVar.zza.zzi(0);
                zzbfoVar.zza.zzj(this.zzc);
                zzbfoVar.zza.zzg(null);
                zzbfoVar.zza.zzf();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e2);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbfn zzb(int i2) {
        this.zzc = i2;
        return this;
    }
}
