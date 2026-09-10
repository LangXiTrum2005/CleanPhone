package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p004ironsource.d9;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdmc implements zzbnn {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        zzdmg zzdmgVar = (zzdmg) this.zza.get();
        if (zzdmgVar != null && "_ac".equals((String) map.get(d9.h.j0))) {
            zzdmgVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
                zzdmgVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdmgVar.zzE().zzdQ();
            }
        }
    }
}
