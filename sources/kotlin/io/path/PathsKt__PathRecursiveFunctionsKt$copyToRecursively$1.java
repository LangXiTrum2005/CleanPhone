package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p006i.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
        Path pathN = a.n(obj);
        Path pathN2 = a.n(obj2);
        Exception exception = (Exception) obj3;
        Intrinsics.f(pathN, "<unused var>");
        Intrinsics.f(pathN2, "<unused var>");
        Intrinsics.f(exception, "exception");
        throw exception;
    }
}
