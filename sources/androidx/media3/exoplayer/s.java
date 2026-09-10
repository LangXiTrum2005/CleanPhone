package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f6336Y;
    public final /* synthetic */ Pair Z;

    public /* synthetic */ s(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i2) {
        this.X = i2;
        this.f6336Y = forwardingEventListener;
        this.Z = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AnalyticsCollector analyticsCollector = this.f6336Y.f5952Y.f5949h;
                Pair pair = this.Z;
                analyticsCollector.S(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                break;
            case 1:
                AnalyticsCollector analyticsCollector2 = this.f6336Y.f5952Y.f5949h;
                Pair pair2 = this.Z;
                analyticsCollector2.P(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second);
                break;
            default:
                AnalyticsCollector analyticsCollector3 = this.f6336Y.f5952Y.f5949h;
                Pair pair3 = this.Z;
                analyticsCollector3.B(((Integer) pair3.first).intValue(), (MediaSource.MediaPeriodId) pair3.second);
                break;
        }
    }
}
