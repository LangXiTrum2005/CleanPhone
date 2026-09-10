package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44197c = 0;
    public final OutputStream d;

    public static class OutOfSpaceException extends IOException {
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.f44195a = bArr;
        this.f44196b = bArr.length;
    }

    public static int a(int i2, int i3) {
        return c(i3) + h(i2);
    }

    public static int b(int i2, int i3) {
        return c(i3) + h(i2);
    }

    public static int c(int i2) {
        if (i2 >= 0) {
            return f(i2);
        }
        return 10;
    }

    public static int d(int i2, MessageLite messageLite) {
        return e(messageLite) + h(i2);
    }

    public static int e(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i2) {
        return f(i2 << 3);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i2) {
        return new CodedOutputStream(outputStream, new byte[i2]);
    }

    public final void i() throws IOException {
        if (this.d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.f44195a, 0, this.f44197c);
        this.f44197c = 0;
    }

    public final void l(int i2, int i3) {
        x(i2, 0);
        n(i3);
    }

    public final void m(int i2, int i3) {
        x(i2, 0);
        n(i3);
    }

    public final void n(int i2) {
        if (i2 >= 0) {
            v(i2);
        } else {
            w(i2);
        }
    }

    public final void o(int i2, MessageLite messageLite) {
        x(i2, 2);
        p(messageLite);
    }

    public final void p(MessageLite messageLite) {
        v(messageLite.getSerializedSize());
        messageLite.b(this);
    }

    public final void q(int i2) {
        byte b2 = (byte) i2;
        if (this.f44197c == this.f44196b) {
            k();
        }
        int i3 = this.f44197c;
        this.f44197c = i3 + 1;
        this.f44195a[i3] = b2;
    }

    public final void r(ByteString byteString) {
        int size = byteString.size();
        int i2 = this.f44197c;
        int i3 = this.f44196b;
        int i4 = i3 - i2;
        byte[] bArr = this.f44195a;
        if (i4 >= size) {
            byteString.e(bArr, 0, i2, size);
            this.f44197c += size;
            return;
        }
        byteString.e(bArr, 0, i2, i4);
        int i5 = size - i4;
        this.f44197c = i3;
        k();
        if (i5 <= i3) {
            byteString.e(bArr, i4, 0, i5);
            this.f44197c = i5;
            return;
        }
        if (i4 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i5 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i5);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i6 = i4 + i5;
        if (i6 <= byteString.size()) {
            if (i5 > 0) {
                byteString.w(this.d, i4, i5);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i6);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i2 = this.f44197c;
        int i3 = this.f44196b;
        int i4 = i3 - i2;
        byte[] bArr2 = this.f44195a;
        if (i4 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.f44197c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i4);
        int i5 = length - i4;
        this.f44197c = i3;
        k();
        if (i5 > i3) {
            this.d.write(bArr, i4, i5);
        } else {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.f44197c = i5;
        }
    }

    public final void t(int i2) {
        q(i2 & 255);
        q((i2 >> 8) & 255);
        q((i2 >> 16) & 255);
        q((i2 >> 24) & 255);
    }

    public final void u(long j) {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public final void v(int i2) {
        while ((i2 & (-128)) != 0) {
            q((i2 & 127) | 128);
            i2 >>>= 7;
        }
        q(i2);
    }

    public final void w(long j) {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        q((int) j);
    }

    public final void x(int i2, int i3) {
        v((i2 << 3) | i3);
    }
}
