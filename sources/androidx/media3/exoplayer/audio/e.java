package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6191Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ e(Object obj, int i2, long j, long j2, int i3) {
        this.X = i3;
        this.f0 = obj;
        this.f6191Y = i2;
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
                eventDispatcher.f6081b.i(this.f6191Y, this.Z, this.e0);
                break;
            default:
                com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i3 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher2.f17292b.i(this.f6191Y, this.Z, this.e0);
                break;
        }
    }
}
