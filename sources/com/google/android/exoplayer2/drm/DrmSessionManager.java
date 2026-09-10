package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.analytics.f;

/* JADX INFO: loaded from: classes3.dex */
public interface DrmSessionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DrmSessionManager f17481a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$1, reason: invalid class name */
    public class AnonymousClass1 implements DrmSessionManager {
        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public final int a(Format format) {
            return format.p0 != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public final void b(Looper looper, PlayerId playerId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public final DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.p0 == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(), 6001));
        }
    }

    public interface DrmSessionReference {
        public static final f P8 = new f(14);

        void release();
    }

    int a(Format format);

    void b(Looper looper, PlayerId playerId);

    DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    default DrmSessionReference d(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionReference.P8;
    }

    default void prepare() {
    }

    default void release() {
    }
}
