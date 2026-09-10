package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating extends Rating {
    static {
        Util.E(1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PercentageRating)) {
            return false;
        }
        ((PercentageRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(0.0f)});
    }
}
