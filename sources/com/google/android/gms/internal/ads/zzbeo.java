package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbeo implements zzbde {
    final /* synthetic */ zzber zza;

    public zzbeo(zzber zzberVar) {
        Objects.requireNonNull(zzberVar);
        this.zza = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z2) {
        if (z2) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
