package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdce extends zzdgi implements zzbmd {
    private final Bundle zzb;

    public zzdce(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzdcd.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
