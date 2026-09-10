package androidx.fragment.app;

import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements s.a, androidx.lifecycle.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4268b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f4267a = i10;
        this.f4268b = obj;
    }

    @Override // androidx.lifecycle.g0
    public void A(Object obj) {
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) obj;
        w wVar = (w) this.f4268b;
        if (vVar == null || !wVar.f4494h) {
            return;
        }
        View viewRequireView = wVar.requireView();
        if (viewRequireView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (wVar.l != null) {
            if (g1.J(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + wVar.l);
            }
            wVar.l.setContentView(viewRequireView);
        }
    }

    public void a() {
        ((l0) this.f4268b).f4445d.P();
    }

    @Override // s.a
    public Object apply(Object obj) {
        switch (this.f4267a) {
            case 0:
                Fragment fragment = (Fragment) this.f4268b;
                Object obj2 = fragment.mHost;
                return obj2 instanceof h.i ? ((h.i) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            default:
                return (h.h) this.f4268b;
        }
    }
}
