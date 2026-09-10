package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud f23897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta.t f23898c;

    public /* synthetic */ qd(ud udVar, ta.t tVar, int i10) {
        this.f23896a = i10;
        this.f23897b = udVar;
        this.f23898c = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: CancellationException | ExecutionException -> 0x0025, CancellationException | ExecutionException -> 0x0025, TryCatch #2 {CancellationException | ExecutionException -> 0x0025, blocks: (B:5:0x0009, B:7:0x0020, B:18:0x0031, B:18:0x0031, B:20:0x0042, B:20:0x0042, B:22:0x004e, B:22:0x004e, B:28:0x0060, B:28:0x0060, B:30:0x0064, B:30:0x0064, B:12:0x0028, B:33:0x009d, B:33:0x009d), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: CancellationException | ExecutionException -> 0x0025, CancellationException | ExecutionException -> 0x0025, TRY_LEAVE, TryCatch #2 {CancellationException | ExecutionException -> 0x0025, blocks: (B:5:0x0009, B:7:0x0020, B:18:0x0031, B:18:0x0031, B:20:0x0042, B:20:0x0042, B:22:0x004e, B:22:0x004e, B:28:0x0060, B:28:0x0060, B:30:0x0064, B:30:0x0064, B:12:0x0028, B:33:0x009d, B:33:0x009d), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        bo.e eVar;
        oa.s1 s1Var;
        oa.s1 s1Var2;
        he heVar;
        switch (this.f23896a) {
            case 0:
                ud udVar = this.f23897b;
                try {
                    ta.k0.b(this.f23898c);
                    return;
                } catch (Exception e10) {
                    String str = udVar.f24041c;
                    Log.w("FlagStore", q4.a.j(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e10);
                    return;
                }
            default:
                ud udVar2 = this.f23897b;
                try {
                    le leVar = (le) ta.k0.b(this.f23898c);
                    int i10 = 0;
                    bo.e eVar2 = new bo.e(leVar, new com.google.android.gms.internal.ads.n3(6, 2, false));
                    boolean z10 = udVar2.f24043e;
                    if (z10 || (eVar = udVar2.f24039a) == null) {
                        synchronized (udVar2) {
                            if (!z10) {
                                eVar = udVar2.f24039a;
                                if (eVar != null) {
                                    s1Var = (oa.s1) eVar.f5779d;
                                    s1Var2 = (oa.s1) eVar2.f5779d;
                                    s1Var.getClass();
                                    if (!oa.q.g(s1Var2, s1Var)) {
                                        heVar = (he) udVar2.f24040b.f23849e.get();
                                        if (heVar != null) {
                                            heVar.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            udVar2.f24039a = eVar2;
                            ((AtomicInteger) udVar2.f24045g.f23891b).incrementAndGet();
                        }
                    } else {
                        s1Var = (oa.s1) eVar.f5779d;
                        s1Var2 = (oa.s1) eVar2.f5779d;
                        s1Var.getClass();
                        if (!oa.q.g(s1Var2, s1Var)) {
                            heVar = (he) udVar2.f24040b.f23849e.get();
                            if (heVar != null) {
                                heVar.zza();
                                return;
                            }
                            return;
                        }
                    }
                    if (udVar2.f24043e) {
                        pb pbVar = udVar2.f24040b;
                        ic icVar = (ic) pbVar.f23848d.get();
                        String strU = leVar.u();
                        icVar.getClass();
                        strU.getClass();
                        ta.a aVarB = ic.b(icVar.f23582a.d(strU));
                        sd sdVar = new sd(udVar2, i10);
                        ta.q0 q0VarA = pbVar.a();
                        int i11 = ta.c.l;
                        ta.b bVar = new ta.b(aVarB, Throwable.class, sdVar);
                        aVarB.addListener(bVar, t9.e.s(q0VarA, bVar));
                        return;
                    }
                    return;
                } catch (CancellationException | ExecutionException e11) {
                    if (e11.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = udVar2.f24041c;
                    Log.w("FlagStore", q4.a.j(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e11);
                    return;
                }
        }
    }
}
