package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int X;

        public DrmSessionException(Exception exc, int i2) {
            super(exc);
            this.X = i2;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    static void g(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.e(null);
        }
        if (drmSession != null) {
            drmSession.f(null);
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    CryptoConfig c();

    boolean d(String str);

    void e(DrmSessionEventListener.EventDispatcher eventDispatcher);

    void f(DrmSessionEventListener.EventDispatcher eventDispatcher);

    DrmSessionException getError();

    int getState();
}
