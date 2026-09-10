package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6246Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f6246Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f6246Y;
                this.Z.S(eventDispatcher.f6224a, eventDispatcher.f6225b);
                return;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) this.f6246Y;
                this.Z.P(eventDispatcher2.f6224a, eventDispatcher2.f6225b);
                return;
            case 2:
                DrmSessionEventListener.EventDispatcher eventDispatcher3 = (DrmSessionEventListener.EventDispatcher) this.f6246Y;
                this.Z.B(eventDispatcher3.f6224a, eventDispatcher3.f6225b);
                return;
            default:
                DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this.f6246Y;
                DefaultDrmSessionManager defaultDrmSessionManager = preacquiredSessionReference.e0;
                if (defaultDrmSessionManager.f6213b == 0 || preacquiredSessionReference.Z) {
                    return;
                }
                Looper looper = defaultDrmSessionManager.f;
                looper.getClass();
                preacquiredSessionReference.f6220Y = defaultDrmSessionManager.e(looper, preacquiredSessionReference.X, (Format) this.Z, false);
                throw null;
        }
    }
}
