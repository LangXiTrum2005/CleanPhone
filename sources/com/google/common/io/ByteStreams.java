package com.google.common.io;

import com.applovin.shadow.okio.Segment;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ByteStreams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20018a = 0;

    /* JADX INFO: renamed from: com.google.common.io.ByteStreams$1, reason: invalid class name */
    public class AnonymousClass1 extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            Preconditions.l(i2, i3 + i2, bArr.length);
        }
    }

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        @Override // java.io.DataInput
        public final boolean readBoolean() {
            throw null;
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            throw null;
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            throw null;
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readInt() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            throw null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            throw null;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i2) {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        @Override // java.io.DataOutput
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBoolean(boolean z2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeByte(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBytes(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChar(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChars(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeDouble(double d) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeFloat(float f) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeInt(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeLong(long j) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeShort(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeUTF(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    static {
        new AnonymousClass1();
    }

    public static byte[] a(int i2, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void b(LittleEndianDataInputStream littleEndianDataInputStream, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.k("len (", i3, ") cannot be negative"));
        }
        Preconditions.l(i2, i2 + i3, bArr.length);
        int i4 = 0;
        while (i4 < i3) {
            int i5 = littleEndianDataInputStream.read(bArr, i2 + i4, i3 - i4);
            if (i5 == -1) {
                break;
            } else {
                i4 += i5;
            }
        }
        if (i4 != i3) {
            throw new EOFException(androidx.datastore.preferences.protobuf.a.e(i4, i3, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = inputStream.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return a(i2, arrayDeque);
                }
                i3 += i4;
                i2 += i4;
            }
            iMin = Ints.e(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {
        public long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public long f20019Y;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.X);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f20019Y = this.X;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.X == 0) {
                return -1;
            }
            int i2 = ((FilterInputStream) this).in.read();
            if (i2 != -1) {
                this.X--;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f20019Y == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.X = this.f20019Y;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.X));
            this.X -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            long j = this.X;
            if (j == 0) {
                return -1;
            }
            int i4 = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j));
            if (i4 != -1) {
                this.X -= (long) i4;
            }
            return i4;
        }
    }
}
