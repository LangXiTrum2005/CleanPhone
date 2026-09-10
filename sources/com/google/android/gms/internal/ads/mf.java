package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mf implements of {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static mf f17406r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw f17408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01 f17409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o01 f17410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bg f17411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qz0 f17412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f17413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hh f17414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s6 f17415i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mg f17417k;
    public final b2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g9 f17418m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f17421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f17422q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile long f17419n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f17420o = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CountDownLatch f17416j = new CountDownLatch(1);

    public mf(Context context, qz0 qz0Var, uw uwVar, m01 m01Var, o01 o01Var, bg bgVar, Executor executor, pz0 pz0Var, hh hhVar, mg mgVar, b2 b2Var, g9 g9Var) {
        this.f17422q = false;
        this.f17407a = context;
        this.f17412f = qz0Var;
        this.f17408b = uwVar;
        this.f17409c = m01Var;
        this.f17410d = o01Var;
        this.f17411e = bgVar;
        this.f17413g = executor;
        this.f17414h = hhVar;
        this.f17417k = mgVar;
        this.l = b2Var;
        this.f17418m = g9Var;
        this.f17422q = false;
        this.f17415i = new s6(this, pz0Var);
    }

    public static synchronized mf d(Context context, ExecutorService executorService, sz0 sz0Var, boolean z10) {
        try {
            if (f17406r == null) {
                qz0 qz0VarA = qz0.a(context, executorService, z10);
                vf vfVarC = vf.c(context);
                mg mgVarA = mg.a(context, executorService);
                b2 b2Var = new b2();
                g9 g9Var = new g9();
                hz hzVar = new hz(context, executorService, qz0VarA, new wz0());
                hzVar.f15436e = Tasks.call(executorService, new ns0(hzVar, 3)).addOnFailureListener(executorService, new at0(hzVar, 5));
                ag agVar = new ag(context);
                bg bgVar = new bg(sz0Var, hzVar, new kg(context, agVar), agVar, vfVarC, mgVarA, b2Var, g9Var);
                hh hhVarN = x10.n(context, qz0VarA);
                pz0 pz0Var = new pz0();
                mf mfVar = new mf(context, qz0VarA, new uw(context, hhVarN), new m01(context, hhVarN, new vf(qz0VarA, 6), ((Boolean) zzba.zzc().a(am.f12312q3)).booleanValue()), new o01(context, bgVar, qz0VarA, pz0Var, false), bgVar, executorService, pz0Var, hhVarN, mgVarA, b2Var, g9Var);
                f17406r = mfVar;
                mfVar.a();
                f17406r.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f17406r;
    }

    public final synchronized void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        i01 i01VarE = e();
        if (i01VarE == null) {
            this.f17412f.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f17410d.a(i01VarE)) {
            this.f17422q = true;
            this.f17416j.countDown();
        }
    }

    public final void b() {
        i01 i01Var;
        if (this.f17421p) {
            return;
        }
        synchronized (this.f17420o) {
            try {
                if (!this.f17421p) {
                    if ((System.currentTimeMillis() / 1000) - this.f17419n < 3600) {
                        return;
                    }
                    o01 o01Var = this.f17410d;
                    synchronized (o01Var.f18073g) {
                        try {
                            m01 m01Var = o01Var.f18072f;
                            i01Var = m01Var != null ? (i01) m01Var.f17187c : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if ((i01Var == null || i01Var.f15463a.B() - (System.currentTimeMillis() / 1000) < 3600) && x10.m(this.f17414h)) {
                        this.f17413g.execute(new d(this, 4));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[Catch: all -> 0x0094, et1 -> 0x0097, TryCatch #0 {et1 -> 0x0097, blocks: (B:6:0x0019, B:8:0x0027, B:12:0x002d, B:13:0x003b, B:15:0x0049, B:17:0x0057, B:20:0x0064, B:34:0x009a, B:38:0x00b3, B:44:0x00cc, B:45:0x00d9, B:47:0x00df, B:49:0x00e7, B:50:0x00ea, B:41:0x00bd, B:42:0x00c4, B:23:0x006b, B:25:0x006f, B:27:0x0081, B:51:0x00f4, B:52:0x0101, B:53:0x010e), top: B:60:0x0019, outer: #1 }] */
    public final void c() {
        String strZ;
        String strA;
        int length;
        i01 i01VarE;
        nh nhVar;
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i01 i01VarE2 = e();
        if (i01VarE2 != null) {
            strZ = i01VarE2.f15463a.z();
            strA = i01VarE2.f15463a.A();
        } else {
            strZ = null;
            strA = null;
        }
        try {
            try {
                Context context = this.f17407a;
                hh hhVar = this.f17414h;
                qz0 qz0Var = this.f17412f;
                l01 l01VarD = dv.d(context, hhVar, strZ, strA, qz0Var);
                byte[] bArr = l01VarD.f16617b;
                if (bArr == null || (length = bArr.length) == 0) {
                    qz0Var.b(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        as1 as1VarD = cs1.D(bArr, 0, length);
                        ks1 ks1Var = ks1.f16518a;
                        int i10 = tr1.f20473a;
                        jh jhVarC = jh.C(as1VarD, ks1.f16519b);
                        if (jhVarC.z().z().isEmpty() || jhVarC.z().A().isEmpty() || jhVarC.B().h().length == 0 || ((i01VarE = e()) != null && (nhVar = i01VarE.f15463a) != null && jhVarC.z().z().equals(nhVar.z()) && jhVarC.z().A().equals(nhVar.A()))) {
                            this.f17412f.b(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            s6 s6Var = this.f17415i;
                            int i11 = l01VarD.f16618c;
                            if (!((Boolean) zzba.zzc().a(am.f12281o3)).booleanValue()) {
                                zG = this.f17408b.g(jhVarC, s6Var);
                            } else if (i11 == 3) {
                                zG = this.f17409c.f(jhVarC);
                            } else if (i11 == 4) {
                                zG = this.f17409c.d(jhVarC, s6Var);
                            } else {
                                this.f17412f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zG) {
                                i01 i01VarE3 = e();
                                if (i01VarE3 != null) {
                                    if (this.f17410d.a(i01VarE3)) {
                                        this.f17422q = true;
                                    }
                                    this.f17419n = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f17412f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f17412f.b(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (et1 e10) {
                this.f17412f.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            }
        } finally {
            this.f17416j.countDown();
        }
    }

    public final i01 e() {
        if (x10.m(this.f17414h)) {
            if (((Boolean) zzba.zzc().a(am.f12281o3)).booleanValue()) {
                m01 m01Var = this.f17409c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (m01.f17184f) {
                    try {
                        nh nhVarQ = m01Var.q(1);
                        if (nhVarQ == null) {
                            m01Var.o(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileI = m01Var.i(nhVarQ.z());
                        File file = new File(fileI, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileI, "pcam");
                        }
                        File file2 = new File(fileI, "pcbc");
                        File file3 = new File(fileI, "pcopt");
                        m01Var.o(5016, jCurrentTimeMillis);
                        return new i01(nhVarQ, file, file2, file3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            uw uwVar = this.f17408b;
            nh nhVarL = uwVar.l(1);
            if (nhVarL != null) {
                String strZ = nhVarL.z();
                File fileD = rb0.d(strZ, "pcam.jar", uwVar.o());
                if (!fileD.exists()) {
                    fileD = rb0.d(strZ, "pcam", uwVar.o());
                }
                return new i01(nhVarL, fileD, rb0.d(strZ, "pcbc", uwVar.o()), rb0.d(strZ, "pcopt", uwVar.o()));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzd(MotionEvent motionEvent) {
        m01 m01VarB = this.f17410d.b();
        if (m01VarB != null) {
            try {
                m01VarB.h(motionEvent);
            } catch (n01 e10) {
                this.f17412f.c(e10.f17605a, -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zze(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzba.zzc().a(am.Gd)).booleanValue() || (displayMetrics = this.f17407a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzf(Context context, String str, View view, Activity activity) {
        mg mgVar = this.f17417k;
        if (mgVar.f17430d) {
            mgVar.f17428b = System.currentTimeMillis();
        }
        b2 b2Var = this.l;
        b2Var.f12603h = b2Var.f12602g;
        b2Var.f12602g = SystemClock.uptimeMillis();
        b();
        m01 m01VarB = this.f17410d.b();
        if (m01VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = m01VarB.g(context, str, view, activity);
        this.f17412f.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzh(View view) {
        this.f17411e.f12759c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.f17418m.f14798a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzj(Context context, View view, Activity activity) {
        mg mgVar = this.f17417k;
        if (mgVar.f17430d) {
            mgVar.f17428b = System.currentTimeMillis();
        }
        this.l.c(context, view);
        b();
        m01 m01VarB = this.f17410d.b();
        if (m01VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = m01VarB.e(context, view, activity);
        this.f17412f.e(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - jCurrentTimeMillis, null, strE, null);
        return strE;
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzl(Context context) {
        mg mgVar = this.f17417k;
        if (mgVar.f17430d) {
            mgVar.f17428b = System.currentTimeMillis();
        }
        b2 b2Var = this.l;
        b2Var.f12597b = b2Var.f12596a;
        b2Var.f12596a = SystemClock.uptimeMillis();
        b();
        m01 m01VarB = this.f17410d.b();
        if (m01VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = m01VarB.b(context);
        this.f17412f.e(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - jCurrentTimeMillis, null, strB, null);
        return strB;
    }
}
