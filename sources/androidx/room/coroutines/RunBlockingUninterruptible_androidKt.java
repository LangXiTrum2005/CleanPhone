package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RunBlockingUninterruptible_androidKt {
    public static final void a(Function2 function2) {
        Thread.interrupted();
        BuildersKt.d(EmptyCoroutineContext.X, new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(function2, null));
    }
}
