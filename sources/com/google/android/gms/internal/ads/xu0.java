package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f22005a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f22006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe1 f22007c;

    public xu0(mg0 mg0Var, fe1 fe1Var) {
        this.f22006b = mg0Var;
        this.f22007c = fe1Var;
    }

    public final synchronized void a(int i10) {
        LinkedBlockingDeque linkedBlockingDeque = this.f22005a;
        int size = i10 - linkedBlockingDeque.size();
        for (int i11 = 0; i11 < size; i11++) {
            linkedBlockingDeque.add(((k00) this.f22007c).b(this.f22006b));
        }
    }

    public final synchronized ListenableFuture b() {
        a(1);
        return (ListenableFuture) this.f22005a.poll();
    }
}
