package ta;

import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.ts;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import ea.a1;
import ea.b1;
import ea.b2;
import ea.c1;
import ea.c3;
import ea.d2;
import ea.e4;
import ea.f2;
import ea.f3;
import ea.g3;
import ea.h3;
import ea.j1;
import ea.l1;
import ea.l4;
import ea.m1;
import ea.n4;
import ea.p2;
import ea.p3;
import ea.s1;
import ea.t2;
import ea.t3;
import ea.u1;
import ea.v1;
import ea.w2;
import ea.x1;
import ea.y1;
import ea.z0;
import ea.z1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f50623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50624c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f50622a = i10;
        this.f50623b = obj;
        this.f50624c = obj2;
    }

    private final void a() {
        h3 h3Var = ((g3) this.f50624c).f39429c;
        h3Var.f39458d = null;
        if (((ConnectionResult) this.f50623b).f11641b != 7777) {
            h3Var.V0();
            return;
        }
        if (h3Var.f39461g == null) {
            h3Var.f39461g = Executors.newScheduledThreadPool(1);
        }
        h3Var.f39461g.schedule(new androidx.lifecycle.a0(this, 12), ((Long) ea.d0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void b() {
        e4 e4Var = (e4) this.f50623b;
        e4Var.V();
        Runnable runnable = (Runnable) this.f50624c;
        e4Var.P().G0();
        if (e4Var.f39385p == null) {
            e4Var.f39385p = new ArrayList();
        }
        e4Var.f39385p.add(runnable);
        e4Var.l();
    }

    private final void c() {
        d5.o oVarG = d5.o.g();
        String str = f5.a.f40655d;
        m5.i iVar = (m5.i) this.f50623b;
        oVarG.e(str, defpackage.e.n("Scheduling work ", iVar.f45882a), new Throwable[0]);
        ((f5.a) this.f50624c).f40656a.a(iVar);
    }

    private final void d() {
        Context context = (Context) this.f50623b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f50624c;
        try {
            fa.a.b(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private final void e() {
        g1.a aVar = (g1.a) this.f50624c;
        Object obj = this.f50623b;
        if (aVar.f41337c.get()) {
            g9.d dVar = aVar.f41339e;
            if (dVar.f41758h == aVar) {
                SystemClock.uptimeMillis();
                dVar.f41758h = null;
                dVar.b();
            }
        } else {
            g9.d dVar2 = aVar.f41339e;
            if (dVar2.f41757g != aVar) {
                if (dVar2.f41758h == aVar) {
                    SystemClock.uptimeMillis();
                    dVar2.f41758h = null;
                    dVar2.b();
                }
            } else if (!dVar2.f41753c) {
                SystemClock.uptimeMillis();
                dVar2.f41757g = null;
                f1.b bVar = dVar2.f41751a;
                if (bVar != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.j(obj);
                    } else {
                        bVar.h(obj);
                    }
                }
            }
        }
        aVar.f41336b = 3;
    }

    private final void f() {
        IBinder iBinder = (IBinder) this.f50624c;
        h9.i iVar = (h9.i) this.f50623b;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.b("Null service connection");
                return;
            }
            try {
                iVar.f42274c = new eb.d0(iBinder);
                iVar.f42272a = 2;
                ((ScheduledExecutorService) iVar.f42277f.f42288c).execute(new h9.g(iVar, 1));
            } catch (RemoteException e10) {
                iVar.b(e10.getMessage());
            }
        }
    }

    private final void g() {
        h9.j jVar = (h9.j) this.f50624c;
        h9.i iVar = (h9.i) this.f50623b;
        int i10 = jVar.f42278a;
        synchronized (iVar) {
            SparseArray sparseArray = iVar.f42276e;
            h9.j jVar2 = (h9.j) sparseArray.get(i10);
            if (jVar2 != null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                sb2.append("Timing out request: ");
                sb2.append(i10);
                Log.w("MessengerIpcClient", sb2.toString());
                sparseArray.remove(i10);
                jVar2.c(new zs(7, "Timed out waiting for response", null));
                iVar.d();
            }
        }
    }

    private final void h() {
        int i10 = 0;
        while (true) {
            try {
                ((Runnable) this.f50623b).run();
            } catch (Throwable th2) {
                cn.d0.t(ak.l.f3620a, th2);
            }
            try {
                Runnable runnableT = ((hn.h) this.f50624c).t();
                if (runnableT == null) {
                    return;
                }
                this.f50623b = runnableT;
                i10++;
                if (i10 >= 16) {
                    hn.h hVar = (hn.h) this.f50624c;
                    if (hn.b.j(hVar.f42434c, hVar)) {
                        hn.h hVar2 = (hn.h) this.f50624c;
                        hn.b.i(hVar2.f42434c, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                hn.h hVar3 = (hn.h) this.f50624c;
                synchronized (hVar3.f42437f) {
                    hn.h.f42432g.decrementAndGet(hVar3);
                    throw th3;
                }
            }
        }
    }

    private final void i() {
        od.c cVar = (od.c) this.f50623b;
        Typeface typeface = (Typeface) this.f50624c;
        k3 k3Var = (k3) cVar.f47386b;
        if (k3Var != null) {
            k3Var.m(typeface);
        }
    }

    private final void j() {
        j6.c cVar = (j6.c) this.f50624c;
        if (cVar.f43719d) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            ((Runnable) this.f50623b).run();
        } catch (Throwable th2) {
            cVar.f43718c.getClass();
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x047e A[Catch: NameNotFoundException -> 0x049b, TryCatch #12 {NameNotFoundException -> 0x049b, blocks: (B:156:0x0473, B:158:0x047e, B:160:0x048a), top: B:478:0x0473 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x048a A[Catch: NameNotFoundException -> 0x049b, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x049b, blocks: (B:156:0x0473, B:158:0x047e, B:160:0x048a), top: B:478:0x0473 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x048f  */
    /* JADX WARN: Code duplicated, block: B:171:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:173:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:175:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:177:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:181:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:183:0x04da  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:186:0x0505  */
    /* JADX WARN: Code duplicated, block: B:187:0x0510  */
    /* JADX WARN: Code duplicated, block: B:188:0x051b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0526  */
    /* JADX WARN: Code duplicated, block: B:190:0x0531  */
    /* JADX WARN: Code duplicated, block: B:194:0x0545  */
    /* JADX WARN: Code duplicated, block: B:195:0x0546 A[Catch: IllegalStateException -> 0x0567, TryCatch #9 {IllegalStateException -> 0x0567, blocks: (B:192:0x053d, B:196:0x054c, B:200:0x0554, B:202:0x0558, B:195:0x0546), top: B:472:0x053d }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0552  */
    /* JADX WARN: Code duplicated, block: B:199:0x0553  */
    /* JADX WARN: Code duplicated, block: B:202:0x0558 A[Catch: IllegalStateException -> 0x0567, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x0567, blocks: (B:192:0x053d, B:196:0x054c, B:200:0x0554, B:202:0x0558, B:195:0x0546), top: B:472:0x053d }] */
    /* JADX WARN: Code duplicated, block: B:208:0x058a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0598  */
    /* JADX WARN: Code duplicated, block: B:213:0x059f  */
    /* JADX WARN: Code duplicated, block: B:217:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x05ba A[Catch: NotFoundException -> 0x05bf, TRY_LEAVE, TryCatch #10 {NotFoundException -> 0x05bf, blocks: (B:215:0x05a9, B:218:0x05ba), top: B:474:0x05a9 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:226:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:227:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:233:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:235:0x0602  */
    /* JADX WARN: Code duplicated, block: B:236:0x0609  */
    /* JADX WARN: Code duplicated, block: B:239:0x0626  */
    /* JADX WARN: Code duplicated, block: B:241:0x0670  */
    /* JADX WARN: Code duplicated, block: B:242:0x0679  */
    /* JADX WARN: Code duplicated, block: B:245:0x069b  */
    /* JADX WARN: Code duplicated, block: B:248:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:249:0x06de  */
    /* JADX WARN: Code duplicated, block: B:252:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:255:0x06ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:257:0x06f2 A[PHI: r13
  0x06f2: PHI (r13v27 boolean) = (r13v11 boolean), (r13v9 boolean) binds: [B:256:0x06f1, B:253:0x06ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:259:0x0725  */
    /* JADX WARN: Code duplicated, block: B:260:0x073d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0766 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x076e  */
    /* JADX WARN: Code duplicated, block: B:268:0x0786  */
    /* JADX WARN: Code duplicated, block: B:269:0x079a A[PHI: r27 r28
  0x079a: PHI (r27v2 bo.b) = (r27v0 bo.b), (r27v3 bo.b) binds: [B:267:0x0784, B:265:0x0769] A[DONT_GENERATE, DONT_INLINE]
  0x079a: PHI (r28v2 ea.l4) = (r28v0 ea.l4), (r28v3 ea.l4) binds: [B:267:0x0784, B:265:0x0769] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:271:0x07a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:283:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:284:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:287:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:290:0x080c  */
    /* JADX WARN: Code duplicated, block: B:293:0x082b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0839 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:301:0x0856  */
    /* JADX WARN: Code duplicated, block: B:303:0x085c  */
    /* JADX WARN: Code duplicated, block: B:305:0x087a  */
    /* JADX WARN: Code duplicated, block: B:309:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:312:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:317:0x08da  */
    /* JADX WARN: Code duplicated, block: B:319:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:321:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:322:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:325:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:328:0x0915  */
    /* JADX WARN: Code duplicated, block: B:332:0x0921  */
    /* JADX WARN: Code duplicated, block: B:335:0x092f  */
    /* JADX WARN: Code duplicated, block: B:338:0x0943  */
    /* JADX WARN: Code duplicated, block: B:339:0x0948  */
    /* JADX WARN: Code duplicated, block: B:341:0x095a  */
    /* JADX WARN: Code duplicated, block: B:343:0x097a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:356:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:370:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:377:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:381:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:383:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:384:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:386:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:388:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:391:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:395:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:466:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x05a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0282  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [ea.o2] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        ea.l0 l0Var;
        String string;
        int i10;
        String str;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iB;
        List listAsList;
        m1 m1Var;
        Bundle bundleS0;
        Integer numValueOf;
        String[] stringArray;
        t2 t2Var;
        bo.b bVar;
        bo.b bVar2;
        bo.b bVar3;
        bo.b bVar4;
        String strM0;
        int i11;
        AtomicInteger atomicInteger;
        long j10;
        x1 x1Var;
        final p2 p2Var;
        int iL0;
        boolean zR0;
        boolean z10;
        m1 m1Var2;
        bo.b bVar5;
        ea.s0 s0Var;
        bc.s sVar;
        y1 y1VarN0;
        v1 v1VarW0;
        m1 m1Var3;
        v1 v1VarW1;
        v1 v1Var;
        bo.b bVar6;
        l4 l4Var;
        y1 y1Var;
        boolean z11;
        m1 m1Var4;
        v1 v1VarW2;
        v1 v1VarW3;
        Boolean boolT0;
        z0 z0Var;
        l1 l1Var;
        m1 m1Var5;
        l4 l4Var2;
        bc.s sVar2;
        ea.s0 s0Var2;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z12;
        long jMax;
        bo.b bVar7;
        Context context;
        boolean z13;
        Iterator it;
        String str2;
        l4 l4Var3;
        String strB;
        Bundle bundle;
        Long lValueOf;
        switch (this.f50622a) {
            case 0:
                f2 f2Var = (f2) this.f50624c;
                ListenableFuture listenableFuture = (ListenableFuture) this.f50623b;
                if ((listenableFuture instanceof ua.a) && (thA = ((ua.a) listenableFuture).a()) != null) {
                    f2Var.v(thA);
                    return;
                }
                try {
                    k0.b(listenableFuture);
                    p2 p2Var2 = (p2) f2Var.f39410c;
                    p2Var2.G0();
                    m1 m1Var6 = (m1) p2Var2.f3623a;
                    a1 a1Var = m1Var6.f39586e;
                    m1.f(a1Var);
                    SparseArray sparseArrayM0 = a1Var.M0();
                    t3 t3Var = (t3) f2Var.f39409b;
                    sparseArrayM0.put(t3Var.f39770c, Long.valueOf(t3Var.f39769b));
                    a1 a1Var2 = m1Var6.f39586e;
                    m1.f(a1Var2);
                    int[] iArr = new int[sparseArrayM0.size()];
                    long[] jArr = new long[sparseArrayM0.size()];
                    for (int i12 = 0; i12 < sparseArrayM0.size(); i12++) {
                        iArr[i12] = sparseArrayM0.keyAt(i12);
                        jArr[i12] = ((Long) sparseArrayM0.valueAt(i12)).longValue();
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putIntArray("uriSources", iArr);
                    bundle2.putLongArray("uriTimestamps", jArr);
                    a1Var2.f39214n.H(bundle2);
                    p2Var2.f39691i = false;
                    p2Var2.f39692j = 1;
                    ea.s0 s0Var3 = m1Var6.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39759m.c(t3Var.f39768a, "Successfully registered trigger URI");
                    p2Var2.f1();
                    return;
                } catch (ExecutionException e10) {
                    f2Var.v(e10.getCause());
                    return;
                } catch (Throwable th2) {
                    f2Var.v(th2);
                    return;
                }
            case 1:
                ((cn.l) this.f50624c).C((cn.z0) this.f50623b, wj.r.f53297a);
                return;
            case 2:
                ((ph.a) ((com.unity3d.scar.adapter.common.h) this.f50624c).f38584c).show((Activity) this.f50623b);
                return;
            case 3:
                cn.l lVar = (cn.l) this.f50624c;
                try {
                    lVar.resumeWith(((ListenableFuture) this.f50623b).get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        lVar.f(cause);
                        return;
                    } else {
                        lVar.resumeWith(t9.e.c(cause));
                        return;
                    }
                }
            case 4:
                ((uf.a) ((eb.d0) this.f50624c).f39977c).d((Exception) this.f50623b);
                return;
            case 5:
                u1 u1Var = (u1) this.f50623b;
                u1Var.o();
                if (fd.b.e()) {
                    u1Var.P().P0(this);
                    return;
                }
                ea.n nVar = (ea.n) this.f50624c;
                boolean z14 = nVar.f39617c != 0;
                nVar.f39617c = 0L;
                if (z14) {
                    nVar.a();
                    return;
                }
                return;
            case 6:
                b1 b1Var = (b1) this.f50624c;
                m1 m1Var7 = ((c1) b1Var.f39253c).f39276b;
                j1 j1Var = m1Var7.f39588g;
                m1.h(j1Var);
                j1Var.G0();
                Bundle bundle3 = new Bundle();
                bundle3.putString("package_name", (String) b1Var.f39252b);
                try {
                    n6 n6Var = (n6) ((p6) this.f50623b);
                    Parcel parcelU1 = n6Var.u1();
                    m6.b(parcelU1, bundle3);
                    Parcel parcelM0 = n6Var.m0(parcelU1, 1);
                    Bundle bundle4 = (Bundle) m6.a(parcelM0, Bundle.CREATOR);
                    parcelM0.recycle();
                    if (bundle4 == null) {
                        ea.s0 s0Var4 = m1Var7.f39587f;
                        m1.h(s0Var4);
                        s0Var4.f39753f.b("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e11) {
                    ea.s0 s0Var5 = m1Var7.f39587f;
                    m1.h(s0Var5);
                    s0Var5.f39753f.c(e11.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                j1 j1Var2 = m1Var7.f39588g;
                m1.h(j1Var2);
                j1Var2.G0();
                throw new IllegalStateException("Unexpected call on client side");
            case 7:
                m1 m1Var8 = (m1) this.f50624c;
                b2 b2Var = (b2) this.f50623b;
                j1 j1Var3 = m1Var8.f39588g;
                ea.s0 s0Var6 = m1Var8.f39587f;
                a1 a1Var3 = m1Var8.f39586e;
                l4 l4Var4 = m1Var8.f39590i;
                m1.h(j1Var3);
                j1Var3.G0();
                ea.g gVar = m1Var8.f39585d;
                ((m1) gVar.f3623a).getClass();
                ea.p pVar = new ea.p(m1Var8);
                pVar.J0();
                m1Var8.f39599s = pVar;
                i7 i7Var = b2Var.f39257d;
                long j11 = i7Var == null ? 0L : i7Var.f23576a;
                String string2 = "";
                if (i7Var != null && (bundle = i7Var.f23579d) != null) {
                    string2 = bundle.getString("runtime_google_app_id", "");
                }
                ea.l0 l0Var2 = new ea.l0(m1Var8, b2Var.f39256c, j11, string2);
                l0Var2.I0();
                m1Var8.f39600t = l0Var2;
                ea.n0 n0Var = new ea.n0(m1Var8);
                n0Var.I0();
                m1Var8.f39597q = n0Var;
                h3 h3Var = new h3(m1Var8);
                h3Var.I0();
                m1Var8.f39598r = h3Var;
                boolean z15 = l4Var4.f39766b;
                m1 m1Var9 = (m1) l4Var4.f3623a;
                if (z15) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                l4Var4.G0();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == 0) {
                        ea.s0 s0Var7 = ((m1) l4Var4.f3623a).f39587f;
                        m1.h(s0Var7);
                        s0Var7.f39756i.b("Utils falling back to Random for random id");
                    }
                }
                l4Var4.f39562d.set(jNextLong);
                m1Var9.C.incrementAndGet();
                l4Var4.f39766b = true;
                if (a1Var3.f39766b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences2 = ((m1) a1Var3.f3623a).f39582a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                a1Var3.f39204c = sharedPreferences2;
                boolean z16 = sharedPreferences2.getBoolean("has_been_opened", false);
                a1Var3.f39218r = z16;
                if (!z16) {
                    SharedPreferences.Editor editorEdit = a1Var3.f39204c.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                long jMax2 = Math.max(0L, ((Long) ea.d0.f39296d.a(null)).longValue());
                ts tsVar = new ts();
                tsVar.f20478e = a1Var3;
                k9.c0.e("health_monitor");
                k9.c0.b(jMax2 > 0);
                tsVar.f20475b = "health_monitor:start";
                tsVar.f20476c = "health_monitor:count";
                tsVar.f20477d = "health_monitor:value";
                tsVar.f20474a = jMax2;
                a1Var3.f39206e = tsVar;
                ((m1) a1Var3.f3623a).C.incrementAndGet();
                a1Var3.f39766b = true;
                ea.l0 l0Var3 = m1Var8.f39600t;
                if (l0Var3.f39396b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                m1 m1Var10 = (m1) l0Var3.f3623a;
                ea.s0 s0Var8 = m1Var10.f39587f;
                ea.s0 s0Var9 = m1Var10.f39587f;
                m1.h(s0Var8);
                s0Var8.f39760n.d("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(l0Var3.f39541j), Long.valueOf(l0Var3.f39540i));
                Context context2 = m1Var10.f39582a;
                String packageName = context2.getPackageName();
                PackageManager packageManager = context2.getPackageManager();
                String str3 = "";
                String str4 = "Unknown";
                String installerPackageName = "unknown";
                try {
                    if (packageManager != null) {
                        l0Var = l0Var2;
                        try {
                            installerPackageName = packageManager.getInstallerPackageName(packageName);
                            break;
                        } catch (IllegalArgumentException unused) {
                            m1.h(s0Var9);
                            s0Var9.f39753f.c(ea.s0.O0(packageName), "Error retrieving app installer package name. appId");
                        }
                        String str5 = installerPackageName;
                        try {
                            if (str5 != null) {
                                if ("com.android.vending".equals(str5)) {
                                    installerPackageName = "";
                                }
                                packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                                if (packageInfo != null) {
                                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        string = applicationLabel.toString();
                                    } else {
                                        string = "Unknown";
                                    }
                                    try {
                                        str = packageInfo.versionName;
                                        try {
                                            i10 = packageInfo.versionCode;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str4 = str;
                                            m1.h(s0Var9);
                                            s0Var9.f39753f.d("Error retrieving package info. appId, appName", ea.s0.O0(packageName), string);
                                            i10 = Integer.MIN_VALUE;
                                            str = str4;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                    break;
                                }
                                String str6 = installerPackageName;
                                l0Var3.f39534c = packageName;
                                l0Var3.f39537f = str6;
                                l0Var3.f39535d = str;
                                l0Var3.f39536e = i10;
                                l0Var3.f39538g = string;
                                l0Var3.f39539h = 0L;
                                iB = m1Var10.b();
                                if (iB == 0) {
                                    m1.h(s0Var9);
                                    s0Var9.f39760n.b("App measurement collection enabled");
                                } else if (iB == 1) {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement deactivated via the manifest");
                                } else if (iB == 3) {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (iB == 4) {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement disabled via the manifest");
                                } else if (iB == 6) {
                                    m1.h(s0Var9);
                                    s0Var9.f39758k.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (iB == 7) {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement disabled via the global data collection setting");
                                } else if (iB != 8) {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement disabled");
                                    m1.h(s0Var9);
                                    s0Var9.f39754g.b("Invalid scion state in identity");
                                } else {
                                    m1.h(s0Var9);
                                    s0Var9.l.b("App measurement disabled due to denied storage consent");
                                }
                                l0Var3.f39545o = "";
                                strB = l0Var3.f39543m;
                                if (TextUtils.isEmpty(strB)) {
                                    strB = z1.b(context2, m1Var10.f39596p);
                                }
                                if (!TextUtils.isEmpty(strB)) {
                                    str3 = strB;
                                }
                                l0Var3.f39545o = str3;
                                if (iB == 0) {
                                    m1.h(s0Var9);
                                    s0Var9.f39760n.d("App measurement enabled for app package, google app id", l0Var3.f39534c, l0Var3.f39545o);
                                    break;
                                }
                                listAsList = null;
                                l0Var3.f39542k = null;
                                ea.g gVar2 = m1Var10.f39585d;
                                m1Var = (m1) gVar2.f3623a;
                                k9.c0.e("analytics.safelisted_events");
                                bundleS0 = gVar2.S0();
                                if (bundleS0 != null) {
                                    if (bundleS0.containsKey("analytics.safelisted_events")) {
                                        numValueOf = Integer.valueOf(bundleS0.getInt("analytics.safelisted_events"));
                                    }
                                    if (numValueOf != null) {
                                        try {
                                            stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                                            if (stringArray == null) {
                                                listAsList = Arrays.asList(stringArray);
                                                break;
                                            }
                                        } catch (Resources.NotFoundException e12) {
                                            ea.s0 s0Var10 = m1Var.f39587f;
                                            m1.h(s0Var10);
                                            s0Var10.f39753f.c(e12, "Failed to load string array from metadata: resource not found");
                                        }
                                    }
                                    if (listAsList != null) {
                                        l0Var3.f39542k = listAsList;
                                    } else if (listAsList.isEmpty()) {
                                        m1.h(s0Var9);
                                        s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                                    } else {
                                        it = listAsList.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                str2 = (String) it.next();
                                                l4Var3 = m1Var10.f39590i;
                                                m1.f(l4Var3);
                                            } else {
                                                l0Var3.f39542k = listAsList;
                                            }
                                        } while (l4Var3.J1("safelisted event", str2));
                                    }
                                    if (packageManager != null) {
                                        l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                                    } else {
                                        l0Var3.f39544n = 0;
                                    }
                                    ((m1) l0Var3.f3623a).C.incrementAndGet();
                                    l0Var3.f39396b = true;
                                    t2Var = new t2(m1Var8);
                                    t2Var.I0();
                                    m1Var8.f39601u = t2Var;
                                    if (!t2Var.f39396b) {
                                        throw new IllegalStateException("Can't initialize twice");
                                    }
                                    t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                                    ((m1) t2Var.f3623a).C.incrementAndGet();
                                    t2Var.f39396b = true;
                                    m1.h(s0Var6);
                                    bVar = s0Var6.f39759m;
                                    bVar2 = s0Var6.l;
                                    bVar3 = s0Var6.f39760n;
                                    bVar4 = s0Var6.f39753f;
                                    gVar.M0();
                                    bVar2.c(161000L, "App measurement initialized, version");
                                    m1.h(s0Var6);
                                    bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    strM0 = l0Var.M0();
                                    if (l4Var4.k1(strM0, gVar.f39416c)) {
                                        m1.h(s0Var6);
                                        bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        m1.h(s0Var6);
                                        bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                                    }
                                    m1.h(s0Var6);
                                    bVar.b("Debug-level message logging enabled");
                                    i11 = m1Var8.A;
                                    atomicInteger = m1Var8.C;
                                    if (i11 != atomicInteger.get()) {
                                        m1.h(s0Var6);
                                        bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                                    }
                                    m1Var8.f39602v = true;
                                    j10 = m1Var8.D;
                                    x1Var = x1.ANALYTICS_STORAGE;
                                    p2Var = m1Var8.f39593m;
                                    j1 j1Var4 = m1Var8.f39588g;
                                    m1.h(j1Var4);
                                    j1Var4.G0();
                                    m1.e(m1Var8.f39601u);
                                    iL0 = m1Var8.f39601u.L0();
                                    v4.a();
                                    zR0 = gVar.R0(null, ea.d0.P0);
                                    if (iL0 == 2) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (zR0) {
                                        l4Var4.G0();
                                        if (l4Var4.c1() == 1) {
                                            l4Var4.G0();
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            z13 = z10;
                                            m1Var2 = m1Var9;
                                            s0Var = s0Var6;
                                            bVar5 = bVar2;
                                            b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter, 2);
                                            ea.s0 s0Var11 = m1Var2.f39587f;
                                            m1.h(s0Var11);
                                            s0Var11.f39759m.b("Registered app receiver");
                                            if (z13) {
                                                m1.e(m1Var8.f39601u);
                                                m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                            }
                                        } else if (z10) {
                                            z10 = true;
                                            l4Var4.G0();
                                            IntentFilter intentFilter2 = new IntentFilter();
                                            intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            z13 = z10;
                                            m1Var2 = m1Var9;
                                            s0Var = s0Var6;
                                            bVar5 = bVar2;
                                            b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter2, 2);
                                            ea.s0 s0Var12 = m1Var2.f39587f;
                                            m1.h(s0Var12);
                                            s0Var12.f39759m.b("Registered app receiver");
                                            if (z13) {
                                                m1.e(m1Var8.f39601u);
                                                m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                            }
                                        } else {
                                            m1Var2 = m1Var9;
                                            bVar5 = bVar2;
                                            s0Var = s0Var6;
                                        }
                                    } else if (z10) {
                                        z10 = true;
                                        l4Var4.G0();
                                        IntentFilter intentFilter3 = new IntentFilter();
                                        intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z13 = z10;
                                        m1Var2 = m1Var9;
                                        s0Var = s0Var6;
                                        bVar5 = bVar2;
                                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter3, 2);
                                        ea.s0 s0Var13 = m1Var2.f39587f;
                                        m1.h(s0Var13);
                                        s0Var13.f39759m.b("Registered app receiver");
                                        if (z13) {
                                            m1.e(m1Var8.f39601u);
                                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                        }
                                    } else {
                                        m1Var2 = m1Var9;
                                        bVar5 = bVar2;
                                        s0Var = s0Var6;
                                    }
                                    sVar = a1Var3.f39208g;
                                    y1VarN0 = a1Var3.N0();
                                    int i13 = y1VarN0.f39927b;
                                    v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                                    m1Var3 = m1Var2;
                                    v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                                    v1Var = v1.UNINITIALIZED;
                                    if (v1VarW0 == v1Var || v1VarW1 != v1Var) {
                                        bVar6 = bVar4;
                                        l4Var = l4Var4;
                                        if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                            EnumMap enumMap = new EnumMap(x1.class);
                                            enumMap.put(x1.AD_STORAGE, v1VarW0);
                                            enumMap.put(x1Var, v1VarW1);
                                            y1Var = new y1(enumMap, -10);
                                            z11 = false;
                                        }
                                        if (y1Var != null) {
                                            m1.g(p2Var);
                                            p2Var.c1(y1Var, true);
                                        } else {
                                            y1Var = y1VarN0;
                                        }
                                        m1.g(p2Var);
                                        m1Var4 = (m1) p2Var.f3623a;
                                        p2Var.g1(y1Var);
                                        a1Var3.G0();
                                        int i14 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                                        v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (v1VarW2 != v1Var) {
                                            m1.h(s0Var);
                                            bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                                        }
                                        v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                                        if (v1VarW3 == v1Var && y1.l(-10, i14)) {
                                            m1.g(p2Var);
                                            EnumMap enumMap2 = new EnumMap(x1.class);
                                            enumMap2.put(x1.AD_USER_DATA, v1VarW3);
                                            p2Var.b1(new ea.o(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (!TextUtils.isEmpty(m1Var8.m().N0()) && (i14 == 0 || i14 == 30)) {
                                            m1.g(p2Var);
                                            p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                        boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                                        if (boolT0 != null || boolT0.booleanValue()) {
                                            m1.h(s0Var);
                                            bVar.b("TCF client enabled.");
                                            m1.g(p2Var);
                                            p2Var.G0();
                                            ea.s0 s0Var14 = m1Var4.f39587f;
                                            m1.h(s0Var14);
                                            s0Var14.f39759m.b("Register tcfPrefChangeListener.");
                                            if (p2Var.f39701t == null) {
                                                p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                                p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                        p2 p2Var3 = p2Var;
                                                        p2Var3.getClass();
                                                        if (Objects.equals(str7, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            s0 s0Var15 = ((m1) p2Var3.f3623a).f39587f;
                                                            m1.h(s0Var15);
                                                            s0Var15.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                            d2 d2Var = p2Var3.f39702u;
                                                            k9.c0.h(d2Var);
                                                            d2Var.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            a1 a1Var4 = m1Var4.f39586e;
                                            m1.f(a1Var4);
                                            a1Var4.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                            m1.g(p2Var);
                                            p2Var.M0();
                                        }
                                        z0Var = a1Var3.f39207f;
                                        if (z0Var.e() == 0) {
                                            m1.h(s0Var);
                                            bVar3.c(Long.valueOf(j10), "Persisting first open");
                                            z0Var.f(j10);
                                        }
                                        m1.g(p2Var);
                                        l1Var = p2Var.f39698q;
                                        if (l1Var.d() && l1Var.c()) {
                                            a1 a1Var5 = l1Var.f39549a.f39586e;
                                            m1.f(a1Var5);
                                            a1Var5.f39223w.h(null);
                                        }
                                        if (m1Var8.c()) {
                                            m1Var5 = m1Var8;
                                            l4Var2 = l4Var;
                                            if (TextUtils.isEmpty(m1Var5.m().N0())) {
                                                sVar2 = sVar;
                                            } else {
                                                String strN0 = m1Var5.m().N0();
                                                a1Var3.G0();
                                                String string3 = a1Var3.K0().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strN0);
                                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                                if (!zIsEmpty || zIsEmpty2) {
                                                    sVar2 = sVar;
                                                } else {
                                                    k9.c0.h(strN0);
                                                    if (strN0.equals(string3)) {
                                                        sVar2 = sVar;
                                                    } else {
                                                        m1.h(s0Var);
                                                        bVar5.b("Rechecking which service to use due to a GMP App Id change");
                                                        a1Var3.G0();
                                                        a1Var3.G0();
                                                        Boolean boolValueOf = a1Var3.K0().contains("measurement_enabled") ? Boolean.valueOf(a1Var3.K0().getBoolean("measurement_enabled", true)) : null;
                                                        SharedPreferences.Editor editorEdit2 = a1Var3.K0().edit();
                                                        editorEdit2.clear();
                                                        editorEdit2.apply();
                                                        if (boolValueOf != null) {
                                                            a1Var3.G0();
                                                            SharedPreferences.Editor editorEdit3 = a1Var3.K0().edit();
                                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                            editorEdit3.apply();
                                                        }
                                                        m1Var5.j().K0();
                                                        m1Var5.f39598r.O0();
                                                        m1Var5.f39598r.M0();
                                                        z0Var.f(j10);
                                                        sVar2 = sVar;
                                                        sVar2.h(null);
                                                    }
                                                }
                                                String strN1 = m1Var5.m().N0();
                                                a1Var3.G0();
                                                SharedPreferences.Editor editorEdit4 = a1Var3.K0().edit();
                                                editorEdit4.putString("gmp_app_id", strN1);
                                                editorEdit4.apply();
                                            }
                                            if (!a1Var3.N0().i(x1Var)) {
                                                sVar2.h(null);
                                            }
                                            m1.g(p2Var);
                                            p2Var.f39689g.set(sVar2.g());
                                            try {
                                                m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused4) {
                                                bc.s sVar3 = a1Var3.f39222v;
                                                if (!TextUtils.isEmpty(sVar3.g())) {
                                                    m1.h(s0Var);
                                                    s0Var2 = s0Var;
                                                    s0Var2.f39756i.b("Remote config removed with active feature rollouts");
                                                    sVar3.h(null);
                                                }
                                                if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                                    zA = m1Var5.a();
                                                    sharedPreferences = a1Var3.f39204c;
                                                    if (sharedPreferences == null) {
                                                        zContains = z11;
                                                    } else {
                                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                    }
                                                    if (!zContains) {
                                                        a1Var3.O0(!zA);
                                                    }
                                                    if (zA) {
                                                        m1.g(p2Var);
                                                        p2Var.S0();
                                                    }
                                                    p3 p3Var = m1Var5.f39589h;
                                                    m1.g(p3Var);
                                                    p3Var.f39706e.E();
                                                    m1Var5.k().K0(new AtomicReference());
                                                    m1Var5.k().L0(a1Var3.f39225y.E());
                                                }
                                                v4.a();
                                                if (gVar.R0(null, ea.d0.P0)) {
                                                    l4Var2.G0();
                                                    if (l4Var2.c1() == 1) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        long jIntValue = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                                        long jNextInt = new Random().nextInt(5000);
                                                        m1Var5.f39592k.getClass();
                                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                        if (jMax > 500) {
                                                            m1.h(s0Var2);
                                                            bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                        }
                                                        m1.g(p2Var);
                                                        p2Var.G0();
                                                        if (p2Var.l == null) {
                                                            p2Var.l = new d2(p2Var, m1Var4, 0);
                                                        }
                                                        p2Var.l.b(jMax);
                                                    }
                                                }
                                                a1Var3.f39215o.b(true);
                                                return;
                                            }
                                            s0Var2 = s0Var;
                                            if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                                zA = m1Var5.a();
                                                sharedPreferences = a1Var3.f39204c;
                                                if (sharedPreferences == null) {
                                                    zContains = z11;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains && !gVar.U0()) {
                                                    a1Var3.O0(!zA);
                                                }
                                                if (zA) {
                                                    m1.g(p2Var);
                                                    p2Var.S0();
                                                }
                                                p3 p3Var2 = m1Var5.f39589h;
                                                m1.g(p3Var2);
                                                p3Var2.f39706e.E();
                                                m1Var5.k().K0(new AtomicReference());
                                                m1Var5.k().L0(a1Var3.f39225y.E());
                                            }
                                            break;
                                        } else {
                                            if (m1Var8.a()) {
                                                l4Var2 = l4Var;
                                                if (l4Var2.i1("android.permission.INTERNET")) {
                                                    bVar7 = bVar6;
                                                } else {
                                                    m1.h(s0Var);
                                                    bVar7 = bVar6;
                                                    bVar7.b("App is missing INTERNET permission");
                                                }
                                                if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                                    m1.h(s0Var);
                                                    bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                m1Var5 = m1Var8;
                                                context = m1Var5.f39582a;
                                                if (!r9.c.a(context).g() && !gVar.J0()) {
                                                    if (!l4.A1(context)) {
                                                        m1.h(s0Var);
                                                        bVar7.b("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!l4.b1(context)) {
                                                        m1.h(s0Var);
                                                        bVar7.b("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                m1.h(s0Var);
                                                bVar7.b("Uploading is not possible. App measurement disabled");
                                            } else {
                                                m1Var5 = m1Var8;
                                                l4Var2 = l4Var;
                                            }
                                            s0Var2 = s0Var;
                                        }
                                        v4.a();
                                        if (gVar.R0(null, ea.d0.P0)) {
                                            l4Var2.G0();
                                            if (l4Var2.c1() == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = z11;
                                            }
                                            if (z12) {
                                                long jIntValue2 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                                long jNextInt2 = new Random().nextInt(5000);
                                                m1Var5.f39592k.getClass();
                                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    m1.h(s0Var2);
                                                    bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                m1.g(p2Var);
                                                p2Var.G0();
                                                if (p2Var.l == null) {
                                                    p2Var.l = new d2(p2Var, m1Var4, 0);
                                                }
                                                p2Var.l.b(jMax);
                                            }
                                        }
                                        a1Var3.f39215o.b(true);
                                        return;
                                    }
                                    bVar6 = bVar4;
                                    l4Var = l4Var4;
                                    if (TextUtils.isEmpty(m1Var8.m().N0()) && (i13 == 0 || i13 == 30 || i13 == 10 || i13 == 40)) {
                                        m1.g(p2Var);
                                        z11 = false;
                                        p2Var.c1(new y1(-10), false);
                                    } else {
                                        z11 = false;
                                    }
                                    y1Var = null;
                                    if (y1Var != null) {
                                        m1.g(p2Var);
                                        p2Var.c1(y1Var, true);
                                    } else {
                                        y1Var = y1VarN0;
                                    }
                                    m1.g(p2Var);
                                    m1Var4 = (m1) p2Var.f3623a;
                                    p2Var.g1(y1Var);
                                    a1Var3.G0();
                                    int i15 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                                    v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (v1VarW2 != v1Var) {
                                        m1.h(s0Var);
                                        bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                                    }
                                    v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                                    if (v1VarW3 == v1Var) {
                                        if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                            m1.g(p2Var);
                                            p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                    } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                        m1.g(p2Var);
                                        p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                    boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                                    if (boolT0 != null) {
                                        m1.h(s0Var);
                                        bVar.b("TCF client enabled.");
                                        m1.g(p2Var);
                                        p2Var.G0();
                                        ea.s0 s0Var15 = m1Var4.f39587f;
                                        m1.h(s0Var15);
                                        s0Var15.f39759m.b("Register tcfPrefChangeListener.");
                                        if (p2Var.f39701t == null) {
                                            p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                            p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                    p2 p2Var3 = p2Var;
                                                    p2Var3.getClass();
                                                    if (Objects.equals(str7, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        s0 s0Var16 = ((m1) p2Var3.f3623a).f39587f;
                                                        m1.h(s0Var16);
                                                        s0Var16.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                        d2 d2Var = p2Var3.f39702u;
                                                        k9.c0.h(d2Var);
                                                        d2Var.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        a1 a1Var6 = m1Var4.f39586e;
                                        m1.f(a1Var6);
                                        a1Var6.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                        m1.g(p2Var);
                                        p2Var.M0();
                                    } else {
                                        m1.h(s0Var);
                                        bVar.b("TCF client enabled.");
                                        m1.g(p2Var);
                                        p2Var.G0();
                                        ea.s0 s0Var16 = m1Var4.f39587f;
                                        m1.h(s0Var16);
                                        s0Var16.f39759m.b("Register tcfPrefChangeListener.");
                                        if (p2Var.f39701t == null) {
                                            p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                            p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                    p2 p2Var3 = p2Var;
                                                    p2Var3.getClass();
                                                    if (Objects.equals(str7, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        s0 s0Var17 = ((m1) p2Var3.f3623a).f39587f;
                                                        m1.h(s0Var17);
                                                        s0Var17.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                        d2 d2Var = p2Var3.f39702u;
                                                        k9.c0.h(d2Var);
                                                        d2Var.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        a1 a1Var7 = m1Var4.f39586e;
                                        m1.f(a1Var7);
                                        a1Var7.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                        m1.g(p2Var);
                                        p2Var.M0();
                                    }
                                    z0Var = a1Var3.f39207f;
                                    if (z0Var.e() == 0) {
                                        m1.h(s0Var);
                                        bVar3.c(Long.valueOf(j10), "Persisting first open");
                                        z0Var.f(j10);
                                    }
                                    m1.g(p2Var);
                                    l1Var = p2Var.f39698q;
                                    if (l1Var.d()) {
                                        a1 a1Var8 = l1Var.f39549a.f39586e;
                                        m1.f(a1Var8);
                                        a1Var8.f39223w.h(null);
                                    }
                                    if (m1Var8.c()) {
                                        if (m1Var8.a()) {
                                            l4Var2 = l4Var;
                                            if (l4Var2.i1("android.permission.INTERNET")) {
                                                m1.h(s0Var);
                                                bVar7 = bVar6;
                                                bVar7.b("App is missing INTERNET permission");
                                            } else {
                                                bVar7 = bVar6;
                                            }
                                            if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                                m1.h(s0Var);
                                                bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            m1Var5 = m1Var8;
                                            context = m1Var5.f39582a;
                                            if (!r9.c.a(context).g()) {
                                                if (!l4.A1(context)) {
                                                    m1.h(s0Var);
                                                    bVar7.b("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!l4.b1(context)) {
                                                    m1.h(s0Var);
                                                    bVar7.b("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            m1.h(s0Var);
                                            bVar7.b("Uploading is not possible. App measurement disabled");
                                        } else {
                                            m1Var5 = m1Var8;
                                            l4Var2 = l4Var;
                                        }
                                        s0Var2 = s0Var;
                                    } else {
                                        m1Var5 = m1Var8;
                                        l4Var2 = l4Var;
                                        if (TextUtils.isEmpty(m1Var5.m().N0())) {
                                            String strN2 = m1Var5.m().N0();
                                            a1Var3.G0();
                                            String string4 = a1Var3.K0().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strN2);
                                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                                            if (zIsEmpty) {
                                                sVar2 = sVar;
                                            } else {
                                                sVar2 = sVar;
                                            }
                                            String strN3 = m1Var5.m().N0();
                                            a1Var3.G0();
                                            SharedPreferences.Editor editorEdit5 = a1Var3.K0().edit();
                                            editorEdit5.putString("gmp_app_id", strN3);
                                            editorEdit5.apply();
                                        } else {
                                            sVar2 = sVar;
                                        }
                                        if (!a1Var3.N0().i(x1Var)) {
                                            sVar2.h(null);
                                        }
                                        m1.g(p2Var);
                                        p2Var.f39689g.set(sVar2.g());
                                        m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        s0Var2 = s0Var;
                                        if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                            zA = m1Var5.a();
                                            sharedPreferences = a1Var3.f39204c;
                                            if (sharedPreferences == null) {
                                                zContains = z11;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                a1Var3.O0(!zA);
                                            }
                                            if (zA) {
                                                m1.g(p2Var);
                                                p2Var.S0();
                                            }
                                            p3 p3Var3 = m1Var5.f39589h;
                                            m1.g(p3Var3);
                                            p3Var3.f39706e.E();
                                            m1Var5.k().K0(new AtomicReference());
                                            m1Var5.k().L0(a1Var3.f39225y.E());
                                        }
                                    }
                                    v4.a();
                                    if (gVar.R0(null, ea.d0.P0)) {
                                        l4Var2.G0();
                                        if (l4Var2.c1() == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = z11;
                                        }
                                        if (z12) {
                                            long jIntValue3 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                            long jNextInt3 = new Random().nextInt(5000);
                                            m1Var5.f39592k.getClass();
                                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                m1.h(s0Var2);
                                                bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            m1.g(p2Var);
                                            p2Var.G0();
                                            if (p2Var.l == null) {
                                                p2Var.l = new d2(p2Var, m1Var4, 0);
                                            }
                                            p2Var.l.b(jMax);
                                        }
                                    }
                                    a1Var3.f39215o.b(true);
                                    return;
                                }
                                ea.s0 s0Var17 = m1Var.f39587f;
                                m1.h(s0Var17);
                                s0Var17.f39753f.b("Failed to load metadata: Metadata bundle is null");
                                numValueOf = null;
                                if (numValueOf != null) {
                                    stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                        break;
                                    }
                                }
                                if (listAsList != null) {
                                    l0Var3.f39542k = listAsList;
                                } else if (listAsList.isEmpty()) {
                                    m1.h(s0Var9);
                                    s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                                } else {
                                    it = listAsList.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            str2 = (String) it.next();
                                            l4Var3 = m1Var10.f39590i;
                                            m1.f(l4Var3);
                                        } else {
                                            l0Var3.f39542k = listAsList;
                                        }
                                    } while (l4Var3.J1("safelisted event", str2));
                                }
                                if (packageManager != null) {
                                    l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                                } else {
                                    l0Var3.f39544n = 0;
                                }
                                ((m1) l0Var3.f3623a).C.incrementAndGet();
                                l0Var3.f39396b = true;
                                t2Var = new t2(m1Var8);
                                t2Var.I0();
                                m1Var8.f39601u = t2Var;
                                if (!t2Var.f39396b) {
                                    throw new IllegalStateException("Can't initialize twice");
                                }
                                t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                                ((m1) t2Var.f3623a).C.incrementAndGet();
                                t2Var.f39396b = true;
                                m1.h(s0Var6);
                                bVar = s0Var6.f39759m;
                                bVar2 = s0Var6.l;
                                bVar3 = s0Var6.f39760n;
                                bVar4 = s0Var6.f39753f;
                                gVar.M0();
                                bVar2.c(161000L, "App measurement initialized, version");
                                m1.h(s0Var6);
                                bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                strM0 = l0Var.M0();
                                if (l4Var4.k1(strM0, gVar.f39416c)) {
                                    m1.h(s0Var6);
                                    bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    m1.h(s0Var6);
                                    bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                                }
                                m1.h(s0Var6);
                                bVar.b("Debug-level message logging enabled");
                                i11 = m1Var8.A;
                                atomicInteger = m1Var8.C;
                                if (i11 != atomicInteger.get()) {
                                    m1.h(s0Var6);
                                    bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                                }
                                m1Var8.f39602v = true;
                                j10 = m1Var8.D;
                                x1Var = x1.ANALYTICS_STORAGE;
                                p2Var = m1Var8.f39593m;
                                j1 j1Var5 = m1Var8.f39588g;
                                m1.h(j1Var5);
                                j1Var5.G0();
                                m1.e(m1Var8.f39601u);
                                iL0 = m1Var8.f39601u.L0();
                                v4.a();
                                zR0 = gVar.R0(null, ea.d0.P0);
                                if (iL0 == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (zR0) {
                                    l4Var4.G0();
                                    if (l4Var4.c1() == 1) {
                                        l4Var4.G0();
                                        IntentFilter intentFilter4 = new IntentFilter();
                                        intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z13 = z10;
                                        m1Var2 = m1Var9;
                                        s0Var = s0Var6;
                                        bVar5 = bVar2;
                                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter4, 2);
                                        ea.s0 s0Var18 = m1Var2.f39587f;
                                        m1.h(s0Var18);
                                        s0Var18.f39759m.b("Registered app receiver");
                                        if (z13) {
                                            m1.e(m1Var8.f39601u);
                                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                        }
                                    } else if (z10) {
                                        z10 = true;
                                        l4Var4.G0();
                                        IntentFilter intentFilter5 = new IntentFilter();
                                        intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z13 = z10;
                                        m1Var2 = m1Var9;
                                        s0Var = s0Var6;
                                        bVar5 = bVar2;
                                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter5, 2);
                                        ea.s0 s0Var19 = m1Var2.f39587f;
                                        m1.h(s0Var19);
                                        s0Var19.f39759m.b("Registered app receiver");
                                        if (z13) {
                                            m1.e(m1Var8.f39601u);
                                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                        }
                                    } else {
                                        m1Var2 = m1Var9;
                                        bVar5 = bVar2;
                                        s0Var = s0Var6;
                                    }
                                } else if (z10) {
                                    z10 = true;
                                    l4Var4.G0();
                                    IntentFilter intentFilter6 = new IntentFilter();
                                    intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z13 = z10;
                                    m1Var2 = m1Var9;
                                    s0Var = s0Var6;
                                    bVar5 = bVar2;
                                    b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter6, 2);
                                    ea.s0 s0Var110 = m1Var2.f39587f;
                                    m1.h(s0Var110);
                                    s0Var110.f39759m.b("Registered app receiver");
                                    if (z13) {
                                        m1.e(m1Var8.f39601u);
                                        m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                    }
                                } else {
                                    m1Var2 = m1Var9;
                                    bVar5 = bVar2;
                                    s0Var = s0Var6;
                                }
                                sVar = a1Var3.f39208g;
                                y1VarN0 = a1Var3.N0();
                                int i16 = y1VarN0.f39927b;
                                v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                                m1Var3 = m1Var2;
                                v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                                v1Var = v1.UNINITIALIZED;
                                if (v1VarW0 == v1Var) {
                                    bVar6 = bVar4;
                                    l4Var = l4Var4;
                                    if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                        EnumMap enumMap3 = new EnumMap(x1.class);
                                        enumMap3.put(x1.AD_STORAGE, v1VarW0);
                                        enumMap3.put(x1Var, v1VarW1);
                                        y1Var = new y1(enumMap3, -10);
                                        z11 = false;
                                    } else {
                                        if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        y1Var = null;
                                    }
                                } else {
                                    bVar6 = bVar4;
                                    l4Var = l4Var4;
                                    if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                        EnumMap enumMap4 = new EnumMap(x1.class);
                                        enumMap4.put(x1.AD_STORAGE, v1VarW0);
                                        enumMap4.put(x1Var, v1VarW1);
                                        y1Var = new y1(enumMap4, -10);
                                        z11 = false;
                                    } else {
                                        if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        y1Var = null;
                                    }
                                }
                                if (y1Var != null) {
                                    m1.g(p2Var);
                                    p2Var.c1(y1Var, true);
                                } else {
                                    y1Var = y1VarN0;
                                }
                                m1.g(p2Var);
                                m1Var4 = (m1) p2Var.f3623a;
                                p2Var.g1(y1Var);
                                a1Var3.G0();
                                int i17 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                                v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                                if (v1VarW2 != v1Var) {
                                    m1.h(s0Var);
                                    bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                                }
                                v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                                if (v1VarW3 == v1Var) {
                                    if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                        m1.g(p2Var);
                                        p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                    m1.g(p2Var);
                                    p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                                if (boolT0 != null) {
                                    m1.h(s0Var);
                                    bVar.b("TCF client enabled.");
                                    m1.g(p2Var);
                                    p2Var.G0();
                                    ea.s0 s0Var111 = m1Var4.f39587f;
                                    m1.h(s0Var111);
                                    s0Var111.f39759m.b("Register tcfPrefChangeListener.");
                                    if (p2Var.f39701t == null) {
                                        p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                        p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                p2 p2Var3 = p2Var;
                                                p2Var3.getClass();
                                                if (Objects.equals(str7, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    s0 s0Var112 = ((m1) p2Var3.f3623a).f39587f;
                                                    m1.h(s0Var112);
                                                    s0Var112.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                    d2 d2Var = p2Var3.f39702u;
                                                    k9.c0.h(d2Var);
                                                    d2Var.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    a1 a1Var9 = m1Var4.f39586e;
                                    m1.f(a1Var9);
                                    a1Var9.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                    m1.g(p2Var);
                                    p2Var.M0();
                                } else {
                                    m1.h(s0Var);
                                    bVar.b("TCF client enabled.");
                                    m1.g(p2Var);
                                    p2Var.G0();
                                    ea.s0 s0Var112 = m1Var4.f39587f;
                                    m1.h(s0Var112);
                                    s0Var112.f39759m.b("Register tcfPrefChangeListener.");
                                    if (p2Var.f39701t == null) {
                                        p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                        p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                p2 p2Var3 = p2Var;
                                                p2Var3.getClass();
                                                if (Objects.equals(str7, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    s0 s0Var113 = ((m1) p2Var3.f3623a).f39587f;
                                                    m1.h(s0Var113);
                                                    s0Var113.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                    d2 d2Var = p2Var3.f39702u;
                                                    k9.c0.h(d2Var);
                                                    d2Var.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    a1 a1Var10 = m1Var4.f39586e;
                                    m1.f(a1Var10);
                                    a1Var10.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                    m1.g(p2Var);
                                    p2Var.M0();
                                }
                                z0Var = a1Var3.f39207f;
                                if (z0Var.e() == 0) {
                                    m1.h(s0Var);
                                    bVar3.c(Long.valueOf(j10), "Persisting first open");
                                    z0Var.f(j10);
                                }
                                m1.g(p2Var);
                                l1Var = p2Var.f39698q;
                                if (l1Var.d()) {
                                    a1 a1Var11 = l1Var.f39549a.f39586e;
                                    m1.f(a1Var11);
                                    a1Var11.f39223w.h(null);
                                }
                                if (m1Var8.c()) {
                                    if (m1Var8.a()) {
                                        l4Var2 = l4Var;
                                        if (l4Var2.i1("android.permission.INTERNET")) {
                                            m1.h(s0Var);
                                            bVar7 = bVar6;
                                            bVar7.b("App is missing INTERNET permission");
                                        } else {
                                            bVar7 = bVar6;
                                        }
                                        if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                            m1.h(s0Var);
                                            bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        m1Var5 = m1Var8;
                                        context = m1Var5.f39582a;
                                        if (!r9.c.a(context).g()) {
                                            if (!l4.A1(context)) {
                                                m1.h(s0Var);
                                                bVar7.b("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!l4.b1(context)) {
                                                m1.h(s0Var);
                                                bVar7.b("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        m1.h(s0Var);
                                        bVar7.b("Uploading is not possible. App measurement disabled");
                                    } else {
                                        m1Var5 = m1Var8;
                                        l4Var2 = l4Var;
                                    }
                                    s0Var2 = s0Var;
                                } else {
                                    m1Var5 = m1Var8;
                                    l4Var2 = l4Var;
                                    if (TextUtils.isEmpty(m1Var5.m().N0())) {
                                        String strN4 = m1Var5.m().N0();
                                        a1Var3.G0();
                                        String string5 = a1Var3.K0().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN4);
                                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                                        if (zIsEmpty) {
                                            sVar2 = sVar;
                                        } else {
                                            sVar2 = sVar;
                                        }
                                        String strN5 = m1Var5.m().N0();
                                        a1Var3.G0();
                                        SharedPreferences.Editor editorEdit6 = a1Var3.K0().edit();
                                        editorEdit6.putString("gmp_app_id", strN5);
                                        editorEdit6.apply();
                                    } else {
                                        sVar2 = sVar;
                                    }
                                    if (!a1Var3.N0().i(x1Var)) {
                                        sVar2.h(null);
                                    }
                                    m1.g(p2Var);
                                    p2Var.f39689g.set(sVar2.g());
                                    m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    s0Var2 = s0Var;
                                    if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                        zA = m1Var5.a();
                                        sharedPreferences = a1Var3.f39204c;
                                        if (sharedPreferences == null) {
                                            zContains = z11;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            a1Var3.O0(!zA);
                                        }
                                        if (zA) {
                                            m1.g(p2Var);
                                            p2Var.S0();
                                        }
                                        p3 p3Var4 = m1Var5.f39589h;
                                        m1.g(p3Var4);
                                        p3Var4.f39706e.E();
                                        m1Var5.k().K0(new AtomicReference());
                                        m1Var5.k().L0(a1Var3.f39225y.E());
                                    }
                                }
                                v4.a();
                                if (gVar.R0(null, ea.d0.P0)) {
                                    l4Var2.G0();
                                    if (l4Var2.c1() == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = z11;
                                    }
                                    if (z12) {
                                        long jIntValue4 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                        long jNextInt4 = new Random().nextInt(5000);
                                        m1Var5.f39592k.getClass();
                                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            m1.h(s0Var2);
                                            bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        m1.g(p2Var);
                                        p2Var.G0();
                                        if (p2Var.l == null) {
                                            p2Var.l = new d2(p2Var, m1Var4, 0);
                                        }
                                        p2Var.l.b(jMax);
                                    }
                                }
                                a1Var3.f39215o.b(true);
                                return;
                            }
                            str5 = "manual_install";
                            packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = "Unknown";
                                }
                                str = packageInfo.versionName;
                                i10 = packageInfo.versionCode;
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused5) {
                            string = "Unknown";
                        }
                        installerPackageName = str5;
                        String str7 = installerPackageName;
                        l0Var3.f39534c = packageName;
                        l0Var3.f39537f = str7;
                        l0Var3.f39535d = str;
                        l0Var3.f39536e = i10;
                        l0Var3.f39538g = string;
                        l0Var3.f39539h = 0L;
                        iB = m1Var10.b();
                        if (iB == 0) {
                            m1.h(s0Var9);
                            s0Var9.f39760n.b("App measurement collection enabled");
                        } else if (iB == 1) {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement deactivated via the manifest");
                        } else if (iB == 3) {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iB == 4) {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement disabled via the manifest");
                        } else if (iB == 6) {
                            m1.h(s0Var9);
                            s0Var9.f39758k.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iB == 7) {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement disabled via the global data collection setting");
                        } else if (iB != 8) {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement disabled");
                            m1.h(s0Var9);
                            s0Var9.f39754g.b("Invalid scion state in identity");
                        } else {
                            m1.h(s0Var9);
                            s0Var9.l.b("App measurement disabled due to denied storage consent");
                        }
                        l0Var3.f39545o = "";
                        strB = l0Var3.f39543m;
                        if (TextUtils.isEmpty(strB)) {
                            strB = z1.b(context2, m1Var10.f39596p);
                        }
                        if (!TextUtils.isEmpty(strB)) {
                            str3 = strB;
                        }
                        l0Var3.f39545o = str3;
                        if (iB == 0) {
                            m1.h(s0Var9);
                            s0Var9.f39760n.d("App measurement enabled for app package, google app id", l0Var3.f39534c, l0Var3.f39545o);
                            break;
                        }
                        listAsList = null;
                        l0Var3.f39542k = null;
                        ea.g gVar3 = m1Var10.f39585d;
                        m1Var = (m1) gVar3.f3623a;
                        k9.c0.e("analytics.safelisted_events");
                        bundleS0 = gVar3.S0();
                        if (bundleS0 != null) {
                            if (bundleS0.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleS0.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                                if (stringArray == null) {
                                    listAsList = Arrays.asList(stringArray);
                                    break;
                                }
                            }
                            if (listAsList != null) {
                                l0Var3.f39542k = listAsList;
                            } else if (listAsList.isEmpty()) {
                                m1.h(s0Var9);
                                s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                            } else {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        str2 = (String) it.next();
                                        l4Var3 = m1Var10.f39590i;
                                        m1.f(l4Var3);
                                    } else {
                                        l0Var3.f39542k = listAsList;
                                    }
                                } while (l4Var3.J1("safelisted event", str2));
                            }
                            if (packageManager != null) {
                                l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                            } else {
                                l0Var3.f39544n = 0;
                            }
                            ((m1) l0Var3.f3623a).C.incrementAndGet();
                            l0Var3.f39396b = true;
                            t2Var = new t2(m1Var8);
                            t2Var.I0();
                            m1Var8.f39601u = t2Var;
                            if (!t2Var.f39396b) {
                                throw new IllegalStateException("Can't initialize twice");
                            }
                            t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                            ((m1) t2Var.f3623a).C.incrementAndGet();
                            t2Var.f39396b = true;
                            m1.h(s0Var6);
                            bVar = s0Var6.f39759m;
                            bVar2 = s0Var6.l;
                            bVar3 = s0Var6.f39760n;
                            bVar4 = s0Var6.f39753f;
                            gVar.M0();
                            bVar2.c(161000L, "App measurement initialized, version");
                            m1.h(s0Var6);
                            bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM0 = l0Var.M0();
                            if (l4Var4.k1(strM0, gVar.f39416c)) {
                                m1.h(s0Var6);
                                bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                m1.h(s0Var6);
                                bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                            }
                            m1.h(s0Var6);
                            bVar.b("Debug-level message logging enabled");
                            i11 = m1Var8.A;
                            atomicInteger = m1Var8.C;
                            if (i11 != atomicInteger.get()) {
                                m1.h(s0Var6);
                                bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                            }
                            m1Var8.f39602v = true;
                            j10 = m1Var8.D;
                            x1Var = x1.ANALYTICS_STORAGE;
                            p2Var = m1Var8.f39593m;
                            j1 j1Var6 = m1Var8.f39588g;
                            m1.h(j1Var6);
                            j1Var6.G0();
                            m1.e(m1Var8.f39601u);
                            iL0 = m1Var8.f39601u.L0();
                            v4.a();
                            zR0 = gVar.R0(null, ea.d0.P0);
                            if (iL0 == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (zR0) {
                                l4Var4.G0();
                                if (l4Var4.c1() == 1) {
                                    l4Var4.G0();
                                    IntentFilter intentFilter7 = new IntentFilter();
                                    intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z13 = z10;
                                    m1Var2 = m1Var9;
                                    s0Var = s0Var6;
                                    bVar5 = bVar2;
                                    b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter7, 2);
                                    ea.s0 s0Var113 = m1Var2.f39587f;
                                    m1.h(s0Var113);
                                    s0Var113.f39759m.b("Registered app receiver");
                                    if (z13) {
                                        m1.e(m1Var8.f39601u);
                                        m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                    }
                                } else if (z10) {
                                    z10 = true;
                                    l4Var4.G0();
                                    IntentFilter intentFilter8 = new IntentFilter();
                                    intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z13 = z10;
                                    m1Var2 = m1Var9;
                                    s0Var = s0Var6;
                                    bVar5 = bVar2;
                                    b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter8, 2);
                                    ea.s0 s0Var114 = m1Var2.f39587f;
                                    m1.h(s0Var114);
                                    s0Var114.f39759m.b("Registered app receiver");
                                    if (z13) {
                                        m1.e(m1Var8.f39601u);
                                        m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                    }
                                } else {
                                    m1Var2 = m1Var9;
                                    bVar5 = bVar2;
                                    s0Var = s0Var6;
                                }
                            } else if (z10) {
                                z10 = true;
                                l4Var4.G0();
                                IntentFilter intentFilter9 = new IntentFilter();
                                intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z10;
                                m1Var2 = m1Var9;
                                s0Var = s0Var6;
                                bVar5 = bVar2;
                                b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter9, 2);
                                ea.s0 s0Var115 = m1Var2.f39587f;
                                m1.h(s0Var115);
                                s0Var115.f39759m.b("Registered app receiver");
                                if (z13) {
                                    m1.e(m1Var8.f39601u);
                                    m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                }
                            } else {
                                m1Var2 = m1Var9;
                                bVar5 = bVar2;
                                s0Var = s0Var6;
                            }
                            sVar = a1Var3.f39208g;
                            y1VarN0 = a1Var3.N0();
                            int i18 = y1VarN0.f39927b;
                            v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                            m1Var3 = m1Var2;
                            v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                            v1Var = v1.UNINITIALIZED;
                            if (v1VarW0 == v1Var) {
                                bVar6 = bVar4;
                                l4Var = l4Var4;
                                if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                    EnumMap enumMap5 = new EnumMap(x1.class);
                                    enumMap5.put(x1.AD_STORAGE, v1VarW0);
                                    enumMap5.put(x1Var, v1VarW1);
                                    y1Var = new y1(enumMap5, -10);
                                    z11 = false;
                                } else {
                                    if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    y1Var = null;
                                }
                            } else {
                                bVar6 = bVar4;
                                l4Var = l4Var4;
                                if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                    EnumMap enumMap6 = new EnumMap(x1.class);
                                    enumMap6.put(x1.AD_STORAGE, v1VarW0);
                                    enumMap6.put(x1Var, v1VarW1);
                                    y1Var = new y1(enumMap6, -10);
                                    z11 = false;
                                } else {
                                    if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    y1Var = null;
                                }
                            }
                            if (y1Var != null) {
                                m1.g(p2Var);
                                p2Var.c1(y1Var, true);
                            } else {
                                y1Var = y1VarN0;
                            }
                            m1.g(p2Var);
                            m1Var4 = (m1) p2Var.f3623a;
                            p2Var.g1(y1Var);
                            a1Var3.G0();
                            int i19 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                            v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                            if (v1VarW2 != v1Var) {
                                m1.h(s0Var);
                                bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                            }
                            v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                            if (v1VarW3 == v1Var) {
                                if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                    m1.g(p2Var);
                                    p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                m1.g(p2Var);
                                p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                            if (boolT0 != null) {
                                m1.h(s0Var);
                                bVar.b("TCF client enabled.");
                                m1.g(p2Var);
                                p2Var.G0();
                                ea.s0 s0Var116 = m1Var4.f39587f;
                                m1.h(s0Var116);
                                s0Var116.f39759m.b("Register tcfPrefChangeListener.");
                                if (p2Var.f39701t == null) {
                                    p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                    p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            p2 p2Var3 = p2Var;
                                            p2Var3.getClass();
                                            if (Objects.equals(str8, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                s0 s0Var117 = ((m1) p2Var3.f3623a).f39587f;
                                                m1.h(s0Var117);
                                                s0Var117.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                d2 d2Var = p2Var3.f39702u;
                                                k9.c0.h(d2Var);
                                                d2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                a1 a1Var12 = m1Var4.f39586e;
                                m1.f(a1Var12);
                                a1Var12.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                m1.g(p2Var);
                                p2Var.M0();
                            } else {
                                m1.h(s0Var);
                                bVar.b("TCF client enabled.");
                                m1.g(p2Var);
                                p2Var.G0();
                                ea.s0 s0Var117 = m1Var4.f39587f;
                                m1.h(s0Var117);
                                s0Var117.f39759m.b("Register tcfPrefChangeListener.");
                                if (p2Var.f39701t == null) {
                                    p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                    p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            p2 p2Var3 = p2Var;
                                            p2Var3.getClass();
                                            if (Objects.equals(str8, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                s0 s0Var118 = ((m1) p2Var3.f3623a).f39587f;
                                                m1.h(s0Var118);
                                                s0Var118.f39760n.b("IABTCF_TCString change picked up in listener.");
                                                d2 d2Var = p2Var3.f39702u;
                                                k9.c0.h(d2Var);
                                                d2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                a1 a1Var13 = m1Var4.f39586e;
                                m1.f(a1Var13);
                                a1Var13.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                                m1.g(p2Var);
                                p2Var.M0();
                            }
                            z0Var = a1Var3.f39207f;
                            if (z0Var.e() == 0) {
                                m1.h(s0Var);
                                bVar3.c(Long.valueOf(j10), "Persisting first open");
                                z0Var.f(j10);
                            }
                            m1.g(p2Var);
                            l1Var = p2Var.f39698q;
                            if (l1Var.d()) {
                                a1 a1Var14 = l1Var.f39549a.f39586e;
                                m1.f(a1Var14);
                                a1Var14.f39223w.h(null);
                            }
                            if (m1Var8.c()) {
                                if (m1Var8.a()) {
                                    l4Var2 = l4Var;
                                    if (l4Var2.i1("android.permission.INTERNET")) {
                                        m1.h(s0Var);
                                        bVar7 = bVar6;
                                        bVar7.b("App is missing INTERNET permission");
                                    } else {
                                        bVar7 = bVar6;
                                    }
                                    if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                        m1.h(s0Var);
                                        bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    m1Var5 = m1Var8;
                                    context = m1Var5.f39582a;
                                    if (!r9.c.a(context).g()) {
                                        if (!l4.A1(context)) {
                                            m1.h(s0Var);
                                            bVar7.b("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!l4.b1(context)) {
                                            m1.h(s0Var);
                                            bVar7.b("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    m1.h(s0Var);
                                    bVar7.b("Uploading is not possible. App measurement disabled");
                                } else {
                                    m1Var5 = m1Var8;
                                    l4Var2 = l4Var;
                                }
                                s0Var2 = s0Var;
                            } else {
                                m1Var5 = m1Var8;
                                l4Var2 = l4Var;
                                if (TextUtils.isEmpty(m1Var5.m().N0())) {
                                    String strN6 = m1Var5.m().N0();
                                    a1Var3.G0();
                                    String string6 = a1Var3.K0().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN6);
                                    boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                                    if (zIsEmpty) {
                                        sVar2 = sVar;
                                    } else {
                                        sVar2 = sVar;
                                    }
                                    String strN7 = m1Var5.m().N0();
                                    a1Var3.G0();
                                    SharedPreferences.Editor editorEdit7 = a1Var3.K0().edit();
                                    editorEdit7.putString("gmp_app_id", strN7);
                                    editorEdit7.apply();
                                } else {
                                    sVar2 = sVar;
                                }
                                if (!a1Var3.N0().i(x1Var)) {
                                    sVar2.h(null);
                                }
                                m1.g(p2Var);
                                p2Var.f39689g.set(sVar2.g());
                                m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                s0Var2 = s0Var;
                                if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                    zA = m1Var5.a();
                                    sharedPreferences = a1Var3.f39204c;
                                    if (sharedPreferences == null) {
                                        zContains = z11;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        a1Var3.O0(!zA);
                                    }
                                    if (zA) {
                                        m1.g(p2Var);
                                        p2Var.S0();
                                    }
                                    p3 p3Var5 = m1Var5.f39589h;
                                    m1.g(p3Var5);
                                    p3Var5.f39706e.E();
                                    m1Var5.k().K0(new AtomicReference());
                                    m1Var5.k().L0(a1Var3.f39225y.E());
                                }
                            }
                            v4.a();
                            if (gVar.R0(null, ea.d0.P0)) {
                                l4Var2.G0();
                                if (l4Var2.c1() == 1) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if (z12) {
                                    long jIntValue5 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                    long jNextInt5 = new Random().nextInt(5000);
                                    m1Var5.f39592k.getClass();
                                    jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        m1.h(s0Var2);
                                        bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    m1.g(p2Var);
                                    p2Var.G0();
                                    if (p2Var.l == null) {
                                        p2Var.l = new d2(p2Var, m1Var4, 0);
                                    }
                                    p2Var.l.b(jMax);
                                }
                            }
                            a1Var3.f39215o.b(true);
                            return;
                        }
                        ea.s0 s0Var118 = m1Var.f39587f;
                        m1.h(s0Var118);
                        s0Var118.f39753f.b("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                                break;
                            }
                        }
                        if (listAsList != null) {
                            l0Var3.f39542k = listAsList;
                        } else if (listAsList.isEmpty()) {
                            m1.h(s0Var9);
                            s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                        } else {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    str2 = (String) it.next();
                                    l4Var3 = m1Var10.f39590i;
                                    m1.f(l4Var3);
                                } else {
                                    l0Var3.f39542k = listAsList;
                                }
                            } while (l4Var3.J1("safelisted event", str2));
                        }
                        if (packageManager != null) {
                            l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                        } else {
                            l0Var3.f39544n = 0;
                        }
                        ((m1) l0Var3.f3623a).C.incrementAndGet();
                        l0Var3.f39396b = true;
                        t2Var = new t2(m1Var8);
                        t2Var.I0();
                        m1Var8.f39601u = t2Var;
                        if (!t2Var.f39396b) {
                            throw new IllegalStateException("Can't initialize twice");
                        }
                        t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                        ((m1) t2Var.f3623a).C.incrementAndGet();
                        t2Var.f39396b = true;
                        m1.h(s0Var6);
                        bVar = s0Var6.f39759m;
                        bVar2 = s0Var6.l;
                        bVar3 = s0Var6.f39760n;
                        bVar4 = s0Var6.f39753f;
                        gVar.M0();
                        bVar2.c(161000L, "App measurement initialized, version");
                        m1.h(s0Var6);
                        bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM0 = l0Var.M0();
                        if (l4Var4.k1(strM0, gVar.f39416c)) {
                            m1.h(s0Var6);
                            bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            m1.h(s0Var6);
                            bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                        }
                        m1.h(s0Var6);
                        bVar.b("Debug-level message logging enabled");
                        i11 = m1Var8.A;
                        atomicInteger = m1Var8.C;
                        if (i11 != atomicInteger.get()) {
                            m1.h(s0Var6);
                            bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                        }
                        m1Var8.f39602v = true;
                        j10 = m1Var8.D;
                        x1Var = x1.ANALYTICS_STORAGE;
                        p2Var = m1Var8.f39593m;
                        j1 j1Var7 = m1Var8.f39588g;
                        m1.h(j1Var7);
                        j1Var7.G0();
                        m1.e(m1Var8.f39601u);
                        iL0 = m1Var8.f39601u.L0();
                        v4.a();
                        zR0 = gVar.R0(null, ea.d0.P0);
                        if (iL0 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zR0) {
                            l4Var4.G0();
                            if (l4Var4.c1() == 1) {
                                l4Var4.G0();
                                IntentFilter intentFilter10 = new IntentFilter();
                                intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z10;
                                m1Var2 = m1Var9;
                                s0Var = s0Var6;
                                bVar5 = bVar2;
                                b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter10, 2);
                                ea.s0 s0Var119 = m1Var2.f39587f;
                                m1.h(s0Var119);
                                s0Var119.f39759m.b("Registered app receiver");
                                if (z13) {
                                    m1.e(m1Var8.f39601u);
                                    m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                }
                            } else if (z10) {
                                z10 = true;
                                l4Var4.G0();
                                IntentFilter intentFilter11 = new IntentFilter();
                                intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z10;
                                m1Var2 = m1Var9;
                                s0Var = s0Var6;
                                bVar5 = bVar2;
                                b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter11, 2);
                                ea.s0 s0Var1110 = m1Var2.f39587f;
                                m1.h(s0Var1110);
                                s0Var1110.f39759m.b("Registered app receiver");
                                if (z13) {
                                    m1.e(m1Var8.f39601u);
                                    m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                                }
                            } else {
                                m1Var2 = m1Var9;
                                bVar5 = bVar2;
                                s0Var = s0Var6;
                            }
                        } else if (z10) {
                            z10 = true;
                            l4Var4.G0();
                            IntentFilter intentFilter12 = new IntentFilter();
                            intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z10;
                            m1Var2 = m1Var9;
                            s0Var = s0Var6;
                            bVar5 = bVar2;
                            b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter12, 2);
                            ea.s0 s0Var1111 = m1Var2.f39587f;
                            m1.h(s0Var1111);
                            s0Var1111.f39759m.b("Registered app receiver");
                            if (z13) {
                                m1.e(m1Var8.f39601u);
                                m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                            }
                        } else {
                            m1Var2 = m1Var9;
                            bVar5 = bVar2;
                            s0Var = s0Var6;
                        }
                        sVar = a1Var3.f39208g;
                        y1VarN0 = a1Var3.N0();
                        int i110 = y1VarN0.f39927b;
                        v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                        m1Var3 = m1Var2;
                        v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                        v1Var = v1.UNINITIALIZED;
                        if (v1VarW0 == v1Var) {
                            bVar6 = bVar4;
                            l4Var = l4Var4;
                            if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                EnumMap enumMap7 = new EnumMap(x1.class);
                                enumMap7.put(x1.AD_STORAGE, v1VarW0);
                                enumMap7.put(x1Var, v1VarW1);
                                y1Var = new y1(enumMap7, -10);
                                z11 = false;
                            } else {
                                if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                y1Var = null;
                            }
                        } else {
                            bVar6 = bVar4;
                            l4Var = l4Var4;
                            if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                                EnumMap enumMap8 = new EnumMap(x1.class);
                                enumMap8.put(x1.AD_STORAGE, v1VarW0);
                                enumMap8.put(x1Var, v1VarW1);
                                y1Var = new y1(enumMap8, -10);
                                z11 = false;
                            } else {
                                if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                y1Var = null;
                            }
                        }
                        if (y1Var != null) {
                            m1.g(p2Var);
                            p2Var.c1(y1Var, true);
                        } else {
                            y1Var = y1VarN0;
                        }
                        m1.g(p2Var);
                        m1Var4 = (m1) p2Var.f3623a;
                        p2Var.g1(y1Var);
                        a1Var3.G0();
                        int i111 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                        v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                        if (v1VarW2 != v1Var) {
                            m1.h(s0Var);
                            bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                        }
                        v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                        if (v1VarW3 == v1Var) {
                            if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                                m1.g(p2Var);
                                p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                            m1.g(p2Var);
                            p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                        if (boolT0 != null) {
                            m1.h(s0Var);
                            bVar.b("TCF client enabled.");
                            m1.g(p2Var);
                            p2Var.G0();
                            ea.s0 s0Var1112 = m1Var4.f39587f;
                            m1.h(s0Var1112);
                            s0Var1112.f39759m.b("Register tcfPrefChangeListener.");
                            if (p2Var.f39701t == null) {
                                p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        p2 p2Var3 = p2Var;
                                        p2Var3.getClass();
                                        if (Objects.equals(str8, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            s0 s0Var1113 = ((m1) p2Var3.f3623a).f39587f;
                                            m1.h(s0Var1113);
                                            s0Var1113.f39760n.b("IABTCF_TCString change picked up in listener.");
                                            d2 d2Var = p2Var3.f39702u;
                                            k9.c0.h(d2Var);
                                            d2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            a1 a1Var15 = m1Var4.f39586e;
                            m1.f(a1Var15);
                            a1Var15.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                            m1.g(p2Var);
                            p2Var.M0();
                        } else {
                            m1.h(s0Var);
                            bVar.b("TCF client enabled.");
                            m1.g(p2Var);
                            p2Var.G0();
                            ea.s0 s0Var1113 = m1Var4.f39587f;
                            m1.h(s0Var1113);
                            s0Var1113.f39759m.b("Register tcfPrefChangeListener.");
                            if (p2Var.f39701t == null) {
                                p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                                p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        p2 p2Var3 = p2Var;
                                        p2Var3.getClass();
                                        if (Objects.equals(str8, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            s0 s0Var1114 = ((m1) p2Var3.f3623a).f39587f;
                                            m1.h(s0Var1114);
                                            s0Var1114.f39760n.b("IABTCF_TCString change picked up in listener.");
                                            d2 d2Var = p2Var3.f39702u;
                                            k9.c0.h(d2Var);
                                            d2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            a1 a1Var16 = m1Var4.f39586e;
                            m1.f(a1Var16);
                            a1Var16.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                            m1.g(p2Var);
                            p2Var.M0();
                        }
                        z0Var = a1Var3.f39207f;
                        if (z0Var.e() == 0) {
                            m1.h(s0Var);
                            bVar3.c(Long.valueOf(j10), "Persisting first open");
                            z0Var.f(j10);
                        }
                        m1.g(p2Var);
                        l1Var = p2Var.f39698q;
                        if (l1Var.d()) {
                            a1 a1Var17 = l1Var.f39549a.f39586e;
                            m1.f(a1Var17);
                            a1Var17.f39223w.h(null);
                        }
                        if (m1Var8.c()) {
                            if (m1Var8.a()) {
                                l4Var2 = l4Var;
                                if (l4Var2.i1("android.permission.INTERNET")) {
                                    m1.h(s0Var);
                                    bVar7 = bVar6;
                                    bVar7.b("App is missing INTERNET permission");
                                } else {
                                    bVar7 = bVar6;
                                }
                                if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                    m1.h(s0Var);
                                    bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                m1Var5 = m1Var8;
                                context = m1Var5.f39582a;
                                if (!r9.c.a(context).g()) {
                                    if (!l4.A1(context)) {
                                        m1.h(s0Var);
                                        bVar7.b("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!l4.b1(context)) {
                                        m1.h(s0Var);
                                        bVar7.b("AppMeasurementService not registered/enabled");
                                    }
                                }
                                m1.h(s0Var);
                                bVar7.b("Uploading is not possible. App measurement disabled");
                            } else {
                                m1Var5 = m1Var8;
                                l4Var2 = l4Var;
                            }
                            s0Var2 = s0Var;
                        } else {
                            m1Var5 = m1Var8;
                            l4Var2 = l4Var;
                            if (TextUtils.isEmpty(m1Var5.m().N0())) {
                                String strN8 = m1Var5.m().N0();
                                a1Var3.G0();
                                String string7 = a1Var3.K0().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN8);
                                boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                                if (zIsEmpty) {
                                    sVar2 = sVar;
                                } else {
                                    sVar2 = sVar;
                                }
                                String strN9 = m1Var5.m().N0();
                                a1Var3.G0();
                                SharedPreferences.Editor editorEdit8 = a1Var3.K0().edit();
                                editorEdit8.putString("gmp_app_id", strN9);
                                editorEdit8.apply();
                            } else {
                                sVar2 = sVar;
                            }
                            if (!a1Var3.N0().i(x1Var)) {
                                sVar2.h(null);
                            }
                            m1.g(p2Var);
                            p2Var.f39689g.set(sVar2.g());
                            m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            s0Var2 = s0Var;
                            if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                                zA = m1Var5.a();
                                sharedPreferences = a1Var3.f39204c;
                                if (sharedPreferences == null) {
                                    zContains = z11;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    a1Var3.O0(!zA);
                                }
                                if (zA) {
                                    m1.g(p2Var);
                                    p2Var.S0();
                                }
                                p3 p3Var6 = m1Var5.f39589h;
                                m1.g(p3Var6);
                                p3Var6.f39706e.E();
                                m1Var5.k().K0(new AtomicReference());
                                m1Var5.k().L0(a1Var3.f39225y.E());
                            }
                        }
                        v4.a();
                        if (gVar.R0(null, ea.d0.P0)) {
                            l4Var2.G0();
                            if (l4Var2.c1() == 1) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                long jIntValue6 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                                long jNextInt6 = new Random().nextInt(5000);
                                m1Var5.f39592k.getClass();
                                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    m1.h(s0Var2);
                                    bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                m1.g(p2Var);
                                p2Var.G0();
                                if (p2Var.l == null) {
                                    p2Var.l = new d2(p2Var, m1Var4, 0);
                                }
                                p2Var.l.b(jMax);
                            }
                        }
                        a1Var3.f39215o.b(true);
                        return;
                    }
                    m1.h(s0Var9);
                    l0Var = l0Var2;
                    s0Var9.f39753f.c(ea.s0.O0(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    strB = l0Var3.f39543m;
                    if (TextUtils.isEmpty(strB)) {
                        strB = z1.b(context2, m1Var10.f39596p);
                    }
                    if (!TextUtils.isEmpty(strB)) {
                        str3 = strB;
                    }
                    l0Var3.f39545o = str3;
                    if (iB == 0) {
                        m1.h(s0Var9);
                        s0Var9.f39760n.d("App measurement enabled for app package, google app id", l0Var3.f39534c, l0Var3.f39545o);
                    }
                    break;
                } catch (IllegalStateException e13) {
                    m1.h(s0Var9);
                    s0Var9.f39753f.d("Fetching Google App Id failed with exception. appId", ea.s0.O0(packageName), e13);
                }
                i10 = Integer.MIN_VALUE;
                string = "Unknown";
                str = string;
                String str8 = installerPackageName;
                l0Var3.f39534c = packageName;
                l0Var3.f39537f = str8;
                l0Var3.f39535d = str;
                l0Var3.f39536e = i10;
                l0Var3.f39538g = string;
                l0Var3.f39539h = 0L;
                iB = m1Var10.b();
                if (iB == 0) {
                    m1.h(s0Var9);
                    s0Var9.f39760n.b("App measurement collection enabled");
                } else if (iB == 1) {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement deactivated via the manifest");
                } else if (iB == 3) {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iB == 4) {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement disabled via the manifest");
                } else if (iB == 6) {
                    m1.h(s0Var9);
                    s0Var9.f39758k.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iB == 7) {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement disabled via the global data collection setting");
                } else if (iB != 8) {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement disabled");
                    m1.h(s0Var9);
                    s0Var9.f39754g.b("Invalid scion state in identity");
                } else {
                    m1.h(s0Var9);
                    s0Var9.l.b("App measurement disabled due to denied storage consent");
                }
                l0Var3.f39545o = "";
                listAsList = null;
                l0Var3.f39542k = null;
                ea.g gVar4 = m1Var10.f39585d;
                m1Var = (m1) gVar4.f3623a;
                k9.c0.e("analytics.safelisted_events");
                bundleS0 = gVar4.S0();
                if (bundleS0 != null) {
                    if (bundleS0.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleS0.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                            break;
                        }
                    }
                    if (listAsList != null) {
                        l0Var3.f39542k = listAsList;
                    } else if (listAsList.isEmpty()) {
                        m1.h(s0Var9);
                        s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                    } else {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                str2 = (String) it.next();
                                l4Var3 = m1Var10.f39590i;
                                m1.f(l4Var3);
                            } else {
                                l0Var3.f39542k = listAsList;
                            }
                        } while (l4Var3.J1("safelisted event", str2));
                    }
                    if (packageManager != null) {
                        l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                    } else {
                        l0Var3.f39544n = 0;
                    }
                    ((m1) l0Var3.f3623a).C.incrementAndGet();
                    l0Var3.f39396b = true;
                    t2Var = new t2(m1Var8);
                    t2Var.I0();
                    m1Var8.f39601u = t2Var;
                    if (!t2Var.f39396b) {
                        throw new IllegalStateException("Can't initialize twice");
                    }
                    t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                    ((m1) t2Var.f3623a).C.incrementAndGet();
                    t2Var.f39396b = true;
                    m1.h(s0Var6);
                    bVar = s0Var6.f39759m;
                    bVar2 = s0Var6.l;
                    bVar3 = s0Var6.f39760n;
                    bVar4 = s0Var6.f39753f;
                    gVar.M0();
                    bVar2.c(161000L, "App measurement initialized, version");
                    m1.h(s0Var6);
                    bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM0 = l0Var.M0();
                    if (l4Var4.k1(strM0, gVar.f39416c)) {
                        m1.h(s0Var6);
                        bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        m1.h(s0Var6);
                        bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                    }
                    m1.h(s0Var6);
                    bVar.b("Debug-level message logging enabled");
                    i11 = m1Var8.A;
                    atomicInteger = m1Var8.C;
                    if (i11 != atomicInteger.get()) {
                        m1.h(s0Var6);
                        bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                    }
                    m1Var8.f39602v = true;
                    j10 = m1Var8.D;
                    x1Var = x1.ANALYTICS_STORAGE;
                    p2Var = m1Var8.f39593m;
                    j1 j1Var8 = m1Var8.f39588g;
                    m1.h(j1Var8);
                    j1Var8.G0();
                    m1.e(m1Var8.f39601u);
                    iL0 = m1Var8.f39601u.L0();
                    v4.a();
                    zR0 = gVar.R0(null, ea.d0.P0);
                    if (iL0 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zR0) {
                        l4Var4.G0();
                        if (l4Var4.c1() == 1) {
                            l4Var4.G0();
                            IntentFilter intentFilter13 = new IntentFilter();
                            intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z10;
                            m1Var2 = m1Var9;
                            s0Var = s0Var6;
                            bVar5 = bVar2;
                            b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter13, 2);
                            ea.s0 s0Var1114 = m1Var2.f39587f;
                            m1.h(s0Var1114);
                            s0Var1114.f39759m.b("Registered app receiver");
                            if (z13) {
                                m1.e(m1Var8.f39601u);
                                m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                            }
                        } else if (z10) {
                            z10 = true;
                            l4Var4.G0();
                            IntentFilter intentFilter14 = new IntentFilter();
                            intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z10;
                            m1Var2 = m1Var9;
                            s0Var = s0Var6;
                            bVar5 = bVar2;
                            b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter14, 2);
                            ea.s0 s0Var1115 = m1Var2.f39587f;
                            m1.h(s0Var1115);
                            s0Var1115.f39759m.b("Registered app receiver");
                            if (z13) {
                                m1.e(m1Var8.f39601u);
                                m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                            }
                        } else {
                            m1Var2 = m1Var9;
                            bVar5 = bVar2;
                            s0Var = s0Var6;
                        }
                    } else if (z10) {
                        z10 = true;
                        l4Var4.G0();
                        IntentFilter intentFilter15 = new IntentFilter();
                        intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z10;
                        m1Var2 = m1Var9;
                        s0Var = s0Var6;
                        bVar5 = bVar2;
                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter15, 2);
                        ea.s0 s0Var1116 = m1Var2.f39587f;
                        m1.h(s0Var1116);
                        s0Var1116.f39759m.b("Registered app receiver");
                        if (z13) {
                            m1.e(m1Var8.f39601u);
                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                        }
                    } else {
                        m1Var2 = m1Var9;
                        bVar5 = bVar2;
                        s0Var = s0Var6;
                    }
                    sVar = a1Var3.f39208g;
                    y1VarN0 = a1Var3.N0();
                    int i112 = y1VarN0.f39927b;
                    v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                    m1Var3 = m1Var2;
                    v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                    v1Var = v1.UNINITIALIZED;
                    if (v1VarW0 == v1Var) {
                        bVar6 = bVar4;
                        l4Var = l4Var4;
                        if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                            EnumMap enumMap9 = new EnumMap(x1.class);
                            enumMap9.put(x1.AD_STORAGE, v1VarW0);
                            enumMap9.put(x1Var, v1VarW1);
                            y1Var = new y1(enumMap9, -10);
                            z11 = false;
                        } else {
                            if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            y1Var = null;
                        }
                    } else {
                        bVar6 = bVar4;
                        l4Var = l4Var4;
                        if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                            EnumMap enumMap10 = new EnumMap(x1.class);
                            enumMap10.put(x1.AD_STORAGE, v1VarW0);
                            enumMap10.put(x1Var, v1VarW1);
                            y1Var = new y1(enumMap10, -10);
                            z11 = false;
                        } else {
                            if (TextUtils.isEmpty(m1Var8.m().N0())) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            y1Var = null;
                        }
                    }
                    if (y1Var != null) {
                        m1.g(p2Var);
                        p2Var.c1(y1Var, true);
                    } else {
                        y1Var = y1VarN0;
                    }
                    m1.g(p2Var);
                    m1Var4 = (m1) p2Var.f3623a;
                    p2Var.g1(y1Var);
                    a1Var3.G0();
                    int i113 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                    v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                    if (v1VarW2 != v1Var) {
                        m1.h(s0Var);
                        bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                    }
                    v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                    if (v1VarW3 == v1Var) {
                        if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                            m1.g(p2Var);
                            p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                        m1.g(p2Var);
                        p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                    if (boolT0 != null) {
                        m1.h(s0Var);
                        bVar.b("TCF client enabled.");
                        m1.g(p2Var);
                        p2Var.G0();
                        ea.s0 s0Var1117 = m1Var4.f39587f;
                        m1.h(s0Var1117);
                        s0Var1117.f39759m.b("Register tcfPrefChangeListener.");
                        if (p2Var.f39701t == null) {
                            p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                            p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    p2 p2Var3 = p2Var;
                                    p2Var3.getClass();
                                    if (Objects.equals(str9, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        s0 s0Var1118 = ((m1) p2Var3.f3623a).f39587f;
                                        m1.h(s0Var1118);
                                        s0Var1118.f39760n.b("IABTCF_TCString change picked up in listener.");
                                        d2 d2Var = p2Var3.f39702u;
                                        k9.c0.h(d2Var);
                                        d2Var.b(500L);
                                    }
                                }
                            };
                        }
                        a1 a1Var18 = m1Var4.f39586e;
                        m1.f(a1Var18);
                        a1Var18.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                        m1.g(p2Var);
                        p2Var.M0();
                    } else {
                        m1.h(s0Var);
                        bVar.b("TCF client enabled.");
                        m1.g(p2Var);
                        p2Var.G0();
                        ea.s0 s0Var1118 = m1Var4.f39587f;
                        m1.h(s0Var1118);
                        s0Var1118.f39759m.b("Register tcfPrefChangeListener.");
                        if (p2Var.f39701t == null) {
                            p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                            p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    p2 p2Var3 = p2Var;
                                    p2Var3.getClass();
                                    if (Objects.equals(str9, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        s0 s0Var1119 = ((m1) p2Var3.f3623a).f39587f;
                                        m1.h(s0Var1119);
                                        s0Var1119.f39760n.b("IABTCF_TCString change picked up in listener.");
                                        d2 d2Var = p2Var3.f39702u;
                                        k9.c0.h(d2Var);
                                        d2Var.b(500L);
                                    }
                                }
                            };
                        }
                        a1 a1Var19 = m1Var4.f39586e;
                        m1.f(a1Var19);
                        a1Var19.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                        m1.g(p2Var);
                        p2Var.M0();
                    }
                    z0Var = a1Var3.f39207f;
                    if (z0Var.e() == 0) {
                        m1.h(s0Var);
                        bVar3.c(Long.valueOf(j10), "Persisting first open");
                        z0Var.f(j10);
                    }
                    m1.g(p2Var);
                    l1Var = p2Var.f39698q;
                    if (l1Var.d()) {
                        a1 a1Var110 = l1Var.f39549a.f39586e;
                        m1.f(a1Var110);
                        a1Var110.f39223w.h(null);
                    }
                    if (m1Var8.c()) {
                        if (m1Var8.a()) {
                            l4Var2 = l4Var;
                            if (l4Var2.i1("android.permission.INTERNET")) {
                                m1.h(s0Var);
                                bVar7 = bVar6;
                                bVar7.b("App is missing INTERNET permission");
                            } else {
                                bVar7 = bVar6;
                            }
                            if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                                m1.h(s0Var);
                                bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            m1Var5 = m1Var8;
                            context = m1Var5.f39582a;
                            if (!r9.c.a(context).g()) {
                                if (!l4.A1(context)) {
                                    m1.h(s0Var);
                                    bVar7.b("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!l4.b1(context)) {
                                    m1.h(s0Var);
                                    bVar7.b("AppMeasurementService not registered/enabled");
                                }
                            }
                            m1.h(s0Var);
                            bVar7.b("Uploading is not possible. App measurement disabled");
                        } else {
                            m1Var5 = m1Var8;
                            l4Var2 = l4Var;
                        }
                        s0Var2 = s0Var;
                    } else {
                        m1Var5 = m1Var8;
                        l4Var2 = l4Var;
                        if (TextUtils.isEmpty(m1Var5.m().N0())) {
                            String strN10 = m1Var5.m().N0();
                            a1Var3.G0();
                            String string8 = a1Var3.K0().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN10);
                            boolean zIsEmpty7 = TextUtils.isEmpty(string8);
                            if (zIsEmpty) {
                                sVar2 = sVar;
                            } else {
                                sVar2 = sVar;
                            }
                            String strN11 = m1Var5.m().N0();
                            a1Var3.G0();
                            SharedPreferences.Editor editorEdit9 = a1Var3.K0().edit();
                            editorEdit9.putString("gmp_app_id", strN11);
                            editorEdit9.apply();
                        } else {
                            sVar2 = sVar;
                        }
                        if (!a1Var3.N0().i(x1Var)) {
                            sVar2.h(null);
                        }
                        m1.g(p2Var);
                        p2Var.f39689g.set(sVar2.g());
                        m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        s0Var2 = s0Var;
                        if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                            zA = m1Var5.a();
                            sharedPreferences = a1Var3.f39204c;
                            if (sharedPreferences == null) {
                                zContains = z11;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                a1Var3.O0(!zA);
                            }
                            if (zA) {
                                m1.g(p2Var);
                                p2Var.S0();
                            }
                            p3 p3Var7 = m1Var5.f39589h;
                            m1.g(p3Var7);
                            p3Var7.f39706e.E();
                            m1Var5.k().K0(new AtomicReference());
                            m1Var5.k().L0(a1Var3.f39225y.E());
                        }
                    }
                    v4.a();
                    if (gVar.R0(null, ea.d0.P0)) {
                        l4Var2.G0();
                        if (l4Var2.c1() == 1) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (z12) {
                            long jIntValue7 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                            long jNextInt7 = new Random().nextInt(5000);
                            m1Var5.f39592k.getClass();
                            jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                m1.h(s0Var2);
                                bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            m1.g(p2Var);
                            p2Var.G0();
                            if (p2Var.l == null) {
                                p2Var.l = new d2(p2Var, m1Var4, 0);
                            }
                            p2Var.l.b(jMax);
                        }
                    }
                    a1Var3.f39215o.b(true);
                    return;
                }
                ea.s0 s0Var1119 = m1Var.f39587f;
                m1.h(s0Var1119);
                s0Var1119.f39753f.b("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = m1Var.f39582a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                        break;
                    }
                }
                if (listAsList != null) {
                    l0Var3.f39542k = listAsList;
                } else if (listAsList.isEmpty()) {
                    m1.h(s0Var9);
                    s0Var9.f39758k.b("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            l4Var3 = m1Var10.f39590i;
                            m1.f(l4Var3);
                        } else {
                            l0Var3.f39542k = listAsList;
                        }
                    } while (l4Var3.J1("safelisted event", str2));
                }
                if (packageManager != null) {
                    l0Var3.f39544n = r9.b.r(context2) ? 1 : 0;
                } else {
                    l0Var3.f39544n = 0;
                }
                ((m1) l0Var3.f3623a).C.incrementAndGet();
                l0Var3.f39396b = true;
                t2Var = new t2(m1Var8);
                t2Var.I0();
                m1Var8.f39601u = t2Var;
                if (!t2Var.f39396b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                t2Var.f39767c = (JobScheduler) ((m1) t2Var.f3623a).f39582a.getSystemService("jobscheduler");
                ((m1) t2Var.f3623a).C.incrementAndGet();
                t2Var.f39396b = true;
                m1.h(s0Var6);
                bVar = s0Var6.f39759m;
                bVar2 = s0Var6.l;
                bVar3 = s0Var6.f39760n;
                bVar4 = s0Var6.f39753f;
                gVar.M0();
                bVar2.c(161000L, "App measurement initialized, version");
                m1.h(s0Var6);
                bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM0 = l0Var.M0();
                if (l4Var4.k1(strM0, gVar.f39416c)) {
                    m1.h(s0Var6);
                    bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    m1.h(s0Var6);
                    bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM0)));
                }
                m1.h(s0Var6);
                bVar.b("Debug-level message logging enabled");
                i11 = m1Var8.A;
                atomicInteger = m1Var8.C;
                if (i11 != atomicInteger.get()) {
                    m1.h(s0Var6);
                    bVar4.d("Not all components initialized", Integer.valueOf(m1Var8.A), Integer.valueOf(atomicInteger.get()));
                }
                m1Var8.f39602v = true;
                j10 = m1Var8.D;
                x1Var = x1.ANALYTICS_STORAGE;
                p2Var = m1Var8.f39593m;
                j1 j1Var9 = m1Var8.f39588g;
                m1.h(j1Var9);
                j1Var9.G0();
                m1.e(m1Var8.f39601u);
                iL0 = m1Var8.f39601u.L0();
                v4.a();
                zR0 = gVar.R0(null, ea.d0.P0);
                if (iL0 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zR0) {
                    l4Var4.G0();
                    if (l4Var4.c1() == 1) {
                        l4Var4.G0();
                        IntentFilter intentFilter16 = new IntentFilter();
                        intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z10;
                        m1Var2 = m1Var9;
                        s0Var = s0Var6;
                        bVar5 = bVar2;
                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter16, 2);
                        ea.s0 s0Var11110 = m1Var2.f39587f;
                        m1.h(s0Var11110);
                        s0Var11110.f39759m.b("Registered app receiver");
                        if (z13) {
                            m1.e(m1Var8.f39601u);
                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                        }
                    } else if (z10) {
                        z10 = true;
                        l4Var4.G0();
                        IntentFilter intentFilter17 = new IntentFilter();
                        intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z10;
                        m1Var2 = m1Var9;
                        s0Var = s0Var6;
                        bVar5 = bVar2;
                        b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter17, 2);
                        ea.s0 s0Var11111 = m1Var2.f39587f;
                        m1.h(s0Var11111);
                        s0Var11111.f39759m.b("Registered app receiver");
                        if (z13) {
                            m1.e(m1Var8.f39601u);
                            m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                        }
                    } else {
                        m1Var2 = m1Var9;
                        bVar5 = bVar2;
                        s0Var = s0Var6;
                    }
                } else if (z10) {
                    z10 = true;
                    l4Var4.G0();
                    IntentFilter intentFilter18 = new IntentFilter();
                    intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z13 = z10;
                    m1Var2 = m1Var9;
                    s0Var = s0Var6;
                    bVar5 = bVar2;
                    b0.b.h(m1Var2.f39582a, new q7.c(m1Var2), intentFilter18, 2);
                    ea.s0 s0Var11112 = m1Var2.f39587f;
                    m1.h(s0Var11112);
                    s0Var11112.f39759m.b("Registered app receiver");
                    if (z13) {
                        m1.e(m1Var8.f39601u);
                        m1Var8.f39601u.K0(((Long) ea.d0.C.a(null)).longValue());
                    }
                } else {
                    m1Var2 = m1Var9;
                    bVar5 = bVar2;
                    s0Var = s0Var6;
                }
                sVar = a1Var3.f39208g;
                y1VarN0 = a1Var3.N0();
                int i114 = y1VarN0.f39927b;
                v1VarW0 = gVar.W0("google_analytics_default_allow_ad_storage", false);
                m1Var3 = m1Var2;
                v1VarW1 = gVar.W0("google_analytics_default_allow_analytics_storage", false);
                v1Var = v1.UNINITIALIZED;
                if (v1VarW0 == v1Var) {
                    bVar6 = bVar4;
                    l4Var = l4Var4;
                    if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                        EnumMap enumMap11 = new EnumMap(x1.class);
                        enumMap11.put(x1.AD_STORAGE, v1VarW0);
                        enumMap11.put(x1Var, v1VarW1);
                        y1Var = new y1(enumMap11, -10);
                        z11 = false;
                    } else {
                        if (TextUtils.isEmpty(m1Var8.m().N0())) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        y1Var = null;
                    }
                } else {
                    bVar6 = bVar4;
                    l4Var = l4Var4;
                    if (y1.l(-10, a1Var3.K0().getInt("consent_source", 100))) {
                        EnumMap enumMap12 = new EnumMap(x1.class);
                        enumMap12.put(x1.AD_STORAGE, v1VarW0);
                        enumMap12.put(x1Var, v1VarW1);
                        y1Var = new y1(enumMap12, -10);
                        z11 = false;
                    } else {
                        if (TextUtils.isEmpty(m1Var8.m().N0())) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        y1Var = null;
                    }
                }
                if (y1Var != null) {
                    m1.g(p2Var);
                    p2Var.c1(y1Var, true);
                } else {
                    y1Var = y1VarN0;
                }
                m1.g(p2Var);
                m1Var4 = (m1) p2Var.f3623a;
                p2Var.g1(y1Var);
                a1Var3.G0();
                int i115 = ea.o.b(a1Var3.K0().getString("dma_consent_settings", null)).f39654a;
                v1VarW2 = gVar.W0("google_analytics_default_allow_ad_personalization_signals", true);
                if (v1VarW2 != v1Var) {
                    m1.h(s0Var);
                    bVar3.c(v1VarW2, "Default ad personalization consent from Manifest");
                }
                v1VarW3 = gVar.W0("google_analytics_default_allow_ad_user_data", true);
                if (v1VarW3 == v1Var) {
                    if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                        m1.g(p2Var);
                        p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(m1Var8.m().N0())) {
                    m1.g(p2Var);
                    p2Var.b1(new ea.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolT0 = gVar.T0("google_analytics_tcf_data_enabled");
                if (boolT0 != null) {
                    m1.h(s0Var);
                    bVar.b("TCF client enabled.");
                    m1.g(p2Var);
                    p2Var.G0();
                    ea.s0 s0Var11113 = m1Var4.f39587f;
                    m1.h(s0Var11113);
                    s0Var11113.f39759m.b("Register tcfPrefChangeListener.");
                    if (p2Var.f39701t == null) {
                        p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                        p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                p2 p2Var3 = p2Var;
                                p2Var3.getClass();
                                if (Objects.equals(str9, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    s0 s0Var11114 = ((m1) p2Var3.f3623a).f39587f;
                                    m1.h(s0Var11114);
                                    s0Var11114.f39760n.b("IABTCF_TCString change picked up in listener.");
                                    d2 d2Var = p2Var3.f39702u;
                                    k9.c0.h(d2Var);
                                    d2Var.b(500L);
                                }
                            }
                        };
                    }
                    a1 a1Var111 = m1Var4.f39586e;
                    m1.f(a1Var111);
                    a1Var111.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                    m1.g(p2Var);
                    p2Var.M0();
                } else {
                    m1.h(s0Var);
                    bVar.b("TCF client enabled.");
                    m1.g(p2Var);
                    p2Var.G0();
                    ea.s0 s0Var11114 = m1Var4.f39587f;
                    m1.h(s0Var11114);
                    s0Var11114.f39759m.b("Register tcfPrefChangeListener.");
                    if (p2Var.f39701t == null) {
                        p2Var.f39702u = new d2(p2Var, m1Var4, 2);
                        p2Var.f39701t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ea.o2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                p2 p2Var3 = p2Var;
                                p2Var3.getClass();
                                if (Objects.equals(str9, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    s0 s0Var11115 = ((m1) p2Var3.f3623a).f39587f;
                                    m1.h(s0Var11115);
                                    s0Var11115.f39760n.b("IABTCF_TCString change picked up in listener.");
                                    d2 d2Var = p2Var3.f39702u;
                                    k9.c0.h(d2Var);
                                    d2Var.b(500L);
                                }
                            }
                        };
                    }
                    a1 a1Var112 = m1Var4.f39586e;
                    m1.f(a1Var112);
                    a1Var112.L0().registerOnSharedPreferenceChangeListener(p2Var.f39701t);
                    m1.g(p2Var);
                    p2Var.M0();
                }
                z0Var = a1Var3.f39207f;
                if (z0Var.e() == 0) {
                    m1.h(s0Var);
                    bVar3.c(Long.valueOf(j10), "Persisting first open");
                    z0Var.f(j10);
                }
                m1.g(p2Var);
                l1Var = p2Var.f39698q;
                if (l1Var.d()) {
                    a1 a1Var113 = l1Var.f39549a.f39586e;
                    m1.f(a1Var113);
                    a1Var113.f39223w.h(null);
                }
                if (m1Var8.c()) {
                    if (m1Var8.a()) {
                        l4Var2 = l4Var;
                        if (l4Var2.i1("android.permission.INTERNET")) {
                            m1.h(s0Var);
                            bVar7 = bVar6;
                            bVar7.b("App is missing INTERNET permission");
                        } else {
                            bVar7 = bVar6;
                        }
                        if (!l4Var2.i1("android.permission.ACCESS_NETWORK_STATE")) {
                            m1.h(s0Var);
                            bVar7.b("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        m1Var5 = m1Var8;
                        context = m1Var5.f39582a;
                        if (!r9.c.a(context).g()) {
                            if (!l4.A1(context)) {
                                m1.h(s0Var);
                                bVar7.b("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!l4.b1(context)) {
                                m1.h(s0Var);
                                bVar7.b("AppMeasurementService not registered/enabled");
                            }
                        }
                        m1.h(s0Var);
                        bVar7.b("Uploading is not possible. App measurement disabled");
                    } else {
                        m1Var5 = m1Var8;
                        l4Var2 = l4Var;
                    }
                    s0Var2 = s0Var;
                } else {
                    m1Var5 = m1Var8;
                    l4Var2 = l4Var;
                    if (TextUtils.isEmpty(m1Var5.m().N0())) {
                        String strN12 = m1Var5.m().N0();
                        a1Var3.G0();
                        String string9 = a1Var3.K0().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN12);
                        boolean zIsEmpty8 = TextUtils.isEmpty(string9);
                        if (zIsEmpty) {
                            sVar2 = sVar;
                        } else {
                            sVar2 = sVar;
                        }
                        String strN13 = m1Var5.m().N0();
                        a1Var3.G0();
                        SharedPreferences.Editor editorEdit10 = a1Var3.K0().edit();
                        editorEdit10.putString("gmp_app_id", strN13);
                        editorEdit10.apply();
                    } else {
                        sVar2 = sVar;
                    }
                    if (!a1Var3.N0().i(x1Var)) {
                        sVar2.h(null);
                    }
                    m1.g(p2Var);
                    p2Var.f39689g.set(sVar2.g());
                    m1Var3.f39582a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    s0Var2 = s0Var;
                    if (!TextUtils.isEmpty(m1Var5.m().N0())) {
                        zA = m1Var5.a();
                        sharedPreferences = a1Var3.f39204c;
                        if (sharedPreferences == null) {
                            zContains = z11;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            a1Var3.O0(!zA);
                        }
                        if (zA) {
                            m1.g(p2Var);
                            p2Var.S0();
                        }
                        p3 p3Var8 = m1Var5.f39589h;
                        m1.g(p3Var8);
                        p3Var8.f39706e.E();
                        m1Var5.k().K0(new AtomicReference());
                        m1Var5.k().L0(a1Var3.f39225y.E());
                    }
                }
                v4.a();
                if (gVar.R0(null, ea.d0.P0)) {
                    l4Var2.G0();
                    if (l4Var2.c1() == 1) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        long jIntValue8 = ((Integer) ea.d0.f39337w0.a(null)).intValue();
                        long jNextInt8 = new Random().nextInt(5000);
                        m1Var5.f39592k.getClass();
                        jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            m1.h(s0Var2);
                            bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        m1.g(p2Var);
                        p2Var.G0();
                        if (p2Var.l == null) {
                            p2Var.l = new d2(p2Var, m1Var4, 0);
                        }
                        p2Var.l.b(jMax);
                    }
                }
                a1Var3.f39215o.b(true);
                return;
            case 8:
                e4 e4Var = ((s1) this.f50624c).f39761a;
                e4Var.V();
                ea.e eVar = (ea.e) this.f50623b;
                if (eVar.f39354c.zza() == null) {
                    e4Var.getClass();
                    String str9 = eVar.f39352a;
                    k9.c0.h(str9);
                    n4 n4VarN = e4Var.N(str9);
                    if (n4VarN != null) {
                        e4Var.a0(eVar, n4VarN);
                        return;
                    }
                    return;
                }
                e4Var.getClass();
                String str10 = eVar.f39352a;
                k9.c0.h(str10);
                n4 n4VarN2 = e4Var.N(str10);
                if (n4VarN2 != null) {
                    e4Var.Z(eVar, n4VarN2);
                    return;
                }
                return;
            case 9:
                a7 a7Var = (a7) this.f50623b;
                p2 p2Var3 = (p2) this.f50624c;
                m1 m1Var11 = (m1) p2Var3.f3623a;
                m1 m1Var12 = (m1) p2Var3.f3623a;
                p3 p3Var9 = m1Var11.f39589h;
                m1.g(p3Var9);
                m1 m1Var13 = (m1) p3Var9.f3623a;
                a1 a1Var20 = m1Var13.f39586e;
                m1.f(a1Var20);
                if (a1Var20.N0().i(x1.ANALYTICS_STORAGE)) {
                    m1.f(a1Var20);
                    z0 z0Var2 = a1Var20.f39217q;
                    m1Var13.f39592k.getClass();
                    if (!a1Var20.P0(System.currentTimeMillis()) && z0Var2.e() != 0) {
                        lValueOf = Long.valueOf(z0Var2.e());
                    }
                    if (lValueOf == null) {
                        l4 l4Var5 = m1Var12.f39590i;
                        m1.f(l4Var5);
                        l4Var5.t1(a7Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            a7Var.e1(null);
                            return;
                        } catch (RemoteException e14) {
                            ea.s0 s0Var20 = m1Var12.f39587f;
                            m1.h(s0Var20);
                            s0Var20.f39753f.c(e14, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                ea.s0 s0Var21 = m1Var13.f39587f;
                m1.h(s0Var21);
                s0Var21.f39758k.b("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    a7Var.e1(null);
                    return;
                }
                l4 l4Var6 = m1Var12.f39590i;
                m1.f(l4Var6);
                l4Var6.t1(a7Var, lValueOf.longValue());
                return;
            case 10:
                ((p2) this.f50624c).X0((Boolean) this.f50623b, true);
                return;
            case 11:
                p2 p2Var4 = (p2) this.f50624c;
                m1 m1Var14 = (m1) p2Var4.f3623a;
                a1 a1Var21 = m1Var14.f39586e;
                ea.s0 s0Var22 = m1Var14.f39587f;
                m1.f(a1Var21);
                a1Var21.G0();
                a1Var21.G0();
                ea.o oVarB = ea.o.b(a1Var21.K0().getString("dma_consent_settings", null));
                ea.o oVar = (ea.o) this.f50623b;
                int i20 = oVar.f39654a;
                if (!y1.l(i20, oVarB.f39654a)) {
                    m1.h(s0Var22);
                    s0Var22.l.c(Integer.valueOf(i20), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit11 = a1Var21.K0().edit();
                editorEdit11.putString("dma_consent_settings", oVar.f39655b);
                editorEdit11.apply();
                m1.h(s0Var22);
                s0Var22.f39760n.c(oVar, "Setting DMA consent(FE)");
                m1 m1Var15 = (m1) p2Var4.f3623a;
                if (m1Var15.k().Q0()) {
                    h3 h3VarK = m1Var15.k();
                    h3VarK.G0();
                    h3VarK.H0();
                    h3VarK.U0(new f3(h3VarK, 1));
                    return;
                }
                h3 h3VarK2 = m1Var15.k();
                h3VarK2.G0();
                h3VarK2.H0();
                if (h3VarK2.P0()) {
                    h3VarK2.U0(new c3(h3VarK2, h3VarK2.W0(false)));
                    return;
                }
                return;
            case 12:
                p2 p2Var5 = ((AppMeasurementDynamiteService) this.f50624c).f24515a.f39593m;
                m1.g(p2Var5);
                eb.d0 d0Var = (eb.d0) this.f50623b;
                p2Var5.G0();
                p2Var5.H0();
                eb.d0 d0Var2 = p2Var5.f39686d;
                if (d0Var != d0Var2) {
                    k9.c0.j("EventInterceptor already set.", d0Var2 == null);
                }
                p2Var5.f39686d = d0Var;
                return;
            case 13:
                p2 p2Var6 = (p2) this.f50623b;
                p2Var6.G0();
                List<t3> list = (List) this.f50624c;
                a1 a1Var22 = ((m1) p2Var6.f3623a).f39586e;
                m1.f(a1Var22);
                SparseArray sparseArrayM1 = a1Var22.M0();
                for (t3 t3Var2 : list) {
                    int i21 = t3Var2.f39770c;
                    if (!sparseArrayM1.contains(i21) || ((Long) sparseArrayM1.get(i21)).longValue() < t3Var2.f39769b) {
                        p2Var6.e1().add(t3Var2);
                    }
                }
                p2Var6.f1();
                return;
            case 14:
                m1 m1Var16 = (m1) ((p2) this.f50623b).f3623a;
                ea.l0 l0VarM = m1Var16.m();
                String str11 = (String) this.f50624c;
                String str12 = l0VarM.f39548r;
                boolean z17 = false;
                if (str12 != null && !str12.equals(str11)) {
                    z17 = true;
                }
                l0VarM.f39548r = str11;
                if (z17) {
                    m1Var16.m().L0();
                    return;
                }
                return;
            case 15:
                h3 h3Var2 = (h3) this.f50624c;
                ea.g0 g0Var = h3Var2.f39458d;
                m1 m1Var17 = (m1) h3Var2.f3623a;
                if (g0Var == null) {
                    ea.s0 s0Var23 = m1Var17.f39587f;
                    m1.h(s0Var23);
                    s0Var23.f39753f.b("Failed to send current screen to service");
                    return;
                }
                try {
                    w2 w2Var = (w2) this.f50623b;
                    if (w2Var == null) {
                        g0Var.D0(0L, null, null, m1Var17.f39582a.getPackageName());
                    } else {
                        g0Var.D0(w2Var.f39864c, w2Var.f39862a, w2Var.f39863b, m1Var17.f39582a.getPackageName());
                    }
                    h3Var2.T0();
                    return;
                } catch (RemoteException e15) {
                    ea.s0 s0Var24 = ((m1) h3Var2.f3623a).f39587f;
                    m1.h(s0Var24);
                    s0Var24.f39753f.c(e15, "Failed to send current screen to the service");
                    return;
                }
            case 16:
                ((g3) this.f50624c).f39429c.R0((ComponentName) this.f50623b);
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                n5.f fVar = (n5.f) this.f50623b;
                JobParameters jobParameters = (JobParameters) this.f50624c;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((ea.k3) ((Service) fVar.f46523b)).c(jobParameters);
                return;
            case 20:
                c();
                return;
            case 21:
                d();
                return;
            case 22:
                e();
                return;
            case 23:
                f();
                return;
            case 24:
                g();
                return;
            case 25:
                h();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                i();
                return;
            case 27:
                ((j0.e) this.f50623b).accept(this.f50624c);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                j();
                return;
            default:
                for (j5.c cVar : (ArrayList) this.f50623b) {
                    Object obj = ((k5.d) this.f50624c).f44319e;
                    cVar.f43712b = obj;
                    cVar.d(cVar.f43714d, obj);
                }
                return;
        }
    }

    public String toString() {
        switch (this.f50622a) {
            case 0:
                v9.e eVar = new v9.e(i0.class.getSimpleName(), 24);
                f2 f2Var = (f2) this.f50624c;
                m0.s1 s1Var = new m0.s1(9, false);
                ((m0.s1) eVar.f52505d).f45752c = s1Var;
                eVar.f52505d = s1Var;
                s1Var.f45751b = f2Var;
                return eVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i0(Object obj, boolean z10, Object obj2, int i10) {
        this.f50622a = i10;
        this.f50624c = obj;
        this.f50623b = obj2;
    }

    public i0(b1 b1Var, p6 p6Var, b1 b1Var2) {
        this.f50622a = 6;
        this.f50623b = p6Var;
        this.f50624c = b1Var;
    }

    public i0(p2 p2Var, a7 a7Var) {
        this.f50622a = 9;
        this.f50623b = a7Var;
        Objects.requireNonNull(p2Var);
        this.f50624c = p2Var;
    }

    public i0(h3 h3Var, w2 w2Var) {
        this.f50622a = 15;
        this.f50623b = w2Var;
        Objects.requireNonNull(h3Var);
        this.f50624c = h3Var;
    }

    public i0(n5.f fVar, e4 e4Var, Runnable runnable) {
        this.f50622a = 18;
        this.f50623b = e4Var;
        this.f50624c = runnable;
    }
}
