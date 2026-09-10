package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.be1;
import com.google.android.gms.internal.ads.c00;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.fd1;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.od1;
import com.google.android.gms.internal.ads.sf1;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zw1;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;
import p9.b;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f11190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11191b = 0;

    public static final void b(yh0 yh0Var, String str, long j10) {
        if (yh0Var != null) {
            if (((Boolean) zzba.zzc().a(am.f12322qe)).booleanValue()) {
                lj1 lj1VarA = yh0Var.a();
                lj1VarA.l("action", "lat_init");
                lj1VarA.l(str, Long.toString(j10));
                lj1VarA.m();
            }
        }
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel, boolean z10, c00 c00Var, String str, String str2, Runnable runnable, final kw0 kw0Var, final yh0 yh0Var, final Long l, boolean z11) {
        PackageInfo packageInfoF;
        ((b) zzt.zzk()).getClass();
        if (SystemClock.elapsedRealtime() - this.f11191b < 5000) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        ((b) zzt.zzk()).getClass();
        this.f11191b = SystemClock.elapsedRealtime();
        if (c00Var != null && !TextUtils.isEmpty(c00Var.f12961e)) {
            long j10 = c00Var.f12962f;
            ((b) zzt.zzk()).getClass();
            if (System.currentTimeMillis() - j10 <= ((Long) zzba.zzc().a(am.f12208j5)).longValue() && c00Var.f12964h) {
                return;
            }
        }
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f11190a = applicationContext;
        final fw0 fw0VarF = fw0.f(context, 4);
        fw0VarF.zza();
        dt dtVarB = zzt.zzr().b(this.f11190a, versionInfoParcel, kw0Var);
        jq jqVar = x10.f21684j;
        ft ftVarA = dtVarB.a("google.afma.config.fetchAppSettings", jqVar, jqVar);
        int i13 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(MBridgeConstans.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            ul ulVar = am.f12058a;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().a()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzba.zzc().a(am.f12087bb)).booleanValue()) {
                jSONObject.put("inspector_enabled", z11);
            }
            try {
                ApplicationInfo applicationInfo = this.f11190a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = c.a(context).f(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture listenableFutureA = ftVarA.a(jSONObject);
            od1 od1Var = new od1() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.od1
                public final ListenableFuture zza(Object obj) throws JSONException {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzh().g().zzh(jSONObject2.getString("appSettingsJson"));
                        Long l10 = l;
                        if (l10 != null) {
                            ((b) zzt.zzk()).getClass();
                            zzf.b(yh0Var, "cld_s", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    boolean zIsEmpty = TextUtils.isEmpty(strOptString);
                    fw0 fw0Var = fw0VarF;
                    if (!zIsEmpty) {
                        fw0Var.zzk(strOptString);
                    }
                    fw0Var.zzd(zOptBoolean);
                    kw0Var.b(fw0Var.zzm());
                    return be1.f12743b;
                }
            };
            k00 k00Var = l00.f16615h;
            fd1 fd1VarX = zw1.x(listenableFutureA, od1Var, k00Var);
            if (runnable != null) {
                listenableFutureA.addListener(runnable, k00Var);
            }
            if (l != null) {
                listenableFutureA.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((b) zzt.zzk()).getClass();
                        zzf.b(yh0Var, "cld_r", SystemClock.elapsedRealtime() - l.longValue());
                    }
                }, k00Var);
            }
            if (((Boolean) zzba.zzc().a(am.M8)).booleanValue()) {
                fd1VarX.addListener(new zd1(i13, fd1VarX, new sf1("ConfigLoader.maybeFetchNewAppSettings", 4)), k00Var);
            } else {
                v71.j(fd1VarX, "ConfigLoader.maybeFetchNewAppSettings", k00Var);
            }
        } catch (Exception e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", e10);
            fw0VarF.a(e10);
            fw0VarF.zzd(false);
            kw0Var.b(fw0VarF.zzm());
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, kw0 kw0Var, @Nullable yh0 yh0Var, @Nullable Long l, boolean z10) {
        a(context, versionInfoParcel, true, null, str, null, runnable, kw0Var, yh0Var, l, z10);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, c00 c00Var, kw0 kw0Var, boolean z10) {
        a(context, versionInfoParcel, false, c00Var, c00Var != null ? c00Var.f12960d : null, str, null, kw0Var, null, null, z10);
    }
}
