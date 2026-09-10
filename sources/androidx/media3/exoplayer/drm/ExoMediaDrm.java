package androidx.media3.exoplayer.drm;

import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ExoMediaDrm {

    public static final class AppManagedProvider implements Provider {
    }

    public static final class KeyRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f6231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6232b;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, String str) {
            this.f6231a = bArr;
            this.f6232b = str;
        }
    }

    public static final class KeyStatus {
    }

    public interface OnEventListener {
    }

    public interface OnExpirationUpdateListener {
    }

    public interface OnKeyStatusChangeListener {
    }

    public interface Provider {
    }

    public static final class ProvisionRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f6233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6234b;

        public ProvisionRequest(byte[] bArr, String str) {
            this.f6233a = bArr;
            this.f6234b = str;
        }
    }

    int a();

    CryptoConfig b(byte[] bArr);

    KeyRequest c(byte[] bArr, List list, int i2, HashMap map);

    void closeSession(byte[] bArr);

    boolean d(String str, byte[] bArr);

    void e(OnEventListener onEventListener);

    default void f(byte[] bArr, PlayerId playerId) {
    }

    ProvisionRequest getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
