package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyo implements zzezv {
    private final Bundle zza;

    public zzeyo(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bundle != null) {
            zzczmVar.zza.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bundle != null) {
            zzczmVar.zzb.putAll(bundle);
        }
    }
}
