package polyfoil;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import vir.arytenoidectomy;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes.dex */
public interface wireman {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface attabal {

        /* JADX INFO: renamed from: polyfoil.wireman$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C0773attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0774attabal> f35608attabal = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: polyfoil.wireman$attabal$attabal$attabal, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            public static final class C0774attabal {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public final Handler f35609attabal;

                /* JADX INFO: renamed from: dern, reason: collision with root package name */
                public boolean f35610dern;

                /* JADX INFO: renamed from: saneness, reason: collision with root package name */
                public final attabal f35611saneness;

                public C0774attabal(Handler handler, attabal attabalVar) {
                    this.f35609attabal = handler;
                    this.f35611saneness = attabalVar;
                }

                public void wireman() {
                    this.f35610dern = true;
                }
            }

            public void dern(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                for (final C0774attabal c0774attabal : this.f35608attabal) {
                    if (c0774attabal.f35610dern) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        c0774attabal.f35609attabal.post(new Runnable() { // from class: polyfoil.dern
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0774attabal.f35611saneness.onBandwidthSample(i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public void saneness(Handler handler, attabal attabalVar) {
                decarock.attabal.marial(handler);
                decarock.attabal.marial(attabalVar);
                wireman(attabalVar);
                this.f35608attabal.add(new C0774attabal(handler, attabalVar));
            }

            public void wireman(attabal attabalVar) {
                for (C0774attabal c0774attabal : this.f35608attabal) {
                    if (c0774attabal.f35611saneness == attabalVar) {
                        c0774attabal.wireman();
                        this.f35608attabal.remove(c0774attabal);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    arytenoidectomy dern();

    void marial(Handler handler, attabal attabalVar);

    void wireman(attabal attabalVar);
}
