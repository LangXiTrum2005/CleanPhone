package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.polder;
import androidx.media3.common.polloi;
import androidx.media3.exoplayer.arytenoidectomy;
import androidx.media3.exoplayer.kowloon;
import decarock.grimness;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface marial {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Handler f12911attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final marial f12912saneness;

        public attabal(Handler handler, marial marialVar) {
            this.f12911attabal = marialVar != null ? (Handler) decarock.attabal.marial(handler) : null;
            this.f12912saneness = marialVar;
        }

        public static /* synthetic */ void wireman(attabal attabalVar, kowloon kowloonVar) {
            attabalVar.getClass();
            kowloonVar.dern();
            ((marial) grimness.impromptu(attabalVar.f12912saneness)).triweekly(kowloonVar);
        }

        public void apical(final String str, final long j, final long j2) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.triweekly
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15128kowloon.f12912saneness)).onVideoDecoderInitialized(str, j, j2);
                    }
                });
            }
        }

        public void arytenoidectomy(final polloi polloiVar, final arytenoidectomy arytenoidectomyVar) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.adultoid
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15058kowloon.f12912saneness)).impassible(polloiVar, arytenoidectomyVar);
                    }
                });
            }
        }

        public void formularize(final String str) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.gintrap
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15072kowloon.f12912saneness)).wireman(str);
                    }
                });
            }
        }

        public void graveside(final polder polderVar) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.kowloon
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15115kowloon.f12912saneness)).onVideoSizeChanged(polderVar);
                    }
                });
            }
        }

        public void impassible(final kowloon kowloonVar) {
            kowloonVar.dern();
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.dovishness
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.video.marial.attabal.wireman(this.f15070kowloon, kowloonVar);
                    }
                });
            }
        }

        public void kowloon(final kowloon kowloonVar) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.graveside
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15074kowloon.f12912saneness)).competently(kowloonVar);
                    }
                });
            }
        }

        public void molybdenite(final Exception exc) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.molybdenite
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15120kowloon.f12912saneness)).cutely(exc);
                    }
                });
            }
        }

        public void monoploid(final Object obj) {
            if (this.f12911attabal != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f12911attabal.post(new Runnable() { // from class: bluecoat.monoploid
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15122kowloon.f12912saneness)).formularize(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void polloi(final long j, final int i) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.polloi
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15125kowloon.f12912saneness)).monoploid(j, i);
                    }
                });
            }
        }

        public void triweekly(final int i, final long j) {
            Handler handler = this.f12911attabal;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bluecoat.arytenoidectomy
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.marial) grimness.impromptu(this.f15061kowloon.f12912saneness)).onDroppedFrames(i, j);
                    }
                });
            }
        }
    }

    default void competently(kowloon kowloonVar) {
    }

    default void cutely(Exception exc) {
    }

    default void onVideoSizeChanged(polder polderVar) {
    }

    default void triweekly(kowloon kowloonVar) {
    }

    default void wireman(String str) {
    }

    default void formularize(Object obj, long j) {
    }

    default void impassible(polloi polloiVar, arytenoidectomy arytenoidectomyVar) {
    }

    default void monoploid(long j, int i) {
    }

    default void onDroppedFrames(int i, long j) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }
}
