package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ByteString f4747Y = new LiteralByteString(Internal.f4858b);
    public static final ByteArrayCopier Z;
    private static final long serialVersionUID = 1;
    public int X = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractByteIterator {
        public int X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f4748Y;

        public AnonymousClass1() {
            this.f4748Y = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X < this.f4748Y;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i2 = this.X;
            if (i2 >= this.f4748Y) {
                throw new NoSuchElementException();
            }
            this.X = i2 + 1;
            return ByteString.this.o(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$2, reason: invalid class name */
    public class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(it.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(it2.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString3.size()).compareTo(Integer.valueOf(byteString4.size()));
        }
    }

    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        public final int f0;
        public final int g0;

        public BoundedByteString(byte[] bArr, int i2, int i3) {
            super(bArr);
            ByteString.g(i2, i2 + i3, bArr.length);
            this.f0 = i2;
            this.g0 = i3;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int C() {
            return this.f0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte e(int i2) {
            ByteString.f(i2, this.g0);
            return this.e0[this.f0 + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void i(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.e0, this.f0 + i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte o(int i2) {
            return this.e0[this.f0 + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.g0;
        }

        public Object writeReplace() {
            return new LiteralByteString(x());
        }
    }

    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i2, int i3);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class CodedBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f4749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f4750b;

        public CodedBuilder(int i2) {
            byte[] bArr = new byte[i2];
            this.f4750b = bArr;
            Logger logger = CodedOutputStream.f4775b;
            this.f4749a = new CodedOutputStream.ArrayEncoder(bArr, i2);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void A(ByteOutput byteOutput) {
            z(byteOutput);
        }

        public abstract boolean B(ByteString byteString, int i2, int i3);

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int l() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte o(int i2) {
            return e(i2);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] e0;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.e0 = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean B(ByteString byteString, int i2, int i3) {
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
            int i4 = i2 + i3;
            if (i4 > byteString.size()) {
                StringBuilder sbP = a.p(i2, i3, "Ran off end of other: ", ", ", ", ");
                sbP.append(byteString.size());
                throw new IllegalArgumentException(sbP.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.w(i2, i4).equals(w(0, i3));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            int iC = C() + i3;
            int iC2 = C();
            int iC3 = literalByteString.C() + i2;
            while (iC2 < iC) {
                if (this.e0[iC2] != literalByteString.e0[iC3]) {
                    return false;
                }
                iC2++;
                iC3++;
            }
            return true;
        }

        public int C() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer d() {
            return ByteBuffer.wrap(this.e0, C(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte e(int i2) {
            return this.e0[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i2 = this.X;
            int i3 = literalByteString.X;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                return B(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void i(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.e0, i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte o(int i2) {
            return this.e0[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean p() {
            int iC = C();
            return Utf8.f4942a.e(this.e0, iC, size() + iC);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.e0.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream t() {
            return CodedInputStream.g(this.e0, C(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int u(int i2, int i3, int i4) {
            int iC = C() + i3;
            Charset charset = Internal.f4857a;
            for (int i5 = iC; i5 < iC + i4; i5++) {
                i2 = (i2 * 31) + this.e0[i5];
            }
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int v(int i2, int i3, int i4) {
            int iC = C() + i3;
            return Utf8.f4942a.g(i2, this.e0, iC, i4 + iC);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString w(int i2, int i3) {
            int iG = ByteString.g(i2, i3, size());
            if (iG == 0) {
                return ByteString.f4747Y;
            }
            return new BoundedByteString(this.e0, C() + i2, iG);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String y(Charset charset) {
            return new String(this.e0, C(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void z(ByteOutput byteOutput) {
            byteOutput.h(this.e0, C(), size());
        }
    }

    public static final class NioByteString extends LeafByteString {
        public final ByteBuffer e0;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$NioByteString$1, reason: invalid class name */
        class AnonymousClass1 extends InputStream {
            @Override // java.io.InputStream
            public final int available() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void mark(int i2) {
                throw null;
            }

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void reset() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                throw null;
            }
        }

        public NioByteString(ByteBuffer byteBuffer) {
            Charset charset = Internal.f4857a;
            this.e0 = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            ByteBuffer byteBufferSlice = this.e0.slice();
            int iRemaining = byteBufferSlice.remaining();
            ByteString.g(0, iRemaining, byteBufferSlice.remaining());
            byte[] bArr = new byte[iRemaining];
            byteBufferSlice.get(bArr);
            return new LiteralByteString(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean B(ByteString byteString, int i2, int i3) {
            return w(0, i3).equals(byteString.w(i2, i3 + i2));
        }

        public final ByteBuffer C(int i2, int i3) {
            ByteBuffer byteBuffer = this.e0;
            if (i2 < byteBuffer.position() || i3 > byteBuffer.limit() || i2 > i3) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.position(i2 - byteBuffer.position());
            byteBufferSlice.limit(i3 - byteBuffer.position());
            return byteBufferSlice;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer d() {
            return this.e0.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final byte e(int i2) {
            try {
                return this.e0.get(i2);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new ArrayIndexOutOfBoundsException(e3.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            ByteBuffer byteBuffer = this.e0;
            if (byteBuffer.remaining() != byteString.size()) {
                return false;
            }
            if (byteBuffer.remaining() == 0) {
                return true;
            }
            if (obj instanceof NioByteString) {
                return byteBuffer.equals(((NioByteString) obj).e0);
            }
            return obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.d());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void i(byte[] bArr, int i2, int i3, int i4) {
            ByteBuffer byteBufferSlice = this.e0.slice();
            byteBufferSlice.position(i2);
            byteBufferSlice.get(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean p() {
            Utf8.Processor processor = Utf8.f4942a;
            ByteBuffer byteBuffer = this.e0;
            return Utf8.f4942a.f(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.e0.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream t() {
            ByteBuffer byteBuffer = this.e0;
            if (byteBuffer.hasArray()) {
                return CodedInputStream.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
            }
            if (byteBuffer.isDirect() && UnsafeUtil.d) {
                return new CodedInputStream.UnsafeDirectNioDecoder(byteBuffer);
            }
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            return CodedInputStream.g(bArr, 0, iRemaining, true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int u(int i2, int i3, int i4) {
            for (int i5 = i3; i5 < i3 + i4; i5++) {
                i2 = (i2 * 31) + this.e0.get(i5);
            }
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int v(int i2, int i3, int i4) {
            return Utf8.f4942a.f(i2, this.e0, i3, i4 + i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString w(int i2, int i3) {
            try {
                return new NioByteString(C(i2, i3));
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new ArrayIndexOutOfBoundsException(e3.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String y(Charset charset) {
            byte[] bArrX;
            int length;
            int iPosition;
            ByteBuffer byteBuffer = this.e0;
            if (byteBuffer.hasArray()) {
                bArrX = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                length = byteBuffer.remaining();
            } else {
                bArrX = x();
                length = bArrX.length;
                iPosition = 0;
            }
            return new String(bArrX, iPosition, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void z(ByteOutput byteOutput) {
            byteOutput.g(this.e0.slice());
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    static {
        Z = Android.a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
    }

    public static void f(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.g(i2, i3, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.h(i2, "Index < 0: "));
        }
    }

    public static int g(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.k("Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i2, i3, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i3, i4, "End index: ", " >= "));
    }

    public static ByteString h(int i2, int i3, byte[] bArr) {
        g(i2, i2 + i3, bArr.length);
        return new LiteralByteString(Z.copyFrom(bArr, i2, i3));
    }

    public abstract void A(ByteOutput byteOutput);

    public abstract ByteBuffer d();

    public abstract byte e(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iU = this.X;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.X = iU;
        }
        return iU;
    }

    public abstract void i(byte[] bArr, int i2, int i3, int i4);

    public abstract int l();

    public abstract byte o(int i2);

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract int size();

    public abstract CodedInputStream t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        return android.support.v4.media.a.r(android.support.v4.media.a.z("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", size(), " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : android.support.v4.media.a.r(new StringBuilder(), TextFormatEscaper.a(w(0, 47)), "..."), "\">");
    }

    public abstract int u(int i2, int i3, int i4);

    public abstract int v(int i2, int i3, int i4);

    public abstract ByteString w(int i2, int i3);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return Internal.f4858b;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String y(Charset charset);

    public abstract void z(ByteOutput byteOutput);

    public static final class Output extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }
}
