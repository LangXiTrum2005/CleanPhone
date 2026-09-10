package ta;

import com.google.android.gms.internal.measurement.h6;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f50581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f50582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f50584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f50585g;

    public a0(b0 b0Var, Executor executor) {
        this.f50582d = b0Var;
        executor.getClass();
        this.f50581c = executor;
    }

    @Override // ta.p0
    public final void a(Throwable th2) {
        b0 b0Var = this.f50582d;
        b0Var.f50588n = null;
        if (th2 instanceof ExecutionException) {
            b0Var.n(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            b0Var.cancel(false);
        } else {
            b0Var.n(th2);
        }
    }

    @Override // ta.p0
    public final void b(Object obj) {
        this.f50582d.f50588n = null;
        switch (this.f50583e) {
            case 0:
                this.f50584f.o((ListenableFuture) obj);
                break;
            default:
                this.f50584f.l(obj);
                break;
        }
    }

    @Override // ta.p0
    public final boolean g() {
        return this.f50582d.isDone();
    }

    @Override // ta.p0
    public final Object h() {
        switch (this.f50583e) {
            case 0:
                return ((h6) this.f50585g).call();
            default:
                return ((Callable) this.f50585g).call();
        }
    }

    @Override // ta.p0
    public final String i() {
        switch (this.f50583e) {
            case 0:
                return ((h6) this.f50585g).toString();
            default:
                return ((Callable) this.f50585g).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, h6 h6Var, Executor executor) {
        this(b0Var, executor);
        this.f50583e = 0;
        this.f50584f = b0Var;
        this.f50585g = h6Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Callable callable) {
        this(b0Var, c0.f50592a);
        this.f50583e = 1;
        this.f50584f = b0Var;
        this.f50585g = callable;
    }
}
