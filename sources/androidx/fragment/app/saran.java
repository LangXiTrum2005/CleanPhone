package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes.dex */
public class saran extends privatdozent {

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class attabal extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Rect f10376attabal;

        public attabal(Rect rect) {
            this.f10376attabal = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f10376attabal;
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class marial extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Rect f10385attabal;

        public marial(Rect rect) {
            this.f10385attabal = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f10385attabal;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f10385attabal;
        }
    }

    public static boolean trm(Transition transition) {
        return (privatdozent.formularize(transition.getTargetIds()) && privatdozent.formularize(transition.getTargetNames()) && privatdozent.formularize(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.privatdozent
    public void adultoid(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new marial(rect));
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public Object arytenoidectomy(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public void attabal(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean competently(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.privatdozent
    public void cord(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            privatdozent.beachfront(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        saneness(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.privatdozent
    public void cuirassed(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            oilcan(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public void dovishness(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            apical(view, rect);
            ((Transition) obj).setEpicenterCallback(new attabal(rect));
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public void gintrap(Fragment fragment, Object obj, claque.marial marialVar, Runnable runnable) {
        ((Transition) obj).addListener(new wireman(runnable));
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean impassible() {
        FragmentManager.deadwork(4);
        return false;
    }

    @Override // androidx.fragment.app.privatdozent
    public Object impromptu(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.privatdozent
    public Object kowloon(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public void marial(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.privatdozent
    public void molybdenite(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new dern(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void oilcan(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                oilcan(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (trm(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public void polloi(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new saneness(view, arrayList));
    }

    @Override // androidx.fragment.app.privatdozent
    public void saneness(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                saneness(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (trm(transition) || !privatdozent.formularize(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public Object stratoscope(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean triweekly(Object obj) {
        if (!FragmentManager.deadwork(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class dern implements Transition.TransitionListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Object f10378attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10379beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Object f10381dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Object f10382marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10383saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10384wireman;

        public dern(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10378attabal = obj;
            this.f10383saneness = arrayList;
            this.f10381dern = obj2;
            this.f10384wireman = arrayList2;
            this.f10382marial = obj3;
            this.f10379beachfront = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f10378attabal;
            if (obj != null) {
                saran.this.oilcan(obj, this.f10383saneness, null);
            }
            Object obj2 = this.f10381dern;
            if (obj2 != null) {
                saran.this.oilcan(obj2, this.f10384wireman, null);
            }
            Object obj3 = this.f10382marial;
            if (obj3 != null) {
                saran.this.oilcan(obj3, this.f10379beachfront, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class saneness implements Transition.TransitionListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ View f10387attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10389saneness;

        public saneness(View view, ArrayList arrayList) {
            this.f10387attabal = view;
            this.f10389saneness = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f10387attabal.setVisibility(8);
            int size = this.f10389saneness.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f10389saneness.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class wireman implements Transition.TransitionListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Runnable f10390attabal;

        public wireman(Runnable runnable) {
            this.f10390attabal = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f10390attabal.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
