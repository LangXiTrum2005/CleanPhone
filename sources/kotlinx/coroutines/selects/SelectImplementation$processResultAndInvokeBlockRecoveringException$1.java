package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {729}, m = "processResultAndInvokeBlockRecoveringException")
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SelectImplementation f45094Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(SelectImplementation selectImplementation, Continuation continuation) {
        super(continuation);
        this.f45094Y = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectImplementation.g0;
        SelectImplementation selectImplementation = this.f45094Y;
        selectImplementation.getClass();
        int i2 = this.Z;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.Z = i2 - Integer.MIN_VALUE;
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = this;
        } else {
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new SelectImplementation$processResultAndInvokeBlockRecoveringException$1(selectImplementation, this);
        }
        Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        return obj2;
    }
}
