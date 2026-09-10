package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ke, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC0430ke implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29068a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.ke$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ke$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0075a extends AbstractRunnableC0430ke {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ jk.a f29069b;

            public C0075a(jk.a aVar) {
                this.f29069b = aVar;
            }

            @Override // com.ironsource.AbstractRunnableC0430ke
            public void a() {
                this.f29069b.invoke();
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final AbstractRunnableC0430ke a(jk.a block) {
            kotlin.jvm.internal.n.f(block, "block");
            return new C0075a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable t10) {
        kotlin.jvm.internal.n.f(t10, "t");
        If.a(t10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C0474n4.d().a(th3);
            }
        }
    }
}
