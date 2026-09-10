package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.smartdigimkt.f3.b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zzfsv {
    private final String zza;
    private zzftx zzb;
    private long zzc;
    private int zzd;

    public zzfsv(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzftx(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    public final void zzc(WebView webView) {
        this.zzb = new zzftx(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != 0;
    }

    public final void zzf(boolean z2) {
        if (zze()) {
            zzfsm.zza().zzf(zzd(), this.zza, true != z2 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z2) {
        if (zze()) {
            zzfsm.zza().zzg(zzd(), this.zza, true != z2 ? "unlocked" : "locked");
        }
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfsm.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfsm.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(zzfri zzfriVar) {
        zzfsm.zza().zzb(zzd(), this.zza, zzfriVar.zzb());
    }

    public void zzk(zzfrl zzfrlVar, zzfrj zzfrjVar) {
        zzl(zzfrlVar, zzfrjVar, null);
    }

    public final void zzl(zzfrl zzfrlVar, zzfrj zzfrjVar, JSONObject jSONObject) {
        String strZzh = zzfrlVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzftb.zzc(jSONObject2, "environment", "app");
        zzftb.zzc(jSONObject2, "adSessionType", zzfrjVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzftb.zzc(jSONObject3, "deviceType", android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, "; ", str2));
        zzftb.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzftb.zzc(jSONObject3, ne.f26256E, d9.d);
        zzftb.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzftb.zzc(jSONObject2, "deviceCategory", zzfta.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzftb.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzftb.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfrjVar.zzc().zzb());
        zzftb.zzc(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfrjVar.zzc().zzc());
        zzftb.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzftb.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzftb.zzc(jSONObject5, b.f35043u, zzfsk.zza().zzb().getApplicationContext().getPackageName());
        zzftb.zzc(jSONObject2, "app", jSONObject5);
        if (zzfrjVar.zzg() != null) {
            zzftb.zzc(jSONObject2, "contentUrl", zzfrjVar.zzg());
        }
        if (zzfrjVar.zzh() != null) {
            zzftb.zzc(jSONObject2, "customReferenceData", zzfrjVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfrjVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfsm.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        zzfsm.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzftb.zzc(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfsm.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f) {
        zzfsm.zza().zzh(zzd(), this.zza, f);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}
