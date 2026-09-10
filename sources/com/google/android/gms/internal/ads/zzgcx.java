package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzgcx implements zzgxu {
    static final /* synthetic */ zzgcx zza = new zzgcx();

    private /* synthetic */ zzgcx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        final zzgct zzgctVar = (zzgct) obj;
        return zzgym.zzk(zzgctVar.zzb(), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgcy
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj2) {
                return zzgctVar;
            }
        }, zzgzd.zza());
    }
}
