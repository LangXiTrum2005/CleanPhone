package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9151d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9155d;

        public r2 a() {
            return new r2(this.f9152a, this.f9153b, this.f9154c, this.f9155d);
        }

        public a b(int i10) {
            this.f9154c = i10;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=");
            sb2.append(this.f9152a);
            sb2.append(", signature=");
            sb2.append(this.f9153b);
            sb2.append(", responseCode=");
            sb2.append(this.f9154c);
            sb2.append(", nonce=");
            return l1.d.i(sb2, this.f9155d, ")");
        }

        public a a(int i10) {
            this.f9155d = i10;
            return this;
        }

        public a b(String str) {
            this.f9152a = str;
            return this;
        }

        public a a(String str) {
            this.f9153b = str;
            return this;
        }
    }

    public r2(String str, String str2, int i10, int i11) {
        this.f9148a = str;
        this.f9149b = str2;
        this.f9150c = i10;
        this.f9151d = i11;
    }

    public boolean a(Object obj) {
        return obj instanceof r2;
    }

    public int b() {
        return this.f9151d;
    }

    public int c() {
        return this.f9150c;
    }

    public String d() {
        return this.f9149b;
    }

    public String e() {
        return this.f9148a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        if (!r2Var.a(this) || c() != r2Var.c() || b() != r2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = r2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = r2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iB = b() + ((c() + 59) * 59);
        String strE = e();
        int i10 = iB * 59;
        int iHashCode = strE == null ? 43 : strE.hashCode();
        String strD = d();
        return ((i10 + iHashCode) * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
