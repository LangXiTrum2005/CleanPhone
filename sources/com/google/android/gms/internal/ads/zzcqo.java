package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqo implements zzcpq {
    private final zzeak zza;

    public zzcqo(zzeak zzeakVar) {
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals(com.p004ironsource.mediationsdk.metadata.a.g));
    }
}
