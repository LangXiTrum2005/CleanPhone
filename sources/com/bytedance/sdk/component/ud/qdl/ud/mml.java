package com.bytedance.sdk.component.ud.qdl.ud;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class mml implements Serializable, Comparable<mml> {
    final byte[] mml;
    transient String mo;
    transient int mzz;
    static final char[] qdl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset ud = Charset.forName("UTF-8");
    public static final mml lnr = qdl(new byte[0]);

    public mml(byte[] bArr) {
        this.mml = bArr;
    }

    public static mml qdl(byte... bArr) {
        if (bArr != null) {
            return new mml((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mml) {
            mml mmlVar = (mml) obj;
            int iLnr = mmlVar.lnr();
            byte[] bArr = this.mml;
            if (iLnr == bArr.length && mmlVar.qdl(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.mzz;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.mml);
        this.mzz = iHashCode;
        return iHashCode;
    }

    public int lnr() {
        return this.mml.length;
    }

    public byte[] mml() {
        return (byte[]) this.mml.clone();
    }

    public String toString() {
        if (this.mml.length == 0) {
            return "[size=0]";
        }
        String strQdl = qdl();
        int iQdl = qdl(strQdl, 64);
        if (iQdl != -1) {
            String strReplace = strQdl.substring(0, iQdl).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
            if (iQdl >= strQdl.length()) {
                return a.n("[text=", strReplace, d9.i.f24752e);
            }
            return "[size=" + this.mml.length + " text=" + strReplace + "…]";
        }
        if (this.mml.length <= 64) {
            return "[hex=" + ud() + d9.i.f24752e;
        }
        return "[size=" + this.mml.length + " hex=" + qdl(0, 64).ud() + "…]";
    }

    public String ud() {
        byte[] bArr = this.mml;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = qdl;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public String qdl() {
        String str = this.mo;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.mml, ud);
        this.mo = str2;
        return str2;
    }

    public mml qdl(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.mml;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException(a.i(this.mml.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i4 = i3 - i2;
            if (i4 >= 0) {
                if (i2 == 0 && i3 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i2, bArr2, 0, i4);
                return new mml(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte qdl(int i2) {
        return this.mml[i2];
    }

    public boolean qdl(int i2, mml mmlVar, int i3, int i4) {
        return mmlVar.qdl(i3, this.mml, i2, i4);
    }

    public boolean qdl(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.mml;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && tvp.qdl(bArr2, i2, bArr, i3, i4);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(mml mmlVar) {
        int iLnr = lnr();
        int iLnr2 = mmlVar.lnr();
        int iMin = Math.min(iLnr, iLnr2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iQdl = qdl(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iQdl2 = mmlVar.qdl(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iQdl != iQdl2) {
                return iQdl < iQdl2 ? -1 : 1;
            }
        }
        if (iLnr == iLnr2) {
            return 0;
        }
        return iLnr < iLnr2 ? -1 : 1;
    }

    public static int qdl(String str, int i2) {
        int length = str.length();
        int iCharCount = 0;
        int i3 = 0;
        while (iCharCount < length) {
            if (i3 == i2) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i3++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
