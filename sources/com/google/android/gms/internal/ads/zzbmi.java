package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmi implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzcir zzcirVar = (zzcir) obj;
        zzbjl zzbjlVarZzar = zzcirVar.zzar();
        if (zzbjlVarZzar == null || (jSONObjectZzc = zzbjlVarZzar.zzc()) == null) {
            zzcirVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcirVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
