package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.ne;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfak implements zzezv {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfak(String str, int i2, int i3, int i4, boolean z2, int i5) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z2;
        this.zzf = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        String str = this.zza;
        zzfiz.zzb(bundle, ne.O0, str, !TextUtils.isEmpty(str));
        int i2 = this.zzb;
        zzfiz.zzc(bundle, "cnt", i2, i2 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzfiz.zza(bundle, d9.h.G);
        bundle.putBundle(d9.h.G, bundleZza);
        Bundle bundleZza2 = zzfiz.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
