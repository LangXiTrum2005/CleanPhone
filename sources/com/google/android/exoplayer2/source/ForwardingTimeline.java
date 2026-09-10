package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ForwardingTimeline extends Timeline {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Timeline f18333Y;

    public ForwardingTimeline(Timeline timeline) {
        this.f18333Y = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int a(boolean z2) {
        return this.f18333Y.a(z2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int b(Object obj) {
        return this.f18333Y.b(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int c(boolean z2) {
        return this.f18333Y.c(z2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int e(int i2, int i3, boolean z2) {
        return this.f18333Y.e(i2, i3, z2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        return this.f18333Y.f(i2, period, z2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return this.f18333Y.h();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int k(int i2, int i3, boolean z2) {
        return this.f18333Y.k(i2, i3, z2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object l(int i2) {
        return this.f18333Y.l(i2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window m(int i2, Timeline.Window window, long j) {
        return this.f18333Y.m(i2, window, j);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return this.f18333Y.o();
    }
}
