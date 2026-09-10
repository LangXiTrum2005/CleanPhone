package androidx.collection;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/IntIntPair;", "", "packedValue", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class IntIntPair {
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntIntPair)) {
            return false;
        }
        ((IntIntPair) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) 0);
        sb.append(", ");
        return a.p(sb, (int) 0, ')');
    }
}
