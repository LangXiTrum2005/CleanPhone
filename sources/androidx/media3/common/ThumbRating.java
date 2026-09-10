package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRating extends Rating {
    static {
        Util.E(1);
        Util.E(2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ((ThumbRating) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool});
    }
}
