package com.thinkup.core.common.no.m;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    public static final o0 m;
    public static final o0 o;
    private final boolean m0;
    private final boolean mm;
    private final int mn;
    private final boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42063n;
    private final int n0;
    private final boolean nm;
    private final boolean nn;
    private final boolean no;
    private final boolean o0;
    private final int om;
    private final int on;
    private final boolean oo;

    public static final class o {
        boolean m;
        boolean m0;
        boolean o;
        boolean om;
        boolean on;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42064n = -1;
        int o0 = -1;
        int oo = -1;

        private o m() {
            this.o = true;
            return this;
        }

        private o n() {
            this.m = true;
            return this;
        }

        private o o(int i2, TimeUnit timeUnit) {
            if (i2 < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i2)));
            }
            long seconds = timeUnit.toSeconds(i2);
            this.f42064n = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private o o0() {
            this.om = true;
            return this;
        }

        private o om() {
            this.m0 = true;
            return this;
        }

        private o oo() {
            this.on = true;
            return this;
        }

        private o m(int i2, TimeUnit timeUnit) {
            if (i2 < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i2)));
            }
            long seconds = timeUnit.toSeconds(i2);
            this.oo = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private o o(TimeUnit timeUnit) {
            long seconds = timeUnit.toSeconds(2147483647L);
            this.o0 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final o0 o() {
            return new o0(this);
        }
    }

    static {
        o oVar = new o();
        oVar.o = true;
        o = oVar.o();
        o oVar2 = new o();
        oVar2.om = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        oVar2.o0 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        m = oVar2.o();
    }

    private o0(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.o0 = z2;
        this.oo = z3;
        this.om = i2;
        this.on = i3;
        this.m0 = z4;
        this.mo = z5;
        this.mm = z6;
        this.mn = i4;
        this.n0 = i5;
        this.no = z7;
        this.nm = z8;
        this.nn = z9;
        this.f42063n = str;
    }

    private int mm() {
        return this.on;
    }

    private boolean mn() {
        return this.nm;
    }

    private boolean n0() {
        return this.nn;
    }

    private String no() {
        StringBuilder sb = new StringBuilder();
        if (this.o0) {
            sb.append("no-cache, ");
        }
        if (this.oo) {
            sb.append("no-store, ");
        }
        if (this.om != -1) {
            sb.append("max-age=");
            sb.append(this.om);
            sb.append(", ");
        }
        if (this.on != -1) {
            sb.append("s-maxage=");
            sb.append(this.on);
            sb.append(", ");
        }
        if (this.m0) {
            sb.append("private, ");
        }
        if (this.mo) {
            sb.append("public, ");
        }
        if (this.mm) {
            sb.append("must-revalidate, ");
        }
        if (this.mn != -1) {
            sb.append("max-stale=");
            sb.append(this.mn);
            sb.append(", ");
        }
        if (this.n0 != -1) {
            sb.append("min-fresh=");
            sb.append(this.n0);
            sb.append(", ");
        }
        if (this.no) {
            sb.append("only-if-cached, ");
        }
        if (this.nm) {
            sb.append("no-transform, ");
        }
        if (this.nn) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public final boolean m() {
        return this.oo;
    }

    public final int m0() {
        return this.n0;
    }

    public final boolean mo() {
        return this.no;
    }

    public final int n() {
        return this.om;
    }

    public final boolean o() {
        return this.o0;
    }

    public final boolean o0() {
        return this.m0;
    }

    public final boolean om() {
        return this.mm;
    }

    public final int on() {
        return this.mn;
    }

    public final boolean oo() {
        return this.mo;
    }

    public final String toString() {
        String string;
        String str = this.f42063n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.o0) {
            sb.append("no-cache, ");
        }
        if (this.oo) {
            sb.append("no-store, ");
        }
        if (this.om != -1) {
            sb.append("max-age=");
            sb.append(this.om);
            sb.append(", ");
        }
        if (this.on != -1) {
            sb.append("s-maxage=");
            sb.append(this.on);
            sb.append(", ");
        }
        if (this.m0) {
            sb.append("private, ");
        }
        if (this.mo) {
            sb.append("public, ");
        }
        if (this.mm) {
            sb.append("must-revalidate, ");
        }
        if (this.mn != -1) {
            sb.append("max-stale=");
            sb.append(this.mn);
            sb.append(", ");
        }
        if (this.n0 != -1) {
            sb.append("min-fresh=");
            sb.append(this.n0);
            sb.append(", ");
        }
        if (this.no) {
            sb.append("only-if-cached, ");
        }
        if (this.nm) {
            sb.append("no-transform, ");
        }
        if (this.nn) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f42063n = string;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ea A[SYNTHETIC] */
    public static o0 o(ooo oooVar) {
        int iO;
        int iO2;
        String strTrim;
        String strTrim2;
        ooo oooVar2 = oooVar;
        int iO3 = oooVar2.o();
        int i2 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iM = -1;
        int iM2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iM3 = -1;
        int iM4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i2 < iO3) {
            String strO = oooVar2.o(i2);
            String strM = oooVar2.m(i2);
            if (strO.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM;
                }
                iO = 0;
                while (iO < strM.length()) {
                    iO2 = com.thinkup.core.common.no.m.o.n.oo.o(strM, iO, "=,;");
                    strTrim = strM.substring(iO, iO2).trim();
                    if (iO2 != strM.length() || strM.charAt(iO2) == ',' || strM.charAt(iO2) == ';') {
                        iO = iO2 + 1;
                        strTrim2 = null;
                    } else {
                        int iO4 = com.thinkup.core.common.no.m.o.n.oo.o(strM, iO2 + 1);
                        if (iO4 >= strM.length() || strM.charAt(iO4) != '\"') {
                            iO = com.thinkup.core.common.no.m.o.n.oo.o(strM, iO4, ",;");
                            strTrim2 = strM.substring(iO4, iO).trim();
                        } else {
                            int i3 = iO4 + 1;
                            int iO5 = com.thinkup.core.common.no.m.o.n.oo.o(strM, i3, "\"");
                            strTrim2 = strM.substring(i3, iO5);
                            iO = iO5 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM2 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM3 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM4 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z10 = true;
                    }
                }
                i2++;
                oooVar2 = oooVar;
            } else {
                if (strO.equalsIgnoreCase("Pragma")) {
                }
                i2++;
                oooVar2 = oooVar;
            }
            z2 = false;
            iO = 0;
            while (iO < strM.length()) {
                iO2 = com.thinkup.core.common.no.m.o.n.oo.o(strM, iO, "=,;");
                strTrim = strM.substring(iO, iO2).trim();
                if (iO2 != strM.length()) {
                    iO = iO2 + 1;
                    strTrim2 = null;
                } else {
                    iO = iO2 + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(strTrim)) {
                    iM = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                    iM2 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                } else if ("private".equalsIgnoreCase(strTrim)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(strTrim)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                    iM3 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                    iM4 = com.thinkup.core.common.no.m.o.n.oo.m(strTrim2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                    z9 = true;
                } else if ("immutable".equalsIgnoreCase(strTrim)) {
                    z10 = true;
                }
            }
            i2++;
            oooVar2 = oooVar;
        }
        return new o0(z3, z4, iM, iM2, z5, z6, z7, iM3, iM4, z8, z9, z10, !z2 ? null : str);
    }

    public o0(o oVar) {
        this.o0 = oVar.o;
        this.oo = oVar.m;
        this.om = oVar.f42064n;
        this.on = -1;
        this.m0 = false;
        this.mo = false;
        this.mm = false;
        this.mn = oVar.o0;
        this.n0 = oVar.oo;
        this.no = oVar.om;
        this.nm = oVar.on;
        this.nn = oVar.m0;
    }
}
