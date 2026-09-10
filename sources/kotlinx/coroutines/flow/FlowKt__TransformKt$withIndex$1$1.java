package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f44961Y;

    public FlowKt__TransformKt$withIndex$1$1(Ref.IntRef intRef, FlowCollector flowCollector) {
        this.X = flowCollector;
        this.f44961Y = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (continuation instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            int i2 = flowKt__TransformKt$withIndex$1$1$emit$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
        }
        Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flowKt__TransformKt$withIndex$1$1$emit$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            Ref.IntRef intRef = this.f44961Y;
            int i4 = intRef.X;
            intRef.X = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            IndexedValue indexedValue = new IndexedValue(i4, obj);
            flowKt__TransformKt$withIndex$1$1$emit$1.Z = 1;
            if (this.X.emit(indexedValue, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
        }
        return Unit.f43263a;
    }
}
