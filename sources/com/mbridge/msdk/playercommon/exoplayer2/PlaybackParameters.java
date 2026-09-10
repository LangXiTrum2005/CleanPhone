package com.mbridge.msdk.playercommon.exoplayer2;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public final float pitch;
    private final int scaledUsPerMs;
    public final boolean skipSilence;
    public final float speed;

    public PlaybackParameters(float f10) {
        this(f10, 1.0f, false);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch && this.skipSilence == playbackParameters.skipSilence) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31) + (this.skipSilence ? 1 : 0);
    }

    public PlaybackParameters(float f10, float f11) {
        this(f10, f11, false);
    }

    public PlaybackParameters(float f10, float f11, boolean z10) {
        Assertions.checkArgument(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Assertions.checkArgument(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.speed = f10;
        this.pitch = f11;
        this.skipSilence = z10;
        this.scaledUsPerMs = Math.round(f10 * 1000.0f);
    }
}
