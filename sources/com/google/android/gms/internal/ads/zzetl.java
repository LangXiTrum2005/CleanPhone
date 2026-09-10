package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetl implements zzezv {
    final String zza;
    final int zzb;

    public zzetl(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i2;
        Bundle bundle = ((zzczm) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i2 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfiz.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i2);
    }
}
