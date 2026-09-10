package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class StarRating extends Rating {
    static {
        Util.E(1);
        Util.E(2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        ((StarRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Float.valueOf(0.0f)});
    }
}
