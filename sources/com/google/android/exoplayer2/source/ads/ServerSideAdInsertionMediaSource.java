package com.google.android.exoplayer2.source.ads;

import android.util.Pair;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    public interface AdPlaybackStateUpdater {
    }

    public static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean[] f18434Y;

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean continueLoading(long j) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void d(MediaPeriod.Callback callback, long j) {
            this.X = callback;
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.f18434Y.length == 0) {
                this.f18434Y = new boolean[sampleStreamArr.length];
            }
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final TrackGroupArray getTrackGroups() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean isLoading() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void maybeThrowPrepareError() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long readDiscontinuity() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long seekToUs(long j) {
            throw null;
        }
    }

    public static final class SampleStreamImpl implements SampleStream {
        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            throw null;
        }
    }

    public static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            super.f(i2, period, true);
            Object obj = period.f17208Y;
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            super.m(i2, window, j);
            f(window.o0, new Timeline.Period(), true);
            throw null;
        }
    }

    public static final class SharedMediaPeriod implements MediaPeriod.Callback {
        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public final void a(SequenceableLoader sequenceableLoader) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            throw null;
        }
    }

    public static void W(MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId == null) {
            return;
        }
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f18347a);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public final void F(BaseMediaSource baseMediaSource, Timeline timeline) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void L(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void M(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void Q() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void R() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        Util.l(null);
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void q(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void t(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        W(mediaPeriodId);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f18347a);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void v(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        W(mediaPeriodId);
        throw null;
    }
}
