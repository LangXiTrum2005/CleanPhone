package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int Z;
    public final String e0;
    public final int f0;
    public final Format g0;
    public final int h0;
    public final MediaSource.MediaPeriodId i0;
    public final boolean j0;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        androidx.datastore.preferences.protobuf.a.s(1001, 1002, 1003, 1004, 1005);
        Util.E(1006);
    }

    public ExoPlaybackException(int i2, Exception exc, int i3) {
        this(i2, exc, i3, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i2, int i3, String str2, int i4, Format format, int i5, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z2) {
        super(i2, j, th, str);
        Bundle bundle = Bundle.EMPTY;
        Assertions.b(!z2 || i3 == 1);
        Assertions.b(th != null || i3 == 3);
        this.Z = i3;
        this.e0 = str2;
        this.f0 = i4;
        this.g0 = format;
        this.h0 = i5;
        this.i0 = mediaPeriodId;
        this.j0 = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i2, Throwable th, int i3, String str, int i4, Format format, int i5, boolean z2) {
        String str2;
        int i6;
        Format format2;
        String string;
        if (i2 == 0) {
            str2 = str;
            i6 = i4;
            format2 = format;
            string = "Source error";
        } else if (i2 != 1) {
            if (i2 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i6 = i4;
            format2 = format;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i6 = i4;
            sb.append(i6);
            sb.append(", format=");
            format2 = format;
            sb.append(format2);
            sb.append(", format_supported=");
            sb.append(Util.u(i5));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : android.support.v4.media.a.m(string, ": null"), th, i3, i2, str2, i6, format2, i5, null, SystemClock.elapsedRealtime(), z2);
    }
}
