package androidx.media3.exoplayer.upstream;

import android.os.SystemClock;
import androidx.media3.common.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultBandwidthMeter f6593a;

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void a(int i2) {
        DefaultBandwidthMeter defaultBandwidthMeter = this.f6593a;
        ImmutableList immutableList = DefaultBandwidthMeter.f6561n;
        synchronized (defaultBandwidthMeter) {
            int i3 = defaultBandwidthMeter.m;
            if (i3 == 0 || defaultBandwidthMeter.d) {
                if (i3 == i2) {
                    return;
                }
                defaultBandwidthMeter.m = i2;
                if (i2 != 1 && i2 != 0 && i2 != 8) {
                    defaultBandwidthMeter.k = defaultBandwidthMeter.h(i2);
                    defaultBandwidthMeter.f6565c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = defaultBandwidthMeter.f > 0 ? (int) (jElapsedRealtime - defaultBandwidthMeter.g) : 0;
                    long j = defaultBandwidthMeter.f6567h;
                    long j2 = defaultBandwidthMeter.k;
                    if (i4 != 0 || j != 0 || j2 != defaultBandwidthMeter.f6569l) {
                        defaultBandwidthMeter.f6569l = j2;
                        for (BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : defaultBandwidthMeter.f6564b.f6553a) {
                            if (!handlerAndListener.f6556c) {
                                handlerAndListener.f6554a.post(new a(handlerAndListener, i4, j, j2));
                            }
                        }
                    }
                    defaultBandwidthMeter.g = jElapsedRealtime;
                    defaultBandwidthMeter.f6567h = 0L;
                    defaultBandwidthMeter.j = 0L;
                    defaultBandwidthMeter.f6568i = 0L;
                    SlidingPercentile slidingPercentile = defaultBandwidthMeter.f6566e;
                    slidingPercentile.f6586b.clear();
                    slidingPercentile.d = -1;
                    slidingPercentile.f6588e = 0;
                    slidingPercentile.f = 0;
                }
            }
        }
    }
}
