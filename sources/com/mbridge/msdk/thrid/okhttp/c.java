package com.mbridge.msdk.thrid.okhttp;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f36142n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f36143o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f36148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f36150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f36151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f36152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f36153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f36154k;
    private final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f36155m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f36144a = z10;
        this.f36145b = z11;
        this.f36146c = i10;
        this.f36147d = i11;
        this.f36148e = z12;
        this.f36149f = z13;
        this.f36150g = z14;
        this.f36151h = i12;
        this.f36152i = i13;
        this.f36153j = z15;
        this.f36154k = z16;
        this.l = z17;
        this.f36155m = str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a A[SYNTHETIC] */
    public static c a(r rVar) {
        int i10;
        int iA;
        String strTrim;
        int iA2;
        String strTrim2;
        r rVar2 = rVar;
        int iB = rVar2.b();
        int i11 = 0;
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iA3 = -1;
        int iA4 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iA5 = -1;
        int iA6 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i11 < iB) {
            String strA = rVar2.a(i11);
            String strB = rVar2.b(i11);
            if (strA.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strB;
                }
                for (i10 = 0; i10 < strB.length(); i10 = iA2) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                    strTrim = strB.substring(i10, iA).trim();
                    if (iA != strB.length() || strB.charAt(iA) == ',' || strB.charAt(iA) == ';') {
                        iA2 = iA + 1;
                        strTrim2 = null;
                    } else {
                        int iB2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.b(strB, iA + 1);
                        if (iB2 >= strB.length() || strB.charAt(iB2) != '\"') {
                            iA2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, iB2, ",;");
                            strTrim2 = strB.substring(iB2, iA2).trim();
                        } else {
                            int i12 = iB2 + 1;
                            int iA7 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i12, "\"");
                            strTrim2 = strB.substring(i12, iA7);
                            iA2 = iA7 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z12 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z13 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z14 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z15 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z16 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z17 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z18 = true;
                        }
                    }
                }
                i11++;
                rVar2 = rVar;
            } else {
                if (strA.equalsIgnoreCase("Pragma")) {
                }
                i11++;
                rVar2 = rVar;
            }
            z10 = false;
            while (i10 < strB.length()) {
                iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                strTrim = strB.substring(i10, iA).trim();
                if (iA != strB.length()) {
                    iA2 = iA + 1;
                    strTrim2 = null;
                } else {
                    iA2 = iA + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z11 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z12 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z13 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z18 = true;
                    }
                }
            }
            i11++;
            rVar2 = rVar;
        }
        return new c(z11, z12, iA3, iA4, z13, z14, z15, iA5, iA6, z16, z17, z18, !z10 ? null : str);
    }

    public boolean b() {
        return this.f36148e;
    }

    public boolean c() {
        return this.f36149f;
    }

    public int d() {
        return this.f36146c;
    }

    public int e() {
        return this.f36151h;
    }

    public int f() {
        return this.f36152i;
    }

    public boolean g() {
        return this.f36150g;
    }

    public boolean h() {
        return this.f36144a;
    }

    public boolean i() {
        return this.f36145b;
    }

    public boolean j() {
        return this.f36153j;
    }

    public String toString() {
        String str = this.f36155m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f36155m = strA;
        return strA;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f36156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f36157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36158c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36159d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36160e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f36161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f36162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f36163h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 < 0) {
                throw new IllegalArgumentException(l1.d.e(i10, "maxStale < 0: "));
            }
            long seconds = timeUnit.toSeconds(i10);
            this.f36159d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public a b() {
            this.f36156a = true;
            return this;
        }

        public a c() {
            this.f36161f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f36144a = aVar.f36156a;
        this.f36145b = aVar.f36157b;
        this.f36146c = aVar.f36158c;
        this.f36147d = -1;
        this.f36148e = false;
        this.f36149f = false;
        this.f36150g = false;
        this.f36151h = aVar.f36159d;
        this.f36152i = aVar.f36160e;
        this.f36153j = aVar.f36161f;
        this.f36154k = aVar.f36162g;
        this.l = aVar.f36163h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f36144a) {
            sb2.append("no-cache, ");
        }
        if (this.f36145b) {
            sb2.append("no-store, ");
        }
        if (this.f36146c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f36146c);
            sb2.append(", ");
        }
        if (this.f36147d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f36147d);
            sb2.append(", ");
        }
        if (this.f36148e) {
            sb2.append("private, ");
        }
        if (this.f36149f) {
            sb2.append("public, ");
        }
        if (this.f36150g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f36151h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f36151h);
            sb2.append(", ");
        }
        if (this.f36152i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f36152i);
            sb2.append(", ");
        }
        if (this.f36153j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f36154k) {
            sb2.append("no-transform, ");
        }
        if (this.l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
