package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.annotation.TargetApi;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public interface DrmSession<T extends ExoMediaCrypto> {
    public static final int STATE_ERROR = 1;
    public static final int STATE_OPENED = 3;
    public static final int STATE_OPENED_WITH_KEYS = 4;
    public static final int STATE_OPENING = 2;
    public static final int STATE_RELEASED = 0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    DrmSessionException getError();

    T getMediaCrypto();

    byte[] getOfflineLicenseKeySetId();

    int getState();

    Map<String, String> queryKeyStatus();
}
