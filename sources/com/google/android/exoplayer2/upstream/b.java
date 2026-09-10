package com.google.android.exoplayer2.upstream;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultBandwidthMeter f18827a;

    @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
    public final void a(int i2) {
        DefaultBandwidthMeter defaultBandwidthMeter = this.f18827a;
        ImmutableList immutableList = DefaultBandwidthMeter.f18758n;
        synchronized (defaultBandwidthMeter) {
            int i3 = defaultBandwidthMeter.f18765i;
            if (i3 == 0 || defaultBandwidthMeter.f18763e) {
                if (i3 == i2) {
                    return;
                }
                defaultBandwidthMeter.f18765i = i2;
                if (i2 != 1 && i2 != 0 && i2 != 8) {
                    defaultBandwidthMeter.f18766l = defaultBandwidthMeter.g(i2);
                    defaultBandwidthMeter.d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    defaultBandwidthMeter.h(defaultBandwidthMeter.f > 0 ? (int) (jElapsedRealtime - defaultBandwidthMeter.g) : 0, defaultBandwidthMeter.f18764h, defaultBandwidthMeter.f18766l);
                    defaultBandwidthMeter.g = jElapsedRealtime;
                    defaultBandwidthMeter.f18764h = 0L;
                    defaultBandwidthMeter.k = 0L;
                    defaultBandwidthMeter.j = 0L;
                    SlidingPercentile slidingPercentile = defaultBandwidthMeter.f18762c;
                    slidingPercentile.f18810b.clear();
                    slidingPercentile.d = -1;
                    slidingPercentile.f18812e = 0;
                    slidingPercentile.f = 0;
                }
            }
        }
    }
}
