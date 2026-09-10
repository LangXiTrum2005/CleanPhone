package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.HttpMediaDrmCallback;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.extractor.ExtractorsFactory;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public final DefaultDataSource.Factory i0;
    public final j j0;
    public final DrmSessionManager k0;
    public final DefaultLoadErrorHandlingPolicy l0;
    public final int m0;
    public boolean n0 = true;
    public long o0 = -9223372036854775807L;
    public boolean p0;
    public boolean q0;
    public TransferListener r0;
    public MediaItem s0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.ProgressiveMediaSource$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            super.f(i2, period, z2);
            period.f = true;
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            super.m(i2, window, j);
            window.j = true;
            return window;
        }
    }

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f6413h = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DefaultDataSource.Factory f6414c;
        public final j d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DefaultDrmSessionManagerProvider f6415e;
        public final DefaultLoadErrorHandlingPolicy f;
        public final int g;

        public Factory(DefaultDataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            j jVar = new j(extractorsFactory);
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.f6414c = factory;
            this.d = jVar;
            this.f6415e = defaultDrmSessionManagerProvider;
            this.f = defaultLoadErrorHandlingPolicy;
            this.g = 1048576;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource a(MediaItem mediaItem) {
            mediaItem.f5438b.getClass();
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = this.f6415e;
            defaultDrmSessionManagerProvider.getClass();
            mediaItem.f5438b.getClass();
            MediaItem.DrmConfiguration drmConfiguration = mediaItem.f5438b.f5460c;
            if (drmConfiguration == null) {
                return new ProgressiveMediaSource(mediaItem, this.f6414c, this.d, DrmSessionManager.f6229a, this.f, this.g);
            }
            synchronized (defaultDrmSessionManagerProvider.f6222a) {
                if (drmConfiguration.equals(defaultDrmSessionManagerProvider.f6223b)) {
                    throw null;
                }
                defaultDrmSessionManagerProvider.f6223b = drmConfiguration;
                DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
                drmConfiguration.getClass();
                new HttpMediaDrmCallback(null, factory);
                throw null;
            }
        }
    }

    public ProgressiveMediaSource(MediaItem mediaItem, DefaultDataSource.Factory factory, j jVar, DrmSessionManager drmSessionManager, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, int i2) {
        this.s0 = mediaItem;
        this.i0 = factory;
        this.j0 = jVar;
        this.k0 = drmSessionManager;
        this.l0 = defaultLoadErrorHandlingPolicy;
        this.m0 = i2;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource dataSourceA = this.i0.a();
        TransferListener transferListener = this.r0;
        if (transferListener != null) {
            ((DefaultDataSource) dataSourceA).a(transferListener);
        }
        MediaItem.LocalConfiguration localConfiguration = m().f5438b;
        localConfiguration.getClass();
        Assertions.f(this.h0);
        j jVar = this.j0;
        jVar.getClass();
        int i2 = Factory.f6413h;
        BundledExtractorsAdapter bundledExtractorsAdapter = new BundledExtractorsAdapter(jVar.f6483a);
        DrmSessionEventListener.EventDispatcher eventDispatcher = new DrmSessionEventListener.EventDispatcher(this.e0.f6226c, 0, mediaPeriodId);
        MediaSourceEventListener.EventDispatcher eventDispatcher2 = new MediaSourceEventListener.EventDispatcher(this.Z.f6390c, 0, mediaPeriodId);
        long jI = Util.I(localConfiguration.g);
        return new ProgressiveMediaPeriod(localConfiguration.f5458a, dataSourceA, bundledExtractorsAdapter, this.k0, eventDispatcher, this.l0, eventDispatcher2, this, allocator, localConfiguration.f5461e, this.m0, jI);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.x0) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.u0) {
                sampleQueue.h();
                DrmSession drmSession = sampleQueue.f6429h;
                if (drmSession != null) {
                    drmSession.g(sampleQueue.f6428e);
                    sampleQueue.f6429h = null;
                    sampleQueue.g = null;
                }
            }
        }
        progressiveMediaPeriod.m0.d(progressiveMediaPeriod);
        progressiveMediaPeriod.r0.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.s0 = null;
        progressiveMediaPeriod.O0 = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void M(MediaItem mediaItem) {
        this.s0 = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        this.r0 = transferListener;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        PlayerId playerId = this.h0;
        Assertions.f(playerId);
        DrmSessionManager drmSessionManager = this.k0;
        drmSessionManager.a(looperMyLooper, playerId);
        drmSessionManager.prepare();
        a0();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        this.k0.release();
    }

    public final void a0() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.o0, this.p0, this.q0, m());
        if (this.n0) {
            singlePeriodTimeline = new AnonymousClass1(singlePeriodTimeline);
        }
        Y(singlePeriodTimeline);
    }

    public final void b0(long j, boolean z2, boolean z3) {
        if (j == -9223372036854775807L) {
            j = this.o0;
        }
        if (!this.n0 && this.o0 == j && this.p0 == z2 && this.q0 == z3) {
            return;
        }
        this.o0 = j;
        this.p0 = z2;
        this.q0 = z3;
        this.n0 = false;
        a0();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem m() {
        return this.s0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
