package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
class RopeByteString extends ByteString {
    public static final int[] i0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f44221Y;
    public final ByteString Z;
    public final ByteString e0;
    public final int f0;
    public final int g0;
    public int h0 = 0;

    public static class Balancer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack f44222a = new Stack();

        public final void a(ByteString byteString) {
            if (!byteString.h()) {
                if (!(byteString instanceof RopeByteString)) {
                    String strValueOf = String.valueOf(byteString.getClass());
                    throw new IllegalArgumentException(a.r(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                a(ropeByteString.Z);
                a(ropeByteString.e0);
                return;
            }
            int size = byteString.size();
            int[] iArr = RopeByteString.i0;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i2 = iArr[iBinarySearch + 1];
            Stack stack = this.f44222a;
            if (stack.isEmpty() || ((ByteString) stack.peek()).size() >= i2) {
                stack.push(byteString);
                return;
            }
            int i3 = iArr[iBinarySearch];
            ByteString ropeByteString2 = (ByteString) stack.pop();
            while (!stack.isEmpty() && ((ByteString) stack.peek()).size() < i3) {
                ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
            }
            RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString);
            while (!stack.isEmpty()) {
                int[] iArr2 = RopeByteString.i0;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, ropeByteString3.f44221Y);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (((ByteString) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    ropeByteString3 = new RopeByteString((ByteString) stack.pop(), ropeByteString3);
                }
            }
            stack.push(ropeByteString3);
        }
    }

    public static class PieceIterator implements Iterator<LiteralByteString> {
        public final Stack X = new Stack();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public LiteralByteString f44223Y;

        public PieceIterator(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.X.push(ropeByteString);
                byteString = ropeByteString.Z;
            }
            this.f44223Y = (LiteralByteString) byteString;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiteralByteString next() {
            LiteralByteString literalByteString;
            LiteralByteString literalByteString2 = this.f44223Y;
            if (literalByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                Stack stack = this.X;
                if (stack.isEmpty()) {
                    literalByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) stack.pop()).e0;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    stack.push(ropeByteString);
                    byteString = ropeByteString.Z;
                }
                literalByteString = (LiteralByteString) byteString;
            } while (literalByteString.size() == 0);
            this.f44223Y = literalByteString;
            return literalByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f44223Y != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class RopeByteIterator implements ByteString.ByteIterator {
        public final PieceIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ByteString.ByteIterator f44224Y;
        public int Z;

        public RopeByteIterator(RopeByteString ropeByteString) {
            PieceIterator pieceIterator = new PieceIterator(ropeByteString);
            this.X = pieceIterator;
            this.f44224Y = pieceIterator.next().iterator();
            this.Z = ropeByteString.f44221Y;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Z > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            if (!this.f44224Y.hasNext()) {
                this.f44224Y = this.X.next().iterator();
            }
            this.Z--;
            return this.f44224Y.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        i0 = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = i0;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            i5++;
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.Z = byteString;
        this.e0 = byteString2;
        int size = byteString.size();
        this.f0 = size;
        this.f44221Y = byteString2.size() + size;
        this.g0 = Math.max(byteString.g(), byteString2.g()) + 1;
    }

    public final boolean equals(Object obj) {
        int iT;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i2 = this.f44221Y;
            if (i2 == size) {
                if (i2 == 0) {
                    return true;
                }
                if (this.h0 == 0 || (iT = byteString.t()) == 0 || this.h0 == iT) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    LiteralByteString next = pieceIterator.next();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    LiteralByteString next2 = pieceIterator2.next();
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int size2 = next.size() - i3;
                        int size3 = next2.size() - i4;
                        int iMin = Math.min(size2, size3);
                        if (!(i3 == 0 ? next.y(next2, i4, iMin) : next2.y(next, i3, iMin))) {
                            break;
                        }
                        i5 += iMin;
                        if (i5 >= i2) {
                            if (i5 == i2) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            next = pieceIterator.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                        if (iMin == size3) {
                            next2 = pieceIterator2.next();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void f(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        ByteString byteString = this.Z;
        int i6 = this.f0;
        if (i5 <= i6) {
            byteString.f(bArr, i2, i3, i4);
            return;
        }
        ByteString byteString2 = this.e0;
        if (i2 >= i6) {
            byteString2.f(bArr, i2 - i6, i3, i4);
            return;
        }
        int i7 = i6 - i2;
        byteString.f(bArr, i2, i3, i7);
        byteString2.f(bArr, 0, i3 + i7, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int g() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean h() {
        return this.f44221Y >= i0[this.g0];
    }

    public final int hashCode() {
        int iP = this.h0;
        if (iP == 0) {
            int i2 = this.f44221Y;
            iP = p(i2, 0, i2);
            if (iP == 0) {
                iP = 1;
            }
            this.h0 = iP;
        }
        return iP;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean i() {
        int iS = this.Z.s(0, 0, this.f0);
        ByteString byteString = this.e0;
        return byteString.s(iS, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public final ByteString.ByteIterator iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int p(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.Z;
        int i6 = this.f0;
        if (i5 <= i6) {
            return byteString.p(i2, i3, i4);
        }
        ByteString byteString2 = this.e0;
        if (i3 >= i6) {
            return byteString2.p(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.p(byteString.p(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int s(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.Z;
        int i6 = this.f0;
        if (i5 <= i6) {
            return byteString.s(i2, i3, i4);
        }
        ByteString byteString2 = this.e0;
        if (i3 >= i6) {
            return byteString2.s(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.s(byteString.s(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.f44221Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int t() {
        return this.h0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String u() {
        byte[] bArr;
        int i2 = this.f44221Y;
        if (i2 == 0) {
            bArr = Internal.f44216a;
        } else {
            byte[] bArr2 = new byte[i2];
            f(bArr2, 0, 0, i2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void w(OutputStream outputStream, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.Z;
        int i5 = this.f0;
        if (i4 <= i5) {
            byteString.w(outputStream, i2, i3);
            return;
        }
        ByteString byteString2 = this.e0;
        if (i2 >= i5) {
            byteString2.w(outputStream, i2 - i5, i3);
            return;
        }
        int i6 = i5 - i2;
        byteString.w(outputStream, i2, i6);
        byteString2.w(outputStream, 0, i3 - i6);
    }

    public class RopeInputStream extends InputStream {
        public PieceIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public LiteralByteString f44225Y;
        public int Z;
        public int e0;
        public int f0;
        public int g0;

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final void d() {
            if (this.f44225Y != null) {
                int i2 = this.e0;
                int i3 = this.Z;
                if (i2 == i3) {
                    this.f0 += i3;
                    this.e0 = 0;
                    if (!this.X.hasNext()) {
                        this.f44225Y = null;
                        this.Z = 0;
                    } else {
                        LiteralByteString next = this.X.next();
                        this.f44225Y = next;
                        this.Z = next.size();
                    }
                }
            }
        }

        public final int h(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (i4 > 0) {
                d();
                if (this.f44225Y == null) {
                    if (i4 != i3) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.Z - this.e0, i4);
                if (bArr != null) {
                    this.f44225Y.e(bArr, this.e0, i2, iMin);
                    i2 += iMin;
                }
                this.e0 += iMin;
                i4 -= iMin;
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            this.g0 = this.f0 + this.e0;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            return h(bArr, i2, i3);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.X = pieceIterator;
            LiteralByteString next = pieceIterator.next();
            this.f44225Y = next;
            this.Z = next.size();
            this.e0 = 0;
            this.f0 = 0;
            h(null, 0, this.g0);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return h(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public final int read() {
            d();
            LiteralByteString literalByteString = this.f44225Y;
            if (literalByteString == null) {
                return -1;
            }
            int i2 = this.e0;
            this.e0 = i2 + 1;
            return literalByteString.x(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
    }
}
