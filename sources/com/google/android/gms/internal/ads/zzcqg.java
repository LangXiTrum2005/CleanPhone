package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqg implements zzcpq {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcqg(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z2 = Boolean.parseBoolean(str);
        zzgVar.zzw(z2);
        if (z2) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
