package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f36655a;

    public r(a aVar) {
        List<String> list = aVar.f36656a;
        this.f36655a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i10) {
        return this.f36655a[i10 * 2];
    }

    public String b(String str) {
        return a(this.f36655a, str);
    }

    public List<String> c(String str) {
        int iB = b();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iB; i10++) {
            if (str.equalsIgnoreCase(a(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i10));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f36655a, this.f36655a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f36655a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(a(i10));
            sb2.append(": ");
            sb2.append(b(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f36656a = new ArrayList(20);

        public a a(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public a b(String str, String str2) {
            this.f36656a.add(str);
            this.f36656a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str) {
            int i10 = 0;
            while (i10 < this.f36656a.size()) {
                if (str.equalsIgnoreCase(this.f36656a.get(i10))) {
                    this.f36656a.remove(i10);
                    this.f36656a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            return b(str, str2);
        }

        public r a() {
            return new r(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f36656a, this.f36655a);
        return aVar;
    }

    public int b() {
        return this.f36655a.length / 2;
    }

    public String b(int i10) {
        return this.f36655a[(i10 * 2) + 1];
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(defpackage.e.o("value for name ", str2, " == null"));
    }
}
