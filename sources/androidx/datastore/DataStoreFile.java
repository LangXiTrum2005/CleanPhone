package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataStoreFile {
    public static final File a(Context context, String fileName) {
        Intrinsics.f(context, "<this>");
        Intrinsics.f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
