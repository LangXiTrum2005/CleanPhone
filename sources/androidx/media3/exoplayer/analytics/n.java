package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f6053Y;
    public final /* synthetic */ AudioSink.AudioTrackConfig Z;

    public /* synthetic */ n(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i2) {
        this.X = i2;
        this.f6053Y = eventTime;
        this.Z = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.y(this.f6053Y, this.Z);
                break;
            default:
                analyticsListener.C(this.f6053Y, this.Z);
                break;
        }
    }
}
