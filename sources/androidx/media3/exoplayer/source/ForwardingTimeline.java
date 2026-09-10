package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingTimeline extends Timeline {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timeline f6366b;

    public ForwardingTimeline(Timeline timeline) {
        this.f6366b = timeline;
    }

    @Override // androidx.media3.common.Timeline
    public final int a(boolean z2) {
        return this.f6366b.a(z2);
    }

    @Override // androidx.media3.common.Timeline
    public int b(Object obj) {
        return this.f6366b.b(obj);
    }

    @Override // androidx.media3.common.Timeline
    public final int c(boolean z2) {
        return this.f6366b.c(z2);
    }

    @Override // androidx.media3.common.Timeline
    public int e(int i2, int i3, boolean z2) {
        return this.f6366b.e(i2, i3, z2);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        return this.f6366b.f(i2, period, z2);
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return this.f6366b.h();
    }

    @Override // androidx.media3.common.Timeline
    public int k(int i2, int i3, boolean z2) {
        return this.f6366b.k(i2, i3, z2);
    }

    @Override // androidx.media3.common.Timeline
    public Object l(int i2) {
        return this.f6366b.l(i2);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Window m(int i2, Timeline.Window window, long j) {
        return this.f6366b.m(i2, window, j);
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return this.f6366b.o();
    }
}
