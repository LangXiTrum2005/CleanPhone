package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f18302Y;
    public final /* synthetic */ Pair Z;

    public /* synthetic */ s(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i2) {
        this.X = i2;
        this.f18302Y = forwardingEventListener;
        this.Z = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AnalyticsCollector analyticsCollector = this.f18302Y.f17165Y.f17162h;
                Pair pair = this.Z;
                analyticsCollector.N(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                break;
            case 1:
                AnalyticsCollector analyticsCollector2 = this.f18302Y.f17165Y.f17162h;
                Pair pair2 = this.Z;
                analyticsCollector2.P(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second);
                break;
            default:
                AnalyticsCollector analyticsCollector3 = this.f18302Y.f17165Y.f17162h;
                Pair pair3 = this.Z;
                analyticsCollector3.K(((Integer) pair3.first).intValue(), (MediaSource.MediaPeriodId) pair3.second);
                break;
        }
    }
}
