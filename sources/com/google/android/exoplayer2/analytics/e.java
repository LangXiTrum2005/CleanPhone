package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f17265Y;
    public final /* synthetic */ boolean Z;

    public /* synthetic */ e(AnalyticsListener.EventTime eventTime, boolean z2, int i2) {
        this.X = i2;
        this.f17265Y = eventTime;
        this.Z = z2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f17265Y;
                analyticsListener.getClass();
                analyticsListener.K(eventTime, this.Z);
                break;
            case 1:
                analyticsListener.G(this.f17265Y, this.Z);
                break;
            default:
                analyticsListener.o(this.f17265Y, this.Z);
                break;
        }
    }
}
