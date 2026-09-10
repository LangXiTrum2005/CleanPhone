package com.google.android.gms.internal.measurement;

import android.os.Trace;
import com.google.android.gms.internal.ads.zs;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f23392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f23393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final co.c f23394c;

    static {
        oa.u0.u(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f23392a = new AtomicReference(oa.u1.f47328j);
        f23393b = new WeakHashMap();
        f23394c = new co.c(10);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static sg a() {
        rg rgVarC = c();
        sg sgVar = rgVarC.f23944b;
        if (sgVar != null && sgVar != jg.f23629g) {
            return sgVar;
        }
        zs zsVar = hg.f23550g;
        UUID uuidB = eg.f23433c.b();
        String strA = yf.a(uuidB);
        oa.u0 u0Var = (oa.u0) f23392a.get();
        if (!u0Var.isEmpty()) {
            u0Var.forEach(new gg(0));
        }
        return new hg(uuidB, strA, hg.f23550g, rgVarC);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public static sg b(rg rgVar, sg sgVar) {
        rgVar.getClass();
        sg sgVar2 = rgVar.f23944b;
        if (sgVar2 != sgVar) {
            if (sgVar2 == null) {
                rgVar.f23943a = Trace.isEnabled();
            }
            if (rgVar.f23943a) {
                if (sgVar2 != null) {
                    if (sgVar != null) {
                        if (((yf) sgVar2).f24177a == sgVar && !mb.l(sgVar2)) {
                            Trace.endSection();
                        } else if (sgVar2 == ((yf) sgVar).f24177a && !mb.l(sgVar)) {
                            mb.n(sgVar);
                        }
                    }
                    mb.j(sgVar2);
                    if (sgVar != null) {
                        mb.h(sgVar);
                    }
                } else if (sgVar != null) {
                    mb.h(sgVar);
                }
            }
            if (sgVar2 != sgVar) {
                rgVar.f23944b = sgVar;
                return sgVar2;
            }
        }
        return sgVar;
    }

    public static rg c() {
        return (rg) f23394c.get();
    }
}
