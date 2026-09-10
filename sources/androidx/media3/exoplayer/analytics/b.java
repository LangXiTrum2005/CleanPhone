package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f6041Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ b(int i2, long j, AnalyticsListener.EventTime eventTime) {
        this.X = 0;
        this.f6041Y = eventTime;
        this.Z = i2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.G(this.f6041Y, this.Z);
                break;
            case 1:
                AnalyticsListener.EventTime eventTime = this.f6041Y;
                analyticsListener.getClass();
                analyticsListener.t(eventTime, this.Z);
                break;
            case 2:
                analyticsListener.o(this.f6041Y, this.Z);
                break;
            case 3:
                analyticsListener.q(this.f6041Y, this.Z);
                break;
            case 4:
                analyticsListener.E(this.f6041Y, this.Z);
                break;
            case 5:
                analyticsListener.w(this.f6041Y, this.Z);
                break;
            default:
                analyticsListener.K(this.f6041Y, this.Z);
                break;
        }
    }

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        this.X = i3;
        this.f6041Y = eventTime;
        this.Z = i2;
    }

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2) {
        this.X = 3;
        this.f6041Y = eventTime;
        this.Z = i2;
    }
}
