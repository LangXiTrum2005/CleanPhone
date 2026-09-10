package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters d = new PlaybackParameters(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5496c;

    static {
        Util.E(0);
        Util.E(1);
    }

    public PlaybackParameters(float f, float f2) {
        Assertions.b(f > 0.0f);
        Assertions.b(f2 > 0.0f);
        this.f5494a = f;
        this.f5495b = f2;
        this.f5496c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.f5494a == playbackParameters.f5494a && this.f5495b == playbackParameters.f5495b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f5495b) + ((Float.floatToRawIntBits(this.f5494a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f5494a), Float.valueOf(this.f5495b)};
        int i2 = Util.f5683a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
