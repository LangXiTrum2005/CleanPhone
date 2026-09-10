package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class hb extends gi {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2190 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2191 = 63193;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2192 = 42727;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2193 = 7753;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2194 = 9000;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2195;

    public static class b extends gi {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2196 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2197 = {'p', 222, 214, 215, 215, 214, 211, 186, 194, 214, 211, 201, 196, 186, 159, 185, 214, 211, 217, 212, 202, 175, 184, 211, 202, 175, 184, 212, 204, 206, 215, 220, 211, 212, 184, 177, 179, 190, 222, 214, 211, 217, 185, 181, 214, 209, 132, 266, 257, 246, 255, 264, 261, 255};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2198 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static boolean m2180() {
            boolean zM773 = bc.m773(new hb());
            int i2 = f2198 + 113;
            f2196 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 71 / 0;
            }
            return zM773;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            if ((r0 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            r0 = 8 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            return m2181(true, new int[]{0, 46, 104, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000").intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (m2180() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            if (m2180() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.hb.b.f2196 + 65;
            com.ironsource.adqualitysdk.sdk.i.hb.b.f2198 = r0 % 128;
         */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String mo2138() {
            /*
                r3 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.hb.b.f2198
                int r0 = r0 + 125
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.hb.b.f2196 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L17
                boolean r0 = m2180()
                r2 = 57
                int r2 = r2 / r1
                if (r0 == 0) goto L2e
                goto L1d
            L17:
                boolean r0 = m2180()
                if (r0 == 0) goto L2e
            L1d:
                int r0 = com.ironsource.adqualitysdk.sdk.i.hb.b.f2196
                int r0 = r0 + 65
                int r2 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.hb.b.f2198 = r2
                int r0 = r0 % 2
                r2 = 0
                if (r0 != 0) goto L2d
                r0 = 8
                int r0 = r0 / r1
            L2d:
                return r2
            L2e:
                r0 = 46
                r2 = 104(0x68, float:1.46E-43)
                int[] r0 = new int[]{r1, r0, r2, r1}
                java.lang.String r1 = "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000"
                r2 = 1
                java.lang.String r0 = m2181(r2, r0, r1)
                java.lang.String r0 = r0.intern()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hb.b.mo2138():java.lang.String");
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2139() {
            f2196 = (f2198 + 23) % 128;
            String strIntern = m2181(false, new int[]{46, 8, 148, 5}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001").intern();
            f2196 = (f2198 + 59) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            f2196 = (f2198 + 85) % 128;
            if (!m2180()) {
                return AdUnitActivity.class;
            }
            int i2 = f2198 + 95;
            f2196 = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            cc.e eVar = new cc.e(mo2139());
            f2198 = (f2196 + 123) % 128;
            return eVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2181(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2197, i2, cArr, 0, i3);
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
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2195 = (f2190 + 5) % 128;
        String strIntern = m2179("팇Ƿꋸ\ue9d2絩ႾↁᏥ決\uf680䲇ﮡ\udc89䤋髥ḻ濆㻅鬊뼸빓颴맔\uf5e6孬\udc2b\ue562浸髥ḻ濆㻅鬊뼸", Color.blue(0) + 34).intern();
        int i2 = f2195 + 39;
        f2190 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2195 + 35;
        f2190 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return (i3 == 0 ? m2179("絩ႾↁᏥȗ\ud87e\uf2a6\uf23c", 107 % (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))) : m2179("絩ႾↁᏥȗ\ud87e\uf2a6\uf23c", 9 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)))).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = (f2190 + 121) % 128;
        f2195 = i2;
        int i3 = i2 + 77;
        f2190 = i3 % 128;
        if (i3 % 2 != 0) {
            return UnityServices.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        cc ccVar = new cc(mo2139());
        f2195 = (f2190 + 47) % 128;
        return ccVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2179(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2191)) ^ ((c3 >>> 5) + f2192)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2194) ^ ((c4 + i4) ^ ((c4 << 4) + f2193))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
