package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.HttpMediaDrmCallback;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public final MediaItem i0;
    public final MediaItem.PlaybackProperties j0;
    public final DataSource.Factory k0;
    public final h l0;
    public final DrmSessionManager m0;
    public final DefaultLoadErrorHandlingPolicy n0;
    public final int o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public boolean s0;
    public TransferListener t0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ProgressiveMediaSource$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingTimeline {
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            super.f(i2, period, z2);
            period.g0 = true;
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            super.m(i2, window, j);
            window.l0 = true;
            return window;
        }
    }

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource.Factory f18376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f18377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DefaultDrmSessionManagerProvider f18378c;
        public final DefaultLoadErrorHandlingPolicy d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18379e;

        public Factory(DataSource.Factory factory, DefaultExtractorsFactory defaultExtractorsFactory) {
            h hVar = new h(defaultExtractorsFactory);
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.f18376a = factory;
            this.f18377b = hVar;
            this.f18378c = defaultDrmSessionManagerProvider;
            this.d = defaultLoadErrorHandlingPolicy;
            this.f18379e = 1048576;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public final MediaSource a(MediaItem mediaItem) {
            mediaItem.f17095Y.getClass();
            mediaItem.f17095Y.getClass();
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = this.f18378c;
            defaultDrmSessionManagerProvider.getClass();
            mediaItem.f17095Y.getClass();
            MediaItem.DrmConfiguration drmConfiguration = mediaItem.f17095Y.f17114c;
            if (drmConfiguration == null || Util.f18979a < 18) {
                return new ProgressiveMediaSource(mediaItem, this.f18376a, this.f18377b, DrmSessionManager.f17481a, this.d, this.f18379e);
            }
            synchronized (defaultDrmSessionManagerProvider.f17472a) {
                if (drmConfiguration.equals(defaultDrmSessionManagerProvider.f17473b)) {
                    throw null;
                }
                defaultDrmSessionManagerProvider.f17473b = drmConfiguration;
                DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
                drmConfiguration.getClass();
                new HttpMediaDrmCallback(null, factory);
                throw null;
            }
        }
    }

    public ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, h hVar, DrmSessionManager drmSessionManager, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, int i2) {
        MediaItem.PlaybackProperties playbackProperties = mediaItem.f17095Y;
        playbackProperties.getClass();
        this.j0 = playbackProperties;
        this.i0 = mediaItem;
        this.k0 = factory;
        this.l0 = hVar;
        this.m0 = drmSessionManager;
        this.n0 = defaultLoadErrorHandlingPolicy;
        this.o0 = i2;
        this.p0 = true;
        this.q0 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.w0) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.t0) {
                sampleQueue.h();
                DrmSession drmSession = sampleQueue.f18393h;
                if (drmSession != null) {
                    drmSession.f(sampleQueue.f18392e);
                    sampleQueue.f18393h = null;
                    sampleQueue.g = null;
                }
            }
        }
        progressiveMediaPeriod.l0.d(progressiveMediaPeriod);
        progressiveMediaPeriod.q0.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.r0 = null;
        progressiveMediaPeriod.M0 = true;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        this.t0 = transferListener;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        PlayerId playerId = this.h0;
        Assertions.e(playerId);
        DrmSessionManager drmSessionManager = this.m0;
        drmSessionManager.b(looperMyLooper, playerId);
        drmSessionManager.prepare();
        W();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        this.m0.release();
    }

    public final void W() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.q0, this.r0, this.s0, this.i0);
        if (this.p0) {
            singlePeriodTimeline = new AnonymousClass1(singlePeriodTimeline);
        }
        U(singlePeriodTimeline);
    }

    public final void X(long j, boolean z2, boolean z3) {
        if (j == -9223372036854775807L) {
            j = this.q0;
        }
        if (!this.p0 && this.q0 == j && this.r0 == z2 && this.s0 == z3) {
            return;
        }
        this.q0 = j;
        this.r0 = z2;
        this.s0 = z3;
        this.p0 = false;
        W();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return this.i0;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource dataSourceCreateDataSource = this.k0.createDataSource();
        TransferListener transferListener = this.t0;
        if (transferListener != null) {
            dataSourceCreateDataSource.b(transferListener);
        }
        MediaItem.PlaybackProperties playbackProperties = this.j0;
        Uri uri = playbackProperties.f17112a;
        Assertions.e(this.h0);
        BundledExtractorsAdapter bundledExtractorsAdapter = new BundledExtractorsAdapter(this.l0.f18441a);
        DrmSessionEventListener.EventDispatcher eventDispatcher = new DrmSessionEventListener.EventDispatcher(this.e0.f17478c, 0, mediaPeriodId);
        MediaSourceEventListener.EventDispatcher eventDispatcher2 = new MediaSourceEventListener.EventDispatcher(this.Z.f18353c, 0, mediaPeriodId);
        return new ProgressiveMediaPeriod(uri, dataSourceCreateDataSource, bundledExtractorsAdapter, this.m0, eventDispatcher, this.n0, eventDispatcher2, this, allocator, playbackProperties.f17115e, this.o0);
    }
}
