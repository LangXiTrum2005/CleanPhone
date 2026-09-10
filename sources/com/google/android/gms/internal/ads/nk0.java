package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f17845p = Pattern.compile("\\?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50 f17846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f17847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f17848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ou0 f17849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f17851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jw0 f17853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wh0 f17854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mx0 f17855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb0 f17856k;
    public final Object l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f17858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f17859o;

    public nk0(a50 a50Var, Context context, VersionInfoParcel versionInfoParcel, ou0 ou0Var, k00 k00Var, String str, jw0 jw0Var, wh0 wh0Var, jq jqVar, ScheduledExecutorService scheduledExecutorService, mx0 mx0Var, lb0 lb0Var) {
        this.f17846a = a50Var;
        this.f17847b = context;
        this.f17848c = versionInfoParcel;
        this.f17849d = ou0Var;
        this.f17850e = k00Var;
        this.f17852g = str;
        this.f17853h = jw0Var;
        this.f17854i = wh0Var;
        this.f17851f = scheduledExecutorService;
        this.f17855j = mx0Var;
        this.f17856k = lb0Var;
    }

    public final uc1 a(String str, String str2) {
        ListenableFuture listenableFutureD;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zw1.l(new eo0(15, "Invalid ad string."));
        }
        Context context = this.f17847b;
        fw0 fw0VarF = fw0.f(context, 11);
        fw0VarF.zza();
        dt dtVarB = zzt.zzr().b(context, this.f17848c, this.f17846a.c());
        jq jqVar = x10.f21684j;
        ft ftVarA = dtVarB.a("google.afma.response.normalize", jqVar, jqVar);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12196i8)).booleanValue();
        Executor executor = this.f17850e;
        wh0 wh0Var = this.f17854i;
        if (zBooleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f17857m = jSONObject.optString("fetch_url", "");
                    this.f17858n = zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i10 = zze.zza;
                    zzo.zzi("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.f17857m;
            List list = this.f17858n;
            if (TextUtils.isEmpty(string)) {
                listenableFutureD = zw1.d(str3);
                wh0Var.b("sst", "1");
            } else {
                wh0Var.b("sst", "2");
                String str5 = (String) zzba.zzc().a(am.k8);
                if (((Boolean) zzba.zzc().a(am.f12211j8)).booleanValue()) {
                    Pattern pattern = f17845p;
                    e81 e81Var = new e81(pattern);
                    Matcher matcher = pattern.matcher("");
                    matcher.getClass();
                    ps1.V(!matcher.matches(), "The pattern may not match the empty string: %s", e81Var);
                    List listM = new t6.l(new at0(e81Var, 9)).m(string);
                    if (listM.size() < 2) {
                        listenableFutureD = zw1.l(new eo0(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listM.get(1);
                        zzt.zzc();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        listenableFutureD = zw1.u((vd1) zw1.v(vd1.r(l00.f16608a.b(new ze(7, this, new il0(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5)))), ((Integer) zzba.zzc().a(am.f12241l8)).intValue(), TimeUnit.MILLISECONDS, this.f17851f), Exception.class, new ht(6, this, list), executor);
                    }
                } else {
                    listenableFutureD = zw1.u((vd1) zw1.v(vd1.r(l00.f16608a.b(new ze(7, this, new il0(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5)))), ((Integer) zzba.zzc().a(am.f12241l8)).intValue(), TimeUnit.MILLISECONDS, this.f17851f), Exception.class, new ht(6, this, list), executor);
                }
            }
        } else {
            listenableFutureD = zw1.d(str);
            wh0Var.b("sst", "1");
        }
        fd1 fd1VarX = zw1.x(zw1.x(zw1.x(listenableFutureD, new rr(str2, 7), executor), new ht(5, this, ftVarA), executor), new rr(this, 6), executor);
        ps1.a0(fd1VarX, this.f17853h, fw0VarF, false);
        fd1VarX.addListener(new zd1(0, fd1VarX, new b21(this, 22)), l00.f16615h);
        return fd1VarX;
    }

    public final void b(int i10) {
        if (((Boolean) zzba.zzc().a(am.f12270n8)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), this.f17854i, com.applovin.impl.ca.b(i10));
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f17852g));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e10.toString());
            int i10 = zze.zza;
            zzo.zzi(strConcat);
            return str;
        }
    }
}
