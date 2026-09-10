package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6592Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long e0;

    public /* synthetic */ a(BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener, int i2, long j, long j2) {
        this.X = handlerAndListener;
        this.f6592Y = i2;
        this.Z = j;
        this.e0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener = this.X;
        handlerAndListener.f6555b.onBandwidthSample(this.f6592Y, this.Z, this.e0);
    }
}
