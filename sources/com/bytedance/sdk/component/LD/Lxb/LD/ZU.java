package com.bytedance.sdk.component.LD.Lxb.LD;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements Serializable, Comparable<ZU> {
    transient int JXs;
    final byte[] ZU;
    transient String lc;
    static final char[] Lxb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset LD = Charset.forName(C.UTF8_NAME);
    public static final ZU lk = Lxb(new byte[0]);

    public ZU(byte[] bArr) {
        this.ZU = bArr;
    }

    public static ZU Lxb(byte... bArr) {
        if (bArr != null) {
            return new ZU((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String LD() {
        byte[] bArr = this.ZU;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = Lxb;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & cw.m];
        }
        return new String(cArr);
    }

    public byte[] ZU() {
        return (byte[]) this.ZU.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZU) {
            ZU zu = (ZU) obj;
            int iLk = zu.lk();
            byte[] bArr = this.ZU;
            if (iLk == bArr.length && zu.Lxb(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.JXs;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.ZU);
        this.JXs = iHashCode;
        return iHashCode;
    }

    public int lk() {
        return this.ZU.length;
    }

    public String toString() {
        if (this.ZU.length == 0) {
            return "[size=0]";
        }
        String strLxb = Lxb();
        int iLxb = Lxb(strLxb, 64);
        if (iLxb != -1) {
            String strReplace = strLxb.substring(0, iLxb).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iLxb >= strLxb.length()) {
                return DM.B("[text=", strReplace, "]");
            }
            return "[size=" + this.ZU.length + " text=" + strReplace + "…]";
        }
        if (this.ZU.length <= 64) {
            return "[hex=" + LD() + "]";
        }
        return "[size=" + this.ZU.length + " hex=" + Lxb(0, 64).LD() + "…]";
    }

    public String Lxb() {
        String str = this.lc;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.ZU, LD);
        this.lc = str2;
        return str2;
    }

    public ZU Lxb(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.ZU;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException(AbstractC5044xl.o(new StringBuilder("endIndex > length("), this.ZU.length, ")"));
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, i3);
                return new ZU(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte Lxb(int i) {
        return this.ZU[i];
    }

    public boolean Lxb(int i, ZU zu, int i2, int i3) {
        return zu.Lxb(i2, this.ZU, i, i3);
    }

    public boolean Lxb(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.ZU;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && QAg.Lxb(bArr2, i, bArr, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(ZU zu) {
        int iLk = lk();
        int iLk2 = zu.lk();
        int iMin = Math.min(iLk, iLk2);
        for (int i = 0; i < iMin; i++) {
            int iLxb = Lxb(i) & 255;
            int iLxb2 = zu.Lxb(i) & 255;
            if (iLxb != iLxb2) {
                return iLxb < iLxb2 ? -1 : 1;
            }
        }
        if (iLk == iLk2) {
            return 0;
        }
        return iLk < iLk2 ? -1 : 1;
    }

    public static int Lxb(String str, int i) {
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
