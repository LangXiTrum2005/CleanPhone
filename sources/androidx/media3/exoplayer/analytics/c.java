package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f6042Y;

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, int i2) {
        this.X = i2;
        this.f6042Y = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.l(this.f6042Y);
                break;
            case 1:
                analyticsListener.c(this.f6042Y);
                break;
            case 2:
                analyticsListener.k(this.f6042Y);
                break;
            case 3:
                analyticsListener.I(this.f6042Y);
                break;
            case 4:
                analyticsListener.H(this.f6042Y);
                break;
            default:
                analyticsListener.O(this.f6042Y);
                break;
        }
    }

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f6042Y = eventTime;
    }
}
