package androidx.media3.exoplayer.source;

import A.RunnableC0887e;
import android.os.Handler;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f6389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f6390c;

        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f6391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f6392b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f6390c = copyOnWriteArrayList;
            this.f6388a = i2;
            this.f6389b = mediaPeriodId;
        }

        public final void a(MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f6390c) {
                Util.L(listenerAndHandler.f6391a, new RunnableC0887e(this, listenerAndHandler.f6392b, mediaLoadData, 15));
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
        public final void b(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f6390c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.L(listenerAndHandler.f6391a, new f(this, listenerAndHandler.f6392b, loadEventInfo2, mediaLoadData, 2));
                loadEventInfo = loadEventInfo2;
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
        public final void c(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f6390c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.L(listenerAndHandler.f6391a, new f(this, listenerAndHandler.f6392b, loadEventInfo2, mediaLoadData, 1));
                loadEventInfo = loadEventInfo2;
            }
        }

        public final void d(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            for (ListenerAndHandler listenerAndHandler : this.f6390c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.L(listenerAndHandler.f6391a, new g(this, listenerAndHandler.f6392b, loadEventInfo2, mediaLoadData, iOException, z2, 0));
                loadEventInfo = loadEventInfo2;
            }
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
        public final void e(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.f6390c) {
                LoadEventInfo loadEventInfo2 = loadEventInfo;
                Util.L(listenerAndHandler.f6391a, new f(this, listenerAndHandler.f6392b, loadEventInfo2, mediaLoadData, 0));
                loadEventInfo = loadEventInfo2;
            }
        }
    }

    default void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
    }

    default void J(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void N(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void z(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }
}
