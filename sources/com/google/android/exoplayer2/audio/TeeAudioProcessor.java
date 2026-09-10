package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class TeeAudioProcessor extends BaseAudioProcessor {

    public interface AudioBufferSink {
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void c() {
        if (isActive()) {
            int i2 = this.f17319b.f17288a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void d() {
        if (isActive()) {
            int i2 = this.f17319b.f17288a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void e() {
        if (isActive()) {
            int i2 = this.f17319b.f17288a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        byteBuffer.asReadOnlyBuffer();
        throw null;
    }
}
