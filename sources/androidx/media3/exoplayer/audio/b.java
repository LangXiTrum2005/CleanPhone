package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f6188Y;
    public final /* synthetic */ AudioSink.AudioTrackConfig Z;

    public /* synthetic */ b(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i2) {
        this.X = i2;
        this.f6188Y = eventDispatcher;
        this.Z = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioSink.AudioTrackConfig audioTrackConfig = this.Z;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f6188Y;
        int i2 = this.X;
        eventDispatcher.getClass();
        switch (i2) {
            case 0:
                int i3 = Util.f5683a;
                eventDispatcher.f6081b.k(audioTrackConfig);
                break;
            default:
                int i4 = Util.f5683a;
                eventDispatcher.f6081b.j(audioTrackConfig);
                break;
        }
    }
}
