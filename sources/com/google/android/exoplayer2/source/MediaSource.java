package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaSource {

    public interface Factory {
        MediaSource a(MediaItem mediaItem);
    }

    public static final class MediaPeriodId extends com.google.android.exoplayer2.source.MediaPeriodId {
        public MediaPeriodId(Object obj) {
            super(obj, -1L);
        }

        public final MediaPeriodId b(Object obj) {
            return new MediaPeriodId(this.f18347a.equals(obj) ? this : new com.google.android.exoplayer2.source.MediaPeriodId(obj, this.f18348b, this.f18349c, this.d, this.f18350e));
        }

        public MediaPeriodId(Object obj, long j, int i2) {
            super(obj, -1, -1, j, i2);
        }
    }

    public interface MediaSourceCaller {
        void F(BaseMediaSource baseMediaSource, Timeline timeline);
    }

    void A(MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId);

    void B(MediaPeriod mediaPeriod);

    void C(MediaSourceCaller mediaSourceCaller);

    void H(MediaSourceCaller mediaSourceCaller);

    void I(Handler handler, DrmSessionEventListener drmSessionEventListener);

    void J(DrmSessionEventListener drmSessionEventListener);

    MediaItem m();

    void maybeThrowSourceInfoRefreshError();

    default boolean r() {
        return !(this instanceof ConcatenatingMediaSource);
    }

    default Timeline s() {
        return null;
    }

    MediaPeriod u(MediaPeriodId mediaPeriodId, Allocator allocator, long j);

    void w(MediaSourceCaller mediaSourceCaller);

    void x(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    void y(MediaSourceEventListener mediaSourceEventListener);
}
