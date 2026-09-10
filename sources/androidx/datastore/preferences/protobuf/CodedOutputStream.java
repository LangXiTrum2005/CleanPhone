package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f4775b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4776c = UnsafeUtil.f4939e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CodedOutputStreamWriter f4777a;

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4778e;
        public int f;

        public AbstractBufferedEncoder(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.d = bArr;
            this.f4778e = bArr.length;
        }

        public final void J(byte b2) {
            int i2 = this.f;
            this.f = i2 + 1;
            this.d[i2] = b2;
        }

        public final void K(int i2) {
            int i3 = this.f;
            int i4 = i3 + 1;
            this.f = i4;
            byte[] bArr = this.d;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i3 + 2;
            this.f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i3 + 3;
            this.f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f = i3 + 4;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        }

        public final void L(long j) {
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            byte[] bArr = this.d;
            bArr[i2] = (byte) (j & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((j >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((j >> 16) & 255);
            int i6 = i2 + 4;
            this.f = i6;
            bArr[i5] = (byte) (255 & (j >> 24));
            int i7 = i2 + 5;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 32)) & 255);
            int i8 = i2 + 6;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 40)) & 255);
            int i9 = i2 + 7;
            this.f = i9;
            bArr[i8] = (byte) (((int) (j >> 48)) & 255);
            this.f = i2 + 8;
            bArr[i9] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void M(int i2, int i3) {
            N((i2 << 3) | i3);
        }

        public final void N(int i2) {
            boolean z2 = CodedOutputStream.f4776c;
            byte[] bArr = this.d;
            if (z2) {
                while ((i2 & (-128)) != 0) {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    UnsafeUtil.m(bArr, i3, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                int i4 = this.f;
                this.f = i4 + 1;
                UnsafeUtil.m(bArr, i4, (byte) i2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                int i5 = this.f;
                this.f = i5 + 1;
                bArr[i5] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            }
            int i6 = this.f;
            this.f = i6 + 1;
            bArr[i6] = (byte) i2;
        }

        public final void O(long j) {
            boolean z2 = CodedOutputStream.f4776c;
            byte[] bArr = this.d;
            if (z2) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    UnsafeUtil.m(bArr, i2, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                UnsafeUtil.m(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                bArr[i4] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
            int i5 = this.f;
            this.f = i5 + 1;
            bArr[i5] = (byte) j;
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {
        public final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4779e;
        public int f;

        public ArrayEncoder(byte[] bArr, int i2) {
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.f = 0;
            this.f4779e = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i2, MessageLite messageLite) throws OutOfSpaceException {
            G(i2, 2);
            C(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i2, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            G(i2, 2);
            H(((AbstractMessageLite) messageLite).e(schema));
            schema.d(messageLite, this.f4777a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(MessageLite messageLite) throws OutOfSpaceException {
            H(messageLite.getSerializedSize());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, MessageLite messageLite) throws OutOfSpaceException {
            G(1, 3);
            writeUInt32(2, i2);
            A(3, messageLite);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i2, ByteString byteString) throws OutOfSpaceException {
            G(1, 3);
            writeUInt32(2, i2);
            b(3, byteString);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(String str) throws OutOfSpaceException {
            int i2 = this.f;
            try {
                int iP = CodedOutputStream.p(str.length() * 3);
                int iP2 = CodedOutputStream.p(str.length());
                byte[] bArr = this.d;
                int i3 = this.f4779e;
                if (iP2 != iP) {
                    H(Utf8.d(str));
                    int i4 = this.f;
                    this.f = Utf8.f4942a.d(str, bArr, i4, i3 - i4);
                    return;
                }
                int i5 = i2 + iP2;
                this.f = i5;
                int iD = Utf8.f4942a.d(str, bArr, i5, i3 - i5);
                this.f = i2;
                H((iD - i2) - iP2);
                this.f = iD;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f = i2;
                t(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i2, int i3) throws OutOfSpaceException {
            H((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i2) throws OutOfSpaceException {
            while (true) {
                int i3 = i2 & (-128);
                byte[] bArr = this.d;
                if (i3 == 0) {
                    int i4 = this.f;
                    this.f = i4 + 1;
                    bArr[i4] = (byte) i2;
                    return;
                } else {
                    try {
                        int i5 = this.f;
                        this.f = i5 + 1;
                        bArr[i5] = (byte) ((i2 | 128) & 255);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), 1), e2);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) throws OutOfSpaceException {
            byte[] bArr = this.d;
            boolean z2 = CodedOutputStream.f4776c;
            int i2 = this.f4779e;
            if (z2 && i2 - this.f >= 10) {
                while ((j & (-128)) != 0) {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    UnsafeUtil.m(bArr, i3, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i4 = this.f;
                this.f = i4 + 1;
                UnsafeUtil.m(bArr, i4, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i5 = this.f;
                    this.f = i5 + 1;
                    bArr[i5] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i2), 1), e2);
                }
            }
            int i6 = this.f;
            this.f = i6 + 1;
            bArr[i6] = (byte) j;
        }

        public final void J(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i2, this.d, this.f, i3);
                this.f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), Integer.valueOf(i3)), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i2, ByteString byteString) throws OutOfSpaceException {
            G(i2, 2);
            w(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.d, this.f, iRemaining);
                this.f += iRemaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), Integer.valueOf(iRemaining)), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            J(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(byte b2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i2, byte[] bArr) throws OutOfSpaceException {
            H(i2);
            J(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(ByteString byteString) throws OutOfSpaceException {
            H(byteString.size());
            byteString.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) throws OutOfSpaceException {
            G(i2, 0);
            u(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 5);
            x(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j) throws OutOfSpaceException {
            G(i2, 1);
            y(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 0);
            z(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws OutOfSpaceException {
            G(i2, 2);
            F(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 0);
            H(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j) throws OutOfSpaceException {
            G(i2, 0);
            I(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i3 = this.f;
                int i4 = i3 + 1;
                this.f = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i3 + 2;
                this.f = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i3 + 3;
                this.f = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f = i3 + 4;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(long j) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) (((int) j) & 255);
                int i4 = i2 + 2;
                this.f = i4;
                bArr[i3] = (byte) (((int) (j >> 8)) & 255);
                int i5 = i2 + 3;
                this.f = i5;
                bArr[i4] = (byte) (((int) (j >> 16)) & 255);
                int i6 = i2 + 4;
                this.f = i6;
                bArr[i5] = (byte) (((int) (j >> 24)) & 255);
                int i7 = i2 + 5;
                this.f = i7;
                bArr[i6] = (byte) (((int) (j >> 32)) & 255);
                int i8 = i2 + 6;
                this.f = i8;
                bArr[i7] = (byte) (((int) (j >> 40)) & 255);
                int i9 = i2 + 7;
                this.f = i9;
                bArr[i8] = (byte) (((int) (j >> 48)) & 255);
                this.f = i2 + 8;
                bArr[i9] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.f4779e), 1), e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                H(i2);
            } else {
                I(i2);
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i2, MessageLite messageLite) {
            G(i2, 2);
            C(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i2, MessageLite messageLite, Schema schema) {
            G(i2, 2);
            H(((AbstractMessageLite) messageLite).e(schema));
            schema.d(messageLite, this.f4777a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(MessageLite messageLite) {
            H(messageLite.getSerializedSize());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, MessageLite messageLite) {
            G(1, 3);
            writeUInt32(2, i2);
            A(3, messageLite);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i2, ByteString byteString) {
            G(1, 3);
            writeUInt32(2, i2);
            b(3, byteString);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iP = CodedOutputStream.p(length);
            int i2 = iP + length;
            int i3 = this.f4778e;
            if (i2 > i3) {
                H(Utf8.f4942a.d(str, new byte[length], 0, length));
                if (this.f > 0) {
                    throw null;
                }
                throw null;
            }
            int i4 = this.f;
            if (i2 > i3 - i4) {
                throw null;
            }
            try {
                int iP2 = CodedOutputStream.p(str.length());
                byte[] bArr = this.d;
                if (iP2 != iP) {
                    int iD = Utf8.d(str);
                    N(iD);
                    this.f = Utf8.f4942a.d(str, bArr, this.f, iD);
                    return;
                }
                int i5 = i4 + iP2;
                this.f = i5;
                int iD2 = Utf8.f4942a.d(str, bArr, i5, i3 - i5);
                this.f = i4;
                N((iD2 - i4) - iP2);
                this.f = iD2;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f = i4;
                t(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i2, int i3) {
            H((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i2) {
            P(5);
            N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) {
            P(10);
            O(j);
        }

        public final void P(int i2) {
            if (this.f4778e - this.f < i2) {
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i2, ByteString byteString) {
            G(i2, 2);
            w(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            if (this.f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            if (this.f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(byte b2) {
            if (this.f == this.f4778e) {
                throw null;
            }
            J(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i2, byte[] bArr) {
            H(i2);
            if (this.f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(ByteString byteString) {
            H(byteString.size());
            byteString.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) {
            P(11);
            M(i2, 0);
            J(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) {
            P(14);
            M(i2, 5);
            K(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j) {
            P(18);
            M(i2, 1);
            L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) {
            P(20);
            M(i2, 0);
            if (i3 >= 0) {
                N(i3);
            } else {
                O(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws OutOfSpaceException {
            G(i2, 2);
            F(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) {
            P(20);
            M(i2, 0);
            N(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j) {
            P(20);
            M(i2, 0);
            O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2) {
            P(4);
            K(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(long j) {
            P(8);
            L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i2) {
            if (i2 >= 0) {
                H(i2);
            } else {
                I(i2);
            }
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        public final OutputStream g;

        public OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i2, MessageLite messageLite) throws IOException {
            G(i2, 2);
            C(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i2, MessageLite messageLite, Schema schema) throws IOException {
            G(i2, 2);
            H(((AbstractMessageLite) messageLite).e(schema));
            schema.d(messageLite, this.f4777a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(MessageLite messageLite) throws IOException {
            H(messageLite.getSerializedSize());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, MessageLite messageLite) throws IOException {
            G(1, 3);
            writeUInt32(2, i2);
            A(3, messageLite);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i2, ByteString byteString) throws IOException {
            G(1, 3);
            writeUInt32(2, i2);
            b(3, byteString);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iP = CodedOutputStream.p(length);
                int i2 = iP + length;
                int i3 = this.f4778e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iD = Utf8.f4942a.d(str, bArr, 0, length);
                    H(iD);
                    R(bArr, 0, iD);
                    return;
                }
                if (i2 > i3 - this.f) {
                    P();
                }
                int iP2 = CodedOutputStream.p(str.length());
                int i4 = this.f;
                byte[] bArr2 = this.d;
                try {
                    try {
                        if (iP2 == iP) {
                            int i5 = i4 + iP2;
                            this.f = i5;
                            int iD2 = Utf8.f4942a.d(str, bArr2, i5, i3 - i5);
                            this.f = i4;
                            N((iD2 - i4) - iP2);
                            this.f = iD2;
                        } else {
                            int iD3 = Utf8.d(str);
                            N(iD3);
                            this.f = Utf8.f4942a.d(str, bArr2, this.f, iD3);
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(e2);
                    }
                } catch (Utf8.UnpairedSurrogateException e3) {
                    this.f = i4;
                    throw e3;
                }
            } catch (Utf8.UnpairedSurrogateException e4) {
                t(str, e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i2, int i3) throws IOException {
            H((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i2) throws IOException {
            Q(5);
            N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) throws IOException {
            Q(10);
            O(j);
        }

        public final void P() throws IOException {
            this.g.write(this.d, 0, this.f);
            this.f = 0;
        }

        public final void Q(int i2) throws IOException {
            if (this.f4778e - this.f < i2) {
                P();
            }
        }

        public final void R(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f;
            int i5 = this.f4778e;
            int i6 = i5 - i4;
            byte[] bArr2 = this.d;
            if (i6 >= i3) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f += i3;
                return;
            }
            System.arraycopy(bArr, i2, bArr2, i4, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f = i5;
            P();
            if (i8 > i5) {
                this.g.write(bArr, i7, i8);
            } else {
                System.arraycopy(bArr, i7, bArr2, 0, i8);
                this.f = i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i2, ByteString byteString) throws IOException {
            G(i2, 2);
            w(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.f;
            int i3 = this.f4778e;
            int i4 = i3 - i2;
            byte[] bArr = this.d;
            if (i4 >= iRemaining) {
                byteBuffer.get(bArr, i2, iRemaining);
                this.f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i2, i4);
            int i5 = iRemaining - i4;
            this.f = i3;
            P();
            while (i5 > i3) {
                byteBuffer.get(bArr, 0, i3);
                this.g.write(bArr, 0, i3);
                i5 -= i3;
            }
            byteBuffer.get(bArr, 0, i5);
            this.f = i5;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) throws IOException {
            R(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(byte b2) throws IOException {
            if (this.f == this.f4778e) {
                P();
            }
            J(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i2, byte[] bArr) throws IOException {
            H(i2);
            R(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(ByteString byteString) throws IOException {
            H(byteString.size());
            byteString.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) throws IOException {
            Q(11);
            M(i2, 0);
            J(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws IOException {
            Q(14);
            M(i2, 5);
            K(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j) throws IOException {
            Q(18);
            M(i2, 1);
            L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws IOException {
            Q(20);
            M(i2, 0);
            if (i3 >= 0) {
                N(i3);
            } else {
                O(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws IOException {
            G(i2, 2);
            F(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws IOException {
            Q(20);
            M(i2, 0);
            N(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j) throws IOException {
            Q(20);
            M(i2, 0);
            O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2) throws IOException {
            Q(4);
            K(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(long j) throws IOException {
            Q(8);
            L(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i2) throws IOException {
            if (i2 >= 0) {
                H(i2);
            } else {
                I(i2);
            }
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i2, MessageLite messageLite) {
            G(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i2, MessageLite messageLite, Schema schema) {
            G(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(MessageLite messageLite) {
            H(messageLite.getSerializedSize());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, MessageLite messageLite) {
            G(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i2, ByteString byteString) {
            G(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(String str) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i2, int i3) {
            H((i2 << 3) | i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i2) {
            if ((i2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) {
            if ((j & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i2, ByteString byteString) {
            G(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(byte b2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i2, byte[] bArr) {
            H(i2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(ByteString byteString) {
            H(byteString.size());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) {
            G(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) {
            G(i2, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j) {
            G(i2, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) {
            G(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) {
            G(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) {
            G(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j) {
            G(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i2) {
            if (i2 >= 0) {
                H(i2);
                throw null;
            }
            I(i2);
            throw null;
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        public long d;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i2, MessageLite messageLite) throws OutOfSpaceException {
            G(i2, 2);
            C(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i2, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            G(i2, 2);
            H(((AbstractMessageLite) messageLite).e(schema));
            schema.d(messageLite, this.f4777a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(MessageLite messageLite) throws OutOfSpaceException {
            H(messageLite.getSerializedSize());
            messageLite.c(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, MessageLite messageLite) throws OutOfSpaceException {
            G(1, 3);
            writeUInt32(2, i2);
            A(3, messageLite);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i2, ByteString byteString) throws OutOfSpaceException {
            G(1, 3);
            writeUInt32(2, i2);
            b(3, byteString);
            G(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(String str) throws OutOfSpaceException {
            long j = this.d;
            try {
                if (CodedOutputStream.p(str.length()) == CodedOutputStream.p(str.length() * 3)) {
                    throw null;
                }
                H(Utf8.d(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.d = j;
                throw null;
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i2, int i3) throws OutOfSpaceException {
            H((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i2) throws OutOfSpaceException {
            if (this.d <= 0) {
                while ((i2 & (-128)) != 0) {
                    long j = this.d;
                    this.d = j + 1;
                    UnsafeUtil.l(j, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                long j2 = this.d;
                this.d = 1 + j2;
                UnsafeUtil.l(j2, (byte) i2);
                return;
            }
            while (true) {
                long j3 = this.d;
                if (j3 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.d = 1 + j3;
                    UnsafeUtil.l(j3, (byte) i2);
                    return;
                } else {
                    this.d = j3 + 1;
                    UnsafeUtil.l(j3, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) throws OutOfSpaceException {
            if (this.d <= 0) {
                while ((j & (-128)) != 0) {
                    long j2 = this.d;
                    this.d = j2 + 1;
                    UnsafeUtil.l(j2, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                long j3 = this.d;
                this.d = 1 + j3;
                UnsafeUtil.l(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.d;
                if (j4 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((j & (-128)) == 0) {
                    this.d = 1 + j4;
                    UnsafeUtil.l(j4, (byte) j);
                    return;
                } else {
                    this.d = j4 + 1;
                    UnsafeUtil.l(j4, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        }

        public final void J(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j = i3;
                long j2 = 0 - j;
                long j3 = this.d;
                if (j2 >= j3) {
                    UnsafeUtil.f4938c.d(bArr, i2, j3, j);
                    this.d += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, Integer.valueOf(i3)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i2, ByteString byteString) throws OutOfSpaceException {
            G(i2, 2);
            w(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            J(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(byte b2) throws OutOfSpaceException {
            long j = this.d;
            if (j >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
            }
            this.d = 1 + j;
            UnsafeUtil.l(j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i2, byte[] bArr) throws OutOfSpaceException {
            H(i2);
            J(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(ByteString byteString) throws OutOfSpaceException {
            H(byteString.size());
            byteString.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) throws OutOfSpaceException {
            G(i2, 0);
            u(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j) throws OutOfSpaceException {
            G(i2, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 0);
            z(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws OutOfSpaceException {
            G(i2, 2);
            F(str);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            G(i2, 0);
            H(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j) throws OutOfSpaceException {
            G(i2, 0);
            I(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                H(i2);
            } else {
                I(i2);
            }
        }
    }

    public static int i(int i2, ByteString byteString) {
        return j(byteString) + o(i2);
    }

    public static int j(ByteString byteString) {
        int size = byteString.size();
        return p(size) + size;
    }

    public static int k(LazyFieldLite lazyFieldLite) {
        int serializedSize;
        if (lazyFieldLite.f4866b != null) {
            serializedSize = lazyFieldLite.f4866b.size();
        } else {
            serializedSize = lazyFieldLite.f4865a != null ? lazyFieldLite.f4865a.getSerializedSize() : 0;
        }
        return p(serializedSize) + serializedSize;
    }

    public static int l(int i2) {
        return p(r(i2));
    }

    public static int m(long j) {
        return q(s(j));
    }

    public static int n(String str) {
        int length;
        try {
            length = Utf8.d(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f4857a).length;
        }
        return p(length) + length;
    }

    public static int o(int i2) {
        return p(i2 << 3);
    }

    public static int p(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int q(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int r(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long s(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public abstract void A(int i2, MessageLite messageLite);

    public abstract void B(int i2, MessageLite messageLite, Schema schema);

    public abstract void C(MessageLite messageLite);

    public abstract void D(int i2, MessageLite messageLite);

    public abstract void E(int i2, ByteString byteString);

    public abstract void F(String str);

    public abstract void G(int i2, int i3);

    public abstract void H(int i2);

    public abstract void I(long j);

    public abstract void b(int i2, ByteString byteString);

    public final void t(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        f4775b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f4857a);
        try {
            H(bytes.length);
            h(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void u(byte b2);

    public abstract void v(int i2, byte[] bArr);

    public abstract void w(ByteString byteString);

    public abstract void writeBool(int i2, boolean z2);

    public abstract void writeFixed32(int i2, int i3);

    public abstract void writeFixed64(int i2, long j);

    public abstract void writeInt32(int i2, int i3);

    public abstract void writeString(int i2, String str);

    public abstract void writeUInt32(int i2, int i3);

    public abstract void writeUInt64(int i2, long j);

    public abstract void x(int i2);

    public abstract void y(long j);

    public abstract void z(int i2);
}
