package com.thinkup.core.common.no.m;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.dc;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class no {
    private final String m0;
    private final boolean mm;
    private final boolean mn;
    private final String mo;
    private final boolean n0;
    private final boolean no;
    private final String om;
    private final long on;
    private final String oo;
    private static final Pattern o = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f42003n = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern o0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class o {
        String m;
        boolean m0;
        boolean mo;
        String o;
        String o0;
        boolean om;
        boolean on;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42004n = 253402300799999L;
        String oo = "/";

        private o m(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.m = str;
            return this;
        }

        private o n(String str) {
            return o(str, false);
        }

        private o o(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.o = str;
            return this;
        }

        private o o0(String str) {
            return o(str, true);
        }

        private o oo(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.oo = str;
            return this;
        }

        private no n() {
            return new no(this);
        }

        private o m() {
            this.on = true;
            return this;
        }

        private o o(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.f42004n = j;
            this.m0 = true;
            return this;
        }

        private o o(String str, boolean z2) {
            if (str != null) {
                String strO = com.thinkup.core.common.no.m.o.n.o(str);
                if (strO != null) {
                    this.o0 = strO;
                    this.mo = z2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            throw new NullPointerException("domain == null");
        }

        private o o() {
            this.om = true;
            return this;
        }
    }

    private no(String str, String str2, long j, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.oo = str;
        this.om = str2;
        this.on = j;
        this.m0 = str3;
        this.mo = str4;
        this.mm = z2;
        this.mn = z3;
        this.no = z4;
        this.n0 = z5;
    }

    private boolean m0() {
        return this.mn;
    }

    private String mm() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.oo);
        sb.append(dc.T);
        sb.append(this.om);
        if (this.n0) {
            if (this.on == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.thinkup.core.common.no.m.o.n.o0.o(new Date(this.on)));
            }
        }
        if (!this.no) {
            sb.append("; domain=");
            sb.append(this.m0);
        }
        sb.append("; path=");
        sb.append(this.mo);
        if (this.mm) {
            sb.append("; secure");
        }
        if (this.mn) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    private boolean mo() {
        return this.mm;
    }

    private boolean n() {
        return this.n0;
    }

    private long o0() {
        return this.on;
    }

    private String om() {
        return this.m0;
    }

    private String on() {
        return this.mo;
    }

    private boolean oo() {
        return this.no;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        return noVar.oo.equals(this.oo) && noVar.om.equals(this.om) && noVar.m0.equals(this.m0) && noVar.mo.equals(this.mo) && noVar.on == this.on && noVar.mm == this.mm && noVar.mn == this.mn && noVar.n0 == this.n0 && noVar.no == this.no;
    }

    public final int hashCode() {
        int iB = a.b(this.mo, a.b(this.m0, a.b(this.om, a.b(this.oo, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31), 31), 31);
        long j = this.on;
        return ((((((((iB + ((int) (j ^ (j >>> 32)))) * 31) + (!this.mm ? 1 : 0)) * 31) + (!this.mn ? 1 : 0)) * 31) + (!this.n0 ? 1 : 0)) * 31) + (!this.no ? 1 : 0);
    }

    public final String m() {
        return this.om;
    }

    public final String o() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.oo);
        sb.append(dc.T);
        sb.append(this.om);
        if (this.n0) {
            if (this.on == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.thinkup.core.common.no.m.o.n.o0.o(new Date(this.on)));
            }
        }
        if (!this.no) {
            sb.append("; domain=");
            sb.append(this.m0);
        }
        sb.append("; path=");
        sb.append(this.mo);
        if (this.mm) {
            sb.append("; secure");
        }
        if (this.mn) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    private static no m(oom oomVar, String str) {
        return o(System.currentTimeMillis(), oomVar, str);
    }

    private boolean o(oom oomVar) {
        if (!(this.no ? oomVar.no.equals(this.m0) : o(oomVar.no, this.m0))) {
            return false;
        }
        String str = this.mo;
        String strM0 = oomVar.m0();
        if (strM0.equals(str) || (strM0.startsWith(str) && (str.endsWith("/") || strM0.charAt(str.length()) == '/'))) {
            return !this.mm || oomVar.n();
        }
        return false;
    }

    private static String m(String str) {
        if (!str.endsWith(com.thinkup.core.common.n.mo.ono)) {
            if (str.startsWith(com.thinkup.core.common.n.mo.ono)) {
                str = str.substring(1);
            }
            String strO = com.thinkup.core.common.no.m.o.n.o(str);
            if (strO != null) {
                return strO;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public no(o oVar) {
        String str = oVar.o;
        if (str != null) {
            String str2 = oVar.m;
            if (str2 != null) {
                String str3 = oVar.o0;
                if (str3 != null) {
                    this.oo = str;
                    this.om = str2;
                    this.on = oVar.f42004n;
                    this.m0 = str3;
                    this.mo = oVar.oo;
                    this.mm = oVar.om;
                    this.mn = oVar.on;
                    this.n0 = oVar.m0;
                    this.no = oVar.mo;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    private static boolean o(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.thinkup.core.common.no.m.o.n.n(str);
    }

    private static boolean o(oom oomVar, String str) {
        String strM0 = oomVar.m0();
        if (strM0.equals(str)) {
            return true;
        }
        if (strM0.startsWith(str)) {
            return str.endsWith("/") || strM0.charAt(str.length()) == '/';
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    private static no o(long j, oom oomVar, String str) {
        long j2;
        String strSubstring;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        String str2 = str;
        int length = str2.length();
        ?? r3 = 0;
        char c2 = ';';
        int iO = com.thinkup.core.common.no.m.o.n.o(str2, 0, length, ';');
        char c3 = dc.T;
        int iO2 = com.thinkup.core.common.no.m.o.n.o(str2, 0, iO, dc.T);
        String str3 = null;
        if (iO2 == iO) {
            return null;
        }
        String strN = com.thinkup.core.common.no.m.o.n.n(str2, 0, iO2);
        if (!strN.isEmpty()) {
            int i6 = -1;
            if (com.thinkup.core.common.no.m.o.n.m(strN) == -1) {
                boolean z3 = true;
                String strN2 = com.thinkup.core.common.no.m.o.n.n(str2, iO2 + 1, iO);
                if (com.thinkup.core.common.no.m.o.n.m(strN2) != -1) {
                    return null;
                }
                int i7 = iO + 1;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                String strSubstring2 = null;
                boolean z7 = true;
                long jO = -1;
                long timeInMillis = 253402300799999L;
                while (i7 < length) {
                    int iO3 = com.thinkup.core.common.no.m.o.n.o(str2, i7, length, c2);
                    int iO4 = com.thinkup.core.common.no.m.o.n.o(str2, i7, iO3, c3);
                    String strN3 = com.thinkup.core.common.no.m.o.n.n(str2, i7, iO4);
                    if (iO4 < iO3) {
                        strSubstring = com.thinkup.core.common.no.m.o.n.n(str2, iO4 + 1, iO3);
                    } else {
                        strSubstring = "";
                    }
                    if (strN3.equalsIgnoreCase("expires")) {
                        try {
                            int length2 = strSubstring.length();
                            int iO5 = o(strSubstring, r3, length2, r3);
                            try {
                                Matcher matcher = o0.matcher(strSubstring);
                                int i8 = i6;
                                int i9 = i8;
                                int iIndexOf = i9;
                                int i10 = iIndexOf;
                                int i11 = i10;
                                int i12 = i11;
                                while (iO5 < length2) {
                                    int iO6 = o(strSubstring, iO5 + 1, length2, z3);
                                    matcher.region(iO5, iO6);
                                    int i13 = i9;
                                    try {
                                        if (i13 == -1) {
                                            if (matcher.usePattern(o0).matches()) {
                                                i13 = Integer.parseInt(matcher.group(1));
                                                i11 = Integer.parseInt(matcher.group(2));
                                                i12 = Integer.parseInt(matcher.group(3));
                                            } else {
                                                i3 = -1;
                                            }
                                            iIndexOf = iIndexOf;
                                            i2 = length;
                                            i9 = i13;
                                            iO5 = o(strSubstring, iO6 + 1, length2, false);
                                            length = i2;
                                            z3 = true;
                                            iIndexOf = iIndexOf;
                                        } else {
                                            i3 = -1;
                                        }
                                        if (i4 != i3) {
                                            int i14 = length;
                                            i5 = i3;
                                            i2 = i14;
                                        } else if (matcher.usePattern(f42003n).matches()) {
                                            i10 = Integer.parseInt(matcher.group(1));
                                            iIndexOf = iIndexOf;
                                            i2 = length;
                                            i9 = i13;
                                            iO5 = o(strSubstring, iO6 + 1, length2, false);
                                            length = i2;
                                            z3 = true;
                                            iIndexOf = iIndexOf;
                                        } else {
                                            i2 = length;
                                            i5 = -1;
                                        }
                                        i9 = i13;
                                        iO5 = o(strSubstring, iO6 + 1, length2, false);
                                        length = i2;
                                        z3 = true;
                                        iIndexOf = iIndexOf;
                                    } catch (IllegalArgumentException unused) {
                                        c2 = ';';
                                        z2 = true;
                                        i7 = iO3 + 1;
                                        str2 = str;
                                        z3 = z2;
                                        length = i2;
                                        r3 = 0;
                                        c3 = dc.T;
                                        i6 = -1;
                                    }
                                    i4 = i10;
                                    if (iIndexOf == i5) {
                                        Pattern pattern = m;
                                        if (matcher.usePattern(pattern).matches()) {
                                            iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                        } else {
                                            i5 = -1;
                                            if (i8 == i5 && matcher.usePattern(o).matches()) {
                                                i8 = Integer.parseInt(matcher.group(1));
                                            }
                                        }
                                    } else if (i8 == i5) {
                                        i8 = Integer.parseInt(matcher.group(1));
                                    }
                                    i10 = i4;
                                }
                                int i15 = i9;
                                int i16 = iIndexOf;
                                int i17 = i10;
                                i2 = length;
                                if (i8 >= 70 && i8 <= 99) {
                                    i8 += 1900;
                                }
                                if (i8 >= 0 && i8 <= 69) {
                                    i8 += 2000;
                                }
                                if (i8 < 1601) {
                                    throw new IllegalArgumentException();
                                }
                                if (i16 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i17 <= 0 || i17 > 31) {
                                    throw new IllegalArgumentException();
                                }
                                if (i15 < 0 || i15 > 23) {
                                    throw new IllegalArgumentException();
                                }
                                int i18 = i11;
                                c2 = ';';
                                if (i18 < 0 || i18 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                int i19 = i12;
                                if (i19 >= 0 && i19 <= 59) {
                                    try {
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.thinkup.core.common.no.m.o.n.om);
                                        gregorianCalendar.setLenient(false);
                                        gregorianCalendar.set(1, i8);
                                        gregorianCalendar.set(2, i16 - 1);
                                        gregorianCalendar.set(5, i17);
                                        gregorianCalendar.set(11, i15);
                                        gregorianCalendar.set(12, i18);
                                        gregorianCalendar.set(13, i19);
                                        gregorianCalendar.set(14, 0);
                                        timeInMillis = gregorianCalendar.getTimeInMillis();
                                        z2 = true;
                                        z4 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        z2 = true;
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } catch (IllegalArgumentException unused3) {
                                i2 = length;
                            }
                        } catch (IllegalArgumentException unused4) {
                            i2 = length;
                        }
                    } else {
                        i2 = length;
                        if (strN3.equalsIgnoreCase("max-age")) {
                            jO = o(strSubstring);
                            z2 = true;
                            z4 = true;
                        } else if (strN3.equalsIgnoreCase("domain")) {
                            if (!strSubstring.endsWith(com.thinkup.core.common.n.mo.ono)) {
                                if (strSubstring.startsWith(com.thinkup.core.common.n.mo.ono)) {
                                    z2 = true;
                                    try {
                                        strSubstring = strSubstring.substring(1);
                                    } catch (IllegalArgumentException unused5) {
                                        continue;
                                    }
                                } else {
                                    z2 = true;
                                }
                                String strO = com.thinkup.core.common.no.m.o.n.o(strSubstring);
                                if (strO == null) {
                                    throw new IllegalArgumentException();
                                }
                                str3 = strO;
                                z7 = false;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            z2 = true;
                            if (strN3.equalsIgnoreCase("path")) {
                                strSubstring2 = strSubstring;
                            } else if (strN3.equalsIgnoreCase("secure")) {
                                z5 = true;
                            } else if (strN3.equalsIgnoreCase("httponly")) {
                                z6 = true;
                            }
                        }
                    }
                    i7 = iO3 + 1;
                    str2 = str;
                    z3 = z2;
                    length = i2;
                    r3 = 0;
                    c3 = dc.T;
                    i6 = -1;
                }
                if (jO == Long.MIN_VALUE) {
                    j2 = Long.MIN_VALUE;
                } else if (jO != -1) {
                    long j3 = j + (jO <= 9223372036854775L ? jO * 1000 : Long.MAX_VALUE);
                    j2 = (j3 < j || j3 > 253402300799999L) ? 253402300799999L : j3;
                } else {
                    j2 = timeInMillis;
                }
                String str4 = oomVar.no;
                if (str3 == null) {
                    str3 = str4;
                } else if (!o(str4, str3)) {
                    return null;
                }
                if (str4.length() != str3.length() && com.thinkup.core.common.no.m.o.mo.o.o().o(str3) == null) {
                    return null;
                }
                if (strSubstring2 == null || !strSubstring2.startsWith("/")) {
                    String strM0 = oomVar.m0();
                    int iLastIndexOf = strM0.lastIndexOf(47);
                    if (iLastIndexOf == 0) {
                        strSubstring2 = "/";
                    } else {
                        strSubstring2 = strM0.substring(0, iLastIndexOf);
                    }
                }
                return new no(strN, strN2, j2, str3, strSubstring2, z5, z6, z7, z4);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    private static long o(String str, int i2) {
        int iO = o(str, 0, i2, false);
        Matcher matcher = o0.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iO < i2) {
            int iO2 = o(str, iO + 1, i2, true);
            matcher.region(iO, iO2);
            if (i4 == -1 && matcher.usePattern(o0).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f42003n).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = m;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(o).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iO = o(str, iO2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 <= 0 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 >= 0 && i7 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.thinkup.core.common.no.m.o.n.om);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iIndexOf - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int o(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static long o(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(TokenBuilder.TOKEN_DELIMITER) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public static List<no> o(oom oomVar, ooo oooVar) {
        List<String> listM = oooVar.m("Set-Cookie");
        int size = listM.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            no noVarO = o(System.currentTimeMillis(), oomVar, listM.get(i2));
            if (noVarO != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(noVarO);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }
}
