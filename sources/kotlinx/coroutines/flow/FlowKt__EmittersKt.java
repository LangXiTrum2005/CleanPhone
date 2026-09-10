package kotlinx.coroutines.flow;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ThrowingCollector throwingCollector, Function3 function3, Throwable th, ContinuationImpl continuationImpl) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
            int i2 = flowKt__EmittersKt$invokeSafely$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.f44888Y;
        Object obj2 = CoroutineSingletons.X;
        int i3 = flowKt__EmittersKt$invokeSafely$1.Z;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                flowKt__EmittersKt$invokeSafely$1.X = th;
                flowKt__EmittersKt$invokeSafely$1.Z = 1;
                if (function3.invoke(throwingCollector, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = flowKt__EmittersKt$invokeSafely$1.X;
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt.a(th2, th);
            }
            throw th2;
        }
    }
}
