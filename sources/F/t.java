package f;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f40252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.j f40253b = r9.b.u(new q(this, 0));

    public t(Runnable runnable) {
        this.f40252a = runnable;
    }

    public final void a(androidx.lifecycle.v vVar, o onBackPressedCallback) {
        kotlin.jvm.internal.n.f(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.o lifecycle = vVar.getLifecycle();
        if (((x) lifecycle).f4609d == androidx.lifecycle.n.f4564a) {
            return;
        }
        n nVar = new n(onBackPressedCallback, new p(vVar, onBackPressedCallback));
        onBackPressedCallback.f40241a.add(nVar);
        nVar.c(false);
        x3.c cVar = b().f40248c;
        cVar.getClass();
        if (cVar.f53579c.add(nVar)) {
            x3.f fVar = cVar.f53578b;
            fVar.getClass();
            if (nVar.f40238c != null) {
                throw new IllegalArgumentException(("Handler '" + nVar + "' is already registered with a dispatcher").toString());
            }
            fVar.f53589e.addFirst(nVar);
            nVar.f40238c = cVar;
            fVar.b();
        }
        s sVar = new s(nVar, this, lifecycle);
        lifecycle.a(sVar);
        onBackPressedCallback.f40243c.add(sVar);
    }

    public final r b() {
        return (r) this.f40253b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().f40248c.b(new x3.i(onBackInvokedDispatcher, 0), 1);
        b().f40248c.b(new x3.i(onBackInvokedDispatcher, 1000000), 0);
    }
}
