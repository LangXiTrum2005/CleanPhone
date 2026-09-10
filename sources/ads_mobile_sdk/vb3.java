package ads_mobile_sdk;

import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class vb3 {
    public final int a;
    public final int[] b;

    public vb3(int i, int[] iArr) {
        int iAttabal = sanitaria.attabal(((~480298490) & 1376520936) | 743765285, (480298490 & 1378459336) | 569504804, -451892186, 1172755590) ^ (496987743 % 159259470);
        int length = iArr.length;
        if (length == iAttabal) {
            this.a = i;
            this.b = iArr;
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44);
            sb.append(bc3.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
            sb.append(length);
            sb.append(bc3.a("a0CvvBEaN339T0zNlXk="));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int iAttabal = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        char c2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i16 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == iAttabal) {
                    i3 = i16;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = this.b;
                i6 += (((i5 << i7) ^ (i5 >>> i8)) + i5) ^ (i4 + iArr[i4 & i9]);
                i4 += i10;
                i5 += (iArr[(i4 >>> i11) & i9] + i4) ^ (((i6 << i7) ^ (i6 >>> i8)) + i6);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i6 >> i15);
                    bArr[1] = (byte) ((((i6 >> i14) & i12) << i15) >> i15);
                    bArr[c3] = (byte) ((((i6 >> i13) & i12) << i15) >> i15);
                    bArr[i9] = (byte) (((i6 & i12) << i15) >> i15);
                    bArr[i7] = (byte) (i5 >> i15);
                    bArr[i8] = (byte) ((((i5 >> i14) & i12) << i15) >> i15);
                    bArr[c2] = (byte) ((((i5 >> i13) & i12) << i15) >> i15);
                    bArr[c] = (byte) (((i5 & i12) << i15) >> i15);
                    return;
                }
                iAttabal = sanitaria.attabal(((~1805613091) & 1510775491) | 1446977934, (1805613091 & (-1409156543)) | (-1529649762), 328319491, 94255812) ^ (959658925 % 805251743);
                i6 = this.a;
                i3 -= 1057256109;
                i7 = 4;
                i8 = 5;
                i9 = 3;
                i10 = 1340169305;
                i11 = 11;
                i15 = 24;
                i12 = 255;
                c3 = 2;
                c2 = 6;
                c = 7;
                i14 = 16;
                i13 = 8;
                i5 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }
}
