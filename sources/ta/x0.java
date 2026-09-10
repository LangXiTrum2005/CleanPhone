package ta;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends f0 implements RunnableFuture {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile p0 f50672i;

    public x0(Callable callable) {
        this.f50672i = new w0(this, callable);
    }

    @Override // ta.r
    public final void c() {
        p0 p0Var;
        if (p() && (p0Var = this.f50672i) != null) {
            p0Var.d();
        }
        this.f50672i = null;
    }

    @Override // ta.r
    public final String j() {
        p0 p0Var = this.f50672i;
        if (p0Var == null) {
            return super.j();
        }
        return "task=[" + p0Var + X3.j.f27836e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        p0 p0Var = this.f50672i;
        if (p0Var != null) {
            p0Var.run();
        }
        this.f50672i = null;
    }
}
