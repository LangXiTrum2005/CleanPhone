package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.oilcan;
import incorrectly.ctenidium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements formularize {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public oilcan f12453beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ctenidium f12454competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Looper f12456marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<formularize.dern> f12452attabal = new ArrayList<>(1);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HashSet<formularize.dern> f12457saneness = new HashSet<>(1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impassible.attabal f12455dern = new impassible.attabal();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.saneness.attabal f12458wireman = new androidx.media3.exoplayer.drm.saneness.attabal();

    public final androidx.media3.exoplayer.drm.saneness.attabal arytenoidectomy(int i, formularize.saneness sanenessVar) {
        return this.f12458wireman.kowloon(i, sanenessVar);
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void attabal(Handler handler, impassible impassibleVar) {
        decarock.attabal.marial(handler);
        decarock.attabal.marial(impassibleVar);
        this.f12455dern.beachfront(handler, impassibleVar);
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void competently(formularize.dern dernVar) {
        decarock.attabal.marial(this.f12456marial);
        boolean zIsEmpty = this.f12457saneness.isEmpty();
        this.f12457saneness.add(dernVar);
        if (zIsEmpty) {
            adultoid();
        }
    }

    public abstract void cord();

    @Override // androidx.media3.exoplayer.source.formularize
    public final void cutely(formularize.dern dernVar) {
        boolean zIsEmpty = this.f12457saneness.isEmpty();
        this.f12457saneness.remove(dernVar);
        if (zIsEmpty || !this.f12457saneness.isEmpty()) {
            return;
        }
        graveside();
    }

    public final ctenidium dovishness() {
        return (ctenidium) decarock.attabal.taiyuan(this.f12454competently);
    }

    public final boolean gintrap() {
        return !this.f12457saneness.isEmpty();
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void marial(androidx.media3.exoplayer.drm.saneness sanenessVar) {
        this.f12458wireman.triweekly(sanenessVar);
    }

    public final impassible.attabal molybdenite(formularize.saneness sanenessVar) {
        return this.f12455dern.polloi(0, sanenessVar);
    }

    public final androidx.media3.exoplayer.drm.saneness.attabal monoploid(formularize.saneness sanenessVar) {
        return this.f12458wireman.kowloon(0, sanenessVar);
    }

    public final impassible.attabal polloi(int i, formularize.saneness sanenessVar) {
        return this.f12455dern.polloi(i, sanenessVar);
    }

    public final void preprohormone(oilcan oilcanVar) {
        this.f12453beachfront = oilcanVar;
        Iterator<formularize.dern> it = this.f12452attabal.iterator();
        while (it.hasNext()) {
            it.next().attabal(this, oilcanVar);
        }
    }

    public abstract void rotuma(vir.arytenoidectomy arytenoidectomyVar);

    @Override // androidx.media3.exoplayer.source.formularize
    public final void saneness(impassible impassibleVar) {
        this.f12455dern.monoploid(impassibleVar);
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void taiyuan(formularize.dern dernVar) {
        this.f12452attabal.remove(dernVar);
        if (!this.f12452attabal.isEmpty()) {
            cutely(dernVar);
            return;
        }
        this.f12456marial = null;
        this.f12453beachfront = null;
        this.f12454competently = null;
        this.f12457saneness.clear();
        cord();
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void triweekly(formularize.dern dernVar, vir.arytenoidectomy arytenoidectomyVar, ctenidium ctenidiumVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f12456marial;
        decarock.attabal.attabal(looper == null || looper == looperMyLooper);
        this.f12454competently = ctenidiumVar;
        oilcan oilcanVar = this.f12453beachfront;
        this.f12452attabal.add(dernVar);
        if (this.f12456marial == null) {
            this.f12456marial = looperMyLooper;
            this.f12457saneness.add(dernVar);
            rotuma(arytenoidectomyVar);
        } else if (oilcanVar != null) {
            competently(dernVar);
            dernVar.attabal(this, oilcanVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public final void wireman(Handler handler, androidx.media3.exoplayer.drm.saneness sanenessVar) {
        decarock.attabal.marial(handler);
        decarock.attabal.marial(sanenessVar);
        this.f12458wireman.competently(handler, sanenessVar);
    }

    public void adultoid() {
    }

    public void graveside() {
    }
}
