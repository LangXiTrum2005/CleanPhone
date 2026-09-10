package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Count)) {
            return false;
        }
        ((Count) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return Integer.toString(0);
    }
}
