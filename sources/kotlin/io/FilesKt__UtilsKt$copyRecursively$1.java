package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class FilesKt__UtilsKt$copyRecursively$1 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException exception = (IOException) obj2;
        Intrinsics.f((File) obj, "<unused var>");
        Intrinsics.f(exception, "exception");
        throw exception;
    }
}
