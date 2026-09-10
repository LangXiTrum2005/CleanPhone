package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutexImpl f4688a = MutexKt.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInt f4689b = new AtomicInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Flow f4690c = FlowKt.o(new SingleProcessCoordinator$updateNotifications$1(2, null));

    public SingleProcessCoordinator(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object a(Function2 function2, ContinuationImpl continuationImpl) throws Throwable {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        MutexImpl mutexImpl;
        Throwable th;
        boolean z2;
        if (continuationImpl instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) continuationImpl;
            int i2 = singleProcessCoordinator$tryLock$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuationImpl);
            }
        } else {
            singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuationImpl);
        }
        Object obj = singleProcessCoordinator$tryLock$1.Z;
        Object obj2 = CoroutineSingletons.X;
        int i3 = singleProcessCoordinator$tryLock$1.f0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = singleProcessCoordinator$tryLock$1.f4692Y;
            mutexImpl = singleProcessCoordinator$tryLock$1.X;
            try {
                ResultKt.b(obj);
                if (z2) {
                    mutexImpl.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    mutexImpl.b(null);
                }
                throw th;
            }
        }
        ResultKt.b(obj);
        MutexImpl mutexImpl2 = this.f4688a;
        boolean zTryLock = mutexImpl2.tryLock();
        try {
            Object objValueOf = Boolean.valueOf(zTryLock);
            singleProcessCoordinator$tryLock$1.X = mutexImpl2;
            singleProcessCoordinator$tryLock$1.f4692Y = zTryLock;
            singleProcessCoordinator$tryLock$1.f0 = 1;
            Object objInvoke = function2.invoke(objValueOf, singleProcessCoordinator$tryLock$1);
            if (objInvoke == obj2) {
                return obj2;
            }
            mutexImpl = mutexImpl2;
            obj = objInvoke;
            z2 = zTryLock;
            if (z2) {
                mutexImpl.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            mutexImpl = mutexImpl2;
            th = th3;
            z2 = zTryLock;
            if (z2) {
                mutexImpl.b(null);
            }
            throw th;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Flow getF4690c() {
        return this.f4690c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object c(ContinuationImpl continuationImpl) {
        return new Integer(this.f4689b.f4598a.get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object d(Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        MutexImpl mutexImpl;
        Throwable th;
        Mutex mutex;
        if (continuationImpl instanceof SingleProcessCoordinator$lock$1) {
            singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) continuationImpl;
            int i2 = singleProcessCoordinator$lock$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$lock$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuationImpl);
            }
        } else {
            singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuationImpl);
        }
        Object obj = singleProcessCoordinator$lock$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = singleProcessCoordinator$lock$1.f0;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutexImpl = this.f4688a;
                singleProcessCoordinator$lock$1.X = function1;
                singleProcessCoordinator$lock$1.f4691Y = mutexImpl;
                singleProcessCoordinator$lock$1.f0 = 1;
                if (mutexImpl.a(singleProcessCoordinator$lock$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) singleProcessCoordinator$lock$1.X;
                try {
                    ResultKt.b(obj);
                    mutex.b(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.b(null);
                    throw th;
                }
            }
            MutexImpl mutexImpl2 = singleProcessCoordinator$lock$1.f4691Y;
            Function1 function2 = (Function1) singleProcessCoordinator$lock$1.X;
            ResultKt.b(obj);
            mutexImpl = mutexImpl2;
            function1 = function2;
            singleProcessCoordinator$lock$1.X = mutexImpl;
            singleProcessCoordinator$lock$1.f4691Y = null;
            singleProcessCoordinator$lock$1.f0 = 2;
            Object objInvoke = function1.invoke(singleProcessCoordinator$lock$1);
            if (objInvoke != coroutineSingletons) {
                MutexImpl mutexImpl3 = mutexImpl;
                obj = objInvoke;
                mutex = mutexImpl3;
                mutex.b(null);
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            MutexImpl mutexImpl4 = mutexImpl;
            th = th3;
            mutex = mutexImpl4;
            mutex.b(null);
            throw th;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object e(Continuation continuation) {
        return new Integer(this.f4689b.f4598a.incrementAndGet());
    }
}
