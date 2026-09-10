package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6480Y;
    public final /* synthetic */ IOException Z;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z2, int i2) {
        this.X = i2;
        this.f0 = obj;
        this.f6480Y = obj2;
        this.g0 = obj3;
        this.h0 = obj4;
        this.Z = iOException;
        this.e0 = z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.f0;
                int i2 = eventDispatcher.f6388a;
                this.f6480Y.E(i2, eventDispatcher.f6389b, (LoadEventInfo) this.g0, (MediaLoadData) this.h0, this.Z, this.e0);
                break;
            default:
                com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) this.f0;
                int i3 = eventDispatcher2.f18351a;
                this.f6480Y.O(i3, eventDispatcher2.f18352b, (com.google.android.exoplayer2.source.LoadEventInfo) this.g0, (com.google.android.exoplayer2.source.MediaLoadData) this.h0, this.Z, this.e0);
                break;
        }
    }
}
