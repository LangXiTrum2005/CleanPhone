package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRating extends Rating {
    public static final String f0;
    public static final String g0;
    public static final d h0;
    public final boolean Z;
    public final boolean e0;

    static {
        int i2 = Util.f18979a;
        f0 = Integer.toString(1, 36);
        g0 = Integer.toString(2, 36);
        h0 = new d(4);
    }

    public HeartRating() {
        this.Z = false;
        this.e0 = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.e0 == heartRating.e0 && this.Z == heartRating.Z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.Z), Boolean.valueOf(this.e0)});
    }

    public HeartRating(boolean z2) {
        this.Z = true;
        this.e0 = z2;
    }
}
