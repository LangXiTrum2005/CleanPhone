package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSize {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final VideoSize f5552e = new VideoSize(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5555c;
    public final float d;

    static {
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
    }

    public VideoSize(int i2, int i3, int i4, float f) {
        this.f5553a = i2;
        this.f5554b = i3;
        this.f5555c = i4;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.f5553a == videoSize.f5553a && this.f5554b == videoSize.f5554b && this.f5555c == videoSize.f5555c && this.d == videoSize.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f5553a) * 31) + this.f5554b) * 31) + this.f5555c) * 31);
    }
}
