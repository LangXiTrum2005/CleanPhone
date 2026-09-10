package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.internal.measurement.f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends f.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f4502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(g1 g1Var) {
        super(false);
        this.f4502d = g1Var;
    }

    @Override // f.o
    public final void a() {
        boolean zJ = g1.J(3);
        g1 g1Var = this.f4502d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        if (g1.J(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + g1Var.f4329h);
        }
        a aVar = g1Var.f4329h;
        if (aVar != null) {
            aVar.f4242r = false;
            aVar.d();
            a aVar2 = g1Var.f4329h;
            n nVar = new n(g1Var, 2);
            if (aVar2.f4240p == null) {
                aVar2.f4240p = new ArrayList();
            }
            aVar2.f4240p.add(nVar);
            g1Var.f4329h.e();
            g1Var.f4330i = true;
            g1Var.z(true);
            g1Var.D();
            g1Var.f4330i = false;
            g1Var.f4329h = null;
        }
    }

    @Override // f.o
    public final void b() {
        boolean zJ = g1.J(3);
        g1 g1Var = this.f4502d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        w0 w0Var = g1Var.f4331j;
        ArrayList arrayList = g1Var.f4334n;
        g1Var.f4330i = true;
        g1Var.z(true);
        g1Var.f4330i = false;
        if (g1Var.f4329h == null) {
            if (w0Var.f40242b) {
                if (g1.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                g1Var.Q();
                return;
            } else {
                if (g1.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                g1Var.f4328g.b().a();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(g1.E(g1Var.f4329h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = g1Var.f4329h.f4226a.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((q1) it3.next()).f4447b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (r rVar : g1Var.f(new ArrayList(Collections.singletonList(g1Var.f4329h)), 0, 1)) {
            ArrayList arrayList2 = rVar.f4457c;
            if (g1.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            rVar.m(arrayList2);
            rVar.c(arrayList2);
        }
        Iterator it4 = g1Var.f4329h.f4226a.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = ((q1) it4.next()).f4447b;
            if (fragment2 != null && fragment2.mContainer == null) {
                g1Var.g(fragment2).k();
            }
        }
        g1Var.f4329h = null;
        g1Var.f0();
        if (g1.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + w0Var.f40242b + " for  FragmentManager " + g1Var);
        }
    }

    @Override // f.o
    public final void c(f.a aVar) {
        boolean zJ = g1.J(2);
        g1 g1Var = this.f4502d;
        if (zJ) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        if (g1Var.f4329h != null) {
            for (r rVar : g1Var.f(new ArrayList(Collections.singletonList(g1Var.f4329h)), 0, 1)) {
                rVar.getClass();
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f40207c);
                }
                ArrayList arrayList = rVar.f4457c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xj.t.a0(((c2) it.next()).f4281k, arrayList2);
                }
                List listN0 = xj.n.N0(xj.n.R0(arrayList2));
                int size = listN0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((b2) listN0.get(i10)).d(aVar, rVar.f4455a);
                }
            }
            Iterator it2 = g1Var.f4334n.iterator();
            if (it2.hasNext()) {
                throw f2.j(it2);
            }
        }
    }

    @Override // f.o
    public final void d(f.a aVar) {
        boolean zJ = g1.J(3);
        g1 g1Var = this.f4502d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        g1Var.w();
        g1Var.x(new f1(g1Var), false);
    }
}
