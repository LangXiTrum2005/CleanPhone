package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib-jdk7"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CopyActionResult[] copyActionResultArr = CopyActionResult.X;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CopyActionResult[] copyActionResultArr2 = CopyActionResult.X;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OnErrorResult[] onErrorResultArr = OnErrorResult.X;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final FileVisitResult a(Path path, Exception exc) {
        Intrinsics.f(null, "base");
        try {
            int i2 = PathRelativizer.f43321a;
            Intrinsics.f(null, "base");
            throw null;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + "\nthis path: " + path + "\nbase path: null", e2);
        }
    }
}
