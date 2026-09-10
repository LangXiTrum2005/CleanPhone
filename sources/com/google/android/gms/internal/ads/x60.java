package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.C0526q2;
import com.ironsource.O6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21755b;

    public /* synthetic */ x60(Object obj, int i10) {
        this.f21754a = i10;
        this.f21755b = obj;
    }

    private final void a() {
        ka0 ka0Var = (ka0) this.f21755b;
        synchronized (ka0Var) {
            int i10 = zze.zza;
            zzo.zzf("Timeout waiting for show call succeed to be called.");
            ka0Var.Z(new fd0("Timeout for show call succeed."));
            ka0Var.f16398e = true;
        }
    }

    private final void b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        oj0 oj0Var = (oj0) this.f21755b;
        b30 b30Var = oj0Var.f18284d;
        lj0 lj0Var = oj0Var.f18283c;
        synchronized (lj0Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(O6.H, "ANDROID");
                    String str = lj0Var.f17022k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                        sb2.append("afma-sdk-a-v");
                        sb2.append(str);
                        jSONObject.put("sdkVersion", sb2.toString());
                    }
                    jSONObject.put("internalSdkVersion", lj0Var.f17020i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", lj0Var.f17015d.a());
                    if (((Boolean) zzba.zzc().a(am.Wa)).booleanValue()) {
                        String str2 = zzt.zzh().f14135g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put(O6.L, str2);
                        }
                    }
                    long j10 = lj0Var.f17027q;
                    ((p9.b) zzt.zzk()).getClass();
                    if (j10 < System.currentTimeMillis() / 1000) {
                        lj0Var.f17025o = JsonUtils.EMPTY_JSON;
                    }
                    jSONObject.put("networkExtras", lj0Var.f17025o);
                    jSONObject.put("adSlots", lj0Var.i());
                    jSONObject.put("appInfo", lj0Var.f17016e.h());
                    String str3 = zzt.zzh().g().zzi().f12961e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) zzba.zzc().a(am.La)).booleanValue() && (jSONObject2 = lj0Var.f17026p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb3 = new StringBuilder(string.length() + 13);
                        sb3.append("Server data: ");
                        sb3.append(string);
                        String string2 = sb3.toString();
                        int i10 = zze.zza;
                        zzo.zzd(string2);
                        jSONObject.put(C0526q2.f30053s, lj0Var.f17026p);
                    }
                    if (((Boolean) zzba.zzc().a(am.Ka)).booleanValue()) {
                        jSONObject.put("openAction", lj0Var.f17032v);
                        jSONObject.put("gesture", lj0Var.f17028r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", zzt.zzo().zzk());
                    zzt.zzc();
                    zzay.zza();
                    jSONObject.put("isSimulator", zzf.zzy());
                    if (((Boolean) zzba.zzc().a(am.Ya)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(lj0Var.f17034x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(am.f12069ab))) {
                        jSONObject.put("gmaDisk", (JSONObject) lj0Var.f17019h.f17161b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(am.Za))) {
                        jSONObject.put("userDisk", (JSONObject) lj0Var.f17018g.f17161b);
                    }
                } catch (JSONException e10) {
                    zzt.zzh().e("Inspector.toJson", e10);
                    int i11 = zze.zza;
                    zzo.zzj("Ad inspector encountered an error", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b30Var.a("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void c() {
        bk0 bk0Var = (bk0) this.f21755b;
        AtomicReference atomicReference = bk0Var.f12813d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(bk0Var.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        pk0 pk0Var = (pk0) this.f21755b;
        synchronized (pk0Var.f19987b) {
            try {
                if (pk0Var.f19988c) {
                    return;
                }
                pk0Var.f19988c = true;
                hj hjVar = new hj(pk0Var.f18699g, zzt.zzs().zza(), pk0Var, pk0Var, 2);
                pk0Var.f19991f = hjVar;
                hjVar.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x0017, B:8:0x001b, B:13:0x0025, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:24:0x0044, B:26:0x004e, B:28:0x005f, B:27:0x0053, B:29:0x0061, B:31:0x0070, B:33:0x0078), top: B:41:0x0017 }] */
    private final void e() {
        String strO;
        TelephonyManager telephonyManager;
        nn0 nn0Var = (nn0) this.f21755b;
        y yVar = (y) nn0Var.f17867a.get();
        if (yVar != null) {
            int iB = nn0Var.f17869c.b();
            z zVar = yVar.f22052a;
            synchronized (zVar) {
                try {
                    if (zVar.l != iB || zVar.f22439m == null) {
                        zVar.l = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (zVar.f22439m == null) {
                                Context context = zVar.f22428a;
                                String str = uu0.f20901a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strO = x10.o(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strO = x10.o(Locale.getDefault().getCountry());
                                    } else {
                                        strO = x10.o(networkCountryIso);
                                    }
                                }
                                zVar.f22439m = strO;
                            }
                            zVar.f22437j = zVar.b(iB);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            zVar.a(zVar.f22432e > 0 ? (int) (jElapsedRealtime - zVar.f22433f) : 0, zVar.f22434g, zVar.f22437j);
                            zVar.f22433f = jElapsedRealtime;
                            zVar.f22434g = 0L;
                            zVar.f22436i = 0L;
                            zVar.f22435h = 0L;
                            androidx.recyclerview.widget.o1 o1Var = zVar.f22431d;
                            ((ArrayList) o1Var.f4850b).clear();
                            o1Var.f4851c = -1;
                            o1Var.f4852d = 0;
                            o1Var.f4853e = 0;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void f() {
        bo0 bo0Var = (bo0) this.f21755b;
        synchronized (bo0Var) {
            ((p9.b) bo0Var.f12827a).getClass();
            bo0Var.f12834h = SystemClock.elapsedRealtime() - bo0Var.f12835i;
        }
    }

    private final void g() {
        ap0 ap0Var = (ap0) this.f21755b;
        synchronized (ap0Var) {
            ap0Var.x1(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void h() {
        rv0 rv0Var;
        rv0 rv0Var2 = (rv0) this.f21755b;
        sv0 sv0Var = rv0Var2.f19693d;
        synchronized (sv0Var) {
            try {
                ScheduledFuture scheduledFuture = rv0Var2.f19692c;
                rv0Var = scheduledFuture != null ? (rv0) sv0Var.f20057c.remove(scheduledFuture) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (rv0Var != null) {
            rv0Var2.f19693d.f20056b.execute(rv0Var2.f19690a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21754a) {
            case 0:
                d70 d70Var = ((w60) this.f21755b).f21430b.f22179d;
                synchronized (d70Var) {
                    d70Var.b();
                    d70Var.f13444i = true;
                }
                return;
            case 1:
                p70 p70Var = (p70) this.f21755b;
                op opVar = p70Var.f18547q.f17784d;
                if (opVar == null) {
                    return;
                }
                try {
                    opVar.c0((zzbu) p70Var.f18549s.zzb(), new s9.b(p70Var.l));
                    return;
                } catch (RemoteException e10) {
                    int i10 = zze.zza;
                    zzo.zzg("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
            case 2:
                ((s80) this.f21755b).f19894c = false;
                return;
            case 3:
                e90 e90Var = (e90) this.f21755b;
                x10.w(e90Var.f13894c);
                e90Var.f13899h = true;
                return;
            case 4:
                m90 m90Var = (m90) this.f21755b;
                synchronized (m90Var) {
                    try {
                        le1 le1Var = m90Var.f17356f;
                        if (le1Var.isDone()) {
                            return;
                        }
                        le1Var.c(Boolean.TRUE);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 5:
                q90 q90Var = (q90) this.f21755b;
                synchronized (q90Var.f18995a) {
                    try {
                        if (q90Var.f19003i) {
                            return;
                        }
                        q90Var.f19003i = true;
                        q90Var.a();
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 6:
                a();
                return;
            case 7:
                ((me0) this.f21755b).c();
                return;
            case 8:
                qe0 qe0Var = (qe0) this.f21755b;
                if (qe0Var.f19034f == null) {
                    View view = new View(qe0Var.f19031c.getContext());
                    qe0Var.f19034f = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (qe0Var.f19031c != qe0Var.f19034f.getParent()) {
                    qe0Var.f19031c.addView(qe0Var.f19034f);
                    return;
                }
                return;
            case 9:
                dg0 dg0Var = (dg0) this.f21755b;
                try {
                    dg0Var.getClass();
                    k9.c0.d("#008 Must be called on the main UI thread.");
                    dg0Var.y1();
                    ee0 ee0Var = dg0Var.f13518c;
                    if (ee0Var != null) {
                        ee0Var.n();
                    }
                    dg0Var.f13518c = null;
                    dg0Var.f13516a = null;
                    dg0Var.f13517b = null;
                    dg0Var.f13519d = true;
                    return;
                } catch (RemoteException e11) {
                    int i11 = zze.zza;
                    zzo.zzl("#007 Could not call remote method.", e11);
                    return;
                }
            case 10:
                String str = zzt.zzh().g().zzi().f12961e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                m00 m00Var = (m00) this.f21755b;
                if (zIsEmpty) {
                    m00Var.zzd(new Exception());
                    return;
                } else {
                    m00Var.zzc(str);
                    return;
                }
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                ((ok0) this.f21755b).a();
                return;
            case 14:
                ((ok0) this.f21755b).a();
                return;
            case 15:
                vu0 vu0Var = (vu0) this.f21755b;
                a50 a50Var = ((a50) vu0Var.f21275c).f11854b;
                ic1.j((Context) vu0Var.f21274b, Context.class);
                x11 x11Var = new x11(a50Var);
                fx1 fx1Var = a50Var.f11874m;
                j40 j40Var = a50Var.f11852a;
                d80 d80Var = (d80) x11Var.f21703b;
                Context context = j40Var.f15966b;
                ic1.h(context);
                k00 k00Var = l00.f16609b;
                ic1.h(k00Var);
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                dx1 dx1VarB = fx1.b(d80Var);
                VersionInfoParcel versionInfoParcel = j40Var.f15965a;
                ic1.h(versionInfoParcel);
                vu0 vu0Var2 = new vu0(context, k00Var, k00Var2, dx1VarB, versionInfoParcel, x11Var, (yh0) fx1Var.zzb());
                zzt.zzc();
                if (zzs.zzF(context.getPackageName())) {
                    k00Var2.execute(new x60(vu0Var2, 16));
                    return;
                }
                x11 x11Var2 = new x11(vu0Var2, 20);
                ic1.h(context);
                ic1.h(versionInfoParcel);
                k00Var.execute(new x60(new pk0(context, versionInfoParcel, x11Var2), 17));
                return;
            case 16:
                ((vu0) this.f21755b).r();
                return;
            case 17:
                d();
                return;
            case 18:
                e();
                return;
            case 19:
                f();
                return;
            case 20:
                g();
                return;
            case 21:
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12088bc)).booleanValue();
                Throwable th4 = (Throwable) this.f21755b;
                if (zBooleanValue) {
                    zzt.zzh().f("TopicsSignalUnsampled.fetchTopicsSignal", th4);
                    return;
                } else {
                    zzt.zzh().e("TopicsSignal.fetchTopicsSignal", th4);
                    return;
                }
            case 22:
                ((us0) this.f21755b).f20884d.j0(pi1.C(6, null, null));
                return;
            case 23:
                ((zs0) this.f21755b).f22706d.j0(pi1.C(6, null, null));
                return;
            case 24:
                ((hp0) this.f21755b).zzg();
                return;
            case 25:
                ((rt0) this.f21755b).f19660d.j0(pi1.C(6, null, null));
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((ut0) this.f21755b).zzg();
                return;
            case 27:
                ((yt0) this.f21755b).f22366d.j0(pi1.C(6, null, null));
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                h();
                return;
            default:
                sv0 sv0Var = (sv0) this.f21755b;
                synchronized (sv0Var) {
                    HashMap map = sv0Var.f20057c;
                    ArrayList arrayList = new ArrayList(map.keySet());
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i12);
                        rv0 rv0Var = (rv0) map.get(scheduledFuture);
                        if (rv0Var != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                            scheduledFuture.cancel(false);
                            map.remove(scheduledFuture);
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis = rv0Var.f19691b - System.currentTimeMillis();
                            Runnable runnable = rv0Var.f19690a;
                            long jMax = Math.max(0L, jCurrentTimeMillis);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            sv0Var.a(runnable, jMax);
                        }
                    }
                }
                return;
        }
    }
}
