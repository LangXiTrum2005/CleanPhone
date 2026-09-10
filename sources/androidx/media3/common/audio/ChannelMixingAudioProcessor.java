package androidx.media3.common.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f5563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int i2 = this.f5564b.f5562b;
        throw null;
    }
}
