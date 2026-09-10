package com.mbridge.msdk.thrid.okio;

import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements Serializable, Comparable<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char[] f36781d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f36782e = a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f36783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f36784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient String f36785c;

    public f(byte[] bArr) {
        this.f36783a = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private f b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f36783a));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static f c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(u.f36826a));
        fVar.f36785c = str;
        return fVar;
    }

    public String d() {
        return b.a(this.f36783a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int iJ = fVar.j();
            byte[] bArr = this.f36783a;
            if (iJ == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        byte[] bArr = this.f36783a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f36781d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public f h() {
        return b(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public int hashCode() {
        int i10 = this.f36784b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f36783a);
        this.f36784b = iHashCode;
        return iHashCode;
    }

    public f i() {
        return b("SHA-256");
    }

    public int j() {
        return this.f36783a.length;
    }

    public f k() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f36783a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
            i10++;
        }
    }

    public byte[] l() {
        return (byte[]) this.f36783a.clone();
    }

    public String m() {
        String str = this.f36785c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f36783a, u.f36826a);
        this.f36785c = str2;
        return str2;
    }

    public String toString() {
        if (this.f36783a.length == 0) {
            return "[size=0]";
        }
        String strM = m();
        int iA = a(strM, 64);
        if (iA != -1) {
            String strReplace = strM.substring(0, iA).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iA >= strM.length()) {
                return defpackage.e.o("[text=", strReplace, X3.j.f27836e);
            }
            return "[size=" + this.f36783a.length + " text=" + strReplace + "…]";
        }
        if (this.f36783a.length <= 64) {
            return "[hex=" + g() + X3.j.f27836e;
        }
        return "[size=" + this.f36783a.length + " hex=" + a(0, 64).g() + "…]";
    }

    public static f a(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((a(str.charAt(i11)) << 4) + a(str.charAt(i11 + 1)));
                }
                return a(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        throw new IllegalArgumentException("hex == null");
    }

    public final boolean b(f fVar) {
        return a(0, fVar, 0, fVar.j());
    }

    private static int a(char c4) {
        if (c4 >= '0' && c4 <= '9') {
            return c4 - '0';
        }
        if (c4 >= 'a' && c4 <= 'f') {
            return c4 - 'W';
        }
        if (c4 >= 'A' && c4 <= 'F') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public f a(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f36783a;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException(l1.d.i(new StringBuilder("endIndex > length("), this.f36783a.length, ")"));
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte a(int i10) {
        return this.f36783a[i10];
    }

    public void a(c cVar) {
        byte[] bArr = this.f36783a;
        cVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i10, f fVar, int i11, int i12) {
        return fVar.a(i11, this.f36783a, i10, i12);
    }

    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f36783a;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && u.a(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iJ = j();
        int iJ2 = fVar.j();
        int iMin = Math.min(iJ, iJ2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iA = a(i10) & 255;
            int iA2 = fVar.a(i10) & 255;
            if (iA != iA2) {
                return iA < iA2 ? -1 : 1;
            }
        }
        if (iJ == iJ2) {
            return 0;
        }
        return iJ < iJ2 ? -1 : 1;
    }

    public static int a(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
