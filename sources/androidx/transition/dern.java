package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import earstone.arytenoidectomy;
import earstone.cuirassed;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TransitionManager.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Transition f13838attabal = new AutoTransition();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static ThreadLocal<WeakReference<androidx.collection.attabal<ViewGroup, ArrayList<Transition>>>> f13840saneness = new ThreadLocal<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static ArrayList<ViewGroup> f13839dern = new ArrayList<>();

    public static void attabal(ViewGroup viewGroup, Transition transition) {
        if (f13839dern.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f13839dern.add(viewGroup);
        if (transition == null) {
            transition = f13838attabal;
        }
        Transition transitionClone = transition.clone();
        marial(viewGroup, transitionClone);
        arytenoidectomy.dern(viewGroup, null);
        wireman(viewGroup, transitionClone);
    }

    public static androidx.collection.attabal<ViewGroup, ArrayList<Transition>> dern() {
        androidx.collection.attabal<ViewGroup, ArrayList<Transition>> attabalVar;
        WeakReference<androidx.collection.attabal<ViewGroup, ArrayList<Transition>>> weakReference = f13840saneness.get();
        if (weakReference != null && (attabalVar = weakReference.get()) != null) {
            return attabalVar;
        }
        androidx.collection.attabal<ViewGroup, ArrayList<Transition>> attabalVar2 = new androidx.collection.attabal<>();
        f13840saneness.set(new WeakReference<>(attabalVar2));
        return attabalVar2;
    }

    public static void marial(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = dern().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().sayid(viewGroup);
            }
        }
        if (transition != null) {
            transition.kowloon(viewGroup, true);
        }
        arytenoidectomy arytenoidectomyVarSaneness = arytenoidectomy.saneness(viewGroup);
        if (arytenoidectomyVarSaneness != null) {
            arytenoidectomyVarSaneness.attabal();
        }
    }

    public static cuirassed saneness(ViewGroup viewGroup, Transition transition) {
        if (f13839dern.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.overspeculate()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f13839dern.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.technofreak(transitionClone);
        marial(viewGroup, transitionSet);
        arytenoidectomy.dern(viewGroup, null);
        wireman(viewGroup, transitionSet);
        viewGroup.invalidate();
        return transitionSet.adultoid();
    }

    public static void wireman(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        attabal attabalVar = new attabal(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(attabalVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(attabalVar);
    }

    /* JADX INFO: compiled from: TransitionManager.java */
    public static class attabal implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public ViewGroup f13841arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Transition f13842kowloon;

        /* JADX INFO: renamed from: androidx.transition.dern$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransitionManager.java */
        public class C0106attabal extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ androidx.collection.attabal f13843attabal;

            public C0106attabal(androidx.collection.attabal attabalVar) {
                this.f13843attabal = attabalVar;
            }

            @Override // androidx.transition.saneness, androidx.transition.Transition.taiyuan
            public void impromptu(Transition transition) {
                ((ArrayList) this.f13843attabal.get(attabal.this.f13841arytenoidectomy)).remove(transition);
                transition.czestochowa(this);
            }
        }

        public attabal(Transition transition, ViewGroup viewGroup) {
            this.f13842kowloon = transition;
            this.f13841arytenoidectomy = viewGroup;
        }

        public final void attabal() {
            this.f13841arytenoidectomy.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f13841arytenoidectomy.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            attabal();
            if (!dern.f13839dern.remove(this.f13841arytenoidectomy)) {
                return true;
            }
            androidx.collection.attabal<ViewGroup, ArrayList<Transition>> attabalVarDern = dern.dern();
            ArrayList<Transition> arrayList = attabalVarDern.get(this.f13841arytenoidectomy);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                attabalVarDern.put(this.f13841arytenoidectomy, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f13842kowloon);
            this.f13842kowloon.wireman(new C0106attabal(attabalVarDern));
            this.f13842kowloon.kowloon(this.f13841arytenoidectomy, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).underbelly(this.f13841arytenoidectomy);
                }
            }
            this.f13842kowloon.empress(this.f13841arytenoidectomy);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            attabal();
            dern.f13839dern.remove(this.f13841arytenoidectomy);
            ArrayList<Transition> arrayList = dern.dern().get(this.f13841arytenoidectomy);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().underbelly(this.f13841arytenoidectomy);
                }
            }
            this.f13842kowloon.monoploid(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
