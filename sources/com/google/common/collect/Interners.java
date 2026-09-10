package com.google.common.collect;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Interners {

    public static class InternerBuilder {
    }

    public static class InternerFunction<E> implements Function<E, E> {
        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof InternerFunction)) {
                return false;
            }
            ((InternerFunction) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class InternerImpl<E> implements Interner<E> {
    }
}
