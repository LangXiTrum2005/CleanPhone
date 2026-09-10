package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class MediaSourceList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerId f5945a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSourceListInfoRefreshListener f5948e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsCollector f5949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerWrapper f5950i;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TransferListener f5951l;
    public ShuffleOrder j = new ShuffleOrder.DefaultShuffleOrder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f5947c = new IdentityHashMap();
    public final HashMap d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5946b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final MediaSourceHolder X;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.X = mediaSourceHolder;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new s(this, pairM, 2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void D(int i2, MediaSource.MediaPeriodId mediaPeriodId, final int i3) {
            final Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new Runnable() { // from class: androidx.media3.exoplayer.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.f5949h;
                        Pair pair = pairM;
                        analyticsCollector.D(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i3);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z2) {
            final Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new Runnable() { // from class: androidx.media3.exoplayer.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.f5949h;
                        Pair pair = pairM;
                        analyticsCollector.E(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new p(this, pairM, exc, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void J(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new RunnableC0920r(this, pairM, loadEventInfo, mediaLoadData, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new RunnableC0920r(this, pairM, loadEventInfo, mediaLoadData, 2));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new p(this, pairM, mediaLoadData, 2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new s(this, pairM, 1));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void S(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new s(this, pairM, 0));
            }
        }

        public final Pair m(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdA;
            MediaSourceHolder mediaSourceHolder = this.X;
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= mediaSourceHolder.f5958c.size()) {
                        mediaPeriodIdA = null;
                        break;
                    }
                    if (((MediaSource.MediaPeriodId) mediaSourceHolder.f5958c.get(i3)).d == mediaPeriodId.d) {
                        Object obj = mediaSourceHolder.f5957b;
                        int i4 = AbstractConcatenatedTimeline.d;
                        mediaPeriodIdA = mediaPeriodId.a(Pair.create(obj, mediaPeriodId.f6384a));
                        break;
                    }
                    i3++;
                }
                if (mediaPeriodIdA == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdA;
            }
            return Pair.create(Integer.valueOf(i2 + mediaSourceHolder.d), mediaPeriodId2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void z(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairM = m(i2, mediaPeriodId);
            if (pairM != null) {
                MediaSourceList.this.f5950i.post(new RunnableC0920r(this, pairM, loadEventInfo, mediaLoadData, 1));
            }
        }
    }

    public static final class MediaSourceAndListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource f5953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f5954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ForwardingEventListener f5955c;

        public MediaSourceAndListener(MediaSource mediaSource, q qVar, ForwardingEventListener forwardingEventListener) {
            this.f5953a = mediaSource;
            this.f5954b = qVar;
            this.f5955c = forwardingEventListener;
        }
    }

    public static final class MediaSourceHolder implements MediaSourceInfoHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MaskingMediaSource f5956a;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5959e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f5958c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f5957b = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z2) {
            this.f5956a = new MaskingMediaSource(mediaSource, z2);
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object a() {
            return this.f5957b;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline b() {
            return this.f5956a.p0;
        }
    }

    public interface MediaSourceListInfoRefreshListener {
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.f5945a = playerId;
        this.f5948e = mediaSourceListInfoRefreshListener;
        this.f5949h = analyticsCollector;
        this.f5950i = handlerWrapper;
    }

    public final Timeline a(int i2, ArrayList arrayList, ShuffleOrder shuffleOrder) {
        if (!arrayList.isEmpty()) {
            this.j = shuffleOrder;
            for (int i3 = i2; i3 < arrayList.size() + i2; i3++) {
                MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i3 - i2);
                ArrayList arrayList2 = this.f5946b;
                if (i3 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) arrayList2.get(i3 - 1);
                    mediaSourceHolder.d = mediaSourceHolder2.f5956a.p0.f6366b.o() + mediaSourceHolder2.d;
                    mediaSourceHolder.f5959e = false;
                    mediaSourceHolder.f5958c.clear();
                } else {
                    mediaSourceHolder.d = 0;
                    mediaSourceHolder.f5959e = false;
                    mediaSourceHolder.f5958c.clear();
                }
                int iO = mediaSourceHolder.f5956a.p0.f6366b.o();
                for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                    ((MediaSourceHolder) arrayList2.get(i4)).d += iO;
                }
                arrayList2.add(i3, mediaSourceHolder);
                this.d.put(mediaSourceHolder.f5957b, mediaSourceHolder);
                if (this.k) {
                    e(mediaSourceHolder);
                    if (this.f5947c.isEmpty()) {
                        this.g.add(mediaSourceHolder);
                    } else {
                        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                        if (mediaSourceAndListener != null) {
                            mediaSourceAndListener.f5953a.R(mediaSourceAndListener.f5954b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final Timeline b() {
        ArrayList arrayList = this.f5946b;
        if (arrayList.isEmpty()) {
            return Timeline.f5507a;
        }
        int iO = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i2);
            mediaSourceHolder.d = iO;
            iO += mediaSourceHolder.f5956a.p0.f6366b.o();
        }
        return new PlaylistTimeline(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) it.next();
            if (mediaSourceHolder.f5958c.isEmpty()) {
                MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                if (mediaSourceAndListener != null) {
                    mediaSourceAndListener.f5953a.R(mediaSourceAndListener.f5954b);
                }
                it.remove();
            }
        }
    }

    public final void d(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.f5959e && mediaSourceHolder.f5958c.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.remove(mediaSourceHolder);
            mediaSourceAndListener.getClass();
            q qVar = mediaSourceAndListener.f5954b;
            MediaSource mediaSource = mediaSourceAndListener.f5953a;
            mediaSource.Q(qVar);
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f5955c;
            mediaSource.x(forwardingEventListener);
            mediaSource.F(forwardingEventListener);
            this.g.remove(mediaSourceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.q, androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller] */
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
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.f5956a;
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.q
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void u(BaseMediaSource baseMediaSource, Timeline timeline) {
                HandlerWrapper handlerWrapper = ((ExoPlayerImplInternal) this.X.f5948e).i0;
                handlerWrapper.removeMessages(2);
                handlerWrapper.sendEmptyMessage(22);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.f.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, r1, forwardingEventListener));
        int i2 = Util.f5683a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        maskingMediaSource.v(new Handler(looperMyLooper, null), forwardingEventListener);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        maskingMediaSource.e0.a(new Handler(looperMyLooper2, null), forwardingEventListener);
        maskingMediaSource.I(r1, this.f5951l, this.f5945a);
    }

    public final void f(MediaPeriod mediaPeriod) {
        IdentityHashMap identityHashMap = this.f5947c;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) identityHashMap.remove(mediaPeriod);
        mediaSourceHolder.getClass();
        mediaSourceHolder.f5956a.G(mediaPeriod);
        mediaSourceHolder.f5958c.remove(((MaskingMediaPeriod) mediaPeriod).X);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(mediaSourceHolder);
    }

    public final void g(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            ArrayList arrayList = this.f5946b;
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.remove(i4);
            this.d.remove(mediaSourceHolder.f5957b);
            int i5 = -mediaSourceHolder.f5956a.p0.f6366b.o();
            for (int i6 = i4; i6 < arrayList.size(); i6++) {
                ((MediaSourceHolder) arrayList.get(i6)).d += i5;
            }
            mediaSourceHolder.f5959e = true;
            if (this.k) {
                d(mediaSourceHolder);
            }
        }
    }
}
