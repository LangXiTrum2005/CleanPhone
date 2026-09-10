package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f18585a;

    static {
        int i10 = (((((~349517445) & 1770783991) | 1585637523) + ((349517445 & 828130404) | 441534467)) - 1774508070) ^ (1876855542 % 1069755936);
        int i11 = (((((~396473730) & 280003019) | 1560841089) + ((396473730 & 581959754) | 705178672)) - (-2122415827)) ^ (1447267605 % 1369321801);
        int i12 = (((((~990892921) & 1764437056) | 26530608) + ((990892921 & 2050981056) | 378852004)) - 524777631) ^ (168002245 % 150122846);
        int i13 = (((((~783368690) & 1480833986) | 1027924228) + ((783368690 & 1108040386) | 324812860)) - (-2032723989)) ^ (1189641421 % 1025202362);
        int i14 = (((((~1662981776) & 570576705) | 1321849157) + ((1662981776 & (-264073600)) | (-599138066))) - 1910740440) ^ (882160379 % 11614769);
        int[] iArr = new int[i13];
        iArr[0] = i12;
        iArr[1] = i11;
        iArr[i10] = i14;
        iArr[(((((~12260289) & 18423941) | 1391147552) + ((12260289 & 286296197) | 2093276674)) - (-1077194409)) ^ (1503885238 % 1219407971)] = (((((~1204275569) & 228665354) | 424906800) + ((1204275569 & (-1801127910)) | (-1190276491))) - 1826404452) ^ (2069110699 % 712633417);
        f18585a = iArr;
    }

    public static String a(String str) {
        int i10;
        int i11 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[8];
        int i12 = 0;
        while (i12 < bArrDecode.length) {
            int i13 = i12 % 8;
            if (i13 == 0) {
                int i14 = i12 >>> 3;
                int i15 = i11;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                i10 = i31;
                int i32 = 1821351989;
                while (true) {
                    if (i32 == 91464932) {
                        int i33 = 751433995 + i32;
                        i32 += 1234789214;
                        if (i15 >= i16) {
                            i32 = i33;
                        }
                    } else if (i32 == 1326254146) {
                        int i34 = i18 >>> i20;
                        int[] iArr = f18585a;
                        i17 += ((i18 << i19) ^ (i34 + i18)) ^ (i21 + iArr[i21 & i22]);
                        i21 += i23;
                        i18 += ((i17 << i19) ^ (i34 + i17)) ^ (i21 + iArr[(i21 >> i24) & i22]);
                        i15++;
                        i32 -= 1234789214;
                    } else {
                        if (i32 != 1821351989) {
                            break;
                        }
                        i32 -= 1729887057;
                        i22 = 3;
                        i20 = 5;
                        i25 = 255;
                        i28 = 2;
                        i24 = 11;
                        i23 = 1340169305;
                        i19 = 4;
                        i16 = 64;
                        i17 = -236335227;
                        i29 = 16;
                        i30 = 6;
                        i31 = 7;
                        i27 = 8;
                        i26 = 24;
                        i18 = i14;
                        i15 = i10;
                        i21 = i15;
                    }
                }
                bArr[i10] = (byte) (((i17 & i25) << i26) >> i26);
                bArr[1] = (byte) ((((i17 >> i27) & i25) << i26) >> i26);
                bArr[i28] = (byte) ((((i17 >> i29) & i25) << i26) >> i26);
                bArr[i22] = (byte) (i17 >> i26);
                bArr[i19] = (byte) (((i18 & i25) << i26) >> i26);
                bArr[i20] = (byte) ((((i18 >> i27) & i25) << i26) >> i26);
                bArr[i30] = (byte) ((((i18 >> i29) & i25) << i26) >> i26);
                bArr[i31] = (byte) (i18 >> i26);
                i13 = i10;
            } else {
                i10 = i11;
            }
            bArrDecode[i12] = (byte) (((bArrDecode[i12] ^ bArr[i13]) << 24) >> 24);
            i12++;
            i11 = i10;
        }
        return new String(bArrDecode, Charset.defaultCharset());
    }
}
