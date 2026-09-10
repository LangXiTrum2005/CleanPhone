package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResultKt {
    public static final Result.Failure a(Throwable exception) {
        Intrinsics.f(exception, "exception");
        return new Result.Failure(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).X;
        }
    }
}
