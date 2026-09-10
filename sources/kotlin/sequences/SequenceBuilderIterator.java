package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44669Y;
    public Iterator Z;
    public Continuation e0;

    @Override // kotlin.sequences.SequenceScope
    public final void a(Object obj, Continuation frame) {
        this.f44669Y = obj;
        this.X = 3;
        this.e0 = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        Intrinsics.f(frame, "frame");
    }

    @Override // kotlin.sequences.SequenceScope
    public final Object d(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return Unit.f43263a;
        }
        this.Z = it;
        this.X = 2;
        this.e0 = restrictedSuspendLambda;
        return CoroutineSingletons.X;
    }

    public final RuntimeException e() {
        int i2 = this.X;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.X);
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF0() {
        return EmptyCoroutineContext.X;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i2 = this.X;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator it = this.Z;
                Intrinsics.c(it);
                if (it.hasNext()) {
                    this.X = 2;
                    return true;
                }
                this.Z = null;
            }
            this.X = 5;
            Continuation continuation = this.e0;
            Intrinsics.c(continuation);
            this.e0 = null;
            continuation.resumeWith(Unit.f43263a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.X;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.X = 1;
            Iterator it = this.Z;
            Intrinsics.c(it);
            return it.next();
        }
        if (i2 != 3) {
            throw e();
        }
        this.X = 0;
        Object obj = this.f44669Y;
        this.f44669Y = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        ResultKt.b(obj);
        this.X = 4;
    }
}
