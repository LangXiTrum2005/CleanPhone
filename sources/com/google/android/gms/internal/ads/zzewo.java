package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class zzewo implements zzezv {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzewo(String str, String str2, Bundle bundle, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        Bundle bundle2 = this.zzc;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
