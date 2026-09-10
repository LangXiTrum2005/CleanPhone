package com.google.common.io;

import com.google.common.primitives.Ints;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    public final byte d() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (-1 != i2) {
            return (byte) i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
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
    public final void readFully(byte[] bArr) {
        int i2 = ByteStreams.f20018a;
        ByteStreams.b(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bD = d();
        byte bD2 = d();
        return Ints.d(d(), d(), bD2, bD);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bD = d();
        byte bD2 = d();
        byte bD3 = d();
        byte bD4 = d();
        byte bD5 = d();
        byte bD6 = d();
        return ((((long) d()) & 255) << 56) | ((((long) d()) & 255) << 48) | ((((long) bD6) & 255) << 40) | ((((long) bD5) & 255) << 32) | ((((long) bD4) & 255) << 24) | ((((long) bD3) & 255) << 16) | ((((long) bD2) & 255) << 8) | (((long) bD) & 255);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 >= 0) {
            return i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return Ints.d((byte) 0, (byte) 0, d(), d());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        return (int) ((FilterInputStream) this).in.skip(i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i3) {
        ByteStreams.b(this, bArr, i2, i3);
    }
}
