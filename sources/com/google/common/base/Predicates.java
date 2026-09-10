package com.google.common.base;

import android.support.v4.media.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Predicates {

    public static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final List X;

        public AndPredicate(List list) {
            this.X = list;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            int i2 = 0;
            while (true) {
                List list = this.X;
                if (i2 >= list.size()) {
                    return true;
                }
                if (!((Predicate) list.get(i2)).apply(obj)) {
                    return false;
                }
                i2++;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.X.equals(((AndPredicate) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return this.X.hashCode() + 306654252;
        }

        public final String toString() {
            return Predicates.a(this.X, "and");
        }
    }

    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Function f19717Y;

        public CompositionPredicate(Predicate predicate, Function function) {
            predicate.getClass();
            this.X = predicate;
            this.f19717Y = function;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.X.apply(this.f19717Y.apply(obj));
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            return this.f19717Y.equals(compositionPredicate.f19717Y) && this.X.equals(compositionPredicate.X);
        }

        public final int hashCode() {
            return this.f19717Y.hashCode() ^ this.X.hashCode();
        }

        public final String toString() {
            return this.X + "(" + this.f19717Y + ")";
        }
    }

    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public final String toString() {
            throw null;
        }
    }

    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public String toString() {
            MoreObjects.b(null);
            throw null;
        }
    }

    public static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Collection X;

        public InPredicate(Collection collection) {
            collection.getClass();
            this.X = collection;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            try {
                return this.X.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.X.equals(((InPredicate) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.X + ")";
        }
    }

    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Class X;

        public InstanceOfPredicate(Class cls) {
            cls.getClass();
            this.X = cls;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.X.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.X == ((InstanceOfPredicate) obj).X;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            return "Predicates.instanceOf(" + this.X.getName() + ")";
        }
    }

    public static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        public IsEqualToPredicate(Object obj) {
            this.X = obj;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.X.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.X.equals(((IsEqualToPredicate) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            return a.q(new StringBuilder("Predicates.equalTo("), this.X, ")");
        }
    }

    public static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        public NotPredicate(Predicate predicate) {
            this.X = predicate;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return !this.X.apply(obj);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.X.equals(((NotPredicate) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return ~this.X.hashCode();
        }

        public final String toString() {
            return a.q(new StringBuilder("Predicates.not("), this.X, ")");
        }
    }

    public enum ObjectPredicate implements Predicate<Object> {
        X { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF9 { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF14 { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF19 { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }
    }

    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (!(obj instanceof OrPredicate)) {
                return false;
            }
            ((OrPredicate) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return Predicates.a(null, "or");
        }
    }

    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (!(obj instanceof SubtypeOfPredicate)) {
                return false;
            }
            ((SubtypeOfPredicate) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static String a(Iterable iterable, String str) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z2 = true;
        for (Object obj : iterable) {
            if (!z2) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static Predicate b() {
        return ObjectPredicate.X;
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        predicate.getClass();
        predicate2.getClass();
        return new AndPredicate(Arrays.asList(predicate, predicate2));
    }

    public static Predicate d(Predicate predicate, Function function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate e(Object obj) {
        return new IsEqualToPredicate(obj);
    }

    public static Predicate f(Collection collection) {
        return new InPredicate(collection);
    }

    public static Predicate g(Class cls) {
        return new InstanceOfPredicate(cls);
    }

    public static Predicate h(Predicate predicate) {
        return new NotPredicate(predicate);
    }
}
