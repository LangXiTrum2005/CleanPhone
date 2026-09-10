package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f6046Y;
    public final /* synthetic */ boolean Z;

    public /* synthetic */ g(AnalyticsListener.EventTime eventTime, boolean z2, int i2) {
        this.X = i2;
        this.f6046Y = eventTime;
        this.Z = z2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f6046Y;
                analyticsListener.getClass();
                analyticsListener.a(eventTime, this.Z);
                break;
            case 1:
                analyticsListener.d(this.f6046Y, this.Z);
                break;
            case 2:
                analyticsListener.v(this.f6046Y, this.Z);
                break;
            default:
                analyticsListener.f(this.f6046Y, this.Z);
                break;
        }
    }
}
