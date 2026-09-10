package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0367h4 {

    /* JADX INFO: renamed from: com.ironsource.h4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0367h4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28767a;

        public a(boolean z10) {
            this.f28767a = z10;
        }

        @Override // com.ironsource.InterfaceC0367h4
        public void a() {
            C0639w8.a(C0377he.f28824x, new C0549r8().a(B5.f25711y, Boolean.valueOf(this.f28767a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h4$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0367h4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f28769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0510p4 f28770c;

        public b(boolean z10, long j10, InterfaceC0510p4 currentTimeProvider) {
            kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
            this.f28768a = z10;
            this.f28769b = j10;
            this.f28770c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC0367h4
        public void a() {
            C0549r8 c0549r8A = new C0549r8().a(B5.f25711y, Boolean.valueOf(this.f28768a));
            if (this.f28769b > 0) {
                c0549r8A.a(B5.B, Long.valueOf(this.f28770c.a() - this.f28769b));
            }
            C0639w8.a(C0377he.f28823w, c0549r8A.a());
        }

        public final InterfaceC0510p4 b() {
            return this.f28770c;
        }
    }

    void a();
}
