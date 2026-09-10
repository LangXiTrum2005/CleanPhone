package androidx.datastore.core;

import com.ironsource.X3;
import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterProcessCoordinator.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", X3.i.b, "Landroidx/datastore/core/impassible;", "attabal", "(Ljava/io/File;)Landroidx/datastore/core/impassible;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class kowloon {
    public static final impassible attabal(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return triweekly.attabal(absolutePath);
    }
}
