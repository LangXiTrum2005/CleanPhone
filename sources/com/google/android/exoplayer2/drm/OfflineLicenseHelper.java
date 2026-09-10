package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final class OfflineLicenseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17496a = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.OfflineLicenseHelper$1, reason: invalid class name */
    class AnonymousClass1 implements DrmSessionEventListener {
        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            int i3 = OfflineLicenseHelper.f17496a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f17496a;
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f17496a;
            throw null;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f17088n = new DrmInitData(new DrmInitData.SchemeData[0]);
        builder.a();
    }
}
