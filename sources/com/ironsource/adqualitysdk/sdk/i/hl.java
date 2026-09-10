package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.ironsource.InterfaceC0435l1;
import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hl extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2317 = {-103363495, 2003605276, -1420544544, -1252579132, -1713099814, -152276108, 2099479766, -783070933, -768469740, -779988851, 1387319639, -1187362168, -1272085706, -1712757759, -456793712, 1819351901, 698509257, -1862287001};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2318 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2319 = 1;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends hl {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2320 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2321 = 30900;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2322 = 58943;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2323 = 58740;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2324 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2325 = 1680;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            cj cjVar = new cj(mo2240());
            int i10 = f2324 + InterfaceC0435l1.d.b.f29105b;
            f2320 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 93 / 0;
            }
            return cjVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            f2320 = (f2324 + 57) % 128;
            String strIntern = m2282("뾍굧\uf237吟鮈\uf48fㄑ裪줾◖\ue17f鉒黫觛᭨굆凅ꯗ邙뤊矍䡿蛳匎涙\uf02e\ue10c엡뗆ꛂنᢩ첫䴏ㄑ裪줾◖ഘ簶\ue03a\ue560ｗ걤遇죟쟾讪", 47 - Color.alpha(0)).intern();
            int i10 = f2324 + InterfaceC0435l1.d.b.f29105b;
            f2320 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 18 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = f2320;
            f2324 = (i10 + 33) % 128;
            int i11 = i10 + 119;
            f2324 = i11 % 128;
            if (i11 % 2 == 0) {
                return VungleApiClient.class;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2282(String str, int i10) {
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
                                char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2322)) ^ ((c5 >>> 5) + f2325)));
                                cArr3[1] = c10;
                                cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2323) ^ ((c10 + i12) ^ ((c10 << 4) + f2321))));
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
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b extends hl {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2326 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2327 = 43895;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2328 = 11344;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2329 = 12879;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2330 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2331 = 47927;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            cc ccVar = new cc(m2283("ួ삿㡖䵁ᙢൢ", ((byte) KeyEvent.getModifierMetaStateMask()) + 7).intern());
            int i10 = f2330 + 63;
            f2326 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 95 / 0;
            }
            return ccVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            f2326 = (f2330 + 39) % 128;
            String strIntern = m2283("\uf8f1ԉ捀\udc4dួ삿㡖䵁ᙢൢ宎Ⰹ\udc03䭫彔䫍\uf85d傘うᢴ㡖䵁ᙢൢﲞ굖\ue400砘吞織H혓ລ뛺", 33 - TextUtils.indexOf("", "", 0, 0)).intern();
            int i10 = f2330 + 117;
            f2326 = i10 % 128;
            if (i10 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = (f2330 + 57) % 128;
            f2326 = i10;
            int i11 = i10 + 29;
            f2330 = i11 % 128;
            if (i11 % 2 == 0) {
                return com.vungle.warren.VungleApiClient.class;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2283(String str, int i10) {
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
                                char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2327)) ^ ((c5 >>> 5) + f2329)));
                                cArr3[1] = c10;
                                cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2331) ^ ((c10 + i12) ^ ((c10 << 4) + f2328))));
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
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2281(int[] iArr, int i10) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2317.clone();
                com.ironsource.adqualitysdk.sdk.i.a.f58 = 0;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = (c4 << 16) + c5;
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = (c10 << 16) + c11;
                        com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = com.ironsource.adqualitysdk.sdk.i.a.f59 ^ iArr2[i13];
                            com.ironsource.adqualitysdk.sdk.i.a.f59 = i14;
                            int iM200 = com.ironsource.adqualitysdk.sdk.i.a.m200(i14) ^ com.ironsource.adqualitysdk.sdk.i.a.f60;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                            com.ironsource.adqualitysdk.sdk.i.a.f59 = iM200;
                            com.ironsource.adqualitysdk.sdk.i.a.f60 = i15;
                        }
                        int i16 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                        int i17 = com.ironsource.adqualitysdk.sdk.i.a.f60;
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = i17;
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                        int i20 = com.ironsource.adqualitysdk.sdk.i.a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        com.ironsource.adqualitysdk.sdk.i.a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2318 = (f2319 + 33) % 128;
        String strIntern = m2281(new int[]{1182476305, -703218953, -240757321, -295938597}, 6 - Drawable.resolveOpacity(0, 0)).intern();
        f2318 = (f2319 + InterfaceC0435l1.d.b.f29110g) % 128;
        return strIntern;
    }
}
