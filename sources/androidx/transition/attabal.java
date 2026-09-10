package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.privatdozent;
import earstone.cuirassed;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends privatdozent {

    /* JADX INFO: renamed from: androidx.transition.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class C0105attabal extends Transition.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Rect f13822attabal;

        public C0105attabal(Rect rect) {
            this.f13822attabal = rect;
        }

        @Override // androidx.transition.Transition.beachfront
        public Rect attabal(Transition transition) {
            return this.f13822attabal;
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class dern extends androidx.transition.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Object f13824attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13825beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Object f13827dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Object f13828marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13829saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13830wireman;

        public dern(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f13824attabal = obj;
            this.f13829saneness = arrayList;
            this.f13827dern = obj2;
            this.f13830wireman = arrayList2;
            this.f13828marial = obj3;
            this.f13825beachfront = arrayList3;
        }

        @Override // androidx.transition.saneness, androidx.transition.Transition.taiyuan
        public void impromptu(Transition transition) {
            transition.czestochowa(this);
        }

        @Override // androidx.transition.saneness, androidx.transition.Transition.taiyuan
        public void wireman(Transition transition) {
            Object obj = this.f13824attabal;
            if (obj != null) {
                attabal.this.yemenite(obj, this.f13829saneness, null);
            }
            Object obj2 = this.f13827dern;
            if (obj2 != null) {
                attabal.this.yemenite(obj2, this.f13830wireman, null);
            }
            Object obj3 = this.f13828marial;
            if (obj3 != null) {
                attabal.this.yemenite(obj3, this.f13825beachfront, null);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class marial extends Transition.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Rect f13831attabal;

        public marial(Rect rect) {
            this.f13831attabal = rect;
        }

        @Override // androidx.transition.Transition.beachfront
        public Rect attabal(Transition transition) {
            Rect rect = this.f13831attabal;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f13831attabal;
        }
    }

    public static boolean oilcan(Transition transition) {
        return (privatdozent.formularize(transition.grimness()) && privatdozent.formularize(transition.saran()) && privatdozent.formularize(transition.starveling())) ? false : true;
    }

    public static /* synthetic */ void trm(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public void adultoid(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).picketboat(new marial(rect));
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public Object arytenoidectomy(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.technofreak((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.technofreak((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.technofreak((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public void attabal(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).marial(view);
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean competently(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.privatdozent
    public void cord(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> listHydrovane = transitionSet.hydrovane();
        listHydrovane.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            privatdozent.beachfront(listHydrovane, arrayList.get(i));
        }
        listHydrovane.add(view);
        arrayList.add(view);
        saneness(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.privatdozent
    public void cuirassed(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.hydrovane().clear();
            transitionSet.hydrovane().addAll(arrayList2);
            yemenite(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public Object cutely(ViewGroup viewGroup, Object obj) {
        return androidx.transition.dern.saneness(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.privatdozent
    public void dern(Object obj) {
        ((cuirassed) obj).attabal();
    }

    @Override // androidx.fragment.app.privatdozent
    public void dovishness(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            apical(view, rect);
            ((Transition) obj).picketboat(new C0105attabal(rect));
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public void gintrap(Fragment fragment, Object obj, claque.marial marialVar, Runnable runnable) {
        rotuma(fragment, obj, marialVar, null, runnable);
    }

    @Override // androidx.fragment.app.privatdozent
    public void graveside(Object obj, float f) {
        cuirassed cuirassedVar = (cuirassed) obj;
        if (cuirassedVar.isReady()) {
            long jDern = (long) (f * cuirassedVar.dern());
            if (jDern == 0) {
                jDern = 1;
            }
            if (jDern == cuirassedVar.dern()) {
                jDern = cuirassedVar.dern() - 1;
            }
            cuirassedVar.beachfront(jDern);
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean impassible() {
        return true;
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
        Transition transitionLibyan = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionLibyan != null && transition != null) {
            transitionLibyan = new TransitionSet().technofreak(transitionLibyan).technofreak(transition).libyan(1);
        } else if (transitionLibyan == null) {
            transitionLibyan = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionLibyan;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionLibyan != null) {
            transitionSet.technofreak(transitionLibyan);
        }
        transitionSet.technofreak(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public void marial(ViewGroup viewGroup, Object obj) {
        androidx.transition.dern.attabal(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.privatdozent
    public void molybdenite(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).wireman(new dern(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.privatdozent
    public void polloi(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).wireman(new saneness(view, arrayList));
    }

    @Override // androidx.fragment.app.privatdozent
    public void rotuma(Fragment fragment, Object obj, claque.marial marialVar, final Runnable runnable, final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        marialVar.saneness(new claque.marial.attabal() { // from class: earstone.wireman
            @Override // claque.marial.attabal
            public final void onCancel() {
                androidx.transition.attabal.trm(runnable, transition, runnable2);
            }
        });
        transition.wireman(new wireman(runnable2));
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
            int iVesuvio = transitionSet.vesuvio();
            while (i < iVesuvio) {
                saneness(transitionSet.dhss(i), arrayList);
                i++;
            }
            return;
        }
        if (oilcan(transition) || !privatdozent.formularize(transition.hydrovane())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.marial(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.privatdozent
    public Object stratoscope(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.technofreak((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.privatdozent
    public boolean triweekly(Object obj) {
        boolean zOverspeculate = ((Transition) obj).overspeculate();
        if (!zOverspeculate) {
            Objects.toString(obj);
        }
        return zOverspeculate;
    }

    @Override // androidx.fragment.app.privatdozent
    public void wireman(Object obj, Runnable runnable) {
        ((cuirassed) obj).cutely(runnable);
    }

    public void yemenite(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iVesuvio = transitionSet.vesuvio();
            while (i < iVesuvio) {
                yemenite(transitionSet.dhss(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (oilcan(transition)) {
            return;
        }
        List<View> listHydrovane = transition.hydrovane();
        if (listHydrovane.size() == arrayList.size() && listHydrovane.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.marial(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.sensatory(arrayList.get(size2));
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class saneness implements Transition.taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ View f13833attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13835saneness;

        public saneness(View view, ArrayList arrayList) {
            this.f13833attabal = view;
            this.f13835saneness = arrayList;
        }

        @Override // androidx.transition.Transition.taiyuan
        public void impromptu(Transition transition) {
            transition.czestochowa(this);
            this.f13833attabal.setVisibility(8);
            int size = this.f13835saneness.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f13835saneness.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.taiyuan
        public void wireman(Transition transition) {
            transition.czestochowa(this);
            transition.wireman(this);
        }

        @Override // androidx.transition.Transition.taiyuan
        public void apical(Transition transition) {
        }

        @Override // androidx.transition.Transition.taiyuan
        public void marial(Transition transition) {
        }

        @Override // androidx.transition.Transition.taiyuan
        public void saneness(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class wireman implements Transition.taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Runnable f13836attabal;

        public wireman(Runnable runnable) {
            this.f13836attabal = runnable;
        }

        @Override // androidx.transition.Transition.taiyuan
        public void impromptu(Transition transition) {
            this.f13836attabal.run();
        }

        @Override // androidx.transition.Transition.taiyuan
        public void apical(Transition transition) {
        }

        @Override // androidx.transition.Transition.taiyuan
        public void marial(Transition transition) {
        }

        @Override // androidx.transition.Transition.taiyuan
        public void saneness(Transition transition) {
        }

        @Override // androidx.transition.Transition.taiyuan
        public void wireman(Transition transition) {
        }
    }
}
