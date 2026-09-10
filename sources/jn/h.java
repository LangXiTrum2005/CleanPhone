package jn;

import cn.y0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f44021b;

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        c.j(this.f44021b, runnable, 6);
    }

    @Override // cn.w
    public final void q(ak.k kVar, Runnable runnable) {
        c.j(this.f44021b, runnable, 2);
    }

    @Override // cn.y0
    public final Executor t() {
        return this.f44021b;
    }
}
