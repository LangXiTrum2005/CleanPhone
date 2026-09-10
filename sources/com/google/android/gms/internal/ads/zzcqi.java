package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqi implements zzcpq {
    private final zzfhq zza;

    public zzcqi(zzfhq zzfhqVar) {
        this.zza = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(Boolean.parseBoolean(str));
        } catch (Exception e2) {
            throw new IllegalStateException("Invalid render_in_browser state", e2);
        }
    }
}
