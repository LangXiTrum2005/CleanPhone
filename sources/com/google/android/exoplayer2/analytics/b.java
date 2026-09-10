package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ListenerSet.Event {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f17262Y;
    public final /* synthetic */ Format Z;

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i2) {
        this.X = i2;
        this.f17262Y = eventTime;
        this.Z = format;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f17262Y;
                analyticsListener.getClass();
                analyticsListener.m(eventTime, this.Z);
                break;
            default:
                AnalyticsListener.EventTime eventTime2 = this.f17262Y;
                analyticsListener.getClass();
                analyticsListener.C(eventTime2, this.Z);
                break;
        }
    }
}
