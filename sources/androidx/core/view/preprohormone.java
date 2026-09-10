package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.p001lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuHostHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Runnable f9405attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final CopyOnWriteArrayList<cuirassed> f9407saneness = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<cuirassed, attabal> f9406dern = new HashMap();

    /* JADX INFO: compiled from: MenuHostHelper.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Lifecycle f9408attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.p001lifecycle.impassible f9409saneness;

        public attabal(Lifecycle lifecycle, androidx.p001lifecycle.impassible impassibleVar) {
            this.f9408attabal = lifecycle;
            this.f9409saneness = impassibleVar;
            lifecycle.attabal(impassibleVar);
        }

        public void attabal() {
            this.f9408attabal.wireman(this.f9409saneness);
            this.f9409saneness = null;
        }
    }

    public preprohormone(Runnable runnable) {
        this.f9405attabal = runnable;
    }

    public static /* synthetic */ void attabal(preprohormone preprohormoneVar, Lifecycle.State state, cuirassed cuirassedVar, androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        preprohormoneVar.getClass();
        if (event == Lifecycle.Event.upTo(state)) {
            preprohormoneVar.dern(cuirassedVar);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            preprohormoneVar.cutely(cuirassedVar);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            preprohormoneVar.f9407saneness.remove(cuirassedVar);
            preprohormoneVar.f9405attabal.run();
        }
    }

    public static /* synthetic */ void saneness(preprohormone preprohormoneVar, cuirassed cuirassedVar, androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        preprohormoneVar.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            preprohormoneVar.cutely(cuirassedVar);
        }
    }

    public void beachfront(Menu menu, MenuInflater menuInflater) {
        Iterator<cuirassed> it = this.f9407saneness.iterator();
        while (it.hasNext()) {
            it.next().wireman(menu, menuInflater);
        }
    }

    public void competently(Menu menu) {
        Iterator<cuirassed> it = this.f9407saneness.iterator();
        while (it.hasNext()) {
            it.next().attabal(menu);
        }
    }

    public void cutely(cuirassed cuirassedVar) {
        this.f9407saneness.remove(cuirassedVar);
        attabal attabalVarRemove = this.f9406dern.remove(cuirassedVar);
        if (attabalVarRemove != null) {
            attabalVarRemove.attabal();
        }
        this.f9405attabal.run();
    }

    public void dern(cuirassed cuirassedVar) {
        this.f9407saneness.add(cuirassedVar);
        this.f9405attabal.run();
    }

    public boolean impromptu(MenuItem menuItem) {
        Iterator<cuirassed> it = this.f9407saneness.iterator();
        while (it.hasNext()) {
            if (it.next().dern(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void marial(final cuirassed cuirassedVar, androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar, final Lifecycle.State state) {
        Lifecycle lifecycle = arytenoidectomyVar.getLifecycle();
        attabal attabalVarRemove = this.f9406dern.remove(cuirassedVar);
        if (attabalVarRemove != null) {
            attabalVarRemove.attabal();
        }
        this.f9406dern.put(cuirassedVar, new attabal(lifecycle, new androidx.p001lifecycle.impassible() { // from class: androidx.core.view.gintrap
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar2, Lifecycle.Event event) {
                preprohormone.attabal(this.f9300kowloon, state, cuirassedVar, arytenoidectomyVar2, event);
            }
        }));
    }

    public void taiyuan(Menu menu) {
        Iterator<cuirassed> it = this.f9407saneness.iterator();
        while (it.hasNext()) {
            it.next().saneness(menu);
        }
    }

    public void wireman(final cuirassed cuirassedVar, androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
        dern(cuirassedVar);
        Lifecycle lifecycle = arytenoidectomyVar.getLifecycle();
        attabal attabalVarRemove = this.f9406dern.remove(cuirassedVar);
        if (attabalVarRemove != null) {
            attabalVarRemove.attabal();
        }
        this.f9406dern.put(cuirassedVar, new attabal(lifecycle, new androidx.p001lifecycle.impassible() { // from class: androidx.core.view.rotuma
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar2, Lifecycle.Event event) {
                preprohormone.saneness(this.f9412kowloon, cuirassedVar, arytenoidectomyVar2, event);
            }
        }));
    }
}
