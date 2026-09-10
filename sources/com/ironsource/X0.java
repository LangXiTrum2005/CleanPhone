package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface X0 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements X0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27619a;

        public a(String reason) {
            kotlin.jvm.internal.n.f(reason, "reason");
            this.f27619a = reason;
        }

        public final String a() {
            return this.f27619a;
        }

        public final String b() {
            return this.f27619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f27619a, ((a) obj).f27619a);
        }

        public int hashCode() {
            return this.f27619a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("Invalid(reason=", this.f27619a, ")");
        }

        public final a a(String reason) {
            kotlin.jvm.internal.n.f(reason, "reason");
            return new a(reason);
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f27619a;
            }
            return aVar.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements X0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27620a = new b();

        private b() {
        }
    }
}
