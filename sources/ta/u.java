package ta;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends f0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f50654k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f50655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f50656j;

    public u(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f50655i = listenableFuture;
        obj.getClass();
        this.f50656j = obj;
    }

    @Override // ta.r
    public final void c() {
        ListenableFuture listenableFuture = this.f50655i;
        if ((listenableFuture != null) & (this.f50646a instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f50655i = null;
        this.f50656j = null;
    }

    @Override // ta.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.f50655i;
        Object obj = this.f50656j;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strJ != null) {
                return wi.d.h(str, strJ);
            }
            return null;
        }
        return str + "function=[" + obj + X3.j.f27836e;
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f50655i;
        Object obj = this.f50656j;
        if (((this.f50646a instanceof d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f50655i = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objQ = q(obj, k0.b(listenableFuture));
                this.f50656j = null;
                r(objQ);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f50656j = null;
                }
            }
        } catch (Error e10) {
            n(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            n(e11.getCause());
        } catch (Exception e12) {
            n(e12);
        }
    }
}
