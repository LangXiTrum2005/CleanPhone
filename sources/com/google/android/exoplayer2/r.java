package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f18301Y;
    public final /* synthetic */ Pair Z;
    public final /* synthetic */ LoadEventInfo e0;
    public final /* synthetic */ MediaLoadData f0;

    public /* synthetic */ r(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.X = i2;
        this.f18301Y = forwardingEventListener;
        this.Z = pair;
        this.e0 = loadEventInfo;
        this.f0 = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AnalyticsCollector analyticsCollector = this.f18301Y.f17165Y.f17162h;
                Pair pair = this.Z;
                analyticsCollector.L(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, this.e0, this.f0);
                break;
            case 1:
                AnalyticsCollector analyticsCollector2 = this.f18301Y.f17165Y.f17162h;
                Pair pair2 = this.Z;
                analyticsCollector2.v(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, this.e0, this.f0);
                break;
            default:
                AnalyticsCollector analyticsCollector3 = this.f18301Y.f17165Y.f17162h;
                Pair pair3 = this.Z;
                analyticsCollector3.t(((Integer) pair3.first).intValue(), (MediaSource.MediaPeriodId) pair3.second, this.e0, this.f0);
                break;
        }
    }
}
