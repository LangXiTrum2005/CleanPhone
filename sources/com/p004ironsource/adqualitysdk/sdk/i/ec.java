package com.p004ironsource.adqualitysdk.sdk.i;

import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ec extends ee {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1860 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1861 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1862 = {'A', 128, 128, 'Y', 'Y', '|', '|', 132, '~', AbstractJsonLexerKt.BEGIN_OBJ, 'z', 'S', 'U', '~', 129, '~', 'W', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.BEGIN_OBJ, 'v', 128, AbstractJsonLexerKt.END_OBJ, 'R', 'B', 'k', 'o', 16, '&', 'i', 16, '-', '-', '!', 'z'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, ee> f1863;

    public ec(Map<String, ee> map, dm dmVar) {
        super(dmVar);
        this.f1863 = new HashMap();
        for (String str : map.keySet()) {
            this.f1863.put(dw.m2051(str), map.get(str));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2079(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f1862, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f1861 = (f1860 + 107) % 128;
            return true;
        }
        if (obj != null && ec.class == obj.getClass()) {
            Map<String, ee> map = this.f1863;
            Map<String, ee> map2 = ((ec) obj).f1863;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                int i2 = (f1860 + 85) % 128;
                f1861 = i2;
                f1860 = (i2 + 7) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (f1861 + 101) % 128;
        f1860 = i2;
        Map<String, ee> map = this.f1863;
        if (map == null) {
            return 0;
        }
        f1861 = (i2 + 25) % 128;
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2079(false, new int[]{25, 1, 100, 0}, "\u0001").intern());
        boolean z2 = true;
        for (String str : this.f1863.keySet()) {
            if (!z2) {
                f1860 = (f1861 + 57) % 128;
                sb.append(m2079(false, new int[]{26, 2, 0, 1}, "\u0000\u0000").intern());
                f1861 = (f1860 + 69) % 128;
            }
            sb.append(m2079(true, new int[]{28, 1, 176, 0}, "\u0000").intern());
            sb.append(str);
            sb.append(m2079(true, new int[]{29, 4, 0, 4}, "\u0000\u0000\u0000\u0000").intern());
            sb.append(this.f1863.get(str));
            z2 = false;
        }
        return a.C(sb, m2079(true, new int[]{33, 1, 119, 0}, "\u0000"));
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1863.keySet()) {
            f1861 = (f1860 + 11) % 128;
            try {
                jSONObject.put(str, this.f1863.get(str).m2086(drVar, cpVar).m2043());
            } catch (JSONException e2) {
                String strM1616 = cpVar.m1616();
                StringBuilder sb = new StringBuilder();
                sb.append(m2079(false, new int[]{0, 25, 16, 23}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern());
                sb.append(m2085());
                cq.m1676(strM1616, sb.toString(), e2);
            }
        }
        du duVar = new du(jSONObject);
        int i2 = f1860 + 49;
        f1861 = i2 % 128;
        if (i2 % 2 != 0) {
            return duVar;
        }
        throw null;
    }
}
