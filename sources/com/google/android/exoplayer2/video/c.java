package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f19029Y;
    public final /* synthetic */ DecoderCounters Z;

    public /* synthetic */ c(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f19029Y = eventDispatcher;
        this.Z = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.f19029Y;
                DecoderCounters decoderCounters = this.Z;
                eventDispatcher.getClass();
                synchronized (decoderCounters) {
                }
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.f19025b;
                int i2 = Util.f18979a;
                videoRendererEventListener.l(decoderCounters);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.f19029Y;
                eventDispatcher2.getClass();
                int i3 = Util.f18979a;
                eventDispatcher2.f19025b.p(this.Z);
                break;
        }
    }
}
