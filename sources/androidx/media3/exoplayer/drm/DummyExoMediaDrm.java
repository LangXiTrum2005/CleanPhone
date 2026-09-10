package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int a() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final CryptoConfig b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest c(byte[] bArr, List list, int i2, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean d(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void e(ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
