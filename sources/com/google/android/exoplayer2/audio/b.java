package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f17415Y;
    public final /* synthetic */ DecoderCounters Z;

    public /* synthetic */ b(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.X = i2;
        this.f17415Y = eventDispatcher;
        this.Z = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f17415Y;
                eventDispatcher.getClass();
                int i2 = Util.f18979a;
                eventDispatcher.f17292b.j(this.Z);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.f17415Y;
                DecoderCounters decoderCounters = this.Z;
                eventDispatcher2.getClass();
                synchronized (decoderCounters) {
                }
                AudioRendererEventListener audioRendererEventListener = eventDispatcher2.f17292b;
                int i3 = Util.f18979a;
                audioRendererEventListener.n(decoderCounters);
                break;
        }
    }
}
