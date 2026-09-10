package kotlin.io;

import com.applovin.shadow.okio.Segment;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    public static final void a(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        Intrinsics.f(text, "text");
        Intrinsics.f(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
        Intrinsics.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Segment.SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        Intrinsics.e(byteBufferAllocate, "allocate(...)");
        int i2 = 0;
        int i3 = 0;
        while (i2 < text.length()) {
            int iMin = Math.min(8192 - i3, text.length() - i2);
            int i4 = i2 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.e(cArrArray, "array(...)");
            text.getChars(i2, i4, cArrArray, i3);
            charBufferAllocate.limit(iMin + i3);
            i3 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i4 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i3 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i2 = i4;
        }
    }
}
