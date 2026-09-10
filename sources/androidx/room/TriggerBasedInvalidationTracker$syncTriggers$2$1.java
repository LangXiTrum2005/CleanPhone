package androidx.room;

import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {307, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends SuspendLambda implements Function2<Transactor, Continuation<? super Unit>, Object> {
    public ReentrantLock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8273Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ TriggerBasedInvalidationTracker e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(2, continuation);
        this.e0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.e0, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.Z = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Transactor transactor;
        Object objC;
        ObservedTableStates observedTableStates;
        ReentrantLock reentrantLock;
        ObservedTableStates.ObserveOp[] observeOpArr;
        ObservedTableStates.ObserveOp observeOp;
        ObservedTableStates observedTableStates2;
        ReentrantLock reentrantLock2;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f8273Y;
        Unit unit = Unit.f43263a;
        boolean z3 = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            transactor = (Transactor) this.Z;
            this.Z = transactor;
            this.f8273Y = 1;
            objC = transactor.c(this);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reentrantLock2 = this.X;
            observedTableStates2 = (ObservedTableStates) this.Z;
            try {
                ResultKt.b(obj);
                reentrantLock = reentrantLock2;
                observedTableStates = observedTableStates2;
                observedTableStates.f = false;
                reentrantLock.unlock();
                return unit;
            } catch (Throwable th) {
                th = th;
                z2 = false;
                try {
                    observedTableStates2.f = z2;
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        transactor = (Transactor) this.Z;
        ResultKt.b(obj);
        objC = obj;
        if (((Boolean) objC).booleanValue()) {
            return unit;
        }
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.e0;
        observedTableStates = triggerBasedInvalidationTracker.f8259h;
        reentrantLock = observedTableStates.f8206e;
        reentrantLock.lock();
        try {
            observedTableStates.f = true;
            ReentrantLock reentrantLock3 = observedTableStates.f8203a;
            reentrantLock3.lock();
            try {
                if (observedTableStates.d) {
                    observedTableStates.d = false;
                    int length = observedTableStates.f8204b.length;
                    observeOpArr = new ObservedTableStates.ObserveOp[length];
                    int i3 = 0;
                    boolean z4 = false;
                    while (i3 < length) {
                        boolean z5 = observedTableStates.f8204b[i3] > 0 ? true : z3;
                        boolean[] zArr = observedTableStates.f8205c;
                        if (z5 != zArr[i3]) {
                            zArr[i3] = z5;
                            observeOp = z5 ? ObservedTableStates.ObserveOp.f8207Y : ObservedTableStates.ObserveOp.Z;
                            z4 = true;
                        } else {
                            observeOp = ObservedTableStates.ObserveOp.X;
                        }
                        observeOpArr[i3] = observeOp;
                        i3++;
                        z3 = false;
                    }
                    if (!z4) {
                        observeOpArr = null;
                    }
                } else {
                    observeOpArr = null;
                }
                reentrantLock3.unlock();
                if (observeOpArr != null) {
                    try {
                        if (observeOpArr.length != 0) {
                            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.f8253Y;
                            TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 triggerBasedInvalidationTracker$syncTriggers$2$1$1$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(observeOpArr, triggerBasedInvalidationTracker, transactor, null);
                            this.Z = observedTableStates;
                            this.X = reentrantLock;
                            this.f8273Y = 2;
                            if (transactor.a(sQLiteTransactionType, triggerBasedInvalidationTracker$syncTriggers$2$1$1$1, this) != coroutineSingletons) {
                                observedTableStates2 = observedTableStates;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                observedTableStates = observedTableStates2;
                            }
                            return coroutineSingletons;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        observedTableStates2 = observedTableStates;
                        reentrantLock2 = reentrantLock;
                        z2 = false;
                        observedTableStates2.f = z2;
                        throw th;
                    }
                }
                observedTableStates.f = false;
                reentrantLock.unlock();
                return unit;
            } catch (Throwable th4) {
                reentrantLock3.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            reentrantLock.unlock();
            throw th;
        }
    }
}
