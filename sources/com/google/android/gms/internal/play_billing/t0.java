package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.me1;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f24471a;

    @Override // java.lang.Runnable
    public final void run() {
        s0 s0Var;
        e0 e0Var;
        u0 u0Var = this.f24471a;
        if (u0Var == null || (s0Var = u0Var.f24479h) == null) {
            return;
        }
        this.f24471a = null;
        if (s0Var.isDone()) {
            Object obj = u0Var.f24401a;
            if (obj == null) {
                if (s0Var.isDone()) {
                    if (l0.f24400g.N(u0Var, null, u0.f(s0Var))) {
                        u0.h(u0Var);
                        return;
                    }
                    return;
                }
                d0 d0Var = new d0(u0Var, s0Var);
                if (l0.f24400g.N(u0Var, null, d0Var)) {
                    try {
                        s0Var.m(d0Var, p0.f24441a);
                        return;
                    } catch (Throwable th2) {
                        try {
                            e0Var = new e0(th2);
                        } catch (Error | Exception unused) {
                            e0Var = e0.f24259b;
                        }
                        l0.f24400g.N(u0Var, d0Var, e0Var);
                        return;
                    }
                }
                obj = u0Var.f24401a;
            }
            if (obj instanceof c0) {
                s0Var.cancel(((c0) obj).f24241a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = u0Var.f24480i;
            u0Var.f24480i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    if (l0.f24400g.N(u0Var, null, new e0(new me1(str, 1)))) {
                        u0.h(u0Var);
                    }
                    throw th3;
                }
            }
            if (l0.f24400g.N(u0Var, null, new e0(new me1(str + ": " + s0Var.toString(), 1)))) {
                u0.h(u0Var);
            }
            s0Var.cancel(true);
        } catch (Throwable th4) {
            s0Var.cancel(true);
            throw th4;
        }
    }
}
