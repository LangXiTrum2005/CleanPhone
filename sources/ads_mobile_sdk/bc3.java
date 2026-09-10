package ads_mobile_sdk;

import android.util.Base64;
import java.nio.charset.Charset;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public abstract class bc3 {
    public static final int[] a;

    static {
        int[] iArr = new int[sanitaria.attabal(((~783368690) & 1480833986) | 1027924228, (783368690 & 1108040386) | 324812860, -1842830590, 189893399) ^ (1189641421 % 1025202362)];
        iArr[0] = 1612548114;
        iArr[1] = 48721154;
        iArr[2] = -644182789;
        iArr[3] = 1279563090;
        a = iArr;
    }

    public static String a(String str) {
        int i;
        int iAttabal = sanitaria.attabal(((~1469262009) & 289472010) | 1282580878, (1469262009 & 823287553) | 773300675, -2143848605, 250071570) ^ (1065103348 % 625032172);
        int i2 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[iAttabal];
        int i3 = 0;
        while (i3 < bArrDecode.length) {
            int i4 = i3 % iAttabal;
            if (i4 == 0) {
                int i5 = i3 >>> 3;
                int i6 = i2;
                int i7 = i6;
                int i8 = i7;
                int iAttabal2 = i8;
                int i9 = iAttabal2;
                int i10 = i9;
                int i11 = i10;
                int i12 = i11;
                int i13 = i12;
                int i14 = i13;
                int i15 = i14;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                i = i21;
                int i22 = 1821351989;
                while (true) {
                    if (i22 == 91464932) {
                        int i23 = 751433995 + i22;
                        i22 += 1234789214;
                        if (i6 >= i7) {
                            i22 = i23;
                        }
                    } else if (i22 == 1326254146) {
                        int i24 = i8 >>> i12;
                        int[] iArr = a;
                        iAttabal2 += ((i8 << i9) ^ (i24 + i8)) ^ (i10 + iArr[i10 & i11]);
                        i10 += i13;
                        i8 += ((iAttabal2 << i9) ^ (i24 + iAttabal2)) ^ (i10 + iArr[(i10 >> i14) & i11]);
                        i6++;
                        i22 -= 1234789214;
                    } else {
                        if (i22 != 1821351989) {
                            break;
                        }
                        iAttabal2 = sanitaria.attabal(((~2097951318) & 1900230431) | 170780928, (2097951318 & (-45427169)) | (-1943215680), 329249954, 47050943) ^ (1423524763 % 1303785506);
                        i22 -= 1729887057;
                        i11 = 3;
                        i7 = 64;
                        i9 = 4;
                        i12 = 5;
                        i13 = 1340169305;
                        i14 = 11;
                        i20 = 255;
                        i19 = 8;
                        i21 = 2;
                        i18 = 16;
                        i17 = 6;
                        i15 = 7;
                        i16 = 24;
                        i8 = i5;
                        i6 = i;
                        i10 = i6;
                    }
                }
                bArr[i] = (byte) (((iAttabal2 & i20) << i16) >> i16);
                bArr[1] = (byte) ((((iAttabal2 >> i19) & i20) << i16) >> i16);
                bArr[i21] = (byte) ((((iAttabal2 >> i18) & i20) << i16) >> i16);
                bArr[i11] = (byte) (iAttabal2 >> i16);
                bArr[i9] = (byte) (((i8 & i20) << i16) >> i16);
                bArr[i12] = (byte) ((((i8 >> i19) & i20) << i16) >> i16);
                bArr[i17] = (byte) ((((i8 >> i18) & i20) << i16) >> i16);
                bArr[i15] = (byte) (i8 >> i16);
            } else {
                i = i2;
            }
            bArrDecode[i3] = (byte) (((bArrDecode[i3] ^ bArr[i4]) << 24) >> 24);
            i3++;
            i2 = i;
        }
        return new String(bArrDecode, Charset.defaultCharset());
    }
}
