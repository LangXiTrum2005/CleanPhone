package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0416k0 {

    /* JADX INFO: renamed from: com.ironsource.k0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0416k0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0074a f29011c = new C0074a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f29013b;

        /* JADX INFO: renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0074a {
            public /* synthetic */ C0074a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }

            private C0074a() {
            }
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public final String b() {
            return this.f29012a;
        }

        public final String c() {
            return this.f29012a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f29012a, ((a) obj).f29012a);
        }

        public int hashCode() {
            String str = this.f29012a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return defpackage.e.o("NotReady(reason=", this.f29012a, ")");
        }

        public a(String str) {
            this.f29012a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f29012a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC0416k0
        public boolean a() {
            return this.f29013b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k0$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0416k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29014a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f29015b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC0416k0
        public boolean a() {
            return f29015b;
        }
    }

    boolean a();
}
