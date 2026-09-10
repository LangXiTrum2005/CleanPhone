package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Ae {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Ae {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0520pe f25650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0300d9 f25651b;

        public a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f25650a = error;
            this.f25651b = c0300d9;
        }

        public final C0520pe a() {
            return this.f25650a;
        }

        public final C0300d9 b() {
            return this.f25651b;
        }

        public final C0520pe c() {
            return this.f25650a;
        }

        public final C0300d9 d() {
            return this.f25651b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f25650a, aVar.f25650a) && kotlin.jvm.internal.n.a(this.f25651b, aVar.f25651b);
        }

        public int hashCode() {
            int iHashCode = this.f25650a.hashCode() * 31;
            C0300d9 c0300d9 = this.f25651b;
            return iHashCode + (c0300d9 == null ? 0 : c0300d9.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.f25650a + ", performanceMeasurer=" + this.f25651b + ")";
        }

        public final a a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            return new a(error, c0300d9);
        }

        public static /* synthetic */ a a(a aVar, C0520pe c0520pe, C0300d9 c0300d9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c0520pe = aVar.f25650a;
            }
            if ((i10 & 2) != 0) {
                c0300d9 = aVar.f25651b;
            }
            return aVar.a(c0520pe, c0300d9);
        }

        public /* synthetic */ a(C0520pe c0520pe, C0300d9 c0300d9, int i10, kotlin.jvm.internal.g gVar) {
            this(c0520pe, (i10 & 2) != 0 ? null : c0300d9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements Ae {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0645we f25652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0300d9 f25653b;

        public b(C0645we sdkInitResponse, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(sdkInitResponse, "sdkInitResponse");
            this.f25652a = sdkInitResponse;
            this.f25653b = c0300d9;
        }

        public final C0645we a() {
            return this.f25652a;
        }

        public final C0300d9 b() {
            return this.f25653b;
        }

        public final C0300d9 c() {
            return this.f25653b;
        }

        public final C0645we d() {
            return this.f25652a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.n.a(this.f25652a, bVar.f25652a) && kotlin.jvm.internal.n.a(this.f25653b, bVar.f25653b);
        }

        public int hashCode() {
            int iHashCode = this.f25652a.hashCode() * 31;
            C0300d9 c0300d9 = this.f25653b;
            return iHashCode + (c0300d9 == null ? 0 : c0300d9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.f25652a + ", performanceMeasurer=" + this.f25653b + ")";
        }

        public final b a(C0645we sdkInitResponse, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c0300d9);
        }

        public static /* synthetic */ b a(b bVar, C0645we c0645we, C0300d9 c0300d9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c0645we = bVar.f25652a;
            }
            if ((i10 & 2) != 0) {
                c0300d9 = bVar.f25653b;
            }
            return bVar.a(c0645we, c0300d9);
        }
    }
}
