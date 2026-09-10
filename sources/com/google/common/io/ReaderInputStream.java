package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ReaderInputStream extends InputStream {
    public CharBuffer X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ByteBuffer f20026Y;
    public boolean Z;
    public boolean e0;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(null) != 1) {
            return -1;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws CharacterCodingException {
        Preconditions.l(i2, i2 + i3, bArr.length);
        if (i3 == 0) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            if (this.Z) {
                int iMin = Math.min(i3 - i4, this.f20026Y.remaining());
                this.f20026Y.get(bArr, i2 + i4, iMin);
                i4 += iMin;
                if (i4 == i3 || this.e0) {
                    break;
                }
                this.Z = false;
                this.f20026Y.clear();
            }
            while (true) {
                if (!this.e0) {
                    throw null;
                }
                CoderResult coderResult = CoderResult.UNDERFLOW;
                if (coderResult.isOverflow()) {
                    break;
                }
                if (coderResult.isUnderflow()) {
                    CharBuffer charBuffer = this.X;
                    if (charBuffer.capacity() - charBuffer.limit() == 0) {
                        if (this.X.position() > 0) {
                            this.X.compact().flip();
                        } else {
                            CharBuffer charBuffer2 = this.X;
                            CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer2.array(), charBuffer2.capacity() * 2));
                            charBufferWrap.position(charBuffer2.position());
                            charBufferWrap.limit(charBuffer2.limit());
                            this.X = charBufferWrap;
                        }
                    }
                    this.X.limit();
                    this.X.array();
                    CharBuffer charBuffer3 = this.X;
                    charBuffer3.capacity();
                    charBuffer3.limit();
                    throw null;
                }
                if (coderResult.isError()) {
                    coderResult.throwException();
                    return 0;
                }
            }
            this.f20026Y.flip();
            if (this.f20026Y.remaining() == 0) {
                this.f20026Y = ByteBuffer.allocate(this.f20026Y.capacity() * 2);
            } else {
                this.Z = true;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }
}
