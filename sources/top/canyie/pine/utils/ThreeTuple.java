package top.canyie.pine.utils;

import android.support.v4.media.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ThreeTuple<A, B, C> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeTuple)) {
            return false;
        }
        ((ThreeTuple) obj).getClass();
        return Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null);
    }

    public final int hashCode() {
        return (Objects.hashCode(null) ^ Objects.hashCode(null)) ^ Objects.hashCode(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThreeTuple{A: ");
        sb.append((Object) null);
        sb.append("; b: ");
        sb.append((Object) null);
        sb.append("; c: ");
        return a.q(sb, null, "}");
    }
}
