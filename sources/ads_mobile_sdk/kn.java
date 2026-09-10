package ads_mobile_sdk;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import saneness.horsehair;
import saneness.irani;
import saneness.maggot;
import saneness.pedagogism;
import saneness.polder;

/* JADX INFO: loaded from: classes.dex */
public abstract class kn implements Iterable, Serializable {
    public static final in b = new in(r21.a);
    public static final maggot c;
    public int a = 0;

    static {
        c = sb.b() ? new horsehair() : new irani();
    }

    public static kn a(Iterator it, int i) {
        if (i >= 1) {
            if (i == 1) {
                return (kn) it.next();
            }
            int i2 = i >>> 1;
            return a(it, i2).a(a(it, i - i2));
        }
        Locale locale = Locale.ROOT;
        throw new IllegalArgumentException("length (" + i + ") must be >= 1");
    }

    public static in b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        a(i, i + i2, bArr.length);
        return new in(c.a(bArr, i, i2));
    }

    public abstract int a();

    public abstract kn a(int i, int i2);

    public abstract void a(int i, int i2, int i3, byte[] bArr);

    public abstract void a(polder polderVar);

    public abstract byte b(int i);

    public abstract int b(int i, int i2, int i3);

    public abstract kn b(int i, int i2);

    public abstract boolean b();

    public abstract boolean b(kn knVar);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return r21.a;
        }
        byte[] bArr = new byte[size];
        a(0, 0, size, bArr);
        return bArr;
    }

    public final String d() {
        if (size() <= 50) {
            return pedagogism.attabal(this);
        }
        return pedagogism.attabal(b(0, 47)) + "...";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        int size = size();
        if (size != knVar.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int i = this.a;
        int i2 = knVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return b(knVar);
        }
        return false;
    }

    public final int hashCode() {
        int iB = this.a;
        if (iB == 0) {
            int size = size();
            iB = b(size, 0, size);
            if (iB == 0) {
                iB = 1;
            }
            this.a = iB;
        }
        return iB;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        return "<ByteString@" + Integer.toHexString(System.identityHashCode(this)) + " size=" + size() + " contents=\"" + d() + "\">";
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public final kn a(kn knVar) {
        if (Integer.MAX_VALUE - size() >= knVar.size()) {
            return wi2.a(this, knVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + knVar.size());
    }

    public static in a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static in a(byte[] bArr, int i, int i2) {
        try {
            return b(bArr, i, i2);
        } catch (x81 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static in a(String str) {
        return str.isEmpty() ? b : new in(str.getBytes(StandardCharsets.UTF_8));
    }

    public static kn a(FileInputStream fileInputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = fileInputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            in inVarA = i == 0 ? null : a(bArr, 0, i);
            if (inVarA == null) {
                break;
            }
            arrayList.add(inVarA);
            iMin = Math.min(iMin * 2, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return b;
        }
        return a(arrayList.iterator(), size);
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        a(i, i4, bArr.length);
        a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
