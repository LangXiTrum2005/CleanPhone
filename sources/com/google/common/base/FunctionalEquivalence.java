package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Equivalence
    public final boolean a(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.common.base.Equivalence
    public final int b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        ((FunctionalEquivalence) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "null.onResultOf(null)";
    }
}
