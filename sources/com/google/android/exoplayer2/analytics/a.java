package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f17261Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, int i2) {
        this.X = i2;
        this.f17261Y = eventTime;
        this.Z = str;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.l(this.f17261Y, this.Z);
                break;
            case 1:
                analyticsListener.i(this.f17261Y, this.Z);
                break;
            case 2:
                analyticsListener.J(this.f17261Y, this.Z);
                break;
            default:
                analyticsListener.b(this.f17261Y, this.Z);
                break;
        }
    }

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i2) {
        this.X = i2;
        this.f17261Y = eventTime;
        this.Z = str;
    }
}
