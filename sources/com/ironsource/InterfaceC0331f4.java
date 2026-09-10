package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0331f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28625a = c.f28632a;

    /* JADX INFO: renamed from: com.ironsource.f4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0331f4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final X6 f28626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0414jg f28627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f28628d;

        /* JADX INFO: renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0072a implements InterfaceC0414jg.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f28629a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f28630b;

            public C0072a(d dVar, a aVar) {
                this.f28629a = dVar;
                this.f28630b = aVar;
            }

            @Override // com.ironsource.InterfaceC0414jg.a
            public void a() {
                this.f28629a.a(new InterfaceC0262b7.a(new Y6.a(this.f28630b.f28626b.b())));
                this.f28630b.f28628d.set(false);
            }
        }

        public a(X6 config, InterfaceC0414jg timer) {
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(timer, "timer");
            this.f28626b = config;
            this.f28627c = timer;
            this.f28628d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC0331f4
        public synchronized void a(d callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
            if (this.f28628d.compareAndSet(false, true)) {
                this.f28627c.a(new C0072a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC0331f4
        public synchronized void a() {
            this.f28627c.cancel();
            this.f28628d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0331f4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f28631b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC0331f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC0331f4
        public void a(d callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(InterfaceC0262b7 interfaceC0262b7);
    }

    static InterfaceC0331f4 a(Z6 z10) {
        return f28625a.a(z10);
    }

    void a();

    void a(d dVar);

    /* JADX INFO: renamed from: com.ironsource.f4$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f28632a = new c();

        private c() {
        }

        public final InterfaceC0331f4 a(Z6 featureFlag) {
            kotlin.jvm.internal.n.f(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.f28631b;
            }
            W6 w10 = new W6(featureFlag);
            InterfaceC0414jg.b bVar = new InterfaceC0414jg.b();
            bVar.b(w10.a());
            bVar.a(w10.a());
            return new a(w10, new InterfaceC0414jg.d().a(bVar));
        }

        public final InterfaceC0331f4 a() {
            return b.f28631b;
        }
    }
}
