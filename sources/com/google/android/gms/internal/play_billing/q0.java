package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.BillingResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f24449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f24450b;

    public q0(s0 s0Var, h9.k kVar) {
        this.f24449a = s0Var;
        this.f24450b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        s0 s0Var = this.f24449a;
        boolean z10 = s0Var instanceof v0;
        h9.k kVar = this.f24450b;
        if (z10 && (thA = ((v0) s0Var).a()) != null) {
            kVar.f(thA);
            return;
        }
        try {
            if (!s0Var.isDone()) {
                throw new IllegalStateException(qk.i0.q0("Future was expected to be done: %s", s0Var));
            }
            boolean z11 = false;
            Future future = s0Var;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            com.android.billingclient.api.j jVar = (com.android.billingclient.api.j) kVar.f42289d;
            if (iIntValue <= 0) {
                ((Runnable) kVar.f42288c).run();
                return;
            }
            int i10 = kVar.f42286a;
            int iIntValue2 = num.intValue();
            jVar.getClass();
            BillingResult billingResultA = com.android.billingclient.api.k.a(iIntValue2, "Billing override value was set by a license tester.");
            jVar.N(i10, billingResultA, j3.LICENSE_TESTER_BILLING_OVERRIDE);
            ((l0.a) kVar.f42287b).accept(billingResultA);
        } catch (ExecutionException e10) {
            kVar.f(e10.getCause());
        } catch (Throwable th3) {
            kVar.f(th3);
        }
    }

    public final String toString() {
        v9.e eVar = new v9.e(q0.class.getSimpleName(), 8);
        l lVar = new l();
        ((l) eVar.f52505d).f24396b = lVar;
        eVar.f52505d = lVar;
        lVar.f24395a = this.f24450b;
        return eVar.toString();
    }
}
