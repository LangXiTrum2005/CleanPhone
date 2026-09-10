package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class zzezr implements zzezv {
    private final Bundle zza;

    public zzezr(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzczmVar.zza.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzczmVar.zzb.putBundle("shared_pref", bundle);
    }
}
