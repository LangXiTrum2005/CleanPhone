package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.oilcan;
import decarock.grimness;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern<T> extends androidx.media3.exoplayer.source.attabal {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public vir.arytenoidectomy f12486cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final HashMap<T, saneness<T>> f12487impromptu = new HashMap<>();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Handler f12488taiyuan;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class attabal implements impassible, androidx.media3.exoplayer.drm.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final T f12489attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public androidx.media3.exoplayer.drm.saneness.attabal f12490dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public impassible.attabal f12491saneness;

        public attabal(T t) {
            this.f12491saneness = dern.this.molybdenite(null);
            this.f12490dern = dern.this.monoploid(null);
            this.f12489attabal = t;
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void adultoid(int i, formularize.saneness sanenessVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.impromptu();
            }
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void cord(int i, formularize.saneness sanenessVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.taiyuan();
            }
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void cuirassed(int i, formularize.saneness sanenessVar, Exception exc) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.formularize(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.impassible
        public void dovishness(int i, formularize.saneness sanenessVar, ethene.arytenoidectomy arytenoidectomyVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12491saneness.impromptu(restrictive(arytenoidectomyVar, sanenessVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void gintrap(int i, formularize.saneness sanenessVar, int i2) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.apical(i2);
            }
        }

        @Override // androidx.media3.exoplayer.source.impassible
        public void kattegat(int i, formularize.saneness sanenessVar, ethene.kowloon kowloonVar, ethene.arytenoidectomy arytenoidectomyVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12491saneness.arytenoidectomy(kowloonVar, restrictive(arytenoidectomyVar, sanenessVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.impassible
        public void molybdenite(int i, formularize.saneness sanenessVar, ethene.kowloon kowloonVar, ethene.arytenoidectomy arytenoidectomyVar, IOException iOException, boolean z) {
            if (supplicat(i, sanenessVar)) {
                this.f12491saneness.triweekly(kowloonVar, restrictive(arytenoidectomyVar, sanenessVar), iOException, z);
            }
        }

        @Override // androidx.media3.exoplayer.source.impassible
        public void oilcan(int i, formularize.saneness sanenessVar, ethene.kowloon kowloonVar, ethene.arytenoidectomy arytenoidectomyVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12491saneness.cutely(kowloonVar, restrictive(arytenoidectomyVar, sanenessVar));
            }
        }

        public final ethene.arytenoidectomy restrictive(ethene.arytenoidectomy arytenoidectomyVar, formularize.saneness sanenessVar) {
            long jTrm = dern.this.trm(this.f12489attabal, arytenoidectomyVar.f26007beachfront, sanenessVar);
            long jTrm2 = dern.this.trm(this.f12489attabal, arytenoidectomyVar.f26008competently, sanenessVar);
            return (jTrm == arytenoidectomyVar.f26007beachfront && jTrm2 == arytenoidectomyVar.f26008competently) ? arytenoidectomyVar : new ethene.arytenoidectomy(arytenoidectomyVar.f26006attabal, arytenoidectomyVar.f26011saneness, arytenoidectomyVar.f26009dern, arytenoidectomyVar.f26012wireman, arytenoidectomyVar.f26010marial, jTrm, jTrm2);
        }

        @Override // androidx.media3.exoplayer.source.impassible
        public void rotuma(int i, formularize.saneness sanenessVar, ethene.kowloon kowloonVar, ethene.arytenoidectomy arytenoidectomyVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12491saneness.formularize(kowloonVar, restrictive(arytenoidectomyVar, sanenessVar));
            }
        }

        public final boolean supplicat(int i, formularize.saneness sanenessVar) {
            formularize.saneness sanenessVarStratoscope;
            if (sanenessVar != null) {
                sanenessVarStratoscope = dern.this.stratoscope(this.f12489attabal, sanenessVar);
                if (sanenessVarStratoscope == null) {
                    return false;
                }
            } else {
                sanenessVarStratoscope = null;
            }
            int iOilcan = dern.this.oilcan(this.f12489attabal, i);
            impassible.attabal attabalVar = this.f12491saneness;
            if (attabalVar.f12575attabal != iOilcan || !grimness.dern(attabalVar.f12577saneness, sanenessVarStratoscope)) {
                this.f12491saneness = dern.this.polloi(iOilcan, sanenessVarStratoscope);
            }
            androidx.media3.exoplayer.drm.saneness.attabal attabalVar2 = this.f12490dern;
            if (attabalVar2.f11869attabal == iOilcan && grimness.dern(attabalVar2.f11871saneness, sanenessVarStratoscope)) {
                return true;
            }
            this.f12490dern = dern.this.arytenoidectomy(iOilcan, sanenessVarStratoscope);
            return true;
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void trm(int i, formularize.saneness sanenessVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.cutely();
            }
        }

        @Override // androidx.media3.exoplayer.drm.saneness
        public void yemenite(int i, formularize.saneness sanenessVar) {
            if (supplicat(i, sanenessVar)) {
                this.f12490dern.impassible();
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class saneness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final formularize f12493attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final dern<T>.attabal f12494dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final formularize.dern f12495saneness;

        public saneness(formularize formularizeVar, formularize.dern dernVar, dern<T>.attabal attabalVar) {
            this.f12493attabal = formularizeVar;
            this.f12495saneness = dernVar;
            this.f12494dern = attabalVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void adultoid() {
        for (saneness<T> sanenessVar : this.f12487impromptu.values()) {
            sanenessVar.f12493attabal.competently(sanenessVar.f12495saneness);
        }
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void cord() {
        for (saneness<T> sanenessVar : this.f12487impromptu.values()) {
            sanenessVar.f12493attabal.taiyuan(sanenessVar.f12495saneness);
            sanenessVar.f12493attabal.saneness(sanenessVar.f12494dern);
            sanenessVar.f12493attabal.marial(sanenessVar.f12494dern);
        }
        this.f12487impromptu.clear();
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void graveside() {
        for (saneness<T> sanenessVar : this.f12487impromptu.values()) {
            sanenessVar.f12493attabal.cutely(sanenessVar.f12495saneness);
        }
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<saneness<T>> it = this.f12487impromptu.values().iterator();
        while (it.hasNext()) {
            it.next().f12493attabal.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void rotuma(vir.arytenoidectomy arytenoidectomyVar) {
        this.f12486cutely = arytenoidectomyVar;
        this.f12488taiyuan = grimness.cord();
    }

    public final void sealless(final T t, formularize formularizeVar) {
        decarock.attabal.attabal(!this.f12487impromptu.containsKey(t));
        formularize.dern dernVar = new formularize.dern() { // from class: ethene.dern
            @Override // androidx.media3.exoplayer.source.formularize.dern
            public final void attabal(androidx.media3.exoplayer.source.formularize formularizeVar2, androidx.media3.common.oilcan oilcanVar) {
                this.f26020attabal.yemenite(t, formularizeVar2, oilcanVar);
            }
        };
        attabal attabalVar = new attabal(t);
        this.f12487impromptu.put(t, new saneness<>(formularizeVar, dernVar, attabalVar));
        formularizeVar.attabal((Handler) decarock.attabal.marial(this.f12488taiyuan), attabalVar);
        formularizeVar.wireman((Handler) decarock.attabal.marial(this.f12488taiyuan), attabalVar);
        formularizeVar.triweekly(dernVar, this.f12486cutely, dovishness());
        if (gintrap()) {
            return;
        }
        formularizeVar.cutely(dernVar);
    }

    public abstract formularize.saneness stratoscope(T t, formularize.saneness sanenessVar);

    public abstract void yemenite(T t, formularize formularizeVar, oilcan oilcanVar);

    public int oilcan(T t, int i) {
        return i;
    }

    public long trm(T t, long j, formularize.saneness sanenessVar) {
        return j;
    }
}
