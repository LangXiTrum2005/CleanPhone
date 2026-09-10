package androidx.media3.common.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) {
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void c() {
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void d() {
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void e() {
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (super.isEnded()) {
            throw null;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        throw null;
    }
}
