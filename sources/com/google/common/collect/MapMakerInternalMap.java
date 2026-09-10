package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final AnonymousClass1 k0 = new AnonymousClass1();
    private static final long serialVersionUID = 5;
    public final transient int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final transient int f19896Y;
    public final transient Segment[] Z;
    public final int e0;
    public final Equivalence f0;
    public final transient InternalEntryHelper g0;
    public transient Set h0;
    public transient Collection i0;
    public transient Set j0;

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$1, reason: invalid class name */
    public class AnonymousClass1 implements WeakValueReference<Object, Object, DummyInternalEntry> {
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final /* bridge */ /* synthetic */ InternalEntry a() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference b(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final Object get() {
            return null;
        }
    }

    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final Strength X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Strength f19897Y;
        public final Equivalence Z;
        public final int e0;
        public transient AbstractMap f0;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, int i2, ConcurrentMap concurrentMap) {
            this.X = strength;
            this.f19897Y = strength2;
            this.Z = equivalence;
            this.e0 = i2;
            this.f0 = (AbstractMap) concurrentMap;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.f0;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: x */
        public final Map w() {
            return this.f0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
        @Override // com.google.common.collect.ForwardingConcurrentMap
        /* JADX INFO: renamed from: z */
        public final ConcurrentMap x() {
            return this.f0;
        }
    }

    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19898Y;

        public AbstractStrongKeyEntry(Object obj, int i2) {
            this.X = obj;
            this.f19898Y = i2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int g() {
            return this.f19898Y;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return this.X;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry h() {
            return null;
        }
    }

    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        public final int X;

        public AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object obj, int i2) {
            super(obj, referenceQueue);
            this.X = i2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int g() {
            return this.X;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry h() {
            return null;
        }
    }

    public static final class CleanupMapTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int g() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final InternalEntry h() {
            throw new AssertionError();
        }
    }

    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
    }

    public final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            MapMakerInternalMap mapMakerInternalMap;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (mapMakerInternalMap = MapMakerInternalMap.this).get(key)) != null && mapMakerInternalMap.g0.c().d().e(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19899Y = -1;
        public Segment Z;
        public AtomicReferenceArray e0;
        public InternalEntry f0;
        public WriteThroughEntry g0;
        public WriteThroughEntry h0;

        public HashIterator() {
            this.X = MapMakerInternalMap.this.Z.length - 1;
            a();
        }

        public final void a() {
            this.g0 = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i2 = this.X;
                if (i2 < 0) {
                    return;
                }
                Segment[] segmentArr = MapMakerInternalMap.this.Z;
                this.X = i2 - 1;
                Segment segment = segmentArr[i2];
                this.Z = segment;
                if (segment.f19900Y != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.Z.f0;
                    this.e0 = atomicReferenceArray;
                    this.f19899Y = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(InternalEntry internalEntry) {
            Segment segment;
            MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
            try {
                Object key = internalEntry.getKey();
                Object value = internalEntry.getKey() == null ? null : internalEntry.getValue();
                if (value == null) {
                    return false;
                }
                this.g0 = new WriteThroughEntry(key, value);
                return true;
            } finally {
                this.Z.i();
            }
        }

        public final WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.g0;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.h0 = writeThroughEntry;
            a();
            return this.h0;
        }

        public final boolean d() {
            InternalEntry internalEntry = this.f0;
            if (internalEntry == null) {
                return false;
            }
            while (true) {
                this.f0 = internalEntry.h();
                InternalEntry internalEntry2 = this.f0;
                if (internalEntry2 == null) {
                    return false;
                }
                if (b(internalEntry2)) {
                    return true;
                }
                internalEntry = this.f0;
            }
        }

        public final boolean e() {
            while (true) {
                int i2 = this.f19899Y;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.e0;
                this.f19899Y = i2 - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i2);
                this.f0 = internalEntry;
                if (internalEntry != null && (b(internalEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g0 != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.h0 != null);
            MapMakerInternalMap.this.remove(this.h0.X);
            this.h0 = null;
        }
    }

    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int g();

        Object getKey();

        Object getValue();

        InternalEntry h();
    }

    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        Segment a(MapMakerInternalMap mapMakerInternalMap, int i2);

        InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2);

        Strength c();

        void d(Segment segment, InternalEntry internalEntry, Object obj);

        InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry);

        Strength f();
    }

    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().X;
        }
    }

    public final class KeySet extends SafeToArraySet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return MapMakerInternalMap.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return MapMakerInternalMap.a(this).toArray(objArr);
        }
    }

    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public static final /* synthetic */ int h0 = 0;
        public final MapMakerInternalMap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public volatile int f19900Y;
        public int Z;
        public int e0;
        public volatile AtomicReferenceArray f0;
        public final AtomicInteger g0 = new AtomicInteger();

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i2) {
            this.X = mapMakerInternalMap;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i2);
            this.e0 = (atomicReferenceArray.length() * 3) / 4;
            this.f0 = atomicReferenceArray;
        }

        public final void a(ReferenceQueue referenceQueue) {
            int i2 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                InternalEntry internalEntry = (InternalEntry) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.X;
                mapMakerInternalMap.getClass();
                int iG = internalEntry.g();
                Segment segmentC = mapMakerInternalMap.c(iG);
                segmentC.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentC.f0;
                    int length = iG & (atomicReferenceArray.length() - 1);
                    InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                    for (InternalEntry internalEntryH = internalEntry2; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                        if (internalEntryH == internalEntry) {
                            segmentC.Z++;
                            InternalEntry internalEntryK = segmentC.k(internalEntry2, internalEntryH);
                            int i3 = segmentC.f19900Y - 1;
                            atomicReferenceArray.set(length, internalEntryK);
                            segmentC.f19900Y = i3;
                            break;
                        }
                    }
                    segmentC.unlock();
                    i2++;
                } catch (Throwable th) {
                    segmentC.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        public final void b(ReferenceQueue referenceQueue) {
            int i2 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                WeakValueReference weakValueReference = (WeakValueReference) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.X;
                mapMakerInternalMap.getClass();
                InternalEntry internalEntryA = weakValueReference.a();
                int iG = internalEntryA.g();
                Segment segmentC = mapMakerInternalMap.c(iG);
                Object key = internalEntryA.getKey();
                segmentC.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentC.f0;
                    int length = (atomicReferenceArray.length() - 1) & iG;
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                    for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                        Object key2 = internalEntryH.getKey();
                        if (internalEntryH.g() == iG && key2 != null && segmentC.X.f0.e(key, key2)) {
                            if (((WeakValueEntry) internalEntryH).d() != weakValueReference) {
                                break;
                            }
                            segmentC.Z++;
                            InternalEntry internalEntryK = segmentC.k(internalEntry, internalEntryH);
                            int i3 = segmentC.f19900Y - 1;
                            atomicReferenceArray.set(length, internalEntryK);
                            segmentC.f19900Y = i3;
                            break;
                        }
                    }
                    segmentC.unlock();
                    i2++;
                } catch (Throwable th) {
                    segmentC.unlock();
                    throw th;
                }
            } while (i2 != 16);
        }

        public final void d() {
            AtomicReferenceArray atomicReferenceArray = this.f0;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.f19900Y;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.e0 = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                InternalEntry internalEntryH = (InternalEntry) atomicReferenceArray.get(i3);
                if (internalEntryH != null) {
                    InternalEntry internalEntryH2 = internalEntryH.h();
                    int iG = internalEntryH.g() & length2;
                    if (internalEntryH2 == null) {
                        atomicReferenceArray2.set(iG, internalEntryH);
                    } else {
                        InternalEntry internalEntry = internalEntryH;
                        while (internalEntryH2 != null) {
                            int iG2 = internalEntryH2.g() & length2;
                            if (iG2 != iG) {
                                internalEntry = internalEntryH2;
                                iG = iG2;
                            }
                            internalEntryH2 = internalEntryH2.h();
                        }
                        atomicReferenceArray2.set(iG, internalEntry);
                        while (internalEntryH != internalEntry) {
                            int iG3 = internalEntryH.g() & length2;
                            InternalEntry internalEntryB = this.X.g0.b(m(), internalEntryH, (InternalEntry) atomicReferenceArray2.get(iG3));
                            if (internalEntryB != null) {
                                atomicReferenceArray2.set(iG3, internalEntryB);
                            } else {
                                i2--;
                            }
                            internalEntryH = internalEntryH.h();
                        }
                    }
                }
            }
            this.f0 = atomicReferenceArray2;
            this.f19900Y = i2;
        }

        public final InternalEntry e(int i2, Object obj) {
            if (this.f19900Y == 0) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f0;
            for (InternalEntry internalEntryH = (InternalEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i2); internalEntryH != null; internalEntryH = internalEntryH.h()) {
                if (internalEntryH.g() == i2) {
                    Object key = internalEntryH.getKey();
                    if (key == null) {
                        o();
                    } else if (this.X.f0.e(obj, key)) {
                        return internalEntryH;
                    }
                }
            }
            return null;
        }

        public void g() {
        }

        public void h() {
        }

        public final void i() {
            if ((this.g0.incrementAndGet() & 63) == 0) {
                l();
            }
        }

        public final Object j(Object obj, Object obj2, boolean z2, int i2) {
            lock();
            try {
                l();
                int i3 = this.f19900Y + 1;
                if (i3 > this.e0) {
                    d();
                    i3 = this.f19900Y + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f0;
                int length = (atomicReferenceArray.length() - 1) & i2;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                    Object key = internalEntryH.getKey();
                    if (internalEntryH.g() == i2 && key != null && this.X.f0.e(obj, key)) {
                        Object value = internalEntryH.getValue();
                        if (value == null) {
                            this.Z++;
                            n(internalEntryH, obj2);
                            this.f19900Y = this.f19900Y;
                            return null;
                        }
                        if (z2) {
                            return value;
                        }
                        this.Z++;
                        n(internalEntryH, obj2);
                        return value;
                    }
                }
                this.Z++;
                InternalEntry internalEntryE = this.X.g0.e(m(), obj, i2, internalEntry);
                n(internalEntryE, obj2);
                atomicReferenceArray.set(length, internalEntryE);
                this.f19900Y = i3;
                return null;
            } finally {
                unlock();
            }
        }

        public final InternalEntry k(InternalEntry internalEntry, InternalEntry internalEntry2) {
            int i2 = this.f19900Y;
            InternalEntry internalEntryH = internalEntry2.h();
            while (internalEntry != internalEntry2) {
                InternalEntry internalEntryB = this.X.g0.b(m(), internalEntry, internalEntryH);
                if (internalEntryB != null) {
                    internalEntryH = internalEntryB;
                } else {
                    i2--;
                }
                internalEntry = internalEntry.h();
            }
            this.f19900Y = i2;
            return internalEntryH;
        }

        public final void l() {
            if (tryLock()) {
                try {
                    h();
                    this.g0.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract Segment m();

        public final void n(InternalEntry internalEntry, Object obj) {
            this.X.g0.d(m(), internalEntry, obj);
        }

        public final void o() {
            if (tryLock()) {
                try {
                    h();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i2 = objectInputStream.readInt();
            MapMaker mapMaker = new MapMaker();
            Preconditions.f(i2 >= 0);
            mapMaker.f19892b = i2;
            mapMaker.b(this.X);
            Strength strength = mapMaker.f19894e;
            Preconditions.q(strength == null, "Value strength was already set to %s", strength);
            Strength strength2 = this.f19897Y;
            strength2.getClass();
            mapMaker.f19894e = strength2;
            if (strength2 != Strength.X) {
                mapMaker.f19891a = true;
            }
            Equivalence equivalence = mapMaker.f;
            Preconditions.q(equivalence == null, "key equivalence was already set to %s", equivalence);
            Equivalence equivalence2 = this.Z;
            equivalence2.getClass();
            mapMaker.f = equivalence2;
            mapMaker.f19891a = true;
            int i3 = mapMaker.f19893c;
            Preconditions.m(i3, "concurrency level was already set to %s", i3 == -1);
            int i4 = this.e0;
            Preconditions.f(i4 > 0);
            mapMaker.f19893c = i4;
            this.f0 = (AbstractMap) mapMaker.a();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f0.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f0;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f0.size());
            for (Map.Entry<K, V> entry : this.f0.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public enum Strength {
        X { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence d() {
                return Equivalence.d();
            }
        },
        f19901Y { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence d() {
                return Equivalence.g();
            }
        };

        public abstract Equivalence d();
    }

    public static class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                StrongKeyDummyValueEntry strongKeyDummyValueEntry2 = (StrongKeyDummyValueEntry) internalEntry2;
                Object obj = strongKeyDummyValueEntry.X;
                int i2 = strongKeyDummyValueEntry.f19898Y;
                return strongKeyDummyValueEntry2 == null ? new StrongKeyDummyValueEntry(obj, i2) : new LinkedStrongKeyDummyValueEntry(obj, i2, strongKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void d(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                return strongKeyDummyValueEntry == null ? new StrongKeyDummyValueEntry(obj, i2) : new LinkedStrongKeyDummyValueEntry(obj, i2, strongKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.X;
            }
        }

        public static final class LinkedStrongKeyDummyValueEntry<K> extends StrongKeyDummyValueEntry<K> {
            public final StrongKeyDummyValueEntry Z;

            public LinkedStrongKeyDummyValueEntry(Object obj, int i2, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
                super(obj, i2);
                this.Z = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ Object getValue() {
                return MapMaker.Dummy.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.Z;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.X;
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public static class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        public volatile Object Z;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f19902a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = (StrongKeyStrongValueEntry) internalEntry2;
                Object obj = strongKeyStrongValueEntry.X;
                int i2 = strongKeyStrongValueEntry.f19898Y;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry3 = strongKeyStrongValueEntry2 == null ? new StrongKeyStrongValueEntry(obj, i2) : new LinkedStrongKeyStrongValueEntry(obj, i2, strongKeyStrongValueEntry2);
                strongKeyStrongValueEntry3.Z = strongKeyStrongValueEntry.Z;
                return strongKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void d(Segment segment, InternalEntry internalEntry, Object obj) {
                ((StrongKeyStrongValueEntry) internalEntry).Z = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                return strongKeyStrongValueEntry == null ? new StrongKeyStrongValueEntry(obj, i2) : new LinkedStrongKeyStrongValueEntry(obj, i2, strongKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.X;
            }
        }

        public static final class LinkedStrongKeyStrongValueEntry<K, V> extends StrongKeyStrongValueEntry<K, V> {
            public final StrongKeyStrongValueEntry e0;

            public LinkedStrongKeyStrongValueEntry(Object obj, int i2, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
                super(obj, i2);
                this.e0 = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.e0;
            }
        }

        public StrongKeyStrongValueEntry(Object obj, int i2) {
            super(obj, i2);
            this.Z = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.Z;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public static class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        public volatile WeakValueReference Z;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f19903a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = (StrongKeyWeakValueEntry) internalEntry2;
                int i2 = Segment.h0;
                if (strongKeyWeakValueEntry.getValue() == null) {
                    return null;
                }
                Object obj = strongKeyWeakValueEntry.X;
                int i3 = strongKeyWeakValueEntry.f19898Y;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry3 = strongKeyWeakValueEntry2 == null ? new StrongKeyWeakValueEntry(obj, i3) : new LinkedStrongKeyWeakValueEntry(obj, i3, strongKeyWeakValueEntry2);
                strongKeyWeakValueEntry3.Z = strongKeyWeakValueEntry.Z.b(strongKeyWeakValueSegment.i0, strongKeyWeakValueEntry3);
                return strongKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.f19901Y;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void d(Segment segment, InternalEntry internalEntry, Object obj) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = strongKeyWeakValueEntry.Z;
                strongKeyWeakValueEntry.Z = new WeakValueReferenceImpl(((StrongKeyWeakValueSegment) segment).i0, obj, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                return strongKeyWeakValueEntry == null ? new StrongKeyWeakValueEntry(obj, i2) : new LinkedStrongKeyWeakValueEntry(obj, i2, strongKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.X;
            }
        }

        public static final class LinkedStrongKeyWeakValueEntry<K, V> extends StrongKeyWeakValueEntry<K, V> {
            public final StrongKeyWeakValueEntry e0;

            public LinkedStrongKeyWeakValueEntry(Object obj, int i2, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
                super(obj, i2);
                this.e0 = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.e0;
            }
        }

        public StrongKeyWeakValueEntry(Object obj, int i2) {
            super(obj, i2);
            this.Z = MapMakerInternalMap.k0;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference d() {
            return this.Z;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.Z.get();
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue i0;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2) {
            super(mapMakerInternalMap, i2);
            this.i0 = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            while (this.i0.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void h() {
            b(this.i0);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f19909Y;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return MapMakerInternalMap.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return MapMakerInternalMap.a(this).toArray(objArr);
        }
    }

    public static class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry2 = (WeakKeyDummyValueEntry) internalEntry2;
                K k = weakKeyDummyValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i2 = weakKeyDummyValueEntry.X;
                return weakKeyDummyValueEntry2 == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.i0, k, i2) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.i0, k, i2, weakKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void d(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                return weakKeyDummyValueEntry == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.i0, obj, i2) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.i0, obj, i2, weakKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.f19901Y;
            }
        }

        public static final class LinkedWeakKeyDummyValueEntry<K> extends WeakKeyDummyValueEntry<K> {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final WeakKeyDummyValueEntry f19904Y;

            public LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
                super(referenceQueue, obj, i2);
                this.f19904Y = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final /* bridge */ /* synthetic */ Object getValue() {
                return MapMaker.Dummy.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.f19904Y;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
            return MapMaker.Dummy.X;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        public final ReferenceQueue i0;

        public WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2) {
            super(mapMakerInternalMap, i2);
            this.i0 = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            while (this.i0.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void h() {
            a(this.i0);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public static class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public volatile Object f19905Y;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f19906a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = (WeakKeyStrongValueEntry) internalEntry2;
                K k = weakKeyStrongValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i2 = weakKeyStrongValueEntry.X;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry3 = weakKeyStrongValueEntry2 == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.i0, k, i2) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.i0, k, i2, weakKeyStrongValueEntry2);
                weakKeyStrongValueEntry3.f19905Y = weakKeyStrongValueEntry.f19905Y;
                return weakKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.X;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void d(Segment segment, InternalEntry internalEntry, Object obj) {
                ((WeakKeyStrongValueEntry) internalEntry).f19905Y = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                return weakKeyStrongValueEntry == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.i0, obj, i2) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.i0, obj, i2, weakKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.f19901Y;
            }
        }

        public static final class LinkedWeakKeyStrongValueEntry<K, V> extends WeakKeyStrongValueEntry<K, V> {
            public final WeakKeyStrongValueEntry Z;

            public LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
                super(referenceQueue, obj, i2);
                this.Z = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.Z;
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i2) {
            super(referenceQueue, obj, i2);
            this.f19905Y = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f19905Y;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue i0;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2) {
            super(mapMakerInternalMap, i2);
            this.i0 = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            while (this.i0.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void h() {
            a(this.i0);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public static class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public volatile WeakValueReference f19907Y;

        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f19908a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i2) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = (WeakKeyWeakValueEntry) internalEntry2;
                K k = weakKeyWeakValueEntry.get();
                if (k == null) {
                    return null;
                }
                int i2 = Segment.h0;
                if (weakKeyWeakValueEntry.f19907Y.get() == null) {
                    return null;
                }
                int i3 = weakKeyWeakValueEntry.X;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry3 = weakKeyWeakValueEntry2 == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.i0, k, i3) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.i0, k, i3, weakKeyWeakValueEntry2);
                weakKeyWeakValueEntry3.f19907Y = weakKeyWeakValueEntry.f19907Y.b(weakKeyWeakValueSegment.j0, weakKeyWeakValueEntry3);
                return weakKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.f19901Y;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void d(Segment segment, InternalEntry internalEntry, Object obj) {
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = weakKeyWeakValueEntry.f19907Y;
                weakKeyWeakValueEntry.f19907Y = new WeakValueReferenceImpl(((WeakKeyWeakValueSegment) segment).j0, obj, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry e(Segment segment, Object obj, int i2, InternalEntry internalEntry) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                return weakKeyWeakValueEntry == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.i0, obj, i2) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.i0, obj, i2, weakKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength f() {
                return Strength.f19901Y;
            }
        }

        public static final class LinkedWeakKeyWeakValueEntry<K, V> extends WeakKeyWeakValueEntry<K, V> {
            public final WeakKeyWeakValueEntry Z;

            public LinkedWeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i2, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
                super(referenceQueue, obj, i2);
                this.Z = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry h() {
                return this.Z;
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i2) {
            super(referenceQueue, obj, i2);
            this.f19907Y = MapMakerInternalMap.k0;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference d() {
            return this.f19907Y;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f19907Y.get();
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue i0;
        public final ReferenceQueue j0;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i2) {
            super(mapMakerInternalMap, i2);
            this.i0 = new ReferenceQueue();
            this.j0 = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            while (this.i0.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void h() {
            a(this.i0);
            b(this.j0);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment m() {
            return this;
        }
    }

    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference d();
    }

    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        InternalEntry a();

        WeakValueReference b(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry);

        void clear();

        Object get();
    }

    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        public final InternalEntry X;

        public WeakValueReferenceImpl(ReferenceQueue referenceQueue, Object obj, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.X = internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final InternalEntry a() {
            return this.X;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference b(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return new WeakValueReferenceImpl(referenceQueue, get(), weakValueEntry);
        }
    }

    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19909Y;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.X = obj;
            this.f19909Y = obj2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.X.equals(entry.getKey()) && this.f19909Y.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f19909Y;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final int hashCode() {
            return this.X.hashCode() ^ this.f19909Y.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = MapMakerInternalMap.this.put(this.X, obj);
            this.f19909Y = obj;
            return objPut;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper internalEntryHelper) {
        int i2 = mapMaker.f19893c;
        this.e0 = Math.min(i2 == -1 ? 4 : i2, 65536);
        this.f0 = (Equivalence) MoreObjects.a(mapMaker.f, ((Strength) MoreObjects.a(mapMaker.d, Strength.X)).d());
        this.g0 = internalEntryHelper;
        int i3 = mapMaker.f19892b;
        int iMin = Math.min(i3 == -1 ? 16 : i3, 1073741824);
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i6 < this.e0) {
            i7++;
            i6 <<= 1;
        }
        this.f19896Y = 32 - i7;
        this.X = i6 - 1;
        this.Z = new Segment[i6];
        int i8 = iMin / i6;
        while (i4 < (i6 * i8 < iMin ? i8 + 1 : i8)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.Z;
            if (i5 >= segmentArr.length) {
                return;
            }
            segmentArr[i5] = this.g0.a(this, i4);
            i5++;
        }
    }

    public static ArrayList a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterators.a(arrayList, abstractCollection.iterator());
        return arrayList;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int b(Object obj) {
        int iB = this.f0.b(obj);
        int i2 = iB + ((iB << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public final Segment c(int i2) {
        return this.Z[(i2 >>> this.f19896Y) & this.X];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.Z) {
            if (segment.f19900Y != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.f0;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    segment.g();
                    segment.g0.set(0);
                    segment.Z++;
                    segment.f19900Y = 0;
                    segment.unlock();
                } catch (Throwable th) {
                    segment.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.getClass();
        try {
            if (segmentC.f19900Y == 0) {
                return false;
            }
            InternalEntry internalEntryE = segmentC.e(iB, obj);
            if (internalEntryE != null && internalEntryE.getValue() != null) {
                z2 = true;
            }
            return z2;
        } finally {
            segmentC.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            Segment[] segmentArr = this.Z;
            long j = -1;
            int i2 = 0;
            while (i2 < 3) {
                int length = segmentArr.length;
                long j2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    Segment segment = segmentArr[i3];
                    int i4 = segment.f19900Y;
                    AtomicReferenceArray atomicReferenceArray = segment.f0;
                    for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                        for (InternalEntry internalEntryH = (InternalEntry) atomicReferenceArray.get(i5); internalEntryH != null; internalEntryH = internalEntryH.h()) {
                            if (internalEntryH.getKey() == null || (value = internalEntryH.getValue()) == null) {
                                segment.o();
                                value = null;
                            }
                            if (value != null && this.g0.c().d().e(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j2 += (long) segment.Z;
                }
                if (j2 == j) {
                    return false;
                }
                i2++;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.j0;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.j0 = entrySet;
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.getClass();
        try {
            InternalEntry internalEntryE = segmentC.e(iB, obj);
            if (internalEntryE == null) {
                return null;
            }
            Object value = internalEntryE.getValue();
            if (value == null) {
                segmentC.o();
            }
            return value;
        } finally {
            segmentC.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.Z;
        long j = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f19900Y != 0) {
                return false;
            }
            j += (long) segmentArr[i2].Z;
        }
        if (j == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].f19900Y != 0) {
                return false;
            }
            j -= (long) segmentArr[i3].Z;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h0;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.h0 = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iB = b(obj);
        return c(iB).j(obj, obj2, false, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iB = b(obj);
        return c(iB).j(obj, obj2, true, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.lock();
        try {
            segmentC.l();
            AtomicReferenceArray atomicReferenceArray = segmentC.f0;
            int length = (atomicReferenceArray.length() - 1) & iB;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                Object key = internalEntryH.getKey();
                if (internalEntryH.g() == iB && key != null && segmentC.X.f0.e(obj, key)) {
                    Object value = internalEntryH.getValue();
                    if (value == null && internalEntryH.getValue() != null) {
                        return null;
                    }
                    segmentC.Z++;
                    InternalEntry internalEntryK = segmentC.k(internalEntry, internalEntryH);
                    int i2 = segmentC.f19900Y - 1;
                    atomicReferenceArray.set(length, internalEntryK);
                    segmentC.f19900Y = i2;
                    return value;
                }
            }
            return null;
        } finally {
            segmentC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.lock();
        try {
            segmentC.l();
            AtomicReferenceArray atomicReferenceArray = segmentC.f0;
            int length = (atomicReferenceArray.length() - 1) & iB;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                Object key = internalEntryH.getKey();
                if (internalEntryH.g() == iB && key != null && segmentC.X.f0.e(obj, key)) {
                    Object value = internalEntryH.getValue();
                    if (value != null) {
                        segmentC.Z++;
                        segmentC.n(internalEntryH, obj2);
                        return value;
                    }
                    if (internalEntryH.getValue() == null) {
                        segmentC.Z++;
                        InternalEntry internalEntryK = segmentC.k(internalEntry, internalEntryH);
                        int i2 = segmentC.f19900Y - 1;
                        atomicReferenceArray.set(length, internalEntryK);
                        segmentC.f19900Y = i2;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            segmentC.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (Segment segment : this.Z) {
            j += (long) segment.f19900Y;
        }
        return Ints.e(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.i0;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.i0 = values;
        return values;
    }

    public Object writeReplace() {
        InternalEntryHelper internalEntryHelper = this.g0;
        return new SerializationProxy(internalEntryHelper.f(), internalEntryHelper.c(), this.f0, this.e0, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z2 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.lock();
        try {
            segmentC.l();
            AtomicReferenceArray atomicReferenceArray = segmentC.f0;
            int length = (atomicReferenceArray.length() - 1) & iB;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                Object key = internalEntryH.getKey();
                if (internalEntryH.g() == iB && key != null && segmentC.X.f0.e(obj, key)) {
                    if (segmentC.X.g0.c().d().e(obj2, internalEntryH.getValue())) {
                        z2 = true;
                    } else if (internalEntryH.getValue() != null) {
                        return false;
                    }
                    segmentC.Z++;
                    InternalEntry internalEntryK = segmentC.k(internalEntry, internalEntryH);
                    int i2 = segmentC.f19900Y - 1;
                    atomicReferenceArray.set(length, internalEntryK);
                    segmentC.f19900Y = i2;
                    return z2;
                }
            }
            return false;
        } finally {
            segmentC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iB = b(obj);
        Segment segmentC = c(iB);
        segmentC.lock();
        try {
            segmentC.l();
            AtomicReferenceArray atomicReferenceArray = segmentC.f0;
            int length = (atomicReferenceArray.length() - 1) & iB;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryH = internalEntry; internalEntryH != null; internalEntryH = internalEntryH.h()) {
                Object key = internalEntryH.getKey();
                if (internalEntryH.g() == iB && key != null && segmentC.X.f0.e(obj, key)) {
                    Object value = internalEntryH.getValue();
                    if (value == null) {
                        if (internalEntryH.getValue() == null) {
                            segmentC.Z++;
                            InternalEntry internalEntryK = segmentC.k(internalEntry, internalEntryH);
                            int i2 = segmentC.f19900Y - 1;
                            atomicReferenceArray.set(length, internalEntryK);
                            segmentC.f19900Y = i2;
                        }
                        return false;
                    }
                    if (!segmentC.X.g0.c().d().e(obj2, value)) {
                        return false;
                    }
                    segmentC.Z++;
                    segmentC.n(internalEntryH, obj3);
                    return true;
                }
            }
            return false;
        } finally {
            segmentC.unlock();
        }
    }
}
