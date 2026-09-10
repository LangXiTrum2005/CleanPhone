package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f17263Y;

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, int i2) {
        this.X = i2;
        this.f17263Y = eventTime;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.t(this.f17263Y);
                break;
            case 1:
                analyticsListener.a(this.f17263Y);
                break;
            case 2:
                analyticsListener.w(this.f17263Y);
                break;
            case 3:
                analyticsListener.z(this.f17263Y);
                break;
            case 4:
                analyticsListener.D(this.f17263Y);
                break;
            default:
                analyticsListener.e(this.f17263Y);
                break;
        }
    }

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f17263Y = eventTime;
    }
}
