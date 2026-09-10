package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f6189Y;
    public final /* synthetic */ Exception Z;

    public /* synthetic */ c(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i2) {
        this.X = i2;
        this.f6189Y = eventDispatcher;
        this.Z = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.Z;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f6189Y;
        int i2 = this.X;
        eventDispatcher.getClass();
        switch (i2) {
            case 0:
                int i3 = Util.f5683a;
                eventDispatcher.f6081b.h(exc);
                break;
            default:
                int i4 = Util.f5683a;
                eventDispatcher.f6081b.c(exc);
                break;
        }
    }
}
