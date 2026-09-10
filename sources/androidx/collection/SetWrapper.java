package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
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
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/SetWrapper;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
class SetWrapper<E> implements Set<E>, KMappedMarker {

    /* JADX INFO: renamed from: androidx.collection.SetWrapper$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
    final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
        public Object[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public long[] f3769Y;
        public int Z;
        public int e0;
        public int f0;
        public long g0;
        public int h0;
        public /* synthetic */ Object i0;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.i0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.h0;
            if (i2 == 0) {
                ResultKt.b(obj);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.f0;
            int i4 = this.e0;
            long j = this.g0;
            int i5 = this.Z;
            long[] jArr = this.f3769Y;
            Object[] objArr = this.X;
            SequenceScope sequenceScope = (SequenceScope) this.i0;
            ResultKt.b(obj);
            do {
                j >>= 8;
                i3++;
                while (i3 >= i4) {
                    if (i4 == 8) {
                        do {
                            if (i5 != 0) {
                                i5++;
                                j = jArr[i5];
                            }
                        } while ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L);
                        i4 = 8 - ((~i5) >>> 31);
                        i3 = 0;
                    }
                    return Unit.f43263a;
                }
            } while ((255 & j) >= 128);
            Object obj2 = objArr[(i5 << 3) + i3];
            this.i0 = sequenceScope;
            this.X = objArr;
            this.f3769Y = jArr;
            this.Z = i5;
            this.g0 = j;
            this.e0 = i4;
            this.f0 = i3;
            this.h0 = 1;
            sequenceScope.a(obj2, this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
            return coroutineSingletons;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        Iterator it = elements.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return SequencesKt.m(new AnonymousClass1(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final String toString() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        return CollectionToArray.b(this, array);
    }
}
