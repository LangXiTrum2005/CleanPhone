package ta;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f50609d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f50610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f50611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f50612c;

    public f(Runnable runnable, Executor executor) {
        this.f50610a = runnable;
        this.f50611b = executor;
    }

    public f() {
        this.f50610a = null;
        this.f50611b = null;
    }
}
