package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger w0 = Logger.getLogger(LocalCache.class.getName());
    public static final AnonymousClass1 x0 = new AnonymousClass1();
    public static final Queue y0 = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return ImmutableSet.y().iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    };
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19750Y;
    public final Segment[] Z;
    public final int e0;
    public final Equivalence f0;
    public final Equivalence g0;
    public final Strength h0;
    public final Strength i0;
    public final long j0;
    public final Weigher k0;
    public final long l0;
    public final long m0;
    public final AbstractQueue n0;
    public final RemovalListener o0;
    public final Ticker p0;
    public final EntryFactory q0;
    public final AbstractCache.StatsCounter r0;
    public final CacheLoader s0;
    public Set t0;
    public Collection u0;
    public Set v0;

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$1, reason: invalid class name */
    public class AnonymousClass1 implements ValueReference<Object, Object> {
        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int c() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isLoading() {
            return false;
        }
    }

    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return LocalCache.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return LocalCache.a(this).toArray(objArr);
        }
    }

    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void l(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void n(ValueReference valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void p(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long q() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void r(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void s(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final AnonymousClass1 X;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$AccessQueue$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public ReferenceEntry f19751Y;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry i() {
                return this.f19751Y;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry k() {
                return this.X;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void l(ReferenceEntry referenceEntry) {
                this.f19751Y = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void p(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long q() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void s(ReferenceEntry referenceEntry) {
                this.X = referenceEntry;
            }
        }

        public AccessQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.X = anonymousClass1;
            anonymousClass1.f19751Y = anonymousClass1;
            this.X = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryK = referenceEntry.k();
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                referenceEntry.s(nullEntry);
                referenceEntry.l(nullEntry);
                referenceEntry = referenceEntryK;
            }
            anonymousClass1.X = anonymousClass1;
            anonymousClass1.f19751Y = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).k() != NullEntry.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.X;
            return anonymousClass1.X == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryK = ((ReferenceEntry) obj).k();
                    if (referenceEntryK == AccessQueue.this.X) {
                        return null;
                    }
                    return referenceEntryK;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryI = referenceEntry.i();
            ReferenceEntry referenceEntryK = referenceEntry.k();
            Logger logger = LocalCache.w0;
            referenceEntryI.s(referenceEntryK);
            referenceEntryK.l(referenceEntryI);
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry2 = anonymousClass1.f19751Y;
            referenceEntry2.s(referenceEntry);
            referenceEntry.l(referenceEntry2);
            referenceEntry.s(anonymousClass1);
            anonymousClass1.f19751Y = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryI = referenceEntry.i();
            ReferenceEntry referenceEntryK = referenceEntry.k();
            Logger logger = LocalCache.w0;
            referenceEntryI.s(referenceEntryK);
            referenceEntryK.l(referenceEntryI);
            NullEntry nullEntry = NullEntry.X;
            referenceEntry.s(nullEntry);
            referenceEntry.l(nullEntry);
            return referenceEntryK != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.X;
            int i2 = 0;
            for (ReferenceEntry referenceEntryK = anonymousClass1.X; referenceEntryK != anonymousClass1; referenceEntryK = referenceEntryK.k()) {
                i2++;
            }
            return i2;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
  (r9v0 com.google.common.cache.LocalCache$EntryFactory) from 0x0047: FILLED_NEW_ARRAY 
  (r9v0 com.google.common.cache.LocalCache$EntryFactory)
  (r10v0 com.google.common.cache.LocalCache$EntryFactory)
  (r11v0 com.google.common.cache.LocalCache$EntryFactory)
  (r12v0 com.google.common.cache.LocalCache$EntryFactory)
  (r13v0 com.google.common.cache.LocalCache$EntryFactory)
  (r14v0 com.google.common.cache.LocalCache$EntryFactory)
  (r15v0 com.google.common.cache.LocalCache$EntryFactory)
  (r16v0 com.google.common.cache.LocalCache$EntryFactory)
 A[WRAPPED] (LINE:72) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class EntryFactory {
        /* JADX INFO: Fake field, exist only in values array */
        EF9 { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return new StrongEntry(obj, i2, referenceEntry);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF10 { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongAccessEntry strongAccessEntry = new StrongAccessEntry(obj, i2, referenceEntry);
                strongAccessEntry.f0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                strongAccessEntry.g0 = nullEntry;
                strongAccessEntry.h0 = nullEntry;
                return strongAccessEntry;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF11 { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.d(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongWriteEntry strongWriteEntry = new StrongWriteEntry(obj, i2, referenceEntry);
                strongWriteEntry.f0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                strongWriteEntry.g0 = nullEntry;
                strongWriteEntry.h0 = nullEntry;
                return strongWriteEntry;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF12 { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                EntryFactory.d(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongAccessWriteEntry strongAccessWriteEntry = new StrongAccessWriteEntry(obj, i2, referenceEntry);
                strongAccessWriteEntry.f0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                strongAccessWriteEntry.g0 = nullEntry;
                strongAccessWriteEntry.h0 = nullEntry;
                strongAccessWriteEntry.i0 = Long.MAX_VALUE;
                strongAccessWriteEntry.j0 = nullEntry;
                strongAccessWriteEntry.k0 = nullEntry;
                return strongAccessWriteEntry;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF13 { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return new WeakEntry(i2, referenceEntry, obj, segment.i0);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF14 { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakAccessEntry weakAccessEntry = new WeakAccessEntry(i2, referenceEntry, obj, segment.i0);
                weakAccessEntry.e0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                weakAccessEntry.f0 = nullEntry;
                weakAccessEntry.g0 = nullEntry;
                return weakAccessEntry;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF15 { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.d(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakWriteEntry weakWriteEntry = new WeakWriteEntry(i2, referenceEntry, obj, segment.i0);
                weakWriteEntry.e0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                weakWriteEntry.f0 = nullEntry;
                weakWriteEntry.g0 = nullEntry;
                return weakWriteEntry;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF16 { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                EntryFactory.d(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakAccessWriteEntry weakAccessWriteEntry = new WeakAccessWriteEntry(i2, referenceEntry, obj, segment.i0);
                weakAccessWriteEntry.e0 = Long.MAX_VALUE;
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                weakAccessWriteEntry.f0 = nullEntry;
                weakAccessWriteEntry.g0 = nullEntry;
                weakAccessWriteEntry.h0 = Long.MAX_VALUE;
                weakAccessWriteEntry.i0 = nullEntry;
                weakAccessWriteEntry.j0 = nullEntry;
                return weakAccessWriteEntry;
            }
        };

        public static final EntryFactory[] X;

        static {
            X = new EntryFactory[]{entryFactory, entryFactory, entryFactory, entryFactory, entryFactory, entryFactory, entryFactory, entryFactory};
        }

        public static void a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.p(referenceEntry.q());
            ReferenceEntry referenceEntryI = referenceEntry.i();
            Logger logger = LocalCache.w0;
            referenceEntryI.s(referenceEntry2);
            referenceEntry2.l(referenceEntryI);
            ReferenceEntry referenceEntryK = referenceEntry.k();
            referenceEntry2.s(referenceEntryK);
            referenceEntryK.l(referenceEntry2);
            NullEntry nullEntry = NullEntry.X;
            referenceEntry.s(nullEntry);
            referenceEntry.l(nullEntry);
        }

        public static void d(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.r(referenceEntry.o());
            ReferenceEntry referenceEntryM = referenceEntry.m();
            Logger logger = LocalCache.w0;
            referenceEntryM.t(referenceEntry2);
            referenceEntry2.u(referenceEntryM);
            ReferenceEntry referenceEntryJ = referenceEntry.j();
            referenceEntry2.t(referenceEntryJ);
            referenceEntryJ.u(referenceEntry2);
            NullEntry nullEntry = NullEntry.X;
            referenceEntry.t(nullEntry);
            referenceEntry.u(nullEntry);
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) f19753Y.clone();
        }

        public ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
            return f(referenceEntry.g(), segment, referenceEntry2, obj);
        }

        public abstract ReferenceEntry f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
    }

    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            LocalCache localCache;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (localCache = LocalCache.this).get(key)) != null && localCache.g0.e(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class HashIterator<T> implements Iterator<T> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19755Y = -1;
        public Segment Z;
        public AtomicReferenceArray e0;
        public ReferenceEntry f0;
        public WriteThroughEntry g0;
        public WriteThroughEntry h0;

        public HashIterator() {
            this.X = LocalCache.this.Z.length - 1;
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
                Segment[] segmentArr = LocalCache.this.Z;
                this.X = i2 - 1;
                Segment segment = segmentArr[i2];
                this.Z = segment;
                if (segment.f19760Y != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.Z.g0;
                    this.e0 = atomicReferenceArray;
                    this.f19755Y = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(ReferenceEntry referenceEntry) {
            Object obj;
            Segment segment;
            LocalCache localCache = LocalCache.this;
            try {
                long jA = localCache.p0.a();
                Object key = referenceEntry.getKey();
                Object obj2 = null;
                if (referenceEntry.getKey() != null && (obj = referenceEntry.d().get()) != null && !localCache.f(referenceEntry, jA)) {
                    obj2 = obj;
                }
                if (obj2 == null) {
                    return false;
                }
                this.g0 = new WriteThroughEntry(key, obj2);
                return true;
            } finally {
                this.Z.p();
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
            ReferenceEntry referenceEntry = this.f0;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f0 = referenceEntry.h();
                ReferenceEntry referenceEntry2 = this.f0;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.f0;
            }
        }

        public final boolean e() {
            while (true) {
                int i2 = this.f19755Y;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.e0;
                this.f19755Y = i2 - 1;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i2);
                this.f0 = referenceEntry;
                if (referenceEntry != null && (b(referenceEntry) || d())) {
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
            Preconditions.p(this.h0 != null);
            LocalCache.this.remove(this.h0.X);
            this.h0 = null;
        }
    }

    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().X;
        }
    }

    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public transient LoadingCache o0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.o0 = y().a(this.m0);
        }

        private Object readResolve() {
            return this.o0;
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return ((LocalLoadingCache) this.o0).apply(obj);
        }
    }

    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        public volatile ValueReference X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final SettableFuture f19757Y;
        public final Stopwatch Z;
        public final Thread e0;

        public LoadingValueReference() {
            AnonymousClass1 anonymousClass1 = LocalCache.x0;
            this.f19757Y = new SettableFuture();
            this.Z = new Stopwatch();
            this.X = anonymousClass1;
            this.e0 = Thread.currentThread();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void b(Object obj) {
            if (obj != null) {
                this.f19757Y.o(obj);
            } else {
                this.X = LocalCache.x0;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int c() {
            return this.X.c();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return Uninterruptibles.a(this.f19757Y);
        }

        /* JADX WARN: Type inference failed for: r6v6, types: [com.google.common.cache.a] */
        public final ListenableFuture f(Object obj, CacheLoader cacheLoader) {
            try {
                Stopwatch stopwatch = this.Z;
                Preconditions.o("This stopwatch is already running.", !stopwatch.f19724a);
                stopwatch.f19724a = true;
                stopwatch.f19725b = System.nanoTime();
                Object obj2 = this.X.get();
                if (obj2 == null) {
                    Object objA = cacheLoader.a(obj);
                    return this.f19757Y.o(objA) ? this.f19757Y : Futures.c(objA);
                }
                ListenableFuture listenableFutureB = cacheLoader.b(obj, obj2);
                return listenableFutureB == null ? Futures.c(null) : Futures.d(listenableFutureB, new Function() { // from class: com.google.common.cache.a
                    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                    public final Object apply(Object obj3) {
                        this.X.f19757Y.o(obj3);
                        return obj3;
                    }
                });
            } catch (Throwable th) {
                ListenableFuture listenableFutureB2 = this.f19757Y.p(th) ? this.f19757Y : Futures.b(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureB2;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.X.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return this.X.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isLoading() {
            return true;
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            try {
                return get(obj);
            } catch (ExecutionException e2) {
                throw new UncheckedExecutionException(e2.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public final Object get(Object obj) {
            ReferenceEntry referenceEntryM;
            LocalCache localCache = this.X;
            CacheLoader cacheLoader = localCache.s0;
            obj.getClass();
            int iE = localCache.e(obj);
            Segment segmentG = localCache.g(iE);
            segmentG.getClass();
            cacheLoader.getClass();
            try {
                try {
                    if (segmentG.f19760Y != 0 && (referenceEntryM = segmentG.m(iE, obj)) != null) {
                        long jA = segmentG.X.p0.a();
                        Object objN = segmentG.n(referenceEntryM, jA);
                        if (objN != null) {
                            segmentG.s(referenceEntryM, jA);
                            segmentG.o0.e();
                            segmentG.X.getClass();
                            segmentG.p();
                            return objN;
                        }
                        ValueReference valueReferenceD = referenceEntryM.d();
                        if (valueReferenceD.isLoading()) {
                            Object objC = segmentG.C(referenceEntryM, obj, valueReferenceD);
                            segmentG.p();
                            return objC;
                        }
                    }
                    Object objO = segmentG.o(obj, iE, cacheLoader);
                    segmentG.p();
                    return objO;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e2;
                }
            } catch (Throwable th) {
                segmentG.p();
                throw th;
            }
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.X);
        }
    }

    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public final LocalCache X;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$LocalManualCache$1, reason: invalid class name */
        class AnonymousClass1 extends CacheLoader<Object, Object> {
            @Override // com.google.common.cache.CacheLoader
            public final Object a(Object obj) {
                throw null;
            }
        }

        public LocalManualCache(LocalCache localCache) {
            this.X = localCache;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.X);
        }
    }

    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final Strength X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Strength f19758Y;
        public final Equivalence Z;
        public final Equivalence e0;
        public final long f0;
        public final long g0;
        public final long h0;
        public final Weigher i0;
        public final int j0;
        public final RemovalListener k0;
        public final Ticker l0;
        public final CacheLoader m0;
        public transient Cache n0;

        public ManualSerializationProxy(LocalCache localCache) {
            this.X = localCache.h0;
            this.f19758Y = localCache.i0;
            this.Z = localCache.f0;
            this.e0 = localCache.g0;
            this.f0 = localCache.m0;
            this.g0 = localCache.l0;
            this.h0 = localCache.j0;
            this.i0 = localCache.k0;
            this.j0 = localCache.e0;
            this.k0 = localCache.o0;
            Ticker ticker = Ticker.f19732a;
            Ticker ticker2 = localCache.p0;
            this.l0 = (ticker2 == ticker || ticker2 == CacheBuilder.f19737p) ? null : ticker2;
            this.m0 = localCache.s0;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            CacheBuilder cacheBuilderY = y();
            cacheBuilderY.b();
            this.n0 = new LocalManualCache(new LocalCache(cacheBuilderY, null));
        }

        private Object readResolve() {
            return this.n0;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.n0;
        }

        @Override // com.google.common.cache.ForwardingCache
        public final Cache x() {
            return this.n0;
        }

        public final CacheBuilder y() {
            CacheBuilder cacheBuilderC = CacheBuilder.c();
            Strength strength = cacheBuilderC.f;
            Preconditions.q(strength == null, "Key strength was already set to %s", strength);
            Strength strength2 = this.X;
            strength2.getClass();
            cacheBuilderC.f = strength2;
            Strength strength3 = cacheBuilderC.g;
            Preconditions.q(strength3 == null, "Value strength was already set to %s", strength3);
            Strength strength4 = this.f19758Y;
            strength4.getClass();
            cacheBuilderC.g = strength4;
            Equivalence equivalence = cacheBuilderC.j;
            Preconditions.q(equivalence == null, "key equivalence was already set to %s", equivalence);
            Equivalence equivalence2 = this.Z;
            equivalence2.getClass();
            cacheBuilderC.j = equivalence2;
            Equivalence equivalence3 = cacheBuilderC.k;
            Preconditions.q(equivalence3 == null, "value equivalence was already set to %s", equivalence3);
            Equivalence equivalence4 = this.e0;
            equivalence4.getClass();
            cacheBuilderC.k = equivalence4;
            int i2 = cacheBuilderC.f19739b;
            Preconditions.m(i2, "concurrency level was already set to %s", i2 == -1);
            int i3 = this.j0;
            Preconditions.f(i3 > 0);
            cacheBuilderC.f19739b = i3;
            Preconditions.p(cacheBuilderC.f19744l == null);
            RemovalListener removalListener = this.k0;
            removalListener.getClass();
            cacheBuilderC.f19744l = removalListener;
            cacheBuilderC.f19738a = false;
            long j = this.f0;
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j2 = cacheBuilderC.f19742h;
                Preconditions.n(j2, j2 == -1, "expireAfterWrite was already set to %s ns");
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(Strings.a("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
                }
                cacheBuilderC.f19742h = timeUnit.toNanos(j);
            }
            long j3 = this.g0;
            if (j3 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j4 = cacheBuilderC.f19743i;
                Preconditions.n(j4, j4 == -1, "expireAfterAccess was already set to %s ns");
                if (!(j3 >= 0)) {
                    throw new IllegalArgumentException(Strings.a("duration cannot be negative: %s %s", Long.valueOf(j3), timeUnit2));
                }
                cacheBuilderC.f19743i = timeUnit2.toNanos(j3);
            }
            CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.X;
            long j5 = this.h0;
            Weigher weigher = this.i0;
            if (weigher != oneWeigher) {
                Preconditions.p(cacheBuilderC.f19741e == null);
                if (cacheBuilderC.f19738a) {
                    long j6 = cacheBuilderC.f19740c;
                    Preconditions.n(j6, j6 == -1, "weigher can not be combined with maximum size (%s provided)");
                }
                weigher.getClass();
                cacheBuilderC.f19741e = weigher;
                if (j5 != -1) {
                    long j7 = cacheBuilderC.d;
                    Preconditions.n(j7, j7 == -1, "maximum weight was already set to %s");
                    long j8 = cacheBuilderC.f19740c;
                    Preconditions.n(j8, j8 == -1, "maximum size was already set to %s");
                    Preconditions.e("maximum weight must not be negative", j5 >= 0);
                    cacheBuilderC.d = j5;
                }
            } else if (j5 != -1) {
                long j9 = cacheBuilderC.f19740c;
                Preconditions.n(j9, j9 == -1, "maximum size was already set to %s");
                long j10 = cacheBuilderC.d;
                Preconditions.n(j10, j10 == -1, "maximum weight was already set to %s");
                Preconditions.o("maximum size can not be combined with weigher", cacheBuilderC.f19741e == null);
                Preconditions.e("maximum size must not be negative", j5 >= 0);
                cacheBuilderC.f19740c = j5;
            }
            Ticker ticker = this.l0;
            if (ticker != null) {
                Preconditions.p(cacheBuilderC.m == null);
                cacheBuilderC.m = ticker;
            }
            return cacheBuilderC;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NullEntry implements ReferenceEntry<Object, Object> {
        public static final NullEntry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ NullEntry[] f19759Y;

        static {
            NullEntry nullEntry = new NullEntry("INSTANCE", 0);
            X = nullEntry;
            f19759Y = new NullEntry[]{nullEntry};
        }

        public static NullEntry valueOf(String str) {
            return (NullEntry) Enum.valueOf(NullEntry.class, str);
        }

        public static NullEntry[] values() {
            return (NullEntry[]) f19759Y.clone();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference d() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int g() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry h() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry i() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry k() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void l(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry m() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void n(ValueReference valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long o() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void p(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long q() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void r(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
        }
    }

    public static class Segment<K, V> extends ReentrantLock {
        public final LocalCache X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public volatile int f19760Y;
        public long Z;
        public int e0;
        public int f0;
        public volatile AtomicReferenceArray g0;
        public final long h0;
        public final ReferenceQueue i0;
        public final ReferenceQueue j0;
        public final AbstractQueue k0;
        public final AtomicInteger l0 = new AtomicInteger();
        public final AbstractQueue m0;
        public final AbstractQueue n0;
        public final AbstractCache.StatsCounter o0;

        public Segment(LocalCache localCache, int i2, long j, AbstractCache.StatsCounter statsCounter) {
            this.X = localCache;
            this.h0 = j;
            statsCounter.getClass();
            this.o0 = statsCounter;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i2);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f0 = length;
            if (localCache.k0 == CacheBuilder.OneWeigher.X && length == j) {
                this.f0 = length + 1;
            }
            this.g0 = atomicReferenceArray;
            Strength.AnonymousClass1 anonymousClass1 = Strength.X;
            this.i0 = localCache.h0 != anonymousClass1 ? new ReferenceQueue() : null;
            this.j0 = localCache.i0 != anonymousClass1 ? new ReferenceQueue() : null;
            this.k0 = (AbstractQueue) ((localCache.c() || localCache.b()) ? new ConcurrentLinkedQueue() : LocalCache.y0);
            this.m0 = (AbstractQueue) (localCache.d() ? new WriteQueue() : LocalCache.y0);
            this.n0 = (AbstractQueue) ((localCache.c() || localCache.b()) ? new AccessQueue() : LocalCache.y0);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final void A(Object obj, int i2, LoadingValueReference loadingValueReference, Object obj2) throws Throwable {
            Throwable th;
            ReferenceEntry referenceEntryH;
            Segment<K, V> segment;
            Throwable th2;
            lock();
            try {
                long jA = this.X.p0.a();
                x(jA);
                int i3 = this.f19760Y + 1;
                if (i3 <= this.f0) {
                    AtomicReferenceArray atomicReferenceArray = this.g0;
                    int length = i2 & (atomicReferenceArray.length() - 1);
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                    referenceEntryH = referenceEntry;
                    while (referenceEntryH != null) {
                        Object key = referenceEntryH.getKey();
                        if (referenceEntryH.g() == i2) {
                        }
                        Object obj3 = obj;
                        Object obj4 = obj2;
                        segment = this;
                        referenceEntryH = referenceEntryH.h();
                        obj = obj3;
                        obj2 = obj4;
                    }
                    Object obj5 = obj;
                    Object obj6 = obj2;
                    this.e0++;
                    EntryFactory entryFactory = this.X.q0;
                    obj5.getClass();
                    ReferenceEntry referenceEntryF = entryFactory.f(i2, this, referenceEntry, obj5);
                    z(referenceEntryF, obj5, obj6, jA);
                    atomicReferenceArray.set(length, referenceEntryF);
                    this.f19760Y = i3;
                    i(referenceEntryF);
                    unlock();
                    y();
                    return;
                }
                try {
                    j();
                    i3 = this.f19760Y + 1;
                    AtomicReferenceArray atomicReferenceArray2 = this.g0;
                    int length2 = i2 & (atomicReferenceArray2.length() - 1);
                    ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                    referenceEntryH = referenceEntry2;
                    while (referenceEntryH != null) {
                        try {
                            Object key2 = referenceEntryH.getKey();
                            if (referenceEntryH.g() == i2 || key2 == null || !this.X.f0.e(obj, key2)) {
                                Object obj7 = obj;
                                Object obj8 = obj2;
                                segment = this;
                                try {
                                    referenceEntryH = referenceEntryH.h();
                                    obj = obj7;
                                    obj2 = obj8;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                ValueReference valueReferenceD = referenceEntryH.d();
                                Object obj9 = valueReferenceD.get();
                                RemovalCause removalCause = RemovalCause.f19771Y;
                                if (loadingValueReference != valueReferenceD && (obj9 != null || valueReferenceD == LocalCache.x0)) {
                                    h(obj, obj2, 0, removalCause);
                                    unlock();
                                    y();
                                    return;
                                }
                                this.e0++;
                                try {
                                    if (loadingValueReference.X.isActive()) {
                                        if (obj9 == null) {
                                            removalCause = RemovalCause.Z;
                                        }
                                        h(obj, obj9, loadingValueReference.X.c(), removalCause);
                                        i3--;
                                    }
                                    try {
                                        z(referenceEntryH, obj, obj2, jA);
                                        segment = this;
                                        segment.f19760Y = i3;
                                        i(referenceEntryH);
                                        unlock();
                                        y();
                                        return;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    segment = this;
                                    th2 = th;
                                }
                            }
                            th = th3;
                        } catch (Throwable th6) {
                            th = th6;
                            segment = this;
                        }
                        th2 = th;
                        th = th2;
                    }
                    Object obj10 = obj;
                    Object obj11 = obj2;
                    try {
                        this.e0++;
                        EntryFactory entryFactory2 = this.X.q0;
                        obj10.getClass();
                        ReferenceEntry referenceEntryF2 = entryFactory2.f(i2, this, referenceEntry2, obj10);
                        try {
                            z(referenceEntryF2, obj10, obj11, jA);
                            atomicReferenceArray2.set(length2, referenceEntryF2);
                            this.f19760Y = i3;
                            i(referenceEntryF2);
                            unlock();
                            y();
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            th = th;
                            unlock();
                            y();
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
            unlock();
            y();
            throw th;
        }

        public final void B() {
            if (tryLock()) {
                try {
                    g();
                } finally {
                    unlock();
                }
            }
        }

        public final Object C(ReferenceEntry referenceEntry, Object obj, ValueReference valueReference) {
            AbstractCache.StatsCounter statsCounter = this.o0;
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            if (valueReference instanceof LoadingValueReference) {
                Preconditions.q(((LoadingValueReference) valueReference).e0 != Thread.currentThread(), "Recursive load of: %s", obj);
            }
            try {
                Object objE = valueReference.e();
                if (objE != null) {
                    s(referenceEntry, this.X.p0.a());
                    statsCounter.a();
                    return objE;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + mo.ono);
            } catch (Throwable th) {
                statsCounter.a();
                throw th;
            }
        }

        public final ReferenceEntry a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            Object key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference valueReferenceD = referenceEntry.d();
            Object obj = valueReferenceD.get();
            if (obj == null && valueReferenceD.isActive()) {
                return null;
            }
            ReferenceEntry referenceEntryB = this.X.q0.b(this, referenceEntry, referenceEntry2, key);
            referenceEntryB.n(valueReferenceD.d(this.j0, obj, referenceEntryB));
            return referenceEntryB;
        }

        public final void d() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.k0.poll();
                if (referenceEntry == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.n0;
                if (abstractQueue.contains(referenceEntry)) {
                    abstractQueue.add(referenceEntry);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00f8 A[EDGE_INSN: B:48:0x00f8->B:59:0x0118 BREAK  A[LOOP:3: B:36:0x00bb->B:55:0x010c]] */
        public final void g() throws Throwable {
            Segment segment;
            Segment segment2;
            LocalCache localCache = this.X;
            Strength.AnonymousClass1 anonymousClass1 = Strength.X;
            int i2 = 0;
            boolean z2 = localCache.h0 != anonymousClass1;
            RemovalCause removalCause = RemovalCause.Z;
            if (z2) {
                int i3 = 0;
                do {
                    Object objPoll = this.i0.poll();
                    if (objPoll == null) {
                        break;
                    }
                    ReferenceEntry referenceEntry = (ReferenceEntry) objPoll;
                    LocalCache localCache2 = this.X;
                    localCache2.getClass();
                    int iG = referenceEntry.g();
                    Segment segmentG = localCache2.g(iG);
                    segmentG.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = segmentG.g0;
                        int length = iG & (atomicReferenceArray.length() - 1);
                        ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get(length);
                        segment2 = segmentG;
                        while (referenceEntryH != null) {
                            if (referenceEntryH == referenceEntry) {
                                try {
                                    segment2.e0++;
                                    ReferenceEntry referenceEntryW = segment2.w(referenceEntryH, referenceEntryH, referenceEntryH.getKey(), referenceEntryH.d().get(), referenceEntryH.d(), removalCause);
                                    int i4 = segment2.f19760Y - 1;
                                    atomicReferenceArray.set(length, referenceEntryW);
                                    segment2.f19760Y = i4;
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    segment2.unlock();
                                    segment2.y();
                                    throw th;
                                }
                            }
                            referenceEntryH = referenceEntryH.h();
                        }
                        segment2.unlock();
                        segment2.y();
                        i3++;
                    } catch (Throwable th2) {
                        th = th2;
                        segment2 = segmentG;
                    }
                } while (i3 != 16);
            }
            if (this.X.i0 != anonymousClass1) {
                do {
                    Object objPoll2 = this.j0.poll();
                    if (objPoll2 == null) {
                        return;
                    }
                    ValueReference valueReference = (ValueReference) objPoll2;
                    LocalCache localCache3 = this.X;
                    localCache3.getClass();
                    ReferenceEntry referenceEntryA = valueReference.a();
                    int iG2 = referenceEntryA.g();
                    Segment segmentG2 = localCache3.g(iG2);
                    Object key = referenceEntryA.getKey();
                    segmentG2.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray2 = segmentG2.g0;
                        int length2 = iG2 & (atomicReferenceArray2.length() - 1);
                        ReferenceEntry referenceEntryH2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                        int i5 = iG2;
                        segment = segmentG2;
                        while (true) {
                            if (referenceEntryH2 == null) {
                                segment.unlock();
                                if (!segment.isHeldByCurrentThread()) {
                                    segment.y();
                                    break;
                                }
                                break;
                            }
                            int i6 = i5;
                            try {
                                Object key2 = referenceEntryH2.getKey();
                                if (referenceEntryH2.g() == i6 && key2 != null && segment.X.f0.e(key, key2)) {
                                    if (referenceEntryH2.d() != valueReference) {
                                        segment.unlock();
                                        if (!segment.isHeldByCurrentThread()) {
                                            segment.y();
                                            break;
                                        }
                                        break;
                                    }
                                    segment.e0++;
                                    ReferenceEntry referenceEntryW2 = segment.w(referenceEntryH2, referenceEntryH2, key2, valueReference.get(), valueReference, removalCause);
                                    int i7 = segment.f19760Y - 1;
                                    atomicReferenceArray2.set(length2, referenceEntryW2);
                                    segment.f19760Y = i7;
                                    segment.unlock();
                                    if (!segment.isHeldByCurrentThread()) {
                                        segment.y();
                                        break;
                                    }
                                    break;
                                }
                                referenceEntryH2 = referenceEntryH2.h();
                                i5 = i6;
                            } catch (Throwable th3) {
                                th = th3;
                                segment.unlock();
                                if (!segment.isHeldByCurrentThread()) {
                                    segment.y();
                                }
                                throw th;
                            }
                        }
                        i2++;
                    } catch (Throwable th4) {
                        th = th4;
                        segment = segmentG2;
                    }
                } while (i2 != 16);
            }
        }

        public final void h(Object obj, Object obj2, int i2, RemovalCause removalCause) {
            this.Z -= (long) i2;
            if (removalCause.d()) {
                this.o0.b();
            }
            LocalCache localCache = this.X;
            if (localCache.n0 != LocalCache.y0) {
                localCache.n0.offer(new RemovalNotification(obj, obj2));
            }
        }

        public final void i(ReferenceEntry referenceEntry) {
            ReferenceEntry referenceEntry2;
            if (this.X.b()) {
                d();
                long jC = referenceEntry.d().c();
                long j = this.h0;
                RemovalCause removalCause = RemovalCause.f0;
                if (jC > j && !u(referenceEntry, referenceEntry.g(), removalCause)) {
                    throw new AssertionError();
                }
                while (this.Z > j) {
                    Iterator it = this.n0.iterator();
                    do {
                        if (!it.hasNext()) {
                            throw new AssertionError();
                        }
                        referenceEntry2 = (ReferenceEntry) it.next();
                    } while (referenceEntry2.d().c() <= 0);
                    if (!u(referenceEntry2, referenceEntry2.g(), removalCause)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        public final void j() {
            AtomicReferenceArray atomicReferenceArray = this.g0;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i2 = this.f19760Y;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.f0 = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i3 = 0; i3 < length; i3++) {
                ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get(i3);
                if (referenceEntryH != null) {
                    ReferenceEntry referenceEntryH2 = referenceEntryH.h();
                    int iG = referenceEntryH.g() & length2;
                    if (referenceEntryH2 == null) {
                        atomicReferenceArray2.set(iG, referenceEntryH);
                    } else {
                        ReferenceEntry referenceEntry = referenceEntryH;
                        while (referenceEntryH2 != null) {
                            int iG2 = referenceEntryH2.g() & length2;
                            if (iG2 != iG) {
                                referenceEntry = referenceEntryH2;
                                iG = iG2;
                            }
                            referenceEntryH2 = referenceEntryH2.h();
                        }
                        atomicReferenceArray2.set(iG, referenceEntry);
                        while (referenceEntryH != referenceEntry) {
                            int iG3 = referenceEntryH.g() & length2;
                            ReferenceEntry referenceEntryA = a(referenceEntryH, (ReferenceEntry) atomicReferenceArray2.get(iG3));
                            if (referenceEntryA != null) {
                                atomicReferenceArray2.set(iG3, referenceEntryA);
                            } else {
                                t(referenceEntryH);
                                i2--;
                            }
                            referenceEntryH = referenceEntryH.h();
                        }
                    }
                }
            }
            this.g0 = atomicReferenceArray2;
            this.f19760Y = i2;
        }

        public final void k(long j) {
            ReferenceEntry referenceEntry;
            RemovalCause removalCause;
            ReferenceEntry referenceEntry2;
            d();
            do {
                referenceEntry = (ReferenceEntry) this.m0.peek();
                removalCause = RemovalCause.e0;
                LocalCache localCache = this.X;
                if (referenceEntry == null || !localCache.f(referenceEntry, j)) {
                    do {
                        referenceEntry2 = (ReferenceEntry) this.n0.peek();
                        if (referenceEntry2 == null || !localCache.f(referenceEntry2, j)) {
                            return;
                        }
                    } while (u(referenceEntry2, referenceEntry2.g(), removalCause));
                    throw new AssertionError();
                }
            } while (u(referenceEntry, referenceEntry.g(), removalCause));
            throw new AssertionError();
        }

        public final Object l(Object obj, int i2, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) throws Throwable {
            Object objA;
            AbstractCache.StatsCounter statsCounter = this.o0;
            try {
                objA = Uninterruptibles.a(listenableFuture);
                try {
                    if (objA == null) {
                        throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + mo.ono);
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    Stopwatch stopwatch = loadingValueReference.Z;
                    statsCounter.d(timeUnit.convert(stopwatch.f19724a ? System.nanoTime() - stopwatch.f19725b : 0L, timeUnit));
                    A(obj, i2, loadingValueReference, objA);
                    return objA;
                } catch (Throwable th) {
                    th = th;
                    if (objA == null) {
                        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                        Stopwatch stopwatch2 = loadingValueReference.Z;
                        statsCounter.c(timeUnit2.convert(stopwatch2.f19724a ? System.nanoTime() - stopwatch2.f19725b : 0L, timeUnit2));
                        lock();
                        try {
                            AtomicReferenceArray atomicReferenceArray = this.g0;
                            int length = (atomicReferenceArray.length() - 1) & i2;
                            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                            for (ReferenceEntry referenceEntryH = referenceEntry; referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                                Object key = referenceEntryH.getKey();
                                if (referenceEntryH.g() == i2 && key != null && this.X.f0.e(obj, key)) {
                                    if (referenceEntryH.d() != loadingValueReference) {
                                        break;
                                    }
                                    if (!loadingValueReference.X.isActive()) {
                                        atomicReferenceArray.set(length, v(referenceEntry, referenceEntryH));
                                        break;
                                    }
                                    referenceEntryH.n(loadingValueReference.X);
                                    break;
                                }
                            }
                        } finally {
                            unlock();
                            y();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objA = null;
            }
        }

        public final ReferenceEntry m(int i2, Object obj) {
            AtomicReferenceArray atomicReferenceArray = this.g0;
            for (ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i2); referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                if (referenceEntryH.g() == i2) {
                    Object key = referenceEntryH.getKey();
                    if (key == null) {
                        B();
                    } else if (this.X.f0.e(obj, key)) {
                        return referenceEntryH;
                    }
                }
            }
            return null;
        }

        public final Object n(ReferenceEntry referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                B();
                return null;
            }
            Object obj = referenceEntry.d().get();
            if (obj == null) {
                B();
                return null;
            }
            if (!this.X.f(referenceEntry, j)) {
                return obj;
            }
            if (!tryLock()) {
                return null;
            }
            try {
                k(j);
                return null;
            } finally {
                unlock();
            }
        }

        public final Object o(Object obj, int i2, CacheLoader cacheLoader) {
            LoadingValueReference loadingValueReference;
            ValueReference valueReferenceD;
            lock();
            try {
                long jA = this.X.p0.a();
                x(jA);
                boolean z2 = true;
                int i3 = this.f19760Y - 1;
                AtomicReferenceArray atomicReferenceArray = this.g0;
                int length = (atomicReferenceArray.length() - 1) & i2;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntryF = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntryF == null) {
                        valueReferenceD = null;
                        break;
                    }
                    Object key = referenceEntryF.getKey();
                    if (referenceEntryF.g() == i2 && key != null && this.X.f0.e(obj, key)) {
                        valueReferenceD = referenceEntryF.d();
                        if (!valueReferenceD.isLoading()) {
                            Object obj2 = valueReferenceD.get();
                            if (obj2 == null) {
                                h(key, obj2, valueReferenceD.c(), RemovalCause.Z);
                            } else {
                                if (!this.X.f(referenceEntryF, jA)) {
                                    r(referenceEntryF, jA);
                                    this.o0.e();
                                    unlock();
                                    y();
                                    return obj2;
                                }
                                h(key, obj2, valueReferenceD.c(), RemovalCause.e0);
                            }
                            this.m0.remove(referenceEntryF);
                            this.n0.remove(referenceEntryF);
                            this.f19760Y = i3;
                            break;
                        }
                        z2 = false;
                        break;
                    }
                    referenceEntryF = referenceEntryF.h();
                }
                if (z2) {
                    loadingValueReference = new LoadingValueReference();
                    if (referenceEntryF == null) {
                        EntryFactory entryFactory = this.X.q0;
                        obj.getClass();
                        referenceEntryF = entryFactory.f(i2, this, referenceEntry, obj);
                        referenceEntryF.n(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntryF);
                    } else {
                        referenceEntryF.n(loadingValueReference);
                    }
                }
                unlock();
                y();
                if (!z2) {
                    return C(referenceEntryF, obj, valueReferenceD);
                }
                try {
                    return l(obj, i2, loadingValueReference, loadingValueReference.f(obj, cacheLoader));
                } finally {
                    this.o0.a();
                }
            } catch (Throwable th) {
                unlock();
                y();
                throw th;
            }
        }

        public final void p() {
            if ((this.l0.incrementAndGet() & 63) == 0) {
                x(this.X.p0.a());
                y();
            }
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final Object q(Object obj, Object obj2, boolean z2, int i2) throws Throwable {
            Throwable th;
            ReferenceEntry referenceEntryH;
            Segment<K, V> segment;
            Throwable th2;
            Segment<K, V> segment2;
            int i3;
            lock();
            try {
                long jA = this.X.p0.a();
                x(jA);
                if (this.f19760Y + 1 <= this.f0) {
                    AtomicReferenceArray atomicReferenceArray = this.g0;
                    int length = i2 & (atomicReferenceArray.length() - 1);
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                    referenceEntryH = referenceEntry;
                    while (referenceEntryH != null) {
                        Object key = referenceEntryH.getKey();
                        if (referenceEntryH.g() == i2) {
                        }
                        Object obj3 = obj;
                        Object obj4 = obj2;
                        segment = this;
                        referenceEntryH = referenceEntryH.h();
                        obj = obj3;
                        obj2 = obj4;
                    }
                    Object obj5 = obj;
                    Object obj6 = obj2;
                    this.e0++;
                    ReferenceEntry referenceEntryF = this.X.q0.f(i2, this, referenceEntry, obj5);
                    z(referenceEntryF, obj5, obj6, jA);
                    atomicReferenceArray.set(length, referenceEntryF);
                    this.f19760Y++;
                    i(referenceEntryF);
                    unlock();
                    y();
                    return null;
                }
                try {
                    j();
                    AtomicReferenceArray atomicReferenceArray2 = this.g0;
                    int length2 = i2 & (atomicReferenceArray2.length() - 1);
                    ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                    referenceEntryH = referenceEntry2;
                    while (referenceEntryH != null) {
                        try {
                            try {
                                Object key2 = referenceEntryH.getKey();
                                if (referenceEntryH.g() == i2 || key2 == null || !this.X.f0.e(obj, key2)) {
                                    Object obj7 = obj;
                                    Object obj8 = obj2;
                                    segment = this;
                                    try {
                                        referenceEntryH = referenceEntryH.h();
                                        obj = obj7;
                                        obj2 = obj8;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } else {
                                    ValueReference valueReferenceD = referenceEntryH.d();
                                    Object obj9 = valueReferenceD.get();
                                    if (obj9 == null) {
                                        this.e0++;
                                        if (valueReferenceD.isActive()) {
                                            h(obj, obj9, valueReferenceD.c(), RemovalCause.Z);
                                            segment2 = this;
                                            segment2.z(referenceEntryH, obj, obj2, jA);
                                            i3 = segment2.f19760Y;
                                        } else {
                                            segment2 = this;
                                            segment2.z(referenceEntryH, obj, obj2, jA);
                                            i3 = segment2.f19760Y + 1;
                                        }
                                        segment2.f19760Y = i3;
                                        i(referenceEntryH);
                                        unlock();
                                        y();
                                        return null;
                                    }
                                    Object obj10 = obj;
                                    Object obj11 = obj2;
                                    if (z2) {
                                        r(referenceEntryH, jA);
                                        unlock();
                                        y();
                                        return obj9;
                                    }
                                    try {
                                        this.e0++;
                                        h(obj10, obj9, valueReferenceD.c(), RemovalCause.f19771Y);
                                        z(referenceEntryH, obj10, obj11, jA);
                                        segment = this;
                                        i(referenceEntryH);
                                        unlock();
                                        y();
                                        return obj9;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                    }
                                    th = th;
                                }
                                th = th3;
                            } catch (Throwable th5) {
                                th = th5;
                                segment = this;
                            }
                            th2 = th;
                            th = th2;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    Object obj12 = obj;
                    Object obj13 = obj2;
                    try {
                        this.e0++;
                        ReferenceEntry referenceEntryF2 = this.X.q0.f(i2, this, referenceEntry2, obj12);
                        z(referenceEntryF2, obj12, obj13, jA);
                        atomicReferenceArray2.set(length2, referenceEntryF2);
                        this.f19760Y++;
                        i(referenceEntryF2);
                        unlock();
                        y();
                        return null;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
            }
            unlock();
            y();
            throw th;
        }

        public final void r(ReferenceEntry referenceEntry, long j) {
            if (this.X.c()) {
                referenceEntry.p(j);
            }
            this.n0.add(referenceEntry);
        }

        public final void s(ReferenceEntry referenceEntry, long j) {
            if (this.X.c()) {
                referenceEntry.p(j);
            }
            this.k0.add(referenceEntry);
        }

        public final void t(ReferenceEntry referenceEntry) {
            Object key = referenceEntry.getKey();
            referenceEntry.g();
            h(key, referenceEntry.d().get(), referenceEntry.d().c(), RemovalCause.Z);
            this.m0.remove(referenceEntry);
            this.n0.remove(referenceEntry);
        }

        public final boolean u(ReferenceEntry referenceEntry, int i2, RemovalCause removalCause) {
            AtomicReferenceArray atomicReferenceArray = this.g0;
            int length = i2 & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryH = referenceEntry2; referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                if (referenceEntryH == referenceEntry) {
                    this.e0++;
                    ReferenceEntry referenceEntryW = w(referenceEntry2, referenceEntryH, referenceEntryH.getKey(), referenceEntryH.d().get(), referenceEntryH.d(), removalCause);
                    int i3 = this.f19760Y - 1;
                    atomicReferenceArray.set(length, referenceEntryW);
                    this.f19760Y = i3;
                    return true;
                }
            }
            return false;
        }

        public final ReferenceEntry v(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            int i2 = this.f19760Y;
            ReferenceEntry referenceEntryH = referenceEntry2.h();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry referenceEntryA = a(referenceEntry, referenceEntryH);
                if (referenceEntryA != null) {
                    referenceEntryH = referenceEntryA;
                } else {
                    t(referenceEntry);
                    i2--;
                }
                referenceEntry = referenceEntry.h();
            }
            this.f19760Y = i2;
            return referenceEntryH;
        }

        public final ReferenceEntry w(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj, Object obj2, ValueReference valueReference, RemovalCause removalCause) {
            h(obj, obj2, valueReference.c(), removalCause);
            this.m0.remove(referenceEntry2);
            this.n0.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return v(referenceEntry, referenceEntry2);
            }
            valueReference.b(null);
            return referenceEntry;
        }

        public final void x(long j) {
            if (tryLock()) {
                try {
                    g();
                    k(j);
                    this.l0.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void y() {
            if (isHeldByCurrentThread()) {
                return;
            }
            while (true) {
                LocalCache localCache = this.X;
                if (((RemovalNotification) localCache.n0.poll()) == null) {
                    return;
                }
                try {
                    localCache.o0.getClass();
                } catch (Throwable th) {
                    LocalCache.w0.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            }
        }

        public final void z(ReferenceEntry referenceEntry, Object obj, Object obj2, long j) {
            ValueReference valueReferenceD = referenceEntry.d();
            LocalCache localCache = this.X;
            localCache.k0.getClass();
            referenceEntry.n(localCache.i0.f(1, this, referenceEntry, obj2));
            d();
            this.Z += (long) 1;
            if (localCache.c()) {
                referenceEntry.p(j);
            }
            if (localCache.d()) {
                referenceEntry.r(j);
            }
            this.n0.add(referenceEntry);
            this.m0.add(referenceEntry);
            valueReferenceD.b(obj2);
        }
    }

    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry X;

        public SoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.X = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry a() {
            return this.X;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new SoftValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isLoading() {
            return false;
        }
    }

    public enum Strength {
        X { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence d() {
                return Equivalence.d();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return i2 == 1 ? new StrongValueReference(obj) : new WeightedStrongValueReference(obj, i2);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF1 { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence d() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return i2 == 1 ? new SoftValueReference(segment.j0, obj, referenceEntry) : new WeightedSoftValueReference(i2, referenceEntry, obj, segment.j0);
            }
        },
        f19761Y { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence d() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return i2 == 1 ? new WeakValueReference(segment.j0, obj, referenceEntry) : new WeightedWeakValueReference(i2, referenceEntry, obj, segment.j0);
            }
        };

        public abstract Equivalence d();

        public abstract ValueReference f(int i2, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        public volatile long f0;
        public ReferenceEntry g0;
        public ReferenceEntry h0;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry i() {
            return this.h0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry k() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void l(ReferenceEntry referenceEntry) {
            this.h0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void p(long j) {
            this.f0 = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long f0;
        public ReferenceEntry g0;
        public ReferenceEntry h0;
        public volatile long i0;
        public ReferenceEntry j0;
        public ReferenceEntry k0;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry i() {
            return this.h0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.j0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry k() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void l(ReferenceEntry referenceEntry) {
            this.h0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry m() {
            return this.k0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long o() {
            return this.i0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void p(long j) {
            this.f0 = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j) {
            this.i0 = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.j0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.k0 = referenceEntry;
        }
    }

    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19762Y;
        public final ReferenceEntry Z;
        public volatile ValueReference e0 = LocalCache.x0;

        public StrongEntry(Object obj, int i2, ReferenceEntry referenceEntry) {
            this.X = obj;
            this.f19762Y = i2;
            this.Z = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ValueReference d() {
            return this.e0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final int g() {
            return this.f19762Y;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return this.X;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry h() {
            return this.Z;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void n(ValueReference valueReference) {
            this.e0 = valueReference;
        }
    }

    public static class StrongValueReference<K, V> implements ValueReference<K, V> {
        public final Object X;

        public StrongValueReference(Object obj) {
            this.X = obj;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return this.X;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.X;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isLoading() {
            return false;
        }
    }

    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long f0;
        public ReferenceEntry g0;
        public ReferenceEntry h0;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry m() {
            return this.h0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long o() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j) {
            this.f0 = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.h0 = referenceEntry;
        }
    }

    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f19769Y;
        }
    }

    public interface ValueReference<K, V> {
        ReferenceEntry a();

        void b(Object obj);

        int c();

        ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry);

        Object e();

        Object get();

        boolean isActive();

        boolean isLoading();
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return LocalCache.a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return LocalCache.a(this).toArray(objArr);
        }
    }

    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        public volatile long e0;
        public ReferenceEntry f0;
        public ReferenceEntry g0;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry i() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry k() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void l(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void p(long j) {
            this.e0 = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.e0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.f0 = referenceEntry;
        }
    }

    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long e0;
        public ReferenceEntry f0;
        public ReferenceEntry g0;
        public volatile long h0;
        public ReferenceEntry i0;
        public ReferenceEntry j0;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry i() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.i0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry k() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void l(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry m() {
            return this.j0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long o() {
            return this.h0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void p(long j) {
            this.e0 = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.e0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j) {
            this.h0 = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void s(ReferenceEntry referenceEntry) {
            this.f0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.i0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.j0 = referenceEntry;
        }
    }

    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ReferenceEntry f19763Y;
        public volatile ValueReference Z;

        public WeakEntry(int i2, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.Z = LocalCache.x0;
            this.X = i2;
            this.f19763Y = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference d() {
            return this.Z;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int g() {
            return this.X;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry h() {
            return this.f19763Y;
        }

        public ReferenceEntry i() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry j() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry k() {
            throw new UnsupportedOperationException();
        }

        public void l(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void n(ValueReference valueReference) {
            this.Z = valueReference;
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(long j) {
            throw new UnsupportedOperationException();
        }

        public long q() {
            throw new UnsupportedOperationException();
        }

        public void r(long j) {
            throw new UnsupportedOperationException();
        }

        public void s(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry X;

        public WeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.X = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry a() {
            return this.X;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeakValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isLoading() {
            return false;
        }
    }

    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long e0;
        public ReferenceEntry f0;
        public ReferenceEntry g0;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.f0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry m() {
            return this.g0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long o() {
            return this.e0;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j) {
            this.e0 = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.f0 = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.g0 = referenceEntry;
        }
    }

    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19764Y;

        public WeightedSoftValueReference(int i2, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.f19764Y = i2;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int c() {
            return this.f19764Y;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedSoftValueReference(this.f19764Y, referenceEntry, obj, referenceQueue);
        }
    }

    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19765Y;

        public WeightedStrongValueReference(Object obj, int i2) {
            super(obj);
            this.f19765Y = i2;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int c() {
            return this.f19765Y;
        }
    }

    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19766Y;

        public WeightedWeakValueReference(int i2, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.f19766Y = i2;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int c() {
            return this.f19766Y;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference d(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedWeakValueReference(this.f19766Y, referenceEntry, obj, referenceQueue);
        }
    }

    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final AnonymousClass1 X;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$WriteQueue$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public ReferenceEntry f19767Y;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry j() {
                return this.X;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry m() {
                return this.f19767Y;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long o() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void r(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void t(ReferenceEntry referenceEntry) {
                this.X = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void u(ReferenceEntry referenceEntry) {
                this.f19767Y = referenceEntry;
            }
        }

        public WriteQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.X = anonymousClass1;
            anonymousClass1.f19767Y = anonymousClass1;
            this.X = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryJ = referenceEntry.j();
                Logger logger = LocalCache.w0;
                NullEntry nullEntry = NullEntry.X;
                referenceEntry.t(nullEntry);
                referenceEntry.u(nullEntry);
                referenceEntry = referenceEntryJ;
            }
            anonymousClass1.X = anonymousClass1;
            anonymousClass1.f19767Y = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).j() != NullEntry.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.X;
            return anonymousClass1.X == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryJ = ((ReferenceEntry) obj).j();
                    if (referenceEntryJ == WriteQueue.this.X) {
                        return null;
                    }
                    return referenceEntryJ;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryM = referenceEntry.m();
            ReferenceEntry referenceEntryJ = referenceEntry.j();
            Logger logger = LocalCache.w0;
            referenceEntryM.t(referenceEntryJ);
            referenceEntryJ.u(referenceEntryM);
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry2 = anonymousClass1.f19767Y;
            referenceEntry2.t(referenceEntry);
            referenceEntry.u(referenceEntry2);
            referenceEntry.t(anonymousClass1);
            anonymousClass1.f19767Y = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.X;
            ReferenceEntry referenceEntry = anonymousClass1.X;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryM = referenceEntry.m();
            ReferenceEntry referenceEntryJ = referenceEntry.j();
            Logger logger = LocalCache.w0;
            referenceEntryM.t(referenceEntryJ);
            referenceEntryJ.u(referenceEntryM);
            NullEntry nullEntry = NullEntry.X;
            referenceEntry.t(nullEntry);
            referenceEntry.u(nullEntry);
            return referenceEntryJ != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.X;
            int i2 = 0;
            for (ReferenceEntry referenceEntryJ = anonymousClass1.X; referenceEntryJ != anonymousClass1; referenceEntryJ = referenceEntryJ.j()) {
                i2++;
            }
            return i2;
        }
    }

    public final class WriteThroughEntry implements Map.Entry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19769Y;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.X = obj;
            this.f19769Y = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.X.equals(entry.getKey()) && this.f19769Y.equals(entry.getValue())) {
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
            return this.f19769Y;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.X.hashCode() ^ this.f19769Y.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = LocalCache.this.put(this.X, obj);
            this.f19769Y = obj;
            return objPut;
        }

        public final String toString() {
            return this.X + d9.i.f24747b + this.f19769Y;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.cache.LocalCache, java.util.AbstractMap] */
    public LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        long j;
        ?? abstractMap = new AbstractMap();
        int i2 = cacheBuilder.f19739b;
        abstractMap.e0 = Math.min(i2 == -1 ? 4 : i2, 65536);
        Strength strength = cacheBuilder.f;
        Strength.AnonymousClass1 anonymousClass1 = Strength.X;
        Strength strength2 = (Strength) MoreObjects.a(strength, anonymousClass1);
        abstractMap.h0 = strength2;
        abstractMap.i0 = (Strength) MoreObjects.a(cacheBuilder.g, anonymousClass1);
        abstractMap.f0 = (Equivalence) MoreObjects.a(cacheBuilder.j, ((Strength) MoreObjects.a(cacheBuilder.f, anonymousClass1)).d());
        abstractMap.g0 = (Equivalence) MoreObjects.a(cacheBuilder.k, ((Strength) MoreObjects.a(cacheBuilder.g, anonymousClass1)).d());
        if (cacheBuilder.f19742h == 0 || cacheBuilder.f19743i == 0) {
            j = 0;
        } else {
            j = cacheBuilder.f19741e == null ? cacheBuilder.f19740c : cacheBuilder.d;
        }
        abstractMap.j0 = j;
        Weigher weigher = cacheBuilder.f19741e;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.X;
        Weigher weigher2 = (Weigher) MoreObjects.a(weigher, oneWeigher);
        abstractMap.k0 = weigher2;
        long j2 = cacheBuilder.f19743i;
        abstractMap.l0 = j2 == -1 ? 0L : j2;
        long j3 = cacheBuilder.f19742h;
        abstractMap.m0 = j3 != -1 ? j3 : 0L;
        RemovalListener removalListener = cacheBuilder.f19744l;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.X;
        RemovalListener removalListener2 = (RemovalListener) MoreObjects.a(removalListener, nullListener);
        abstractMap.o0 = removalListener2;
        abstractMap.n0 = (AbstractQueue) (removalListener2 == nullListener ? y0 : new ConcurrentLinkedQueue());
        int i3 = 1;
        int i4 = 0;
        boolean z2 = abstractMap.d() || abstractMap.c();
        Ticker ticker = cacheBuilder.m;
        if (ticker == null) {
            ticker = z2 ? Ticker.f19732a : CacheBuilder.f19737p;
        }
        abstractMap.p0 = ticker;
        abstractMap.q0 = EntryFactory.X[(strength2 != Strength.f19761Y ? (char) 0 : (char) 4) | ((abstractMap.c() || abstractMap.b() || abstractMap.c()) ? (char) 1 : (char) 0) | (abstractMap.d() || abstractMap.d() ? 2 : 0)];
        Supplier supplier = cacheBuilder.f19745n;
        abstractMap.r0 = (AbstractCache.StatsCounter) supplier.get();
        abstractMap.s0 = cacheLoader;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.b() && weigher2 == oneWeigher) {
            iMin = (int) Math.min(iMin, j);
        }
        int i5 = 1;
        int i6 = 0;
        while (i5 < abstractMap.e0 && (!abstractMap.b() || ((long) i5) * 20 <= abstractMap.j0)) {
            i6++;
            i5 <<= 1;
        }
        abstractMap.f19750Y = 32 - i6;
        abstractMap.X = i5 - 1;
        abstractMap.Z = new Segment[i5];
        int i7 = iMin / i5;
        while (i3 < (i7 * i5 < iMin ? i7 + 1 : i7)) {
            i3 <<= 1;
        }
        if (abstractMap.b()) {
            long j4 = abstractMap.j0;
            long j5 = i5;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                Segment[] segmentArr = abstractMap.Z;
                if (i4 >= segmentArr.length) {
                    return;
                }
                if (i4 == j7) {
                    j6--;
                }
                long j8 = j6;
                int i8 = i3;
                segmentArr[i4] = new Segment(abstractMap, i8, j8, (AbstractCache.StatsCounter) supplier.get());
                i4++;
                i3 = i8;
                j6 = j8;
            }
        } else {
            int i9 = i3;
            LocalCache localCache = abstractMap;
            while (true) {
                Segment[] segmentArr2 = localCache.Z;
                if (i4 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i4] = new Segment(localCache, i9, -1L, (AbstractCache.StatsCounter) supplier.get());
                i4++;
                localCache = this;
            }
        }
    }

    public static ArrayList a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterators.a(arrayList, abstractCollection.iterator());
        return arrayList;
    }

    public final boolean b() {
        return this.j0 >= 0;
    }

    public final boolean c() {
        return this.l0 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.Z) {
            if (segment.f19760Y != 0) {
                segment.lock();
                try {
                    segment.x(segment.X.p0.a());
                    AtomicReferenceArray atomicReferenceArray = segment.g0;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get(i2); referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                            if (referenceEntryH.d().isActive()) {
                                Object key = referenceEntryH.getKey();
                                Object obj = referenceEntryH.d().get();
                                RemovalCause removalCause = (key == null || obj == null) ? RemovalCause.Z : RemovalCause.X;
                                referenceEntryH.g();
                                segment.h(key, obj, referenceEntryH.d().c(), removalCause);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    LocalCache localCache = segment.X;
                    Strength.AnonymousClass1 anonymousClass1 = Strength.X;
                    if (localCache.h0 != anonymousClass1) {
                        while (segment.i0.poll() != null) {
                        }
                    }
                    if (localCache.i0 != anonymousClass1) {
                        while (segment.j0.poll() != null) {
                        }
                    }
                    segment.m0.clear();
                    segment.n0.clear();
                    segment.l0.set(0);
                    segment.e0++;
                    segment.f19760Y = 0;
                    segment.unlock();
                    segment.y();
                } catch (Throwable th) {
                    segment.unlock();
                    segment.y();
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:19:0x003a, B:20:0x003d, B:15:0x0031), top: B:35:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.getClass();
        try {
            if (segmentG.f19760Y == 0) {
                segmentG.p();
                return false;
            }
            long jA = segmentG.X.p0.a();
            ReferenceEntry referenceEntryM = segmentG.m(iE, obj);
            if (referenceEntryM != null) {
                if (segmentG.X.f(referenceEntryM, jA)) {
                    if (segmentG.tryLock()) {
                        try {
                            segmentG.k(jA);
                            segmentG.unlock();
                        } catch (Throwable th) {
                            segmentG.unlock();
                            throw th;
                        }
                    }
                }
                if (referenceEntryM == null) {
                    segmentG.p();
                    return false;
                }
                boolean z2 = referenceEntryM.d().get() != null;
                segmentG.p();
                return z2;
            }
            referenceEntryM = null;
            if (referenceEntryM == null) {
                segmentG.p();
                return false;
            }
            if (referenceEntryM.d().get() != null) {
            }
            segmentG.p();
            return z2;
        } catch (Throwable th2) {
            segmentG.p();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i2 = 0;
        if (obj == null) {
            return false;
        }
        long jA = this.p0.a();
        Segment[] segmentArr = this.Z;
        long j = -1;
        int i3 = 0;
        while (i3 < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            int i4 = i2 == true ? 1 : 0;
            while (i4 < length) {
                Segment segment = segmentArr[i4];
                int i5 = segment.f19760Y;
                AtomicReferenceArray atomicReferenceArray = segment.g0;
                int i6 = i2;
                while (i6 < atomicReferenceArray.length()) {
                    ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get(i6);
                    while (referenceEntryH != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object objN = segment.n(referenceEntryH, jA);
                        ReferenceEntry referenceEntry = referenceEntryH;
                        if (objN != null && this.g0.e(obj, objN)) {
                            return true;
                        }
                        referenceEntryH = referenceEntry.h();
                        segmentArr = segmentArr2;
                    }
                    i6++;
                }
                j2 += (long) segment.e0;
                i4++;
                i2 = i6;
            }
            boolean z2 = i2;
            Segment[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return z2;
            }
            i3++;
            j = j2;
            i2 = z2 ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i2 == true ? 1 : 0;
    }

    public final boolean d() {
        return this.m0 > 0;
    }

    public final int e(Object obj) {
        int iB;
        Equivalence equivalence = this.f0;
        if (obj == null) {
            equivalence.getClass();
            iB = 0;
        } else {
            iB = equivalence.b(obj);
        }
        int i2 = iB + ((iB << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.v0;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.v0 = entrySet;
        return entrySet;
    }

    public final boolean f(ReferenceEntry referenceEntry, long j) {
        referenceEntry.getClass();
        if (!c() || j - referenceEntry.q() < this.l0) {
            return d() && j - referenceEntry.o() >= this.m0;
        }
        return true;
    }

    public final Segment g(int i2) {
        return this.Z[(i2 >>> this.f19750Y) & this.X];
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0043, B:26:0x004d, B:31:0x0060, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003c, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0043, B:26:0x004d, B:31:0x0060, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003c, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0043, B:26:0x004d, B:31:0x0060, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003c, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.getClass();
        try {
            if (segmentG.f19760Y != 0) {
                long jA = segmentG.X.p0.a();
                ReferenceEntry referenceEntryM = segmentG.m(iE, obj);
                if (referenceEntryM != null) {
                    if (segmentG.X.f(referenceEntryM, jA)) {
                        if (segmentG.tryLock()) {
                            try {
                                segmentG.k(jA);
                                segmentG.unlock();
                            } catch (Throwable th) {
                                segmentG.unlock();
                                throw th;
                            }
                        }
                    }
                    if (referenceEntryM == null) {
                        segmentG.p();
                        return null;
                    }
                    obj2 = referenceEntryM.d().get();
                    if (obj2 != null) {
                        segmentG.s(referenceEntryM, jA);
                        referenceEntryM.getKey();
                        LocalCache localCache = segmentG.X;
                        CacheLoader cacheLoader = localCache.s0;
                        localCache.getClass();
                        segmentG.p();
                        return obj2;
                    }
                    segmentG.B();
                }
                referenceEntryM = null;
                if (referenceEntryM == null) {
                    segmentG.p();
                    return null;
                }
                obj2 = referenceEntryM.d().get();
                if (obj2 != null) {
                    segmentG.s(referenceEntryM, jA);
                    referenceEntryM.getKey();
                    LocalCache localCache2 = segmentG.X;
                    CacheLoader cacheLoader2 = localCache2.s0;
                    localCache2.getClass();
                    segmentG.p();
                    return obj2;
                }
                segmentG.B();
            }
            segmentG.p();
            return null;
        } catch (Throwable th2) {
            segmentG.p();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.Z;
        long j = 0;
        for (Segment segment : segmentArr) {
            if (segment.f19760Y != 0) {
                return false;
            }
            j += (long) segment.e0;
        }
        if (j == 0) {
            return true;
        }
        for (Segment segment2 : segmentArr) {
            if (segment2.f19760Y != 0) {
                return false;
            }
            j -= (long) segment2.e0;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.t0;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.t0 = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iE = e(obj);
        return g(iE).q(obj, obj2, false, iE);
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
        int iE = e(obj);
        return g(iE).q(obj, obj2, true, iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        RemovalCause removalCause;
        if (obj == null) {
            return null;
        }
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.lock();
        try {
            segmentG.x(segmentG.X.p0.a());
            AtomicReferenceArray atomicReferenceArray = segmentG.g0;
            int length = iE & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryH = referenceEntry; referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                Object key = referenceEntryH.getKey();
                if (referenceEntryH.g() == iE && key != null && segmentG.X.f0.e(obj, key)) {
                    ValueReference valueReferenceD = referenceEntryH.d();
                    Object obj2 = valueReferenceD.get();
                    if (obj2 != null) {
                        removalCause = RemovalCause.X;
                    } else {
                        if (!valueReferenceD.isActive()) {
                            return null;
                        }
                        removalCause = RemovalCause.Z;
                    }
                    RemovalCause removalCause2 = removalCause;
                    segmentG.e0++;
                    ReferenceEntry referenceEntryW = segmentG.w(referenceEntry, referenceEntryH, key, obj2, valueReferenceD, removalCause2);
                    int i2 = segmentG.f19760Y - 1;
                    atomicReferenceArray.set(length, referenceEntryW);
                    segmentG.f19760Y = i2;
                    return obj2;
                }
            }
            return null;
        } finally {
            segmentG.unlock();
            segmentG.y();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.lock();
        try {
            long jA = segmentG.X.p0.a();
            segmentG.x(jA);
            AtomicReferenceArray atomicReferenceArray = segmentG.g0;
            int length = iE & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntryH = referenceEntry;
            while (referenceEntryH != null) {
                Object key = referenceEntryH.getKey();
                if (referenceEntryH.g() == iE && key != null && segmentG.X.f0.e(obj, key)) {
                    ValueReference valueReferenceD = referenceEntryH.d();
                    Object obj3 = valueReferenceD.get();
                    if (obj3 != null) {
                        ReferenceEntry referenceEntry2 = referenceEntryH;
                        segmentG.e0++;
                        segmentG.h(obj, obj3, valueReferenceD.c(), RemovalCause.f19771Y);
                        segmentG.z(referenceEntry2, obj, obj2, jA);
                        segmentG.i(referenceEntry2);
                        segmentG.unlock();
                        segmentG.y();
                        return obj3;
                    }
                    if (valueReferenceD.isActive()) {
                        segmentG.e0++;
                        ReferenceEntry referenceEntryW = segmentG.w(referenceEntry, referenceEntryH, key, obj3, valueReferenceD, RemovalCause.Z);
                        int i2 = segmentG.f19760Y - 1;
                        atomicReferenceArray.set(length, referenceEntryW);
                        segmentG.f19760Y = i2;
                    }
                    segmentG.unlock();
                    segmentG.y();
                    return null;
                }
                Object obj4 = obj2;
                referenceEntry = referenceEntry;
                obj = obj;
                referenceEntryH = referenceEntryH.h();
                obj2 = obj4;
            }
            segmentG.unlock();
            segmentG.y();
            return null;
        } catch (Throwable th) {
            segmentG.unlock();
            segmentG.y();
            throw th;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (Segment segment : this.Z) {
            jMax += (long) Math.max(0, segment.f19760Y);
        }
        return Ints.e(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.u0;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.u0 = values;
        return values;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        RemovalCause removalCause;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.lock();
        try {
            segmentG.x(segmentG.X.p0.a());
            AtomicReferenceArray atomicReferenceArray = segmentG.g0;
            int length = iE & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryH = referenceEntry; referenceEntryH != null; referenceEntryH = referenceEntryH.h()) {
                Object key = referenceEntryH.getKey();
                if (referenceEntryH.g() == iE && key != null && segmentG.X.f0.e(obj, key)) {
                    ValueReference valueReferenceD = referenceEntryH.d();
                    Object obj3 = valueReferenceD.get();
                    boolean zE = segmentG.X.g0.e(obj2, obj3);
                    RemovalCause removalCause2 = RemovalCause.X;
                    if (zE) {
                        removalCause = removalCause2;
                    } else {
                        if (obj3 != null || !valueReferenceD.isActive()) {
                            return false;
                        }
                        removalCause = RemovalCause.Z;
                    }
                    segmentG.e0++;
                    ReferenceEntry referenceEntryW = segmentG.w(referenceEntry, referenceEntryH, key, obj3, valueReferenceD, removalCause);
                    int i2 = segmentG.f19760Y - 1;
                    atomicReferenceArray.set(length, referenceEntryW);
                    segmentG.f19760Y = i2;
                    return removalCause == removalCause2;
                }
            }
            return false;
        } finally {
            segmentG.unlock();
            segmentG.y();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) throws Throwable {
        Object obj4 = obj;
        obj4.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iE = e(obj);
        Segment segmentG = g(iE);
        segmentG.lock();
        try {
            long jA = segmentG.X.p0.a();
            segmentG.x(jA);
            AtomicReferenceArray atomicReferenceArray = segmentG.g0;
            int length = (atomicReferenceArray.length() - 1) & iE;
            ReferenceEntry referenceEntryH = (ReferenceEntry) atomicReferenceArray.get(length);
            int i2 = length;
            while (referenceEntryH != null) {
                int i3 = i2;
                Object key = referenceEntryH.getKey();
                if (referenceEntryH.g() == iE && key != null && segmentG.X.f0.e(obj4, key)) {
                    ValueReference valueReferenceD = referenceEntryH.d();
                    Object obj5 = valueReferenceD.get();
                    if (obj5 == null) {
                        if (valueReferenceD.isActive()) {
                            segmentG.e0++;
                            ReferenceEntry referenceEntryW = segmentG.w(referenceEntryH, referenceEntryH, key, obj5, valueReferenceD, RemovalCause.Z);
                            int i4 = segmentG.f19760Y - 1;
                            atomicReferenceArray.set(i3, referenceEntryW);
                            segmentG.f19760Y = i4;
                        }
                        segmentG.unlock();
                        segmentG.y();
                        return false;
                    }
                    ReferenceEntry referenceEntry = referenceEntryH;
                    if (segmentG.X.g0.e(obj2, obj5)) {
                        segmentG.e0++;
                        segmentG.h(obj4, obj5, valueReferenceD.c(), RemovalCause.f19771Y);
                        try {
                            segmentG.z(referenceEntry, obj4, obj3, jA);
                            segmentG.i(referenceEntry);
                            segmentG.unlock();
                            segmentG.y();
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            segmentG = segmentG;
                            segmentG.unlock();
                            segmentG.y();
                            throw th;
                        }
                    }
                    segmentG.r(referenceEntry, jA);
                    segmentG.unlock();
                    segmentG.y();
                    return false;
                }
                referenceEntryH = referenceEntryH.h();
                i2 = i3;
                obj4 = obj;
            }
            segmentG.unlock();
            segmentG.y();
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
