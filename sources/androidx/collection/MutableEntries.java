package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/collection/MutableEntries;", "K", "V", "", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {

    /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/collection/MutableEntries$iterator$1", "", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>>, KMutableIterator {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f3747Y = -1;

        /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", l = {1538}, m = "invokeSuspend")
        final class C00021 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<Object, Object>>, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ MutableEntries f3748Y;
            public final /* synthetic */ AnonymousClass1 Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(MutableEntries mutableEntries, AnonymousClass1 anonymousClass1, Continuation continuation) {
                super(2, continuation);
                this.f3748Y = mutableEntries;
                this.Z = anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00021 c00021 = new C00021(this.f3748Y, this.Z, continuation);
                c00021.X = obj;
                return c00021;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C00021 c00021 = (C00021) create((SequenceScope) obj, (Continuation) obj2);
                Unit unit = Unit.f43263a;
                c00021.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                ResultKt.b(obj);
                throw null;
            }
        }

        public AnonymousClass1(MutableEntries mutableEntries) {
            this.X = SequencesKt.m(new C00021(mutableEntries, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            return (Map.Entry) this.X.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f3747Y != -1) {
                throw null;
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.f(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.f(element, "element");
        element.getKey();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((Map.Entry) it.next()).getKey();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableMap.Entry)))) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.f(element, "element");
        Object key = element.getKey();
        if (key != null) {
            key.hashCode();
        }
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        return CollectionToArray.b(this, array);
    }
}
