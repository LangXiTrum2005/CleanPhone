package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Functions {

    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof ConstantFunction)) {
                return false;
            }
            ((ConstantFunction) obj).getClass();
            return Objects.a(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Functions.constant(null)";
        }
    }

    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ((ForMapWithDefault) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Functions.forMap(null, defaultValue=null)";
        }
    }

    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            ((FunctionComposition) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null(null)";
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof FunctionForMapNoDefault)) {
                return false;
            }
            ((FunctionForMapNoDefault) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Functions.forMap(null)";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IdentityFunction implements Function<Object, Object> {
        public static final /* synthetic */ IdentityFunction[] X = {new IdentityFunction("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        IdentityFunction EF5;

        public static IdentityFunction valueOf(String str) {
            return (IdentityFunction) Enum.valueOf(IdentityFunction.class, str);
        }

        public static IdentityFunction[] values() {
            return (IdentityFunction[]) X.clone();
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Functions.identity()";
        }
    }

    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof PredicateFunction)) {
                return false;
            }
            ((PredicateFunction) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Functions.forPredicate(null)";
        }
    }

    public static class SupplierFunction<F, T> implements Function<F, T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof SupplierFunction)) {
                return false;
            }
            ((SupplierFunction) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Functions.forSupplier(null)";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ToStringFunction implements Function<Object, String> {
        public static final /* synthetic */ ToStringFunction[] X = {new ToStringFunction("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ToStringFunction EF5;

        public static ToStringFunction valueOf(String str) {
            return (ToStringFunction) Enum.valueOf(ToStringFunction.class, str);
        }

        public static ToStringFunction[] values() {
            return (ToStringFunction[]) X.clone();
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            obj.getClass();
            return obj.toString();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Functions.toStringFunction()";
        }
    }
}
