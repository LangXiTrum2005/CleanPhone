package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals X = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            ((EquivalentToPredicate) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "null.equivalentTo(null)";
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity X = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return X;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            ((Wrapper) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.wrap(null)";
        }
    }

    public static Equivalence d() {
        return Equals.X;
    }

    public static Equivalence g() {
        return Identity.X;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public final boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
