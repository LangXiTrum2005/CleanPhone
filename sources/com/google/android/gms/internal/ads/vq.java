package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzb f21242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0 f21243b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kv f21245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ul0 f21246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m60 f21247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q90 f21248g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzu f21244c = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzaa f21249h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k00 f21250i = l00.f16615h;

    public vq(zzb zzbVar, kv kvVar, ul0 ul0Var, yh0 yh0Var, m60 m60Var, q90 q90Var) {
        this.f21242a = zzbVar;
        this.f21245d = kvVar;
        this.f21246e = ul0Var;
        this.f21243b = yh0Var;
        this.f21247f = m60Var;
        this.f21248g = q90Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, qf qfVar, Uri uri, View view, Activity activity, pu0 pu0Var) {
        if (qfVar != null) {
            try {
                if (!((Boolean) zzba.zzc().a(am.Hd)).booleanValue() || pu0Var == null) {
                    if (qfVar.c(uri)) {
                        return qfVar.b(uri, context, view, activity);
                    }
                } else if (qfVar.c(uri)) {
                    return pu0Var.a(uri, context, view, activity);
                }
            } catch (rf unused) {
            } catch (Exception e10) {
                zzt.zzh().d("OpenGmsgHandler.maybeAddClickSignalsToUri", e10);
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = zze.zza;
            zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        m60 m60Var;
        zza zzaVar = (zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        b30 b30Var = (b30) zzaVar;
        if (b30Var.zzC() != null) {
            map2 = b30Var.zzC().f13716w0;
        }
        String strE = rb0.e(str, b30Var.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = zze.zza;
            zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.f21242a;
        if (zzbVar != null && !zzbVar.zzb()) {
            zzbVar.zzc(strE);
        } else {
            ListenableFuture listenableFutureA = (((Boolean) zzba.zzc().a(am.Hb)).booleanValue() && (m60Var = this.f21247f) != null && m60.b(strE)) ? m60Var.a(strE, zzay.zzh()) : zw1.d(strE);
            listenableFutureA.addListener(new zd1(0, listenableFutureA, new hz((Object) this, (Object) map, (Object) zzaVar, (Comparable) str2, 3)), this.f21250i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.am.U9)).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.am.P9)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.am.O9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vq.e(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void f(Context context, String str, String str2) {
        ul0 ul0Var = this.f21246e;
        ul0Var.b(str);
        yh0 yh0Var = this.f21243b;
        if (yh0Var != null) {
            rb0.j("dialog_not_shown_reason", str2);
            zl0.y1(context, yh0Var, ul0Var, str, "dialog_not_shown", db1.h(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0159  */
    /* JADX WARN: Code duplicated, block: B:50:0x0164  */
    public final void g(zza zzaVar, Map map, boolean z10, String str, boolean z11, boolean z12) {
        Uri uriBuild;
        Intent intent;
        Intent intentL;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoH;
        boolean z13 = true;
        h(true);
        b30 b30Var = (b30) zzaVar;
        Context context = b30Var.getContext();
        qf qfVarM0 = b30Var.m0();
        View viewZzE = b30Var.zzE();
        pu0 pu0VarZzT = b30Var.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentL = null;
        } else {
            Uri uriD = d(c(context, qfVarM0, Uri.parse(str2), viewZzE, null, pu0VarZzT));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z15 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) zzba.zzc().a(am.E5)).booleanValue()) {
                    z13 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriD.getScheme())) {
                uriBuild = uriD.buildUpon().scheme("https").build();
            } else {
                uriBuild = "https".equalsIgnoreCase(uriD.getScheme()) ? uriD.buildUpon().scheme("http").build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriD);
            intent2.setAction("android.intent.action.VIEW");
            if (uriBuild == null) {
                intent = null;
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(268435456);
                intent3.setData(uriBuild);
                intent3.setAction("android.intent.action.VIEW");
                intent = intent3;
            }
            if (z13) {
                zzt.zzc();
                zzs.zzq(context, intent2);
                zzt.zzc();
                zzs.zzq(context, intent);
            }
            ResolveInfo resolveInfoH2 = ps1.H(intent2, arrayList, context);
            if (resolveInfoH2 != null) {
                intentL = ps1.L(intent2, resolveInfoH2);
            } else if (intent != null && (resolveInfoH = ps1.H(intent, new ArrayList(), context)) != null) {
                intentL = ps1.L(intent2, resolveInfoH);
                if (ps1.H(intentL, new ArrayList(), context) == null) {
                    if (!arrayList.isEmpty()) {
                        intentL = intent2;
                    } else if (!z15) {
                        if (z14) {
                            intentL = ps1.L(intent2, (ResolveInfo) arrayList.get(0));
                        } else {
                            intentL = intent2;
                        }
                    } else if (z14) {
                        intentL = ps1.L(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentL = intent2;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentL = intent2;
            } else if (!z15 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i10);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i11 = i10 + 1;
                            if (!it.hasNext()) {
                                i10 = i11;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentL = ps1.L(intent2, resolveInfo);
                            }
                        }
                    } else if (z14) {
                        intentL = ps1.L(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentL = intent2;
                    }
                }
            } else if (z14) {
                intentL = ps1.L(intent2, (ResolveInfo) arrayList.get(0));
            } else {
                intentL = intent2;
            }
        }
        if (!z10 || this.f21246e == null || intentL == null || !e(zzaVar, b30Var.getContext(), intentL.getData().toString(), str)) {
            try {
                ((b30) zzaVar).i0(new zzc(intentL, this.f21249h), z11, z12, str);
            } catch (ActivityNotFoundException e10) {
                String message = e10.getMessage();
                int i12 = zze.zza;
                zzo.zzi(message);
            }
        }
    }

    public final void h(boolean z10) {
        kv kvVar = this.f21245d;
        if (kvVar != null) {
            kvVar.m(z10);
        }
    }

    public final void i(int i10) {
        yh0 yh0Var;
        String str;
        if (!((Boolean) zzba.zzc().a(am.H5)).booleanValue() || (yh0Var = this.f21243b) == null) {
            return;
        }
        lj1 lj1VarA = yh0Var.a();
        lj1VarA.l("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        lj1VarA.l("cct_open_status", str);
        lj1VarA.m();
    }
}
