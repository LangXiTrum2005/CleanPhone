package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CancellableKt {
    public static final void a(Continuation continuation, AbstractCoroutine abstractCoroutine) {
        try {
            DispatchedContinuationKt.a(Unit.f43263a, IntrinsicsKt.b(continuation));
        } catch (Throwable th) {
            abstractCoroutine.resumeWith(ResultKt.a(th));
            throw th;
        }
    }
}
