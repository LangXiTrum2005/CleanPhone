package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cloneable f4385b;

    public m0(g1 g1Var) {
        this.f4384a = g1Var;
        this.f4385b = new CopyOnWriteArrayList();
    }

    public void a(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.a(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void b(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        g1 g1Var = (g1) this.f4384a;
        FragmentActivity fragmentActivity = g1Var.f4343w.f4443b;
        Fragment fragment = g1Var.f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.b(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void c(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.c(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void d(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.d(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void e(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.e(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void f(Fragment f10, boolean z10) {
        md.d dVar;
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.f(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
            fd.a aVar = cd.e.f6366f;
            aVar.b("FragmentMonitor %s.onFragmentPaused ", f10.getClass().getSimpleName());
            WeakHashMap weakHashMap = eVar.f6367a;
            if (weakHashMap.containsKey(f10)) {
                Trace trace = (Trace) weakHashMap.get(f10);
                weakHashMap.remove(f10);
                cd.f fVar = eVar.f6371e;
                HashMap map = fVar.f6375c;
                fd.a aVar2 = cd.f.f6372e;
                if (!fVar.f6376d) {
                    aVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
                    dVar = new md.d();
                } else if (map.containsKey(f10)) {
                    gd.d dVar2 = (gd.d) map.remove(f10);
                    md.d dVarA = fVar.a();
                    if (dVarA.b()) {
                        gd.d dVar3 = (gd.d) dVarA.a();
                        dVar = new md.d(new gd.d(dVar3.f41845a - dVar2.f41845a, dVar3.f41846b - dVar2.f41846b, dVar3.f41847c - dVar2.f41847c));
                    } else {
                        aVar2.b("stopFragment(%s): snapshot() failed", f10.getClass().getSimpleName());
                        dVar = new md.d();
                    }
                } else {
                    aVar2.b("Sub-recording associated with key %s was not started or does not exist", f10.getClass().getSimpleName());
                    dVar = new md.d();
                }
                if (dVar.b()) {
                    md.g.a(trace, (gd.d) dVar.a());
                    trace.stop();
                } else {
                    aVar.g("onFragmentPaused: recorder failed to trace %s", f10.getClass().getSimpleName());
                }
            } else {
                aVar.g("FragmentMonitor: missed a fragment trace from %s", f10.getClass().getSimpleName());
            }
        }
    }

    public void g(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        g1 g1Var = (g1) this.f4384a;
        FragmentActivity fragmentActivity = g1Var.f4343w.f4443b;
        Fragment fragment = g1Var.f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.g(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void h(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.h(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void i(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.i(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
            cd.e.f6366f.b("FragmentMonitor %s.onFragmentResumed", f10.getClass().getSimpleName());
            Trace trace = new Trace("_st_".concat(f10.getClass().getSimpleName()), eVar.f6369c, eVar.f6368b, eVar.f6370d);
            trace.start();
            trace.putAttribute("Parent_fragment", f10.getParentFragment() == null ? "No parent" : f10.getParentFragment().getClass().getSimpleName());
            if (f10.getActivity() != null) {
                trace.putAttribute("Hosting_activity", f10.getActivity().getClass().getSimpleName());
            }
            eVar.f6367a.put(f10, trace);
            cd.f fVar = eVar.f6371e;
            HashMap map = fVar.f6375c;
            fd.a aVar = cd.f.f6372e;
            if (!fVar.f6376d) {
                aVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            } else if (map.containsKey(f10)) {
                aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", f10.getClass().getSimpleName());
            } else {
                md.d dVarA = fVar.a();
                if (dVarA.b()) {
                    map.put(f10, (gd.d) dVarA.a());
                } else {
                    aVar.b("startFragment(%s): snapshot() failed", f10.getClass().getSimpleName());
                }
            }
        }
    }

    public void j(Fragment f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.j(f10, bundle, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void k(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.k(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void l(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.l(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void m(Fragment f10, View v4, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        kotlin.jvm.internal.n.f(v4, "v");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.m(f10, v4, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public void n(Fragment f10, boolean z10) {
        kotlin.jvm.internal.n.f(f10, "f");
        Fragment fragment = ((g1) this.f4384a).f4345y;
        if (fragment != null) {
            g1 parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.n.e(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f4335o.n(f10, true);
        }
        for (t0 t0Var : (CopyOnWriteArrayList) this.f4385b) {
            if (z10) {
                t0Var.getClass();
            }
            cd.e eVar = t0Var.f4471a;
        }
    }

    public m0(Animation animation) {
        this.f4384a = animation;
        this.f4385b = null;
    }

    public m0(Animator animator) {
        this.f4384a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4385b = animatorSet;
        animatorSet.play(animator);
    }
}
