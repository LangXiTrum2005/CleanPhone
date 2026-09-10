package com.thinkup.core.common.no.n;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class om implements Serializable, Comparable<om> {
    private static final long om = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final byte[] f42092n;
    transient int o0;
    transient String oo;
    static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final om m = o(new byte[0]);

    public om(byte[] bArr) {
        this.f42092n = bArr;
    }

    private om nm() {
        return o0("SHA-512");
    }

    public static om o(byte... bArr) {
        if (bArr != null) {
            return new om((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(om omVar) {
        om omVar2 = omVar;
        int iMm = mm();
        int iMm2 = omVar2.mm();
        int iMin = Math.min(iMm, iMm2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iM = m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iM2 = omVar2.m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iMm == iMm2) {
            return 0;
        }
        return iMm < iMm2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof om) {
            om omVar = (om) obj;
            int iMm = omVar.mm();
            byte[] bArr = this.f42092n;
            if (iMm == bArr.length && omVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.o0;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f42092n);
        this.o0 = iHashCode;
        return iHashCode;
    }

    public String m() {
        return m.o(this.f42092n);
    }

    public om m0() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f42092n;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new om(bArr2);
            }
            i2++;
        }
    }

    public int mm() {
        return this.f42092n.length;
    }

    public byte[] mn() {
        return (byte[]) this.f42092n.clone();
    }

    public om mo() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f42092n;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArr2[i3] = (byte) (b3 - 32);
                    }
                }
                return new om(bArr2);
            }
            i2++;
        }
    }

    public om n() {
        return o0("MD5");
    }

    public byte[] n0() {
        return this.f42092n;
    }

    public ByteBuffer no() {
        return ByteBuffer.wrap(this.f42092n).asReadOnlyBuffer();
    }

    public om o0() {
        return o0(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public String om() {
        return m.m(this.f42092n);
    }

    public String on() {
        byte[] bArr = this.f42092n;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = o;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public om oo() {
        return o0("SHA-256");
    }

    public String toString() {
        if (this.f42092n.length == 0) {
            return "[size=0]";
        }
        String strO = o();
        int length = strO.length();
        int length2 = 0;
        int i2 = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strO.length();
                break;
            }
            if (i2 != 64) {
                int iCodePointAt = strO.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i2++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 != -1) {
            String strReplace = strO.substring(0, length2).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
            if (length2 >= strO.length()) {
                return a.n("[text=", strReplace, d9.i.f24752e);
            }
            return "[size=" + this.f42092n.length + " text=" + strReplace + "…]";
        }
        if (this.f42092n.length <= 64) {
            return "[hex=" + on() + d9.i.f24752e;
        }
        return "[size=" + this.f42092n.length + " hex=" + o(0, 64).on() + "…]";
    }

    public static om n(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((o(str.charAt(i3)) << 4) + o(str.charAt(i3 + 1)));
        }
        return o(bArr);
    }

    private om o0(String str) {
        try {
            return o(MessageDigest.getInstance(str).digest(this.f42092n));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private int om(om omVar) {
        return o(omVar.n0(), 0);
    }

    private boolean oo(om omVar) {
        return o(mm() - omVar.mm(), omVar, 0, omVar.mm());
    }

    public om m(om omVar) {
        return o("HmacSHA256", omVar);
    }

    public static om m(String str) {
        if (str != null) {
            byte[] bArrO = m.o(str);
            if (bArrO != null) {
                return new om(bArrO);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    private static om o(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            omo.o(bArr.length, i2, i3);
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return new om(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    private int oo(byte[] bArr) {
        return m(bArr, mm());
    }

    private om o0(om omVar) {
        return o("HmacSHA512", omVar);
    }

    private static int oo(String str) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == 64) {
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

    private int o0(byte[] bArr) {
        return o(bArr, 0);
    }

    private int on(om omVar) {
        return m(omVar.n0(), mm());
    }

    public byte m(int i2) {
        return this.f42092n[i2];
    }

    private boolean m(byte[] bArr) {
        return o(0, bArr, 0, bArr.length);
    }

    private int m(om omVar, int i2) {
        return m(omVar.n0(), i2);
    }

    private static om o(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new om(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    private int m0(om omVar) {
        int iMm = mm();
        int iMm2 = omVar.mm();
        int iMin = Math.min(iMm, iMm2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iM = m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iM2 = omVar.m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iMm == iMm2) {
            return 0;
        }
        return iMm < iMm2 ? -1 : 1;
    }

    public int m(byte[] bArr, int i2) {
        for (int iMin = Math.min(i2, this.f42092n.length - bArr.length); iMin >= 0; iMin--) {
            if (omo.o(this.f42092n, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final boolean n(om omVar) {
        return o(0, omVar, 0, omVar.mm());
    }

    private boolean n(byte[] bArr) {
        return o(mm() - bArr.length, bArr, 0, bArr.length);
    }

    public static om o(String str) {
        if (str != null) {
            om omVar = new om(str.getBytes(omo.o));
            omVar.oo = str;
            return omVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static om o(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new om(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String o() {
        String str = this.oo;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f42092n, omo.o);
        this.oo = str2;
        return str2;
    }

    public String o(Charset charset) {
        if (charset != null) {
            return new String(this.f42092n, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public om o(om omVar) {
        return o("HmacSHA1", omVar);
    }

    private om o(String str, om omVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(omVar.mn(), str));
            return o(mac.doFinal(this.f42092n));
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    private static int o(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
        }
        return c2 - '7';
    }

    private static om o(InputStream inputStream, int i2) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            return new om(bArr);
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i2)));
    }

    public om o(int i2) {
        return o(i2, this.f42092n.length);
    }

    public om o(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.f42092n;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException(a.i(this.f42092n.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i4 = i3 - i2;
            if (i4 >= 0) {
                if (i2 == 0 && i3 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i2, bArr2, 0, i4);
                return new om(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public void o(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f42092n);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public void o(n nVar) {
        byte[] bArr = this.f42092n;
        nVar.n(bArr, 0, bArr.length);
    }

    public boolean o(int i2, om omVar, int i3, int i4) {
        return omVar.o(0, this.f42092n, i2, i4);
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.f42092n;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && omo.o(bArr2, i2, bArr, i3, i4);
    }

    private int o(om omVar, int i2) {
        return o(omVar.n0(), i2);
    }

    public int o(byte[] bArr, int i2) {
        int length = this.f42092n.length - bArr.length;
        for (int iMax = Math.max(i2, 0); iMax <= length; iMax++) {
            if (omo.o(this.f42092n, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    private void o(ObjectInputStream objectInputStream) throws IOException {
        int i2 = objectInputStream.readInt();
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = objectInputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            om omVar = new om(bArr);
            try {
                Field declaredField = om.class.getDeclaredField(dc.q);
                declaredField.setAccessible(true);
                declaredField.set(this, omVar.f42092n);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
                throw new AssertionError();
            }
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i2)));
    }

    private void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f42092n.length);
        objectOutputStream.write(this.f42092n);
    }
}
