package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class MediaSourceList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerId f17158a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSourceListInfoRefreshListener f17161e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsCollector f17162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerWrapper f17163i;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TransferListener f17164l;
    public ShuffleOrder j = new ShuffleOrder.DefaultShuffleOrder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f17160c = new IdentityHashMap();
    public final HashMap d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17159b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final MediaSourceHolder X;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.X = mediaSourceHolder;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new p(this, pairM, exc, 2));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new s(this, pairM, 2));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void L(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new r(this, pairM, loadEventInfo, mediaLoadData, 0));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void M(int i2, MediaSource.MediaPeriodId mediaPeriodId, final int i3) {
            final Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new Runnable() { // from class: com.google.android.exoplayer2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.f17162h;
                        Pair pair = pairM;
                        analyticsCollector.M(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i3);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new s(this, pairM, 0));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z2) {
            final Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new Runnable() { // from class: com.google.android.exoplayer2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.f17162h;
                        Pair pair = pairM;
                        analyticsCollector.O(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new s(this, pairM, 1));
            }
        }

        public final Pair m(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdB;
            MediaSourceHolder mediaSourceHolder = this.X;
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= mediaSourceHolder.f17171c.size()) {
                        mediaPeriodIdB = null;
                        break;
                    }
                    if (((MediaSource.MediaPeriodId) mediaSourceHolder.f17171c.get(i3)).d == mediaPeriodId.d) {
                        Object obj = mediaSourceHolder.f17170b;
                        int i4 = AbstractConcatenatedTimeline.e0;
                        mediaPeriodIdB = mediaPeriodId.b(Pair.create(obj, mediaPeriodId.f18347a));
                        break;
                    }
                    i3++;
                }
                if (mediaPeriodIdB == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdB;
            }
            return Pair.create(Integer.valueOf(i2 + mediaSourceHolder.d), mediaPeriodId2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void q(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new p(this, pairM, mediaLoadData, 1));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void t(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new r(this, pairM, loadEventInfo, mediaLoadData, 2));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public final void v(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f17163i.post(new r(this, pairM, loadEventInfo, mediaLoadData, 1));
            }
        }
    }

    public static final class MediaSourceAndListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource f17166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f17167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ForwardingEventListener f17168c;

        public MediaSourceAndListener(MediaSource mediaSource, q qVar, ForwardingEventListener forwardingEventListener) {
            this.f17166a = mediaSource;
            this.f17167b = qVar;
            this.f17168c = forwardingEventListener;
        }
    }

    public static final class MediaSourceHolder implements MediaSourceInfoHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MaskingMediaSource f17169a;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17172e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f17171c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17170b = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z2) {
            this.f17169a = new MaskingMediaSource(mediaSource, z2);
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Object a() {
            return this.f17170b;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Timeline b() {
            return this.f17169a.p0;
        }
    }

    public interface MediaSourceListInfoRefreshListener {
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.f17158a = playerId;
        this.f17161e = mediaSourceListInfoRefreshListener;
        this.f17162h = analyticsCollector;
        this.f17163i = handlerWrapper;
    }

    public final Timeline a(int i2, ArrayList arrayList, ShuffleOrder shuffleOrder) {
        if (!arrayList.isEmpty()) {
            this.j = shuffleOrder;
            for (int i3 = i2; i3 < arrayList.size() + i2; i3++) {
                MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i3 - i2);
                ArrayList arrayList2 = this.f17159b;
                if (i3 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) arrayList2.get(i3 - 1);
                    mediaSourceHolder.d = mediaSourceHolder2.f17169a.p0.f18333Y.o() + mediaSourceHolder2.d;
                    mediaSourceHolder.f17172e = false;
                    mediaSourceHolder.f17171c.clear();
                } else {
                    mediaSourceHolder.d = 0;
                    mediaSourceHolder.f17172e = false;
                    mediaSourceHolder.f17171c.clear();
                }
                int iO = mediaSourceHolder.f17169a.p0.f18333Y.o();
                for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                    ((MediaSourceHolder) arrayList2.get(i4)).d += iO;
                }
                arrayList2.add(i3, mediaSourceHolder);
                this.d.put(mediaSourceHolder.f17170b, mediaSourceHolder);
                if (this.k) {
                    e(mediaSourceHolder);
                    if (this.f17160c.isEmpty()) {
                        this.g.add(mediaSourceHolder);
                    } else {
                        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                        if (mediaSourceAndListener != null) {
                            mediaSourceAndListener.f17166a.H(mediaSourceAndListener.f17167b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final Timeline b() {
        ArrayList arrayList = this.f17159b;
        if (arrayList.isEmpty()) {
            return Timeline.X;
        }
        int iO = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i2);
            mediaSourceHolder.d = iO;
            iO += mediaSourceHolder.f17169a.p0.f18333Y.o();
        }
        return new PlaylistTimeline(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) it.next();
            if (mediaSourceHolder.f17171c.isEmpty()) {
                MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                if (mediaSourceAndListener != null) {
                    mediaSourceAndListener.f17166a.H(mediaSourceAndListener.f17167b);
                }
                it.remove();
            }
        }
    }

    public final void d(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.f17172e && mediaSourceHolder.f17171c.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.remove(mediaSourceHolder);
            mediaSourceAndListener.getClass();
            q qVar = mediaSourceAndListener.f17167b;
            MediaSource mediaSource = mediaSourceAndListener.f17166a;
            mediaSource.w(qVar);
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f17168c;
            mediaSource.y(forwardingEventListener);
            mediaSource.J(forwardingEventListener);
            this.g.remove(mediaSourceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.q, com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.f17169a;
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.q
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void F(BaseMediaSource baseMediaSource, Timeline timeline) {
                ((ExoPlayerImplInternal) this.X.f17161e).i0.sendEmptyMessage(22);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.f.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, r1, forwardingEventListener));
        maskingMediaSource.x(Util.m(null), forwardingEventListener);
        maskingMediaSource.e0.a(Util.m(null), forwardingEventListener);
        maskingMediaSource.A(r1, this.f17164l, this.f17158a);
    }

    public final void f(MediaPeriod mediaPeriod) {
        IdentityHashMap identityHashMap = this.f17160c;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) identityHashMap.remove(mediaPeriod);
        mediaSourceHolder.getClass();
        mediaSourceHolder.f17169a.B(mediaPeriod);
        mediaSourceHolder.f17171c.remove(((MaskingMediaPeriod) mediaPeriod).X);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(mediaSourceHolder);
    }

    public final void g(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            ArrayList arrayList = this.f17159b;
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.remove(i4);
            this.d.remove(mediaSourceHolder.f17170b);
            int i5 = -mediaSourceHolder.f17169a.p0.f18333Y.o();
            for (int i6 = i4; i6 < arrayList.size(); i6++) {
                ((MediaSourceHolder) arrayList.get(i6)).d += i5;
            }
            mediaSourceHolder.f17172e = true;
            if (this.k) {
                d(mediaSourceHolder);
            }
        }
    }
}
