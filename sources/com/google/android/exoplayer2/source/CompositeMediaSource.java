package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    public final HashMap i0 = new HashMap();
    public Handler j0;
    public TransferListener k0;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public MediaSourceEventListener.EventDispatcher f18321Y;
        public DrmSessionEventListener.EventDispatcher Z;

        public ForwardingEventListener(Object obj) {
            this.f18321Y = new MediaSourceEventListener.EventDispatcher(CompositeMediaSource.this.Z.f18353c, 0, null);
            this.Z = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.e0.f17478c, 0, null);
            this.X = obj;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (m(i2, mediaPeriodId)) {
                this.Z.e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.b();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void L(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f18321Y.d(loadEventInfo, r(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void M(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (m(i2, mediaPeriodId)) {
                this.Z.d(i3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.f();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            if (m(i2, mediaPeriodId)) {
                this.f18321Y.e(loadEventInfo, r(mediaLoadData), iOException, z2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m(i2, mediaPeriodId)) {
                this.Z.c();
            }
        }

        public final boolean m(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdW;
            Object obj = this.X;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            if (mediaPeriodId != null) {
                mediaPeriodIdW = compositeMediaSource.W(obj, mediaPeriodId);
                if (mediaPeriodIdW == null) {
                    return false;
                }
            } else {
                mediaPeriodIdW = null;
            }
            int iY = compositeMediaSource.Y(obj, i2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f18321Y;
            if (eventDispatcher.f18351a != iY || !Util.a(eventDispatcher.f18352b, mediaPeriodIdW)) {
                this.f18321Y = new MediaSourceEventListener.EventDispatcher(compositeMediaSource.Z.f18353c, iY, mediaPeriodIdW);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.Z;
            if (eventDispatcher2.f17476a == iY && Util.a(eventDispatcher2.f17477b, mediaPeriodIdW)) {
                return true;
            }
            this.Z = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.e0.f17478c, iY, mediaPeriodIdW);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void q(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f18321Y.b(r(mediaLoadData));
            }
        }

        public final MediaLoadData r(MediaLoadData mediaLoadData) {
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            Object obj = this.X;
            long j = mediaLoadData.f18345e;
            long jX = compositeMediaSource.X(obj, j);
            long j2 = mediaLoadData.f;
            long jX2 = compositeMediaSource.X(obj, j2);
            if (jX == j && jX2 == j2) {
                return mediaLoadData;
            }
            return new MediaLoadData(mediaLoadData.f18342a, mediaLoadData.f18343b, mediaLoadData.f18344c, mediaLoadData.d, jX, jX2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void t(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f18321Y.c(loadEventInfo, r(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void v(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m(i2, mediaPeriodId)) {
                this.f18321Y.f(loadEventInfo, r(mediaLoadData));
            }
        }
    }

    public static final class MediaSourceAndListener<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource f18322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f18323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ForwardingEventListener f18324c;

        public MediaSourceAndListener(MediaSource mediaSource, a aVar, ForwardingEventListener forwardingEventListener) {
            this.f18322a = mediaSource;
            this.f18323b = aVar;
            this.f18324c = forwardingEventListener;
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void Q() {
        for (MediaSourceAndListener mediaSourceAndListener : this.i0.values()) {
            mediaSourceAndListener.f18322a.H(mediaSourceAndListener.f18323b);
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void R() {
        for (MediaSourceAndListener mediaSourceAndListener : this.i0.values()) {
            mediaSourceAndListener.f18322a.C(mediaSourceAndListener.f18323b);
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void T(TransferListener transferListener) {
        this.k0 = transferListener;
        this.j0 = Util.l(null);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void V() {
        HashMap map = this.i0;
        for (MediaSourceAndListener mediaSourceAndListener : map.values()) {
            mediaSourceAndListener.f18322a.w(mediaSourceAndListener.f18323b);
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f18324c;
            MediaSource mediaSource = mediaSourceAndListener.f18322a;
            mediaSource.y(forwardingEventListener);
            mediaSource.J(forwardingEventListener);
        }
        map.clear();
    }

    public MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long X(Object obj, long j) {
        return j;
    }

    public int Y(Object obj, int i2) {
        return i2;
    }

    public abstract void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller, com.google.android.exoplayer2.source.a] */
    public final void a0(final Object obj, MediaSource mediaSource) {
        HashMap map = this.i0;
        Assertions.b(!map.containsKey(obj));
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.source.a
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void F(BaseMediaSource baseMediaSource, Timeline timeline) {
                this.X.Z(obj, baseMediaSource, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(obj);
        map.put(obj, new MediaSourceAndListener(mediaSource, r1, forwardingEventListener));
        Handler handler = this.j0;
        handler.getClass();
        mediaSource.x(handler, forwardingEventListener);
        Handler handler2 = this.j0;
        handler2.getClass();
        mediaSource.I(handler2, forwardingEventListener);
        TransferListener transferListener = this.k0;
        PlayerId playerId = this.h0;
        Assertions.e(playerId);
        mediaSource.A(r1, transferListener, playerId);
        if (this.f18315Y.isEmpty()) {
            mediaSource.H(r1);
        }
    }

    public final void b0(MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.i0.remove(mediaPeriodId);
        mediaSourceAndListener.getClass();
        a aVar = mediaSourceAndListener.f18323b;
        MediaSource mediaSource = mediaSourceAndListener.f18322a;
        mediaSource.w(aVar);
        ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f18324c;
        mediaSource.y(forwardingEventListener);
        mediaSource.J(forwardingEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.i0.values().iterator();
        while (it.hasNext()) {
            ((MediaSourceAndListener) it.next()).f18322a.maybeThrowSourceInfoRefreshError();
        }
    }
}
