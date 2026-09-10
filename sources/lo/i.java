package lo;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f45642e;

    public i(v delegate) {
        kotlin.jvm.internal.n.f(delegate, "delegate");
        this.f45642e = delegate;
    }

    @Override // lo.v
    public final v a() {
        return this.f45642e.a();
    }

    @Override // lo.v
    public final v b() {
        return this.f45642e.b();
    }

    @Override // lo.v
    public final long c() {
        return this.f45642e.c();
    }

    @Override // lo.v
    public final v d(long j10) {
        return this.f45642e.d(j10);
    }

    @Override // lo.v
    public final boolean e() {
        return this.f45642e.e();
    }

    @Override // lo.v
    public final void f() throws InterruptedIOException {
        this.f45642e.f();
    }

    @Override // lo.v
    public final v g(long j10) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.n.f(unit, "unit");
        return this.f45642e.g(j10);
    }
}
