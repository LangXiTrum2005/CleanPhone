package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap g0;
    public final transient int h0;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, Object>> {
        public final UnmodifiableIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19840Y = null;
        public UnmodifiableIterator Z = Iterators.ArrayItr.e0;

        public AnonymousClass1(ImmutableMultimap immutableMultimap) {
            this.X = immutableMultimap.g0.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Z.hasNext() || this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.Z.hasNext()) {
                Map.Entry entry = (Map.Entry) this.X.next();
                this.f19840Y = entry.getKey();
                this.Z = ((ImmutableCollection) entry.getValue()).iterator();
            }
            Object obj = this.f19840Y;
            Objects.requireNonNull(obj);
            return new ImmutableEntry(obj, this.Z.next());
        }
    }

    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f19842a = CompactHashMap.h();
    }

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ImmutableMultimap f19843Y;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.f19843Y = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f19843Y.v(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return this.f19843Y.g0.l();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: o */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.f19843Y;
            immutableMultimap.getClass();
            return new AnonymousClass1(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f19843Y.h0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f19844a = Serialization.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Serialization.FieldSetter f19845b = Serialization.a(ImmutableMultimap.class, "size");
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ImmutableMultimap.this.g0.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final ImmutableSet k() {
            return ImmutableMultimap.this.g0.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ImmutableMultimap.this.h0;
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public final Multiset.Entry u(int i2) {
            Map.Entry entry = (Map.Entry) ImmutableMultimap.this.g0.entrySet().d().get(i2);
            return new Multisets.ImmutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.g0.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap X;

        public KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.X = immutableMultimap;
        }

        public Object readResolve() {
            return this.X.s();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final transient ImmutableMultimap f19846Y;

        public Values(ImmutableMultimap immutableMultimap) {
            this.f19846Y = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f19846Y.containsValue(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i2, Object[] objArr) {
            UnmodifiableIterator it = this.f19846Y.g0.values().iterator();
            while (it.hasNext()) {
                i2 = ((ImmutableCollection) it.next()).e(i2, objArr);
            }
            return i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: o */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.f19846Y;
            immutableMultimap.getClass();
            return new UnmodifiableIterator<Object>(immutableMultimap) { // from class: com.google.common.collect.ImmutableMultimap.2
                public final UnmodifiableIterator X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public UnmodifiableIterator f19841Y = Iterators.ArrayItr.e0;

                {
                    this.X = immutableMultimap.g0.values().iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f19841Y.hasNext() || this.X.hasNext();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Iterator
                public final Object next() {
                    if (!this.f19841Y.hasNext()) {
                        this.f19841Y = ((ImmutableCollection) this.X.next()).iterator();
                    }
                    return this.f19841Y.next();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f19846Y.h0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i2) {
        this.g0 = immutableMap;
        this.h0 = i2;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection a(Object obj) {
        w();
        throw null;
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.g0.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Multiset h() {
        return (ImmutableMultiset) super.h();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection j() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set k() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set keySet() {
        return this.g0.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset l() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection m() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator n() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableMap u() {
        return this.g0;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection d() {
        return (ImmutableCollection) super.d();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final UnmodifiableIterator q() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection get(Object obj);

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final ImmutableMultiset s() {
        return (ImmutableMultiset) super.h();
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.h0;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (ImmutableCollection) super.values();
    }

    public ImmutableCollection w() {
        throw new UnsupportedOperationException();
    }
}
