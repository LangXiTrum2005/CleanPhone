package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6678a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = f6678a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
