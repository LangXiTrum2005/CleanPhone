package com.bytedance.sdk.component.ud.qdl;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class wd {
    private static final char[] mml = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final List<String> jpc;
    final int lnr;
    private final String mo;
    private final String mzz;
    final String qdl;
    private final String to;
    private final String tvp;
    final String ud;
    private final List<String> wd;

    public static final class qdl {
        String jpc;
        String mml;
        final List<String> mo;
        String qdl;
        List<String> wd;
        String ud = "";
        String lnr = "";
        int mzz = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.ud.qdl.wd$qdl$qdl, reason: collision with other inner class name */
        public enum EnumC0093qdl {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public qdl() {
            ArrayList arrayList = new ArrayList();
            this.mo = arrayList;
            arrayList.add("");
        }

        private boolean mo(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean mzz(String str) {
            return str.equals(com.thinkup.core.common.n.mo.ono) || str.equalsIgnoreCase("%2e");
        }

        public qdl lnr(String str) {
            if (str != null) {
                return qdl(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public qdl mml(String str) {
            this.wd = str != null ? wd.ud(wd.qdl(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public qdl qdl(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.qdl = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.qdl = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.qdl);
            sb.append("://");
            if (!this.ud.isEmpty() || !this.lnr.isEmpty()) {
                sb.append(this.ud);
                if (!this.lnr.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.lnr);
                }
                sb.append('@');
            }
            if (this.mml.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.mml);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.mml);
            }
            int iQdl = qdl();
            if (iQdl != wd.qdl(this.qdl)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(iQdl);
            }
            wd.qdl(sb, this.mo);
            if (this.wd != null) {
                sb.append('?');
                wd.ud(sb, this.wd);
            }
            if (this.jpc != null) {
                sb.append('#');
                sb.append(this.jpc);
            }
            return sb.toString();
        }

        public qdl ud(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strMzz = mzz(str, 0, str.length());
            if (strMzz == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.mml = strMzz;
            return this;
        }

        private static String mzz(String str, int i2, int i3) {
            return com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(wd.qdl(str, i2, i3, false));
        }

        private void lnr() {
            List<String> list = this.mo;
            if (list.remove(list.size() - 1).isEmpty() && !this.mo.isEmpty()) {
                List<String> list2 = this.mo;
                list2.set(list2.size() - 1, "");
            } else {
                this.mo.add("");
            }
        }

        private static int mml(String str, int i2, int i3) {
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

        private static int mo(String str, int i2, int i3) {
            try {
                int i4 = Integer.parseInt(wd.qdl(str, i2, i3, "", false, false, false, true, null));
                if (i4 <= 0 || i4 > 65535) {
                    return -1;
                }
                return i4;
            } catch (NumberFormatException unused) {
            }
        }

        public wd ud() {
            if (this.qdl != null) {
                if (this.mml != null) {
                    return new wd(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int lnr(String str, int i2, int i3) {
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

        public int qdl() {
            int i2 = this.mzz;
            return i2 != -1 ? i2 : wd.qdl(this.qdl);
        }

        private qdl qdl(String str, boolean z2) {
            int i2 = 0;
            while (true) {
                int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, i2, str.length(), "/\\");
                qdl(str, i2, iQdl, iQdl < str.length(), z2);
                i2 = iQdl + 1;
                if (i2 > str.length()) {
                    return this;
                }
                str = str;
                z2 = z2;
            }
        }

        private static int ud(String str, int i2, int i3) {
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

        public qdl qdl(String str, String str2) {
            if (str != null) {
                if (this.wd == null) {
                    this.wd = new ArrayList();
                }
                this.wd.add(wd.qdl(str, " \"'<>#&=", true, false, true, true));
                this.wd.add(str2 != null ? wd.qdl(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0093qdl qdl(wd wdVar, String str) {
            int iQdl;
            String str2;
            int i2;
            String str3;
            String str4 = str;
            int iQdl2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, 0, str4.length());
            int iUd = com.bytedance.sdk.component.ud.qdl.ud.tvp.ud(str4, iQdl2, str4.length());
            if (ud(str4, iQdl2, iUd) != -1) {
                if (str4.regionMatches(true, iQdl2, "https:", 0, 6)) {
                    this.qdl = HttpRequest.DEFAULT_SCHEME;
                    iQdl2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iQdl2, "http:", 0, 5)) {
                        this.qdl = "http";
                        iQdl2 += 5;
                    } else {
                        return EnumC0093qdl.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (wdVar != null) {
                this.qdl = wdVar.qdl;
            } else {
                return EnumC0093qdl.MISSING_SCHEME;
            }
            int iLnr = lnr(str4, iQdl2, iUd);
            char c2 = '#';
            if (iLnr < 2 && wdVar != null && wdVar.qdl.equals(this.qdl)) {
                this.ud = wdVar.ud();
                this.lnr = wdVar.lnr();
                this.mml = wdVar.ud;
                this.mzz = wdVar.lnr;
                this.mo.clear();
                this.mo.addAll(wdVar.mml());
                if (iQdl2 == iUd || str4.charAt(iQdl2) == '#') {
                    mml(wdVar.mzz());
                }
                str2 = str4;
            } else {
                int i3 = iQdl2 + iLnr;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, i3, iUd, "@/\\?#");
                    byte bCharAt = iQdl != iUd ? str4.charAt(iQdl) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z2) {
                            int iQdl3 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, i3, iQdl, AbstractJsonLexerKt.COLON);
                            String strQdl = wd.qdl(str, i3, iQdl3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z3) {
                                strQdl = a.s(new StringBuilder(), this.ud, "%40", strQdl);
                            }
                            this.ud = strQdl;
                            if (iQdl3 != iQdl) {
                                i2 = iQdl;
                                this.lnr = wd.qdl(str, iQdl3 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z2 = true;
                            } else {
                                i2 = iQdl;
                            }
                            str3 = str;
                            z3 = true;
                        } else {
                            i2 = iQdl;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.lnr);
                            sb.append("%40");
                            str3 = str;
                            sb.append(wd.qdl(str3, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.lnr = sb.toString();
                        }
                        i3 = i2 + 1;
                        str4 = str3;
                        c2 = '#';
                    }
                }
                str2 = str4;
                int i4 = i3;
                int iMml = mml(str2, i4, iQdl);
                int i5 = iMml + 1;
                if (i5 < iQdl) {
                    this.mml = mzz(str2, i4, iMml);
                    int iMo = mo(str2, i5, iQdl);
                    this.mzz = iMo;
                    if (iMo == -1) {
                        return EnumC0093qdl.INVALID_PORT;
                    }
                } else {
                    this.mml = mzz(str2, i4, iMml);
                    this.mzz = wd.qdl(this.qdl);
                }
                if (this.mml == null) {
                    return EnumC0093qdl.INVALID_HOST;
                }
                iQdl2 = iQdl;
            }
            int iQdl4 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str2, iQdl2, iUd, "?#");
            qdl(str2, iQdl2, iQdl4);
            if (iQdl4 < iUd && str2.charAt(iQdl4) == '?') {
                int iQdl5 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str2, iQdl4, iUd, '#');
                this.wd = wd.ud(wd.qdl(str2, iQdl4 + 1, iQdl5, " \"'<>#", true, false, true, true, null));
                iQdl4 = iQdl5;
            }
            if (iQdl4 < iUd && str2.charAt(iQdl4) == '#') {
                this.jpc = wd.qdl(str2, iQdl4 + 1, iUd, "", true, false, false, false, null);
            }
            return EnumC0093qdl.SUCCESS;
        }

        private void qdl(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.mo;
                list.set(list.size() - 1, "");
            } else {
                this.mo.clear();
                this.mo.add("");
                i2++;
            }
            int i4 = i2;
            while (i4 < i3) {
                int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, i4, i3, "/\\");
                boolean z2 = iQdl < i3;
                String str2 = str;
                qdl(str2, i4, iQdl, z2, true);
                if (z2) {
                    iQdl++;
                }
                i4 = iQdl;
                str = str2;
            }
        }

        private void qdl(String str, int i2, int i3, boolean z2, boolean z3) {
            String strQdl = wd.qdl(str, i2, i3, " \"<>^`{}|/\\?#", z3, false, false, true, null);
            if (mzz(strQdl)) {
                return;
            }
            if (mo(strQdl)) {
                lnr();
                return;
            }
            if (((String) androidx.media3.extractor.text.ttml.a.h(1, this.mo)).isEmpty()) {
                List<String> list = this.mo;
                list.set(list.size() - 1, strQdl);
            } else {
                this.mo.add(strQdl);
            }
            if (z2) {
                this.mo.add("");
            }
        }
    }

    public wd(qdl qdlVar) {
        this.qdl = qdlVar.qdl;
        this.mzz = qdl(qdlVar.ud, false);
        this.mo = qdl(qdlVar.lnr, false);
        this.ud = qdlVar.mml;
        this.lnr = qdlVar.qdl();
        this.wd = qdl(qdlVar.mo, false);
        List<String> list = qdlVar.wd;
        this.jpc = list != null ? qdl(list, true) : null;
        String str = qdlVar.jpc;
        this.tvp = str != null ? qdl(str, false) : null;
        this.to = qdlVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof wd) && ((wd) obj).to.equals(this.to);
    }

    public int hashCode() {
        return this.to.hashCode();
    }

    public String lnr() {
        if (this.mo.isEmpty()) {
            return "";
        }
        return this.to.substring(this.to.indexOf(58, this.qdl.length() + 3) + 1, this.to.indexOf(64));
    }

    public List<String> mml() {
        int iIndexOf = this.to.indexOf(47, this.qdl.length() + 3);
        String str = this.to;
        int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iQdl) {
            int i2 = iIndexOf + 1;
            int iQdl2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(this.to, i2, iQdl, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.to.substring(i2, iQdl2));
            iIndexOf = iQdl2;
        }
        return arrayList;
    }

    public String mzz() {
        if (this.jpc == null) {
            return null;
        }
        int iIndexOf = this.to.indexOf(63) + 1;
        String str = this.to;
        return this.to.substring(iIndexOf, com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, iIndexOf, str.length(), '#'));
    }

    public URL qdl() {
        try {
            return new URL(this.to);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() {
        return this.to;
    }

    public String ud() {
        if (this.mzz.isEmpty()) {
            return "";
        }
        int length = this.qdl.length() + 3;
        String str = this.to;
        return this.to.substring(length, com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, length, str.length(), ":@"));
    }

    public static int qdl(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static wd lnr(String str) {
        qdl qdlVar = new qdl();
        if (qdlVar.qdl((wd) null, str) == qdl.EnumC0093qdl.SUCCESS) {
            return qdlVar.ud();
        }
        return null;
    }

    public static void qdl(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i2));
        }
    }

    public static void ud(StringBuilder sb, List<String> list) {
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

    public static String qdl(String str, boolean z2) {
        return qdl(str, 0, str.length(), z2);
    }

    private List<String> qdl(List<String> list, boolean z2) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? qdl(str, z2) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> ud(String str) {
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

    public static String qdl(String str, int i2, int i3, boolean z2) {
        for (int i4 = i2; i4 < i3; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                qdlVar.qdl(str, i2, i4);
                qdl(qdlVar, str, i4, i3, z2);
                return qdlVar.lnr();
            }
        }
        return str.substring(i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void qdl(com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar, String str, int i2, int i3, boolean z2) {
        int i4;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i2 + 1));
                int iQdl2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i4));
                if (iQdl != -1 && iQdl2 != -1) {
                    qdlVar.ud((iQdl << 4) + iQdl2);
                    i2 = i4;
                } else {
                    qdlVar.qdl(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z2) {
                qdlVar.ud(32);
            } else {
                qdlVar.qdl(iCodePointAt);
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    public static boolean qdl(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i2 + 1)) != -1 && com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i4)) != -1;
    }

    public static String qdl(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        int iCharCount = i2;
        while (iCharCount < i3) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z5) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z2 && (!z3 || qdl(str, iCharCount, i3)))) && (iCodePointAt != 43 || !z4)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                qdlVar.qdl(str, i2, iCharCount);
                qdl(qdlVar, str, iCharCount, i3, str2, z2, z3, z4, z5, charset);
                return qdlVar.lnr();
            }
        }
        return str.substring(i2, i3);
    }

    public static void qdl(com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z2 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z4) {
                    qdlVar.qdl(z2 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z5) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z2 && (!z3 || qdl(str, i2, i3)))))) {
                    qdlVar.qdl(iCodePointAt);
                } else {
                    if (qdlVar2 == null) {
                        qdlVar2 = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl)) {
                        qdlVar2.qdl(str, i2, Character.charCount(iCodePointAt) + i2, charset);
                    } else {
                        qdlVar2.qdl(iCodePointAt);
                    }
                    while (!qdlVar2.qdl()) {
                        byte bUd = qdlVar2.ud();
                        int i4 = bUd & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        qdlVar.ud(37);
                        char[] cArr = mml;
                        qdlVar.ud((int) cArr[(i4 >> 4) & 15]);
                        qdlVar.ud((int) cArr[bUd & 15]);
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    public static String qdl(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        return qdl(str, 0, str.length(), str2, z2, z3, z4, z5, null);
    }
}
