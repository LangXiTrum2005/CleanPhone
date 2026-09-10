package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class zzags implements zzagj {
    public final String zza;

    private zzags(String str) {
        this.zza = str;
    }

    public static zzags zzb(zzer zzerVar) {
        return new zzags(zzerVar.zzK(zzerVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final int zza() {
        return 1852994675;
    }
}
