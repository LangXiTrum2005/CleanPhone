package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f18468n;

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.f18468n = str;
        int i2 = this.g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f17442e;
        Assertions.d(i2 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.g(1024);
        }
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final DecoderOutputBuffer a() {
        return new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.SimpleSubtitleDecoder.1
            @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
            public final void d() {
                SimpleSubtitleDecoder simpleSubtitleDecoder = SimpleSubtitleDecoder.this;
                synchronized (simpleSubtitleDecoder.f17440b) {
                    this.X = 0;
                    this.e0 = null;
                    int i2 = simpleSubtitleDecoder.f17443h;
                    simpleSubtitleDecoder.f17443h = i2 + 1;
                    simpleSubtitleDecoder.f[i2] = this;
                    if (!simpleSubtitleDecoder.f17441c.isEmpty() && simpleSubtitleDecoder.f17443h > 0) {
                        simpleSubtitleDecoder.f17440b.notify();
                    }
                }
            }
        };
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final SubtitleDecoderException b(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final SubtitleDecoderException c(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) decoderInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.Z;
            byteBuffer.getClass();
            subtitleOutputBuffer.f(subtitleInputBuffer.f0, e(byteBuffer.array(), byteBuffer.limit(), z2), subtitleInputBuffer.i0);
            subtitleOutputBuffer.X &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e2) {
            return e2;
        }
    }

    public abstract Subtitle e(byte[] bArr, int i2, boolean z2);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return this.f18468n;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public final void setPositionUs(long j) {
    }
}
