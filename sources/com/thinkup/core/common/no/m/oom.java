package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class oom {
    static final String m = " \"':;<=>@[]^`{}|/\\?#";
    static final String m0 = "\\^`{|}";
    static final String mm = "";
    static final String mn = " \"#<>\\^`{|}";
    static final String mo = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f42081n = " \"<>^`{}|/\\?#";
    private static final char[] nn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String o = " \"':;<=>@[]^`{}|/\\?#";
    static final String o0 = "[]";
    static final String om = " \"'<>#&=";
    static final String on = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final String oo = " \"'<>#";
    final String n0;
    final int nm;
    final String no;
    private final String o00;
    private final List<String> o0m;
    private final List<String> o0n;
    private final String o0o;
    private final String oo0;
    private final String ooo;

    public static final class o {
        static final String mo = "Invalid URL host";
        String m0;
        String o;
        String o0;
        final List<String> om;
        List<String> on;
        String m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f42082n = "";
        int oo = -1;

        public o() {
            ArrayList arrayList = new ArrayList();
            this.om = arrayList;
            arrayList.add("");
        }

        private o m(int i2, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String strO = oom.o(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.om.set(i2, strO);
            if (o0n(strO) || oo0(strO)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            return this;
        }

        private o m0(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            o(str, 0, str.length(), false, false);
            return this;
        }

        private o mm(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            o(str, 0, str.length(), false, true);
            return this;
        }

        private o mn(String str) {
            if (str != null) {
                return o(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        private o mo(String str) {
            if (str != null) {
                return o(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        private o n(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.o = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.o = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        private o n0(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
            o(str, 0, str.length());
            return this;
        }

        private o nm(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.on == null) {
                return this;
            }
            o00(oom.o(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        private o nn(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.on == null) {
                return this;
            }
            o00(oom.o(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        private o no(String str) {
            this.on = str != null ? oom.m(oom.o(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        private o o0(String str) {
            this.m = oom.o(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private void o00(String str) {
            for (int size = this.on.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.on.get(size))) {
                    this.on.remove(size + 1);
                    this.on.remove(size);
                    if (this.on.isEmpty()) {
                        this.on = null;
                        return;
                    }
                }
            }
        }

        private o o0m(String str) {
            this.m0 = str != null ? oom.o(str, "", true, false, false, false) : null;
            return this;
        }

        private static boolean o0n(String str) {
            return str.equals(com.thinkup.core.common.n.mo.ono) || str.equalsIgnoreCase("%2e");
        }

        private o o0o(String str) {
            this.m0 = str != null ? oom.o(str, "", false, false, false, false) : null;
            return this;
        }

        private o om(String str) {
            this.f42082n = oom.o(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private o on(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f42082n = oom.o(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private o oo(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.m = oom.o(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private static boolean oo0(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public final o o(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strOo = oo(str, 0, str.length());
            if (strOo == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.o0 = strOo;
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.o;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.m.isEmpty() || !this.f42082n.isEmpty()) {
                sb.append(this.m);
                if (!this.f42082n.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.f42082n);
                }
                sb.append('@');
            }
            String str2 = this.o0;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.o0);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.o0);
                }
            }
            if (this.oo != -1 || this.o != null) {
                int iO = o();
                String str3 = this.o;
                if (str3 == null || iO != oom.o(str3)) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(iO);
                }
            }
            oom.o(sb, this.om);
            if (this.on != null) {
                sb.append('?');
                oom.m(sb, this.on);
            }
            if (this.m0 != null) {
                sb.append('#');
                sb.append(this.m0);
            }
            return sb.toString();
        }

        private void o0() {
            List<String> list = this.om;
            if (!list.remove(list.size() - 1).isEmpty() || this.om.isEmpty()) {
                this.om.add("");
            } else {
                List<String> list2 = this.om;
                list2.set(list2.size() - 1, "");
            }
        }

        private static int om(String str, int i2, int i3) {
            try {
                int i4 = Integer.parseInt(oom.o(str, i2, i3, "", false, false, false, true, null));
                if (i4 <= 0 || i4 > 65535) {
                    return -1;
                }
                return i4;
            } catch (NumberFormatException unused) {
            }
        }

        private static String oo(String str, int i2, int i3) {
            return com.thinkup.core.common.no.m.o.n.o(oom.o(str, i2, i3, false));
        }

        private o o(int i2) {
            if (i2 > 0 && i2 <= 65535) {
                this.oo = i2;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
        }

        private o m(int i2) {
            this.om.remove(i2);
            if (this.om.isEmpty()) {
                this.om.add("");
            }
            return this;
        }

        private o n() {
            int size = this.om.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.om.set(i2, oom.o(this.om.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.on;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.on.get(i3);
                    if (str != null) {
                        this.on.set(i3, oom.o(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.m0;
            if (str2 != null) {
                this.m0 = oom.o(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        private static int o0(String str, int i2, int i3) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == ':') {
                    return i2;
                }
                if (cCharAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        public final int o() {
            int i2 = this.oo;
            return i2 != -1 ? i2 : oom.o(this.o);
        }

        private o o(String str, boolean z2) {
            int i2 = 0;
            while (true) {
                int iO = com.thinkup.core.common.no.m.o.n.o(str, i2, str.length(), "/\\");
                o(str, i2, iO, iO < str.length(), z2);
                i2 = iO + 1;
                if (i2 > str.length()) {
                    return this;
                }
                str = str;
                z2 = z2;
            }
        }

        private o o0(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.on != null) {
                    str3 = str;
                    o00(oom.o(str, " \"'<>#&=", true, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.on == null) {
                    this.on = new ArrayList();
                }
                this.on.add(oom.o(str3, " \"'<>#&=", true, false, true, true));
                this.on.add(str2 != null ? oom.o(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final o m(String str) {
            this.on = str != null ? oom.m(oom.o(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private o m(String str, String str2) {
            if (str != null) {
                if (this.on == null) {
                    this.on = new ArrayList();
                }
                this.on.add(oom.o(str, " \"'<>#&=", true, false, true, true));
                this.on.add(str2 != null ? oom.o(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        private o o(int i2, String str) {
            if (str != null) {
                String strO = oom.o(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
                if (!o0n(strO) && !oo0(strO)) {
                    this.om.set(i2, strO);
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("pathSegment == null");
        }

        private o o(String str, String str2) {
            if (str != null) {
                if (this.on == null) {
                    this.on = new ArrayList();
                }
                this.on.add(oom.o(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.on.add(str2 != null ? oom.o(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        private static int n(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        private o n(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.on != null) {
                    str3 = str;
                    o00(oom.o(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                } else {
                    str3 = str;
                }
                if (this.on == null) {
                    this.on = new ArrayList();
                }
                this.on.add(oom.o(str3, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.on.add(str2 != null ? oom.o(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final oom m() {
            if (this.o != null) {
                if (this.o0 != null) {
                    return new oom(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int m(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public final o o(oom oomVar, String str) {
            int i2;
            int iO;
            String str2;
            int i3;
            String str3;
            char cCharAt;
            String str4 = str;
            int iO2 = com.thinkup.core.common.no.m.o.n.o(str4, 0, str4.length());
            int iM = com.thinkup.core.common.no.m.o.n.m(str4, iO2, str4.length());
            int i4 = iM - iO2;
            char c2 = AbstractJsonLexerKt.COLON;
            if (i4 >= 2 && (((cCharAt = str4.charAt(iO2)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                int i5 = iO2 + 1;
                while (true) {
                    if (i5 < iM) {
                        char cCharAt2 = str4.charAt(i5);
                        if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || ((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i5++;
                        } else if (cCharAt2 == ':') {
                            i2 = i5;
                            break;
                        }
                    }
                    i2 = -1;
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
            if (i2 != -1) {
                if (str4.regionMatches(true, iO2, "https:", 0, 6)) {
                    this.o = HttpRequest.DEFAULT_SCHEME;
                    iO2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iO2, "http:", 0, 5)) {
                        this.o = "http";
                        iO2 += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i2) + "'");
                    }
                }
            } else if (oomVar != null) {
                this.o = oomVar.n0;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iN = n(str4, iO2, iM);
            if (iN < 2 && oomVar != null && oomVar.n0.equals(this.o)) {
                this.m = oomVar.o0();
                this.f42082n = oomVar.oo();
                this.o0 = oomVar.no;
                this.oo = oomVar.nm;
                this.om.clear();
                this.om.addAll(oomVar.mo());
                if (iO2 == iM || str4.charAt(iO2) == '#') {
                    m(oomVar.mm());
                }
                str2 = str4;
            } else {
                int i6 = iO2 + iN;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    iO = com.thinkup.core.common.no.m.o.n.o(str4, i6, iM, "@/\\?#");
                    byte bCharAt = iO != iM ? str4.charAt(iO) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == 35 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z2) {
                            int iO3 = com.thinkup.core.common.no.m.o.n.o(str4, i6, iO, c2);
                            String strO = oom.o(str, i6, iO3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z3) {
                                strO = a.s(new StringBuilder(), this.m, "%40", strO);
                            }
                            this.m = strO;
                            if (iO3 != iO) {
                                int i7 = iO3 + 1;
                                i3 = iO;
                                this.f42082n = oom.o(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z2 = true;
                            } else {
                                i3 = iO;
                            }
                            str3 = str;
                            z3 = true;
                        } else {
                            i3 = iO;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f42082n);
                            sb.append("%40");
                            str3 = str;
                            sb.append(oom.o(str3, i6, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f42082n = sb.toString();
                        }
                        i6 = i3 + 1;
                        str4 = str3;
                        c2 = AbstractJsonLexerKt.COLON;
                    }
                }
                str2 = str4;
                int i8 = i6;
                int iO0 = o0(str2, i8, iO);
                int i9 = iO0 + 1;
                if (i9 < iO) {
                    this.o0 = oo(str2, i8, iO0);
                    int iOm = om(str2, i9, iO);
                    this.oo = iOm;
                    if (iOm == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i9, iO) + AbstractJsonLexerKt.STRING);
                    }
                } else {
                    this.o0 = oo(str2, i8, iO0);
                    this.oo = oom.o(this.o);
                }
                if (this.o0 == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i8, iO0) + AbstractJsonLexerKt.STRING);
                }
                iO2 = iO;
            }
            int iO4 = com.thinkup.core.common.no.m.o.n.o(str2, iO2, iM, "?#");
            o(str2, iO2, iO4);
            if (iO4 < iM && str2.charAt(iO4) == '?') {
                int iO5 = com.thinkup.core.common.no.m.o.n.o(str2, iO4, iM, '#');
                this.on = oom.m(oom.o(str2, iO4 + 1, iO5, " \"'<>#", true, false, true, true, null));
                iO4 = iO5;
            }
            if (iO4 < iM && str2.charAt(iO4) == '#') {
                this.m0 = oom.o(str2, iO4 + 1, iM, "", true, false, false, false, null);
            }
            return this;
        }

        private void o(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.om;
                list.set(list.size() - 1, "");
            } else {
                this.om.clear();
                this.om.add("");
                i2++;
            }
            int i4 = i2;
            while (i4 < i3) {
                int iO = com.thinkup.core.common.no.m.o.n.o(str, i4, i3, "/\\");
                boolean z2 = iO < i3;
                String str2 = str;
                o(str2, i4, iO, z2, true);
                if (z2) {
                    iO++;
                }
                i4 = iO;
                str = str2;
            }
        }

        private void o(String str, int i2, int i3, boolean z2, boolean z3) {
            String strO = oom.o(str, i2, i3, " \"<>^`{}|/\\?#", z3, false, false, true, null);
            if (o0n(strO)) {
                return;
            }
            if (oo0(strO)) {
                o0();
                return;
            }
            if (((String) androidx.media3.extractor.text.ttml.a.h(1, this.om)).isEmpty()) {
                List<String> list = this.om;
                list.set(list.size() - 1, strO);
            } else {
                this.om.add(strO);
            }
            if (z2) {
                this.om.add("");
            }
        }
    }

    public oom(o oVar) {
        this.n0 = oVar.o;
        this.o00 = o(oVar.m, false);
        this.o0o = o(oVar.f42082n, false);
        this.no = oVar.o0;
        this.nm = oVar.o();
        this.o0m = o(oVar.om, false);
        List<String> list = oVar.on;
        this.o0n = list != null ? o(list, true) : null;
        String str = oVar.m0;
        this.oo0 = str != null ? o(str, false) : null;
        this.ooo = oVar.toString();
    }

    private String nm() {
        return this.o00;
    }

    private String nn() {
        return this.o0o;
    }

    private URL no() {
        try {
            return new URL(this.ooo);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int o(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    private int o00() {
        return this.o0m.size();
    }

    private int o0m() {
        List<String> list = this.o0n;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    private Set<String> o0n() {
        if (this.o0n == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.o0n.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            linkedHashSet.add(this.o0n.get(i2));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private List<String> o0o() {
        return this.o0m;
    }

    private String oo0() {
        if (this.oo0 == null) {
            return null;
        }
        return this.ooo.substring(this.ooo.indexOf(35) + 1);
    }

    private o oom() {
        String strSubstring;
        o oVar = new o();
        oVar.o = this.n0;
        oVar.m = o0();
        oVar.f42082n = oo();
        oVar.o0 = this.no;
        oVar.oo = this.nm != o(this.n0) ? this.nm : -1;
        oVar.om.clear();
        oVar.om.addAll(mo());
        oVar.m(mm());
        if (this.oo0 == null) {
            strSubstring = null;
        } else {
            strSubstring = this.ooo.substring(this.ooo.indexOf(35) + 1);
        }
        oVar.m0 = strSubstring;
        return oVar;
    }

    private String oon() {
        if (com.thinkup.core.common.no.m.o.n.n(this.no)) {
            return null;
        }
        return com.thinkup.core.common.no.m.o.mo.o.o().o(this.no);
    }

    private String ooo() {
        return this.oo0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oom) && ((oom) obj).ooo.equals(this.ooo);
    }

    public final int hashCode() {
        return this.ooo.hashCode();
    }

    public final String m() {
        return this.n0;
    }

    public final String m0() {
        int iIndexOf = this.ooo.indexOf(47, this.n0.length() + 3);
        String str = this.ooo;
        return this.ooo.substring(iIndexOf, com.thinkup.core.common.no.m.o.n.o(str, iIndexOf, str.length(), "?#"));
    }

    public final String mm() {
        if (this.o0n == null) {
            return null;
        }
        int iIndexOf = this.ooo.indexOf(63) + 1;
        String str = this.ooo;
        return this.ooo.substring(iIndexOf, com.thinkup.core.common.no.m.o.n.o(str, iIndexOf, str.length(), '#'));
    }

    public final String mn() {
        if (this.o0n == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m(sb, this.o0n);
        return sb.toString();
    }

    public final List<String> mo() {
        int iIndexOf = this.ooo.indexOf(47, this.n0.length() + 3);
        String str = this.ooo;
        int iO = com.thinkup.core.common.no.m.o.n.o(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iO) {
            int i2 = iIndexOf + 1;
            int iO2 = com.thinkup.core.common.no.m.o.n.o(this.ooo, i2, iO, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.ooo.substring(i2, iO2));
            iIndexOf = iO2;
        }
        return arrayList;
    }

    public final boolean n() {
        return this.n0.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public final String n0() {
        o oVarOn = on("/...");
        oVarOn.m = o("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        oVarOn.f42082n = o("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return oVarOn.m().toString();
    }

    public final String o0() {
        if (this.o00.isEmpty()) {
            return "";
        }
        int length = this.n0.length() + 3;
        String str = this.ooo;
        return this.ooo.substring(length, com.thinkup.core.common.no.m.o.n.o(str, length, str.length(), ":@"));
    }

    public final String om() {
        return this.no;
    }

    public final int on() {
        return this.nm;
    }

    public final String oo() {
        if (this.o0o.isEmpty()) {
            return "";
        }
        return this.ooo.substring(this.ooo.indexOf(58, this.n0.length() + 3) + 1, this.ooo.indexOf(64));
    }

    public final String toString() {
        return this.ooo;
    }

    public static void m(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(dc.T);
                sb.append(str2);
            }
        }
    }

    private List<String> om(String str) {
        if (this.o0n == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.o0n.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.o0n.get(i2))) {
                arrayList.add(this.o0n.get(i2 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private o on(String str) {
        try {
            return new o().o(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final oom n(String str) {
        o oVarOn = on(str);
        if (oVarOn != null) {
            return oVarOn.m();
        }
        return null;
    }

    public static void o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i2));
        }
    }

    private static oom m0(String str) {
        try {
            return o0(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static oom o0(String str) {
        return new o().o((oom) null, str).m();
    }

    private String oo(String str) {
        List<String> list = this.o0n;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.o0n.get(i2))) {
                return this.o0n.get(i2 + 1);
            }
        }
        return null;
    }

    private String o(int i2) {
        List<String> list = this.o0n;
        if (list != null) {
            return list.get(i2 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public static List<String> m(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iIndexOf = str.indexOf(38, i2);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i2);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i2, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i2, iIndexOf));
                arrayList.add(null);
            }
            i2 = iIndexOf + 1;
        }
        return arrayList;
    }

    private static oom o(URL url) {
        return m0(url.toString());
    }

    private static oom o(URI uri) {
        return m0(uri.toString());
    }

    public static String o(String str, boolean z2) {
        return o(str, 0, str.length(), z2);
    }

    private static List<String> o(List<String> list, boolean z2) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? o(str, z2) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String o(String str, int i2, int i3, boolean z2) {
        for (int i4 = i2; i4 < i3; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
                nVar.m(str, i2, i4);
                o(nVar, str, i4, i3, z2);
                return nVar.ooo();
            }
        }
        return str.substring(i2, i3);
    }

    private String m(int i2) {
        List<String> list = this.o0n;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    private static void o(com.thinkup.core.common.no.n.n nVar, String str, int i2, int i3, boolean z2) {
        int i4;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                int iO = com.thinkup.core.common.no.m.o.n.o(str.charAt(i2 + 1));
                int iO2 = com.thinkup.core.common.no.m.o.n.o(str.charAt(i4));
                if (iO != -1 && iO2 != -1) {
                    nVar.n0((iO << 4) + iO2);
                    i2 = i4;
                } else {
                    nVar.no(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z2) {
                nVar.n0(32);
            } else {
                nVar.no(iCodePointAt);
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    private static boolean o(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && com.thinkup.core.common.no.m.o.n.o(str.charAt(i2 + 1)) != -1 && com.thinkup.core.common.no.m.o.n.o(str.charAt(i4)) != -1;
    }

    public static String o(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        int iCharCount = i2;
        while (iCharCount < i3) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z5) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z2 && (!z3 || o(str, iCharCount, i3)))) && (iCodePointAt != 43 || !z4)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
                nVar.m(str, i2, iCharCount);
                com.thinkup.core.common.no.n.n nVar2 = null;
                while (iCharCount < i3) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            nVar.m(z2 ? "+" : "%2B");
                        } else if (iCodePointAt2 >= 32 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || !z5) && str2.indexOf(iCodePointAt2) == -1 && (iCodePointAt2 != 37 || (z2 && (!z3 || o(str, iCharCount, i3)))))) {
                            nVar.no(iCodePointAt2);
                        } else {
                            if (nVar2 == null) {
                                nVar2 = new com.thinkup.core.common.no.n.n();
                            }
                            if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                                nVar2.m(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset);
                            } else {
                                nVar2.no(iCodePointAt2);
                            }
                            while (!nVar2.on()) {
                                byte bMn = nVar2.mn();
                                int i4 = bMn & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                nVar.n0(37);
                                char[] cArr = nn;
                                nVar.n0((int) cArr[(i4 >> 4) & 15]);
                                nVar.n0((int) cArr[bMn & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return nVar.ooo();
            }
        }
        return str.substring(i2, i3);
    }

    private static void o(com.thinkup.core.common.no.n.n nVar, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        com.thinkup.core.common.no.n.n nVar2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z2 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z4) {
                    nVar.m(z2 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z5) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z2 && (!z3 || o(str, i2, i3)))))) {
                    nVar.no(iCodePointAt);
                } else {
                    if (nVar2 == null) {
                        nVar2 = new com.thinkup.core.common.no.n.n();
                    }
                    if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                        nVar2.m(str, i2, Character.charCount(iCodePointAt) + i2, charset);
                    } else {
                        nVar2.no(iCodePointAt);
                    }
                    while (!nVar2.on()) {
                        byte bMn = nVar2.mn();
                        int i4 = bMn & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        nVar.n0(37);
                        char[] cArr = nn;
                        nVar.n0((int) cArr[(i4 >> 4) & 15]);
                        nVar.n0((int) cArr[bMn & 15]);
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    public static String o(String str, String str2, boolean z2, Charset charset) {
        return o(str, 0, str.length(), str2, z2, false, true, true, charset);
    }

    public static String o(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        return o(str, 0, str.length(), str2, z2, z3, z4, z5, null);
    }

    public final URI o() {
        o oVar = new o();
        oVar.o = this.n0;
        oVar.m = o0();
        oVar.f42082n = oo();
        oVar.o0 = this.no;
        oVar.oo = this.nm != o(this.n0) ? this.nm : -1;
        oVar.om.clear();
        oVar.om.addAll(mo());
        oVar.m(mm());
        oVar.m0 = this.oo0 == null ? null : this.ooo.substring(this.ooo.indexOf(35) + 1);
        int size = oVar.om.size();
        for (int i2 = 0; i2 < size; i2++) {
            oVar.om.set(i2, o(oVar.om.get(i2), "[]", true, true, false, true));
        }
        List<String> list = oVar.on;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = oVar.on.get(i3);
                if (str != null) {
                    oVar.on.set(i3, o(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = oVar.m0;
        if (str2 != null) {
            oVar.m0 = o(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = oVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }
}
