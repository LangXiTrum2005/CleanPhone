package kotlinx.serialization.json.internal;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.v0.k;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\u0011\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000bH\u0082\bJ\u0011\u0010\u0013\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000bH\u0082\bJ\t\u0010\"\u001a\u00020\u000bH\u0082\bJ\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "stream", "Ljava/io/OutputStream;", "<init>", "(Ljava/io/OutputStream;)V", "buffer", "", "charArray", "", "indexInBuffer", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "appendStringSlowPath", "currentSize", k.f38992h, "ensureTotalCapacity", "oldSize", "additional", "release", "flush", "ensure", "bytesCount", "byte", "rest", "writeUtf8", "count", "writeUtf8CodePoint", "codePoint", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonToJavaStreamWriter implements InternalJsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final OutputStream stream;

    public JsonToJavaStreamWriter(OutputStream stream) {
        Intrinsics.f(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int currentSize, String string) throws IOException {
        byte b2;
        int length = string.length();
        for (int i2 = currentSize - 1; i2 < length; i2++) {
            int iEnsureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char cCharAt = string.charAt(i2);
            if (cCharAt >= StringOpsKt.getESCAPE_MARKERS().length || (b2 = StringOpsKt.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i3 = iEnsureTotalCapacity + 1;
                this.charArray[iEnsureTotalCapacity] = cCharAt;
                currentSize = i3;
            } else if (b2 == 1) {
                String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                Intrinsics.c(str);
                int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str.length());
                str.getChars(0, str.length(), this.charArray, iEnsureTotalCapacity2);
                currentSize = str.length() + iEnsureTotalCapacity2;
            } else {
                char[] cArr = this.charArray;
                cArr[iEnsureTotalCapacity] = '\\';
                cArr[iEnsureTotalCapacity + 1] = (char) b2;
                currentSize = iEnsureTotalCapacity + 2;
            }
        }
        ensureTotalCapacity(currentSize, 1);
        char[] cArr2 = this.charArray;
        cArr2[currentSize] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr2, currentSize + 1);
        flush();
    }

    private final void ensure(int bytesCount) throws IOException {
        if (this.buffer.length - this.indexInBuffer < bytesCount) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i2 = additional + oldSize;
        char[] cArr = this.charArray;
        if (cArr.length <= i2) {
            int i3 = oldSize * 2;
            if (i2 < i3) {
                i2 = i3;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i2);
            Intrinsics.e(cArrCopyOf, "copyOf(...)");
            this.charArray = cArrCopyOf;
        }
        return oldSize;
    }

    private final void flush() throws IOException {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] string, int count) throws IOException {
        if (count < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (count > string.length) {
            StringBuilder sbU = android.support.v4.media.a.u(count, "count > string.length: ", " > ");
            sbU.append(string.length);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i2 = 0;
        while (i2 < count) {
            char c2 = string[i2];
            if (c2 < 128) {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr = this.buffer;
                int i3 = this.indexInBuffer;
                int i4 = i3 + 1;
                this.indexInBuffer = i4;
                bArr[i3] = (byte) c2;
                i2++;
                int iMin = Math.min(count, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c3 = string[i2];
                    if (c3 >= 128) {
                        break;
                    }
                    byte[] bArr2 = this.buffer;
                    int i5 = this.indexInBuffer;
                    this.indexInBuffer = i5 + 1;
                    bArr2[i5] = (byte) c3;
                    i2++;
                }
            } else {
                if (c2 < 2048) {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    int i6 = (c2 >> 6) | PsExtractor.AUDIO_STREAM;
                    byte[] bArr3 = this.buffer;
                    int i7 = this.indexInBuffer;
                    int i8 = i7 + 1;
                    this.indexInBuffer = i8;
                    bArr3[i7] = (byte) i6;
                    this.indexInBuffer = i7 + 2;
                    bArr3[i8] = (byte) ((c2 & '?') | 128);
                } else if (c2 < 55296 || c2 > 57343) {
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    byte[] bArr4 = this.buffer;
                    int i9 = this.indexInBuffer;
                    int i10 = i9 + 1;
                    this.indexInBuffer = i10;
                    bArr4[i9] = (byte) ((c2 >> '\f') | 224);
                    int i11 = i9 + 2;
                    this.indexInBuffer = i11;
                    bArr4[i10] = (byte) (((c2 >> 6) & 63) | 128);
                    this.indexInBuffer = i9 + 3;
                    bArr4[i11] = (byte) ((c2 & '?') | 128);
                } else {
                    int i12 = i2 + 1;
                    char c4 = i12 < count ? string[i12] : (char) 0;
                    if (c2 > 56319 || 56320 > c4 || c4 >= 57344) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i13 = this.indexInBuffer;
                        this.indexInBuffer = i13 + 1;
                        bArr5[i13] = (byte) 63;
                        i2 = i12;
                    } else {
                        int i14 = (((c2 & 1023) << 10) | (c4 & 1023)) + 65536;
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        int i15 = (i14 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
                        byte[] bArr6 = this.buffer;
                        int i16 = this.indexInBuffer;
                        int i17 = i16 + 1;
                        this.indexInBuffer = i17;
                        bArr6[i16] = (byte) i15;
                        int i18 = i16 + 2;
                        this.indexInBuffer = i18;
                        bArr6[i17] = (byte) (((i14 >> 12) & 63) | 128);
                        int i19 = i16 + 3;
                        this.indexInBuffer = i19;
                        bArr6[i18] = (byte) (((i14 >> 6) & 63) | 128);
                        this.indexInBuffer = i16 + 4;
                        bArr6[i19] = (byte) ((i14 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    private final void writeUtf8CodePoint(int codePoint) throws IOException {
        if (codePoint < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i2 = this.indexInBuffer;
            this.indexInBuffer = i2 + 1;
            bArr[i2] = (byte) codePoint;
            return;
        }
        if (codePoint < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            int i3 = (codePoint >> 6) | PsExtractor.AUDIO_STREAM;
            byte[] bArr2 = this.buffer;
            int i4 = this.indexInBuffer;
            int i5 = i4 + 1;
            this.indexInBuffer = i5;
            bArr2[i4] = (byte) i3;
            this.indexInBuffer = i4 + 2;
            bArr2[i5] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i6 = this.indexInBuffer;
            this.indexInBuffer = i6 + 1;
            bArr3[i6] = (byte) 63;
            return;
        }
        if (codePoint < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.indexInBuffer;
            int i8 = i7 + 1;
            this.indexInBuffer = i8;
            bArr4[i7] = (byte) ((codePoint >> 12) | 224);
            int i9 = i7 + 2;
            this.indexInBuffer = i9;
            bArr4[i8] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i7 + 3;
            bArr4[i9] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (codePoint > 1114111) {
            throw new JsonEncodingException(android.support.v4.media.a.h(codePoint, "Unexpected code point: "));
        }
        if (this.buffer.length - this.indexInBuffer < 4) {
            flush();
        }
        int i10 = (codePoint >> 18) | PsExtractor.VIDEO_STREAM_MASK;
        byte[] bArr5 = this.buffer;
        int i11 = this.indexInBuffer;
        int i12 = i11 + 1;
        this.indexInBuffer = i12;
        bArr5[i11] = (byte) i10;
        int i13 = i11 + 2;
        this.indexInBuffer = i13;
        bArr5[i12] = (byte) (((codePoint >> 12) & 63) | 128);
        int i14 = i11 + 3;
        this.indexInBuffer = i14;
        bArr5[i13] = (byte) (((codePoint >> 6) & 63) | 128);
        this.indexInBuffer = i11 + 4;
        bArr5[i14] = (byte) ((codePoint & 63) | 128);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() throws IOException {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(String text) throws IOException {
        Intrinsics.f(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c2) throws IOException {
        writeUtf8CodePoint(c2);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) throws IOException {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(String text) throws IOException {
        Intrinsics.f(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = AbstractJsonLexerKt.STRING;
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        for (int i3 = 1; i3 < i2; i3++) {
            char c2 = cArr[i3];
            if (c2 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c2] != 0) {
                appendStringSlowPath(i3, text);
                return;
            }
        }
        cArr[i2] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void write(int i2) {
        byte[] bArr = this.buffer;
        int i3 = this.indexInBuffer;
        this.indexInBuffer = i3 + 1;
        bArr[i3] = (byte) i2;
    }
}
