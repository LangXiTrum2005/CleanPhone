package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComparisonChain f19806a = new AnonymousClass1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComparisonChain f19807b = new InactiveComparisonChain(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComparisonChain f19808c = new InactiveComparisonChain(1);

    /* JADX INFO: renamed from: com.google.common.collect.ComparisonChain$1, reason: invalid class name */
    public class AnonymousClass1 extends ComparisonChain {
        public static ComparisonChain g(int i2) {
            if (i2 < 0) {
                return ComparisonChain.f19807b;
            }
            return i2 > 0 ? ComparisonChain.f19808c : ComparisonChain.f19806a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i2, int i3) {
            int i4;
            if (i2 < i3) {
                i4 = -1;
            } else {
                i4 = i2 > i3 ? 1 : 0;
            }
            return g(i4);
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return g(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z2, boolean z3) {
            int i2;
            if (z2 == z3) {
                i2 = 0;
            } else {
                i2 = z2 ? 1 : -1;
            }
            return g(i2);
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z2, boolean z3) {
            int i2;
            if (z3 == z2) {
                i2 = 0;
            } else {
                i2 = z3 ? 1 : -1;
            }
            return g(i2);
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return 0;
        }
    }

    public static final class InactiveComparisonChain extends ComparisonChain {
        public final int d;

        public InactiveComparisonChain(int i2) {
            this.d = i2;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i2, int i3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return this.d;
        }
    }

    public abstract ComparisonChain a(int i2, int i3);

    public abstract ComparisonChain b(Comparable comparable, Comparable comparable2);

    public abstract ComparisonChain c(Object obj, Object obj2, Comparator comparator);

    public abstract ComparisonChain d(boolean z2, boolean z3);

    public abstract ComparisonChain e(boolean z2, boolean z3);

    public abstract int f();
}
