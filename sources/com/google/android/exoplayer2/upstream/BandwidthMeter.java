package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f18726a = new CopyOnWriteArrayList();

            public static final class HandlerAndListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f18727a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final EventListener f18728b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f18729c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f18727a = handler;
                    this.f18728b = eventListener;
                }
            }
        }

        void onBandwidthSample(int i2, long j, long j2);
    }

    TransferListener a();

    void b(EventListener eventListener);

    void d(Handler handler, EventListener eventListener);
}
