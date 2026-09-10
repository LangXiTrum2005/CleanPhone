package androidx.media3.exoplayer.source;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ProgressiveMediaPeriod f6481Y;

    public /* synthetic */ h(ProgressiveMediaPeriod progressiveMediaPeriod, int i2) {
        this.X = i2;
        this.f6481Y = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressiveMediaPeriod progressiveMediaPeriod = this.f6481Y;
        switch (this.X) {
            case 0:
                progressiveMediaPeriod.I0 = true;
                break;
            case 1:
                Map map = ProgressiveMediaPeriod.P0;
                progressiveMediaPeriod.m();
                break;
            default:
                if (!progressiveMediaPeriod.O0) {
                    MediaPeriod.Callback callback = progressiveMediaPeriod.s0;
                    callback.getClass();
                    callback.e(progressiveMediaPeriod);
                }
                break;
        }
    }
}
