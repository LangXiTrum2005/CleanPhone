package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {
    public static final ImmutableRangeMap Z;
    private static final long serialVersionUID = 0;
    public final transient ImmutableList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final transient ImmutableList f19851Y;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable<?>>> {
        @Override // java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, 0);
            if (i2 == 0 || i2 == -1) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$2, reason: invalid class name */
    class AnonymousClass2 extends ImmutableRangeMap<Comparable<?>, Object> {
        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public final /* bridge */ /* synthetic */ Map d() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19852a = new ArrayList();
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap X;

        public SerializedForm(ImmutableMap immutableMap) {
            this.X = immutableMap;
        }

        public Object readResolve() {
            ArrayList arrayList;
            ImmutableMap immutableMap = this.X;
            if (immutableMap.isEmpty()) {
                return ImmutableRangeMap.Z;
            }
            Builder builder = new Builder();
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = builder.f19852a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Range range = (Range) entry.getKey();
                Object value = entry.getValue();
                range.getClass();
                value.getClass();
                Preconditions.g(!range.g(), "Range must not be empty, but was %s", range);
                arrayList.add(new ImmutableEntry(range, value));
            }
            Range range2 = Range.Z;
            Collections.sort(arrayList, new ByFunctionOrdering(Maps.EntryFunction.X, Range.RangeLexOrdering.X));
            ImmutableList.Builder builder2 = new ImmutableList.Builder(arrayList.size());
            ImmutableList.Builder builder3 = new ImmutableList.Builder(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Range range3 = (Range) ((Map.Entry) arrayList.get(i2)).getKey();
                if (i2 > 0) {
                    Range range4 = (Range) ((Map.Entry) arrayList.get(i2 - 1)).getKey();
                    if (range3.f(range4) && !range3.e(range4).g()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range4 + " overlaps with entry " + range3);
                    }
                }
                builder2.h(range3);
                builder3.h(((Map.Entry) arrayList.get(i2)).getValue());
            }
            return new ImmutableRangeMap(builder2.j(), builder3.j());
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        ImmutableList immutableList = RegularImmutableList.f0;
        Z = new ImmutableRangeMap(immutableList, immutableList);
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.X = immutableList;
        this.f19851Y = immutableList2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return d().equals(((RangeMap) obj).d());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap d() {
        ImmutableList immutableList = this.X;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.h0;
        }
        Range range = Range.Z;
        return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.X), this.f19851Y, null);
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return Maps.j(d());
    }

    public Object writeReplace() {
        return new SerializedForm(d());
    }
}
