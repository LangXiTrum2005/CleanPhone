package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    public final String o;

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.o = str;
        int i2 = this.g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f5806e;
        Assertions.e(i2 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.g(1024);
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderInputBuffer c() {
        return new SubtitleInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderOutputBuffer d() {
        return new SubtitleOutputBuffer() { // from class: androidx.media3.extractor.text.SimpleSubtitleDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public final void f() {
                SimpleSubtitleDecoder.this.i(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException e(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException f(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) decoderInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.e0;
            byteBuffer.getClass();
            Subtitle subtitleJ = j(byteBuffer.array(), byteBuffer.limit(), z2);
            long j = subtitleInputBuffer.g0;
            long j2 = subtitleInputBuffer.j0;
            subtitleOutputBuffer.f5802Y = j;
            subtitleOutputBuffer.f0 = subtitleJ;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            subtitleOutputBuffer.g0 = j;
            subtitleOutputBuffer.e0 = false;
            return null;
        } catch (SubtitleDecoderException e2) {
            return e2;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return this.o;
    }

    public abstract Subtitle j(byte[] bArr, int i2, boolean z2);

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public final void setPositionUs(long j) {
    }
}
