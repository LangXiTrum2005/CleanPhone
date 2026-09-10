package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdso implements zzbnn {
    final /* synthetic */ zzdsp zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbnn zzd;

    public /* synthetic */ zzdso(zzdsp zzdspVar, WeakReference weakReference, String str, zzbnn zzbnnVar, byte[] bArr) {
        Objects.requireNonNull(zzdspVar);
        this.zza = zzdspVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
