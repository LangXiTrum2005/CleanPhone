package com.ironsource;

import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3729rf {

    /* JADX INFO: renamed from: com.ironsource.rf$a */
    public static final class a {
        private final R6.a.InterfaceC0375a a;
        private boolean b;

        public a(R6.a.InterfaceC0375a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.a = onCancel;
        }

        public final void a() {
            this.a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rf$b */
    public static final class b {
        public static final a b = new a(null);
        private final Xd a;

        /* JADX INFO: renamed from: com.ironsource.rf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.rf$b$a$a, reason: collision with other inner class name */
            public static final class C0407a extends Xd {
                final /* synthetic */ WeakReference<T> b;
                final /* synthetic */ Function1<T, Unit> c;

                /* JADX WARN: Multi-variable type inference failed */
                public C0407a(WeakReference<T> weakReference, Function1<? super T, Unit> function1) {
                    this.b = weakReference;
                    this.c = function1;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.Xd
                public void a() {
                    Object obj = this.b.get();
                    if (obj != null) {
                        this.c.invoke((T) obj);
                    }
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T> b a(T t, Function1<? super T, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                return new b(new C0407a(new WeakReference(t), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(Xd xd, DefaultConstructorMarker defaultConstructorMarker) {
            this(xd);
        }

        public final Xd a() {
            return this.a;
        }

        private b(Xd xd) {
            this.a = xd;
        }
    }

    a a(b bVar, long j);

    a a(Runnable runnable, long j);
}
