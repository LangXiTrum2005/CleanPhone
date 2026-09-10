package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0262b7 {

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0262b7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Y6 f28275a;

        public a(Y6 failure) {
            kotlin.jvm.internal.n.f(failure, "failure");
            this.f28275a = failure;
        }

        public final Y6 a() {
            return this.f28275a;
        }

        public final Y6 b() {
            return this.f28275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f28275a, ((a) obj).f28275a);
        }

        public int hashCode() {
            return this.f28275a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f28275a + ")";
        }

        public final a a(Y6 failure) {
            kotlin.jvm.internal.n.f(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, Y6 y10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                y10 = aVar.f28275a;
            }
            return aVar.a(y10);
        }

        @Override // com.ironsource.InterfaceC0262b7
        public void a(InterfaceC0280c7 handler) {
            kotlin.jvm.internal.n.f(handler, "handler");
            handler.a(this.f28275a);
        }
    }

    default void a(InterfaceC0280c7 handler) {
        kotlin.jvm.internal.n.f(handler, "handler");
    }
}
