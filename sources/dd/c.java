package dd;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f38810a;

    public static synchronized c V() {
        try {
            if (f38810a == null) {
                f38810a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38810a;
    }

    @Override // cc.a2
    public final String r() {
        return "isEnabled";
    }

    @Override // cc.a2
    public final String u() {
        return "firebase_performance_collection_enabled";
    }
}
