package com.google.android.exoplayer2.source;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ProgressiveMediaPeriod f18439Y;

    public /* synthetic */ f(ProgressiveMediaPeriod progressiveMediaPeriod, int i2) {
        this.X = i2;
        this.f18439Y = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressiveMediaPeriod progressiveMediaPeriod = this.f18439Y;
        switch (this.X) {
            case 0:
                Map map = ProgressiveMediaPeriod.N0;
                progressiveMediaPeriod.l();
                break;
            case 1:
                if (!progressiveMediaPeriod.M0) {
                    MediaPeriod.Callback callback = progressiveMediaPeriod.r0;
                    callback.getClass();
                    callback.a(progressiveMediaPeriod);
                }
                break;
            default:
                progressiveMediaPeriod.G0 = true;
                break;
        }
    }
}
