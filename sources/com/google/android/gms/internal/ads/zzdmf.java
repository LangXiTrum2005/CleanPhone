package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdmf implements zzbnn {
    private final WeakReference zza;
    private final zzfpi zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfno zzd;

    public /* synthetic */ zzdmf(zzdmg zzdmgVar, zzfpi zzfpiVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfno zzfnoVar, byte[] bArr) {
        this.zza = new WeakReference(zzdmgVar);
        this.zzb = zzfpiVar;
        this.zzc = zzvVar;
        this.zzd = zzfnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        zzdmg zzdmgVar = (zzdmg) this.zza.get();
        String str = (String) map.get("u");
        if (zzdmgVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdmgVar.zzF());
    }
}
