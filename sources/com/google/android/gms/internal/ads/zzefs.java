package com.google.android.gms.internal.ads;

import com.p004ironsource.qt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzefs implements zzbry {
    @Override // com.google.android.gms.internal.ads.zzbry
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeft zzeftVar = (zzeft) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkE)).booleanValue()) {
            zzbzc zzbzcVar = zzeftVar.zzc;
            jSONObject2.put("ad_request_url", zzbzcVar.zze());
            jSONObject2.put("ad_request_post_body", zzbzcVar.zzd());
        }
        zzbzc zzbzcVar2 = zzeftVar.zzc;
        jSONObject2.put("base_url", zzbzcVar2.zzc());
        jSONObject2.put("signals", zzeftVar.zzb);
        zzefz zzefzVar = zzeftVar.zza;
        jSONObject3.put("body", zzefzVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(zzefzVar.zzb));
        jSONObject3.put("response_code", zzefzVar.zza);
        jSONObject3.put("latency", zzefzVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(qt.f26623n, jSONObject3);
        jSONObject.put("flags", zzbzcVar2.zzh());
        return jSONObject;
    }
}
