package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class af implements Comparable<af> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f152 = {'9', 's', 127, 249, 151, 300, 295, 296, '4', 'f', 'l'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f153 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f154 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jd f155;

    public af(jd jdVar) {
        this.f155 = jdVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m290() throws UnsupportedEncodingException {
        JSONObject jSONObjectM297;
        String strM293;
        int i2 = f153 + 109;
        f154 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM297 = m297();
            strM293 = m293(false, new int[]{0, 2, 0, 0}, "\u0001\u0001");
        } else {
            jSONObjectM297 = m297();
            strM293 = m293(true, new int[]{0, 2, 0, 0}, "\u0001\u0001");
        }
        long jOptLong = jSONObjectM297.optLong(strM293.intern());
        int i3 = f153 + 125;
        f154 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private long m291() throws UnsupportedEncodingException {
        JSONObject jSONObjectM297;
        String strM293;
        int i2 = f153 + 41;
        f154 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM297 = m297();
            strM293 = m293(false, new int[]{2, 2, 144, 2}, "\u0000\u0001");
        } else {
            jSONObjectM297 = m297();
            strM293 = m293(true, new int[]{2, 2, 144, 2}, "\u0000\u0001");
        }
        long jOptInt = jSONObjectM297.optInt(strM293.intern());
        f153 = (f154 + 71) % 128;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m292() {
        int i2 = f153 + 31;
        f154 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f155.m2552();
            throw null;
        }
        String strM2552 = this.f155.m2552();
        f154 = (f153 + 13) % 128;
        return strM2552;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<String> m296() {
        f154 = (f153 + 75) % 128;
        List<String> listAsList = Arrays.asList(ik.f2438);
        f154 = (f153 + 97) % 128;
        return listAsList;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(af afVar) throws UnsupportedEncodingException {
        int i2 = f154 + 63;
        f153 = i2 % 128;
        af afVar2 = afVar;
        if (i2 % 2 == 0) {
            return m295(afVar2);
        }
        m295(afVar2);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = (f154 + 57) % 128;
        f153 = i2;
        if (this == obj) {
            f154 = (i2 + 7) % 128;
            return true;
        }
        if (obj == null || af.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = m292().equals(((af) obj).m292());
        int i3 = f154 + 51;
        f153 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return zEquals;
    }

    public final int hashCode() {
        if (m297() != null) {
            f153 = (f154 + 3) % 128;
            return m297().hashCode();
        }
        f154 = (f153 + 87) % 128;
        return 0;
    }

    public final String toString() {
        f153 = (f154 + 111) % 128;
        String string = m297().toString();
        int i2 = f154 + 35;
        f153 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized JSONObject m297() {
        JSONObject jSONObjectM2553;
        try {
            int i2 = f154 + 97;
            f153 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObjectM2553 = this.f155.m2553();
                int i3 = 31 / 0;
            } else {
                jSONObjectM2553 = this.f155.m2553();
            }
            f154 = (f153 + 61) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return jSONObjectM2553;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m298() {
        f153 = (f154 + 65) % 128;
        String strOptString = m297().optString(m293(false, new int[]{4, 4, 190, 0}, "\u0000\u0000\u0001\u0001").intern());
        int i2 = f153 + 55;
        f154 = i2 % 128;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m300(int i2) {
        try {
            f153 = (f154 + 25) % 128;
            if (this.f155.m2553() != null) {
                int i3 = f154 + 73;
                f153 = i3 % 128;
                if (i3 % 2 != 0) {
                    kc.m2773(this.f155.m2553(), i2, m296());
                    throw null;
                }
                kc.m2773(this.f155.m2553(), i2, m296());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m302() {
        f153 = (f154 + 7) % 128;
        String strOptString = m297().optString(m293(false, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001").intern(), null);
        int i2 = f154 + 49;
        f153 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m293(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f152, i2, cArr, 0, i3);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m295(af afVar) throws UnsupportedEncodingException {
        long jM290 = m290();
        long jM291 = afVar.m290();
        if (jM290 < jM291) {
            f153 = (f154 + 51) % 128;
            return -1;
        }
        if (jM290 == jM291) {
            f153 = (f154 + 71) % 128;
            return m294(afVar);
        }
        f154 = (f153 + 31) % 128;
        return 1;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final jd m299() {
        int i2 = (f154 + 27) % 128;
        f153 = i2;
        jd jdVar = this.f155;
        int i3 = i2 + 15;
        f154 = i3 % 128;
        if (i3 % 2 != 0) {
            return jdVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m301(String str) throws UnsupportedEncodingException {
        JSONObject jSONObjectM297;
        String strM293;
        int i2 = f153 + 39;
        f154 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                jSONObjectM297 = m297();
                strM293 = m293(true, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001");
            } else {
                jSONObjectM297 = m297();
                strM293 = m293(false, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001");
            }
            jSONObjectM297.put(strM293.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int m294(af afVar) throws UnsupportedEncodingException {
        f153 = (f154 + 47) % 128;
        long jM291 = m291();
        long jM292 = afVar.m291();
        if (jM291 < jM292) {
            f153 = (f154 + 45) % 128;
            return -1;
        }
        if (jM291 != jM292) {
            return 1;
        }
        f154 = (f153 + 3) % 128;
        return 0;
    }
}
