package androidx.media3.exoplayer.drm;

import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class DrmUtil {

    public static final class Api21 {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return Util.s(Util.t(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    public static final class Api23 {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    public static boolean a(Throwable th) {
        return Util.f5683a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean b(Throwable th) {
        return Util.f5683a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
