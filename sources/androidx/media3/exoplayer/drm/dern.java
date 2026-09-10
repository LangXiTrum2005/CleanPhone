package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.polloi;
import incorrectly.ctenidium;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public interface dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f11863attabal = new attabal();

    DrmSession dern(androidx.media3.exoplayer.drm.saneness.attabal attabalVar, polloi polloiVar);

    default saneness marial(androidx.media3.exoplayer.drm.saneness.attabal attabalVar, polloi polloiVar) {
        return saneness.f11864attabal;
    }

    void saneness(Looper looper, ctenidium ctenidiumVar);

    int wireman(polloi polloiVar);

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f11864attabal = new saneness() { // from class: puffin.arytenoidectomy
            @Override // androidx.media3.exoplayer.drm.dern.saneness
            public final void release() {
                androidx.media3.exoplayer.drm.dern.saneness.attabal();
            }
        };

        void release();

        static /* synthetic */ void attabal() {
        }
    }

    default void attabal() {
    }

    default void release() {
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class attabal implements dern {
        @Override // androidx.media3.exoplayer.drm.dern
        public DrmSession dern(androidx.media3.exoplayer.drm.saneness.attabal attabalVar, polloi polloiVar) {
            if (polloiVar.f11208polloi == null) {
                return null;
            }
            return new beachfront(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.dern
        public int wireman(polloi polloiVar) {
            return polloiVar.f11208polloi != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.dern
        public void saneness(Looper looper, ctenidium ctenidiumVar) {
        }
    }
}
