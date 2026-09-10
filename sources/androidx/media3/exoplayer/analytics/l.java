package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6051Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ l(int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.X = i3;
        this.Z = obj;
        this.f6051Y = i2;
        this.e0 = obj2;
        this.f0 = obj3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.Z;
                analyticsListener.getClass();
                analyticsListener.s(eventTime, (Player.PositionInfo) this.e0, (Player.PositionInfo) this.f0, this.f6051Y);
                break;
            default:
                com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener2 = (com.google.android.exoplayer2.analytics.AnalyticsListener) obj;
                com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime2 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.Z;
                analyticsListener2.getClass();
                analyticsListener2.I(eventTime2, (com.google.android.exoplayer2.Player.PositionInfo) this.e0, (com.google.android.exoplayer2.Player.PositionInfo) this.f0, this.f6051Y);
                break;
        }
    }
}
