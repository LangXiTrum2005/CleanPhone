package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DummyExoMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements competently {
    @Override // androidx.media3.exoplayer.drm.competently
    public competently.attabal beachfront(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public miliaria.saneness dern(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public competently.wireman getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public int saneness() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public boolean wireman(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void marial(competently.saneness sanenessVar) {
    }
}
