package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class TeeAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    public interface AudioBufferSink {
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void c() {
        if (isActive()) {
            int i2 = this.f5564b.f5561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void d() {
        if (isActive()) {
            int i2 = this.f5564b.f5561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void e() {
        if (isActive()) {
            int i2 = this.f5564b.f5561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        int i2 = Util.f5683a;
        byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        throw null;
    }
}
