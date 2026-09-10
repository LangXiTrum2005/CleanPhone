package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzdyq {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdyq(String str, byte[] bArr) {
        this.zzb = str;
    }

    public final /* synthetic */ String zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlq);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.zza);
            jSONObject.put("eventCategory", this.zzb);
            jSONObject.putOpt("event", this.zzc);
            jSONObject.putOpt("errorCode", this.zzd);
            jSONObject.putOpt("rewardType", this.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.zzf);
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public final /* synthetic */ void zzb(Long l2) {
        this.zza = l2;
    }

    public final /* synthetic */ void zzc(String str) {
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(Integer num) {
        this.zzd = num;
    }

    public final /* synthetic */ void zze(String str) {
        this.zze = str;
    }

    public final /* synthetic */ void zzf(Integer num) {
        this.zzf = num;
    }
}
