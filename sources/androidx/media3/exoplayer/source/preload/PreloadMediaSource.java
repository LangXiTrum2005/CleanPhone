package androidx.media3.exoplayer.source.preload;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadMediaSource extends WrappingMediaSource {
    public boolean m0;
    public Timeline n0;
    public Pair o0;
    public Pair p0;
    public boolean q0;

    public static final class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource a(MediaItem mediaItem) {
            throw null;
        }
    }

    public static class MediaPeriodKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f6495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f6496b;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.f6495a = mediaPeriodId;
            this.f6496b = Long.valueOf(j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.j0(this.f6495a, mediaPeriodKey.f6495a) && this.f6496b.equals(mediaPeriodKey.f6496b);
        }

        public final int hashCode() {
            MediaSource.MediaPeriodId mediaPeriodId = this.f6495a;
            return this.f6496b.intValue() + ((((((((mediaPeriodId.f6384a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + mediaPeriodId.f6385b) * 31) + mediaPeriodId.f6386c) * 31) + mediaPeriodId.f6387e) * 31);
        }
    }

    public interface PreloadControl {
    }

    public class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void b(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void e(SequenceableLoader sequenceableLoader) {
            throw null;
        }
    }

    public static boolean j0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.f6384a.equals(mediaPeriodId2.f6384a) && mediaPeriodId.f6385b == mediaPeriodId2.f6385b && mediaPeriodId.f6386c == mediaPeriodId2.f6386c && mediaPeriodId.f6387e == mediaPeriodId2.f6387e;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j);
        Pair pair = this.o0;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            Pair pair2 = this.o0;
            pair2.getClass();
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair2.first;
            if (!i0()) {
                return preloadMediaPeriod;
            }
            this.o0 = null;
            this.p0 = new Pair(preloadMediaPeriod, mediaPeriodId);
            return preloadMediaPeriod;
        }
        Pair pair3 = this.o0;
        MediaSource mediaSource = this.l0;
        if (pair3 != null) {
            mediaSource.G(((PreloadMediaPeriod) pair3.first).X);
            this.o0 = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(mediaSource.A(mediaPeriodId, allocator, j));
        if (!i0()) {
            this.o0 = new Pair(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair pair = this.o0;
        if (pair == null || preloadMediaPeriod != pair.first) {
            Pair pair2 = this.p0;
            if (pair2 != null && preloadMediaPeriod == pair2.first) {
                this.p0 = null;
            }
        } else {
            this.o0 = null;
        }
        this.l0.G(preloadMediaPeriod.X);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void W(Timeline timeline) {
        this.n0 = timeline;
        Y(timeline);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        if (i0()) {
            return;
        }
        this.q0 = false;
        this.n0 = null;
        this.m0 = false;
        super.Z();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId g0(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair pair = this.p0;
        if (pair == null) {
            return mediaPeriodId;
        }
        pair.getClass();
        if (!j0(mediaPeriodId, (MediaSource.MediaPeriodId) pair.second)) {
            return mediaPeriodId;
        }
        Pair pair2 = this.p0;
        pair2.getClass();
        return (MediaSource.MediaPeriodId) pair2.second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final void h0() {
        if (i0() && !this.q0) {
            throw null;
        }
        Timeline timeline = this.n0;
        if (timeline != null) {
            W(timeline);
            throw null;
        }
        if (this.m0) {
            return;
        }
        this.m0 = true;
        e0(null, this.l0);
    }

    public final boolean i0() {
        return !this.X.isEmpty();
    }
}
