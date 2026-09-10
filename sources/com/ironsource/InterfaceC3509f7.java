package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3509f7 {

    /* JADX INFO: renamed from: com.ironsource.f7$a */
    public interface a extends InterfaceC3509f7 {

        /* JADX INFO: renamed from: com.ironsource.f7$a$a, reason: collision with other inner class name */
        public static final class C0399a implements a {
            private final Exception a;

            public C0399a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            public final C0399a a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C0399a(exception);
            }

            @Override // com.ironsource.InterfaceC3509f7.a
            public boolean b() {
                return true;
            }

            public final Exception c() {
                return this.a;
            }

            public final Exception d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0399a) && Intrinsics.wireman(this.a, ((C0399a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.a + ")";
            }

            public static /* synthetic */ C0399a a(C0399a c0399a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c0399a.a;
                }
                return c0399a.a(exc);
            }

            @Override // com.ironsource.InterfaceC3509f7.a
            public String a() {
                String message = this.a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f7$a$b */
        public static final class b implements a {
            private final int a;
            private final String b;

            public b(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final b a(int i, String str) {
                return new b(i, str);
            }

            @Override // com.ironsource.InterfaceC3509f7.a
            public boolean b() {
                return this.a != 400;
            }

            public final int c() {
                return this.a;
            }

            public final String d() {
                return this.b;
            }

            public final int e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && Intrinsics.wireman(this.b, bVar.b);
            }

            public final String f() {
                return this.b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
            }

            public static /* synthetic */ b a(b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.b;
                }
                return bVar.a(i, str);
            }

            @Override // com.ironsource.InterfaceC3509f7.a
            public String a() {
                int i = this.a;
                String str = this.b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC3509f7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC3509f7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.f7$b */
    public static final class b implements InterfaceC3509f7 {
        private final String a;

        public b(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a = response;
        }

        public final b a(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.wireman(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }
    }
}
