package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyv implements zzezv {
    private final String zza;
    private final int zzb;

    public zzeyv(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        bundle.putString("request_id", this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzczm) obj).zzb.putString("request_id", this.zza);
    }
}
