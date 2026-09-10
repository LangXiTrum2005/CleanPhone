package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.lw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f4418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f4419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1 f4420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x.e f4424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4425k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.e f4426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.e f4427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lw f4429p = new lw();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4430q;

    public p(ArrayList arrayList, c2 c2Var, c2 c2Var2, y1 y1Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, x.e eVar, ArrayList arrayList4, ArrayList arrayList5, x.e eVar2, x.e eVar3, boolean z10) {
        this.f4417c = arrayList;
        this.f4418d = c2Var;
        this.f4419e = c2Var2;
        this.f4420f = y1Var;
        this.f4421g = obj;
        this.f4422h = arrayList2;
        this.f4423i = arrayList3;
        this.f4424j = eVar;
        this.f4425k = arrayList4;
        this.l = arrayList5;
        this.f4426m = eVar2;
        this.f4427n = eVar3;
        this.f4428o = z10;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = m0.t0.f45753a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.b2
    public final boolean a() {
        this.f4420f.i();
        return false;
    }

    @Override // androidx.fragment.app.b2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        this.f4429p.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    @Override // androidx.fragment.app.b2
    public final void c(ViewGroup container) {
        x.e eVar;
        Object obj;
        c2 c2Var;
        c2 c2Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        y1 y1Var;
        y1 y1Var2;
        Object obj2;
        x.i iVar;
        ArrayList arrayList3;
        int i10;
        Object obj3;
        ArrayList arrayList4;
        kotlin.jvm.internal.n.f(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList<q> arrayList5 = this.f4417c;
        if (!zIsLaidOut || this.f4430q) {
            for (q qVar : arrayList5) {
                c2 c2Var3 = qVar.f4379a;
                if (g1.J(2)) {
                    if (this.f4430q) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + c2Var3);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + c2Var3);
                    }
                }
                qVar.f4379a.c(this);
            }
            this.f4430q = false;
            return;
        }
        View view = new View(container.getContext());
        Rect rect = new Rect();
        Iterator it = arrayList5.iterator();
        View view2 = null;
        boolean z10 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = this.f4424j;
            obj = this.f4421g;
            c2Var = this.f4419e;
            c2Var2 = this.f4418d;
            arrayList = this.f4423i;
            arrayList2 = this.f4422h;
            it = it;
            y1Var = this.f4420f;
            if (!zHasNext) {
                break;
            }
            if (((q) it.next()).f4441d == null || c2Var2 == null || c2Var == null || eVar.isEmpty() || obj == null) {
                z10 = z10;
            } else {
                Fragment inFragment = c2Var.f4273c;
                Fragment outFragment = c2Var2.f4273c;
                w1 w1Var = r1.f4463a;
                boolean z11 = z10;
                kotlin.jvm.internal.n.f(inFragment, "inFragment");
                kotlin.jvm.internal.n.f(outFragment, "outFragment");
                if (this.f4428o) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                m0.x.a(container, new d(c2Var, c2Var2, this, 1));
                x.e eVar2 = this.f4426m;
                arrayList2.addAll(eVar2.values());
                ArrayList arrayList6 = this.l;
                if (!arrayList6.isEmpty()) {
                    Object obj4 = arrayList6.get(0);
                    kotlin.jvm.internal.n.e(obj4, "exitingNames[0]");
                    View view3 = (View) eVar2.get((String) obj4);
                    y1Var.n(view3, obj);
                    view2 = view3;
                }
                x.e eVar3 = this.f4427n;
                arrayList.addAll(eVar3.values());
                ArrayList arrayList7 = this.f4425k;
                if (arrayList7.isEmpty()) {
                    z10 = z11;
                } else {
                    Object obj5 = arrayList7.get(0);
                    kotlin.jvm.internal.n.e(obj5, "enteringNames[0]");
                    View view4 = (View) eVar3.get((String) obj5);
                    if (view4 != null) {
                        m0.x.a(container, new m(y1Var, view4, rect));
                        z10 = true;
                    } else {
                        z10 = z11;
                    }
                }
                y1Var.q(obj, view, arrayList2);
                Object obj6 = this.f4421g;
                y1Var.m(obj6, null, null, obj6, arrayList);
            }
        }
        boolean z12 = z10;
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        Object objK = null;
        Object objK2 = null;
        while (true) {
            it2 = it2;
            if (!it2.hasNext()) {
                break;
            }
            eVar = eVar;
            q qVar2 = (q) it2.next();
            c2 c2Var4 = qVar2.f4379a;
            arrayList5 = arrayList5;
            Object objF = y1Var.f(qVar2.f4439b);
            if (objF != null) {
                Object obj7 = obj;
                ArrayList arrayList9 = new ArrayList();
                Object obj8 = objK2;
                Fragment fragment = c2Var4.f4273c;
                Object obj9 = objK;
                View view5 = fragment.mView;
                kotlin.jvm.internal.n.e(view5, "operation.fragment.mView");
                f(view5, arrayList9);
                if (obj7 != null && (c2Var4 == c2Var2 || c2Var4 == c2Var)) {
                    if (c2Var4 == c2Var2) {
                        arrayList9.removeAll(xj.n.R0(arrayList2));
                    } else {
                        arrayList9.removeAll(xj.n.R0(arrayList));
                    }
                }
                if (arrayList9.isEmpty()) {
                    y1Var.a(view, objF);
                    obj3 = objF;
                    arrayList4 = arrayList9;
                } else {
                    y1Var.b(objF, arrayList9);
                    y1Var.m(objF, objF, arrayList9, null, null);
                    obj3 = objF;
                    arrayList4 = arrayList9;
                    if (c2Var4.f4271a == 3) {
                        c2Var4.f4279i = false;
                        ArrayList arrayList10 = new ArrayList(arrayList4);
                        arrayList10.remove(fragment.mView);
                        y1Var.l(obj3, fragment.mView, arrayList10);
                        m0.x.a(container, new n(arrayList4, 0));
                    }
                }
                if (c2Var4.f4271a == 2) {
                    arrayList8.addAll(arrayList4);
                    if (z12) {
                        y1Var.o(obj3, rect);
                    }
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object transitioningViews : arrayList4) {
                            kotlin.jvm.internal.n.e(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    y1Var.n(view2, obj3);
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object transitioningViews2 : arrayList4) {
                            kotlin.jvm.internal.n.e(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    }
                }
                if (qVar2.f4440c) {
                    objK = y1Var.k(obj9, obj3);
                    it2 = it2;
                    eVar = eVar;
                    arrayList5 = arrayList5;
                    obj = obj7;
                    objK2 = obj8;
                } else {
                    objK2 = y1Var.k(obj8, obj3);
                    objK = obj9;
                    obj = obj7;
                }
            }
        }
        ArrayList arrayList11 = arrayList5;
        x.i iVar2 = eVar;
        Object obj10 = obj;
        Object objJ = y1Var.j(objK, objK2, obj10);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objJ + " for container " + container);
        }
        wj.f fVar = new wj.f(arrayList8, objJ);
        ArrayList arrayList12 = (ArrayList) fVar.f53283a;
        ArrayList arrayList13 = new ArrayList(xj.p.W(arrayList11, 10));
        Iterator it3 = arrayList11.iterator();
        while (it3.hasNext()) {
            arrayList13.add(((q) it3.next()).f4379a);
        }
        Iterator it4 = arrayList13.iterator();
        while (true) {
            boolean zHasNext2 = it4.hasNext();
            y1Var2 = this.f4420f;
            obj2 = fVar.f53284b;
            if (!zHasNext2) {
                break;
            }
            c2 c2Var5 = (c2) it4.next();
            Fragment fragment2 = c2Var5.f4273c;
            y1Var2.p(obj2, this.f4429p, new m(c2Var5, this));
        }
        o oVar = new o(this, container, obj2, 0);
        r1.a(arrayList12, 4);
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = this.f4423i;
        int size = arrayList15.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view6 = (View) arrayList15.get(i11);
            WeakHashMap weakHashMap = m0.s0.f45746a;
            arrayList14.add(view6.getTransitionName());
            view6.setTransitionName(null);
        }
        boolean zJ = g1.J(2);
        ArrayList arrayList16 = this.f4422h;
        if (zJ) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList16) {
                kotlin.jvm.internal.n.e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view7 = (View) sharedElementFirstOutViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view7);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = m0.s0.f45746a;
                sb2.append(view7.getTransitionName());
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList15) {
                kotlin.jvm.internal.n.e(sharedElementLastInViews, "sharedElementLastInViews");
                View view8 = (View) sharedElementLastInViews;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view8);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = m0.s0.f45746a;
                sb3.append(view8.getTransitionName());
                Log.v("FragmentManager", sb3.toString());
            }
        }
        oVar.invoke();
        int size2 = arrayList15.size();
        ArrayList arrayList17 = new ArrayList();
        int i12 = 0;
        while (i12 < size2) {
            View view9 = (View) arrayList16.get(i12);
            WeakHashMap weakHashMap4 = m0.s0.f45746a;
            String transitionName = view9.getTransitionName();
            arrayList17.add(transitionName);
            if (transitionName == null) {
                i10 = size2;
                arrayList3 = arrayList16;
                iVar = iVar2;
            } else {
                view9.setTransitionName(null);
                iVar = iVar2;
                String str = (String) iVar.get(transitionName);
                arrayList3 = arrayList16;
                int i13 = 0;
                while (true) {
                    i10 = size2;
                    if (i13 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList14.get(i13))) {
                        ((View) arrayList15.get(i13)).setTransitionName(transitionName);
                        break;
                    } else {
                        i13++;
                        size2 = i10;
                    }
                }
            }
            i12++;
            iVar2 = iVar;
            size2 = i10;
            arrayList16 = arrayList3;
        }
        ArrayList arrayList18 = arrayList16;
        m0.x.a(container, new x1(size2, arrayList15, arrayList14, arrayList18, arrayList17));
        r1.a(arrayList12, 0);
        y1Var2.r(obj10, arrayList18, arrayList15);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c2Var2 + " to " + c2Var);
        }
    }

    @Override // androidx.fragment.app.b2
    public final void d(f.a aVar, ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
    }

    @Override // androidx.fragment.app.b2
    public final void e(ViewGroup container) {
        boolean z10;
        Object obj;
        kotlin.jvm.internal.n.f(container, "container");
        if (!container.isLaidOut()) {
            Iterator it = this.f4417c.iterator();
            while (it.hasNext()) {
                c2 c2Var = ((q) it.next()).f4379a;
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + c2Var);
                }
            }
            return;
        }
        ArrayList arrayList = this.f4417c;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = true;
                    break;
                } else if (!((q) it2.next()).f4379a.f4273c.mTransitioning) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10 && (obj = this.f4421g) != null) {
            a();
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.f4418d + " and " + this.f4419e + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        a();
    }
}
