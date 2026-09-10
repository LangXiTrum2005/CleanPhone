package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetr implements zzezx {
    private final zzgyw zza;
    private final VersionInfoParcel zzb;

    public zzetr(VersionInfoParcel versionInfoParcel, zzgyw zzgywVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzets zzc() {
        return zzets.zzc(this.zzb);
    }
}
