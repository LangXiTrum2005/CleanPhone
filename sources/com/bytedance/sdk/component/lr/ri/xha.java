package com.bytedance.sdk.component.lr.ri;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xha {
    private static final char[] ka = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String di;
    private final String fi;
    final int ik;
    private final String jbs;
    final String lr;
    private final List<String> mj;
    private final String qt;
    final String ri;
    private final List<String> xha;

    public static final class ri {
        final List<String> di;
        String ka;
        String mj;
        String ri;
        List<String> xha;
        String lr = "";
        String ik = "";
        int fi = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.xha$ri$ri, reason: collision with other inner class name */
        public enum EnumC0214ri {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public ri() {
            ArrayList arrayList = new ArrayList();
            this.di = arrayList;
            arrayList.add("");
        }

        private boolean di(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean fi(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public ri ik(String str) {
            if (str != null) {
                return ri(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public ri ka(String str) {
            this.xha = str != null ? xha.lr(xha.ri(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public ri lr(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strFi = fi(str, 0, str.length());
            if (strFi == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.ka = strFi;
            return this;
        }

        public ri ri(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.ri = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.ri = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.ri);
            sb.append("://");
            if (!this.lr.isEmpty() || !this.ik.isEmpty()) {
                sb.append(this.lr);
                if (!this.ik.isEmpty()) {
                    sb.append(':');
                    sb.append(this.ik);
                }
                sb.append('@');
            }
            if (this.ka.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.ka);
                sb.append(']');
            } else {
                sb.append(this.ka);
            }
            int iRi = ri();
            if (iRi != xha.ri(this.ri)) {
                sb.append(':');
                sb.append(iRi);
            }
            xha.ri(sb, this.di);
            if (this.xha != null) {
                sb.append('?');
                xha.lr(sb, this.xha);
            }
            if (this.mj != null) {
                sb.append('#');
                sb.append(this.mj);
            }
            return sb.toString();
        }

        private static String fi(String str, int i, int i2) {
            return com.bytedance.sdk.component.lr.ri.lr.jbs.ri(xha.ri(str, i, i2, false));
        }

        private void ik() {
            List<String> list = this.di;
            if (list.remove(list.size() - 1).isEmpty() && !this.di.isEmpty()) {
                List<String> list2 = this.di;
                list2.set(list2.size() - 1, "");
            } else {
                this.di.add("");
            }
        }

        private static int ka(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static int di(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(xha.ri(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        public xha lr() {
            if (this.ri != null) {
                if (this.ka != null) {
                    return new xha(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int ik(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public int ri() {
            int i = this.fi;
            return i != -1 ? i : xha.ri(this.ri);
        }

        private ri ri(String str, boolean z) {
            int i = 0;
            while (true) {
                int iRi = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str, i, str.length(), "/\\");
                ri(str, i, iRi, iRi < str.length(), z);
                i = iRi + 1;
                if (i > str.length()) {
                    return this;
                }
                str = str;
                z = z;
            }
        }

        private static int lr(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public ri ri(String str, String str2) {
            if (str != null) {
                if (this.xha == null) {
                    this.xha = new ArrayList();
                }
                this.xha.add(xha.ri(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                this.xha.add(str2 != null ? xha.ri(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0214ri ri(xha xhaVar, String str) {
            int iRi;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iRi2 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str4, 0, str4.length());
            int iLr = com.bytedance.sdk.component.lr.ri.lr.jbs.lr(str4, iRi2, str4.length());
            if (lr(str4, iRi2, iLr) != -1) {
                if (str4.regionMatches(true, iRi2, "https:", 0, 6)) {
                    this.ri = HttpRequest.DEFAULT_SCHEME;
                    iRi2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iRi2, "http:", 0, 5)) {
                        this.ri = "http";
                        iRi2 += 5;
                    } else {
                        return EnumC0214ri.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (xhaVar != null) {
                this.ri = xhaVar.ri;
            } else {
                return EnumC0214ri.MISSING_SCHEME;
            }
            int iIk = ik(str4, iRi2, iLr);
            char c = '#';
            if (iIk < 2 && xhaVar != null && xhaVar.ri.equals(this.ri)) {
                this.lr = xhaVar.lr();
                this.ik = xhaVar.ik();
                this.ka = xhaVar.lr;
                this.fi = xhaVar.ik;
                this.di.clear();
                this.di.addAll(xhaVar.ka());
                if (iRi2 == iLr || str4.charAt(iRi2) == '#') {
                    ka(xhaVar.fi());
                }
                str2 = str4;
            } else {
                int i2 = iRi2 + iIk;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iRi = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str4, i2, iLr, "@/\\?#");
                    byte bCharAt = iRi != iLr ? str4.charAt(iRi) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iRi3 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str4, i2, iRi, ':');
                            String strRi = xha.ri(str, i2, iRi3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strRi = this.lr + "%40" + strRi;
                            }
                            this.lr = strRi;
                            if (iRi3 != iRi) {
                                i = iRi;
                                this.ik = xha.ri(str, iRi3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iRi;
                            }
                            str3 = str;
                            z2 = true;
                        } else {
                            i = iRi;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.ik);
                            sb.append("%40");
                            str3 = str;
                            sb.append(xha.ri(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.ik = sb.toString();
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int iKa = ka(str2, i3, iRi);
                int i4 = iKa + 1;
                if (i4 < iRi) {
                    this.ka = fi(str2, i3, iKa);
                    int iDi = di(str2, i4, iRi);
                    this.fi = iDi;
                    if (iDi == -1) {
                        return EnumC0214ri.INVALID_PORT;
                    }
                } else {
                    this.ka = fi(str2, i3, iKa);
                    this.fi = xha.ri(this.ri);
                }
                if (this.ka == null) {
                    return EnumC0214ri.INVALID_HOST;
                }
                iRi2 = iRi;
            }
            int iRi4 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str2, iRi2, iLr, "?#");
            ri(str2, iRi2, iRi4);
            if (iRi4 < iLr && str2.charAt(iRi4) == '?') {
                int iRi5 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str2, iRi4, iLr, '#');
                this.xha = xha.lr(xha.ri(str2, iRi4 + 1, iRi5, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iRi4 = iRi5;
            }
            if (iRi4 < iLr && str2.charAt(iRi4) == '#') {
                this.mj = xha.ri(str2, iRi4 + 1, iLr, "", true, false, false, false, null);
            }
            return EnumC0214ri.SUCCESS;
        }

        private void ri(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.di;
                list.set(list.size() - 1, "");
            } else {
                this.di.clear();
                this.di.add("");
                i++;
            }
            int i3 = i;
            while (i3 < i2) {
                int iRi = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str, i3, i2, "/\\");
                boolean z = iRi < i2;
                String str2 = str;
                ri(str2, i3, iRi, z, true);
                if (z) {
                    iRi++;
                }
                i3 = iRi;
                str = str2;
            }
        }

        private void ri(String str, int i, int i2, boolean z, boolean z2) {
            String strRi = xha.ri(str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true, null);
            if (fi(strRi)) {
                return;
            }
            if (di(strRi)) {
                ik();
                return;
            }
            List<String> list = this.di;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.di;
                list2.set(list2.size() - 1, strRi);
            } else {
                this.di.add(strRi);
            }
            if (z) {
                this.di.add("");
            }
        }
    }

    public xha(ri riVar) {
        this.ri = riVar.ri;
        this.fi = ri(riVar.lr, false);
        this.di = ri(riVar.ik, false);
        this.lr = riVar.ka;
        this.ik = riVar.ri();
        this.xha = ri(riVar.di, false);
        List<String> list = riVar.xha;
        this.mj = list != null ? ri(list, true) : null;
        String str = riVar.mj;
        this.jbs = str != null ? ri(str, false) : null;
        this.qt = riVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof xha) && ((xha) obj).qt.equals(this.qt);
    }

    public String fi() {
        if (this.mj == null) {
            return null;
        }
        int iIndexOf = this.qt.indexOf(63) + 1;
        String str = this.qt;
        return this.qt.substring(iIndexOf, com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str, iIndexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.qt.hashCode();
    }

    public String ik() {
        if (this.di.isEmpty()) {
            return "";
        }
        return this.qt.substring(this.qt.indexOf(58, this.ri.length() + 3) + 1, this.qt.indexOf(64));
    }

    public List<String> ka() {
        int iIndexOf = this.qt.indexOf(47, this.ri.length() + 3);
        String str = this.qt;
        int iRi = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iRi) {
            int i = iIndexOf + 1;
            int iRi2 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(this.qt, i, iRi, '/');
            arrayList.add(this.qt.substring(i, iRi2));
            iIndexOf = iRi2;
        }
        return arrayList;
    }

    public String lr() {
        if (this.fi.isEmpty()) {
            return "";
        }
        int length = this.ri.length() + 3;
        String str = this.qt;
        return this.qt.substring(length, com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str, length, str.length(), ":@"));
    }

    public URL ri() {
        try {
            return new URL(this.qt);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.qt;
    }

    public static int ri(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static xha ik(String str) {
        ri riVar = new ri();
        if (riVar.ri((xha) null, str) == ri.EnumC0214ri.SUCCESS) {
            return riVar.lr();
        }
        return null;
    }

    public static void lr(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static void ri(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String ri(String str, boolean z) {
        return ri(str, 0, str.length(), z);
    }

    private List<String> ri(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? ri(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> lr(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public static String ri(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                com.bytedance.sdk.component.lr.ri.lr.ri riVar = new com.bytedance.sdk.component.lr.ri.lr.ri();
                riVar.ri(str, i, i3);
                ri(riVar, str, i3, i2, z);
                return riVar.ik();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void ri(com.bytedance.sdk.component.lr.ri.lr.ri riVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iRi = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str.charAt(i + 1));
                int iRi2 = com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str.charAt(i3));
                if (iRi != -1 && iRi2 != -1) {
                    riVar.lr((iRi << 4) + iRi2);
                    i = i3;
                } else {
                    riVar.ri(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                riVar.lr(32);
            } else {
                riVar.ri(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static boolean ri(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.lr.ri.lr.jbs.ri(str.charAt(i3)) != -1;
    }

    public static String ri(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || ri(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.lr.ri.lr.ri riVar = new com.bytedance.sdk.component.lr.ri.lr.ri();
                riVar.ri(str, i, iCharCount);
                ri(riVar, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return riVar.ik();
            }
        }
        return str.substring(i, i2);
    }

    public static void ri(com.bytedance.sdk.component.lr.ri.lr.ri riVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.lr.ri.lr.ri riVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    riVar.ri(z ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z && (!z2 || ri(str, i, i2)))))) {
                    riVar.ri(iCodePointAt);
                } else {
                    if (riVar2 == null) {
                        riVar2 = new com.bytedance.sdk.component.lr.ri.lr.ri();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.lr.ri.lr.jbs.ri)) {
                        riVar2.ri(str, i, Character.charCount(iCodePointAt) + i, charset);
                    } else {
                        riVar2.ri(iCodePointAt);
                    }
                    while (!riVar2.ri()) {
                        byte bLr = riVar2.lr();
                        int i3 = bLr & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        riVar.lr(37);
                        char[] cArr = ka;
                        riVar.lr((int) cArr[(i3 >> 4) & 15]);
                        riVar.lr((int) cArr[bLr & 15]);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static String ri(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return ri(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
