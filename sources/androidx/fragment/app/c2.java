package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f4273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4281k;
    public final o1 l;

    public c2(int i10, int i11, o1 o1Var) {
        d5.u.n(i10, "finalState");
        d5.u.n(i11, "lifecycleImpact");
        Fragment fragment = o1Var.f4414c;
        kotlin.jvm.internal.n.e(fragment, "fragmentStateManager.fragment");
        d5.u.n(i10, "finalState");
        d5.u.n(i11, "lifecycleImpact");
        kotlin.jvm.internal.n.f(fragment, "fragment");
        this.f4271a = i10;
        this.f4272b = i11;
        this.f4273c = fragment;
        this.f4274d = new ArrayList();
        this.f4279i = true;
        ArrayList arrayList = new ArrayList();
        this.f4280j = arrayList;
        this.f4281k = arrayList;
        this.l = o1Var;
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        this.f4278h = false;
        if (this.f4275e) {
            return;
        }
        this.f4275e = true;
        if (this.f4280j.isEmpty()) {
            b();
            return;
        }
        for (b2 b2Var : xj.n.N0(this.f4281k)) {
            b2Var.getClass();
            if (!b2Var.f4264b) {
                b2Var.b(container);
            }
            b2Var.f4264b = true;
        }
    }

    public final void b() {
        this.f4278h = false;
        if (!this.f4276f) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4276f = true;
            Iterator it = this.f4274d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f4273c.mTransitioning = false;
        this.l.k();
    }

    public final void c(b2 effect) {
        kotlin.jvm.internal.n.f(effect, "effect");
        ArrayList arrayList = this.f4280j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        d5.u.n(i10, "finalState");
        d5.u.n(i11, "lifecycleImpact");
        int iC = v0.i.c(i11);
        Fragment fragment = this.f4273c;
        if (iC == 0) {
            if (this.f4271a != 1) {
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + defpackage.e.F(this.f4271a) + " -> " + defpackage.e.F(i10) + '.');
                }
                this.f4271a = i10;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f4271a == 1) {
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + defpackage.e.E(this.f4272b) + " to ADDING.");
                }
                this.f4271a = 2;
                this.f4272b = 2;
                this.f4279i = true;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + defpackage.e.F(this.f4271a) + " -> REMOVED. mLifecycleImpact  = " + defpackage.e.E(this.f4272b) + " to REMOVING.");
        }
        this.f4271a = 1;
        this.f4272b = 3;
        this.f4279i = true;
    }

    public final String toString() {
        StringBuilder sbK = d5.u.k("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbK.append(defpackage.e.F(this.f4271a));
        sbK.append(" lifecycleImpact = ");
        sbK.append(defpackage.e.E(this.f4272b));
        sbK.append(" fragment = ");
        sbK.append(this.f4273c);
        sbK.append('}');
        return sbK.toString();
    }
}
