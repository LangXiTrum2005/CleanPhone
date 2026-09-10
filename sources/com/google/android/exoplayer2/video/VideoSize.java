package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoSize implements Bundleable {
    public static final /* synthetic */ int f0 = 0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19026Y;
    public final int Z;
    public final float e0;

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public VideoSize(int i2, int i3, int i4, float f) {
        this.X = i2;
        this.f19026Y = i3;
        this.Z = i4;
        this.e0 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.X == videoSize.X && this.f19026Y == videoSize.f19026Y && this.Z == videoSize.Z && this.e0 == videoSize.e0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.e0) + ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.X) * 31) + this.f19026Y) * 31) + this.Z) * 31);
    }
}
