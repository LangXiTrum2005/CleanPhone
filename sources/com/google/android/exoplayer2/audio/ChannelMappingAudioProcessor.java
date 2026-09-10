package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ChannelMappingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f17323i;
    public int[] j;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f17323i;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.f17287e;
        }
        if (audioFormat.f17290c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int length = iArr.length;
        int i2 = audioFormat.f17289b;
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
        return z2 ? new AudioProcessor.AudioFormat(audioFormat.f17288a, iArr.length, 2) : AudioProcessor.AudioFormat.f17287e;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void c() {
        this.j = this.f17323i;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void e() {
        this.j = null;
        this.f17323i = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.f17319b.d) * this.f17320c.d);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                byteBufferF.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f17319b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
