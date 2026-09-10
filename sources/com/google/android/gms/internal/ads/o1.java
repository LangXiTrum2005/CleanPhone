package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18080d;

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, int i10) {
        this.f18077a = i10;
        this.f18078b = obj;
        this.f18079c = obj2;
        this.f18080d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i10 = 1;
        final int i11 = 0;
        switch (this.f18077a) {
            case 0:
                md0 md0Var = (md0) this.f18078b;
                g22 g22Var = (g22) this.f18079c;
                yx1 yx1Var = (yx1) this.f18080d;
                md0Var.getClass();
                String str = uu0.f20901a;
                d02 d02Var = ((jy1) md0Var.f17400c).f16219a.f19727s;
                zz1 zz1VarO = d02Var.o();
                d02Var.f(zz1VarO, 1017, new at0(zz1VarO, g22Var, yx1Var));
                return;
            case 1:
                hb hbVar = (hb) this.f18078b;
                hbVar.zzl();
                bc.s sVar = (bc.s) this.f18079c;
                lb lbVar = (lb) sVar.f5583d;
                if (lbVar == null) {
                    hbVar.d(sVar.f5581b);
                } else {
                    hbVar.zzt(lbVar);
                }
                if (sVar.f5580a) {
                    hbVar.zzc("intermediate-response");
                } else {
                    hbVar.a("done");
                }
                Runnable runnable = (Runnable) this.f18080d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ki kiVar = (ki) this.f18078b;
                WebView webView = (WebView) this.f18079c;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", kiVar);
                        return;
                    } catch (Throwable unused) {
                        kiVar.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                AdManagerAdView adManagerAdView = (AdManagerAdView) this.f18078b;
                if (adManagerAdView.zza((zzbu) this.f18079c)) {
                    ((cq) this.f18080d).f13228a.onAdManagerAdViewLoaded(adManagerAdView);
                    return;
                } else {
                    zzo.zzi("Could not bind.");
                    return;
                }
            case 4:
                d10 d10Var = ((w00) this.f18080d).f21350q;
                if (d10Var != null) {
                    d10Var.c("error", "what", (String) this.f18078b, "extra", (String) this.f18079c);
                    return;
                }
                return;
            case 5:
                ((r30) this.f18078b).b0((String) this.f18079c, (ValueCallback) this.f18080d);
                return;
            case 6:
                f40 f40Var = (f40) this.f18078b;
                Context context = (Context) this.f18079c;
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f18080d;
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
                if (((Boolean) zzba.zzc().a(am.Ff)).booleanValue()) {
                    ((p9.b) zzt.zzk()).getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    lj1 lj1VarA = f40Var.f14210b.a();
                    lj1VarA.l("action", "webview_startup_l");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb2.append(jElapsedRealtime2);
                    lj1VarA.l("webview_startup_l", sb2.toString());
                    lj1VarA.m();
                }
                if (((Boolean) zzba.zzc().a(am.Lf)).booleanValue()) {
                    l00.f16613f.execute(new d(f40Var, 26));
                    return;
                }
                return;
            case 7:
                ((mx0) this.f18078b).b((String) this.f18079c, (zzv) this.f18080d, null, null);
                return;
            case 8:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f18078b;
                String str2 = (String) this.f18079c;
                zzu zzuVar = (zzu) this.f18080d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                ul0.c(sQLiteDatabase, zzuVar);
                return;
            case 9:
                ho0.c((ju0) this.f18078b, (du0) this.f18079c, (qm0) this.f18080d);
                return;
            case 10:
                wx0 wx0Var = (wx0) this.f18078b;
                qx0 qx0Var = (qx0) this.f18079c;
                ux0 ux0Var = (ux0) this.f18080d;
                if (wx0Var.f21615b.compareAndSet(false, true)) {
                    qx0Var.b(ux0Var, true);
                    return;
                }
                return;
            case 11:
                u51 u51Var = (u51) this.f18078b;
                HashMap map = (HashMap) this.f18079c;
                Context context2 = (Context) this.f18080d;
                map.putAll(u51Var.f20635e.a());
                u51Var.e(map);
                map.put("f", CampaignEx.JSON_KEY_AD_Q);
                map.put("ctx", context2);
                return;
            case 12:
                l71 l71Var = (l71) this.f18078b;
                f71 f71Var = (f71) this.f18079c;
                o71 o71Var = (o71) this.f18080d;
                String str3 = l71Var.f16777b;
                try {
                    ln0 ln0Var = l71Var.f16776a;
                    if (ln0Var == null) {
                        throw null;
                    }
                    e71 e71Var = (e71) ln0Var.f17079j;
                    if (e71Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str3);
                    String str4 = f71Var.f14304a;
                    if (!l71.b(str4)) {
                        str4.getClass();
                        bundle.putString("sessionToken", str4.trim());
                    }
                    String str5 = f71Var.f14305b;
                    if (!l71.b(str5)) {
                        str5.getClass();
                        bundle.putString("appId", str5.trim());
                    }
                    k71 k71Var = new k71(l71Var, o71Var);
                    c71 c71Var = (c71) e71Var;
                    Parcel parcelQ = c71Var.q();
                    rh.c(parcelQ, bundle);
                    rh.e(parcelQ, k71Var);
                    c71Var.u1(parcelQ, 2);
                    return;
                } catch (RemoteException e10) {
                    l71.f16774c.e(e10, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 13:
                l71 l71Var2 = (l71) this.f18078b;
                m71 m71Var = (m71) this.f18079c;
                o71 o71Var2 = (o71) this.f18080d;
                String str6 = l71Var2.f16777b;
                try {
                    ln0 ln0Var2 = l71Var2.f16776a;
                    if (ln0Var2 == null) {
                        throw null;
                    }
                    e71 e71Var2 = (e71) ln0Var2.f17079j;
                    if (e71Var2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str6);
                    bundle2.putBinder("windowToken", ((h71) m71Var).f15201a);
                    String str7 = ((h71) m71Var).f15206f;
                    if (!l71.b(str7)) {
                        str7.getClass();
                        bundle2.putString("adFieldEnifd", str7.trim());
                    }
                    bundle2.putInt("layoutGravity", ((h71) m71Var).f15203c);
                    bundle2.putFloat("layoutVerticalMargin", ((h71) m71Var).f15204d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", ((h71) m71Var).f15205e);
                    if (!l71.b(null) || !l71.b(null)) {
                        throw null;
                    }
                    String str8 = ((h71) m71Var).f15202b;
                    if (!l71.b(str8)) {
                        str8.getClass();
                        bundle2.putString("appId", str8.trim());
                    }
                    if (!l71.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    k71 k71Var2 = new k71(l71Var2, o71Var2);
                    c71 c71Var2 = (c71) e71Var2;
                    Parcel parcelQ2 = c71Var2.q();
                    parcelQ2.writeString(str6);
                    rh.c(parcelQ2, bundle2);
                    rh.e(parcelQ2, k71Var2);
                    c71Var2.u1(parcelQ2, 1);
                    return;
                } catch (RemoteException e11) {
                    l71.f16774c.e(e11, "show overlay display from: %s", str6);
                    return;
                }
            case 14:
                fz1 fz1Var = (fz1) this.f18078b;
                z91 z91Var = (z91) this.f18079c;
                r32 r32Var = (r32) this.f18080d;
                d02 d02Var2 = (d02) fz1Var.f14615j;
                ya1 ya1VarF = z91Var.f();
                mu1 mu1Var = d02Var2.f13332g;
                mu1Var.getClass();
                v90 v90Var = d02Var2.f13329d;
                v90Var.getClass();
                v90Var.f21136b = ca1.y(ya1VarF);
                if (!ya1VarF.isEmpty()) {
                    v90Var.f21139e = (r32) ya1VarF.get(0);
                    r32Var.getClass();
                    v90Var.f21140f = r32Var;
                }
                if (((r32) v90Var.f21138d) == null) {
                    v90Var.f21138d = v90.p(mu1Var, (ca1) v90Var.f21136b, (r32) v90Var.f21139e, (ug) v90Var.f21135a);
                }
                v90Var.n(mu1Var.O0());
                return;
            case 15:
                Pair pair = (Pair) this.f18079c;
                ((d02) ((jz1) this.f18078b).f16227b.f17089j).d(((Integer) pair.first).intValue(), (r32) pair.second, (o32) this.f18080d);
                return;
            case 16:
                iw0 iw0Var = (iw0) this.f18078b;
                g22 g22Var2 = (g22) this.f18079c;
                yx1 yx1Var2 = (yx1) this.f18080d;
                iw0Var.getClass();
                String str9 = uu0.f20901a;
                d02 d02Var3 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                zz1 zz1VarO2 = d02Var3.o();
                d02Var3.f(zz1VarO2, 1009, new uo0(zz1VarO2, g22Var2, yx1Var2));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f18078b;
                Handler handler = (Handler) this.f18079c;
                final mk0 mk0Var = (mk0) this.f18080d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.e12
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        mk0 mk0Var2 = mk0Var;
                                        mk0Var2.getClass();
                                        if (Thread.currentThread() == ((Thread) mk0Var2.f17461c)) {
                                            mk0Var2.i(-1, b02.f12585b);
                                            mk0Var2.j();
                                        }
                                        break;
                                    default:
                                        mk0 mk0Var3 = mk0Var;
                                        mk0Var3.getClass();
                                        if (Thread.currentThread() == ((Thread) mk0Var3.f17461c)) {
                                            mk0Var3.i(-1, b02.f12585b);
                                            mk0Var3.j();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (j12.f15914o) {
                        try {
                            int i12 = j12.f15916q - 1;
                            j12.f15916q = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService = j12.f15915p;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                j12.f15915p = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.e12
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        mk0 mk0Var2 = mk0Var;
                                        mk0Var2.getClass();
                                        if (Thread.currentThread() == ((Thread) mk0Var2.f17461c)) {
                                            mk0Var2.i(-1, b02.f12585b);
                                            mk0Var2.j();
                                        }
                                        break;
                                    default:
                                        mk0 mk0Var3 = mk0Var;
                                        mk0Var3.getClass();
                                        if (Thread.currentThread() == ((Thread) mk0Var3.f17461c)) {
                                            mk0Var3.i(-1, b02.f12585b);
                                            mk0Var3.j();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (j12.f15914o) {
                        try {
                            int i13 = j12.f15916q - 1;
                            j12.f15916q = i13;
                            if (i13 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = j12.f15915p;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                j12.f15915p = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
        }
    }

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f18077a = i10;
        this.f18078b = obj2;
        this.f18079c = obj3;
        this.f18080d = obj;
    }

    public o1(li liVar, gi giVar, WebView webView, boolean z10) {
        this.f18077a = 2;
        this.f18079c = webView;
        this.f18080d = liVar;
        this.f18078b = new ki(this, giVar, webView, z10);
    }
}
