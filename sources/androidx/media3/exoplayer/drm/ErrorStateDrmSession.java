package androidx.media3.exoplayer.drm;

import androidx.media3.common.C;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorStateDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f6230a;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.f6230a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        return C.f5378a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final CryptoConfig c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean d(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void g(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.f6230a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
