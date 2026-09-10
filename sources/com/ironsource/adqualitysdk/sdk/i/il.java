package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class il {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2508 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2509 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2510 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2511 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2512;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final byte[] f2513;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2514;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2515;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2516;

    static {
        m2516();
        int i10 = (f2511 + 25) % 128;
        f2510 = i10;
        f2511 = (i10 + 119) % 128;
        f2514 = true;
        f2513 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2515 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private il() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int m2515(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        byte b10 = bArr[2];
        if (b10 == 61) {
            f2511 = (f2510 + 39) % 128;
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 != 61) {
            int i11 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b11] << 24) >>> 24);
            bArr2[i10] = (byte) (i11 >> 16);
            bArr2[i10 + 1] = (byte) (i11 >> 8);
            bArr2[i10 + 2] = (byte) i11;
            return 3;
        }
        int i12 = f2510;
        f2511 = (i12 + 77) % 128;
        int i13 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
        bArr2[i10] = (byte) (i13 >>> 16);
        bArr2[i10 + 1] = (byte) (i13 >>> 8);
        int i14 = i12 + 25;
        f2511 = i14 % 128;
        if (i14 % 2 != 0) {
            return 2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2516() {
        f2508 = (char) 15139;
        f2516 = (char) 15360;
        f2509 = (char) 36163;
        f2512 = (char) 57987;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static byte[] m2519(String str) throws in {
        f2511 = (f2510 + 51) % 128;
        byte[] bytes = str.getBytes();
        byte[] bArrM2522 = m2522(bytes, bytes.length);
        int i10 = f2510 + 95;
        f2511 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
        return bArrM2522;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2521(byte[] bArr) {
        f2510 = (f2511 + 23) % 128;
        String strM2523 = m2523(bArr, bArr.length, f2513);
        f2510 = (f2511 + 13) % 128;
        return strM2523;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2523(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM2517 = m2517(bArr, 0, i10, bArr2);
        String str = new String(bArrM2517, 0, bArrM2517.length);
        f2510 = (f2511 + 63) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2518(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        int i13;
        int i14;
        if (i11 > 0) {
            int i15 = f2511 + 33;
            f2510 = i15 % 128;
            i13 = i15 % 2 != 0 ? (bArr[i10] / 53) >>> 63 : (bArr[i10] << 24) >>> 8;
        } else {
            i13 = 0;
        }
        int i16 = i13 | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0);
        if (i11 > 2) {
            int i17 = f2510 + 53;
            f2511 = i17 % 128;
            i14 = i17 % 2 == 0 ? (bArr[i10 - 3] << 68) * 63 : (bArr[i10 + 2] << 24) >>> 24;
        } else {
            i14 = 0;
        }
        int i18 = i14 | i16;
        if (i11 == 1) {
            bArr2[i12] = bArr3[i18 >>> 18];
            bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            f2511 = (f2510 + 99) % 128;
            return bArr2;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return bArr2;
            }
            bArr2[i12] = bArr3[i18 >>> 18];
            bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i18 >>> 6) & 63];
            bArr2[i12 + 3] = bArr3[i18 & 63];
            return bArr2;
        }
        bArr2[i12] = bArr3[i18 >>> 18];
        bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
        bArr2[i12 + 2] = bArr3[(i18 >>> 6) & 63];
        bArr2[i12 + 3] = 61;
        int i19 = f2511 + 125;
        f2510 = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 88 / 0;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2522(byte[] bArr, int i10) throws in {
        f2511 = (f2510 + 29) % 128;
        byte[] bArrM2524 = m2524(bArr, 0, i10, f2515);
        f2511 = (f2510 + InterfaceC0435l1.d.b.f29114k) % 128;
        return bArrM2524;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2520(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2508)) ^ ((c5 >>> 5) + f2509)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2516) ^ ((c10 + i12) ^ ((c10 << 4) + f2512))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m2524(byte[] bArr, int i10, int i11, byte[] bArr2) throws in {
        byte[] bArr3;
        byte[] bArr4;
        int i12;
        int i13;
        int iM2515;
        char c4;
        int i14 = f2510 + 69;
        int i15 = i14 % 128;
        f2511 = i15;
        if (i14 % 2 == 0) {
            bArr3 = new byte[((i11 - 2) * 3) >> 3];
            bArr4 = new byte[5];
            i12 = 1;
            i13 = 1;
            iM2515 = 1;
        } else {
            bArr3 = new byte[defpackage.e.D(i11, 3, 4, 2)];
            bArr4 = new byte[4];
            i12 = 0;
            i13 = 0;
            iM2515 = 0;
        }
        f2510 = (i15 + 123) % 128;
        while (i12 < i11) {
            int i16 = f2510;
            int i17 = (i16 + 85) % 128;
            f2511 = i17;
            byte b10 = (byte) (bArr[i12] & 127);
            byte b11 = bArr2[b10];
            if (b11 < -5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2520("┃빧⧗鞧┃빧쯺쿏ᖤ\udbee榗ꏇ㺯\ud869纹\ue5c1离\ud90dᆸᷦ詃跫။괲䨭⊆⢸ꩂ\ue7ba\uee93", (ViewConfiguration.getPressedStateDuration() >> 16) + 30).intern());
                sb2.append(i12);
                sb2.append(m2520("毆宱", 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                sb2.append((int) bArr[i12]);
                throw new in(f2.m(sb2, m2520("\udfb1곋骊\u3130늊꾧絁푆ꜞ껧", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9)));
            }
            if (b11 < -1) {
                c4 = 4;
            } else {
                if (b10 == 61) {
                    int i18 = i11 - i12;
                    byte b12 = (byte) (bArr[i11 - 1] & 127);
                    if (i13 != 0) {
                        f2510 = (i17 + 13) % 128;
                        if (i13 != 1) {
                            if (i13 == 3) {
                                f2510 = (i17 + InterfaceC0435l1.d.b.f29112i) % 128;
                                if (i18 <= 2) {
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(m2520("︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ櫒靑絁푆쯺쿏閫嗀\uda0eᥚ\ue086䒹\uef03蝫ﰭ㷞劤얓ꗐ兙ᶖ者ΥꞱ阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", TextUtils.indexOf("", "", 0, 0) + 64).intern());
                                sb3.append(i12);
                                throw new in(sb3.toString());
                            }
                            if (i13 != 4 || i18 <= 1) {
                                if (b12 != 61 && b12 != 10) {
                                    throw new in(m2520("阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186ᆸᷦᛍ梯\ue5f5\ue33cꀨ볅嶗禚⧗鞧쵻똞후燪嶗禚\udcab\uf102퓖䏿\ue3e7ⲅ慻早", Drawable.resolveOpacity(0, 0) + 39).intern());
                                }
                                break;
                                break;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m2520("︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ櫒靑絁푆쯺쿏閫嗀\uda0eᥚ\ue086䒹\uef03蝫ﰭ㷞劤얓ꗐ兙ᶖ者ΥꞱ阘㒡ᷝ晋땬謼⧗鞧ꀨ볅䧨\ue460싿\ue186熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", TextUtils.indexOf("", "", 0, 0) + 64).intern());
                            sb4.append(i12);
                            throw new in(sb4.toString());
                        }
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(m2520("\ue5f5\ue33cꀨ볅嶗禚⧗鞧︒뭓㹘⦷\ue5f5\ue33c䋀\udfe9鈢ᮄ⟅䤻ⳳ\u09da式ଌ⢸ꩂ\ue7ba\uee93鈢ᮄ⟅䤻ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", 40 - Color.green(0)).intern());
                    sb5.append(i12);
                    throw new in(sb5.toString());
                }
                int i19 = i13 + 1;
                bArr4[i13] = b10;
                c4 = 4;
                if (i19 == 4) {
                    int i20 = i16 + 77;
                    f2511 = i20 % 128;
                    iM2515 = i20 % 2 == 0 ? iM2515 >>> m2515(bArr4, bArr3, iM2515, bArr2) : iM2515 + m2515(bArr4, bArr3, iM2515, bArr2);
                    i13 = 0;
                } else {
                    i13 = i19;
                }
            }
            i12++;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m2520("锉螝\udcab\uf102诲\uf02f잆\uf211詃跫莦භ\ue5f5\ue33c䋀\udfe9폝컄\u0cf6㴘錶ኼ⟅䤻殟较熷脏ᶖ者Ɗ揿쯺쿏\ue7ba\uee93", 36 - TextUtils.getCapsMode("", 0, 0)).intern());
                sb6.append(i11 - 1);
                throw new in(sb6.toString());
            }
            bArr4[i13] = 61;
            iM2515 += m2515(bArr4, bArr3, iM2515, bArr2);
        }
        byte[] bArr5 = new byte[iM2515];
        System.arraycopy(bArr3, 0, bArr5, 0, iM2515);
        return bArr5;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2517(byte[] bArr, int i10, int i11, byte[] bArr2) {
        byte[] bArr3;
        int i12;
        int i13;
        int i14 = f2511;
        int i15 = i14 + 65;
        f2510 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = ((i11 * 3) % 5) % 4;
            bArr3 = new byte[(i16 % Integer.MAX_VALUE) * i16];
            i12 = i11 + 3;
            i13 = 1;
        } else {
            int i17 = ((i11 + 2) / 3) << 2;
            bArr3 = new byte[(i17 / Integer.MAX_VALUE) + i17];
            i12 = i11 - 2;
            i13 = 0;
        }
        byte[] bArr4 = bArr3;
        f2510 = (i14 + 23) % 128;
        int i18 = 0;
        int i19 = 0;
        int i20 = i13;
        while (i18 < i12) {
            int i21 = ((bArr[i18] << 24) >>> 8) | ((bArr[i18 + 1] << 24) >>> 16) | ((bArr[i18 + 2] << 24) >>> 24);
            bArr4[i19] = bArr2[i21 >>> 18];
            int i22 = i19 + 1;
            bArr4[i22] = bArr2[(i21 >>> 12) & 63];
            bArr4[i19 + 2] = bArr2[(i21 >>> 6) & 63];
            bArr4[i19 + 3] = bArr2[i21 & 63];
            i20 += 4;
            if (i20 == Integer.MAX_VALUE) {
                f2511 = (f2510 + InterfaceC0435l1.d.b.f29109f) % 128;
                bArr4[i19 + 4] = 10;
                i20 = 0;
                i19 = i22;
            }
            i18 += 3;
            i19 += 4;
        }
        if (i18 < i11) {
            int i23 = f2510 + 35;
            f2511 = i23 % 128;
            if (i23 % 2 == 0) {
                m2518(bArr, i18, i11 >>> i18, bArr4, i19, bArr2);
                if (i20 + 42 == Integer.MAX_VALUE) {
                    bArr4[i19 + 4] = 10;
                    i19++;
                }
            } else {
                m2518(bArr, i18, i11 - i18, bArr4, i19, bArr2);
                if (i20 + 4 == Integer.MAX_VALUE) {
                    bArr4[i19 + 4] = 10;
                    i19++;
                }
            }
            i19 += 4;
        }
        if (f2514 || i19 == bArr4.length) {
            return bArr4;
        }
        throw new AssertionError();
    }
}
