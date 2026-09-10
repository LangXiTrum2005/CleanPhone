package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f17414Y;
    public final /* synthetic */ Exception Z;

    public /* synthetic */ a(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i2) {
        this.X = i2;
        this.f17414Y = eventDispatcher;
        this.Z = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.Z;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f17414Y;
        int i2 = this.X;
        eventDispatcher.getClass();
        switch (i2) {
            case 0:
                int i3 = Util.f18979a;
                eventDispatcher.f17292b.h(exc);
                break;
            default:
                int i4 = Util.f18979a;
                eventDispatcher.f17292b.c(exc);
                break;
        }
    }
}
