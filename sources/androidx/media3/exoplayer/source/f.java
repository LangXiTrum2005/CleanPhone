package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f6479Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ LoadEventInfo e0;
    public final /* synthetic */ MediaLoadData f0;

    public /* synthetic */ f(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.X = i2;
        this.f6479Y = eventDispatcher;
        this.Z = mediaSourceEventListener;
        this.e0 = loadEventInfo;
        this.f0 = mediaLoadData;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f6479Y;
                int i2 = eventDispatcher.f6388a;
                this.Z.z(i2, eventDispatcher.f6389b, this.e0, this.f0);
                break;
            case 1:
                MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.f6479Y;
                int i3 = eventDispatcher2.f6388a;
                this.Z.N(i3, eventDispatcher2.f6389b, this.e0, this.f0);
                break;
            default:
                MediaSourceEventListener.EventDispatcher eventDispatcher3 = this.f6479Y;
                int i4 = eventDispatcher3.f6388a;
                this.Z.J(i4, eventDispatcher3.f6389b, this.e0, this.f0);
                break;
        }
    }
}
