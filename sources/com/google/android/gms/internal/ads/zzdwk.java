package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.WebViewFeature;
import com.applovin.impl.Z;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwk implements zzddq, zzdby, zzdan, zzdjd {
    private final zzdwy zza;
    private final zzdxj zzb;
    private final int zzc;

    public zzdwk(zzdwy zzdwyVar, zzdxj zzdxjVar, int i2) {
        this.zza = zzdwyVar;
        this.zzb = zzdxjVar;
        this.zzc = i2;
    }

    private final void zzc(Bundle bundle, zzgtd zzgtdVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() || bundle == null) {
            return;
        }
        Z.t(bundle, zzdwm.PUBLIC_API_CALLBACK.zza());
        zzdwy zzdwyVar = this.zza;
        zzdwyVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdwyVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgtdVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzdwn zzdwnVar = (zzdwn) zzgtdVar.get(i2);
            long j = bundle.getLong(zzdwnVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdwnVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdwyVar.zzd(zzdwnVar.zza(), String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzit)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdwyVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdwyVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhM)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzit)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdwy zzdwyVar = this.zza;
                zzdwyVar.zzc().put("action", "sgs");
                zzdwyVar.zzc().put("request_id", x4.DISABLED_AUCTION_FALLBACK_ID);
                this.zzb.zzb(zzdwyVar.zzc());
                return;
            }
            zzbza zzbzaVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbzaVar != null) {
                zzc(zzbzaVar.zzm, zzdwn.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdwn.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdwy zzdwyVar2 = this.zza;
                zzdwyVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdwyVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkZ)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e2);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbza zzbzaVar2 = zzbjVar.zzd;
                if (zzbzaVar2 != null) {
                    this.zza.zzb(zzbzaVar2.zza);
                }
                zzdwy zzdwyVar3 = this.zza;
                zzdwyVar3.zzg();
                this.zzb.zzb(zzdwyVar3.zzc());
            } catch (JSONException unused) {
                zzdwy zzdwyVar4 = this.zza;
                zzdwyVar4.zzc().put("action", "sgf");
                zzdwyVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdwyVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdwy zzdwyVar = this.zza;
        zzdwyVar.zzc().put("action", "ftl");
        zzdwyVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdwyVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzib)).booleanValue()) {
            zzdwyVar.zzd("emsg", zzeVar.zzb);
        }
        zzdwyVar.zzg();
        this.zzb.zzb(zzdwyVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        this.zza.zzb(zzbzaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
        this.zza.zza(zzficVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhM)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzit)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdwy zzdwyVar = this.zza;
            zzdwyVar.zzc().put("action", "sgf");
            zzdwyVar.zzd("sgf_reason", str);
            zzdwyVar.zzg();
            this.zzb.zzb(zzdwyVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        zzdwy zzdwyVar = this.zza;
        zzdwyVar.zzc().put("action", d9.h.r);
        zzc(zzdwyVar.zze(), zzdwn.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznX)).booleanValue()) {
            zzdwyVar.zzc().put("mafe", true != WebViewFeature.a("MUTE_AUDIO") ? "0" : "1");
        }
        zzdwyVar.zzg();
        this.zzb.zzb(zzdwyVar.zzc());
    }
}
