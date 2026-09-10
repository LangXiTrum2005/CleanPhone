package com.startapp.simple.bloomfilter.codec;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.d9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseNCodec {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = PAD_DEFAULT;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        public String toString() {
            String simpleName = getClass().getSimpleName();
            String string = Arrays.toString(this.buffer);
            int i2 = this.currentLinePos;
            boolean z2 = this.eof;
            int i3 = this.ibitWorkArea;
            long j = this.lbitWorkArea;
            int i4 = this.modulus;
            int i5 = this.pos;
            int i6 = this.readPos;
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[buffer=");
            sb.append(string);
            sb.append(", currentLinePos=");
            sb.append(i2);
            sb.append(", eof=");
            sb.append(z2);
            sb.append(", ibitWorkArea=");
            sb.append(i3);
            a.A(sb, ", lbitWorkArea=", j, ", modulus=");
            a.y(sb, i4, ", pos=", i5, ", readPos=");
            return android.support.v4.media.a.i(i6, d9.i.f24752e, sb);
        }
    }

    public BaseNCodec(int i2, int i3, int i4, int i5) {
        this.unencodedBlockSize = i2;
        this.encodedBlockSize = i3;
        this.lineLength = (i4 <= 0 || i5 <= 0) ? 0 : (i4 / i3) * i3;
        this.chunkSeparatorLength = i5;
    }

    public static boolean isWhiteSpace(byte b2) {
        return b2 == 9 || b2 == 10 || b2 == 13 || b2 == 32;
    }

    private byte[] resizeBuffer(Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            context.buffer = bArr2;
        }
        return context.buffer;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (61 == b2 || isInAlphabet(b2)) {
                return true;
            }
        }
        return false;
    }

    public Object decode(Object obj) throws RuntimeException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new RuntimeException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i2, int i3, Context context);

    public Object encode(Object obj) throws RuntimeException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new RuntimeException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i2, int i3, Context context);

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i2, Context context) {
        byte[] bArr = context.buffer;
        return (bArr == null || bArr.length < context.pos + i2) ? resizeBuffer(context) : bArr;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.unencodedBlockSize;
        long j = ((long) (((length + i2) - 1) / i2)) * ((long) this.encodedBlockSize);
        int i3 = this.lineLength;
        return i3 > 0 ? ((((((long) i3) + j) - 1) / ((long) i3)) * ((long) this.chunkSeparatorLength)) + j : j;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b2);

    public boolean isInAlphabet(byte[] bArr, boolean z2) {
        byte b2;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (!isInAlphabet(bArr[i2]) && (!z2 || ((b2 = bArr[i2]) != 61 && !isWhiteSpace(b2)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i2, int i3, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int iMin = Math.min(available(context), i3);
        System.arraycopy(context.buffer, context.readPos, bArr, i2, iMin);
        int i4 = context.readPos + iMin;
        context.readPos = i4;
        if (i4 >= context.pos) {
            context.buffer = null;
        }
        return iMin;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i2 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i2 = context.pos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }
}
