package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 extends de1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18242c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe1 f18243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18244e;

    public oe1(pe1 pe1Var, nd1 nd1Var) {
        this.f18243d = pe1Var;
        this.f18244e = nd1Var;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final Object d() {
        switch (this.f18242c) {
            case 0:
                nd1 nd1Var = (nd1) this.f18244e;
                ListenableFuture listenableFutureMo162zza = nd1Var.mo162zza();
                if (listenableFutureMo162zza != null) {
                    return listenableFutureMo162zza;
                }
                throw new NullPointerException(dv.B("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", nd1Var));
            default:
                return ((Callable) this.f18244e).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final String g() {
        switch (this.f18242c) {
            case 0:
                return ((nd1) this.f18244e).toString();
            default:
                return ((Callable) this.f18244e).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final boolean h() {
        switch (this.f18242c) {
            case 0:
                break;
        }
        return this.f18243d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final void i(Object obj) {
        switch (this.f18242c) {
            case 0:
                this.f18243d.l((ListenableFuture) obj);
                break;
            default:
                this.f18243d.c(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final void j(Throwable th2) {
        switch (this.f18242c) {
            case 0:
                this.f18243d.d(th2);
                break;
            default:
                this.f18243d.d(th2);
                break;
        }
    }

    public oe1(pe1 pe1Var, Callable callable) {
        this.f18243d = pe1Var;
        callable.getClass();
        this.f18244e = callable;
    }
}
