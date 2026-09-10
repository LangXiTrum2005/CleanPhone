package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0568s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30210a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<InterfaceC0396ig> f30211b = new AtomicReference<>(new U6(new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper())));

    /* JADX INFO: renamed from: com.ironsource.s9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            if (Kb.f26413u.d().h().B()) {
                C0568s9.f30211b.set(new L5());
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s9$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements jk.a {
        public b(Object obj) {
            super(0, obj, Runnable.class, "run", "run()V", 0);
        }

        public final void a() {
            ((Runnable) this.receiver).run();
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        AbstractRunnableC0430ke abstractRunnableC0430keA = runnable instanceof AbstractRunnableC0430ke ? (AbstractRunnableC0430ke) runnable : null;
        if (abstractRunnableC0430keA == null) {
            abstractRunnableC0430keA = AbstractRunnableC0430ke.f29068a.a(new b(runnable));
        }
        InterfaceC0396ig interfaceC0396ig = f30211b.get();
        if (interfaceC0396ig.a()) {
            abstractRunnableC0430keA.run();
        } else {
            interfaceC0396ig.a(abstractRunnableC0430keA);
        }
    }
}
