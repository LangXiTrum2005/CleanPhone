package kotlinx.coroutines;

import androidx.room.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final Key X = new Key(ContinuationInterceptor.Key.X, new d(18));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key.X);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final DispatchedContinuation I(ContinuationImpl continuationImpl) {
        return new DispatchedContinuation(this, continuationImpl);
    }

    public abstract void U(CoroutineContext coroutineContext, Runnable runnable);

    public void Y(CoroutineContext coroutineContext, Runnable runnable) {
        U(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void b(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Intrinsics.d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        do {
            atomicReferenceFieldUpdater = DispatchedContinuation.i0;
        } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == DispatchedContinuationKt.f45030b);
        Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
        CancellableContinuationImpl cancellableContinuationImpl = obj instanceof CancellableContinuationImpl ? (CancellableContinuationImpl) obj : null;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.m();
        }
    }

    public boolean c0(CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined);
    }

    public CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(i2);
        return new LimitedDispatcher(this, i2);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        CoroutineContext.Element element;
        Intrinsics.f(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (ContinuationInterceptor.Key.X == key) {
                return this;
            }
            return null;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key key2 = getX();
        Intrinsics.f(key2, "key");
        if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f43289Y == key2) && (element = (CoroutineContext.Element) abstractCoroutineContextKey.X.invoke(this)) != null) {
            return element;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[RETURN] */
    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.f(key, "key");
        boolean z2 = key instanceof AbstractCoroutineContextKey;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        if (!z2) {
            if (ContinuationInterceptor.Key.X == key) {
                return emptyCoroutineContext;
            }
            return this;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key key2 = getX();
        Intrinsics.f(key2, "key");
        if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f43289Y == key2) && ((CoroutineContext.Element) abstractCoroutineContextKey.X.invoke(this)) != null) {
            return emptyCoroutineContext;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.a(this);
    }
}
