package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6044Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ e(Object obj, int i2, long j, long j2, int i3) {
        this.X = i3;
        this.e0 = obj;
        this.f6044Y = i2;
        this.Z = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).F(this.f6044Y, this.Z, (AnalyticsListener.EventTime) this.e0);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).u(this.f6044Y, this.Z, (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.e0);
                break;
        }
    }
}
