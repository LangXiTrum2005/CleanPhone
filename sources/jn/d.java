package jn;

import cn.j0;
import cn.w;
import cn.y0;
import hn.v;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends y0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f44017b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f44018c;

    static {
        l lVar = l.f44031b;
        int i10 = v.f42459a;
        if (64 >= i10) {
            i10 = 64;
        }
        f44018c = lVar.s(hn.b.l(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(ak.l.f3620a, runnable);
    }

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        f44018c.p(kVar, runnable);
    }

    @Override // cn.w
    public final void q(ak.k kVar, Runnable runnable) throws j0 {
        f44018c.q(kVar, runnable);
    }

    @Override // cn.w
    public final w s(int i10) {
        return l.f44031b.s(i10);
    }

    @Override // cn.w
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // cn.y0
    public final Executor t() {
        return this;
    }
}
