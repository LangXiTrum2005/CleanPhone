package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexr implements zzezv {
    public final Bundle zza;

    public zzexr(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        Bundle bundleZza = zzfiz.zza(bundle, d9.h.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(d9.h.G, bundleZza);
    }
}
