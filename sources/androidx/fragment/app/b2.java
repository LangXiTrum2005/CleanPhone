package androidx.fragment.app;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4264b;

    public boolean a() {
        return this instanceof i;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(f.a aVar, ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
    }

    public void e(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
    }
}
