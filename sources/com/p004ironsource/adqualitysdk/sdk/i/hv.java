package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hv extends hm {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private List<Class> f2295 = new ArrayList();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<Class> f2296;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Class f2297;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f2298;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private int f2299;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f2300;

    public hv() {
        mo2201();
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final int m2273() {
        return this.f2299;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m2274() {
        return this.f2296;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final int m2275() {
        return this.f2300;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final List<Class> m2276() {
        return this.f2295;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2277() {
        return this.f2298;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Class m2278() {
        return this.f2297;
    }

    public static class a extends hm.c implements ck {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2301 = 1609200948675792367L;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2302 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f2303 = {-129357110, 347140254, -552350281, 1622005726, 2062429550, 1505933401, 262872982, -1663125662, 1549923047, -1381309151, -607586045, -1276496287, 1959461654, 134699940, -1118718795, 629247644, -516180928, -1060319385};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2304 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private hv f2305 = new hv();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m2279(int i2) {
            hv hvVar;
            int i3;
            int i4 = f2302 + 113;
            f2304 = i4 % 128;
            if (i4 % 2 == 0) {
                hvVar = this.f2305;
                i3 = i2 ^ hvVar.f2252;
            } else {
                hvVar = this.f2305;
                i3 = i2 | hvVar.f2252;
            }
            hvVar.f2252 = i3;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m2283(Class cls) {
            f2304 = (f2302 + 61) % 128;
            this.f2305.f2297 = cls;
            f2302 = (f2304 + 17) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m2286(boolean z2) {
            int i2 = f2302 + 5;
            f2304 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2305.f2298 = z2;
                throw null;
            }
            this.f2305.f2298 = z2;
            f2304 = (f2302 + 21) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2287(int i2) {
            int i3 = f2302 + 107;
            f2304 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2305.f2300 = i2;
                int i4 = 54 / 0;
            } else {
                this.f2305.f2300 = i2;
            }
            f2302 = (f2304 + 123) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2290(int i2) {
            f2302 = (f2304 + 5) % 128;
            this.f2305.f2299 = i2;
            int i3 = f2302 + 83;
            f2304 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 17 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m2281(boolean z2, int i2) {
            int i3 = f2304 + 119;
            f2302 = i3 % 128;
            if (i3 % 2 == 0) {
                hv hvVar = this.f2305;
                hvVar.f2251 = z2;
                hvVar.f2254 = i2;
                return this;
            }
            hv hvVar2 = this.f2305;
            hvVar2.f2251 = z2;
            hvVar2.f2254 = i2;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m2282(int i2) {
            int i3 = f2302;
            int i4 = i3 + 3;
            f2304 = i4 % 128;
            int i5 = i4 % 2;
            hv hvVar = this.f2305;
            hvVar.f2253 = i2 | hvVar.f2253;
            f2304 = (i3 + 47) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2291(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f1955) {
                try {
                    char[] cArrM2116 = f.m2116(f2301, cArr, i2);
                    f.f1954 = 4;
                    while (true) {
                        int i3 = f.f1954;
                        if (i3 < cArrM2116.length) {
                            int i4 = i3 - 4;
                            f.f1953 = i4;
                            cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2301));
                            f.f1954 = i3 + 1;
                        } else {
                            str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private a m2285() {
            f2302 = (f2304 + 107) % 128;
            this.f2305.mo2201();
            f2302 = (f2304 + 67) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m2288(Class cls) {
            int i2 = f2302 + 93;
            f2304 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2305.f2295.add(cls);
                return this;
            }
            this.f2305.f2295.add(cls);
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hv m2284() {
            int i2 = (f2304 + 3) % 128;
            f2302 = i2;
            hv hvVar = this.f2305;
            int i3 = i2 + 81;
            f2304 = i3 % 128;
            if (i3 % 2 != 0) {
                return hvVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m2280(List<Class> list) {
            int i2 = f2302 + 5;
            f2304 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2305.f2296 = list;
                int i3 = 20 / 0;
                return this;
            }
            this.f2305.f2296 = list;
            return this;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
        /* JADX INFO: renamed from: ﾇ */
        public final Object mo792(String str, List<Object> list, ch chVar) {
            while (true) {
                byte b2 = 8;
                switch (str.hashCode()) {
                    case -2020212392:
                        if (!str.equals(m2289(new int[]{-1451578824, 966871152, -1908013335, 2002338196, -1526967386, 1030072268, 372716852, 1488389742, -1237865570, -1203789624, 758150187, 560748912}, 21 - KeyEvent.keyCodeFromString("")).intern())) {
                            b2 = -1;
                        }
                        break;
                    case -600792781:
                        b2 = !str.equals(m2289(new int[]{1822176764, 1760473398, -112994487, -1056501122, -954130463, -2080666272}, (Process.myTid() >> 22) + 11).intern()) ? (byte) -1 : (byte) 3;
                        break;
                    case 94094958:
                        if (!str.equals(m2291("峮\u187fᇣꬥ岌헥詔슄欶", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                            b2 = -1;
                        } else {
                            f2304 = (f2302 + 65) % 128;
                            b2 = 10;
                        }
                        break;
                    case 108404047:
                        b2 = !str.equals(m2291("㻭魌浴仓㺟囆\uf6d9❻थ", TextUtils.getCapsMode("", 0, 0) + 1).intern()) ? (byte) -1 : (byte) 9;
                        break;
                    case 132643084:
                        if (!str.equals(m2289(new int[]{383353315, -547878639, 971499826, -92307545, 333068520, -1163861904, -1393226612, 42552615, 558646799, -423177542, -1559586101, -1254452056}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21).intern())) {
                            b2 = -1;
                        } else {
                            f2304 = (f2302 + 1) % 128;
                            b2 = 2;
                        }
                        break;
                    case 200590504:
                        b2 = !str.equals(m2289(new int[]{120753781, 445970534, 1037869801, 319758581, 697141864, -1919094288, -199293547, 34417559, -644067998, 465709798, -1633682041, 347127522}, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) ? (byte) -1 : (byte) 4;
                        break;
                    case 387034026:
                        if (!str.equals(m2289(new int[]{120753781, 445970534, 33419841, -236657098, -1426984929, 164572628, -702783677, 316973691, -838442385, -756127829}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18).intern())) {
                            b2 = -1;
                        } else {
                            f2304 = (f2302 + 59) % 128;
                            b2 = 7;
                        }
                        break;
                    case 391966482:
                        b2 = !str.equals(m2291("\uddeb➯䷇߄\udd8a\uea24홽湄\uea38≠鸴ꘫ닺᪭䛣\udef2窋勣ຜᚫ\u0378謜㝼伝쬢", -ImageFormat.getBitsPerPixel(0)).intern()) ? (byte) -1 : (byte) 5;
                        break;
                    case 393987200:
                        b2 = !str.equals(m2291("딗즨爬㳡땤Т\ue986啾苎챷ꇃ鴚\uda01\uf49b礃\ue5d4ቆ볟ㅑⶦ殎攙ࢆ", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 0;
                        break;
                    case 1423210564:
                        if (!str.equals(m2289(new int[]{1991505032, -1832152035, 529951674, 1430736855, 1125841747, 2080763684, 361090099, -1358335423, -1946605511, -1291650922, 758150187, 560748912}, 21 - Color.blue(0)).intern())) {
                            b2 = -1;
                        } else {
                            f2304 = (f2302 + 45) % 128;
                            b2 = 6;
                        }
                        break;
                    case 1773646829:
                        b2 = !str.equals(m2289(new int[]{1074844025, -1309268499, -1393226612, 42552615, 558646799, -423177542, 1683514304, -488126982, -1270631222, -1755738862}, 17 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 1;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        return m2283((Class) cz.m1785(list, 0, Class.class));
                    case 1:
                        return m2280((List<Class>) cz.m1785(list, 0, List.class));
                    case 2:
                        return m2290(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    case 3:
                        return m2287(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    case 4:
                        return m2286(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    case 5:
                        return m2282(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    case 6:
                        return m2279(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    case 7:
                        return m2281(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) cz.m1785(list, 1, Integer.class)).intValue() : -1);
                    case 8:
                        return m2288((Class) cz.m1785(list, 0, Class.class));
                    case 9:
                        return m2285();
                    case 10:
                        return m2284();
                    default:
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2289(int[] iArr, int i2) {
            String str;
            synchronized (d.f1586) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2303.clone();
                    d.f1584 = 0;
                    while (true) {
                        int i3 = d.f1584;
                        if (i3 < iArr.length) {
                            int i4 = iArr[i3];
                            char c2 = (char) (i4 >> 16);
                            cArr[0] = c2;
                            char c3 = (char) i4;
                            cArr[1] = c3;
                            char c4 = (char) (iArr[i3 + 1] >> 16);
                            cArr[2] = c4;
                            char c5 = (char) iArr[i3 + 1];
                            cArr[3] = c5;
                            d.f1587 = (c2 << 16) + c3;
                            d.f1585 = (c4 << 16) + c5;
                            d.m1788(iArr2);
                            for (int i5 = 0; i5 < 16; i5++) {
                                int i6 = d.f1587 ^ iArr2[i5];
                                d.f1587 = i6;
                                int iM1787 = d.m1787(i6) ^ d.f1585;
                                int i7 = d.f1587;
                                d.f1587 = iM1787;
                                d.f1585 = i7;
                            }
                            int i8 = d.f1587;
                            int i9 = d.f1585;
                            d.f1587 = i9;
                            d.f1585 = i8;
                            int i10 = i8 ^ iArr2[16];
                            d.f1585 = i10;
                            int i11 = i9 ^ iArr2[17];
                            d.f1587 = i11;
                            cArr[0] = (char) (i11 >>> 16);
                            cArr[1] = (char) i11;
                            cArr[2] = (char) (i10 >>> 16);
                            cArr[3] = (char) i10;
                            d.m1788(iArr2);
                            int i12 = d.f1584;
                            cArr2[i12 << 1] = cArr[0];
                            cArr2[(i12 << 1) + 1] = cArr[1];
                            cArr2[(i12 << 1) + 2] = cArr[2];
                            cArr2[(i12 << 1) + 3] = cArr[3];
                            d.f1584 = i12 + 2;
                        } else {
                            str = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.hm
    /* JADX INFO: renamed from: ﻐ */
    public final void mo2201() {
        super.mo2201();
        this.f2297 = null;
        this.f2300 = 0;
        this.f2298 = true;
        this.f2295.clear();
        this.f2296 = null;
        this.f2299 = -1;
    }
}
