package com.google.common.base;

import java.io.Serializable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Enums {

    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Enum.valueOf(null, (String) obj);
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            ((StringConverter) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        new WeakHashMap();
    }
}
