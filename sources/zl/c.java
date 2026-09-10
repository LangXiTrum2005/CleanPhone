package zl;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f55019f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55022c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55024e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55020a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f55021b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55023d = new byte[128];

    public final void a(int i10) {
        this.f55021b.add(new t(this.f55023d));
        int length = this.f55022c + this.f55023d.length;
        this.f55022c = length;
        this.f55023d = new byte[Math.max(this.f55020a, Math.max(i10, length >>> 1))];
        this.f55024e = 0;
    }

    public final void d() {
        int i10 = this.f55024e;
        byte[] bArr = this.f55023d;
        int length = bArr.length;
        ArrayList arrayList = this.f55021b;
        if (i10 >= length) {
            arrayList.add(new t(this.f55023d));
            this.f55023d = f55019f;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            arrayList.add(new t(bArr2));
        }
        this.f55022c += this.f55024e;
        this.f55024e = 0;
    }

    public final synchronized d h() {
        ArrayList arrayList;
        d();
        arrayList = this.f55021b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((d) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? d.f55026a : d.b(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i10;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f55022c + this.f55024e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i10));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f55024e == this.f55023d.length) {
                a(1);
            }
            byte[] bArr = this.f55023d;
            int i11 = this.f55024e;
            this.f55024e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f55023d;
            int length = bArr2.length;
            int i12 = this.f55024e;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f55024e += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                a(i13);
                System.arraycopy(bArr, i10 + length2, this.f55023d, 0, i13);
                this.f55024e = i13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
