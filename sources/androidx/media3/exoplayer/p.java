package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6334Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f6334Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MediaPeriodQueue mediaPeriodQueue = (MediaPeriodQueue) this.f6334Y;
                mediaPeriodQueue.getClass();
                mediaPeriodQueue.f5938c.w(((ImmutableList.Builder) this.Z).j(), (MediaSource.MediaPeriodId) this.e0);
                break;
            case 1:
                AnalyticsCollector analyticsCollector = ((MediaSourceList.ForwardingEventListener) this.f6334Y).f5952Y.f5949h;
                Pair pair = (Pair) this.Z;
                analyticsCollector.H(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, (Exception) this.e0);
                break;
            default:
                AnalyticsCollector analyticsCollector2 = ((MediaSourceList.ForwardingEventListener) this.f6334Y).f5952Y.f5949h;
                Pair pair2 = (Pair) this.Z;
                analyticsCollector2.O(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, (MediaLoadData) this.e0);
                break;
        }
    }
}
