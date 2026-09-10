package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ float f6047Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ h(Object obj, float f, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f6047Y = f;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).u((AnalyticsListener.EventTime) this.Z, this.f6047Y);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).F((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.Z, this.f6047Y);
                break;
        }
    }
}
