package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexx implements zzezx {
    private final zzgyw zza;
    private final zzfik zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzexx(zzgyw zzgywVar, zzfik zzfikVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgywVar;
        this.zzb = zzfikVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzexy zzc() {
        return new zzexy(this.zzb, this.zzc, this.zzd);
    }
}
