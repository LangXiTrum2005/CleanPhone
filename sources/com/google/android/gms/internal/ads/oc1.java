package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc1 f18236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f18237b;

    public oc1(uc1 uc1Var, ListenableFuture listenableFuture) {
        this.f18236a = uc1Var;
        this.f18237b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18236a.f13503a != this) {
            return;
        }
        ListenableFuture listenableFuture = this.f18237b;
        if (dd1.f13502g.o(this.f18236a, this, uc1.g(listenableFuture))) {
            uc1.o(this.f18236a, false);
        }
    }
}
