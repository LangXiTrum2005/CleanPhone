package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesq implements zzezv {
    private final Bundle zza;

    public zzesq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzczmVar.zza.putBundle("installed_adapter_data", bundle);
    }
}
