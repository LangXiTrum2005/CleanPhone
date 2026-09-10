package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesx implements zzezv {
    private final String zza;
    private final boolean zzb;

    public zzesx(String str, boolean z2) {
        this.zza = str;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (str != null) {
            Bundle bundleZza = zzfiz.zza(zzczmVar.zza, "pii");
            bundleZza.putString("afai", str);
            bundleZza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
