package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.media3.common.DrmInitData;
import incorrectly.ctenidium;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public interface competently {

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byte[] f11858attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f11859dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f11860saneness;

        public attabal(byte[] bArr, String str, int i) {
            this.f11858attabal = bArr;
            this.f11860saneness = str;
            this.f11859dern = i;
        }

        public byte[] attabal() {
            return this.f11858attabal;
        }

        public String saneness() {
            return this.f11860saneness;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface dern {
        competently attabal(UUID uuid);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface saneness {
        void attabal(competently competentlyVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byte[] f11861attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f11862saneness;

        public wireman(byte[] bArr, String str) {
            this.f11861attabal = bArr;
            this.f11862saneness = str;
        }

        public byte[] attabal() {
            return this.f11861attabal;
        }

        public String saneness() {
            return this.f11862saneness;
        }
    }

    attabal beachfront(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    void closeSession(byte[] bArr);

    miliaria.saneness dern(byte[] bArr) throws MediaCryptoException;

    wireman getProvisionRequest();

    void marial(saneness sanenessVar);

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    int saneness();

    boolean wireman(byte[] bArr, String str);

    default void attabal(byte[] bArr, ctenidium ctenidiumVar) {
    }
}
