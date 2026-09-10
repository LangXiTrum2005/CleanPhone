package q1;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f48579c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.c f48581b;

    static {
        new j("");
        f48579c = new j("preload");
    }

    public j(String str) {
        this.f48580a = str;
        this.f48581b = Build.VERSION.SDK_INT >= 31 ? new m0.c() : null;
    }

    public final synchronized LogSessionId a() {
        m0.c cVar;
        cVar = this.f48581b;
        cVar.getClass();
        return (LogSessionId) cVar.f45683b;
    }
}
