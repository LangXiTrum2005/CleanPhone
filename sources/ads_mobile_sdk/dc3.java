package ads_mobile_sdk;

import java.nio.charset.Charset;
import java.util.Arrays;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class dc3 {
    public static final dc3 b = new dc3(new byte[0]);
    public final byte[] a;

    public dc3(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dc3) {
            return Arrays.equals(this.a, ((dc3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + iAttabal);
        sb.append(bc3.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(bc3.a("Ng=="));
        return sb.toString();
    }

    public final byte a(int i) {
        int iAttabal = sanitaria.attabal(((~2106914653) & 587408197) | 1537377410, (2106914653 & 536945509) | 443419704, -2054635237, 102375994) ^ (2013725218 % 1633938701);
        byte[] bArr = this.a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + iAttabal);
            sb.append(bc3.a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(length).length());
        sb2.append(bc3.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i);
        sb2.append(bc3.a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final dc3 a(dc3 dc3Var) {
        byte[] bArr;
        byte[] bArr2 = this.a;
        int length = bArr2.length + dc3Var.a.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = dc3Var.a;
        System.arraycopy(bArr4, 0, bArr3, this.a.length, bArr4.length);
        if (length == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[length];
            System.arraycopy(bArr3, 0, bArr, 0, length);
        }
        return new dc3(bArr);
    }

    public static dc3 a(String str) {
        byte[] bArr;
        byte[] bytes = str.getBytes(Charset.forName(bc3.a("Hn2H4l0=")));
        int length = bytes.length;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bytes, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        return new dc3(bArr);
    }

    public static int a(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        return b2 & (sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
    }
}
