package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f6672Y;
    public final /* synthetic */ DecoderCounters Z;

    public /* synthetic */ h(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f6672Y = eventDispatcher;
        this.Z = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.f6672Y;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6667b.n(this.Z);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.f6672Y;
                DecoderCounters decoderCounters = this.Z;
                eventDispatcher2.getClass();
                synchronized (decoderCounters) {
                }
                VideoRendererEventListener videoRendererEventListener = eventDispatcher2.f6667b;
                int i3 = Util.f5683a;
                videoRendererEventListener.t(decoderCounters);
                break;
        }
    }
}
