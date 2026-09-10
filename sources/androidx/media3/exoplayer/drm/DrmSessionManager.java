package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DrmSessionManager f6229a = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.DrmSessionManager$1, reason: invalid class name */
    public class AnonymousClass1 implements DrmSessionManager {
        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final void a(Looper looper, PlayerId playerId) {
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final DrmSession b(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.q == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public final int c(Format format) {
            return format.q != null ? 1 : 0;
        }
    }

    public interface DrmSessionReference {
        public static final I.a L8 = new I.a(18);

        void release();
    }

    void a(Looper looper, PlayerId playerId);

    DrmSession b(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    int c(Format format);

    default DrmSessionReference d(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionReference.L8;
    }

    default void prepare() {
    }

    default void release() {
    }
}
