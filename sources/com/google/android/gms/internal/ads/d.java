package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProfileStore;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.core.fid.Constants;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13322b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f13321a = i10;
        this.f13322b = obj;
    }

    private final void a() {
        pb pbVar = (pb) this.f13322b;
        synchronized (pbVar) {
            try {
                t6.l lVar = (t6.l) pbVar.f18584c;
                if (lVar.f50549b) {
                    xh xhVar = (xh) lVar.f50550c;
                    byte[] bArr = (byte[]) pbVar.f18583b;
                    vh vhVar = (vh) xhVar;
                    Parcel parcelQ = vhVar.q();
                    parcelQ.writeByteArray(bArr);
                    vhVar.m0(parcelQ, 5);
                    vh vhVar2 = (vh) ((xh) lVar.f50550c);
                    Parcel parcelQ2 = vhVar2.q();
                    parcelQ2.writeInt(0);
                    vhVar2.m0(parcelQ2, 6);
                    xh xhVar2 = (xh) lVar.f50550c;
                    int i10 = pbVar.f18582a;
                    vh vhVar3 = (vh) xhVar2;
                    Parcel parcelQ3 = vhVar3.q();
                    parcelQ3.writeInt(i10);
                    vhVar3.m0(parcelQ3, 7);
                    vh vhVar4 = (vh) ((xh) lVar.f50550c);
                    Parcel parcelQ4 = vhVar4.q();
                    parcelQ4.writeIntArray(null);
                    vhVar4.m0(parcelQ4, 4);
                    vh vhVar5 = (vh) ((xh) lVar.f50550c);
                    vhVar5.m0(vhVar5.q(), 3);
                }
            } catch (RemoteException e10) {
                zzo.zze("Clearcut log failed", e10);
            }
        }
    }

    private final void b() throws Throwable {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f13322b;
        dVar.getClass();
        while (true) {
            try {
                gm gmVar = (gm) ((ArrayBlockingQueue) dVar.f22981a).take();
                fm fmVarB = gmVar.b();
                if (!TextUtils.isEmpty(fmVarB.f14458a)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f22982b;
                    synchronized (gmVar.f14898c) {
                        zzt.zzh().a();
                        linkedHashMap = gmVar.f14897b;
                    }
                    dVar.x(dVar.w(linkedHashMap2, linkedHashMap), fmVarB);
                }
            } catch (InterruptedException e10) {
                int i10 = zze.zza;
                zzo.zzj("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void c() {
        long j10;
        long j11;
        long j12;
        i20 i20Var = (i20) this.f13322b;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzg(i20Var.f15525e)));
        try {
            long jLongValue = ((Long) zzba.zzc().a(am.f12309q0)).longValue() * 1000;
            long jIntValue = ((Integer) zzba.zzc().a(am.A)).intValue();
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.G2)).booleanValue();
            synchronized (i20Var) {
                ((p9.b) zzt.zzk()).getClass();
                if (System.currentTimeMillis() - i20Var.f15529i > jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb2.append("Timeout reached. Limit: ");
                    sb2.append(jLongValue);
                    sb2.append(" ms");
                    throw new IOException(sb2.toString());
                }
                if (i20Var.f15526f) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!i20Var.f15527g) {
                    xz1 xz1Var = i20Var.f15524d.f19289g;
                    if (!(xz1Var != null)) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jX0 = xz1Var.X0();
                    if (jX0 > 0) {
                        long jY0 = i20Var.f15524d.f19289g.Y0();
                        if (jY0 != i20Var.f15530j) {
                            boolean z10 = jY0 > 0;
                            String str = i20Var.f15525e;
                            if (zBooleanValue) {
                                r20 r20Var = i20Var.f15524d;
                                j12 = (r20Var.f19300s == null || !r20Var.f19300s.f17224p) ? r20Var.f19293k : 0L;
                            } else {
                                j12 = -1;
                            }
                            long jP = zBooleanValue ? i20Var.f15524d.p() : -1L;
                            j10 = jX0;
                            j11 = jY0;
                            zzf.zza.post(new a20(i20Var, str, strConcat, j11, j10, j12, jP, zBooleanValue ? i20Var.f15524d.q() : -1L, z10, r20.f19281u.get(), r20.f19282v.get()));
                            i20Var.f15530j = j11;
                        } else {
                            j10 = jX0;
                            j11 = jY0;
                        }
                        if (j11 >= j10) {
                            zzf.zza.post(new com.adjust.sdk.i0(i20Var, i20Var.f15525e, strConcat, j10, 3));
                        } else if (i20Var.f15524d.f19293k >= jIntValue && j11 > 0) {
                        }
                    }
                    zzs.zza.postDelayed(new d(i20Var, 22), ((Long) zzba.zzc().a(am.r0)).longValue());
                    return;
                }
                zzt.zzB().f22072a.remove(i20Var.f15528h);
            }
        } catch (Exception e10) {
            String str2 = i20Var.f15525e;
            String message = e10.getMessage();
            String strH = d5.u.h(new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str2, " Exception: ", message);
            int i10 = zze.zza;
            zzo.zzi(strH);
            zzt.zzh().e("VideoStreamExoPlayerCache.preload", e10);
            i20Var.g();
            i20Var.q(i20Var.f15525e, strConcat, "error", i20.s("error", e10));
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        String strB;
        yh0 yh0Var;
        ActivityManager.MemoryInfo memoryInfoZze;
        ProfileStore profileStore = null;
        int i10 = 1;
        boolean z10 = false;
        switch (this.f13321a) {
            case 0:
                ((m) this.f13322b).i();
                return;
            case 1:
                h42 h42Var = (h42) ((d0) this.f13322b);
                for (n42 n42Var : h42Var.f15141s) {
                    n42Var.k(true);
                    if (n42Var.f17651g != null) {
                        n42Var.f17651g = null;
                        n42Var.f17650f = null;
                    }
                }
                ay0 ay0Var = h42Var.f15134k;
                m2 m2Var = (m2) ay0Var.f12538c;
                if (m2Var != null) {
                    m2Var.zzf();
                    ay0Var.f12538c = null;
                }
                ay0Var.f12539d = null;
                return;
            case 2:
                ((n0) this.f13322b).f17602h.zza();
                return;
            case 3:
                ((c1) this.f13322b).f12983m--;
                return;
            case 4:
                mf mfVar = (mf) this.f13322b;
                synchronized (mfVar.f17420o) {
                    if (mfVar.f17421p) {
                        return;
                    }
                    mfVar.f17421p = true;
                    try {
                        mfVar.c();
                        break;
                    } catch (Exception e10) {
                        ((mf) this.f13322b).f17412f.c(2023, -1L, e10);
                    }
                    mf mfVar2 = (mf) this.f13322b;
                    synchronized (mfVar2.f17420o) {
                        mfVar2.f17421p = false;
                        break;
                    }
                    return;
                }
            case 5:
                nf nfVar = (nf) this.f13322b;
                if (nfVar.f17794b != null) {
                    return;
                }
                synchronized (nf.f17790c) {
                    if (nfVar.f17794b != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) am.f12449z3.o()).booleanValue();
                        break;
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            nf.f17791d = q01.a(((nf) this.f13322b).f17793a.f14387a, "ADSHIELD");
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    z10 = zBooleanValue;
                    ((nf) this.f13322b).f17794b = Boolean.valueOf(z10);
                    nf.f17790c.open();
                    return;
                }
            case 6:
                ((kg) this.f13322b).c();
                return;
            case 7:
                xg xgVar = (xg) this.f13322b;
                xgVar.getClass();
                try {
                    fg fgVar = xgVar.f21865a;
                    DexClassLoader dexClassLoader = fgVar.f14389c;
                    byte[] bArr = fgVar.f14391e;
                    String str = xgVar.f21866b;
                    fgVar.f14390d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(s6.s(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = fgVar.f14391e;
                        String str2 = xgVar.f21867c;
                        xgVar.f21865a.f14390d.getClass();
                        xgVar.f21868d = clsLoadClass.getMethod(new String(s6.s(str2, bArr2), "UTF-8"), xgVar.f21869e);
                    }
                    break;
                } catch (wf | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } finally {
                    xgVar.f21870f.countDown();
                }
                return;
            case 8:
                ((bi) this.f13322b).d(3);
                return;
            case 9:
                hi hiVar = (hi) this.f13322b;
                synchronized (hiVar.f15296c) {
                    if (hiVar.f15297d.get() && hiVar.f15298e) {
                        hiVar.f15297d.set(false);
                        int i11 = zze.zza;
                        zzo.zzd("App went background");
                        Iterator it = hiVar.f15299f.iterator();
                        while (it.hasNext()) {
                            try {
                                ((ii) it.next()).zza(false);
                            } catch (Exception e11) {
                                zzo.zzg("", e11);
                            }
                        }
                    } else {
                        int i12 = zze.zza;
                        zzo.zzd("App is still foreground");
                    }
                    break;
                }
                return;
            case 10:
                ((ej) this.f13322b).c();
                return;
            case 11:
                a();
                return;
            case 12:
                b();
                return;
            case 13:
                lm lmVar = (lm) this.f13322b;
                Context context = lmVar.f17056c;
                if (lmVar.f17059f != null || context == null || (strB = u.g.b(context, null, false)) == null || strB.equals(context.getPackageName())) {
                    return;
                }
                u.g.a(context, strB, lmVar);
                return;
            case 14:
                ((qm) this.f13322b).d();
                return;
            case 15:
                i9.i iVar = (i9.i) this.f13322b;
                if (((hj) iVar.f42937a) == null) {
                    return;
                }
                ((hj) iVar.f42937a).disconnect();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((a8) this.f13322b).f11930f).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f13322b).getAndSet(true);
                return;
            case 18:
                i00 i00Var = (i00) this.f13322b;
                while (i00Var.f15460e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    zzs.zza.post(new d(atomicBoolean, 17));
                    try {
                        Thread.sleep(i00Var.f15461f);
                        if (!atomicBoolean.get()) {
                            if (((Boolean) zzba.zzc().a(am.Af)).booleanValue() && (yh0Var = i00Var.f15457b) != null) {
                                lj1 lj1VarA = yh0Var.a();
                                lj1VarA.l("action", "panr");
                                if (((Boolean) zzba.zzc().a(am.f12107cg)).booleanValue() && (memoryInfoZze = zzf.zze(i00Var.f15458c)) != null) {
                                    lj1VarA.l("mem_avl", String.valueOf(memoryInfoZze.availMem));
                                    lj1VarA.l("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                                    lj1VarA.l("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
                                }
                                lj1VarA.r();
                            }
                            if (((Boolean) zzba.zzc().a(am.Bf)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                zs zsVar = new zs("Potential ANR detected", 2);
                                zsVar.setStackTrace(stackTrace);
                                if (((Boolean) zzba.zzc().a(am.Cf)).booleanValue()) {
                                    zw.e(i00Var.f15458c).b(zsVar, "AnrWatchdog", ((Integer) zzba.zzc().a(am.Df)).intValue() / 100.0f);
                                } else {
                                    zzt.zzh().d("AnrWatchdog", zsVar);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(i00Var.f15462g);
                            } catch (InterruptedException unused4) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 19:
                ((z00) this.f13322b).k();
                return;
            case 20:
                d10 d10Var = (d10) ((x00) this.f13322b);
                boolean z11 = d10Var.f13342h;
                ImageView imageView = d10Var.f13350q;
                if (z11 && imageView.getParent() != null) {
                    d10Var.f13336b.removeView(imageView);
                }
                z00 z00Var = d10Var.f13341g;
                if (z00Var == null || d10Var.f13349p == null) {
                    return;
                }
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (z00Var.getBitmap(d10Var.f13349p) != null) {
                    d10Var.f13351r = true;
                }
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zze.zzc()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                    sb2.append("Spinner frame grab took ");
                    sb2.append(jElapsedRealtime2);
                    sb2.append("ms");
                    zze.zza(sb2.toString());
                }
                if (jElapsedRealtime2 > d10Var.f13340f) {
                    zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    d10Var.f13345k = false;
                    d10Var.f13349p = null;
                    gm gmVar = d10Var.f13338d;
                    if (gmVar != null) {
                        gmVar.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                zzt.zzB().f22072a.remove((w10) this.f13322b);
                return;
            case 22:
                c();
                return;
            case 23:
                b30 b30Var = ((g30) this.f13322b).f14694a;
                b30Var.p();
                zzm zzmVarZzL = b30Var.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzv();
                    return;
                }
                return;
            case 24:
                int i13 = g30.I;
                com.google.android.gms.internal.consent_sdk.d dVarA = zzt.zzh().a();
                String str3 = (String) this.f13322b;
                if (((HashSet) dVarA.f22987g).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) dVarA.f22986f);
                linkedHashMap.put("ue", str3);
                dVarA.x(dVarA.w((LinkedHashMap) dVarA.f22982b, linkedHashMap), null);
                return;
            case 25:
                im0 im0VarZzu = zzt.zzu();
                ky0 ky0Var = ((km0) this.f13322b).f16480a;
                ((tc0) im0VarZzu).getClass();
                tc0.o(new cm0(ky0Var, i10));
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                f40 f40Var = (f40) this.f13322b;
                yh0 yh0Var2 = f40Var.f14210b;
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                b40 b40Var = f40Var.f14209a;
                b40Var.getClass();
                if (!a.a.x("MULTI_PROFILE")) {
                    int i14 = zze.zza;
                    zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e12) {
                    String strValueOf = String.valueOf(e12.getMessage());
                    int i15 = zze.zza;
                    zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e13) {
                        zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e13.getMessage())));
                    }
                }
                if (profileStore == null) {
                    int i16 = zze.zza;
                    zzo.zzi("WebViewCompat failure: No instance");
                    if (((Boolean) zzba.zzc().a(am.Jf)).booleanValue()) {
                        lj1 lj1VarA2 = yh0Var2.a();
                        lj1VarA2.l("action", "webview_p_f");
                        lj1VarA2.l("webview_p_f", "No instance");
                        lj1VarA2.m();
                        return;
                    }
                    return;
                }
                b40Var.f12627a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) zzba.zzc().a(am.Jf)).booleanValue()) {
                    ((p9.b) zzt.zzk()).getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    lj1 lj1VarA3 = yh0Var2.a();
                    lj1VarA3.l("action", "webview_p_l");
                    lj1VarA3.l("webview_p_l", Long.toString(jElapsedRealtime4));
                    lj1VarA3.m();
                    return;
                }
                return;
            case 27:
                ((h40) this.f13322b).a();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ak0 ak0Var = (ak0) this.f13322b;
                Context context2 = ak0Var.f12047a;
                try {
                    if (ak0Var.f12050d.zzP()) {
                        return;
                    }
                    zj0 zj0Var = ak0Var.f12048b;
                    zj0Var.f22640b = new qa(zj0Var.f22639a);
                    zj0Var.a(new so0(ak0Var));
                    return;
                } catch (Exception e14) {
                    if (((Boolean) zzba.zzc().a(am.Z5)).booleanValue()) {
                        if (ak0Var.f12052f == null) {
                            ak0Var.f12052f = zw.e(context2);
                        }
                        ak0Var.f12052f.a("InstallReferrerUnsampled.initializeAndReport", e14);
                        return;
                    } else {
                        if (ak0Var.f12051e == null) {
                            ak0Var.f12051e = zw.c(context2);
                        }
                        ak0Var.f12051e.a("InstallReferrer.initializeAndReport", e14);
                        return;
                    }
                }
            default:
                ((w60) this.f13322b).f21430b.f22179d.zzl();
                return;
        }
    }
}
