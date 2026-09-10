package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineLicenseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6244a = 0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.OfflineLicenseHelper$1, reason: invalid class name */
    class AnonymousClass1 implements DrmSessionEventListener {
        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f6244a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            int i3 = OfflineLicenseHelper.f6244a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f6244a;
            throw null;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f5431p = new DrmInitData(new DrmInitData.SchemeData[0]);
        builder.a();
    }
}
