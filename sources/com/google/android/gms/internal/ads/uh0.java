package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.ironsource.C0239a2;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uh0 implements mb0, ta0, ha0, vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wh0 f20791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f20792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20793c;

    public uh0(wh0 wh0Var, ci0 ci0Var, Context context) {
        this.f20791a = wh0Var;
        this.f20792b = ci0Var;
        this.f20793c = context;
    }

    public final void a(Bundle bundle, ca1 ca1Var) {
        if (!((Boolean) zzba.zzc().a(am.S2)).booleanValue() || bundle == null) {
            return;
        }
        ((p9.b) zzt.zzk()).getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        wh0 wh0Var = this.f20791a;
        wh0Var.getClass();
        if (((Boolean) zzba.zzc().a(am.Xe)).booleanValue()) {
            wh0Var.b("brr", true != wh0Var.f21516c.f18375q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            wh0Var.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = ca1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            vh0 vh0Var = (vh0) ca1Var.get(i10);
            long j10 = bundle.getLong(com.applovin.impl.ca.b(vh0Var.f21174b), -1L);
            long j11 = bundle.getLong(com.applovin.impl.ca.b(vh0Var.f21175c), -1L);
            if (j10 > 0 && j11 > 0) {
                wh0Var.b(vh0Var.f21173a, String.valueOf(j11 - j10));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f20791a.b(str, String.valueOf(j10));
            }
        }
    }

    public final void c() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (((Boolean) mn.f17488d.o()).booleanValue() || zzt.zzh().f14144q.getAndSet(true)) {
            return;
        }
        String str = (String) zzba.zzc().a(am.f12169gb);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.f20793c;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = historicalProcessExitReasons.get(0).getReason();
            t6.l lVarK = t6.l.h(new z71(',')).k(c81.f13094c);
            t6.l lVar = new t6.l((p81) lVarK.f50551d, true, (y71) lVarK.f50550c);
            str.getClass();
            Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
            while (true) {
                o81 o81Var = (o81) itE;
                if (!o81Var.hasNext()) {
                    return;
                }
                String str2 = (String) o81Var.next();
                try {
                    if (Integer.parseInt(str2) == reason) {
                        ci0 ci0Var = this.f20792b;
                        ci0Var.getClass();
                        HashMap map = new HashMap(ci0Var.f13169a);
                        map.put("action", "aei");
                        map.put("aeir", String.valueOf(reason));
                        ci0Var.c(map);
                        return;
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb2.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb2.append(str2);
                    zze.zza(sb2.toString());
                }
            }
        } catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException e10) {
            zzt.zzh().d("CsiAdLoadListener.maybeLogAppExitInfo", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        wh0 wh0Var = this.f20791a;
        wh0Var.f21514a.put("action", "ftl");
        wh0Var.b("ftl", String.valueOf(zzeVar.zza));
        wh0Var.b("ed", zzeVar.zzc);
        if (((Boolean) zzba.zzc().a(am.f12284o8)).booleanValue()) {
            wh0Var.b("emsg", zzeVar.zzb);
        }
        wh0Var.d();
        this.f20792b.b(wh0Var.f21514a);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        this.f20791a.a(mxVar.f17566a);
        if (((Boolean) zzba.zzc().a(am.f12137eb)).booleanValue()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        wh0 wh0Var = this.f20791a;
        wh0Var.getClass();
        uw uwVar = ju0Var.f16196b;
        List list = (List) uwVar.f20919c;
        if (!list.isEmpty()) {
            int i10 = ((du0) list.get(0)).f13677b;
            wh0Var.b("ad_format", du0.a(i10));
            if (i10 == 6) {
                wh0Var.f21514a.put("as", true != wh0Var.f21515b.f15018g ? "0" : "1");
            }
        }
        if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
            wh0Var.b("mwl", Integer.toString(list.size()));
        }
        wh0Var.b("gqi", ((fu0) uwVar.f20920d).f14546b);
        if (((Boolean) zzba.zzc().a(am.f12119db)).booleanValue()) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zzd(zzbc zzbcVar) {
        String str;
        if (((Boolean) zzba.zzc().a(am.Z7)).booleanValue()) {
            ci0 ci0Var = this.f20792b;
            wh0 wh0Var = this.f20791a;
            if (zzbcVar == null) {
                ConcurrentHashMap concurrentHashMap = wh0Var.f21514a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", C0239a2.f28156f);
                ci0Var.b(concurrentHashMap);
                return;
            }
            mx mxVar = zzbcVar.zzc;
            if (mxVar != null) {
                a(mxVar.f17577m, vh0.f21171d);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                ConcurrentHashMap concurrentHashMap2 = wh0Var.f21514a;
                ConcurrentHashMap concurrentHashMap3 = wh0Var.f21514a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) zzba.zzc().a(am.f12272nb)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        int i10 = zze.zza;
                        zzo.zzg("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                mx mxVar2 = zzbcVar.zzc;
                if (mxVar2 != null) {
                    wh0Var.a(mxVar2.f17566a);
                }
                wh0Var.d();
                ci0Var.b(concurrentHashMap3);
                if (((Boolean) zzba.zzc().a(am.f12153fb)).booleanValue()) {
                    c();
                }
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = wh0Var.f21514a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                ci0Var.b(concurrentHashMap4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zze(String str) {
        if (((Boolean) zzba.zzc().a(am.Z7)).booleanValue()) {
            wh0 wh0Var = this.f20791a;
            wh0Var.f21514a.put("action", "sgf");
            wh0Var.b("sgf_reason", str);
            wh0Var.d();
            this.f20792b.b(wh0Var.f21514a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        Bundle bundle;
        wh0 wh0Var = this.f20791a;
        wh0Var.f21514a.put("action", X3.i.f27812r);
        synchronized (wh0Var) {
            bundle = wh0Var.f21518e;
        }
        a(bundle, vh0.f21172e);
        if (((Boolean) zzba.zzc().a(am.f12290oe)).booleanValue()) {
            wh0Var.f21514a.put("mafe", true != a.a.x("MUTE_AUDIO") ? "0" : "1");
        }
        wh0Var.d();
        this.f20792b.b(wh0Var.f21514a);
    }
}
