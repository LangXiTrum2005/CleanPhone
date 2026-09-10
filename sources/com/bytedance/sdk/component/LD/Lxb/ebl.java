package com.bytedance.sdk.component.LD.Lxb;

import androidx.webkit.ProxyConfig;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ebl {
    private static final char[] ZU = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String JXs;
    final String LD;
    final String Lxb;
    private final List<String> OY;
    private final String QAg;
    private final List<String> ebl;
    private final String lc;
    final int lk;
    private final String nBu;

    public static final class Lxb {
        String Lxb;
        String OY;
        String ZU;
        List<String> ebl;
        final List<String> lc;
        String LD = "";
        String lk = "";
        int JXs = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.LD.Lxb.ebl$Lxb$Lxb, reason: collision with other inner class name */
        public enum EnumC0048Lxb {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Lxb() {
            ArrayList arrayList = new ArrayList();
            this.lc = arrayList;
            arrayList.add("");
        }

        private boolean JXs(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean lc(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public Lxb LD(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strJXs = JXs(str, 0, str.length());
            if (strJXs == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.ZU = strJXs;
            return this;
        }

        public Lxb Lxb(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.Lxb = ProxyConfig.MATCH_HTTP;
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.Lxb = "https";
            }
            return this;
        }

        public Lxb ZU(String str) {
            this.ebl = str != null ? ebl.LD(ebl.Lxb(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public Lxb lk(String str) {
            if (str != null) {
                return Lxb(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.Lxb);
            sb.append("://");
            if (!this.LD.isEmpty() || !this.lk.isEmpty()) {
                sb.append(this.LD);
                if (!this.lk.isEmpty()) {
                    sb.append(':');
                    sb.append(this.lk);
                }
                sb.append('@');
            }
            if (this.ZU.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.ZU);
                sb.append(']');
            } else {
                sb.append(this.ZU);
            }
            int iLxb = Lxb();
            if (iLxb != ebl.Lxb(this.Lxb)) {
                sb.append(':');
                sb.append(iLxb);
            }
            ebl.Lxb(sb, this.lc);
            if (this.ebl != null) {
                sb.append('?');
                ebl.LD(sb, this.ebl);
            }
            if (this.OY != null) {
                sb.append('#');
                sb.append(this.OY);
            }
            return sb.toString();
        }

        private static String JXs(String str, int i, int i2) {
            return com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(ebl.Lxb(str, i, i2, false));
        }

        private static int ZU(String str, int i, int i2) {
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

        private void lk() {
            List<String> list = this.lc;
            if (list.remove(list.size() - 1).isEmpty() && !this.lc.isEmpty()) {
                List<String> list2 = this.lc;
                list2.set(list2.size() - 1, "");
            } else {
                this.lc.add("");
            }
        }

        private static int lc(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(ebl.Lxb(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        public ebl LD() {
            if (this.Lxb != null) {
                if (this.ZU != null) {
                    return new ebl(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int lk(String str, int i, int i2) {
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

        public int Lxb() {
            int i = this.JXs;
            return i != -1 ? i : ebl.Lxb(this.Lxb);
        }

        private Lxb Lxb(String str, boolean z) {
            int i = 0;
            do {
                int iLxb = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, i, str.length(), "/\\");
                Lxb(str, i, iLxb, iLxb < str.length(), z);
                i = iLxb + 1;
            } while (i <= str.length());
            return this;
        }

        private static int LD(String str, int i, int i2) {
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

        public Lxb Lxb(String str, String str2) {
            if (str != null) {
                if (this.ebl == null) {
                    this.ebl = new ArrayList();
                }
                this.ebl.add(ebl.Lxb(str, " \"'<>#&=", true, false, true, true));
                this.ebl.add(str2 != null ? ebl.Lxb(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0048Lxb Lxb(ebl eblVar, String str) {
            int iLxb;
            int i;
            int iLxb2 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, 0, str.length());
            int iLD = com.bytedance.sdk.component.LD.Lxb.LD.QAg.LD(str, iLxb2, str.length());
            if (LD(str, iLxb2, iLD) != -1) {
                if (str.regionMatches(true, iLxb2, "https:", 0, 6)) {
                    this.Lxb = "https";
                    iLxb2 += 6;
                } else if (str.regionMatches(true, iLxb2, "http:", 0, 5)) {
                    this.Lxb = ProxyConfig.MATCH_HTTP;
                    iLxb2 += 5;
                } else {
                    return EnumC0048Lxb.UNSUPPORTED_SCHEME;
                }
            } else if (eblVar != null) {
                this.Lxb = eblVar.Lxb;
            } else {
                return EnumC0048Lxb.MISSING_SCHEME;
            }
            int iLk = lk(str, iLxb2, iLD);
            char c = '?';
            char c2 = '#';
            if (iLk < 2 && eblVar != null && eblVar.Lxb.equals(this.Lxb)) {
                this.LD = eblVar.LD();
                this.lk = eblVar.lk();
                this.ZU = eblVar.LD;
                this.JXs = eblVar.lk;
                this.lc.clear();
                this.lc.addAll(eblVar.ZU());
                if (iLxb2 == iLD || str.charAt(iLxb2) == '#') {
                    ZU(eblVar.JXs());
                }
            } else {
                int i2 = iLxb2 + iLk;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iLxb = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, i2, iLD, "@/\\?#");
                    byte bCharAt = iLxb != iLD ? str.charAt(iLxb) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c2 || bCharAt == 47 || bCharAt == 92 || bCharAt == c) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iLxb3 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, i2, iLxb, ':');
                            i = iLxb;
                            String strLxb = ebl.Lxb(str, i2, iLxb3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strLxb = AbstractC5044xl.p(new StringBuilder(), this.LD, "%40", strLxb);
                            }
                            this.LD = strLxb;
                            if (iLxb3 != i) {
                                this.lk = ebl.Lxb(str, iLxb3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = iLxb;
                            this.lk += "%40" + ebl.Lxb(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int iZU = ZU(str, i2, iLxb);
                int i3 = iZU + 1;
                if (i3 < iLxb) {
                    this.ZU = JXs(str, i2, iZU);
                    int iLc = lc(str, i3, iLxb);
                    this.JXs = iLc;
                    if (iLc == -1) {
                        return EnumC0048Lxb.INVALID_PORT;
                    }
                } else {
                    this.ZU = JXs(str, i2, iZU);
                    this.JXs = ebl.Lxb(this.Lxb);
                }
                if (this.ZU == null) {
                    return EnumC0048Lxb.INVALID_HOST;
                }
                iLxb2 = iLxb;
            }
            int iLxb4 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, iLxb2, iLD, "?#");
            Lxb(str, iLxb2, iLxb4);
            if (iLxb4 < iLD && str.charAt(iLxb4) == '?') {
                int iLxb5 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, iLxb4, iLD, '#');
                this.ebl = ebl.LD(ebl.Lxb(str, iLxb4 + 1, iLxb5, " \"'<>#", true, false, true, true, null));
                iLxb4 = iLxb5;
            }
            if (iLxb4 < iLD && str.charAt(iLxb4) == '#') {
                this.OY = ebl.Lxb(str, 1 + iLxb4, iLD, "", true, false, false, false, null);
            }
            return EnumC0048Lxb.SUCCESS;
        }

        private void Lxb(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.lc;
                list.set(list.size() - 1, "");
            } else {
                this.lc.clear();
                this.lc.add("");
                i++;
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, i3, i2, "/\\");
                boolean z = i < i2;
                Lxb(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void Lxb(String str, int i, int i2, boolean z, boolean z2) {
            String strLxb = ebl.Lxb(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (JXs(strLxb)) {
                return;
            }
            if (lc(strLxb)) {
                lk();
                return;
            }
            if (((String) DM.f(this.lc, 1)).isEmpty()) {
                List<String> list = this.lc;
                list.set(list.size() - 1, strLxb);
            } else {
                this.lc.add(strLxb);
            }
            if (z) {
                this.lc.add("");
            }
        }
    }

    public ebl(Lxb lxb) {
        this.Lxb = lxb.Lxb;
        this.JXs = Lxb(lxb.LD, false);
        this.lc = Lxb(lxb.lk, false);
        this.LD = lxb.ZU;
        this.lk = lxb.Lxb();
        this.ebl = Lxb(lxb.lc, false);
        List<String> list = lxb.ebl;
        this.OY = list != null ? Lxb(list, true) : null;
        String str = lxb.OY;
        this.QAg = str != null ? Lxb(str, false) : null;
        this.nBu = lxb.toString();
    }

    public String JXs() {
        if (this.OY == null) {
            return null;
        }
        int iIndexOf = this.nBu.indexOf(63) + 1;
        String str = this.nBu;
        return this.nBu.substring(iIndexOf, com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, iIndexOf, str.length(), '#'));
    }

    public String LD() {
        if (this.JXs.isEmpty()) {
            return "";
        }
        int length = this.Lxb.length() + 3;
        String str = this.nBu;
        return this.nBu.substring(length, com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, length, str.length(), ":@"));
    }

    public URL Lxb() {
        try {
            return new URL(this.nBu);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> ZU() {
        int iIndexOf = this.nBu.indexOf(47, this.Lxb.length() + 3);
        String str = this.nBu;
        int iLxb = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iLxb) {
            int i = iIndexOf + 1;
            int iLxb2 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(this.nBu, i, iLxb, '/');
            arrayList.add(this.nBu.substring(i, iLxb2));
            iIndexOf = iLxb2;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ebl) && ((ebl) obj).nBu.equals(this.nBu);
    }

    public int hashCode() {
        return this.nBu.hashCode();
    }

    public String lk() {
        if (this.lc.isEmpty()) {
            return "";
        }
        return this.nBu.substring(this.nBu.indexOf(58, this.Lxb.length() + 3) + 1, this.nBu.indexOf(64));
    }

    public String toString() {
        return this.nBu;
    }

    public static int Lxb(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void LD(StringBuilder sb, List<String> list) {
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

    public static void Lxb(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static ebl lk(String str) {
        Lxb lxb = new Lxb();
        if (lxb.Lxb((ebl) null, str) == Lxb.EnumC0048Lxb.SUCCESS) {
            return lxb.LD();
        }
        return null;
    }

    public static String Lxb(String str, boolean z) {
        return Lxb(str, 0, str.length(), z);
    }

    private List<String> Lxb(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? Lxb(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> LD(String str) {
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

    public static String Lxb(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                com.bytedance.sdk.component.LD.Lxb.LD.Lxb lxb = new com.bytedance.sdk.component.LD.Lxb.LD.Lxb();
                lxb.Lxb(str, i, i3);
                Lxb(lxb, str, i3, i2, z);
                return lxb.lk();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void Lxb(com.bytedance.sdk.component.LD.Lxb.LD.Lxb lxb, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iLxb = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str.charAt(i + 1));
                int iLxb2 = com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str.charAt(i3));
                if (iLxb != -1 && iLxb2 != -1) {
                    lxb.LD((iLxb << 4) + iLxb2);
                    i = i3;
                } else {
                    lxb.Lxb(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                lxb.LD(32);
            } else {
                lxb.Lxb(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static boolean Lxb(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb(str.charAt(i3)) != -1;
    }

    public static String Lxb(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || Lxb(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            com.bytedance.sdk.component.LD.Lxb.LD.Lxb lxb = new com.bytedance.sdk.component.LD.Lxb.LD.Lxb();
            lxb.Lxb(str, i, iCharCount);
            Lxb(lxb, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return lxb.lk();
        }
        return str.substring(i, i2);
    }

    public static void Lxb(com.bytedance.sdk.component.LD.Lxb.LD.Lxb lxb, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.LD.Lxb.LD.Lxb lxb2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    lxb.Lxb(z ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z && (!z2 || Lxb(str, i, i2)))))) {
                    lxb.Lxb(iCodePointAt);
                } else {
                    if (lxb2 == null) {
                        lxb2 = new com.bytedance.sdk.component.LD.Lxb.LD.Lxb();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb)) {
                        lxb2.Lxb(str, i, Character.charCount(iCodePointAt) + i, charset);
                    } else {
                        lxb2.Lxb(iCodePointAt);
                    }
                    while (!lxb2.Lxb()) {
                        byte bLD = lxb2.LD();
                        lxb.LD(37);
                        char[] cArr = ZU;
                        lxb.LD((int) cArr[((bLD & 255) >> 4) & 15]);
                        lxb.LD((int) cArr[bLD & cw.m]);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static String Lxb(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return Lxb(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
