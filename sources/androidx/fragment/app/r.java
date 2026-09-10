package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4460f;

    public r(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        this.f4455a = container;
        this.f4456b = new ArrayList();
        this.f4457c = new ArrayList();
    }

    public static void f(x.e eVar, View view) {
        WeakHashMap weakHashMap = m0.s0.f45746a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            eVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f(eVar, childAt);
                }
            }
        }
    }

    public static final r j(ViewGroup container, g1 fragmentManager) {
        kotlin.jvm.internal.n.f(container, "container");
        kotlin.jvm.internal.n.f(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.n.e(fragmentManager.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r) {
            return (r) tag;
        }
        r rVar = new r(container);
        container.setTag(R.id.special_effects_controller_view_tag, rVar);
        return rVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z10;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                c2 c2Var = (c2) it.next();
                if (!c2Var.f4281k.isEmpty()) {
                    ArrayList arrayList2 = c2Var.f4281k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((b2) it2.next()).a());
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                xj.t.a0(((c2) it3.next()).f4281k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(c2 operation) {
        kotlin.jvm.internal.n.f(operation, "operation");
        if (operation.f4279i) {
            int i10 = operation.f4271a;
            View viewRequireView = operation.f4273c.requireView();
            kotlin.jvm.internal.n.e(viewRequireView, "operation.fragment.requireView()");
            defpackage.e.a(i10, viewRequireView, this.f4455a);
            operation.f4279i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x043c A[LOOP:18: B:151:0x0436->B:153:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    public final void b(ArrayList arrayList, boolean z10) {
        Object next;
        Object objPrevious;
        boolean z11;
        int i10;
        int i11;
        ArrayList<g> arrayList2;
        p pVar;
        int i12;
        Iterator it;
        Object objS;
        ArrayList<String> sharedElementSourceNames;
        ArrayList arrayList3;
        y1 y1Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList<String> sharedElementTargetNames;
        wj.f fVar;
        if (g1.J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            c2 c2Var = (c2) next;
            View view = c2Var.f4273c.mView;
            kotlin.jvm.internal.n.e(view, "operation.fragment.mView");
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (c2Var.f4271a != 2) {
                        break;
                    }
                } else {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(l1.d.e(visibility, "Unknown visibility "));
                    }
                }
            }
        }
        c2 c2Var2 = (c2) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            c2 c2Var3 = (c2) objPrevious;
            View view2 = c2Var3.f4273c.mView;
            kotlin.jvm.internal.n.e(view2, "operation.fragment.mView");
            if (view2.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(l1.d.e(visibility2, "Unknown visibility "));
                }
            }
            if (c2Var3.f4271a == 2) {
                break;
            }
        }
        c2 c2Var4 = (c2) objPrevious;
        if (g1.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + c2Var2 + " to " + c2Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Fragment fragment = ((c2) xj.n.w0(arrayList)).f4273c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            e0 e0Var = ((c2) it3.next()).f4273c.mAnimationInfo;
            e0 e0Var2 = fragment.mAnimationInfo;
            e0Var.f4297b = e0Var2.f4297b;
            e0Var.f4298c = e0Var2.f4298c;
            e0Var.f4299d = e0Var2.f4299d;
            e0Var.f4300e = e0Var2.f4300e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            z11 = false;
            i10 = 1;
            if (!it4.hasNext()) {
                break;
            }
            c2 c2Var5 = (c2) it4.next();
            arrayList6.add(new g(c2Var5, z10));
            if (z10) {
                if (c2Var5 == c2Var2) {
                    z11 = true;
                }
            } else if (c2Var5 == c2Var4) {
                z11 = true;
            }
            arrayList7.add(new q(c2Var5, z10, z11));
            c2Var5.f4274d.add(new a2(this, c2Var5, i10));
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj : arrayList7) {
            if (!((q) obj).a()) {
                arrayList8.add(obj);
            }
        }
        ArrayList<q> arrayList9 = new ArrayList();
        for (Object obj2 : arrayList8) {
            if (((q) obj2).b() != null) {
                arrayList9.add(obj2);
            }
        }
        y1 y1Var2 = null;
        for (q qVar : arrayList9) {
            y1 y1VarB = qVar.b();
            if (y1Var2 != null && y1VarB != y1Var2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + qVar.f4379a.f4273c + " returned Transition " + qVar.f4439b + " which uses a different Transition type than other Fragments.").toString());
            }
            y1Var2 = y1VarB;
        }
        if (y1Var2 == null) {
            arrayList2 = arrayList6;
            i12 = 1;
            i11 = 2;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            x.e eVar = new x.e(0);
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            i11 = 2;
            x.e eVar2 = new x.e(0);
            ArrayList<String> arrayList14 = arrayList12;
            x.e eVar3 = new x.e(0);
            Iterator it5 = arrayList9.iterator();
            loop10: while (true) {
                Object obj3 = null;
                while (true) {
                    if (!it5.hasNext()) {
                        arrayList2 = arrayList6;
                        y1 y1Var3 = y1Var2;
                        ArrayList arrayList15 = arrayList10;
                        ArrayList arrayList16 = arrayList11;
                        if (obj3 == null) {
                            if (!arrayList9.isEmpty()) {
                                Iterator it6 = arrayList9.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (((q) it6.next()).f4439b != null) {
                                            i12 = i10;
                                            pVar = new p(arrayList9, c2Var2, c2Var4, y1Var3, obj3, arrayList15, arrayList16, eVar, arrayList14, arrayList13, eVar2, eVar3, z10);
                                            it = arrayList9.iterator();
                                            while (it.hasNext()) {
                                                ((q) it.next()).f4379a.f4280j.add(pVar);
                                            }
                                            break loop10;
                                            break loop10;
                                        }
                                    }
                                }
                            }
                            i12 = i10;
                            break loop10;
                        }
                        i12 = i10;
                        pVar = new p(arrayList9, c2Var2, c2Var4, y1Var3, obj3, arrayList15, arrayList16, eVar, arrayList14, arrayList13, eVar2, eVar3, z10);
                        it = arrayList9.iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).f4379a.f4280j.add(pVar);
                        }
                        break loop10;
                    }
                    Object obj4 = ((q) it5.next()).f4441d;
                    if (obj4 == null || c2Var2 == null) {
                        z11 = false;
                        arrayList6 = arrayList6;
                        y1Var2 = y1Var2;
                        arrayList10 = arrayList10;
                        arrayList11 = arrayList11;
                    } else {
                        int i13 = i10;
                        Fragment fragment2 = c2Var2.f4273c;
                        if (c2Var4 != null) {
                            Fragment fragment3 = c2Var4.f4273c;
                            objS = y1Var2.s(y1Var2.f(obj4));
                            sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                            arrayList3 = arrayList6;
                            kotlin.jvm.internal.n.e(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                            y1Var = y1Var2;
                            kotlin.jvm.internal.n.e(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                            arrayList4 = arrayList10;
                            kotlin.jvm.internal.n.e(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                            int size = sharedElementTargetNames2.size();
                            arrayList5 = arrayList11;
                            int i14 = 0;
                            while (i14 < size) {
                                int i15 = size;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i14));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i14));
                                }
                                i14++;
                                size = i15;
                            }
                            sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                            kotlin.jvm.internal.n.e(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                            if (z10) {
                                fragment2.getEnterTransitionCallback();
                                fragment3.getExitTransitionCallback();
                                fVar = new wj.f(null, null);
                            } else {
                                fragment2.getExitTransitionCallback();
                                fragment3.getEnterTransitionCallback();
                                fVar = new wj.f(null, null);
                            }
                            if (fVar.f53283a != null) {
                                throw new ClassCastException();
                            }
                            if (fVar.f53284b != null) {
                                throw new ClassCastException();
                            }
                            int i16 = 0;
                            for (int size2 = sharedElementSourceNames.size(); i16 < size2; size2 = size2) {
                                String str = sharedElementSourceNames.get(i16);
                                kotlin.jvm.internal.n.e(str, "exitingNames[i]");
                                String str2 = sharedElementTargetNames.get(i16);
                                kotlin.jvm.internal.n.e(str2, "enteringNames[i]");
                                eVar.put(str, str2);
                                i16++;
                            }
                            if (g1.J(2)) {
                                Log.v("FragmentManager", ">>> entering view names <<<");
                                Iterator<String> it7 = sharedElementTargetNames.iterator();
                                while (it7.hasNext()) {
                                    Log.v("FragmentManager", "Name: " + it7.next());
                                }
                                Log.v("FragmentManager", ">>> exiting view names <<<");
                                Iterator<String> it8 = sharedElementSourceNames.iterator();
                                while (it8.hasNext()) {
                                    Log.v("FragmentManager", "Name: " + it8.next());
                                }
                            }
                            View view3 = fragment2.mView;
                            kotlin.jvm.internal.n.e(view3, "firstOut.fragment.mView");
                            f(eVar2, view3);
                            eVar2.m(sharedElementSourceNames);
                            eVar.m(eVar2.keySet());
                            View view4 = fragment3.mView;
                            kotlin.jvm.internal.n.e(view4, "lastIn.fragment.mView");
                            f(eVar3, view4);
                            eVar3.m(sharedElementTargetNames);
                            eVar3.m(eVar.values());
                            w1 w1Var = r1.f4463a;
                            for (int i17 = eVar.f53506c - 1; -1 < i17; i17--) {
                                if (!eVar3.containsKey((String) eVar.j(i17))) {
                                    eVar.h(i17);
                                }
                            }
                            i10 = i13;
                            xj.t.c0(eVar2.entrySet(), new al.f(eVar.keySet(), i10), false);
                            xj.t.c0(eVar3.entrySet(), new al.f(eVar.values(), i10), false);
                            if (eVar.isEmpty()) {
                                break;
                            }
                            arrayList14 = sharedElementTargetNames;
                            obj3 = objS;
                            arrayList13 = sharedElementSourceNames;
                            arrayList6 = arrayList3;
                            arrayList10 = arrayList4;
                            arrayList11 = arrayList5;
                            z11 = false;
                            y1Var2 = y1Var;
                        } else {
                            i10 = i13;
                            z11 = false;
                            arrayList6 = arrayList6;
                            y1Var2 = y1Var2;
                            arrayList10 = arrayList10;
                            arrayList11 = arrayList11;
                        }
                    }
                }
                Log.i("FragmentManager", "Ignoring shared elements transition " + objS + " between " + c2Var2 + " and " + c2Var4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                arrayList4.clear();
                arrayList5.clear();
                arrayList14 = sharedElementTargetNames;
                z11 = false;
                arrayList13 = sharedElementSourceNames;
                arrayList6 = arrayList3;
                y1Var2 = y1Var;
                arrayList10 = arrayList4;
                arrayList11 = arrayList5;
            }
        }
        ArrayList<g> arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            xj.t.a0(((g) it9.next()).f4379a.f4281k, arrayList18);
        }
        boolean zIsEmpty = arrayList18.isEmpty();
        int i18 = 0;
        for (g gVar : arrayList2) {
            Context context = this.f4455a.getContext();
            c2 c2Var6 = gVar.f4379a;
            kotlin.jvm.internal.n.e(context, "context");
            m0 m0VarB = gVar.b(context);
            if (m0VarB != null) {
                if (((AnimatorSet) m0VarB.f4385b) == null) {
                    arrayList17.add(gVar);
                } else {
                    Fragment fragment4 = c2Var6.f4273c;
                    if (c2Var6.f4281k.isEmpty()) {
                        if (c2Var6.f4271a == 3) {
                            c2Var6.f4279i = false;
                        }
                        c2Var6.f4280j.add(new i(gVar));
                        i18 = i12;
                    } else if (g1.J(i11)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (g gVar2 : arrayList17) {
            c2 c2Var7 = gVar2.f4379a;
            Fragment fragment5 = c2Var7.f4273c;
            if (zIsEmpty) {
                if (i18 == 0) {
                    c2Var7.f4280j.add(new f(gVar2));
                } else if (g1.J(i11)) {
                    Log.v(r2, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (g1.J(i11)) {
                Log.v(r2, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(List operations) {
        kotlin.jvm.internal.n.f(operations, "operations");
        List list = operations;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xj.t.a0(((c2) it.next()).f4281k, arrayList);
        }
        List listN0 = xj.n.N0(xj.n.R0(arrayList));
        int size = listN0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b2) listN0.get(i10)).c(this.f4455a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((c2) operations.get(i11));
        }
        List listN1 = xj.n.N0(list);
        int size3 = listN1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            c2 c2Var = (c2) listN1.get(i12);
            if (c2Var.f4281k.isEmpty()) {
                c2Var.b();
            }
        }
    }

    public final void d(int i10, int i11, o1 o1Var) {
        synchronized (this.f4456b) {
            try {
                Fragment fragment = o1Var.f4414c;
                kotlin.jvm.internal.n.e(fragment, "fragmentStateManager.fragment");
                c2 c2VarG = g(fragment);
                if (c2VarG == null) {
                    Fragment fragment2 = o1Var.f4414c;
                    c2VarG = (fragment2.mTransitioning || fragment2.mRemoving) ? h(fragment2) : null;
                }
                if (c2VarG != null) {
                    c2VarG.d(i10, i11);
                    return;
                }
                c2 c2Var = new c2(i10, i11, o1Var);
                this.f4456b.add(c2Var);
                c2Var.f4274d.add(new a2(this, c2Var, 0));
                c2Var.f4274d.add(new a2(this, c2Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f4460f) {
            return;
        }
        if (!this.f4455a.isAttachedToWindow()) {
            i();
            this.f4459e = false;
            return;
        }
        synchronized (this.f4456b) {
            try {
                ArrayList<c2> arrayListO0 = xj.n.O0(this.f4457c);
                this.f4457c.clear();
                Iterator it = arrayListO0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    c2 c2Var = (c2) it.next();
                    if (this.f4456b.isEmpty() || !c2Var.f4273c.mTransitioning) {
                        z10 = false;
                    }
                    c2Var.f4277g = z10;
                }
                for (c2 c2Var2 : arrayListO0) {
                    if (this.f4458d) {
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + c2Var2);
                        }
                        c2Var2.b();
                    } else {
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c2Var2);
                        }
                        c2Var2.a(this.f4455a);
                    }
                    this.f4458d = false;
                    if (!c2Var2.f4276f) {
                        this.f4457c.add(c2Var2);
                    }
                }
                if (!this.f4456b.isEmpty()) {
                    n();
                    ArrayList arrayListO1 = xj.n.O0(this.f4456b);
                    if (arrayListO1.isEmpty()) {
                        return;
                    }
                    this.f4456b.clear();
                    this.f4457c.addAll(arrayListO1);
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListO1, this.f4459e);
                    boolean zK = k(arrayListO1);
                    Iterator it2 = arrayListO1.iterator();
                    boolean z11 = true;
                    while (it2.hasNext()) {
                        if (!((c2) it2.next()).f4273c.mTransitioning) {
                            z11 = false;
                        }
                    }
                    if (!z11 || zK) {
                        z10 = false;
                    }
                    this.f4458d = z10;
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zK + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        m(arrayListO1);
                        c(arrayListO1);
                    } else if (zK) {
                        m(arrayListO1);
                        int size = arrayListO1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((c2) arrayListO1.get(i10));
                        }
                    }
                    this.f4459e = false;
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final c2 g(Fragment fragment) {
        Object next;
        Iterator it = this.f4456b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c2 c2Var = (c2) next;
            if (kotlin.jvm.internal.n.a(c2Var.f4273c, fragment) && !c2Var.f4275e) {
                return (c2) next;
            }
        }
        next = null;
        return (c2) next;
    }

    public final c2 h(Fragment fragment) {
        Object next;
        Iterator it = this.f4457c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c2 c2Var = (c2) next;
            if (kotlin.jvm.internal.n.a(c2Var.f4273c, fragment) && !c2Var.f4275e) {
                return (c2) next;
            }
        }
        next = null;
        return (c2) next;
    }

    public final void i() {
        if (g1.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f4455a.isAttachedToWindow();
        synchronized (this.f4456b) {
            try {
                n();
                m(this.f4456b);
                ArrayList<c2> arrayListO0 = xj.n.O0(this.f4457c);
                Iterator it = arrayListO0.iterator();
                while (it.hasNext()) {
                    ((c2) it.next()).f4277g = false;
                }
                for (c2 c2Var : arrayListO0) {
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4455a + " is not attached to window. ") + "Cancelling running operation " + c2Var);
                    }
                    c2Var.a(this.f4455a);
                }
                ArrayList<c2> arrayListO1 = xj.n.O0(this.f4456b);
                Iterator it2 = arrayListO1.iterator();
                while (it2.hasNext()) {
                    ((c2) it2.next()).f4277g = false;
                }
                for (c2 c2Var2 : arrayListO1) {
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4455a + " is not attached to window. ") + "Cancelling pending operation " + c2Var2);
                    }
                    c2Var2.a(this.f4455a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Object objPrevious;
        synchronized (this.f4456b) {
            try {
                n();
                ArrayList arrayList = this.f4456b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c2 c2Var = (c2) objPrevious;
                    View view = c2Var.f4273c.mView;
                    kotlin.jvm.internal.n.e(view, "operation.fragment.mView");
                    char c4 = 4;
                    if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c4 = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c4 = 3;
                        }
                    }
                    if (c2Var.f4271a == 2 && c4 != 2) {
                        break;
                    }
                }
                c2 c2Var2 = (c2) objPrevious;
                Fragment fragment = c2Var2 != null ? c2Var2.f4273c : null;
                this.f4460f = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2 c2Var = (c2) list.get(i10);
            o1 o1Var = c2Var.l;
            if (!c2Var.f4278h) {
                c2Var.f4278h = true;
                int i11 = c2Var.f4272b;
                if (i11 == 2) {
                    Fragment fragment = o1Var.f4414c;
                    kotlin.jvm.internal.n.e(fragment, "fragmentStateManager.fragment");
                    View viewFindFocus = fragment.mView.findFocus();
                    if (viewFindFocus != null) {
                        fragment.setFocusedView(viewFindFocus);
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                        }
                    }
                    View viewRequireView = c2Var.f4273c.requireView();
                    kotlin.jvm.internal.n.e(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + viewRequireView + " to container in onStart");
                        }
                        o1Var.b();
                        viewRequireView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (viewRequireView.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && viewRequireView.getVisibility() == 0) {
                        if (g1.J(2)) {
                            Log.v("FragmentManager", "Making view " + viewRequireView + " INVISIBLE in onStart");
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (i11 == 3) {
                    Fragment fragment2 = o1Var.f4414c;
                    kotlin.jvm.internal.n.e(fragment2, "fragmentStateManager.fragment");
                    View viewRequireView2 = fragment2.requireView();
                    kotlin.jvm.internal.n.e(viewRequireView2, "fragment.requireView()");
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + fragment2);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xj.t.a0(((c2) it.next()).f4281k, arrayList);
        }
        List listN0 = xj.n.N0(xj.n.R0(arrayList));
        int size2 = listN0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b2 b2Var = (b2) listN0.get(i12);
            b2Var.getClass();
            ViewGroup container = this.f4455a;
            kotlin.jvm.internal.n.f(container, "container");
            if (!b2Var.f4263a) {
                b2Var.e(container);
            }
            b2Var.f4263a = true;
        }
    }

    public final void n() {
        for (c2 c2Var : this.f4456b) {
            int i10 = 2;
            if (c2Var.f4272b == 2) {
                View viewRequireView = c2Var.f4273c.requireView();
                kotlin.jvm.internal.n.e(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(l1.d.e(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                c2Var.d(i10, 1);
            }
        }
    }
}
