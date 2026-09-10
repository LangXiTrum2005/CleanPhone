package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class ooo {
    private final String[] o;

    public ooo(o oVar) {
        List<String> list = oVar.o;
        this.o = (String[]) list.toArray(new String[list.size()]);
    }

    private Set<String> n() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            treeSet.add(o(i2));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private Date o0(String str) {
        String strO = o(str);
        if (strO != null) {
            return com.thinkup.core.common.no.m.o.n.o0.o(strO);
        }
        return null;
    }

    private Map<String, List<String>> oo() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = o(i2).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m(i2));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ooo) && Arrays.equals(((ooo) obj).o, this.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.o);
    }

    public final String m(int i2) {
        return this.o[(i2 * 2) + 1];
    }

    public final String o(String str) {
        String[] strArr = this.o;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(o(i2));
            sb.append(": ");
            sb.append(m(i2));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public static final class o {
        final List<String> o = new ArrayList(20);

        private o o0(String str) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                return o(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(str));
        }

        public final o m(String str, String str2) {
            ooo.n(str);
            return n(str, str2);
        }

        public final o n(String str, String str2) {
            this.o.add(str);
            this.o.add(str2.trim());
            return this;
        }

        public final o o(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return n(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? n("", str.substring(1)) : n("", str);
        }

        private o m(String str, Date date) {
            o0(str, com.thinkup.core.common.no.m.o.n.o0.o(date));
            return this;
        }

        public final String n(String str) {
            for (int size = this.o.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.o.get(size))) {
                    return this.o.get(size + 1);
                }
            }
            return null;
        }

        private o m(String str, Instant instant) {
            if (instant != null) {
                o0(str, com.thinkup.core.common.no.m.o.n.o0.o(new Date(instant.toEpochMilli())));
                return this;
            }
            throw new NullPointerException(a.n("value for name ", str, " == null"));
        }

        public final o o0(String str, String str2) {
            ooo.n(str);
            ooo.o(str2, str);
            m(str);
            n(str, str2);
            return this;
        }

        public final o o(String str, String str2) {
            ooo.n(str);
            ooo.o(str2, str);
            return n(str, str2);
        }

        private o o(ooo oooVar) {
            int iO = oooVar.o();
            for (int i2 = 0; i2 < iO; i2++) {
                n(oooVar.o(i2), oooVar.m(i2));
            }
            return this;
        }

        private o o(String str, Date date) {
            o(str, com.thinkup.core.common.no.m.o.n.o0.o(date));
            return this;
        }

        private o o(String str, Instant instant) {
            if (instant != null) {
                return o(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException(a.n("value for name ", str, " == null"));
        }

        public final o m(String str) {
            int i2 = 0;
            while (i2 < this.o.size()) {
                if (str.equalsIgnoreCase(this.o.get(i2))) {
                    this.o.remove(i2);
                    this.o.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final ooo o() {
            return new ooo(this);
        }
    }

    public final o m() {
        o oVar = new o();
        Collections.addAll(oVar.o, this.o);
        return oVar;
    }

    private ooo(String[] strArr) {
        this.o = strArr;
    }

    private long o0() {
        String[] strArr = this.o;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            length += (long) this.o[i2].length();
        }
        return length;
    }

    public final List<String> m(String str) {
        int length = this.o.length / 2;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equalsIgnoreCase(o(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i2));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public static void n(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.thinkup.core.common.no.m.o.n.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public final int o() {
        return this.o.length / 2;
    }

    public final String o(int i2) {
        return this.o[i2 * 2];
    }

    private static String o(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    private Instant oo(String str) {
        String strO = o(str);
        Date dateO = strO != null ? com.thinkup.core.common.no.m.o.n.o0.o(strO) : null;
        if (dateO != null) {
            return DateRetargetClass.toInstant(dateO);
        }
        return null;
    }

    public static ooo o(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str = strArr2[i2];
            if (str != null) {
                strArr2[i2] = str.trim();
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        for (int i3 = 0; i3 < strArr2.length; i3 += 2) {
            String str2 = strArr2[i3];
            String str3 = strArr2[i3 + 1];
            n(str2);
            o(str3, str2);
        }
        return new ooo(strArr2);
    }

    private static ooo o(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    String strTrim = entry.getKey().trim();
                    String strTrim2 = entry.getValue().trim();
                    n(strTrim);
                    o(strTrim2, strTrim);
                    strArr[i2] = strTrim;
                    strArr[i2 + 1] = strTrim2;
                    i2 += 2;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            return new ooo(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    public static void o(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.thinkup.core.common.no.m.o.n.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(a.n("value for name ", str2, " == null"));
    }
}
