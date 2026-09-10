package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13365a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13370f;

    public /* synthetic */ d20(uw uwVar, Throwable th2, mx0 mx0Var, String str, zzv zzvVar) {
        this.f13367c = uwVar;
        this.f13368d = th2;
        this.f13369e = mx0Var;
        this.f13366b = str;
        this.f13370f = zzvVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = this.f13365a;
        Object obj = this.f13370f;
        Object obj2 = this.f13369e;
        Object obj3 = this.f13368d;
        Object obj4 = this.f13367c;
        Object obj5 = this.f13366b;
        switch (i10) {
            case 0:
                HashMap mapN = com.applovin.impl.ca.n(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
                mapN.put("src", (String) obj5);
                String str2 = (String) obj4;
                if (!TextUtils.isEmpty(str2)) {
                    mapN.put("cachedSrc", str2);
                }
                String str3 = (String) obj3;
                String str4 = "internal";
                switch (str3.hashCode()) {
                    case -1947652542:
                        str = "interrupted";
                        str3.equals(str);
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            str4 = "network";
                        }
                        break;
                    case -1347010958:
                        str = "inProgress";
                        str3.equals(str);
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                            str4 = "network";
                        }
                        break;
                    case -659376217:
                        str = "contentLengthMissing";
                        str3.equals(str);
                        break;
                    case -642208130:
                        str = "playerFailed";
                        str3.equals(str);
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            str4 = "policy";
                        }
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                            str4 = "policy";
                        }
                        break;
                    case 3387234:
                        str = "noop";
                        str3.equals(str);
                        break;
                    case 96784904:
                        str = "error";
                        str3.equals(str);
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            str4 = "io";
                        }
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                            str4 = "io";
                        }
                        break;
                }
                mapN.put("type", str4);
                mapN.put("reason", str3);
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    mapN.put("message", str5);
                }
                ((e20) obj).r(mapN);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.Vb)).booleanValue();
                Throwable th2 = (Throwable) obj3;
                m60 m60Var = (m60) ((uw) obj4).f20921e;
                if (zBooleanValue) {
                    zw.e(m60Var.f17305a).a("AttributionReporting.registerSourceAndPingClickUrl", th2);
                } else {
                    zw.c(m60Var.f17305a).a("AttributionReportingSampled.registerSourceAndPingClickUrl", th2);
                }
                mx0 mx0Var = (mx0) obj2;
                mx0Var.b((String) obj5, (zzv) obj, null, null);
                return;
            case 2:
                yi0 yi0Var = (yi0) obj4;
                String str6 = (String) obj5;
                ui0 ui0Var = (ui0) obj3;
                wu0 wu0Var = (wu0) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yi0Var.getClass();
                try {
                    try {
                        if (Objects.equals(str6, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            ui0Var.zze();
                            return;
                        }
                        Context context = (Context) yi0Var.f22267g.get();
                        if (context == null) {
                            context = yi0Var.f22266f;
                        }
                        try {
                            wu0Var.f21609a.j0(new s9.b(context), ui0Var, arrayList);
                            return;
                        } catch (Throwable th3) {
                            throw new qu0(th3);
                        }
                    } catch (RemoteException e10) {
                        throw new aa.b(e10, 5);
                    } catch (qu0 unused) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 74);
                        sb2.append("Failed to initialize adapter. ");
                        sb2.append(str6);
                        sb2.append(" does not implement the initialize() method.");
                        ui0Var.zzf(sb2.toString());
                        return;
                    }
                } catch (RemoteException e11) {
                    int i11 = zze.zza;
                    zzo.zzg("", e11);
                    return;
                }
            case 3:
                u51 u51Var = (u51) obj5;
                HashMap map = (HashMap) obj4;
                Context context2 = (Context) obj3;
                View view = (View) obj2;
                map.putAll(u51Var.f20635e.b(context2, view));
                u51Var.e(map);
                map.put("f", "v");
                map.put("ctx", context2);
                map.put("view", view);
                map.put("act", (Activity) obj);
                map.put("bds", null);
                return;
            default:
                u51 u51Var2 = (u51) obj4;
                HashMap map2 = (HashMap) obj3;
                map2.putAll(u51Var2.f20635e.c());
                u51Var2.e(map2);
                map2.put("f", "c");
                map2.put("ctx", (Context) obj2);
                map2.put("view", (View) obj);
                map2.put("act", null);
                map2.put("bds", (String) obj5);
                return;
        }
    }

    public /* synthetic */ d20(yi0 yi0Var, String str, ui0 ui0Var, wu0 wu0Var, ArrayList arrayList) {
        this.f13367c = yi0Var;
        this.f13366b = str;
        this.f13368d = ui0Var;
        this.f13369e = wu0Var;
        this.f13370f = arrayList;
    }

    public /* synthetic */ d20(u51 u51Var, HashMap map, Context context, View view, Activity activity) {
        this.f13366b = u51Var;
        this.f13367c = map;
        this.f13368d = context;
        this.f13369e = view;
        this.f13370f = activity;
    }

    public /* synthetic */ d20(u51 u51Var, HashMap map, Context context, View view, String str) {
        this.f13367c = u51Var;
        this.f13368d = map;
        this.f13369e = context;
        this.f13370f = view;
        this.f13366b = str;
    }

    public d20(e20 e20Var, String str, String str2, String str3, String str4) {
        this.f13366b = str;
        this.f13367c = str2;
        this.f13368d = str3;
        this.f13369e = str4;
        this.f13370f = e20Var;
    }
}
