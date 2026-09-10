package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewFeature;
import com.umeng.ccg.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrc implements zzcyq, zzcxh, zzcvw, zzdee {
    private final zzdrq zza;
    private final zzdsb zzb;
    private final int zzc;

    public zzdrc(zzdrq zzdrqVar, zzdsb zzdsbVar, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzdsbVar;
        this.zzc = i;
    }

    private final void zzc(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzc(str, String.valueOf(j));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfxn zzfxnVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdre.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        if (bundle.containsKey("ls")) {
            this.zza.zzc("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzfxnVar.size();
        for (int i = 0; i < size; i++) {
            zzdrf zzdrfVar = (zzdrf) zzfxnVar.get(i);
            long j = bundle.getLong(zzdrfVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdrfVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                this.zza.zzc(zzdrfVar.zzc(), String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.zza.zzc("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.zza.zzc("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        this.zza.zze(zzbvkVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        this.zza.zzd(zzfcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put(a.w, "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgY)).booleanValue()) {
            this.zza.zzc("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbkVar == null) {
                this.zza.zzb().put(a.w, "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzg(this.zza.zzb());
                return;
            }
            zzbvk zzbvkVar = zzbkVar.zzd;
            Bundle bundle = zzbkVar.zze;
            if (zzbvkVar != null) {
                zzd(zzbvkVar.zzm, zzdrf.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzd(bundle, zzdrf.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbkVar.zzc) ? zzbkVar.zzb : zzbkVar.zzc);
                this.zza.zzb().put(a.w, "sgs");
                Map mapZzb = this.zza.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjz)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                zzbvk zzbvkVar2 = zzbkVar.zzd;
                if (zzbvkVar2 != null) {
                    this.zza.zze(zzbvkVar2.zza);
                }
                this.zzb.zzg(this.zza.zzb());
            } catch (JSONException unused) {
                this.zza.zzb().put(a.w, "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzg(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            this.zza.zzb().put(a.w, "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzg(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzb().put(a.w, "loaded");
        zzd(this.zza.zza(), zzdrf.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmw)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : "1");
        }
        this.zzb.zzg(this.zza.zzb());
    }
}
