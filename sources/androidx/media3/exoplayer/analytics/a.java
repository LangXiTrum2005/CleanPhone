package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f6040Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, int i2) {
        this.X = i2;
        this.f6040Y = eventTime;
        this.Z = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f6040Y;
                analyticsListener.getClass();
                analyticsListener.P(eventTime, this.Z);
                break;
            case 1:
                analyticsListener.D(this.f6040Y, this.Z);
                break;
            case 2:
                AnalyticsListener.EventTime eventTime2 = this.f6040Y;
                analyticsListener.getClass();
                analyticsListener.B(eventTime2, this.Z);
                break;
            default:
                analyticsListener.A(this.f6040Y, this.Z);
                break;
        }
    }

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i2) {
        this.X = i2;
        this.f6040Y = eventTime;
        this.Z = str;
    }
}
