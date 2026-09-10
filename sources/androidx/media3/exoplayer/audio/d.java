package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f6190Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ d(Object obj, String str, long j, long j2, int i2) {
        this.X = i2;
        this.f0 = obj;
        this.f6190Y = str;
        this.Z = j;
        this.e0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f0;
        switch (this.X) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.onAudioDecoderInitialized(this.f6190Y, this.Z, this.e0);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i3 = Util.f5683a;
                eventDispatcher2.f6667b.onVideoDecoderInitialized(this.f6190Y, this.Z, this.e0);
                break;
            case 2:
                com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher3 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher3.getClass();
                int i4 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher3.f17292b.onAudioDecoderInitialized(this.f6190Y, this.Z, this.e0);
                break;
            default:
                com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher4 = (com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher4.getClass();
                int i5 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher4.f19025b.onVideoDecoderInitialized(this.f6190Y, this.Z, this.e0);
                break;
        }
    }
}
