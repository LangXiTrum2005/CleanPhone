package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdzj implements zzbnz {
    @Override // com.google.android.gms.internal.ads.zzbnz
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdzk zzdzkVar = (zzdzk) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjg)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdzkVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzdzkVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzdzkVar.zzd.zzd());
        jSONObject2.put("signals", zzdzkVar.zzc);
        jSONObject3.put(TtmlNode.TAG_BODY, zzdzkVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(zzdzkVar.zzb.zzb));
        jSONObject3.put("response_code", zzdzkVar.zzb.zza);
        jSONObject3.put(bc.aZ, zzdzkVar.zzb.zzd);
        jSONObject.put(J0.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdzkVar.zzd.zzi());
        return jSONObject;
    }
}
