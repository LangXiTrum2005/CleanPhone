package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f6670Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, int i2) {
        this.X = i2;
        this.f6670Y = eventDispatcher;
        this.Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.Z;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f6670Y;
        int i2 = this.X;
        eventDispatcher.getClass();
        switch (i2) {
            case 0:
                int i3 = Util.f5683a;
                eventDispatcher.f6667b.onVideoSizeChanged((VideoSize) obj);
                break;
            case 1:
                int i4 = Util.f5683a;
                eventDispatcher.f6667b.e((Exception) obj);
                break;
            default:
                int i5 = Util.f5683a;
                eventDispatcher.f6667b.a((String) obj);
                break;
        }
    }
}
