package com.vungle.ads.internal.util;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.regex.Pattern;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/arytenoidectomy;", "", "<init>", "()V", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class arytenoidectomy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enabled;

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.arytenoidectomy$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0007¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0011\u0010\u0017\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/internal/util/arytenoidectomy$attabal;", "", "<init>", "()V", "", "enabled", "", a.j, "(Z)V", "", "tag", PglCryptUtils.KEY_MESSAGE, "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Ljava/lang/String;Ljava/lang/String;)I", "e", "", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I", "w", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)I", "i", "eraseSensitiveData", "(Ljava/lang/String;)Ljava/lang/String;", "Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int d(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (arytenoidectomy.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int e(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (arytenoidectomy.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean enabled) {
            arytenoidectomy.enabled = enabled;
        }

        public final String eraseSensitiveData(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new Regex(patternCompile).replace(str, "xxx.xxx.xxx.xxx");
        }

        public final int i(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (arytenoidectomy.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (arytenoidectomy.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        private Companion() {
        }

        public final int e(String tag, String message, Throwable throwable) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (!arytenoidectomy.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int w(String tag, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (arytenoidectomy.enabled) {
                return Log.w(tag, eraseSensitiveData(message.invoke()));
            }
            return -1;
        }
    }

    public static final int d(String str, String str2) {
        return INSTANCE.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return INSTANCE.e(str, str2);
    }

    public static final int i(String str, String str2) {
        return INSTANCE.i(str, str2);
    }

    public static final int w(String str, String str2) {
        return INSTANCE.w(str, str2);
    }

    public static final int e(String str, String str2, Throwable th) {
        return INSTANCE.e(str, str2, th);
    }

    public static final int w(String str, Function0<String> function0) {
        return INSTANCE.w(str, function0);
    }
}
