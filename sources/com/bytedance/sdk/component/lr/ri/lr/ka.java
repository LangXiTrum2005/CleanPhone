package com.bytedance.sdk.component.lr.ri.lr;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements Serializable, Comparable<ka> {
    transient String di;
    transient int fi;
    final byte[] ka;
    static final char[] ri = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset lr = Charset.forName(C.UTF8_NAME);
    public static final ka ik = ri(new byte[0]);

    public ka(byte[] bArr) {
        this.ka = bArr;
    }

    public static ka ri(byte... bArr) {
        if (bArr != null) {
            return new ka((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka) {
            ka kaVar = (ka) obj;
            int iIk = kaVar.ik();
            byte[] bArr = this.ka;
            if (iIk == bArr.length && kaVar.ri(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.fi;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.ka);
        this.fi = iHashCode;
        return iHashCode;
    }

    public int ik() {
        return this.ka.length;
    }

    public byte[] ka() {
        return (byte[]) this.ka.clone();
    }

    public String lr() {
        byte[] bArr = this.ka;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = ri;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.ka.length == 0) {
            return "[size=0]";
        }
        String strRi = ri();
        int iRi = ri(strRi, 64);
        if (iRi == -1) {
            if (this.ka.length <= 64) {
                return "[hex=" + lr() + X3.j.e;
            }
            return "[size=" + this.ka.length + " hex=" + ri(0, 64).lr() + "…]";
        }
        String strReplace = strRi.substring(0, iRi).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iRi >= strRi.length()) {
            return "[text=" + strReplace + X3.j.e;
        }
        return "[size=" + this.ka.length + " text=" + strReplace + "…]";
    }

    public String ri() {
        String str = this.di;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.ka, lr);
        this.di = str2;
        return str2;
    }

    public ka ri(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.ka;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.ka.length + ")");
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, i3);
                return new ka(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte ri(int i) {
        return this.ka[i];
    }

    public boolean ri(int i, ka kaVar, int i2, int i3) {
        return kaVar.ri(i2, this.ka, i, i3);
    }

    public boolean ri(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.ka;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && jbs.ri(bArr2, i, bArr, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(ka kaVar) {
        int iIk = ik();
        int iIk2 = kaVar.ik();
        int iMin = Math.min(iIk, iIk2);
        for (int i = 0; i < iMin; i++) {
            int iRi = ri(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iRi2 = kaVar.ri(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iRi != iRi2) {
                return iRi < iRi2 ? -1 : 1;
            }
        }
        if (iIk == iIk2) {
            return 0;
        }
        return iIk < iIk2 ? -1 : 1;
    }

    public static int ri(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
