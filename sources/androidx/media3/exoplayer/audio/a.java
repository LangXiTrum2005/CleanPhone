package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f6187Y;
    public final /* synthetic */ DecoderCounters Z;

    public /* synthetic */ a(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f6187Y = eventDispatcher;
        this.Z = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f6187Y;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.l(this.Z);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.f6187Y;
                DecoderCounters decoderCounters = this.Z;
                eventDispatcher2.getClass();
                synchronized (decoderCounters) {
                }
                AudioRendererEventListener audioRendererEventListener = eventDispatcher2.f6081b;
                int i3 = Util.f5683a;
                audioRendererEventListener.p(decoderCounters);
                break;
        }
    }
}
