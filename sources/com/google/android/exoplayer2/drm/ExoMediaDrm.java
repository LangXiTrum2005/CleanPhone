package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoMediaDrm {

    public static final class AppManagedProvider implements Provider {
    }

    public static final class KeyRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f17483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17484b;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, String str) {
            this.f17483a = bArr;
            this.f17484b = str;
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
        public final byte[] f17485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17486b;

        public ProvisionRequest(byte[] bArr, String str) {
            this.f17485a = bArr;
            this.f17486b = str;
        }
    }

    int a();

    CryptoConfig b(byte[] bArr);

    KeyRequest c(byte[] bArr, List list, int i2, HashMap map);

    void closeSession(byte[] bArr);

    boolean d(String str, byte[] bArr);

    default void e(byte[] bArr, PlayerId playerId) {
    }

    void f(OnEventListener onEventListener);

    ProvisionRequest getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
