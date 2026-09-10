package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileMoves.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "toFile", "", "attabal", "(Ljava/io/File;Ljava/io/File;)Z", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cutely {
    public static final boolean attabal(File file, File toFile) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? attabal.f9570attabal.attabal(file, toFile) : file.renameTo(toFile);
    }
}
