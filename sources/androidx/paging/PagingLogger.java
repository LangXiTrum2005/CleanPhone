package androidx.paging;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingLogger;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagingLogger {
    public static void a(int i2, String message) {
        Intrinsics.f(message, "message");
        if (i2 == 2) {
            Log.v("Paging", message, null);
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(a.k("debug level ", i2, " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)"));
            }
            Log.d("Paging", message, null);
        }
    }
}
