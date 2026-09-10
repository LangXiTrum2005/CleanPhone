package ta;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends f0 implements Runnable {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f50589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f50590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f50591k;

    public c(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f50589i = listenableFuture;
        this.f50590j = cls;
        this.f50591k = obj;
    }

    @Override // ta.r
    public final void c() {
        ListenableFuture listenableFuture = this.f50589i;
        if ((listenableFuture != null) & (this.f50646a instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f50589i = null;
        this.f50590j = null;
        this.f50591k = null;
    }

    @Override // ta.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.f50589i;
        Class cls = this.f50590j;
        Object obj = this.f50591k;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strJ != null) {
                return wi.d.h(str, strJ);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + X3.j.f27836e;
    }

    public abstract Object q(Object obj, Throwable th2);

    public abstract void r(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        ListenableFuture listenableFuture = this.f50589i;
        Class cls = this.f50590j;
        Object obj = this.f50591k;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || (this.f50646a instanceof d)) {
            return;
        }
        this.f50589i = null;
        try {
            th = listenableFuture instanceof ua.a ? ((ua.a) listenableFuture).a() : null;
            objB = th == null ? k0.b(listenableFuture) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            l(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.f50590j = null;
            this.f50591k = null;
            r(objQ);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th3);
            } finally {
                this.f50590j = null;
                this.f50591k = null;
            }
        }
    }
}
