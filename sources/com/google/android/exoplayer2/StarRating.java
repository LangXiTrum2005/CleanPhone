package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class StarRating extends Rating {
    public static final String f0;
    public static final String g0;
    public static final d h0;
    public final int Z;
    public final float e0;

    static {
        int i2 = Util.f18979a;
        f0 = Integer.toString(1, 36);
        g0 = Integer.toString(2, 36);
        h0 = new d(12);
    }

    public StarRating(int i2) {
        Assertions.a("maxStars must be a positive integer", i2 > 0);
        this.Z = i2;
        this.e0 = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.Z == starRating.Z && this.e0 == starRating.e0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Z), Float.valueOf(this.e0)});
    }

    public StarRating(int i2, float f) {
        boolean z2 = false;
        Assertions.a("maxStars must be a positive integer", i2 > 0);
        if (f >= 0.0f && f <= i2) {
            z2 = true;
        }
        Assertions.a("starRating is out of range [0, maxStars]", z2);
        this.Z = i2;
        this.e0 = f;
    }
}
