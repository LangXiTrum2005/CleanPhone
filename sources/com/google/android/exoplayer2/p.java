package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f18300Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f18300Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MediaPeriodQueue mediaPeriodQueue = (MediaPeriodQueue) this.f18300Y;
                mediaPeriodQueue.getClass();
                mediaPeriodQueue.f17153c.G(((ImmutableList.Builder) this.Z).j(), (MediaSource.MediaPeriodId) this.e0);
                break;
            case 1:
                AnalyticsCollector analyticsCollector = ((MediaSourceList.ForwardingEventListener) this.f18300Y).f17165Y.f17162h;
                Pair pair = (Pair) this.Z;
                analyticsCollector.q(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, (MediaLoadData) this.e0);
                break;
            default:
                AnalyticsCollector analyticsCollector2 = ((MediaSourceList.ForwardingEventListener) this.f18300Y).f17165Y.f17162h;
                Pair pair2 = (Pair) this.Z;
                analyticsCollector2.E(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, (Exception) this.e0);
                break;
        }
    }
}
