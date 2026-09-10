package com.google.common.net;

import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            ((HostAndPort) obj).getClass();
            if (Objects.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, 0});
    }

    public final String toString() {
        throw null;
    }
}
