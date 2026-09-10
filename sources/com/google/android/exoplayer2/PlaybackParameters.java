package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackParameters implements Bundleable {
    public static final PlaybackParameters e0 = new PlaybackParameters(1.0f, 1.0f);
    public final float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final float f17185Y;
    public final int Z;

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public PlaybackParameters(float f, float f2) {
        Assertions.b(f > 0.0f);
        Assertions.b(f2 > 0.0f);
        this.X = f;
        this.f17185Y = f2;
        this.Z = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.X == playbackParameters.X && this.f17185Y == playbackParameters.f17185Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17185Y) + ((Float.floatToRawIntBits(this.X) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.X), Float.valueOf(this.f17185Y)};
        int i2 = Util.f18979a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
