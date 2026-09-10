package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdme implements zzbnn {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdme(zzdmg zzdmgVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdmgVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzon)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        zzdmg zzdmgVar = (zzdmg) this.zza.get();
        if (zzdmgVar == null) {
            return;
        }
        zzdmgVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzon)).booleanValue()) {
            zzdmgVar.zzB((View) this.zzb.get());
        }
    }
}
