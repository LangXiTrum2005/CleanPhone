package uj;

import android.os.Trace;
import com.google.android.gms.internal.auth.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements AutoCloseable {
    public static String b(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void c(String str) {
        Trace.beginSection(o.z(b(str)));
    }
}
