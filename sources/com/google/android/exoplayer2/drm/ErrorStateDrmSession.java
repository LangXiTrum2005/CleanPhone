package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorStateDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f17482a;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.f17482a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID a() {
        return C.f16997a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig c() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void e(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void f(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.f17482a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
