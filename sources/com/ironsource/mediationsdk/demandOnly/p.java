package com.ironsource.mediationsdk.demandOnly;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29503a;

        public a(String plumbus) {
            kotlin.jvm.internal.n.f(plumbus, "plumbus");
            this.f29503a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.f29503a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
