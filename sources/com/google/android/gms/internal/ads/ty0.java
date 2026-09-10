package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ty0 implements wy0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ty0 f20527e = new ty0(new xy0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20531d;

    public ty0(xy0 xy0Var) {
        this.f20531d = xy0Var;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public void zzd(boolean z10) {
        if (!this.f20529b && z10) {
            Date date = new Date();
            Date date2 = (Date) this.f20530c;
            if (date2 == null || date.after(date2)) {
                this.f20530c = date;
                if (this.f20528a) {
                    Iterator it = Collections.unmodifiableCollection(vy0.f21317c.f21319b).iterator();
                    while (it.hasNext()) {
                        dz0 dz0Var = ((ky0) it.next()).f16560d;
                        Date date3 = (Date) this.f20530c;
                        dz0Var.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f20529b = z10;
    }

    public ty0(vu0 vu0Var, at0 at0Var, bt0 bt0Var) {
        this.f20528a = false;
        this.f20529b = false;
        this.f20530c = bt0Var;
        ListenableFuture listenableFutureC = ((x11) at0Var.f12510b).C(bt0Var.f12882b, bt0Var.f12881a, null);
        ft ftVar = new ft(this, at0Var, vu0Var, bt0Var, 5);
        Executor executor = bt0Var.f12885e;
        this.f20531d = zw1.u(zw1.x(listenableFutureC, ftVar, executor), Exception.class, new rr(this, at0Var), executor);
    }
}
