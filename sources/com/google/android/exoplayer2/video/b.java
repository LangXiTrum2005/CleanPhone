package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f19028Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int e0;

    public /* synthetic */ b(VideoRendererEventListener.EventDispatcher eventDispatcher, int i2, long j) {
        this.f19028Y = eventDispatcher;
        this.e0 = i2;
        this.Z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.e0;
        long j = this.Z;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f19028Y;
        int i3 = this.X;
        eventDispatcher.getClass();
        switch (i3) {
            case 0:
                int i4 = Util.f18979a;
                eventDispatcher.f19025b.onDroppedFrames(i2, j);
                break;
            default:
                int i5 = Util.f18979a;
                eventDispatcher.f19025b.g(i2, j);
                break;
        }
    }

    public /* synthetic */ b(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i2) {
        this.f19028Y = eventDispatcher;
        this.Z = j;
        this.e0 = i2;
    }
}
