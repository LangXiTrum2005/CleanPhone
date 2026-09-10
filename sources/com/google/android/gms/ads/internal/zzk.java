package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.jd;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.m01;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.nh;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qz0;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.rz0;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.vf;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.zw1;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Runnable, of {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f11197p = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f11204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qz0 f11205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f11206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f11207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VersionInfoParcel f11208k;
    public final VersionInfoParcel l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11209m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11211o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f11198a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11199b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f11200c = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CountDownLatch f11210n = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.f11206i = context;
        this.f11207j = context;
        this.f11208k = versionInfoParcel;
        this.l = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f11204g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12340s3)).booleanValue();
        this.f11209m = zBooleanValue;
        this.f11205h = qz0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f11202e = ((Boolean) zzba.zzc().a(am.f12296p3)).booleanValue();
        this.f11203f = ((Boolean) zzba.zzc().a(am.f12356t3)).booleanValue();
        if (((Boolean) zzba.zzc().a(am.r3)).booleanValue()) {
            this.f11211o = 2;
        } else {
            this.f11211o = 1;
        }
        if (!((Boolean) zzba.zzc().a(am.f12418x4)).booleanValue()) {
            this.f11201d = a();
        }
        if (((Boolean) zzba.zzc().a(am.f12357t4)).booleanValue()) {
            l00.f16608a.execute(this);
            return;
        }
        zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            l00.f16608a.execute(this);
        } else {
            run();
        }
    }

    public static final mf e(Context context, VersionInfoParcel versionInfoParcel, boolean z10, boolean z11) {
        mf mfVarD;
        jd jdVarD = kd.D();
        jdVarD.b();
        ((kd) jdVarD.f19193b).F(z10);
        String str = versionInfoParcel.afmaVersion;
        jdVarD.b();
        ((kd) jdVarD.f19193b).E(str);
        kd kdVar = (kd) jdVarD.e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (mf.class) {
            rz0 rz0Var = new rz0();
            rz0Var.f19736b = false;
            byte b10 = (byte) (rz0Var.f19740f | 1);
            rz0Var.f19737c = true;
            rz0Var.f19738d = 100L;
            rz0Var.f19739e = 300L;
            rz0Var.f19740f = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
            String strZ = kdVar.z();
            if (strZ == null) {
                throw new NullPointerException("Null clientVersion");
            }
            rz0Var.f19735a = strZ;
            rz0Var.f19736b = kdVar.A();
            rz0Var.f19740f = (byte) (rz0Var.f19740f | 1);
            mfVarD = mf.d(context, Executors.newCachedThreadPool(), rz0Var.a(), z11);
        }
        return mfVarD;
    }

    public final boolean a() {
        Context context = this.f11206i;
        zzh zzhVar = new zzh(this);
        m01 m01Var = new m01(context, x10.n(context, this.f11205h), zzhVar, ((Boolean) zzba.zzc().a(am.f12312q3)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (m01.f17184f) {
            try {
                nh nhVarQ = m01Var.q(1);
                if (nhVarQ == null) {
                    m01Var.o(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileI = m01Var.i(nhVarQ.z());
                if (!new File(fileI, "pcam.jar").exists()) {
                    m01Var.o(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileI, "pcbc").exists()) {
                    m01Var.o(5019, jCurrentTimeMillis);
                    return true;
                }
                m01Var.o(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        of ofVarD = d();
        Vector<Object[]> vector = this.f11198a;
        if (vector.isEmpty() || ofVarD == null) {
            return;
        }
        for (Object[] objArr : vector) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    ofVarD.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    ofVarD.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void c(boolean z10) {
        String str = this.f11208k.afmaVersion;
        Context context = this.f11206i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        jd jdVarD = kd.D();
        jdVarD.b();
        ((kd) jdVarD.f19193b).F(z10);
        jdVarD.b();
        ((kd) jdVarD.f19193b).E(str);
        l lVar = new l((kd) jdVarD.e());
        synchronized (pf.class) {
            if (!pf.f18598y) {
                pf.f18599z = System.currentTimeMillis() / 1000;
                pf.f18596w = pf.e(context, lVar.f50549b);
                pf.A = vf.c(context);
                ExecutorService executorService = pf.f18596w.f14388b;
                pf.B = mg.a(context, executorService);
                pf.C = new b2();
                so0 so0Var = new so0(context, executorService);
                pf.E = so0Var;
                pf.D = new af(context, executorService, (td) lVar.f50551d, so0Var);
                pf.f18598y = true;
            }
        }
        this.f11199b.set(new pf(context, lVar));
    }

    public final of d() {
        return ((!this.f11202e || this.f11201d) ? this.f11211o : 1) == 2 ? (of) this.f11200c.get() : (of) this.f11199b.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            if (((Boolean) zzba.zzc().a(am.f12418x4)).booleanValue()) {
                this.f11201d = a();
            }
            boolean z11 = this.f11208k.isClientJar;
            final boolean z12 = false;
            if (!((Boolean) zzba.zzc().a(am.N1)).booleanValue() && z11) {
                z12 = true;
            }
            if (((!this.f11202e || this.f11201d) ? this.f11211o : 1) == 1) {
                c(z12);
                if (this.f11211o == 2) {
                    this.f11204g.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzk zzkVar = this.f11193a;
                            boolean z13 = z12;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                zzk.e(zzkVar.f11207j, zzkVar.l, z13, zzkVar.f11209m).b();
                            } catch (NullPointerException e10) {
                                zzkVar.f11205h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                            }
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    mf mfVarE = e(this.f11206i, this.f11208k, z12, this.f11209m);
                    this.f11200c.set(mfVarE);
                    if (this.f11203f) {
                        synchronized (mfVarE) {
                            z10 = mfVarE.f17422q;
                        }
                        if (!z10) {
                            this.f11211o = 1;
                            c(z12);
                        }
                    }
                } catch (NullPointerException e10) {
                    this.f11211o = 1;
                    c(z12);
                    this.f11205h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.f11210n.countDown();
            this.f11206i = null;
            this.f11208k = null;
        } catch (Throwable th2) {
            this.f11210n.countDown();
            this.f11206i = null;
            this.f11208k = null;
            throw th2;
        }
    }

    public final boolean zza() {
        try {
            this.f11210n.await();
            return true;
        } catch (InterruptedException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        of ofVarD;
        if (!zza() || (ofVarD = d()) == null) {
            return "";
        }
        b();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return ofVarD.zzl(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzc() {
        int i10 = this.f11211o;
        int i11 = i10 - 1;
        if (i10 != 0) {
            return i11 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzd(MotionEvent motionEvent) {
        of ofVarD = d();
        if (ofVarD == null) {
            this.f11198a.add(new Object[]{motionEvent});
            return;
        }
        b();
        try {
            ofVarD.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zze(int i10, int i11, int i12) {
        of ofVarD = d();
        if (ofVarD == null) {
            this.f11198a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            b();
            try {
                ofVarD.zze(i10, i11, i12);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        of ofVarD = d();
        if (((Boolean) zzba.zzc().a(am.f12273nc)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (ofVarD == null) {
            return "";
        }
        b();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return ofVarD.zzf(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzh(View view) {
        of ofVarD = d();
        if (ofVarD != null) {
            try {
                ofVarD.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        of ofVarD;
        of ofVarD2;
        try {
            if (((Boolean) zzba.zzc().a(am.M3)).booleanValue()) {
                if (this.f11210n.getCount() != 0 || (ofVarD2 = d()) == null) {
                    return;
                }
                ofVarD2.zzi(stackTraceElementArr);
                return;
            }
            if (!zza() || (ofVarD = d()) == null) {
                return;
            }
            ofVarD.zzi(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzba.zzc().a(am.f12259mc)).booleanValue()) {
                of ofVarD = d();
                if (((Boolean) zzba.zzc().a(am.f12273nc)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return ofVarD != null ? ofVarD.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            of ofVarD2 = d();
            if (((Boolean) zzba.zzc().a(am.f12273nc)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return ofVarD2 != null ? ofVarD2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzk(final Context context) {
        try {
            return (String) zw1.o(this.f11204g, new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f11195a.zzb(context, null);
                }
            }).get(((Integer) zzba.zzc().a(am.G3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.l.afmaVersion;
            long j10 = f11197p;
            try {
                qe qeVarZ = re.z();
                qeVarZ.b();
                ((re) qeVarZ.f19193b).B(str);
                qeVarZ.b();
                ((re) qeVarZ.f19193b).A("0.828153725");
                String packageName = context.getPackageName();
                qeVarZ.b();
                ((re) qeVarZ.f19193b).D(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
                qeVarZ.b();
                ((re) qeVarZ.f19193b).F(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                qeVarZ.b();
                ((re) qeVarZ.f19193b).C(jCurrentTimeMillis2);
                try {
                    long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    qeVarZ.b();
                    ((re) qeVarZ.f19193b).E(j11);
                } catch (PackageManager.NameNotFoundException unused3) {
                    qeVarZ.b();
                    ((re) qeVarZ.f19193b).E(-1L);
                }
                ue ueVarB = cf.b(null, ((re) qeVarZ.e()).b());
                ueVarB.b();
                ((ve) ueVarB.f19193b).C(5);
                ueVarB.b();
                ((ve) ueVarB.f19193b).D(2);
                return Base64.encodeToString(((ve) ueVarB.e()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzl(Context context) {
        return zzb(context, null);
    }
}
