package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {

    public static final class Builder {
    }

    static {
        ImmutableList.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        ImmutableList.y(1500000L, 980000L, 750000L, 520000L, 290000L);
        ImmutableList.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        ImmutableList.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        ImmutableList.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        ImmutableList.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    }

    public static boolean h(DataSpec dataSpec, boolean z2) {
        if (!z2) {
            return false;
        }
        int i2 = dataSpec.f5740h;
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final TransferListener a() {
        return this;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final synchronized void b(BandwidthMeter.EventListener eventListener) {
        throw null;
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void c(DataSpec dataSpec, boolean z2, int i2) {
        if (h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final synchronized void d(Handler handler, BandwidthMeter.EventListener eventListener) {
        eventListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void e(DataSpec dataSpec, boolean z2) {
        if (h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void f(DataSpec dataSpec, boolean z2) {
        if (h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void g(DataSpec dataSpec, boolean z2) {
        if (h(dataSpec, z2)) {
            throw null;
        }
    }
}
