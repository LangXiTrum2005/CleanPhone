package com.mbridge.msdk.thrid.okhttp;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.B5;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f36657j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f36658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f36661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f36662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f36663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f36664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36666i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f36667a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f36670d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<String> f36672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<String> f36673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f36674h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f36668b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f36669c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36671e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f36672f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException(l1.d.e(i10, "unexpected port: "));
            }
            this.f36671e = i10;
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f36670d = strA;
            return this;
        }

        public a d() {
            int size = this.f36672f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f36672f.set(i10, s.a(this.f36672f.get(i10), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            List<String> list = this.f36673g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f36673g.get(i11);
                    if (str != null) {
                        this.f36673g.set(i11, s.a(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            String str2 = this.f36674h;
            if (str2 != null) {
                this.f36674h = s.a(str2, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f36669c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f36667a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f36667a = "https";
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f36668b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f36667a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f36668b.isEmpty() || !this.f36669c.isEmpty()) {
                sb2.append(this.f36668b);
                if (!this.f36669c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f36669c);
                }
                sb2.append('@');
            }
            String str2 = this.f36670d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f36670d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f36670d);
                }
            }
            if (this.f36671e != -1 || this.f36667a != null) {
                int iB = b();
                String str3 = this.f36667a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f36672f);
            if (this.f36673g != null) {
                sb2.append('?');
                s.a(sb2, this.f36673g);
            }
            if (this.f36674h != null) {
                sb2.append('#');
                sb2.append(this.f36674h);
            }
            return sb2.toString();
        }

        private void c() {
            List<String> list = this.f36672f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f36672f.isEmpty()) {
                this.f36672f.add("");
            } else {
                List<String> list2 = this.f36672f;
                list2.set(list2.size() - 1, "");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public int b() {
            int i10 = this.f36671e;
            return i10 != -1 ? i10 : s.a(this.f36667a);
        }

        private static int b(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(String str) {
            this.f36673g = str != null ? s.d(s.a(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f36667a != null) {
                if (this.f36670d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f36672f;
                list.set(list.size() - 1, "");
            } else {
                this.f36672f.clear();
                this.f36672f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                this = this;
                str = str;
                this.a(str, i12, iA, z10, true);
                i12 = z10 ? iA + 1 : iA;
            }
        }

        public a a(s sVar, String str) {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f36667a = "https";
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f36667a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (sVar != null) {
                this.f36667a = sVar.f36658a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c4 = '#';
            if (iF < 2 && sVar != null && sVar.f36658a.equals(this.f36667a)) {
                this.f36668b = sVar.f();
                this.f36669c = sVar.b();
                this.f36670d = sVar.f36661d;
                this.f36671e = sVar.f36662e;
                this.f36672f.clear();
                this.f36672f.addAll(sVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(sVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str4.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c4 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, ':');
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = q4.a.j(new StringBuilder(), this.f36668b, "%40", strA);
                            }
                            this.f36668b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f36669c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f36669c);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(s.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f36669c = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c4 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f36670d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f36671e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + '\"');
                    }
                } else {
                    this.f36670d = a(str2, i12, iC2);
                    this.f36671e = s.a(this.f36667a);
                }
                if (this.f36670d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, '#');
                this.f36673g = s.d(s.a(str2, iA3 + 1, iA4, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f36674h = s.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            List<String> list = this.f36672f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f36672f;
                list2.set(list2.size() - 1, strA);
            } else {
                this.f36672f.add(strA);
            }
            if (z10) {
                this.f36672f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    public s(a aVar) {
        this.f36658a = aVar.f36667a;
        this.f36659b = a(aVar.f36668b, false);
        this.f36660c = a(aVar.f36669c, false);
        this.f36661d = aVar.f36670d;
        this.f36662e = aVar.b();
        this.f36663f = a(aVar.f36672f, false);
        List<String> list = aVar.f36673g;
        this.f36664g = list != null ? a(list, true) : null;
        String str = aVar.f36674h;
        this.f36665h = str != null ? a(str, false) : null;
        this.f36666i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.f36660c.isEmpty()) {
            return "";
        }
        return this.f36666i.substring(this.f36666i.indexOf(58, this.f36658a.length() + 3) + 1, this.f36666i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f36666i.indexOf(47, this.f36658a.length() + 3);
        String str = this.f36666i;
        return this.f36666i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f36666i.indexOf(47, this.f36658a.length() + 3);
        String str = this.f36666i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36666i, i10, iA, '/');
            arrayList.add(this.f36666i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public String e() {
        if (this.f36664g == null) {
            return null;
        }
        int iIndexOf = this.f36666i.indexOf(63) + 1;
        String str = this.f36666i;
        return this.f36666i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f36666i.equals(this.f36666i);
    }

    public String f() {
        if (this.f36659b.isEmpty()) {
            return "";
        }
        int length = this.f36658a.length() + 3;
        String str = this.f36666i;
        return this.f36666i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f36661d;
    }

    public boolean h() {
        return this.f36658a.equals("https");
    }

    public int hashCode() {
        return this.f36666i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f36667a = this.f36658a;
        aVar.f36668b = f();
        aVar.f36669c = b();
        aVar.f36670d = this.f36661d;
        aVar.f36671e = this.f36662e != a(this.f36658a) ? this.f36662e : -1;
        aVar.f36672f.clear();
        aVar.f36672f.addAll(d());
        aVar.a(e());
        aVar.f36674h = a();
        return aVar;
    }

    public int j() {
        return this.f36662e;
    }

    public String k() {
        if (this.f36664g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f36664g);
        return sb2.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f36658a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f36666i;
    }

    public static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(B5.U);
                sb2.append(str2);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    public String a() {
        if (this.f36665h == null) {
            return null;
        }
        return this.f36666i.substring(this.f36666i.indexOf(35) + 1);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1));
                int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12));
                if (iA != -1 && iA2 != -1) {
                    cVar.writeByte((iA << 4) + iA2);
                    i10 = i12;
                } else {
                    cVar.f(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                cVar.writeByte(32);
            } else {
                cVar.f(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f36267j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f36657j;
                        cVar.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
