package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.e;
import androidx.media3.exoplayer.analytics.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    /* JADX INFO: renamed from: androidx.transition.FragmentTransitionSupport$1, reason: invalid class name */
    class AnonymousClass1 extends Transition.EpicenterCallback {
    }

    /* JADX INFO: renamed from: androidx.transition.FragmentTransitionSupport$5, reason: invalid class name */
    class AnonymousClass5 extends Transition.EpicenterCallback {
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void a(View view, Object obj) {
        ((Transition) obj).c(view);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.C0.size();
            while (i2 < size) {
                b((i2 < 0 || i2 >= transitionSet.C0.size()) ? null : (Transition) transitionSet.C0.get(i2), arrayList);
                i2++;
            }
            return;
        }
        if (FragmentTransitionImpl.h(transition.f0) && FragmentTransitionImpl.h(transition.g0)) {
            int size2 = arrayList.size();
            while (i2 < size2) {
                transition.c((View) arrayList.get(i2));
                i2++;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.N(transition);
            transitionSet.N(transition2);
            transitionSet.D0 = false;
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.N(transition);
        }
        transitionSet2.N(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.N((Transition) obj);
        }
        transitionSet.N((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void k(Object obj, final View view, final ArrayList arrayList) {
        ((Transition) obj).b(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public final void e(Transition transition) {
                transition.B(this);
                transition.b(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void f(Transition transition) {
                transition.B(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList2.get(i2)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void g(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void a() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void d() {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void l(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2) {
        ((Transition) obj).b(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void e(Transition transition) {
                FragmentTransitionSupport fragmentTransitionSupport = FragmentTransitionSupport.this;
                Object obj4 = obj2;
                if (obj4 != null) {
                    fragmentTransitionSupport.s(obj4, arrayList, null);
                }
                Object obj5 = obj3;
                if (obj5 != null) {
                    fragmentTransitionSupport.s(obj5, arrayList2, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void f(Transition transition) {
                transition.B(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void m(View view, Object obj) {
        if (view != null) {
            FragmentTransitionImpl.g(new Rect(), view);
            ((Transition) obj).G(new AnonymousClass1());
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).G(new AnonymousClass5());
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void o(Object obj, CancellationSignal cancellationSignal, final e eVar) {
        Transition transition = (Transition) obj;
        cancellationSignal.b(new d(10, transition, eVar));
        transition.b(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public final void e(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void f(Transition transition2) {
                eVar.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void g(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void a() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void d() {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void p(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.g0;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransitionImpl.d(arrayList2, (View) arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.g0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.N((Transition) obj);
        return transitionSet;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.C0.size();
            while (i2 < size) {
                s((i2 < 0 || i2 >= transitionSet.C0.size()) ? null : (Transition) transitionSet.C0.get(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (FragmentTransitionImpl.h(transition.f0)) {
            ArrayList arrayList3 = transition.g0;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i2 < size2) {
                    transition.c((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.C((View) arrayList.get(size3));
                }
            }
        }
    }
}
