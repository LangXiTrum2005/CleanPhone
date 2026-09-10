package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class PercentageRating extends Rating {
    public static final String e0;
    public static final d f0;
    public final float Z;

    static {
        int i2 = Util.f18979a;
        e0 = Integer.toString(1, 36);
        f0 = new d(10);
    }

    public PercentageRating() {
        this.Z = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PercentageRating) {
            return this.Z == ((PercentageRating) obj).Z;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.Z)});
    }

    public PercentageRating(float f) {
        Assertions.a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.Z = f;
    }
}
