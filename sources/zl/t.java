package zl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f55079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55080c = 0;

    public t(byte[] bArr) {
        this.f55079b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof t) {
            return z((t) obj, 0, size());
        }
        if (obj instanceof w) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(defpackage.e.q("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
    }

    public final int hashCode() {
        int iT = this.f55080c;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f55080c = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    @Override // zl.d
    public void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f55079b, i10, bArr, i11, i12);
    }

    @Override // zl.d
    public final int p() {
        return 0;
    }

    @Override // zl.d
    public final boolean q() {
        return true;
    }

    @Override // zl.d
    public final boolean r() {
        byte[] bArr = this.f55079b;
        return a0.c(bArr, 0, bArr.length) == 0;
    }

    @Override // zl.d
    public int size() {
        return this.f55079b.length;
    }

    @Override // zl.d
    public final int t(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f55079b[i13];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // zl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u(int r7, int r8, int r9) {
        /*
            r6 = this;
            int r9 = r9 + r8
            byte[] r6 = r6.f55079b
            if (r7 == 0) goto L95
            if (r8 < r9) goto L8
            return r7
        L8:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1f
            r7 = -62
            if (r0 < r7) goto L94
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L1c:
            r8 = r7
            goto L95
        L1f:
            r4 = -16
            if (r0 >= r4) goto L4c
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L37
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r7 < r9) goto L34
            int r6 = zl.a0.a(r0, r8)
            return r6
        L34:
            r5 = r8
            r8 = r7
            r7 = r5
        L37:
            if (r7 > r3) goto L94
            r4 = -96
            if (r0 != r1) goto L3f
            if (r7 < r4) goto L94
        L3f:
            r1 = -19
            if (r0 != r1) goto L45
            if (r7 >= r4) goto L94
        L45:
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L4c:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5f
            int r7 = r8 + 1
            r1 = r6[r8]
            if (r7 < r9) goto L5d
            int r6 = zl.a0.a(r0, r1)
            return r6
        L5d:
            r8 = 0
            goto L65
        L5f:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            if (r8 != 0) goto L81
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r8 < r9) goto L7e
            r6 = -12
            if (r0 > r6) goto L7d
            if (r1 > r3) goto L7d
            if (r7 <= r3) goto L76
            goto L7d
        L76:
            int r6 = r1 << 8
            r6 = r6 ^ r0
            int r7 = r7 << 16
            r6 = r6 ^ r7
            return r6
        L7d:
            return r2
        L7e:
            r5 = r8
            r8 = r7
            r7 = r5
        L81:
            if (r1 > r3) goto L94
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L94
            if (r8 > r3) goto L94
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r3) goto L95
        L94:
            return r2
        L95:
            int r6 = zl.a0.c(r6, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zl.t.u(int, int, int):int");
    }

    @Override // zl.d
    public final int v() {
        return this.f55080c;
    }

    @Override // zl.d
    public final String w() {
        byte[] bArr = this.f55079b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // zl.d
    public final void y(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f55079b, i10, i11);
    }

    public final boolean z(t tVar, int i10, int i11) {
        byte[] bArr = tVar.f55079b;
        int length = bArr.length;
        byte[] bArr2 = this.f55079b;
        if (i11 > length) {
            int length2 = bArr2.length;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 <= bArr.length) {
            int i12 = 0;
            while (i12 < i11) {
                if (bArr2[i12] != bArr[i10]) {
                    return false;
                }
                i12++;
                i10++;
            }
            return true;
        }
        int length3 = tVar.f55079b.length;
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new IllegalArgumentException(l1.d.k(sb3, ", ", length3));
    }
}
