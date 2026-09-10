package kotlin.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "result", "Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f43291Y = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    public final Continuation X;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SafeContinuation(Continuation continuation) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43293Y;
        this.X = continuation;
        this.result = coroutineSingletons;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43293Y;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43291Y;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.X;
        }
        if (obj == CoroutineSingletons.Z) {
            return CoroutineSingletons.X;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).X;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.X;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF45023Y() {
        return this.X.getF45023Y();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43293Y;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43291Y;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43291Y;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.Z;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                    this.X.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.X;
    }
}
