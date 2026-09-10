package com.google.android.exoplayer2.drm;

import A.RunnableC0914v;
import android.os.Handler;
import com.applovin.impl.H0;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f17477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f17478c;

        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f17479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f17480b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f17478c = copyOnWriteArrayList;
            this.f17476a = i2;
            this.f17477b = mediaPeriodId;
        }

        public final void a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            handler.getClass();
            ListenerAndHandler listenerAndHandler = new ListenerAndHandler();
            listenerAndHandler.f17479a = handler;
            listenerAndHandler.f17480b = drmSessionEventListener;
            this.f17478c.add(listenerAndHandler);
        }

        public final void b() {
            for (ListenerAndHandler listenerAndHandler : this.f17478c) {
                Util.E(listenerAndHandler.f17479a, new b(2, this, listenerAndHandler.f17480b));
            }
        }

        public final void c() {
            for (ListenerAndHandler listenerAndHandler : this.f17478c) {
                Util.E(listenerAndHandler.f17479a, new b(1, this, listenerAndHandler.f17480b));
            }
        }

        public final void d(int i2) {
            for (ListenerAndHandler listenerAndHandler : this.f17478c) {
                Util.E(listenerAndHandler.f17479a, new RunnableC0914v(this, listenerAndHandler.f17480b, i2, 4));
            }
        }

        public final void e(Exception exc) {
            for (ListenerAndHandler listenerAndHandler : this.f17478c) {
                Util.E(listenerAndHandler.f17479a, new H0(this, listenerAndHandler.f17480b, exc, 9));
            }
        }

        public final void f() {
            for (ListenerAndHandler listenerAndHandler : this.f17478c) {
                Util.E(listenerAndHandler.f17479a, new b(0, this, listenerAndHandler.f17480b));
            }
        }

        public final void g(DrmSessionEventListener drmSessionEventListener) {
            CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList = this.f17478c;
            for (ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
                if (listenerAndHandler.f17480b == drmSessionEventListener) {
                    copyOnWriteArrayList.remove(listenerAndHandler);
                }
            }
        }
    }

    default void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void M(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
    }

    default void N(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
