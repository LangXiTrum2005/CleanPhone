package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Bg {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends Bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Ag f25754a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ag error) {
            super(null);
            kotlin.jvm.internal.n.f(error, "error");
            this.f25754a = error;
        }

        public final Ag a() {
            return this.f25754a;
        }

        public final Ag b() {
            return this.f25754a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f25754a, ((a) obj).f25754a);
        }

        public int hashCode() {
            return this.f25754a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f25754a + ")";
        }

        public final a a(Ag error) {
            kotlin.jvm.internal.n.f(error, "error");
            return new a(error);
        }

        public static /* synthetic */ a a(a aVar, Ag ag2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ag2 = aVar.f25754a;
            }
            return aVar.a(ag2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends Bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25755a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ Bg(kotlin.jvm.internal.g gVar) {
        this();
    }

    private Bg() {
    }
}
