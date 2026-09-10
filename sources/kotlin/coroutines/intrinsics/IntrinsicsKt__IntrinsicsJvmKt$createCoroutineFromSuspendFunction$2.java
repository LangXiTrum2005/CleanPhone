package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends ContinuationImpl {
    public int X;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i2 = this.X;
        if (i2 == 0) {
            this.X = 1;
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.X = 2;
        ResultKt.b(obj);
        return obj;
    }
}
