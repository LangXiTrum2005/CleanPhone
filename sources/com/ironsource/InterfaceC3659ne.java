package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3659ne {

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    public static final class a implements InterfaceC3659ne {
        private final C3462ce a;
        private final String b;
        private final String c;
        private final C3439b9 d;

        public a(C3462ce error, String str, String str2, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
            this.b = str;
            this.c = str2;
            this.d = c3439b9;
        }

        public final C3462ce a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final C3439b9 d() {
            return this.d;
        }

        public final C3462ce e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.wireman(this.a, aVar.a) && Intrinsics.wireman(this.b, aVar.b) && Intrinsics.wireman(this.c, aVar.c) && Intrinsics.wireman(this.d, aVar.d);
        }

        public final String f() {
            return this.c;
        }

        public final C3439b9 g() {
            return this.d;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C3439b9 c3439b9 = this.d;
            return iHashCode3 + (c3439b9 != null ? c3439b9.hashCode() : 0);
        }

        public String toString() {
            return "Failure(error=" + this.a + ", url=" + this.b + ", json=" + this.c + ", performanceMeasurer=" + this.d + ")";
        }

        public final a a(C3462ce error, String str, String str2, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, str, str2, c3439b9);
        }

        public static /* synthetic */ a a(a aVar, C3462ce c3462ce, String str, String str2, C3439b9 c3439b9, int i, Object obj) {
            if ((i & 1) != 0) {
                c3462ce = aVar.a;
            }
            if ((i & 2) != 0) {
                str = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                c3439b9 = aVar.d;
            }
            return aVar.a(c3462ce, str, str2, c3439b9);
        }

        public /* synthetic */ a(C3462ce c3462ce, String str, String str2, C3439b9 c3439b9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c3462ce, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : c3439b9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ne$b */
    public static final class b implements InterfaceC3659ne {
        private final C3587je a;
        private final C3439b9 b;

        public b(C3587je sdkInitResponse, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.a = sdkInitResponse;
            this.b = c3439b9;
        }

        public final C3587je a() {
            return this.a;
        }

        public final C3439b9 b() {
            return this.b;
        }

        public final C3439b9 c() {
            return this.b;
        }

        public final C3587je d() {
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
            return Intrinsics.wireman(this.a, bVar.a) && Intrinsics.wireman(this.b, bVar.b);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            C3439b9 c3439b9 = this.b;
            return iHashCode + (c3439b9 == null ? 0 : c3439b9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public final b a(C3587je sdkInitResponse, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c3439b9);
        }

        public static /* synthetic */ b a(b bVar, C3587je c3587je, C3439b9 c3439b9, int i, Object obj) {
            if ((i & 1) != 0) {
                c3587je = bVar.a;
            }
            if ((i & 2) != 0) {
                c3439b9 = bVar.b;
            }
            return bVar.a(c3587je, c3439b9);
        }
    }
}
