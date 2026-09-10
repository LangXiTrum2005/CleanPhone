package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpt implements zzbde {
    final /* synthetic */ zzfpu zza;

    public zzfpt(zzfpu zzfpuVar) {
        Objects.requireNonNull(zzfpuVar);
        this.zza = zzfpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzz)).booleanValue()) {
            this.zza.zzl(z2);
        }
    }
}
