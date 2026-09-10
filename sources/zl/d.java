package zl;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f55026a = new t(new byte[0]);

    public static d b(Iterator it, int i10) {
        if (i10 == 1) {
            return (d) it.next();
        }
        int i11 = i10 >>> 1;
        return b(it, i11).h(b(it, i10 - i11));
    }

    public static c s() {
        return new c();
    }

    public final d h(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = w.f55081h;
        w wVar = this instanceof w ? (w) this : null;
        if (dVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return dVar;
        }
        int size3 = dVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = dVar.size();
            byte[] bArr = new byte[size4 + size5];
            m(bArr, 0, 0, size4);
            dVar.m(bArr, 0, size4, size5);
            return new t(bArr);
        }
        if (wVar != null) {
            d dVar2 = wVar.f55084d;
            if (dVar.size() + dVar2.size() < 128) {
                int size6 = dVar2.size();
                int size7 = dVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                dVar2.m(bArr2, 0, 0, size6);
                dVar.m(bArr2, 0, size6, size7);
                return new w(wVar.f55083c, new t(bArr2));
            }
        }
        if (wVar != null) {
            d dVar3 = wVar.f55084d;
            d dVar4 = wVar.f55083c;
            if (dVar4.p() > dVar3.p() && wVar.f55086f > dVar.p()) {
                return new w(dVar4, new w(dVar3, dVar));
            }
        }
        if (size3 >= w.f55081h[Math.max(p(), dVar.p()) + 1]) {
            return new w(this, dVar);
        }
        xh.e eVar = new xh.e();
        eVar.a(this);
        eVar.a(dVar);
        Stack stack = (Stack) eVar.f53807a;
        d wVar2 = (d) stack.pop();
        while (!stack.isEmpty()) {
            wVar2 = new w((d) stack.pop(), wVar2);
        }
        return wVar2;
    }

    public final void m(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                n(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    public abstract int p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract int size();

    public abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u(int i10, int i11, int i12);

    public abstract int v();

    public abstract String w();

    public final String x() {
        try {
            return w();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public abstract void y(OutputStream outputStream, int i10, int i11);
}
