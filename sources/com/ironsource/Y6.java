package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Y6 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Y6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC0244a7 f27993a;

        public a(EnumC0244a7 strategy) {
            kotlin.jvm.internal.n.f(strategy, "strategy");
            this.f27993a = strategy;
        }

        @Override // com.ironsource.Y6
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.Y6
        public EnumC0244a7 b() {
            return this.f27993a;
        }

        public final EnumC0244a7 c() {
            return this.f27993a;
        }
    }

    String a();

    EnumC0244a7 b();
}
