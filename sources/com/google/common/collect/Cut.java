package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    public final Comparable X;

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19811a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f19811a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19811a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class AboveAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final AboveAll f19812Y = new AboveAll("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f19812Y;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final void f(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final boolean i(Comparable comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut m() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut n() {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final BelowAll f19813Y = new BelowAll("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f19813Y;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        public final void f(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final boolean i(Comparable comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut m() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut n() {
            throw new AssertionError("this statement should be unreachable");
        }

        public final String toString() {
            return "-∞";
        }
    }

    public Cut(Comparable comparable) {
        this.X = comparable;
    }

    public static BelowValue a(Comparable comparable) {
        comparable.getClass();
        return new BelowValue(comparable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cut cut) {
        if (cut == BelowAll.f19813Y) {
            return 1;
        }
        if (cut == AboveAll.f19812Y) {
            return -1;
        }
        Comparable comparable = cut.X;
        Range range = Range.Z;
        int iCompareTo = this.X.compareTo(comparable);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        boolean z2 = this instanceof AboveValue;
        if (z2 == (cut instanceof AboveValue)) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    public abstract void d(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract void f(StringBuilder sb);

    public Comparable g() {
        return this.X;
    }

    public abstract Comparable h();

    public abstract int hashCode();

    public abstract boolean i(Comparable comparable);

    public abstract Comparable j();

    public abstract BoundType k();

    public abstract BoundType l();

    public abstract Cut m();

    public abstract Cut n();

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveValue(Comparable comparable) {
            super(comparable);
            comparable.getClass();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append('(');
            sb.append(this.X);
        }

        @Override // com.google.common.collect.Cut
        public final void f(StringBuilder sb) {
            sb.append(this.X);
            sb.append(AbstractJsonLexerKt.END_LIST);
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            return this.X;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.X.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final boolean i(Comparable comparable) {
            Range range = Range.Z;
            return this.X.compareTo(comparable) < 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            return BoundType.X;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            return BoundType.f19795Y;
        }

        @Override // com.google.common.collect.Cut
        public final Cut m() {
            throw null;
        }

        public final String toString() {
            return "/" + this.X + "\\";
        }

        @Override // com.google.common.collect.Cut
        public final Cut n() {
            return this;
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.X);
        }

        @Override // com.google.common.collect.Cut
        public final void f(StringBuilder sb) {
            sb.append(this.X);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.X.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final boolean i(Comparable comparable) {
            Range range = Range.Z;
            return this.X.compareTo(comparable) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            return this.X;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            return BoundType.f19795Y;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            return BoundType.X;
        }

        @Override // com.google.common.collect.Cut
        public final Cut n() {
            throw null;
        }

        public final String toString() {
            return "\\" + this.X + "/";
        }

        @Override // com.google.common.collect.Cut
        public final Cut m() {
            return this;
        }
    }
}
