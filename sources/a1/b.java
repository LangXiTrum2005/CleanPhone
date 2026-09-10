package a1;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f3319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f3321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f3322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3323e;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f3323e = bArr.length;
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f3319a;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f3322d == null) {
                    this.f3322d = new byte[Segment.SIZE];
                }
                iSkip = dataInputStream.read(this.f3322d, 0, Math.min(Segment.SIZE, i12));
                if (iSkip == -1) {
                    throw new EOFException(defpackage.e.h(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f3320b += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3319a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f3320b++;
        return this.f3319a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f3320b++;
        return this.f3319a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f3320b++;
        int i10 = this.f3319a.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f3320b += 2;
        return this.f3319a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f3320b += i11;
        this.f3319a.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f3320b += 4;
        DataInputStream dataInputStream = this.f3319a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3321c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f3321c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f3320b += 8;
        DataInputStream dataInputStream = this.f3319a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3321c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
        }
        throw new IOException("Invalid byte order: " + this.f3321c);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i10;
        this.f3320b += 2;
        DataInputStream dataInputStream = this.f3319a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3321c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            i10 = (i12 << 8) + i11;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f3321c);
            }
            i10 = (i11 << 8) + i12;
        }
        return (short) i10;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f3320b += 2;
        return this.f3319a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f3320b++;
        return this.f3319a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f3320b += 2;
        DataInputStream dataInputStream = this.f3319a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3321c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f3321c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f3319a.read(bArr, i10, i11);
        this.f3320b += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f3320b += bArr.length;
        this.f3319a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f3319a = dataInputStream;
        dataInputStream.mark(0);
        this.f3320b = 0;
        this.f3321c = byteOrder;
        this.f3323e = inputStream instanceof b ? ((b) inputStream).f3323e : -1;
    }
}
