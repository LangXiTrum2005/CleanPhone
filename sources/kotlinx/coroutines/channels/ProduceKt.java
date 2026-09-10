package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProduceKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ProducerScope producerScope, Function0 function0, ContinuationImpl continuationImpl) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuationImpl instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuationImpl;
            int i2 = produceKt$awaitClose$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
        }
        Object obj = produceKt$awaitClose$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = produceKt$awaitClose$1.e0;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                if (produceKt$awaitClose$1.getF0().get(Job.Key.X) != producerScope) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                produceKt$awaitClose$1.X = producerScope;
                produceKt$awaitClose$1.f44834Y = function0;
                produceKt$awaitClose$1.e0 = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(produceKt$awaitClose$1));
                cancellableContinuationImpl.q();
                producerScope.g(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit unit = Unit.f43263a;
                        cancellableContinuationImpl.resumeWith(unit);
                        return unit;
                    }
                });
                if (cancellableContinuationImpl.p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = produceKt$awaitClose$1.f44834Y;
                ResultKt.b(obj);
            }
            function0.invoke();
            return Unit.f43263a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static final ReceiveChannel b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function2 function2) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.b(coroutineScope, coroutineContext), ChannelKt.a(i2, 4, bufferOverflow));
        producerCoroutine.s0(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }

    public static ReceiveChannel c(CoroutineScope coroutineScope, int i2, Function2 function2, int i3) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return b(coroutineScope, emptyCoroutineContext, i2, BufferOverflow.X, CoroutineStart.X, function2);
    }
}
