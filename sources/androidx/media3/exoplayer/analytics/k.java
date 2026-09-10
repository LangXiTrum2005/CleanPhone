package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ List f6050Y;

    public /* synthetic */ k(Object obj, List list, int i2) {
        this.X = i2;
        this.f6050Y = list;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).getClass();
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).getClass();
                break;
        }
    }
}
