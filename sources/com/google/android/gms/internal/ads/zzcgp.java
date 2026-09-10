package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgp extends com.google.android.gms.ads.internal.util.zzb {
    final zzcfk zza;
    final zzcgx zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcgp(zzcfk zzcfkVar, zzcgx zzcgxVar, String str, String[] strArr) {
        this.zza = zzcfkVar;
        this.zzb = zzcgxVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgn(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcA)).booleanValue() && (this.zzb instanceof zzchg)) ? zzcdo.zzf.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
