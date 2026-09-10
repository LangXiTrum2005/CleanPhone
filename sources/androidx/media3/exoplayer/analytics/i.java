package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6048Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ i(Object obj, int i2, long j, long j2, int i3) {
        this.X = i3;
        this.f0 = obj;
        this.f6048Y = i2;
        this.Z = j;
        this.e0 = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).x((AnalyticsListener.EventTime) this.f0, this.f6048Y, this.Z, this.e0);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).y((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f0, this.f6048Y, this.Z, this.e0);
                break;
        }
    }
}
