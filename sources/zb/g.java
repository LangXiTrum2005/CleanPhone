package zb;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fc.a f54685d = new fc.a(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b2.j f54686e = new b2.j(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc.f f54687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54688b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54689c = null;

    public g(fc.f fVar) {
        this.f54687a = fVar;
    }

    public static void a(fc.f fVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fVar.r(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
