package dd;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f38811a;

    public static synchronized d V() {
        try {
            if (f38811a == null) {
                f38811a = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38811a;
    }

    @Override // cc.a2
    public final String r() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // cc.a2
    public final String u() {
        return "experiment_app_start_ttid";
    }
}
