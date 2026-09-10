package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/atomicfu/AtomicRef;", "", "owner", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J=\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000b\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0005R\u000b\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0005R\u000b\u0010\u001c\u001a\u00020\u001a8\u0016X\u0096\u0005R\u000b\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "value", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "onCancellation", "resume", "(VLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;V)V", "Lkotlin/Result;", "result", "resumeWith", "(Lkotlin/Result;)V", "", "idempotent", "tryResume", "(VLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isActive", "isCancelled", "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {
        public final CancellableContinuationImpl X;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl) {
            this.X = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void A(Object obj) {
            this.X.A(obj);
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i2) {
            this.X.a(segment, i2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final Symbol c(Object obj, Function3 function3) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Function3 function4 = new Function3() { // from class: kotlinx.coroutines.sync.a
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.i0;
                    this.getClass();
                    MutexImpl mutexImpl2 = mutexImpl;
                    atomicReferenceFieldUpdater.set(mutexImpl2, null);
                    mutexImpl2.b(null);
                    return Unit.f43263a;
                }
            };
            Symbol symbolD = this.X.D((Unit) obj, function4);
            if (symbolD != null) {
                MutexImpl.i0.set(mutexImpl, null);
            }
            return symbolD;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final boolean f(Throwable th) {
            return this.X.f(th);
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext getF45023Y() {
            return this.X.f0;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final boolean isActive() {
            return this.X.isActive();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.X.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public final void w(Object obj, Function3 function3) {
            Unit unit = Unit.f43263a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.i0;
            MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, null);
            b bVar = new b(mutexImpl, this);
            CancellableContinuationImpl cancellableContinuationImpl = this.X;
            cancellableContinuationImpl.z(unit, cancellableContinuationImpl.Z, new kotlinx.coroutines.a(bVar, 0));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0005¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final SelectInstanceInternal X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f45103Y;

        public SelectInstanceWithOwner(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.X = selectInstanceInternal;
            this.f45103Y = obj;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i2) {
            this.X.a(segment, i2);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final void c(Object obj) {
            MutexImpl.i0.set(MutexImpl.this, this.f45103Y);
            this.X.c(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final void d(DisposableHandle disposableHandle) {
            this.X.d(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public final boolean e(Object obj, Object obj2) {
            boolean zE = this.X.e(obj, obj2);
            if (zE) {
                MutexImpl.i0.set(MutexImpl.this, this.f45103Y);
            }
            return zE;
        }
    }

    public MutexImpl(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : MutexKt.f45104a;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object a(Continuation continuation) throws Throwable {
        boolean zTryLock = tryLock();
        Unit unit = Unit.f43263a;
        if (!zTryLock) {
            CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuation));
            try {
                CancellableContinuationWithOwner cancellableContinuationWithOwner = new CancellableContinuationWithOwner(cancellableContinuationImplB);
                while (true) {
                    int andDecrement = SemaphoreAndMutexImpl.h0.getAndDecrement(this);
                    if (andDecrement <= this.X) {
                        if (andDecrement > 0) {
                            cancellableContinuationWithOwner.w(unit, this.f45107Y);
                            break;
                        }
                        if (d(cancellableContinuationWithOwner)) {
                            break;
                        }
                    }
                }
                Object objP = cancellableContinuationImplB.p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (objP != coroutineSingletons) {
                    objP = unit;
                }
                if (objP == coroutineSingletons) {
                    return objP;
                }
            } catch (Throwable th) {
                cancellableContinuationImplB.y();
                throw th;
            }
        }
        return unit;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void b(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = MutexKt.f45104a;
            if (obj2 != symbol) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean f() {
        return Math.max(SemaphoreAndMutexImpl.h0.get(this), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + DebugStringsKt.a(this) + "[isLocked=" + f() + ",owner=" + i0.get(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock() {
        int i2;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.h0;
            int i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = this.X;
            if (i3 > i4) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i4) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i4));
            } else {
                if (i3 <= 0) {
                    c2 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i0.set(this, null);
                    c2 = 0;
                    break;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }
}
