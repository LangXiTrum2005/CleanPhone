package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f17498Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f17498Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.exoplayer2.drm.DrmSessionEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.exoplayer2.drm.DrmSessionEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.exoplayer2.drm.DrmSessionEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f17498Y;
                this.Z.N(eventDispatcher.f17476a, eventDispatcher.f17477b);
                return;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) this.f17498Y;
                this.Z.P(eventDispatcher2.f17476a, eventDispatcher2.f17477b);
                return;
            case 2:
                DrmSessionEventListener.EventDispatcher eventDispatcher3 = (DrmSessionEventListener.EventDispatcher) this.f17498Y;
                this.Z.K(eventDispatcher3.f17476a, eventDispatcher3.f17477b);
                return;
            default:
                DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this.f17498Y;
                DefaultDrmSessionManager defaultDrmSessionManager = preacquiredSessionReference.e0;
                if (defaultDrmSessionManager.f17463b == 0 || preacquiredSessionReference.Z) {
                    return;
                }
                Looper looper = defaultDrmSessionManager.f;
                looper.getClass();
                preacquiredSessionReference.f17470Y = defaultDrmSessionManager.e(looper, preacquiredSessionReference.X, (Format) this.Z, false);
                throw null;
        }
    }
}
