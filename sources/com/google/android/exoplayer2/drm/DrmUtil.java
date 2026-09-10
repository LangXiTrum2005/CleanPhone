package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class DrmUtil {

    public static final class Api18 {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    public static final class Api21 {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return Util.o(Util.p(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
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
}
