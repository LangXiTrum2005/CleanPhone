package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;
    public transient ValueEntry i0;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$1, reason: invalid class name */
    class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {
        public ValueEntry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ValueEntry f19873Y;

        public AnonymousClass1() {
            ValueEntry valueEntry = LinkedHashMultimap.this.i0.i0;
            Objects.requireNonNull(valueEntry);
            this.X = valueEntry;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X != LinkedHashMultimap.this.i0;
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry valueEntry = this.X;
            this.f19873Y = valueEntry;
            ValueEntry valueEntry2 = valueEntry.i0;
            Objects.requireNonNull(valueEntry2);
            this.X = valueEntry2;
            return valueEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.o("no calls to next() since the last call to remove()", this.f19873Y != null);
            ValueEntry valueEntry = this.f19873Y;
            LinkedHashMultimap.this.remove(valueEntry.X, valueEntry.f19829Y);
            this.f19873Y = null;
        }
    }

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {
        public final int Z;
        public ValueEntry e0;
        public ValueSetLink f0;
        public ValueSetLink g0;
        public ValueEntry h0;
        public ValueEntry i0;

        public ValueEntry(Object obj, Object obj2, int i2, ValueEntry valueEntry) {
            super(obj, obj2);
            this.Z = i2;
            this.e0 = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink d() {
            ValueSetLink valueSetLink = this.g0;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void e(ValueSetLink valueSetLink) {
            this.g0 = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void f(ValueSetLink valueSetLink) {
            this.f0 = valueSetLink;
        }
    }

    public final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {
        public final Object X;
        public int Z = 0;
        public int e0 = 0;
        public ValueSetLink f0 = this;
        public ValueSetLink g0 = this;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ValueEntry[] f19874Y = new ValueEntry[Hashing.a(2, 1.0d)];

        public ValueSet(Object obj) {
            this.X = obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f19874Y;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = valueEntryArr[length];
            for (ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.e0) {
                if (valueEntry2.Z == iC && com.google.common.base.Objects.a(valueEntry2.f19829Y, obj)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.X, obj, iC, valueEntry);
            ValueSetLink valueSetLink = this.g0;
            valueSetLink.e(valueEntry3);
            valueEntry3.f(valueSetLink);
            valueEntry3.e(this);
            f(valueEntry3);
            LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
            ValueEntry valueEntry4 = linkedHashMultimap.i0.h0;
            Objects.requireNonNull(valueEntry4);
            valueEntry4.i0 = valueEntry3;
            valueEntry3.h0 = valueEntry4;
            ValueEntry valueEntry5 = linkedHashMultimap.i0;
            valueEntry3.i0 = valueEntry5;
            valueEntry5.h0 = valueEntry3;
            ValueEntry[] valueEntryArr2 = this.f19874Y;
            valueEntryArr2[length] = valueEntry3;
            int i2 = this.Z + 1;
            this.Z = i2;
            this.e0++;
            int length2 = valueEntryArr2.length;
            if (i2 > 1.0d * ((double) length2) && length2 < 1073741824) {
                int length3 = valueEntryArr2.length * 2;
                ValueEntry[] valueEntryArr3 = new ValueEntry[length3];
                this.f19874Y = valueEntryArr3;
                int i3 = length3 - 1;
                for (ValueSetLink valueSetLinkD = this.f0; valueSetLinkD != this; valueSetLinkD = valueSetLinkD.d()) {
                    ValueEntry valueEntry6 = (ValueEntry) valueSetLinkD;
                    int i4 = valueEntry6.Z & i3;
                    valueEntry6.e0 = valueEntryArr3[i4];
                    valueEntryArr3[i4] = valueEntry6;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f19874Y, (Object) null);
            this.Z = 0;
            for (ValueSetLink valueSetLinkD = this.f0; valueSetLinkD != this; valueSetLinkD = valueSetLinkD.d()) {
                ValueEntry valueEntry = (ValueEntry) valueSetLinkD;
                ValueEntry valueEntry2 = valueEntry.h0;
                Objects.requireNonNull(valueEntry2);
                ValueEntry valueEntry3 = valueEntry.i0;
                Objects.requireNonNull(valueEntry3);
                valueEntry2.i0 = valueEntry3;
                valueEntry3.h0 = valueEntry2;
            }
            e(this);
            f(this);
            this.e0++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f19874Y;
            for (ValueEntry valueEntry = valueEntryArr[(valueEntryArr.length - 1) & iC]; valueEntry != null; valueEntry = valueEntry.e0) {
                if (valueEntry.Z == iC && com.google.common.base.Objects.a(valueEntry.f19829Y, obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink d() {
            return this.f0;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void e(ValueSetLink valueSetLink) {
            this.f0 = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void f(ValueSetLink valueSetLink) {
            this.g0 = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1
                public ValueSetLink X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public ValueEntry f19875Y;
                public int Z;

                {
                    this.X = ValueSet.this.f0;
                    this.Z = ValueSet.this.e0;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.e0 == this.Z) {
                        return this.X != valueSet;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    ValueEntry valueEntry = (ValueEntry) this.X;
                    Object obj = valueEntry.f19829Y;
                    this.f19875Y = valueEntry;
                    this.X = valueEntry.d();
                    return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.e0 != this.Z) {
                        throw new ConcurrentModificationException();
                    }
                    Preconditions.o("no calls to next() since the last call to remove()", this.f19875Y != null);
                    valueSet.remove(this.f19875Y.f19829Y);
                    this.Z = valueSet.e0;
                    this.f19875Y = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f19874Y;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = null;
            for (ValueEntry valueEntry2 = valueEntryArr[length]; valueEntry2 != null; valueEntry2 = valueEntry2.e0) {
                if (valueEntry2.Z == iC && com.google.common.base.Objects.a(valueEntry2.f19829Y, obj)) {
                    if (valueEntry == null) {
                        this.f19874Y[length] = valueEntry2.e0;
                    } else {
                        valueEntry.e0 = valueEntry2.e0;
                    }
                    ValueSetLink valueSetLink = valueEntry2.f0;
                    Objects.requireNonNull(valueSetLink);
                    ValueSetLink valueSetLinkD = valueEntry2.d();
                    valueSetLink.e(valueSetLinkD);
                    valueSetLinkD.f(valueSetLink);
                    ValueEntry valueEntry3 = valueEntry2.h0;
                    Objects.requireNonNull(valueEntry3);
                    ValueEntry valueEntry4 = valueEntry2.i0;
                    Objects.requireNonNull(valueEntry4);
                    valueEntry3.i0 = valueEntry4;
                    valueEntry4.h0 = valueEntry3;
                    this.Z--;
                    this.e0++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.Z;
        }
    }

    public interface ValueSetLink<K, V> {
        ValueSetLink d();

        void e(ValueSetLink valueSetLink);

        void f(ValueSetLink valueSetLink);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, 0, null);
        this.i0 = valueEntry;
        valueEntry.i0 = valueEntry;
        valueEntry.h0 = valueEntry;
        int i2 = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i3 = 0; i3 < i2; i3++) {
            Object object = objectInputStream.readObject();
            compactLinkedHashMap.put(object, new ValueSet(object));
        }
        int i4 = objectInputStream.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        w(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.h0);
        for (Map.Entry entry : super.d()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: A */
    public final Set o() {
        return new CompactLinkedHashSet(2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.i0;
        valueEntry.i0 = valueEntry;
        valueEntry.h0 = valueEntry;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.g0.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection d() {
        return super.d();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Iterator n() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection p(Object obj) {
        return new ValueSet(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.h0;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Iterator y() {
        return new Maps.AnonymousClass2(new AnonymousClass1());
    }
}
