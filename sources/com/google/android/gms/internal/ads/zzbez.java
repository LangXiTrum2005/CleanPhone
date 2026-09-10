package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbez extends zzcdt {
    final /* synthetic */ zzbff zza;

    public zzbez(zzbff zzbffVar) {
        Objects.requireNonNull(zzbffVar);
        this.zza = zzbffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdt, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        this.zza.zzb();
        return super.cancel(z2);
    }
}
