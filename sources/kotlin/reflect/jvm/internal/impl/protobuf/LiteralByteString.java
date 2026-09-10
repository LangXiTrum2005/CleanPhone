package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v4.media.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
class LiteralByteString extends ByteString {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final byte[] f44219Y;
    public int Z = 0;

    public class LiteralByteIterator implements ByteString.ByteIterator {
        public int X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f44220Y;

        public LiteralByteIterator() {
            this.f44220Y = LiteralByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X < this.f44220Y;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.f44219Y;
                int i2 = this.X;
                this.X = i2 + 1;
                return bArr[i2];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LiteralByteString(byte[] bArr) {
        this.f44219Y = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return y((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(a.r(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void f(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f44219Y, i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int g() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        int iP = this.Z;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.Z = iP;
        }
        return iP;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean i() {
        int iZ = z();
        return Utf8.c(this.f44219Y, iZ, size() + iZ) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ByteString.ByteIterator iterator() {
        return new LiteralByteIterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int p(int i2, int i3, int i4) {
        int iZ = z() + i3;
        for (int i5 = iZ; i5 < iZ + i4; i5++) {
            i2 = (i2 * 31) + this.f44219Y[i5];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r9[r0] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0097, code lost:
    
        if (r9[r8] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.z()
            int r0 = r0 + r9
            int r10 = r10 + r0
            byte[] r9 = r7.f44219Y
            if (r8 == 0) goto L9a
            if (r0 < r10) goto Ld
            return r8
        Ld:
            byte r1 = (byte) r8
            r2 = -1
            r3 = -65
            r4 = -32
            if (r1 >= r4) goto L24
            r8 = -62
            if (r1 < r8) goto L99
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r3) goto L21
            goto L99
        L21:
            r0 = r8
            goto L9a
        L24:
            r5 = -16
            if (r1 >= r5) goto L51
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L3c
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r8 < r10) goto L39
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.a(r1, r0)
            return r8
        L39:
            r6 = r0
            r0 = r8
            r8 = r6
        L3c:
            if (r8 > r3) goto L99
            r5 = -96
            if (r1 != r4) goto L44
            if (r8 < r5) goto L99
        L44:
            r4 = -19
            if (r1 != r4) goto L4a
            if (r8 >= r5) goto L99
        L4a:
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r3) goto L21
            goto L99
        L51:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L64
            int r8 = r0 + 1
            r4 = r9[r0]
            if (r8 < r10) goto L62
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.a(r1, r4)
            return r8
        L62:
            r0 = 0
            goto L6a
        L64:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r0
            r0 = r8
            r8 = r6
        L6a:
            if (r0 != 0) goto L86
            int r0 = r8 + 1
            r8 = r9[r8]
            if (r0 < r10) goto L83
            r9 = -12
            if (r1 > r9) goto L82
            if (r4 > r3) goto L82
            if (r8 <= r3) goto L7b
            goto L82
        L7b:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L82:
            return r2
        L83:
            r6 = r0
            r0 = r8
            r8 = r6
        L86:
            if (r4 > r3) goto L99
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L99
            if (r0 > r3) goto L99
            int r0 = r8 + 1
            r8 = r9[r8]
            if (r8 <= r3) goto L9a
        L99:
            return r2
        L9a:
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.c(r9, r0, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.s(int, int, int):int");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f44219Y.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int t() {
        return this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String u() {
        return new String(this.f44219Y, z(), size(), "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void w(OutputStream outputStream, int i2, int i3) throws IOException {
        outputStream.write(this.f44219Y, z() + i2, i3);
    }

    public byte x(int i2) {
        return this.f44219Y[i2];
    }

    public final boolean y(LiteralByteString literalByteString, int i2, int i3) {
        if (i3 > literalByteString.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 + i3 > literalByteString.size()) {
            int size2 = literalByteString.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(size2, ", ", sb2));
        }
        int iZ = z() + i3;
        int iZ2 = z();
        int iZ3 = literalByteString.z() + i2;
        while (iZ2 < iZ) {
            if (this.f44219Y[iZ2] != literalByteString.f44219Y[iZ3]) {
                return false;
            }
            iZ2++;
            iZ3++;
        }
        return true;
    }

    public int z() {
        return 0;
    }
}
