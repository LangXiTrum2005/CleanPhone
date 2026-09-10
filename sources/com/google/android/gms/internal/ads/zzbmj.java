package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmj implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcir zzcirVar = (zzcir) obj;
        zzbjl zzbjlVarZzar = zzcirVar.zzar();
        if (zzbjlVarZzar == null || (jSONObjectZzd = zzbjlVarZzar.zzd()) == null) {
            zzcirVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcirVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
