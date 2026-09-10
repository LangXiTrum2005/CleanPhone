package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4104b = new i(e0.f4068b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f4105c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4106a;

    static {
        f4105c = c.a() ? new f(1) : new f(0);
    }

    public static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(defpackage.e.h(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(defpackage.e.g(i11, i12, "End index: ", " >= "));
    }

    public static i m(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        h(i10, i10 + i11, bArr.length);
        switch (f4105c.f4072a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new i(bArrCopyOfRange);
    }

    public abstract byte b(int i10);

    public final int hashCode() {
        int i10 = this.f4106a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        i iVar = (i) this;
        int iQ = iVar.q();
        int i11 = size;
        for (int i12 = iQ; i12 < iQ + size; i12++) {
            i11 = (i11 * 31) + iVar.f4101d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f4106a = i11;
        return i11;
    }

    public abstract void n(int i10, byte[] bArr);

    public abstract byte p(int i10);

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = no.b.u(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            i iVar = (i) this;
            int iH = h(0, 47, iVar.size());
            sb2.append(no.b.u(iH == 0 ? f4104b : new g(iVar.f4101d, iVar.q(), iH)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return defpackage.e.q(string, "\">", sb3);
    }
}
