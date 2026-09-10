package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.source.formularize;
import decarock.grimness;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface saneness {

    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11869attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0085attabal> f11870dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final formularize.saneness f11871saneness;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.saneness$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public static final class C0085attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public Handler f11872attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public saneness f11873saneness;

            public C0085attabal(Handler handler, saneness sanenessVar) {
                this.f11872attabal = handler;
                this.f11873saneness = sanenessVar;
            }
        }

        public attabal() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void dern(attabal attabalVar, saneness sanenessVar, int i) {
            sanenessVar.preprohormone(attabalVar.f11869attabal, attabalVar.f11871saneness);
            sanenessVar.gintrap(attabalVar.f11869attabal, attabalVar.f11871saneness, i);
        }

        public void apical(final int i) {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.apical
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal.dern(this.f36009kowloon, sanenessVar, i);
                    }
                });
            }
        }

        public void competently(Handler handler, saneness sanenessVar) {
            decarock.attabal.marial(handler);
            decarock.attabal.marial(sanenessVar);
            this.f11870dern.add(new C0085attabal(handler, sanenessVar));
        }

        public void cutely() {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.triweekly
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal attabalVar = this.f36033kowloon;
                        sanenessVar.trm(attabalVar.f11869attabal, attabalVar.f11871saneness);
                    }
                });
            }
        }

        public void formularize(final Exception exc) {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.cutely
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal attabalVar = this.f36014kowloon;
                        sanenessVar.cuirassed(attabalVar.f11869attabal, attabalVar.f11871saneness, exc);
                    }
                });
            }
        }

        public void impassible() {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.formularize
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal attabalVar = this.f36017kowloon;
                        sanenessVar.yemenite(attabalVar.f11869attabal, attabalVar.f11871saneness);
                    }
                });
            }
        }

        public void impromptu() {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.kowloon
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal attabalVar = this.f36024kowloon;
                        sanenessVar.adultoid(attabalVar.f11869attabal, attabalVar.f11871saneness);
                    }
                });
            }
        }

        public attabal kowloon(int i, formularize.saneness sanenessVar) {
            return new attabal(this.f11870dern, i, sanenessVar);
        }

        public void taiyuan() {
            for (C0085attabal c0085attabal : this.f11870dern) {
                final saneness sanenessVar = c0085attabal.f11873saneness;
                grimness.homozygous(c0085attabal.f11872attabal, new Runnable() { // from class: puffin.impassible
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.saneness.attabal attabalVar = this.f36021kowloon;
                        sanenessVar.cord(attabalVar.f11869attabal, attabalVar.f11871saneness);
                    }
                });
            }
        }

        public void triweekly(saneness sanenessVar) {
            for (C0085attabal c0085attabal : this.f11870dern) {
                if (c0085attabal.f11873saneness == sanenessVar) {
                    this.f11870dern.remove(c0085attabal);
                }
            }
        }

        public attabal(CopyOnWriteArrayList<C0085attabal> copyOnWriteArrayList, int i, formularize.saneness sanenessVar) {
            this.f11870dern = copyOnWriteArrayList;
            this.f11869attabal = i;
            this.f11871saneness = sanenessVar;
        }
    }

    default void adultoid(int i, formularize.saneness sanenessVar) {
    }

    default void cord(int i, formularize.saneness sanenessVar) {
    }

    @Deprecated
    default void preprohormone(int i, formularize.saneness sanenessVar) {
    }

    default void trm(int i, formularize.saneness sanenessVar) {
    }

    default void yemenite(int i, formularize.saneness sanenessVar) {
    }

    default void cuirassed(int i, formularize.saneness sanenessVar, Exception exc) {
    }

    default void gintrap(int i, formularize.saneness sanenessVar, int i2) {
    }
}
