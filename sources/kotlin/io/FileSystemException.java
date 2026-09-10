package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FileSystemException extends IOException {
    public FileSystemException(File file, File file2, String str) {
        Intrinsics.f(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        super(string);
    }
}
