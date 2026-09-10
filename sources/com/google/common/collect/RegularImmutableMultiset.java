package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset i0;
    public final transient ObjectCountHashMap f0;
    public final transient int g0;
    public transient ImmutableSet h0;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i2) {
            return RegularImmutableMultiset.this.f0.e(i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.f0.f19940c;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int[] f19950Y;

        public SerializedForm(Multiset multiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) multiset;
            int size = immutableMultiset.entrySet().size();
            this.X = new Object[size];
            this.f19950Y = new int[size];
            int i2 = 0;
            for (Multiset.Entry entry : immutableMultiset.entrySet()) {
                this.X[i2] = entry.d();
                this.f19950Y[i2] = entry.getCount();
                i2++;
            }
        }

        public Object readResolve() {
            Object[] objArr = this.X;
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(objArr.length);
            for (int i2 = 0; i2 < objArr.length; i2++) {
                builder.d(this.f19950Y[i2], objArr[i2]);
            }
            return builder.e();
        }
    }

    static {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        objectCountHashMap.h(3);
        i0 = new RegularImmutableMultiset(objectCountHashMap);
    }

    public RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        this.f0 = objectCountHashMap;
        long jF = 0;
        for (int i2 = 0; i2 < objectCountHashMap.f19940c; i2++) {
            jF += (long) objectCountHashMap.f(i2);
        }
        this.g0 = Ints.e(jF);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* JADX INFO: renamed from: s */
    public final ImmutableSet k() {
        ImmutableSet immutableSet = this.h0;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.h0 = elementSet;
        return elementSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.g0;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry u(int i2) {
        ObjectCountHashMap objectCountHashMap = this.f0;
        Preconditions.i(i2, objectCountHashMap.f19940c);
        return new ObjectCountHashMap.MapEntry(i2);
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        return this.f0.d(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
