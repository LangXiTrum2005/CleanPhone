package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface bh {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0066a f28314a = new C0066a(null);

        /* JADX INFO: renamed from: com.ironsource.bh$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0066a {
            public /* synthetic */ C0066a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final bh a(boolean z10, Ug waterfallOperations) {
                kotlin.jvm.internal.n.f(waterfallOperations, "waterfallOperations");
                return z10 ? new Zg(waterfallOperations) : new Yg(waterfallOperations);
            }

            private C0066a() {
            }
        }
    }

    void a();

    void a(B b10);

    Nd b();

    default B c() {
        return null;
    }
}
