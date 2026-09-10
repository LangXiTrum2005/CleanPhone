package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf f20607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r30 f20608b;

    public u30(r30 r30Var, vf vfVar) {
        this.f20607a = vfVar;
        this.f20608b = r30Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        r30 r30Var = this.f20608b;
        qf qfVar = r30Var.f19327b;
        if (qfVar == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        of ofVar = qfVar.f19044b;
        if (ofVar == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r30Var.getContext() != null) {
            return ofVar.zzf(r30Var.getContext(), str, r30Var, r30Var.f19325a.f13031a);
        }
        zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        r30 r30Var = this.f20608b;
        qf qfVar = r30Var.f19327b;
        if (qfVar == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        of ofVar = qfVar.f19044b;
        if (ofVar == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r30Var.getContext() != null) {
            return ofVar.zzj(r30Var.getContext(), r30Var, r30Var.f19325a.f13031a);
        }
        zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        r30 r30Var = this.f20608b;
        am.a(r30Var.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) zzba.zzc().a(am.f12397vf)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            g30 g30Var = r30Var.f19339n;
            n90 n90Var = g30Var != null ? g30Var.A : null;
            if (n90Var != null) {
                long j10 = n90Var.f17723a.get();
                if (j10 > 0) {
                    jSONObject.put("plcmtid", j10);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            zze.zzb("Error constructing JSON.", e10);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (!TextUtils.isEmpty(str)) {
            zzs.zza.post(new zd1(18, this, str));
        } else {
            int i10 = zze.zza;
            zzo.zzi("URL is empty, ignoring message");
        }
    }
}
