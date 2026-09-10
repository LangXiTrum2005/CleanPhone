package com.google.common.collect;

import com.google.common.base.Function;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {

    public static class ArbitraryOrdering extends Ordering<Object> {
        public final AtomicInteger X = new AtomicInteger(0);

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final AbstractMap f19945Y;

        public ArbitraryOrdering() {
            MapMaker mapMaker = new MapMaker();
            mapMaker.b(MapMakerInternalMap.Strength.f19901Y);
            this.f19945Y = (AbstractMap) mapMaker.a();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentMap] */
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iIdentityHashCode = System.identityHashCode(obj);
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode != iIdentityHashCode2) {
                return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
            }
            ?? r0 = this.f19945Y;
            Integer numValueOf = (Integer) r0.get(obj);
            AtomicInteger atomicInteger = this.X;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num = (Integer) r0.putIfAbsent(obj, numValueOf);
                if (num != null) {
                    numValueOf = num;
                }
            }
            Integer numValueOf2 = (Integer) r0.get(obj2);
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num2 = (Integer) r0.putIfAbsent(obj2, numValueOf2);
                if (num2 != null) {
                    numValueOf2 = num2;
                }
            }
            int iCompareTo = numValueOf.compareTo(numValueOf2);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "Ordering.arbitrary()";
        }
    }

    public static class ArbitraryOrderingHolder {
        static {
            new ArbitraryOrdering();
        }
    }

    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
    }

    public static Ordering b(Comparator comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static Ordering d() {
        return NaturalOrdering.Z;
    }

    public final Ordering a(Comparator comparator) {
        return new CompoundOrdering(this, comparator);
    }

    public Ordering g() {
        return new NullsFirstOrdering(this);
    }

    public Ordering h() {
        return new NullsLastOrdering(this);
    }

    public final Ordering i(Function function) {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering j() {
        return new ReverseOrdering(this);
    }
}
