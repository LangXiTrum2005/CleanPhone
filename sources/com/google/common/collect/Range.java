package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    public static final Range Z = new Range(Cut.BelowAll.f19813Y, Cut.AboveAll.f19812Y);
    private static final long serialVersionUID = 0;
    public final Cut X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Cut f19946Y;

    /* JADX INFO: renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19947a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f19947a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19947a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class LowerBoundFn implements Function<Range, Cut> {
        public static final LowerBoundFn X = new LowerBoundFn();

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return ((Range) obj).X;
        }
    }

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        public static final Ordering X = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return ComparisonChain.f19806a.b(range.X, range2.X).b(range.f19946Y, range2.f19946Y).f();
        }
    }

    public static class UpperBoundFn implements Function<Range, Cut> {
        public static final UpperBoundFn X = new UpperBoundFn();

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return ((Range) obj).f19946Y;
        }
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.X = cut;
        cut2.getClass();
        this.f19946Y = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.f19812Y || cut2 == Cut.BelowAll.f19813Y) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            cut.d(sb2);
            sb2.append("..");
            cut2.f(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Range b(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        Cut.AboveAll aboveAll = Cut.AboveAll.f19812Y;
        if (iOrdinal == 0) {
            return new Range(new Cut.AboveValue(comparable), aboveAll);
        }
        if (iOrdinal == 1) {
            return new Range(Cut.a(comparable), aboveAll);
        }
        throw new AssertionError();
    }

    public static Range h(Comparable comparable, BoundType boundType, Comparable comparable2, BoundType boundType2) {
        BoundType boundType3 = BoundType.X;
        return new Range(boundType == boundType3 ? new Cut.AboveValue(comparable) : Cut.a(comparable), boundType2 == boundType3 ? Cut.a(comparable2) : new Cut.AboveValue(comparable2));
    }

    public static Range i(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        Cut.BelowAll belowAll = Cut.BelowAll.f19813Y;
        if (iOrdinal == 0) {
            return new Range(belowAll, Cut.a(comparable));
        }
        if (iOrdinal == 1) {
            return new Range(belowAll, new Cut.AboveValue(comparable));
        }
        throw new AssertionError();
    }

    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.X.i(comparable) && !this.f19946Y.i(comparable);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return a((Comparable) obj);
    }

    public final boolean d() {
        return this.f19946Y != Cut.AboveAll.f19812Y;
    }

    public final Range e(Range range) {
        Cut cut = range.X;
        Cut cut2 = this.X;
        int iCompareTo = cut2.compareTo(cut);
        Cut cut3 = this.f19946Y;
        Cut cut4 = range.f19946Y;
        int iCompareTo2 = cut3.compareTo(cut4);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        if (iCompareTo < 0) {
            cut2 = range.X;
        }
        if (iCompareTo2 > 0) {
            cut3 = cut4;
        }
        Preconditions.h(cut2.compareTo(cut3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return new Range(cut2, cut3);
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.X.equals(range.X) && this.f19946Y.equals(range.f19946Y)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Range range) {
        return this.X.compareTo(range.f19946Y) <= 0 && range.X.compareTo(this.f19946Y) <= 0;
    }

    public final boolean g() {
        return this.X.equals(this.f19946Y);
    }

    public final int hashCode() {
        return (this.X.hashCode() * 31) + this.f19946Y.hashCode();
    }

    public Object readResolve() {
        Range range = Z;
        return equals(range) ? range : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.X.d(sb);
        sb.append("..");
        this.f19946Y.f(sb);
        return sb.toString();
    }
}
