package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6052Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ m(int i2, int i3, int i4, Object obj) {
        this.X = i4;
        this.e0 = obj;
        this.f6052Y = i2;
        this.Z = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).r((AnalyticsListener.EventTime) this.e0, this.f6052Y, this.Z);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).n((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.e0, this.f6052Y, this.Z);
                break;
        }
    }
}
