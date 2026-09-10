package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfas implements zzezv {
    final String zza;
    final int zzb;

    public /* synthetic */ zzfas(String str, int i2, byte[] bArr) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzczm zzczmVar = (zzczm) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlM)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzczmVar.zza.putString("topics", str);
            }
            int i2 = this.zzb;
            if (i2 != -1) {
                zzczmVar.zza.putInt("atps", i2);
            }
        }
    }
}
