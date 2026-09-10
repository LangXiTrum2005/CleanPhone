package androidx.media3.exoplayer.source.ads;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    public interface AdPlaybackStateUpdater {
    }

    public static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean[] f6473Y;

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean a(LoadingInfo loadingInfo) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.f6473Y.length == 0) {
                this.f6473Y = new boolean[sampleStreamArr.length];
            }
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void f(MediaPeriod.Callback callback, long j) {
            this.X = callback;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final TrackGroupArray getTrackGroups() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean isLoading() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void maybeThrowPrepareError() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long readDiscontinuity() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long seekToUs(long j) {
            throw null;
        }
    }

    public static final class SampleStreamImpl implements SampleStream {
        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            throw null;
        }
    }

    public static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            super.f(i2, period, true);
            Object obj = period.f5509b;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            super.m(i2, window, j);
            f(window.m, new Timeline.Period(), true);
            throw null;
        }
    }

    public static final class SharedMediaPeriod implements MediaPeriod.Callback {
        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void b(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void e(SequenceableLoader sequenceableLoader) {
        }
    }

    public static void a0(MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId == null) {
            return;
        }
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f6384a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f6384a);
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void D(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void J(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void M(MediaItem mediaItem) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void S(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        a0(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void V() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        Util.m(null);
        synchronized (this) {
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        synchronized (this) {
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem m() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    public final void u(BaseMediaSource baseMediaSource, Timeline timeline) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void z(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a0(mediaPeriodId);
        throw null;
    }
}
