package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Ff {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Hf.a f26107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26108b;

        public a(Hf.a onCancel) {
            kotlin.jvm.internal.n.f(onCancel, "onCancel");
            this.f26107a = onCancel;
        }

        public final void a() {
            this.f26107a.cancel();
            this.f26108b = true;
        }

        public final boolean b() {
            return this.f26108b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f26109b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractRunnableC0430ke f26110a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.Ff$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class C0039a extends AbstractRunnableC0430ke {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeakReference<T> f26111b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ jk.b f26112c;

                public C0039a(WeakReference<T> weakReference, jk.b bVar) {
                    this.f26111b = weakReference;
                    this.f26112c = bVar;
                }

                @Override // com.ironsource.AbstractRunnableC0430ke
                public void a() {
                    Object obj = this.f26111b.get();
                    if (obj != null) {
                        this.f26112c.invoke(obj);
                    }
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final <T> b a(T t10, jk.b block) {
                kotlin.jvm.internal.n.f(block, "block");
                return new b(new C0039a(new WeakReference(t10), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC0430ke abstractRunnableC0430ke, kotlin.jvm.internal.g gVar) {
            this(abstractRunnableC0430ke);
        }

        public final AbstractRunnableC0430ke a() {
            return this.f26110a;
        }

        private b(AbstractRunnableC0430ke abstractRunnableC0430ke) {
            this.f26110a = abstractRunnableC0430ke;
        }
    }

    default a a(b task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        return a(task.a(), j10);
    }

    a a(Runnable runnable, long j10);
}
