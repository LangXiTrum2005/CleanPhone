package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    public final HashMap i0 = new HashMap();
    public Handler j0;
    public TransferListener k0;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public MediaSourceEventListener.EventDispatcher f6347Y;
        public DrmSessionEventListener.EventDispatcher Z;

        public ForwardingEventListener(Object obj) {
            this.f6347Y = new MediaSourceEventListener.EventDispatcher(CompositeMediaSource.this.Z.f6390c, 0, null);
            this.Z = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.e0.f6226c, 0, null);
            this.X = obj;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.b();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void D(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (m(i2, mediaPeriodId)) {
                this.Z.d(i3);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            if (m(i2, mediaPeriodId)) {
                this.f6347Y.d(loadEventInfo, r(mediaLoadData, mediaPeriodId), iOException, z2);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (m(i2, mediaPeriodId)) {
                this.Z.e(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void J(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f6347Y.b(loadEventInfo, r(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f6347Y.c(loadEventInfo, r(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f6347Y.a(r(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.c();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void S(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.f();
            }
        }

        public final boolean m(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdA0;
            Object obj = this.X;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            if (mediaPeriodId != null) {
                mediaPeriodIdA0 = compositeMediaSource.a0(obj, mediaPeriodId);
                if (mediaPeriodIdA0 == null) {
                    return false;
                }
            } else {
                mediaPeriodIdA0 = null;
            }
            int iC0 = compositeMediaSource.c0(obj, i2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f6347Y;
            if (eventDispatcher.f6388a != iC0 || !Util.a(eventDispatcher.f6389b, mediaPeriodIdA0)) {
                this.f6347Y = new MediaSourceEventListener.EventDispatcher(compositeMediaSource.Z.f6390c, iC0, mediaPeriodIdA0);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.Z;
            if (eventDispatcher2.f6224a == iC0 && Util.a(eventDispatcher2.f6225b, mediaPeriodIdA0)) {
                return true;
            }
            this.Z = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.e0.f6226c, iC0, mediaPeriodIdA0);
            return true;
        }

        public final MediaLoadData r(MediaLoadData mediaLoadData, MediaSource.MediaPeriodId mediaPeriodId) {
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            Object obj = this.X;
            long j = mediaLoadData.f6381e;
            long jB0 = compositeMediaSource.b0(obj, j, mediaPeriodId);
            long j2 = mediaLoadData.f;
            long jB1 = compositeMediaSource.b0(obj, j2, mediaPeriodId);
            if (jB0 == j && jB1 == j2) {
                return mediaLoadData;
            }
            return new MediaLoadData(mediaLoadData.f6378a, mediaLoadData.f6379b, mediaLoadData.f6380c, mediaLoadData.d, jB0, jB1);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void z(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f6347Y.e(loadEventInfo, r(mediaLoadData, mediaPeriodId));
            }
        }
    }

    public static final class MediaSourceAndListener<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource f6348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f6349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ForwardingEventListener f6350c;

        public MediaSourceAndListener(MediaSource mediaSource, a aVar, ForwardingEventListener forwardingEventListener) {
            this.f6348a = mediaSource;
            this.f6349b = aVar;
            this.f6350c = forwardingEventListener;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void U() {
        for (MediaSourceAndListener mediaSourceAndListener : this.i0.values()) {
            mediaSourceAndListener.f6348a.R(mediaSourceAndListener.f6349b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void V() {
        for (MediaSourceAndListener mediaSourceAndListener : this.i0.values()) {
            mediaSourceAndListener.f6348a.L(mediaSourceAndListener.f6349b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void X(TransferListener transferListener) {
        this.k0 = transferListener;
        this.j0 = Util.m(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void Z() {
        HashMap map = this.i0;
        for (MediaSourceAndListener mediaSourceAndListener : map.values()) {
            mediaSourceAndListener.f6348a.Q(mediaSourceAndListener.f6349b);
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f6350c;
            MediaSource mediaSource = mediaSourceAndListener.f6348a;
            mediaSource.x(forwardingEventListener);
            mediaSource.F(forwardingEventListener);
        }
        map.clear();
    }

    public MediaSource.MediaPeriodId a0(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long b0(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    public int c0(Object obj, int i2) {
        return i2;
    }

    public abstract void d0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller, androidx.media3.exoplayer.source.a] */
    public final void e0(final Object obj, MediaSource mediaSource) {
        HashMap map = this.i0;
        Assertions.b(!map.containsKey(obj));
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.a
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void u(BaseMediaSource baseMediaSource, Timeline timeline) {
                this.X.d0(obj, baseMediaSource, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(obj);
        map.put(obj, new MediaSourceAndListener(mediaSource, r1, forwardingEventListener));
        Handler handler = this.j0;
        handler.getClass();
        mediaSource.v(handler, forwardingEventListener);
        Handler handler2 = this.j0;
        handler2.getClass();
        mediaSource.C(handler2, forwardingEventListener);
        TransferListener transferListener = this.k0;
        PlayerId playerId = this.h0;
        Assertions.f(playerId);
        mediaSource.I(r1, transferListener, playerId);
        if (this.f6339Y.isEmpty()) {
            mediaSource.R(r1);
        }
    }

    public final void f0(MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.i0.remove(mediaPeriodId);
        mediaSourceAndListener.getClass();
        a aVar = mediaSourceAndListener.f6349b;
        MediaSource mediaSource = mediaSourceAndListener.f6348a;
        mediaSource.Q(aVar);
        ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f6350c;
        mediaSource.x(forwardingEventListener);
        mediaSource.F(forwardingEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.i0.values().iterator();
        while (it.hasNext()) {
            ((MediaSourceAndListener) it.next()).f6348a.maybeThrowSourceInfoRefreshError();
        }
    }
}
