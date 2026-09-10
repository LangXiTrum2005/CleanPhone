package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: renamed from: androidx.media3.exoplayer.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0920r implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f6335Y;
    public final /* synthetic */ Pair Z;
    public final /* synthetic */ LoadEventInfo e0;
    public final /* synthetic */ MediaLoadData f0;

    public /* synthetic */ RunnableC0920r(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.X = i2;
        this.f6335Y = forwardingEventListener;
        this.Z = pair;
        this.e0 = loadEventInfo;
        this.f0 = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AnalyticsCollector analyticsCollector = this.f6335Y.f5952Y.f5949h;
                Pair pair = this.Z;
                analyticsCollector.J(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, this.e0, this.f0);
                break;
            case 1:
                AnalyticsCollector analyticsCollector2 = this.f6335Y.f5952Y.f5949h;
                Pair pair2 = this.Z;
                analyticsCollector2.z(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, this.e0, this.f0);
                break;
            default:
                AnalyticsCollector analyticsCollector3 = this.f6335Y.f5952Y.f5949h;
                Pair pair3 = this.Z;
                analyticsCollector3.N(((Integer) pair3.first).intValue(), (MediaSource.MediaPeriodId) pair3.second, this.e0, this.f0);
                break;
        }
    }
}
