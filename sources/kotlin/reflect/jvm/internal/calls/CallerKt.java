package kotlin.reflect.jvm.internal.calls;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CallerKt {
    public static final int a(Caller caller) {
        Intrinsics.f(caller, "<this>");
        return caller.a().size();
    }
}
