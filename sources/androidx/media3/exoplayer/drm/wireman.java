package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.common.PlaybackException;
import decarock.grimness;

/* JADX INFO: compiled from: DrmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: compiled from: DrmUtil.java */
    public static final class attabal {
        public static boolean attabal(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int saneness(Throwable th) {
            return grimness.peridotite(grimness.mathsort(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    public static final class saneness {
        public static boolean attabal(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int attabal(Throwable th, int i) {
        int i2 = grimness.f25080attabal;
        if (i2 >= 21 && attabal.attabal(th)) {
            return attabal.saneness(th);
        }
        if (i2 >= 23 && saneness.attabal(th)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof NotProvisionedException) || saneness(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean dern(Throwable th) {
        return grimness.f25080attabal == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean saneness(Throwable th) {
        return grimness.f25080attabal == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }
}
