package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeud implements zzezv {
    private final double zza;
    private final boolean zzb;

    public zzeud(double d, boolean z2) {
        this.zza = d;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        Bundle bundleZza = zzfiz.zza(bundle, d9.h.G);
        bundle.putBundle(d9.h.G, bundleZza);
        Bundle bundleZza2 = zzfiz.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
