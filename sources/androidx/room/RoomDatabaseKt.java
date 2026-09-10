package androidx.room;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ThreadLocalElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/room/RoomDatabaseKt__RoomDatabaseKt", "androidx/room/RoomDatabaseKt__RoomDatabase_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class RoomDatabaseKt {
    public static final Object a(final RoomDatabase roomDatabase, Continuation continuation, Function1 function1) throws Throwable {
        if (roomDatabase.i() && roomDatabase.k() && roomDatabase.j()) {
            return function1.invoke(continuation);
        }
        if (continuation.getF45023Y().get(RoomExternalOperationElement.X) == null) {
            return function1.invoke(continuation);
        }
        final RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(function1, null);
        TransactionElement transactionElement = (TransactionElement) continuation.getF45023Y().get(TransactionElement.f8251Y);
        ContinuationInterceptor continuationInterceptor = transactionElement != null ? transactionElement.X : null;
        if (continuationInterceptor != null) {
            return BuildersKt.f(continuationInterceptor, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation);
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        try {
            TransactionExecutor transactionExecutor = roomDatabase.d;
            if (transactionExecutor == null) {
                Intrinsics.m("internalTransactionExecutor");
                throw null;
            }
            transactionExecutor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int X;

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public /* synthetic */ Object f8240Y;
                    public final /* synthetic */ RoomDatabase Z;
                    public final /* synthetic */ CancellableContinuationImpl e0;
                    public final /* synthetic */ Function2 f0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(RoomDatabase roomDatabase, CancellableContinuationImpl cancellableContinuationImpl, Function2 function2, Continuation continuation) {
                        super(2, continuation);
                        this.Z = roomDatabase;
                        this.e0 = cancellableContinuationImpl;
                        this.f0 = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, this.e0, this.f0, continuation);
                        anonymousClass1.f8240Y = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Continuation continuation;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                        int i2 = this.X;
                        if (i2 == 0) {
                            ResultKt.b(obj);
                            CoroutineContext.Element element = ((CoroutineScope) this.f8240Y).getX().get(ContinuationInterceptor.Key.X);
                            Intrinsics.c(element);
                            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
                            CoroutineContext coroutineContextPlus = continuationInterceptor.plus(new TransactionElement(continuationInterceptor));
                            CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(new ThreadLocalElement(coroutineContextPlus, this.Z.f8222i));
                            CancellableContinuationImpl cancellableContinuationImpl = this.e0;
                            this.f8240Y = cancellableContinuationImpl;
                            this.X = 1;
                            obj = BuildersKt.f(coroutineContextPlus2, this.f0, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            continuation = cancellableContinuationImpl;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            continuation = (Continuation) this.f8240Y;
                            ResultKt.b(obj);
                        }
                        continuation.resumeWith(obj);
                        return Unit.f43263a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    try {
                        BuildersKt.d(cancellableContinuationImpl2.f0.minusKey(ContinuationInterceptor.Key.X), new AnonymousClass1(roomDatabase, cancellableContinuationImpl2, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, null));
                    } catch (Throwable th) {
                        cancellableContinuationImpl2.f(th);
                    }
                }
            });
            Object objP = cancellableContinuationImpl.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            return objP;
        } catch (RejectedExecutionException e2) {
            cancellableContinuationImpl.f(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }
}
