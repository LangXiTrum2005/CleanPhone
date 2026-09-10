package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.h7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0370h7 {

    /* JADX INFO: renamed from: com.ironsource.h7$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a extends InterfaceC0370h7 {

        /* JADX INFO: renamed from: com.ironsource.h7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0073a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f28780a;

            public C0073a(Exception exception) {
                kotlin.jvm.internal.n.f(exception, "exception");
                this.f28780a = exception;
            }

            public final C0073a a(Exception exception) {
                kotlin.jvm.internal.n.f(exception, "exception");
                return new C0073a(exception);
            }

            @Override // com.ironsource.InterfaceC0370h7.a
            public boolean b() {
                return true;
            }

            public final Exception c() {
                return this.f28780a;
            }

            public final Exception d() {
                return this.f28780a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0073a) && kotlin.jvm.internal.n.a(this.f28780a, ((C0073a) obj).f28780a);
            }

            public int hashCode() {
                return this.f28780a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.f28780a + ")";
            }

            public static /* synthetic */ C0073a a(C0073a c0073a, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = c0073a.f28780a;
                }
                return c0073a.a(exc);
            }

            @Override // com.ironsource.InterfaceC0370h7.a
            public String a() {
                String message = this.f28780a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - ".concat(message);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h7$a$b */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f28781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f28782b;

            public b(int i10, String str) {
                this.f28781a = i10;
                this.f28782b = str;
            }

            public final b a(int i10, String str) {
                return new b(i10, str);
            }

            @Override // com.ironsource.InterfaceC0370h7.a
            public boolean b() {
                return this.f28781a != 400;
            }

            public final int c() {
                return this.f28781a;
            }

            public final String d() {
                return this.f28782b;
            }

            public final int e() {
                return this.f28781a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f28781a == bVar.f28781a && kotlin.jvm.internal.n.a(this.f28782b, bVar.f28782b);
            }

            public final String f() {
                return this.f28782b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f28781a) * 31;
                String str = this.f28782b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.f28781a + ", errorMessage=" + this.f28782b + ")";
            }

            public static /* synthetic */ b a(b bVar, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f28781a;
                }
                if ((i11 & 2) != 0) {
                    str = bVar.f28782b;
                }
                return bVar.a(i10, str);
            }

            @Override // com.ironsource.InterfaceC0370h7.a
            public String a() {
                int i10 = this.f28781a;
                String str = this.f28782b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i10 + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h7$a$c */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC0370h7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC0370h7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.h7$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0370h7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28783a;

        public b(String response) {
            kotlin.jvm.internal.n.f(response, "response");
            this.f28783a = response;
        }

        public final b a(String response) {
            kotlin.jvm.internal.n.f(response, "response");
            return new b(response);
        }

        public final String c() {
            return this.f28783a;
        }

        public final String d() {
            return this.f28783a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f28783a, ((b) obj).f28783a);
        }

        public int hashCode() {
            return this.f28783a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("Success(response=", this.f28783a, ")");
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f28783a;
            }
            return bVar.a(str);
        }
    }
}
