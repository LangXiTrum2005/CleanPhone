package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f6049Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ j(Object obj, boolean z2, int i2, int i3) {
        this.X = i3;
        this.e0 = obj;
        this.f6049Y = z2;
        this.Z = i2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).h((AnalyticsListener.EventTime) this.e0, this.f6049Y, this.Z);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).p((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.e0, this.Z, this.f6049Y);
                break;
        }
    }
}
