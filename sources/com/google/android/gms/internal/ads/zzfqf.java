package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqf implements zzbde {
    final /* synthetic */ zzfqh zza;

    public zzfqf(zzfqh zzfqhVar) {
        Objects.requireNonNull(zzfqhVar);
        this.zza = zzfqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzz)).booleanValue()) {
            this.zza.zzj(z2);
        }
    }
}
