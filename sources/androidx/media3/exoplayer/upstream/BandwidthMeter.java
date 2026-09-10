package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f6553a = new CopyOnWriteArrayList();

            public static final class HandlerAndListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f6554a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final EventListener f6555b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f6556c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f6554a = handler;
                    this.f6555b = eventListener;
                }
            }
        }

        void onBandwidthSample(int i2, long j, long j2);
    }

    TransferListener a();

    void b(EventListener eventListener);

    void d(Handler handler, EventListener eventListener);
}
