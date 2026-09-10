package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ef implements Ff {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26020c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Hf f26021d = new M5(IronSourceThreadManager.INSTANCE.getLevelPlayThread());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hf f26022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0343fg f26023b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Hf a() {
            return Ef.f26021d;
        }

        private a() {
        }

        public final void a(Hf hf2) {
            kotlin.jvm.internal.n.f(hf2, "<set-?>");
            Ef.f26021d = hf2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f26024b;

        public b(Runnable runnable) {
            this.f26024b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            this.f26024b.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements jk.a {
        public c(Object obj) {
            super(0, obj, AbstractRunnableC0430ke.class, "run", "run()V", 0);
        }

        public final void a() {
            ((AbstractRunnableC0430ke) this.receiver).run();
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    public Ef() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Ef(Hf engine, InterfaceC0343fg dispatcher) {
        kotlin.jvm.internal.n.f(engine, "engine");
        kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
        this.f26022a = engine;
        this.f26023b = dispatcher;
    }

    @Override // com.ironsource.Ff
    public Ff.a a(Runnable task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        return new Ff.a(this.f26022a.a(bn.a.d(j10), new ki(12, this, a(task))));
    }

    public /* synthetic */ Ef(Hf hf2, InterfaceC0343fg interfaceC0343fg, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? f26021d : hf2, (i10 & 2) != 0 ? C0361gg.a(new C0568s9()) : interfaceC0343fg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ef this$0, AbstractRunnableC0430ke checkedRunnable) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(checkedRunnable, "$checkedRunnable");
        this$0.f26023b.a(new c(checkedRunnable));
    }

    private final AbstractRunnableC0430ke a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC0430ke ? (AbstractRunnableC0430ke) runnable : new b(runnable);
    }
}
