package kotlinx.coroutines.debug.internal;

import com.kochava.core.BuildConfig;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\n\u000b\fR\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R!\u0010\t\u001a\u0018\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00078\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "core", BuildConfig.SDK_MODULE_NAME, "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44840Y = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    public final ReferenceQueue X;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile = new Core(16);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\bR\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u0019\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "Lkotlinx/atomicfu/AtomicInt;", "load", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "keys", "values", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Core {
        public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44843c;
        public final /* synthetic */ AtomicReferenceArray d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f44844e;
        private volatile /* synthetic */ int load$volatile;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {
            public final Function2 X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44845Y = -1;
            public Object Z;
            public Object e0;

            public KeyValueIterator(Function2 function2) {
                this.X = function2;
                a();
            }

            public final void a() {
                T t;
                while (true) {
                    int i2 = this.f44845Y + 1;
                    this.f44845Y = i2;
                    Core core = Core.this;
                    if (i2 >= core.f44841a) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) core.d.get(i2);
                    if (hashedWeakRef != null && (t = hashedWeakRef.get()) != 0) {
                        this.Z = t;
                        Object obj = core.f44844e.get(this.f44845Y);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).f44855a;
                        }
                        if (obj != null) {
                            this.e0 = obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f44845Y < Core.this.f44841a;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.f44845Y >= Core.this.f44841a) {
                    throw new NoSuchElementException();
                }
                Object obj = this.Z;
                if (obj == null) {
                    Intrinsics.m("key");
                    throw null;
                }
                Object obj2 = this.e0;
                if (obj2 == null) {
                    Intrinsics.m("value");
                    throw null;
                }
                Object objInvoke = this.X.invoke(obj, obj2);
                a();
                return objInvoke;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("not implemented");
            }
        }

        public Core(int i2) {
            this.f44841a = i2;
            this.f44842b = Integer.numberOfLeadingZeros(i2) + 1;
            this.f44843c = (i2 * 2) / 3;
            this.d = new AtomicReferenceArray(i2);
            this.f44844e = new AtomicReferenceArray(i2);
        }

        public final Object a(Object obj, Object obj2, HashedWeakRef hashedWeakRef) {
            int i2;
            int iHashCode = (obj.hashCode() * (-1640531527)) >>> this.f44842b;
            boolean z2 = false;
            loop0: while (true) {
                AtomicReferenceArray atomicReferenceArray = this.d;
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) atomicReferenceArray.get(iHashCode);
                Symbol symbol = ConcurrentWeakMapKt.f44848a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
                if (hashedWeakRef2 != null) {
                    Object obj3 = hashedWeakRef2.get();
                    if (obj.equals(obj3)) {
                        if (!z2) {
                            break;
                        }
                        atomicIntegerFieldUpdater.decrementAndGet(this);
                        break;
                    }
                    if (obj3 == null) {
                        c(iHashCode);
                    }
                    if (iHashCode == 0) {
                        iHashCode = this.f44841a;
                    }
                    iHashCode--;
                } else {
                    if (obj2 == null) {
                        return null;
                    }
                    if (!z2) {
                        do {
                            i2 = atomicIntegerFieldUpdater.get(this);
                            if (i2 >= this.f44843c) {
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1));
                        z2 = true;
                    }
                    boolean z3 = z2;
                    if (hashedWeakRef == null) {
                        hashedWeakRef = new HashedWeakRef(obj, ConcurrentWeakMap.this.X);
                        obj.hashCode();
                    }
                    HashedWeakRef hashedWeakRef3 = hashedWeakRef;
                    do {
                        if (atomicReferenceArray.compareAndSet(iHashCode, null, hashedWeakRef3)) {
                            break loop0;
                        }
                    } while (atomicReferenceArray.get(iHashCode) == null);
                    z2 = z3;
                    hashedWeakRef = hashedWeakRef3;
                }
                return symbol;
            }
            while (true) {
                AtomicReferenceArray atomicReferenceArray2 = this.f44844e;
                Object obj4 = atomicReferenceArray2.get(iHashCode);
                if (obj4 instanceof Marked) {
                    return symbol;
                }
                while (!atomicReferenceArray2.compareAndSet(iHashCode, obj4, obj2)) {
                    if (atomicReferenceArray2.get(iHashCode) != obj4) {
                    }
                }
                return obj4;
            }
        }

        public final Core b() {
            Object obj;
            while (true) {
                ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                int iD = concurrentWeakMap.d();
                if (iD < 4) {
                    iD = 4;
                }
                Core core = new Core(Integer.highestOneBit(iD) * 4);
                for (int i2 = 0; i2 < this.f44841a; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.d.get(i2);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        c(i2);
                    }
                    while (true) {
                        AtomicReferenceArray atomicReferenceArray = this.f44844e;
                        obj = atomicReferenceArray.get(i2);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).f44855a;
                            break;
                        }
                        Marked marked = obj == null ? ConcurrentWeakMapKt.f44849b : obj.equals(Boolean.TRUE) ? ConcurrentWeakMapKt.f44850c : new Marked(obj);
                        do {
                            if (atomicReferenceArray.compareAndSet(i2, obj, marked)) {
                                break;
                            }
                        } while (atomicReferenceArray.get(i2) == obj);
                    }
                    if (obj2 == null || obj == null || core.a(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.f44848a) {
                    }
                }
                return core;
            }
        }

        public final void c(int i2) {
            while (true) {
                AtomicReferenceArray atomicReferenceArray = this.f44844e;
                Object obj = atomicReferenceArray.get(i2);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                do {
                    if (atomicReferenceArray.compareAndSet(i2, obj, null)) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f44840Y;
                        ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                        concurrentWeakMap.getClass();
                        ConcurrentWeakMap.f44840Y.decrementAndGet(concurrentWeakMap);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == obj);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f44846Y;

        public Entry(Object obj, Object obj2) {
            this.X = obj;
            this.f44846Y = obj2;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f44846Y;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class KeyValueSet<E> extends AbstractMutableSet<E> {
        public final Function2 X;

        public KeyValueSet(Function2 function2) {
            this.X = function2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }

        @Override // kotlin.collections.AbstractMutableSet
        public final int d() {
            return ConcurrentWeakMap.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            Core core = (Core) ConcurrentWeakMap.Z.get(ConcurrentWeakMap.this);
            core.getClass();
            return core.new KeyValueIterator(this.X);
        }
    }

    public ConcurrentWeakMap(boolean z2) {
        this.X = z2 ? new ReferenceQueue() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set a() {
        return new KeyValueSet(new a(0));
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set c() {
        return new KeyValueSet(new a(1));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((KeyValueSet) c()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int d() {
        return f44840Y.get(this);
    }

    public final synchronized Object e(Object obj, Object obj2) {
        Object objA;
        Core coreB = (Core) Z.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
            objA = coreB.a(obj, obj2, null);
            if (objA == ConcurrentWeakMapKt.f44848a) {
                coreB = coreB.b();
                Z.set(this, coreB);
            }
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) Z.get(this);
        core.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> core.f44842b;
        while (true) {
            HashedWeakRef hashedWeakRef = (HashedWeakRef) core.d.get(iHashCode);
            if (hashedWeakRef == null) {
                return null;
            }
            Object obj2 = hashedWeakRef.get();
            if (obj.equals(obj2)) {
                Object obj3 = core.f44844e.get(iHashCode);
                return obj3 instanceof Marked ? ((Marked) obj3).f44855a : obj3;
            }
            if (obj2 == null) {
                core.c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = core.f44841a;
            }
            iHashCode--;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Core core = (Core) Z.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
        Object objA = core.a(obj, obj2, null);
        if (objA == ConcurrentWeakMapKt.f44848a) {
            objA = e(obj, obj2);
        }
        if (objA == null) {
            f44840Y.incrementAndGet(this);
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) Z.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.g;
        Object objA = core.a(obj, null, null);
        if (objA == ConcurrentWeakMapKt.f44848a) {
            objA = e(obj, null);
        }
        if (objA != null) {
            f44840Y.decrementAndGet(this);
        }
        return objA;
    }
}
