package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4739a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4740a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4740a = iArr;
            try {
                iArr[WireFormat.FieldType.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4740a[WireFormat.FieldType.j0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4740a[WireFormat.FieldType.i0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4740a[WireFormat.FieldType.h0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4740a[WireFormat.FieldType.f0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4740a[WireFormat.FieldType.r0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4740a[WireFormat.FieldType.s0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4740a[WireFormat.FieldType.t0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4740a[WireFormat.FieldType.u0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4740a[WireFormat.FieldType.l0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4740a[WireFormat.FieldType.p0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4740a[WireFormat.FieldType.g0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4740a[WireFormat.FieldType.e0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4740a[WireFormat.FieldType.Z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4740a[WireFormat.FieldType.n0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4740a[WireFormat.FieldType.o0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4740a[WireFormat.FieldType.q0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4741b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i2, ByteString byteString) {
            try {
                byteString.A(this);
                k(10);
                t(byteString.size());
                throw null;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, Object obj, Schema schema) {
            int iJ = j();
            schema.d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i2, Object obj, Schema schema) {
            s(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.f4741b;
            if (i2 + 1 >= iRemaining) {
                this.f4741b = i2 - iRemaining;
                throw null;
            }
            this.f4739a += iRemaining;
            AllocatedBuffer.a(byteBuffer);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            int i4 = this.f4741b;
            if (i4 + 1 >= i3) {
                this.f4741b = i4 - i3;
                throw null;
            }
            this.f4739a += i3;
            AllocatedBuffer.b(i2, i3, bArr);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int j() {
            return (0 - this.f4741b) + this.f4739a;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void k(int i2) {
            if (this.f4741b + 1 >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void l(boolean z2) {
            this.f4741b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void m(int i2) {
            this.f4741b -= 4;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void n(long j) {
            this.f4741b -= 8;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void o(int i2) {
            if (i2 < 0) {
                u(i2);
            } else {
                t(i2);
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void q(int i2) {
            t(CodedOutputStream.r(i2));
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void r(long j) {
            u(CodedOutputStream.s(j));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void s(int i2, int i3) {
            t((i2 << 3) | i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void t(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f4741b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                x(i2);
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                w(i2);
                throw null;
            }
            if (((-268435456) & i2) == 0) {
                v(i2);
                throw null;
            }
            this.f4741b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void u(long j) {
            switch (BinaryWriter.i(j)) {
                case 1:
                    this.f4741b--;
                    throw null;
                case 2:
                    x((int) j);
                    throw null;
                case 3:
                    w((int) j);
                    throw null;
                case 4:
                    v((int) j);
                    throw null;
                case 5:
                    this.f4741b -= 5;
                    throw null;
                case 6:
                    this.f4741b -= 6;
                    throw null;
                case 7:
                    this.f4741b -= 7;
                    throw null;
                case 8:
                    this.f4741b -= 8;
                    throw null;
                case 9:
                    this.f4741b--;
                    throw null;
                case 10:
                    this.f4741b--;
                    throw null;
                default:
                    return;
            }
        }

        public final void v(int i2) {
            this.f4741b -= 4;
            throw null;
        }

        public final void w(int i2) {
            this.f4741b -= 3;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i2, boolean z2) {
            k(6);
            this.f4741b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i2) {
            s(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i2, int i3) {
            k(9);
            m(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i2, long j) {
            k(13);
            n(j);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i2, int i3) {
            k(15);
            o(i3);
            s(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i2, Object obj) {
            int iJ = j();
            Protobuf.f4904c.b(obj).d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i2, int i3) {
            k(10);
            q(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i2, long j) {
            k(15);
            r(j);
            s(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i2) {
            s(i2, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i2, String str) {
            int i3;
            int i4;
            int i5;
            int iJ = j();
            k(str.length());
            int length = str.length();
            int i6 = length - 1;
            this.f4741b -= i6;
            if (i6 >= 0 && str.charAt(i6) < 128) {
                throw null;
            }
            if (i6 != -1) {
                this.f4741b += i6;
                while (i6 >= 0) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt < 128 && (i5 = this.f4741b) >= 0) {
                        this.f4741b = i5 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i4 = this.f4741b) > 0) {
                        this.f4741b = i4 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i3 = this.f4741b) > 1) {
                        this.f4741b = i3 - 1;
                        throw null;
                    }
                    if (this.f4741b > 2) {
                        if (i6 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.f4741b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i6);
                    }
                    k(i6);
                }
            } else {
                this.f4741b--;
            }
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i2, int i3) {
            k(10);
            t(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i2, long j) {
            k(15);
            u(j);
            s(i2, 0);
            throw null;
        }

        public final void x(int i2) {
            this.f4741b -= 2;
            throw null;
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4742b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i2, ByteString byteString) {
            try {
                byteString.A(this);
                k(10);
                t(byteString.size());
                throw null;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, Object obj, Schema schema) {
            int iJ = j();
            schema.d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i2, Object obj, Schema schema) {
            s(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.f4742b;
            if (i2 < iRemaining) {
                this.f4739a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            int i3 = i2 - iRemaining;
            this.f4742b = i3;
            byteBuffer.get(null, i3 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            int i4 = this.f4742b;
            if (i4 < i3) {
                this.f4739a += i3;
                AllocatedBuffer.b(i2, i3, bArr);
                throw null;
            }
            int i5 = i4 - i3;
            this.f4742b = i5;
            System.arraycopy(bArr, i2, null, i5 + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int j() {
            return (0 - this.f4742b) + this.f4739a;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void k(int i2) {
            if (this.f4742b >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void l(boolean z2) {
            this.f4742b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void m(int i2) {
            this.f4742b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void n(long j) {
            this.f4742b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void o(int i2) {
            if (i2 < 0) {
                u(i2);
            } else {
                t(i2);
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void q(int i2) {
            t(CodedOutputStream.r(i2));
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void r(long j) {
            u(CodedOutputStream.s(j));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void s(int i2, int i3) {
            t((i2 << 3) | i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void t(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f4742b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                this.f4742b--;
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                this.f4742b--;
                throw null;
            }
            if ((i2 & (-268435456)) == 0) {
                this.f4742b--;
                throw null;
            }
            this.f4742b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void u(long j) {
            switch (BinaryWriter.i(j)) {
                case 1:
                    this.f4742b--;
                    throw null;
                case 2:
                    this.f4742b--;
                    throw null;
                case 3:
                    this.f4742b--;
                    throw null;
                case 4:
                    this.f4742b--;
                    throw null;
                case 5:
                    this.f4742b--;
                    throw null;
                case 6:
                    this.f4742b--;
                    throw null;
                case 7:
                    this.f4742b--;
                    throw null;
                case 8:
                    this.f4742b--;
                    throw null;
                case 9:
                    this.f4742b--;
                    throw null;
                case 10:
                    this.f4742b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i2, boolean z2) {
            k(6);
            this.f4742b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i2) {
            s(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i2, int i3) {
            k(9);
            m(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i2, long j) {
            k(13);
            n(j);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i2, int i3) {
            k(15);
            o(i3);
            s(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i2, Object obj) {
            int iJ = j();
            Protobuf.f4904c.b(obj).d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i2, int i3) {
            k(10);
            q(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i2, long j) {
            k(15);
            r(j);
            s(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i2) {
            s(i2, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i2, String str) {
            int i3;
            int i4;
            int i5;
            int iJ = j();
            k(str.length());
            int length = str.length();
            int i6 = length - 1;
            this.f4742b -= i6;
            if (i6 >= 0 && str.charAt(i6) < 128) {
                throw null;
            }
            if (i6 != -1) {
                this.f4742b += i6;
                while (i6 >= 0) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt < 128 && (i5 = this.f4742b) > 0) {
                        this.f4742b = i5 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i4 = this.f4742b) > 0) {
                        this.f4742b = i4 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i3 = this.f4742b) > 1) {
                        this.f4742b = i3 - 1;
                        throw null;
                    }
                    if (this.f4742b > 2) {
                        if (i6 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.f4742b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i6);
                    }
                    k(i6);
                }
            } else {
                this.f4742b--;
            }
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i2, int i3) {
            k(10);
            t(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i2, long j) {
            k(15);
            u(j);
            s(i2, 0);
            throw null;
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4743b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i2, ByteString byteString) {
            try {
                byteString.A(this);
                throw null;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, Object obj, Schema schema) {
            schema.d(obj, this);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i2, Object obj, Schema schema) {
            s(i2, 4);
            schema.d(obj, this);
            s(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            byteBuffer.remaining();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int j() {
            return this.f4739a + ((int) (0 - this.f4743b));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void k(int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void l(boolean z2) {
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j = this.f4743b;
            this.f4743b = j - 1;
            UnsafeUtil.l(j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void m(int i2) {
            long j = this.f4743b;
            this.f4743b = j - 1;
            UnsafeUtil.l(j, (byte) ((i2 >> 24) & 255));
            long j2 = this.f4743b;
            this.f4743b = j2 - 1;
            UnsafeUtil.l(j2, (byte) ((i2 >> 16) & 255));
            long j3 = this.f4743b;
            this.f4743b = j3 - 1;
            UnsafeUtil.l(j3, (byte) ((i2 >> 8) & 255));
            long j4 = this.f4743b;
            this.f4743b = j4 - 1;
            UnsafeUtil.l(j4, (byte) (i2 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void n(long j) {
            long j2 = this.f4743b;
            this.f4743b = j2 - 1;
            UnsafeUtil.l(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f4743b;
            this.f4743b = j3 - 1;
            UnsafeUtil.l(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f4743b;
            this.f4743b = j4 - 1;
            UnsafeUtil.l(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f4743b;
            this.f4743b = j5 - 1;
            UnsafeUtil.l(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f4743b;
            this.f4743b = j6 - 1;
            UnsafeUtil.l(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f4743b;
            this.f4743b = j7 - 1;
            UnsafeUtil.l(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f4743b;
            this.f4743b = j8 - 1;
            UnsafeUtil.l(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f4743b;
            this.f4743b = j9 - 1;
            UnsafeUtil.l(j9, (byte) (((int) j) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void o(int i2) {
            if (i2 >= 0) {
                t(i2);
            } else {
                u(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void q(int i2) {
            t(CodedOutputStream.r(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void r(long j) {
            u(CodedOutputStream.s(j));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void s(int i2, int i3) {
            t((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void t(int i2) {
            if ((i2 & (-128)) == 0) {
                long j = this.f4743b;
                this.f4743b = j - 1;
                UnsafeUtil.l(j, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j2 = this.f4743b;
                this.f4743b = j2 - 1;
                UnsafeUtil.l(j2, (byte) (i2 >>> 7));
                long j3 = this.f4743b;
                this.f4743b = j3 - 1;
                UnsafeUtil.l(j3, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j4 = this.f4743b;
                this.f4743b = j4 - 1;
                UnsafeUtil.l(j4, (byte) (i2 >>> 14));
                long j5 = this.f4743b;
                this.f4743b = j5 - 1;
                UnsafeUtil.l(j5, (byte) (((i2 >>> 7) & 127) | 128));
                long j6 = this.f4743b;
                this.f4743b = j6 - 1;
                UnsafeUtil.l(j6, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j7 = this.f4743b;
                this.f4743b = j7 - 1;
                UnsafeUtil.l(j7, (byte) (i2 >>> 21));
                long j8 = this.f4743b;
                this.f4743b = j8 - 1;
                UnsafeUtil.l(j8, (byte) (((i2 >>> 14) & 127) | 128));
                long j9 = this.f4743b;
                this.f4743b = j9 - 1;
                UnsafeUtil.l(j9, (byte) (((i2 >>> 7) & 127) | 128));
                long j10 = this.f4743b;
                this.f4743b = j10 - 1;
                UnsafeUtil.l(j10, (byte) ((i2 & 127) | 128));
                return;
            }
            long j11 = this.f4743b;
            this.f4743b = j11 - 1;
            UnsafeUtil.l(j11, (byte) (i2 >>> 28));
            long j12 = this.f4743b;
            this.f4743b = j12 - 1;
            UnsafeUtil.l(j12, (byte) (((i2 >>> 21) & 127) | 128));
            long j13 = this.f4743b;
            this.f4743b = j13 - 1;
            UnsafeUtil.l(j13, (byte) (((i2 >>> 14) & 127) | 128));
            long j14 = this.f4743b;
            this.f4743b = j14 - 1;
            UnsafeUtil.l(j14, (byte) (((i2 >>> 7) & 127) | 128));
            long j15 = this.f4743b;
            this.f4743b = j15 - 1;
            UnsafeUtil.l(j15, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void u(long j) {
            switch (BinaryWriter.i(j)) {
                case 1:
                    long j2 = this.f4743b;
                    this.f4743b = j2 - 1;
                    UnsafeUtil.l(j2, (byte) j);
                    break;
                case 2:
                    long j3 = this.f4743b;
                    this.f4743b = j3 - 1;
                    UnsafeUtil.l(j3, (byte) (j >>> 7));
                    long j4 = this.f4743b;
                    this.f4743b = j4 - 1;
                    UnsafeUtil.l(j4, (byte) ((((int) j) & 127) | 128));
                    break;
                case 3:
                    long j5 = this.f4743b;
                    this.f4743b = j5 - 1;
                    UnsafeUtil.l(j5, (byte) (((int) j) >>> 14));
                    long j6 = this.f4743b;
                    this.f4743b = j6 - 1;
                    UnsafeUtil.l(j6, (byte) (((j >>> 7) & 127) | 128));
                    long j7 = this.f4743b;
                    this.f4743b = j7 - 1;
                    UnsafeUtil.l(j7, (byte) ((j & 127) | 128));
                    break;
                case 4:
                    long j8 = this.f4743b;
                    this.f4743b = j8 - 1;
                    UnsafeUtil.l(j8, (byte) (j >>> 21));
                    long j9 = this.f4743b;
                    this.f4743b = j9 - 1;
                    UnsafeUtil.l(j9, (byte) (((j >>> 14) & 127) | 128));
                    long j10 = this.f4743b;
                    this.f4743b = j10 - 1;
                    UnsafeUtil.l(j10, (byte) (((j >>> 7) & 127) | 128));
                    long j11 = this.f4743b;
                    this.f4743b = j11 - 1;
                    UnsafeUtil.l(j11, (byte) ((j & 127) | 128));
                    break;
                case 5:
                    long j12 = this.f4743b;
                    this.f4743b = j12 - 1;
                    UnsafeUtil.l(j12, (byte) (j >>> 28));
                    long j13 = this.f4743b;
                    this.f4743b = j13 - 1;
                    UnsafeUtil.l(j13, (byte) (((j >>> 21) & 127) | 128));
                    long j14 = this.f4743b;
                    this.f4743b = j14 - 1;
                    UnsafeUtil.l(j14, (byte) (((j >>> 14) & 127) | 128));
                    long j15 = this.f4743b;
                    this.f4743b = j15 - 1;
                    UnsafeUtil.l(j15, (byte) (((j >>> 7) & 127) | 128));
                    long j16 = this.f4743b;
                    this.f4743b = j16 - 1;
                    UnsafeUtil.l(j16, (byte) ((j & 127) | 128));
                    break;
                case 6:
                    long j17 = this.f4743b;
                    this.f4743b = j17 - 1;
                    UnsafeUtil.l(j17, (byte) (j >>> 35));
                    long j18 = this.f4743b;
                    this.f4743b = j18 - 1;
                    UnsafeUtil.l(j18, (byte) (((j >>> 28) & 127) | 128));
                    long j19 = this.f4743b;
                    this.f4743b = j19 - 1;
                    UnsafeUtil.l(j19, (byte) (((j >>> 21) & 127) | 128));
                    long j20 = this.f4743b;
                    this.f4743b = j20 - 1;
                    UnsafeUtil.l(j20, (byte) (((j >>> 14) & 127) | 128));
                    long j21 = this.f4743b;
                    this.f4743b = j21 - 1;
                    UnsafeUtil.l(j21, (byte) (((j >>> 7) & 127) | 128));
                    long j22 = this.f4743b;
                    this.f4743b = j22 - 1;
                    UnsafeUtil.l(j22, (byte) ((j & 127) | 128));
                    break;
                case 7:
                    long j23 = this.f4743b;
                    this.f4743b = j23 - 1;
                    UnsafeUtil.l(j23, (byte) (j >>> 42));
                    long j24 = this.f4743b;
                    this.f4743b = j24 - 1;
                    UnsafeUtil.l(j24, (byte) (((j >>> 35) & 127) | 128));
                    long j25 = this.f4743b;
                    this.f4743b = j25 - 1;
                    UnsafeUtil.l(j25, (byte) (((j >>> 28) & 127) | 128));
                    long j26 = this.f4743b;
                    this.f4743b = j26 - 1;
                    UnsafeUtil.l(j26, (byte) (((j >>> 21) & 127) | 128));
                    long j27 = this.f4743b;
                    this.f4743b = j27 - 1;
                    UnsafeUtil.l(j27, (byte) (((j >>> 14) & 127) | 128));
                    long j28 = this.f4743b;
                    this.f4743b = j28 - 1;
                    UnsafeUtil.l(j28, (byte) (((j >>> 7) & 127) | 128));
                    long j29 = this.f4743b;
                    this.f4743b = j29 - 1;
                    UnsafeUtil.l(j29, (byte) ((j & 127) | 128));
                    break;
                case 8:
                    long j30 = this.f4743b;
                    this.f4743b = j30 - 1;
                    UnsafeUtil.l(j30, (byte) (j >>> 49));
                    long j31 = this.f4743b;
                    this.f4743b = j31 - 1;
                    UnsafeUtil.l(j31, (byte) (((j >>> 42) & 127) | 128));
                    long j32 = this.f4743b;
                    this.f4743b = j32 - 1;
                    UnsafeUtil.l(j32, (byte) (((j >>> 35) & 127) | 128));
                    long j33 = this.f4743b;
                    this.f4743b = j33 - 1;
                    UnsafeUtil.l(j33, (byte) (((j >>> 28) & 127) | 128));
                    long j34 = this.f4743b;
                    this.f4743b = j34 - 1;
                    UnsafeUtil.l(j34, (byte) (((j >>> 21) & 127) | 128));
                    long j35 = this.f4743b;
                    this.f4743b = j35 - 1;
                    UnsafeUtil.l(j35, (byte) (((j >>> 14) & 127) | 128));
                    long j36 = this.f4743b;
                    this.f4743b = j36 - 1;
                    UnsafeUtil.l(j36, (byte) (((j >>> 7) & 127) | 128));
                    long j37 = this.f4743b;
                    this.f4743b = j37 - 1;
                    UnsafeUtil.l(j37, (byte) ((j & 127) | 128));
                    break;
                case 9:
                    long j38 = this.f4743b;
                    this.f4743b = j38 - 1;
                    UnsafeUtil.l(j38, (byte) (j >>> 56));
                    long j39 = this.f4743b;
                    this.f4743b = j39 - 1;
                    UnsafeUtil.l(j39, (byte) (((j >>> 49) & 127) | 128));
                    long j40 = this.f4743b;
                    this.f4743b = j40 - 1;
                    UnsafeUtil.l(j40, (byte) (((j >>> 42) & 127) | 128));
                    long j41 = this.f4743b;
                    this.f4743b = j41 - 1;
                    UnsafeUtil.l(j41, (byte) (((j >>> 35) & 127) | 128));
                    long j42 = this.f4743b;
                    this.f4743b = j42 - 1;
                    UnsafeUtil.l(j42, (byte) (((j >>> 28) & 127) | 128));
                    long j43 = this.f4743b;
                    this.f4743b = j43 - 1;
                    UnsafeUtil.l(j43, (byte) (((j >>> 21) & 127) | 128));
                    long j44 = this.f4743b;
                    this.f4743b = j44 - 1;
                    UnsafeUtil.l(j44, (byte) (((j >>> 14) & 127) | 128));
                    long j45 = this.f4743b;
                    this.f4743b = j45 - 1;
                    UnsafeUtil.l(j45, (byte) (((j >>> 7) & 127) | 128));
                    long j46 = this.f4743b;
                    this.f4743b = j46 - 1;
                    UnsafeUtil.l(j46, (byte) ((j & 127) | 128));
                    break;
                case 10:
                    long j47 = this.f4743b;
                    this.f4743b = j47 - 1;
                    UnsafeUtil.l(j47, (byte) (j >>> 63));
                    long j48 = this.f4743b;
                    this.f4743b = j48 - 1;
                    UnsafeUtil.l(j48, (byte) (((j >>> 56) & 127) | 128));
                    long j49 = this.f4743b;
                    this.f4743b = j49 - 1;
                    UnsafeUtil.l(j49, (byte) (((j >>> 49) & 127) | 128));
                    long j50 = this.f4743b;
                    this.f4743b = j50 - 1;
                    UnsafeUtil.l(j50, (byte) (((j >>> 42) & 127) | 128));
                    long j51 = this.f4743b;
                    this.f4743b = j51 - 1;
                    UnsafeUtil.l(j51, (byte) (((j >>> 35) & 127) | 128));
                    long j52 = this.f4743b;
                    this.f4743b = j52 - 1;
                    UnsafeUtil.l(j52, (byte) (((j >>> 28) & 127) | 128));
                    long j53 = this.f4743b;
                    this.f4743b = j53 - 1;
                    UnsafeUtil.l(j53, (byte) (((j >>> 21) & 127) | 128));
                    long j54 = this.f4743b;
                    this.f4743b = j54 - 1;
                    UnsafeUtil.l(j54, (byte) (((j >>> 14) & 127) | 128));
                    long j55 = this.f4743b;
                    this.f4743b = j55 - 1;
                    UnsafeUtil.l(j55, (byte) (((j >>> 7) & 127) | 128));
                    long j56 = this.f4743b;
                    this.f4743b = j56 - 1;
                    UnsafeUtil.l(j56, (byte) ((j & 127) | 128));
                    break;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i2, boolean z2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i2) {
            s(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i2, long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i2, Object obj) {
            Protobuf.f4904c.b(obj).d(obj, this);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i2, long j) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i2) {
            s(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i2, String str) {
            str.length();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i2, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i2, long j) {
            throw null;
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4744b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i2, ByteString byteString) {
            try {
                byteString.A(this);
                k(10);
                t(byteString.size());
                s(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, Object obj, Schema schema) {
            int iJ = j();
            schema.d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            s(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i2, Object obj, Schema schema) {
            s(i2, 4);
            schema.d(obj, this);
            s(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            long j = this.f4744b;
            if (((int) j) < iRemaining) {
                this.f4739a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            long j2 = j - ((long) iRemaining);
            this.f4744b = j2;
            byteBuffer.get(null, ((int) j2) + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void h(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j = this.f4744b;
            if (((int) j) < i3) {
                this.f4739a += i3;
                AllocatedBuffer.b(i2, i3, bArr);
                throw null;
            }
            long j2 = j - ((long) i3);
            this.f4744b = j2;
            System.arraycopy(bArr, i2, null, ((int) j2) + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int j() {
            return this.f4739a + ((int) (0 - this.f4744b));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void k(int i2) {
            if (((int) this.f4744b) >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void l(boolean z2) {
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j = this.f4744b;
            this.f4744b = j - 1;
            UnsafeUtil.m(null, j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void m(int i2) {
            long j = this.f4744b;
            this.f4744b = j - 1;
            UnsafeUtil.m(null, j, (byte) ((i2 >> 24) & 255));
            long j2 = this.f4744b;
            this.f4744b = j2 - 1;
            UnsafeUtil.m(null, j2, (byte) ((i2 >> 16) & 255));
            long j3 = this.f4744b;
            this.f4744b = j3 - 1;
            UnsafeUtil.m(null, j3, (byte) ((i2 >> 8) & 255));
            long j4 = this.f4744b;
            this.f4744b = j4 - 1;
            UnsafeUtil.m(null, j4, (byte) (i2 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void n(long j) {
            long j2 = this.f4744b;
            this.f4744b = j2 - 1;
            UnsafeUtil.m(null, j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f4744b;
            this.f4744b = j3 - 1;
            UnsafeUtil.m(null, j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f4744b;
            this.f4744b = j4 - 1;
            UnsafeUtil.m(null, j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f4744b;
            this.f4744b = j5 - 1;
            UnsafeUtil.m(null, j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f4744b;
            this.f4744b = j6 - 1;
            UnsafeUtil.m(null, j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f4744b;
            this.f4744b = j7 - 1;
            UnsafeUtil.m(null, j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f4744b;
            this.f4744b = j8 - 1;
            UnsafeUtil.m(null, j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f4744b;
            this.f4744b = j9 - 1;
            UnsafeUtil.m(null, j9, (byte) (((int) j) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void o(int i2) {
            if (i2 >= 0) {
                t(i2);
            } else {
                u(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void q(int i2) {
            t(CodedOutputStream.r(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void r(long j) {
            u(CodedOutputStream.s(j));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void s(int i2, int i3) {
            t((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void t(int i2) {
            if ((i2 & (-128)) == 0) {
                long j = this.f4744b;
                this.f4744b = j - 1;
                UnsafeUtil.m(null, j, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j2 = this.f4744b;
                this.f4744b = j2 - 1;
                UnsafeUtil.m(null, j2, (byte) (i2 >>> 7));
                long j3 = this.f4744b;
                this.f4744b = j3 - 1;
                UnsafeUtil.m(null, j3, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j4 = this.f4744b;
                this.f4744b = j4 - 1;
                UnsafeUtil.m(null, j4, (byte) (i2 >>> 14));
                long j5 = this.f4744b;
                this.f4744b = j5 - 1;
                UnsafeUtil.m(null, j5, (byte) (((i2 >>> 7) & 127) | 128));
                long j6 = this.f4744b;
                this.f4744b = j6 - 1;
                UnsafeUtil.m(null, j6, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j7 = this.f4744b;
                this.f4744b = j7 - 1;
                UnsafeUtil.m(null, j7, (byte) (i2 >>> 21));
                long j8 = this.f4744b;
                this.f4744b = j8 - 1;
                UnsafeUtil.m(null, j8, (byte) (((i2 >>> 14) & 127) | 128));
                long j9 = this.f4744b;
                this.f4744b = j9 - 1;
                UnsafeUtil.m(null, j9, (byte) (((i2 >>> 7) & 127) | 128));
                long j10 = this.f4744b;
                this.f4744b = j10 - 1;
                UnsafeUtil.m(null, j10, (byte) ((i2 & 127) | 128));
                return;
            }
            long j11 = this.f4744b;
            this.f4744b = j11 - 1;
            UnsafeUtil.m(null, j11, (byte) (i2 >>> 28));
            long j12 = this.f4744b;
            this.f4744b = j12 - 1;
            UnsafeUtil.m(null, j12, (byte) (((i2 >>> 21) & 127) | 128));
            long j13 = this.f4744b;
            this.f4744b = j13 - 1;
            UnsafeUtil.m(null, j13, (byte) (((i2 >>> 14) & 127) | 128));
            long j14 = this.f4744b;
            this.f4744b = j14 - 1;
            UnsafeUtil.m(null, j14, (byte) (((i2 >>> 7) & 127) | 128));
            long j15 = this.f4744b;
            this.f4744b = j15 - 1;
            UnsafeUtil.m(null, j15, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void u(long j) {
            switch (BinaryWriter.i(j)) {
                case 1:
                    long j2 = this.f4744b;
                    this.f4744b = j2 - 1;
                    UnsafeUtil.m(null, j2, (byte) j);
                    break;
                case 2:
                    long j3 = this.f4744b;
                    this.f4744b = j3 - 1;
                    UnsafeUtil.m(null, j3, (byte) (j >>> 7));
                    long j4 = this.f4744b;
                    this.f4744b = j4 - 1;
                    UnsafeUtil.m(null, j4, (byte) ((((int) j) & 127) | 128));
                    break;
                case 3:
                    long j5 = this.f4744b;
                    this.f4744b = j5 - 1;
                    UnsafeUtil.m(null, j5, (byte) (((int) j) >>> 14));
                    long j6 = this.f4744b;
                    this.f4744b = j6 - 1;
                    UnsafeUtil.m(null, j6, (byte) (((j >>> 7) & 127) | 128));
                    long j7 = this.f4744b;
                    this.f4744b = j7 - 1;
                    UnsafeUtil.m(null, j7, (byte) ((j & 127) | 128));
                    break;
                case 4:
                    long j8 = this.f4744b;
                    this.f4744b = j8 - 1;
                    UnsafeUtil.m(null, j8, (byte) (j >>> 21));
                    long j9 = this.f4744b;
                    this.f4744b = j9 - 1;
                    UnsafeUtil.m(null, j9, (byte) (((j >>> 14) & 127) | 128));
                    long j10 = this.f4744b;
                    this.f4744b = j10 - 1;
                    UnsafeUtil.m(null, j10, (byte) (((j >>> 7) & 127) | 128));
                    long j11 = this.f4744b;
                    this.f4744b = j11 - 1;
                    UnsafeUtil.m(null, j11, (byte) ((j & 127) | 128));
                    break;
                case 5:
                    long j12 = this.f4744b;
                    this.f4744b = j12 - 1;
                    UnsafeUtil.m(null, j12, (byte) (j >>> 28));
                    long j13 = this.f4744b;
                    this.f4744b = j13 - 1;
                    UnsafeUtil.m(null, j13, (byte) (((j >>> 21) & 127) | 128));
                    long j14 = this.f4744b;
                    this.f4744b = j14 - 1;
                    UnsafeUtil.m(null, j14, (byte) (((j >>> 14) & 127) | 128));
                    long j15 = this.f4744b;
                    this.f4744b = j15 - 1;
                    UnsafeUtil.m(null, j15, (byte) (((j >>> 7) & 127) | 128));
                    long j16 = this.f4744b;
                    this.f4744b = j16 - 1;
                    UnsafeUtil.m(null, j16, (byte) ((j & 127) | 128));
                    break;
                case 6:
                    long j17 = this.f4744b;
                    this.f4744b = j17 - 1;
                    UnsafeUtil.m(null, j17, (byte) (j >>> 35));
                    long j18 = this.f4744b;
                    this.f4744b = j18 - 1;
                    UnsafeUtil.m(null, j18, (byte) (((j >>> 28) & 127) | 128));
                    long j19 = this.f4744b;
                    this.f4744b = j19 - 1;
                    UnsafeUtil.m(null, j19, (byte) (((j >>> 21) & 127) | 128));
                    long j20 = this.f4744b;
                    this.f4744b = j20 - 1;
                    UnsafeUtil.m(null, j20, (byte) (((j >>> 14) & 127) | 128));
                    long j21 = this.f4744b;
                    this.f4744b = j21 - 1;
                    UnsafeUtil.m(null, j21, (byte) (((j >>> 7) & 127) | 128));
                    long j22 = this.f4744b;
                    this.f4744b = j22 - 1;
                    UnsafeUtil.m(null, j22, (byte) ((j & 127) | 128));
                    break;
                case 7:
                    long j23 = this.f4744b;
                    this.f4744b = j23 - 1;
                    UnsafeUtil.m(null, j23, (byte) (j >>> 42));
                    long j24 = this.f4744b;
                    this.f4744b = j24 - 1;
                    UnsafeUtil.m(null, j24, (byte) (((j >>> 35) & 127) | 128));
                    long j25 = this.f4744b;
                    this.f4744b = j25 - 1;
                    UnsafeUtil.m(null, j25, (byte) (((j >>> 28) & 127) | 128));
                    long j26 = this.f4744b;
                    this.f4744b = j26 - 1;
                    UnsafeUtil.m(null, j26, (byte) (((j >>> 21) & 127) | 128));
                    long j27 = this.f4744b;
                    this.f4744b = j27 - 1;
                    UnsafeUtil.m(null, j27, (byte) (((j >>> 14) & 127) | 128));
                    long j28 = this.f4744b;
                    this.f4744b = j28 - 1;
                    UnsafeUtil.m(null, j28, (byte) (((j >>> 7) & 127) | 128));
                    long j29 = this.f4744b;
                    this.f4744b = j29 - 1;
                    UnsafeUtil.m(null, j29, (byte) ((j & 127) | 128));
                    break;
                case 8:
                    long j30 = this.f4744b;
                    this.f4744b = j30 - 1;
                    UnsafeUtil.m(null, j30, (byte) (j >>> 49));
                    long j31 = this.f4744b;
                    this.f4744b = j31 - 1;
                    UnsafeUtil.m(null, j31, (byte) (((j >>> 42) & 127) | 128));
                    long j32 = this.f4744b;
                    this.f4744b = j32 - 1;
                    UnsafeUtil.m(null, j32, (byte) (((j >>> 35) & 127) | 128));
                    long j33 = this.f4744b;
                    this.f4744b = j33 - 1;
                    UnsafeUtil.m(null, j33, (byte) (((j >>> 28) & 127) | 128));
                    long j34 = this.f4744b;
                    this.f4744b = j34 - 1;
                    UnsafeUtil.m(null, j34, (byte) (((j >>> 21) & 127) | 128));
                    long j35 = this.f4744b;
                    this.f4744b = j35 - 1;
                    UnsafeUtil.m(null, j35, (byte) (((j >>> 14) & 127) | 128));
                    long j36 = this.f4744b;
                    this.f4744b = j36 - 1;
                    UnsafeUtil.m(null, j36, (byte) (((j >>> 7) & 127) | 128));
                    long j37 = this.f4744b;
                    this.f4744b = j37 - 1;
                    UnsafeUtil.m(null, j37, (byte) ((j & 127) | 128));
                    break;
                case 9:
                    long j38 = this.f4744b;
                    this.f4744b = j38 - 1;
                    UnsafeUtil.m(null, j38, (byte) (j >>> 56));
                    long j39 = this.f4744b;
                    this.f4744b = j39 - 1;
                    UnsafeUtil.m(null, j39, (byte) (((j >>> 49) & 127) | 128));
                    long j40 = this.f4744b;
                    this.f4744b = j40 - 1;
                    UnsafeUtil.m(null, j40, (byte) (((j >>> 42) & 127) | 128));
                    long j41 = this.f4744b;
                    this.f4744b = j41 - 1;
                    UnsafeUtil.m(null, j41, (byte) (((j >>> 35) & 127) | 128));
                    long j42 = this.f4744b;
                    this.f4744b = j42 - 1;
                    UnsafeUtil.m(null, j42, (byte) (((j >>> 28) & 127) | 128));
                    long j43 = this.f4744b;
                    this.f4744b = j43 - 1;
                    UnsafeUtil.m(null, j43, (byte) (((j >>> 21) & 127) | 128));
                    long j44 = this.f4744b;
                    this.f4744b = j44 - 1;
                    UnsafeUtil.m(null, j44, (byte) (((j >>> 14) & 127) | 128));
                    long j45 = this.f4744b;
                    this.f4744b = j45 - 1;
                    UnsafeUtil.m(null, j45, (byte) (((j >>> 7) & 127) | 128));
                    long j46 = this.f4744b;
                    this.f4744b = j46 - 1;
                    UnsafeUtil.m(null, j46, (byte) ((j & 127) | 128));
                    break;
                case 10:
                    long j47 = this.f4744b;
                    this.f4744b = j47 - 1;
                    UnsafeUtil.m(null, j47, (byte) (j >>> 63));
                    long j48 = this.f4744b;
                    this.f4744b = j48 - 1;
                    UnsafeUtil.m(null, j48, (byte) (((j >>> 56) & 127) | 128));
                    long j49 = this.f4744b;
                    this.f4744b = j49 - 1;
                    UnsafeUtil.m(null, j49, (byte) (((j >>> 49) & 127) | 128));
                    long j50 = this.f4744b;
                    this.f4744b = j50 - 1;
                    UnsafeUtil.m(null, j50, (byte) (((j >>> 42) & 127) | 128));
                    long j51 = this.f4744b;
                    this.f4744b = j51 - 1;
                    UnsafeUtil.m(null, j51, (byte) (((j >>> 35) & 127) | 128));
                    long j52 = this.f4744b;
                    this.f4744b = j52 - 1;
                    UnsafeUtil.m(null, j52, (byte) (((j >>> 28) & 127) | 128));
                    long j53 = this.f4744b;
                    this.f4744b = j53 - 1;
                    UnsafeUtil.m(null, j53, (byte) (((j >>> 21) & 127) | 128));
                    long j54 = this.f4744b;
                    this.f4744b = j54 - 1;
                    UnsafeUtil.m(null, j54, (byte) (((j >>> 14) & 127) | 128));
                    long j55 = this.f4744b;
                    this.f4744b = j55 - 1;
                    UnsafeUtil.m(null, j55, (byte) (((j >>> 7) & 127) | 128));
                    long j56 = this.f4744b;
                    this.f4744b = j56 - 1;
                    UnsafeUtil.m(null, j56, (byte) ((j & 127) | 128));
                    break;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i2, boolean z2) {
            k(6);
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j = this.f4744b;
            this.f4744b = j - 1;
            UnsafeUtil.m(null, j, b2);
            s(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i2) {
            s(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i2, int i3) {
            k(9);
            m(i3);
            s(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i2, long j) {
            k(13);
            n(j);
            s(i2, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i2, int i3) {
            k(15);
            o(i3);
            s(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i2, Object obj) {
            int iJ = j();
            Protobuf.f4904c.b(obj).d(obj, this);
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            s(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i2, int i3) {
            k(10);
            q(i3);
            s(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i2, long j) {
            k(15);
            r(j);
            s(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i2) {
            s(i2, 3);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0074  */
        /* JADX WARN: Code duplicated, block: B:26:0x0079  */
        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code duplicated, block: B:37:0x0106  */
        /* JADX WARN: Code duplicated, block: B:44:0x00fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x00fe A[SYNTHETIC] */
        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i2, String str) {
            long j;
            char cCharAt;
            long j2;
            char cCharAt2;
            int iJ = j();
            k(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                long j3 = this.f4744b;
                this.f4744b = j3 - 1;
                UnsafeUtil.m(null, j3, (byte) cCharAt2);
            }
            if (length != -1) {
                while (length >= 0) {
                    char cCharAt3 = str.charAt(length);
                    if (cCharAt3 < 128) {
                        long j4 = this.f4744b;
                        if (j4 > 0) {
                            this.f4744b = j4 - 1;
                            UnsafeUtil.m(null, j4, (byte) cCharAt3);
                        } else if (cCharAt3 < 2048) {
                            j2 = this.f4744b;
                            if (j2 > 0) {
                                this.f4744b = j2 - 1;
                                UnsafeUtil.m(null, j2, (byte) ((cCharAt3 & '?') | 128));
                                long j5 = this.f4744b;
                                this.f4744b = j5 - 1;
                                UnsafeUtil.m(null, j5, (byte) ((cCharAt3 >>> 6) | 960));
                            } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                                j = this.f4744b;
                                if (j > 1) {
                                    this.f4744b = j - 1;
                                    UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                                    long j6 = this.f4744b;
                                    this.f4744b = j6 - 1;
                                    UnsafeUtil.m(null, j6, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                    long j7 = this.f4744b;
                                    this.f4744b = j7 - 1;
                                    UnsafeUtil.m(null, j7, (byte) ((cCharAt3 >>> '\f') | 480));
                                } else {
                                    if (this.f4744b > 2) {
                                        if (length != 0) {
                                            cCharAt = str.charAt(length - 1);
                                            if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                                length--;
                                                int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                                long j8 = this.f4744b;
                                                this.f4744b = j8 - 1;
                                                UnsafeUtil.m(null, j8, (byte) ((codePoint & 63) | 128));
                                                long j9 = this.f4744b;
                                                this.f4744b = j9 - 1;
                                                UnsafeUtil.m(null, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                                long j10 = this.f4744b;
                                                this.f4744b = j10 - 1;
                                                UnsafeUtil.m(null, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                                long j11 = this.f4744b;
                                                this.f4744b = j11 - 1;
                                                UnsafeUtil.m(null, j11, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                            }
                                        }
                                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                    }
                                    k(length);
                                    length++;
                                }
                            } else {
                                if (this.f4744b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j12 = this.f4744b;
                                            this.f4744b = j12 - 1;
                                            UnsafeUtil.m(null, j12, (byte) ((codePoint2 & 63) | 128));
                                            long j13 = this.f4744b;
                                            this.f4744b = j13 - 1;
                                            UnsafeUtil.m(null, j13, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            long j14 = this.f4744b;
                                            this.f4744b = j14 - 1;
                                            UnsafeUtil.m(null, j14, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j15 = this.f4744b;
                                            this.f4744b = j15 - 1;
                                            UnsafeUtil.m(null, j15, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                k(length);
                                length++;
                            }
                        } else if (cCharAt3 >= 55296) {
                            j = this.f4744b;
                            if (j > 1) {
                                this.f4744b = j - 1;
                                UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                                long j16 = this.f4744b;
                                this.f4744b = j16 - 1;
                                UnsafeUtil.m(null, j16, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j17 = this.f4744b;
                                this.f4744b = j17 - 1;
                                UnsafeUtil.m(null, j17, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f4744b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j18 = this.f4744b;
                                            this.f4744b = j18 - 1;
                                            UnsafeUtil.m(null, j18, (byte) ((codePoint3 & 63) | 128));
                                            long j19 = this.f4744b;
                                            this.f4744b = j19 - 1;
                                            UnsafeUtil.m(null, j19, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                            long j110 = this.f4744b;
                                            this.f4744b = j110 - 1;
                                            UnsafeUtil.m(null, j110, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                            long j111 = this.f4744b;
                                            this.f4744b = j111 - 1;
                                            UnsafeUtil.m(null, j111, (byte) ((codePoint3 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                k(length);
                                length++;
                            }
                        } else {
                            j = this.f4744b;
                            if (j > 1) {
                                this.f4744b = j - 1;
                                UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                                long j112 = this.f4744b;
                                this.f4744b = j112 - 1;
                                UnsafeUtil.m(null, j112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j113 = this.f4744b;
                                this.f4744b = j113 - 1;
                                UnsafeUtil.m(null, j113, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f4744b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j114 = this.f4744b;
                                            this.f4744b = j114 - 1;
                                            UnsafeUtil.m(null, j114, (byte) ((codePoint4 & 63) | 128));
                                            long j115 = this.f4744b;
                                            this.f4744b = j115 - 1;
                                            UnsafeUtil.m(null, j115, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                            long j116 = this.f4744b;
                                            this.f4744b = j116 - 1;
                                            UnsafeUtil.m(null, j116, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                            long j117 = this.f4744b;
                                            this.f4744b = j117 - 1;
                                            UnsafeUtil.m(null, j117, (byte) ((codePoint4 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                k(length);
                                length++;
                            }
                        }
                    } else if (cCharAt3 < 2048) {
                        j2 = this.f4744b;
                        if (j2 > 0) {
                            this.f4744b = j2 - 1;
                            UnsafeUtil.m(null, j2, (byte) ((cCharAt3 & '?') | 128));
                            long j20 = this.f4744b;
                            this.f4744b = j20 - 1;
                            UnsafeUtil.m(null, j20, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296) {
                            j = this.f4744b;
                            if (j > 1) {
                                this.f4744b = j - 1;
                                UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                                long j118 = this.f4744b;
                                this.f4744b = j118 - 1;
                                UnsafeUtil.m(null, j118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j119 = this.f4744b;
                                this.f4744b = j119 - 1;
                                UnsafeUtil.m(null, j119, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f4744b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j1110 = this.f4744b;
                                            this.f4744b = j1110 - 1;
                                            UnsafeUtil.m(null, j1110, (byte) ((codePoint5 & 63) | 128));
                                            long j1111 = this.f4744b;
                                            this.f4744b = j1111 - 1;
                                            UnsafeUtil.m(null, j1111, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                            long j1112 = this.f4744b;
                                            this.f4744b = j1112 - 1;
                                            UnsafeUtil.m(null, j1112, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                            long j1113 = this.f4744b;
                                            this.f4744b = j1113 - 1;
                                            UnsafeUtil.m(null, j1113, (byte) ((codePoint5 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                k(length);
                                length++;
                            }
                        } else {
                            j = this.f4744b;
                            if (j > 1) {
                                this.f4744b = j - 1;
                                UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                                long j1114 = this.f4744b;
                                this.f4744b = j1114 - 1;
                                UnsafeUtil.m(null, j1114, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j1115 = this.f4744b;
                                this.f4744b = j1115 - 1;
                                UnsafeUtil.m(null, j1115, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f4744b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j1116 = this.f4744b;
                                            this.f4744b = j1116 - 1;
                                            UnsafeUtil.m(null, j1116, (byte) ((codePoint6 & 63) | 128));
                                            long j1117 = this.f4744b;
                                            this.f4744b = j1117 - 1;
                                            UnsafeUtil.m(null, j1117, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                            long j1118 = this.f4744b;
                                            this.f4744b = j1118 - 1;
                                            UnsafeUtil.m(null, j1118, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                            long j1119 = this.f4744b;
                                            this.f4744b = j1119 - 1;
                                            UnsafeUtil.m(null, j1119, (byte) ((codePoint6 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                k(length);
                                length++;
                            }
                        }
                    } else if (cCharAt3 >= 55296) {
                        j = this.f4744b;
                        if (j > 1) {
                            this.f4744b = j - 1;
                            UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                            long j11110 = this.f4744b;
                            this.f4744b = j11110 - 1;
                            UnsafeUtil.m(null, j11110, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j11111 = this.f4744b;
                            this.f4744b = j11111 - 1;
                            UnsafeUtil.m(null, j11111, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f4744b > 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11112 = this.f4744b;
                                        this.f4744b = j11112 - 1;
                                        UnsafeUtil.m(null, j11112, (byte) ((codePoint7 & 63) | 128));
                                        long j11113 = this.f4744b;
                                        this.f4744b = j11113 - 1;
                                        UnsafeUtil.m(null, j11113, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                        long j11114 = this.f4744b;
                                        this.f4744b = j11114 - 1;
                                        UnsafeUtil.m(null, j11114, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                        long j11115 = this.f4744b;
                                        this.f4744b = j11115 - 1;
                                        UnsafeUtil.m(null, j11115, (byte) ((codePoint7 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            k(length);
                            length++;
                        }
                    } else {
                        j = this.f4744b;
                        if (j > 1) {
                            this.f4744b = j - 1;
                            UnsafeUtil.m(null, j, (byte) ((cCharAt3 & '?') | 128));
                            long j11116 = this.f4744b;
                            this.f4744b = j11116 - 1;
                            UnsafeUtil.m(null, j11116, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j11117 = this.f4744b;
                            this.f4744b = j11117 - 1;
                            UnsafeUtil.m(null, j11117, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f4744b > 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11118 = this.f4744b;
                                        this.f4744b = j11118 - 1;
                                        UnsafeUtil.m(null, j11118, (byte) ((codePoint8 & 63) | 128));
                                        long j11119 = this.f4744b;
                                        this.f4744b = j11119 - 1;
                                        UnsafeUtil.m(null, j11119, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                        long j111110 = this.f4744b;
                                        this.f4744b = j111110 - 1;
                                        UnsafeUtil.m(null, j111110, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                        long j111111 = this.f4744b;
                                        this.f4744b = j111111 - 1;
                                        UnsafeUtil.m(null, j111111, (byte) ((codePoint8 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            k(length);
                            length++;
                        }
                    }
                    length--;
                }
            }
            int iJ2 = j() - iJ;
            k(10);
            t(iJ2);
            s(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i2, int i3) {
            k(10);
            t(i3);
            s(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i2, long j) {
            k(15);
            u(j);
            s(i2, 0);
        }
    }

    public static byte i(long j) {
        byte b2;
        if (((-128) & j) == 0) {
            return (byte) 1;
        }
        if (j < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j) != 0) {
            b2 = (byte) 6;
            j >>>= 28;
        } else {
            b2 = 2;
        }
        if (((-2097152) & j) != 0) {
            b2 = (byte) (b2 + 2);
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? (byte) (b2 + 1) : b2;
    }

    public static final void p(BinaryWriter binaryWriter, int i2, WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType.ordinal()) {
            case 0:
                binaryWriter.writeDouble(i2, ((Double) obj).doubleValue());
                return;
            case 1:
                binaryWriter.writeFloat(i2, ((Float) obj).floatValue());
                return;
            case 2:
                binaryWriter.writeUInt64(i2, ((Long) obj).longValue());
                return;
            case 3:
                binaryWriter.writeUInt64(i2, ((Long) obj).longValue());
                return;
            case 4:
                binaryWriter.writeInt32(i2, ((Integer) obj).intValue());
                return;
            case 5:
                binaryWriter.writeFixed64(i2, ((Long) obj).longValue());
                return;
            case 6:
                binaryWriter.writeFixed32(i2, ((Integer) obj).intValue());
                return;
            case 7:
                binaryWriter.writeBool(i2, ((Boolean) obj).booleanValue());
                return;
            case 8:
                binaryWriter.writeString(i2, (String) obj);
                return;
            case 9:
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
            case 10:
                binaryWriter.writeMessage(i2, obj);
                return;
            case 11:
                binaryWriter.b(i2, (ByteString) obj);
                return;
            case 12:
                binaryWriter.writeUInt32(i2, ((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof Internal.EnumLite) {
                    binaryWriter.writeInt32(i2, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    binaryWriter.writeInt32(i2, ((Integer) obj).intValue());
                    return;
                }
            case 14:
                binaryWriter.writeFixed32(i2, ((Integer) obj).intValue());
                return;
            case 15:
                binaryWriter.writeFixed64(i2, ((Long) obj).longValue());
                return;
            case 16:
                binaryWriter.writeSInt32(i2, ((Integer) obj).intValue());
                return;
            case 17:
                binaryWriter.writeSInt64(i2, ((Long) obj).longValue());
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(i2, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i2, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int iJ = j();
            p(this, 2, metadata.f4878b, entry.getValue());
            p(this, 1, metadata.f4877a, entry.getKey());
            t(j() - iJ);
            s(i2, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c(i2, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.f4947Y;
    }

    public abstract int j();

    public abstract void k(int i2);

    public abstract void l(boolean z2);

    public abstract void m(int i2);

    public abstract void n(long j);

    public abstract void o(int i2);

    public abstract void q(int i2);

    public abstract void r(long j);

    public abstract void s(int i2, int i3);

    public abstract void t(int i2);

    public abstract void u(long j);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i2, List list, boolean z2) {
        if (!(list instanceof BooleanArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeBool(i2, ((Boolean) list.get(size)).booleanValue());
                }
                return;
            }
            k(list.size() + 10);
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                l(((Boolean) list.get(size2)).booleanValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z2) {
            for (int i3 = booleanArrayList.Z - 1; i3 >= 0; i3--) {
                writeBool(i2, booleanArrayList.getBoolean(i3));
            }
            return;
        }
        k(booleanArrayList.Z + 10);
        int iJ2 = j();
        for (int i4 = booleanArrayList.Z - 1; i4 >= 0; i4--) {
            l(booleanArrayList.getBoolean(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i2, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            b(i2, (ByteString) list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i2, double d) {
        writeFixed64(i2, Double.doubleToRawLongBits(d));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i2, List list, boolean z2) {
        if (!(list instanceof DoubleArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeDouble(i2, ((Double) list.get(size)).doubleValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(8, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                n(Double.doubleToRawLongBits(((Double) list.get(size2)).doubleValue()));
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z2) {
            for (int i3 = doubleArrayList.Z - 1; i3 >= 0; i3--) {
                writeDouble(i2, doubleArrayList.getDouble(i3));
            }
            return;
        }
        k((doubleArrayList.Z * 8) + 10);
        int iJ2 = j();
        for (int i4 = doubleArrayList.Z - 1; i4 >= 0; i4--) {
            n(Double.doubleToRawLongBits(doubleArrayList.getDouble(i4)));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i2, int i3) {
        writeInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i2, List list, boolean z2) {
        writeInt32List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFixed32(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(4, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                m(((Integer) list.get(size2)).intValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.Z - 1; i3 >= 0; i3--) {
                writeFixed32(i2, intArrayList.getInt(i3));
            }
            return;
        }
        k((intArrayList.Z * 4) + 10);
        int iJ2 = j();
        for (int i4 = intArrayList.Z - 1; i4 >= 0; i4--) {
            m(intArrayList.getInt(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFixed64(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(8, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                n(((Long) list.get(size2)).longValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.Z - 1; i3 >= 0; i3--) {
                writeFixed64(i2, longArrayList.getLong(i3));
            }
            return;
        }
        k((longArrayList.Z * 8) + 10);
        int iJ2 = j();
        for (int i4 = longArrayList.Z - 1; i4 >= 0; i4--) {
            n(longArrayList.getLong(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i2, float f) {
        writeFixed32(i2, Float.floatToRawIntBits(f));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i2, List list, boolean z2) {
        if (!(list instanceof FloatArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFloat(i2, ((Float) list.get(size)).floatValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(4, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                m(Float.floatToRawIntBits(((Float) list.get(size2)).floatValue()));
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z2) {
            for (int i3 = floatArrayList.Z - 1; i3 >= 0; i3--) {
                writeFloat(i2, floatArrayList.getFloat(i3));
            }
            return;
        }
        k((floatArrayList.Z * 4) + 10);
        int iJ2 = j();
        for (int i4 = floatArrayList.Z - 1; i4 >= 0; i4--) {
            m(Float.floatToRawIntBits(floatArrayList.getFloat(i4)));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeInt32(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(10, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                o(((Integer) list.get(size2)).intValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.Z - 1; i3 >= 0; i3--) {
                writeInt32(i2, intArrayList.getInt(i3));
            }
            return;
        }
        k((intArrayList.Z * 10) + 10);
        int iJ2 = j();
        for (int i4 = intArrayList.Z - 1; i4 >= 0; i4--) {
            o(intArrayList.getInt(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i2, long j) {
        writeUInt64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i2, List list, boolean z2) {
        writeUInt64List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) {
        s(1, 4);
        if (obj instanceof ByteString) {
            b(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i2);
        s(1, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i2, int i3) {
        writeFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i2, List list, boolean z2) {
        writeFixed32List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i2, long j) {
        writeFixed64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i2, List list, boolean z2) {
        writeFixed64List(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeSInt32(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(5, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                q(((Integer) list.get(size2)).intValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.Z - 1; i3 >= 0; i3--) {
                writeSInt32(i2, intArrayList.getInt(i3));
            }
            return;
        }
        k((intArrayList.Z * 5) + 10);
        int iJ2 = j();
        for (int i4 = intArrayList.Z - 1; i4 >= 0; i4--) {
            q(intArrayList.getInt(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeSInt64(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(10, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                r(((Long) list.get(size2)).longValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.Z - 1; i3 >= 0; i3--) {
                writeSInt64(i2, longArrayList.getLong(i3));
            }
            return;
        }
        k((longArrayList.Z * 10) + 10);
        int iJ2 = j();
        for (int i4 = longArrayList.Z - 1; i4 >= 0; i4--) {
            r(longArrayList.getLong(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i2, List list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i2, (String) list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object raw = lazyStringList.getRaw(size2);
            if (raw instanceof String) {
                writeString(i2, (String) raw);
            } else {
                b(i2, (ByteString) raw);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeUInt32(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(5, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                t(((Integer) list.get(size2)).intValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.Z - 1; i3 >= 0; i3--) {
                writeUInt32(i2, intArrayList.getInt(i3));
            }
            return;
        }
        k((intArrayList.Z * 5) + 10);
        int iJ2 = j();
        for (int i4 = intArrayList.Z - 1; i4 >= 0; i4--) {
            t(intArrayList.getInt(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeUInt64(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            k(android.support.v4.media.a.c(10, 10, list));
            int iJ = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                u(((Long) list.get(size2)).longValue());
            }
            t(j() - iJ);
            s(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.Z - 1; i3 >= 0; i3--) {
                writeUInt64(i2, longArrayList.getLong(i3));
            }
            return;
        }
        k((longArrayList.Z * 10) + 10);
        int iJ2 = j();
        for (int i4 = longArrayList.Z - 1; i4 >= 0; i4--) {
            u(longArrayList.getLong(i4));
        }
        t(j() - iJ2);
        s(i2, 2);
    }
}
