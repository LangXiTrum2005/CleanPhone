package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;
    public final int e0;
    public final ByteString f0;
    public final ByteString g0;
    public final int h0;
    public final int i0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.RopeByteString$1, reason: invalid class name */
    class AnonymousClass1 extends ByteString.AbstractByteIterator {
        public final PieceIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ByteString.ByteIterator f4911Y = a();

        public AnonymousClass1(RopeByteString ropeByteString) {
            this.X = new PieceIterator(ropeByteString);
        }

        public final ByteString.ByteIterator a() {
            PieceIterator pieceIterator = this.X;
            if (pieceIterator.hasNext()) {
                return new ByteString.AnonymousClass1();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4911Y != null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f4911Y;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f4911Y.hasNext()) {
                this.f4911Y = a();
            }
            return bNextByte;
        }
    }

    public static class Balancer {
    }

    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        public final ArrayDeque X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ByteString.LeafByteString f4912Y;

        public PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.X = null;
                this.f4912Y = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.i0);
            this.X = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.f0;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.X.push(ropeByteString2);
                byteString2 = ropeByteString2.f0;
            }
            this.f4912Y = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f4912Y;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque arrayDeque = this.X;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) arrayDeque.pop()).g0;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.f0;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.size() == 0);
            this.f4912Y = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4912Y != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f0 = byteString;
        this.g0 = byteString2;
        int size = byteString.size();
        this.h0 = size;
        this.e0 = byteString2.size() + size;
        this.i0 = Math.max(byteString.l(), byteString2.l()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void A(ByteOutput byteOutput) {
        this.g0.A(byteOutput);
        this.f0.A(byteOutput);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer d() {
        return ByteBuffer.wrap(x()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte e(int i2) {
        ByteString.f(i2, this.e0);
        return o(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        ByteString.LeafByteString next;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i2 = this.e0;
            if (i2 == size) {
                if (i2 == 0) {
                    return true;
                }
                int i3 = this.X;
                int i4 = byteString.X;
                if (i3 == 0 || i4 == 0 || i3 == i4) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    ByteString.LeafByteString next2 = pieceIterator.next();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    ByteString.LeafByteString next3 = pieceIterator2.next();
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        int size2 = next2.size() - i5;
                        int size3 = next3.size() - i6;
                        int iMin = Math.min(size2, size3);
                        if (!(i5 == 0 ? next2.B(next3, i6, iMin) : next3.B(next2, i5, iMin))) {
                            break;
                        }
                        i7 += iMin;
                        if (i7 >= i2) {
                            if (i7 == i2) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            next = pieceIterator.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                        if (iMin == size3) {
                            next2 = next2;
                            next2 = next;
                            next3 = pieceIterator2.next();
                            i6 = 0;
                        } else {
                            next2 = next2;
                            next2 = next;
                            i6 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void i(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        ByteString byteString = this.f0;
        int i6 = this.h0;
        if (i5 <= i6) {
            byteString.i(bArr, i2, i3, i4);
            return;
        }
        ByteString byteString2 = this.g0;
        if (i2 >= i6) {
            byteString2.i(bArr, i2 - i6, i3, i4);
            return;
        }
        int i7 = i6 - i2;
        byteString.i(bArr, i2, i3, i7);
        byteString2.i(bArr, 0, i3 + i7, i4 - i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int l() {
        return this.i0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte o(int i2) {
        int i3 = this.h0;
        return i2 < i3 ? this.f0.o(i2) : this.g0.o(i2 - i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean p() {
        int iV = this.f0.v(0, 0, this.h0);
        ByteString byteString = this.g0;
        return byteString.v(iV, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: s */
    public final ByteString.ByteIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.e0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final CodedInputStream t() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().d());
        }
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        if (i2 == 2) {
            return new CodedInputStream.IterableDirectByteBufferDecoder(iRemaining, arrayList);
        }
        IterableByteBufferInputStream iterableByteBufferInputStream = new IterableByteBufferInputStream();
        iterableByteBufferInputStream.X = arrayList.iterator();
        iterableByteBufferInputStream.Z = 0;
        for (ByteBuffer byteBuffer2 : arrayList) {
            iterableByteBufferInputStream.Z++;
        }
        iterableByteBufferInputStream.e0 = -1;
        if (!iterableByteBufferInputStream.d()) {
            iterableByteBufferInputStream.f4860Y = Internal.f4859c;
            iterableByteBufferInputStream.e0 = 0;
            iterableByteBufferInputStream.f0 = 0;
            iterableByteBufferInputStream.j0 = 0L;
        }
        return CodedInputStream.f(iterableByteBufferInputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int u(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.f0;
        int i6 = this.h0;
        if (i5 <= i6) {
            return byteString.u(i2, i3, i4);
        }
        ByteString byteString2 = this.g0;
        if (i3 >= i6) {
            return byteString2.u(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.u(byteString.u(i2, i3, i7), 0, i4 - i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int v(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.f0;
        int i6 = this.h0;
        if (i5 <= i6) {
            return byteString.v(i2, i3, i4);
        }
        ByteString byteString2 = this.g0;
        if (i3 >= i6) {
            return byteString2.v(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.v(byteString.v(i2, i3, i7), 0, i4 - i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString w(int i2, int i3) {
        int i4 = this.e0;
        int iG = ByteString.g(i2, i3, i4);
        if (iG == 0) {
            return ByteString.f4747Y;
        }
        if (iG == i4) {
            return this;
        }
        ByteString byteString = this.f0;
        int i5 = this.h0;
        if (i3 <= i5) {
            return byteString.w(i2, i3);
        }
        ByteString byteString2 = this.g0;
        return i2 >= i5 ? byteString2.w(i2 - i5, i3 - i5) : new RopeByteString(byteString.w(i2, byteString.size()), byteString2.w(0, i3 - i5));
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(x());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final String y(Charset charset) {
        return new String(x(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void z(ByteOutput byteOutput) {
        this.f0.z(byteOutput);
        this.g0.z(byteOutput);
    }

    public class RopeInputStream extends InputStream {
        public PieceIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ByteString.LeafByteString f4913Y;
        public int Z;
        public int e0;
        public int f0;
        public int g0;

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final void d() {
            if (this.f4913Y != null) {
                int i2 = this.e0;
                int i3 = this.Z;
                if (i2 == i3) {
                    this.f0 += i3;
                    this.e0 = 0;
                    if (!this.X.hasNext()) {
                        this.f4913Y = null;
                        this.Z = 0;
                    } else {
                        ByteString.LeafByteString next = this.X.next();
                        this.f4913Y = next;
                        this.Z = next.size();
                    }
                }
            }
        }

        public final int h(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (i4 > 0) {
                d();
                if (this.f4913Y == null) {
                    break;
                }
                int iMin = Math.min(this.Z - this.e0, i4);
                if (bArr != null) {
                    ByteString.LeafByteString leafByteString = this.f4913Y;
                    int i5 = this.e0;
                    ByteString.g(i5, i5 + iMin, leafByteString.size());
                    ByteString.g(i2, i2 + iMin, bArr.length);
                    if (iMin > 0) {
                        leafByteString.i(bArr, i5, i2, iMin);
                    }
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
            int iH = h(bArr, i2, i3);
            if (iH != 0) {
                return iH;
            }
            if (i3 > 0) {
                return -1;
            }
            throw null;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.X = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.f4913Y = next;
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
            ByteString.LeafByteString leafByteString = this.f4913Y;
            if (leafByteString == null) {
                return -1;
            }
            int i2 = this.e0;
            this.e0 = i2 + 1;
            return leafByteString.e(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
    }
}
