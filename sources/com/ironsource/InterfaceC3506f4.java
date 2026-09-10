package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3506f4 {
    public static final c a = c.a;

    /* JADX INFO: renamed from: com.ironsource.f4$a */
    public static final class a implements InterfaceC3506f4 {
        private final V6 b;
        private final Qf c;
        private final AtomicBoolean d;

        /* JADX INFO: renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C0398a implements Qf.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            public C0398a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.Qf.a
            public void a() {
                this.a.a(new Z6.a(new W6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(V6 config, Qf timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC3506f4
        public synchronized void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C0398a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC3506f4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$b */
    public static final class b implements InterfaceC3506f4 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC3506f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3506f4
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f4$d */
    public interface d {
        void a(Z6 z6);
    }

    static InterfaceC3506f4 a(X6 x6) {
        return a.a(x6);
    }

    void a();

    void a(d dVar);

    /* JADX INFO: renamed from: com.ironsource.f4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final InterfaceC3506f4 a(X6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.b;
            }
            U6 u6 = new U6(featureFlag);
            Qf.b bVar = new Qf.b();
            bVar.b(u6.a());
            bVar.a(u6.a());
            return new a(u6, new Qf.d().a(bVar));
        }

        public final InterfaceC3506f4 a() {
            return b.b;
        }
    }
}
