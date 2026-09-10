package ta;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50665c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f50666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f50667e;

    public w0(x0 x0Var, Callable callable) {
        this.f50666d = x0Var;
        callable.getClass();
        this.f50667e = callable;
    }

    @Override // ta.p0
    public final void a(Throwable th2) {
        switch (this.f50665c) {
            case 0:
                this.f50666d.n(th2);
                break;
            default:
                this.f50666d.n(th2);
                break;
        }
    }

    @Override // ta.p0
    public final void b(Object obj) {
        switch (this.f50665c) {
            case 0:
                this.f50666d.o((ListenableFuture) obj);
                break;
            default:
                this.f50666d.l(obj);
                break;
        }
    }

    @Override // ta.p0
    public final boolean g() {
        switch (this.f50665c) {
            case 0:
                break;
        }
        return this.f50666d.isDone();
    }

    @Override // ta.p0
    public final Object h() {
        switch (this.f50665c) {
            case 0:
                y yVar = (y) this.f50667e;
                ListenableFuture listenableFutureCall = yVar.call();
                go.k.n(listenableFutureCall, yVar, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
                return listenableFutureCall;
            default:
                return ((Callable) this.f50667e).call();
        }
    }

    @Override // ta.p0
    public final String i() {
        switch (this.f50665c) {
            case 0:
                return ((y) this.f50667e).toString();
            default:
                return ((Callable) this.f50667e).toString();
        }
    }

    public w0(x0 x0Var, y yVar) {
        this.f50666d = x0Var;
        this.f50667e = yVar;
    }
}
