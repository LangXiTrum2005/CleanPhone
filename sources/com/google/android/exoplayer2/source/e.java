package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f18438Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ LoadEventInfo e0;
    public final /* synthetic */ MediaLoadData f0;

    public /* synthetic */ e(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.X = i2;
        this.f18438Y = eventDispatcher;
        this.Z = mediaSourceEventListener;
        this.e0 = loadEventInfo;
        this.f0 = mediaLoadData;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.exoplayer2.source.MediaSourceEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f18438Y;
                int i2 = eventDispatcher.f18351a;
                this.Z.L(i2, eventDispatcher.f18352b, this.e0, this.f0);
                break;
            case 1:
                MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.f18438Y;
                int i3 = eventDispatcher2.f18351a;
                this.Z.t(i3, eventDispatcher2.f18352b, this.e0, this.f0);
                break;
            default:
                MediaSourceEventListener.EventDispatcher eventDispatcher3 = this.f18438Y;
                int i4 = eventDispatcher3.f18351a;
                this.Z.v(i4, eventDispatcher3.f18352b, this.e0, this.f0);
                break;
        }
    }
}
