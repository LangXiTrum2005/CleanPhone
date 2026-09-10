package androidx.media3.exoplayer.drm;

import androidx.media3.decoder.CryptoConfig;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int X;

        public DrmSessionException(Throwable th, int i2) {
            super(th);
            this.X = i2;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    static void e(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.f(null);
        }
        if (drmSession != null) {
            drmSession.g(null);
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    CryptoConfig c();

    boolean d(String str);

    void f(DrmSessionEventListener.EventDispatcher eventDispatcher);

    void g(DrmSessionEventListener.EventDispatcher eventDispatcher);

    DrmSessionException getError();

    int getState();
}
