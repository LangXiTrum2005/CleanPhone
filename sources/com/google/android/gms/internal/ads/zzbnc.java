package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbnc implements zzbnn {
    static final /* synthetic */ zzbnc zza = new zzbnc();

    private /* synthetic */ zzbnc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckd zzckdVar = (zzckd) obj;
        zzbnn zzbnnVar = zzbnm.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjv)).booleanValue()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzckdVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(boolValueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbqj) zzckdVar).zze("openableApp", map2);
    }
}
