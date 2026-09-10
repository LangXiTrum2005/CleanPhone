package androidx.media3.exoplayer.drm;

import A.RunnableC0887e;
import A.RunnableC0914v;
import android.os.Handler;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f6225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f6226c;

        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f6227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f6228b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f6226c = copyOnWriteArrayList;
            this.f6224a = i2;
            this.f6225b = mediaPeriodId;
        }

        public final void a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            handler.getClass();
            ListenerAndHandler listenerAndHandler = new ListenerAndHandler();
            listenerAndHandler.f6227a = handler;
            listenerAndHandler.f6228b = drmSessionEventListener;
            this.f6226c.add(listenerAndHandler);
        }

        public final void b() {
            for (ListenerAndHandler listenerAndHandler : this.f6226c) {
                Util.L(listenerAndHandler.f6227a, new b(2, this, listenerAndHandler.f6228b));
            }
        }

        public final void c() {
            for (ListenerAndHandler listenerAndHandler : this.f6226c) {
                Util.L(listenerAndHandler.f6227a, new b(1, this, listenerAndHandler.f6228b));
            }
        }

        public final void d(int i2) {
            for (ListenerAndHandler listenerAndHandler : this.f6226c) {
                Util.L(listenerAndHandler.f6227a, new RunnableC0914v(this, listenerAndHandler.f6228b, i2, 1));
            }
        }

        public final void e(Exception exc) {
            for (ListenerAndHandler listenerAndHandler : this.f6226c) {
                Util.L(listenerAndHandler.f6227a, new RunnableC0887e(this, listenerAndHandler.f6228b, exc, 14));
            }
        }

        public final void f() {
            for (ListenerAndHandler listenerAndHandler : this.f6226c) {
                Util.L(listenerAndHandler.f6227a, new b(0, this, listenerAndHandler.f6228b));
            }
        }

        public final void g(DrmSessionEventListener drmSessionEventListener) {
            CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList = this.f6226c;
            for (ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
                if (listenerAndHandler.f6228b == drmSessionEventListener) {
                    copyOnWriteArrayList.remove(listenerAndHandler);
                }
            }
        }
    }

    default void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void D(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
    }

    default void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void S(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
