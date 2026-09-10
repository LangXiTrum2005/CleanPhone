package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzedn implements zzgyj {
    final /* synthetic */ Context zza;

    public zzedn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        if (((Boolean) zzbic.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbfv.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbic.zzj.zze()).booleanValue()) {
            zzbfv.zze(this.zza);
        }
    }
}
