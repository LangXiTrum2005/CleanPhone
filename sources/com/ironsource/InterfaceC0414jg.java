package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0414jg {

    /* JADX INFO: renamed from: com.ironsource.jg$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: com.ironsource.jg$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f29001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f29002b;

        public final long a() {
            return this.f29002b;
        }

        public final long b() {
            return this.f29001a;
        }

        public final void a(long j10) {
            this.f29002b = j10;
        }

        public final void b(long j10) {
            this.f29001a = j10;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.jg$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        InterfaceC0414jg a(b bVar);
    }

    /* JADX INFO: renamed from: com.ironsource.jg$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC0414jg.c
        public InterfaceC0414jg a(b timerConfig) {
            kotlin.jvm.internal.n.f(timerConfig, "timerConfig");
            return new e(new C0450lg(timerConfig.b()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.jg$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e implements InterfaceC0414jg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0450lg f29003a;

        /* JADX INFO: renamed from: com.ironsource.jg$e$a */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a implements C0450lg.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f29004a;

            public a(a aVar) {
                this.f29004a = aVar;
            }

            @Override // com.ironsource.C0450lg.a
            public void a() {
                this.f29004a.a();
            }
        }

        public e(C0450lg timer) {
            kotlin.jvm.internal.n.f(timer, "timer");
            this.f29003a = timer;
        }

        @Override // com.ironsource.InterfaceC0414jg
        public void a(a callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
            this.f29003a.a((C0450lg.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC0414jg
        public void cancel() {
            this.f29003a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
