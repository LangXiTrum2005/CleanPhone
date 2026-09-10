package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final int a() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final CryptoConfig b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest c(byte[] bArr, List list, int i2, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final boolean d(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void f(ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
