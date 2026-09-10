package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CompositingVideoSinkProvider.VideoSinkImpl f6669Y;
    public final /* synthetic */ VideoSink.Listener Z;

    public /* synthetic */ e(CompositingVideoSinkProvider.VideoSinkImpl videoSinkImpl, VideoSink.Listener listener, int i2) {
        this.X = i2;
        this.f6669Y = videoSinkImpl;
        this.Z = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f6669Y.getClass();
                this.Z.getClass();
                break;
            case 1:
                this.f6669Y.getClass();
                this.Z.d();
                break;
            default:
                this.f6669Y.getClass();
                this.Z.a();
                break;
        }
    }

    public /* synthetic */ e(CompositingVideoSinkProvider.VideoSinkImpl videoSinkImpl, VideoSink.Listener listener, VideoSize videoSize) {
        this.X = 0;
        this.f6669Y = videoSinkImpl;
        this.Z = listener;
    }
}
