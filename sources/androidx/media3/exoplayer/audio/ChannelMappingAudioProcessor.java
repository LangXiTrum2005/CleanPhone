package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f6114i;
    public int[] j;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f6114i;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.f5560e;
        }
        if (audioFormat.f5563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int length = iArr.length;
        int i2 = audioFormat.f5562b;
        boolean z2 = i2 != length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
            }
            z2 |= i4 != i3;
            i3++;
        }
        return z2 ? new AudioProcessor.AudioFormat(audioFormat.f5561a, iArr.length, 2) : AudioProcessor.AudioFormat.f5560e;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void c() {
        this.j = this.f6114i;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void e() {
        this.j = null;
        this.f6114i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.f5564b.d) * this.f5565c.d);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                byteBufferF.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f5564b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
