package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.Xa;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k9.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f11689p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f11690q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f11691r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static e f11692s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k9.o f11695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m9.d f11696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i9.d f11698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eb.d0 f11699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f11700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f11701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f11702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f11703k;
    public final x.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.f f11704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u6 f11705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f11706o;

    public e(Context context, Looper looper) {
        i9.d dVar = i9.d.f42926e;
        this.f11693a = Xa.f27908s;
        this.f11694b = false;
        this.f11700h = new AtomicInteger(1);
        this.f11701i = new AtomicInteger(0);
        this.f11702j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f11703k = null;
        this.l = new x.f(0);
        this.f11704m = new x.f(0);
        this.f11706o = true;
        this.f11697e = context;
        u6 u6Var = new u6(looper, this);
        Looper.getMainLooper();
        this.f11705n = u6Var;
        this.f11698f = dVar;
        this.f11699g = new eb.d0(25);
        PackageManager packageManager = context.getPackageManager();
        if (p9.c.f48285g == null) {
            p9.c.f48285g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p9.c.f48285g.booleanValue()) {
            this.f11706o = false;
        }
        u6Var.sendMessage(u6Var.obtainMessage(6));
    }

    public static Status c(a aVar, ConnectionResult connectionResult) {
        String str = (String) aVar.f11668b.f39977c;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, d5.u.h(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.f11642c, connectionResult);
    }

    public static e d(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (f11691r) {
            if (f11692s == null) {
                synchronized (o0.f44493g) {
                    try {
                        handlerThread = o0.f44495i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            o0.f44495i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = o0.f44495i;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = i9.d.f42925d;
                f11692s = new e(applicationContext, looper);
            }
            eVar = f11692s;
        }
        return eVar;
    }

    public final r a(j9.i iVar) {
        a aVar = iVar.f43745f;
        ConcurrentHashMap concurrentHashMap = this.f11702j;
        r rVar = (r) concurrentHashMap.get(aVar);
        if (rVar == null) {
            rVar = new r(this, iVar);
            concurrentHashMap.put(aVar, rVar);
        }
        if (rVar.f11752b.requiresSignIn()) {
            this.f11704m.add(aVar);
        }
        rVar.o();
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public final void b(TaskCompletionSource taskCompletionSource, int i10, j9.i iVar) {
        c2.j jVar;
        e eVar;
        if (i10 != 0) {
            a aVar = iVar.f43745f;
            if (f()) {
                k9.n nVar = (k9.n) k9.m.b().f44477a;
                boolean z10 = true;
                if (nVar != null) {
                    if (nVar.f44486b) {
                        boolean z11 = nVar.f44487c;
                        r rVar = (r) this.f11702j.get(aVar);
                        if (rVar != null) {
                            Object obj = rVar.f11752b;
                            if (obj instanceof k9.f) {
                                k9.f fVar = (k9.f) obj;
                                if (!fVar.hasConnectionInfo() || fVar.isConnecting()) {
                                    z10 = z11;
                                } else {
                                    k9.g gVarD = c2.j.d(rVar, fVar, i10);
                                    if (gVarD != null) {
                                        rVar.l++;
                                        z10 = gVarD.f44432c;
                                    }
                                }
                            }
                        } else {
                            z10 = z11;
                        }
                    }
                    jVar = null;
                    eVar = this;
                }
                eVar = this;
                jVar = new c2.j(eVar, i10, aVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                jVar = null;
                eVar = this;
            }
            if (jVar != null) {
                Task task = taskCompletionSource.getTask();
                u6 u6Var = eVar.f11705n;
                Objects.requireNonNull(u6Var);
                task.addOnCompleteListener(new u(u6Var, 0), jVar);
            }
        }
    }

    public final void e(o oVar) {
        synchronized (f11691r) {
            try {
                if (this.f11703k != oVar) {
                    this.f11703k = oVar;
                    this.l.clear();
                }
                this.l.addAll(oVar.f11745e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        int i10;
        if (this.f11694b) {
            return false;
        }
        k9.n nVar = (k9.n) k9.m.b().f44477a;
        if (nVar != null && !nVar.f44486b) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f11699g.f39976b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(203400000, -1);
        }
        return i10 == -1 || i10 == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i10) {
        i9.d dVar = this.f11698f;
        dVar.getClass();
        Context context = this.f11697e;
        if (!r9.b.r(context)) {
            int i11 = connectionResult.f11641b;
            PendingIntent activity = connectionResult.f11642c;
            if (!((i11 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = dVar.b(context, i11, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f11645b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.g(context, i11, PendingIntent.getActivity(context, 0, intent, x9.c.f53677a | 134217728));
                dVar.h(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i10) {
        if (g(connectionResult, i10)) {
            return;
        }
        u6 u6Var = this.f11705n;
        u6Var.sendMessage(u6Var.obtainMessage(5, i10, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0336  */
    /* JADX WARN: Code duplicated, block: B:162:0x033c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0372  */
    /* JADX WARN: Code duplicated, block: B:166:0x037c  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 com.google.android.gms.common.api.internal.r, still in use, count: 2, list:
          (r2v10 com.google.android.gms.common.api.internal.r) from 0x032e: IGET (r2v10 com.google.android.gms.common.api.internal.r) A[WRAPPED] (LINE:815) com.google.android.gms.common.api.internal.r.g int
          (r2v10 com.google.android.gms.common.api.internal.r) from 0x0334: PHI (r2 I:??) = (r2v7 com.google.android.gms.common.api.internal.r), (r2v10 com.google.android.gms.common.api.internal.r) binds: [B:158:0x0333, B:212:0x0334] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.handleMessage(android.os.Message):boolean");
    }
}
