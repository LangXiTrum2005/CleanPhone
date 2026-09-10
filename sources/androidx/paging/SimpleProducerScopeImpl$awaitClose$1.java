package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {101}, m = "awaitClose")
final class SimpleProducerScopeImpl$awaitClose$1 extends ContinuationImpl {
    public Function0 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Job f7878Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ SimpleProducerScopeImpl e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleProducerScopeImpl$awaitClose$1(SimpleProducerScopeImpl simpleProducerScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = simpleProducerScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SimpleProducerScopeImpl$awaitClose$1 simpleProducerScopeImpl$awaitClose$1;
        Throwable th;
        Function0 function0;
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        SimpleProducerScopeImpl simpleProducerScopeImpl = this.e0;
        simpleProducerScopeImpl.getClass();
        int i2 = this.f0;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f0 = i2 - Integer.MIN_VALUE;
            simpleProducerScopeImpl$awaitClose$1 = this;
        } else {
            simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(simpleProducerScopeImpl, this);
        }
        Object obj2 = simpleProducerScopeImpl$awaitClose$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = simpleProducerScopeImpl$awaitClose$1.f0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = simpleProducerScopeImpl$awaitClose$1.X;
            try {
                ResultKt.b(obj2);
                function0.invoke();
                return Unit.f43263a;
            } catch (Throwable th2) {
                th = th2;
                function0.invoke();
                throw th;
            }
        }
        ResultKt.b(obj2);
        try {
            try {
                CoroutineContext.Element element = simpleProducerScopeImpl.f7877Y.getX().get(Job.Key.X);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                Job job = (Job) element;
                simpleProducerScopeImpl$awaitClose$1.X = null;
                simpleProducerScopeImpl$awaitClose$1.f7878Y = job;
                simpleProducerScopeImpl$awaitClose$1.f0 = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(simpleProducerScopeImpl$awaitClose$1));
                cancellableContinuationImpl.q();
                job.s(new Function1<Throwable, Unit>() { // from class: androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit unit = Unit.f43263a;
                        cancellableContinuationImpl.resumeWith(unit);
                        return unit;
                    }
                });
                if (cancellableContinuationImpl.p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                function0 = null;
                function0.invoke();
                return Unit.f43263a;
            } catch (Throwable th3) {
                th = th3;
                function0 = null;
                function0.invoke();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
