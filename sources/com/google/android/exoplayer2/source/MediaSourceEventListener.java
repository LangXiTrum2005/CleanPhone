package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.applovin.impl.H0;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f18352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f18353c;

        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f18354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f18355b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f18353c = copyOnWriteArrayList;
            this.f18351a = i2;
            this.f18352b = mediaPeriodId;
        }

        public final long a(long j) {
            long J2 = Util.J(j);
            if (J2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return J2;
        }

        public final void b(MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f18353c) {
                Util.E(listenerAndHandler.f18354a, new H0(this, listenerAndHandler.f18355b, mediaLoadData, 10));
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
        public final void c(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f18353c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.E(listenerAndHandler.f18354a, new e(this, listenerAndHandler.f18355b, loadEventInfo2, mediaLoadData, 1));
                loadEventInfo = loadEventInfo2;
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
        public final void d(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f18353c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.E(listenerAndHandler.f18354a, new e(this, listenerAndHandler.f18355b, loadEventInfo2, mediaLoadData, 0));
                loadEventInfo = loadEventInfo2;
            }
        }

        public final void e(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            for (ListenerAndHandler listenerAndHandler : this.f18353c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.E(listenerAndHandler.f18354a, new androidx.media3.exoplayer.source.g(this, listenerAndHandler.f18355b, loadEventInfo2, mediaLoadData, iOException, z2, 1));
                loadEventInfo = loadEventInfo2;
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
        public final void f(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f18353c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.E(listenerAndHandler.f18354a, new e(this, listenerAndHandler.f18355b, loadEventInfo2, mediaLoadData, 2));
                loadEventInfo = loadEventInfo2;
            }
        }
    }

    default void L(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
    }

    default void q(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void t(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void v(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }
}
