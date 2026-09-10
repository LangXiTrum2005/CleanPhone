package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import com.inmobi.media.AbstractC3096k7;
import com.inmobi.media.Z6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6671Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int e0;

    public /* synthetic */ g(VideoRendererEventListener.EventDispatcher eventDispatcher, int i2, long j) {
        this.X = 0;
        this.f6671Y = eventDispatcher;
        this.e0 = i2;
        this.Z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f6671Y;
        int i2 = this.e0;
        long j = this.Z;
        switch (this.X) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i3 = Util.f5683a;
                eventDispatcher.f6667b.onDroppedFrames(i2, j);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i4 = Util.f5683a;
                eventDispatcher2.f6667b.g(i2, j);
                break;
            default:
                AbstractC3096k7.b((Z6) obj, j, i2);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i2, int i3, long j) {
        this.X = i3;
        this.f6671Y = obj;
        this.Z = j;
        this.e0 = i2;
    }
}
