package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzckc {
    private final zzckb zza;
    private final zzckd zzb;

    public zzckc(zzckd zzckdVar, zzckb zzckbVar) {
        this.zza = zzckbVar;
        this.zzb = zzckdVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzckd zzckdVar = this.zzb;
        zzayq zzayqVarZzS = ((zzckk) zzckdVar).zzS();
        if (zzayqVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzayl zzaylVarZzb = zzayqVarZzS.zzb();
        if (zzaylVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckdVar.getContext() != null) {
            return zzaylVarZzb.zzf(zzckdVar.getContext(), str, ((zzckm) zzckdVar).zzE(), zzckdVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzckd zzckdVar = this.zzb;
        zzayq zzayqVarZzS = ((zzckk) zzckdVar).zzS();
        if (zzayqVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzayl zzaylVarZzb = zzayqVarZzS.zzb();
        if (zzaylVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckdVar.getContext() != null) {
            return zzaylVarZzb.zzj(zzckdVar.getContext(), ((zzckm) zzckdVar).zzE(), zzckdVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzckd zzckdVar = this.zzb;
        zzbgk.zza(zzckdVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpd)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzckp zzckpVarZzP = ((zzcir) zzckdVar).zzP();
            zzcze zzczeVarZzK = zzckpVarZzP != null ? zzckpVarZzP.zzK() : null;
            if (zzczeVarZzK != null) {
                long jZza = zzczeVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e2);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
