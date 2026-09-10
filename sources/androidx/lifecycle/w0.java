package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f4605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4606c;

    public w0(x registry, m event) {
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(event, "event");
        this.f4604a = registry;
        this.f4605b = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4606c) {
            return;
        }
        this.f4604a.e(this.f4605b);
        this.f4606c = true;
    }
}
