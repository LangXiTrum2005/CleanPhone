package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class TrimmingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17411i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17412l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17413n;
    public long o;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f17290c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.k = true;
        return (this.f17411i == 0 && this.j == 0) ? AudioProcessor.AudioFormat.f17287e : audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void c() {
        if (this.k) {
            this.k = false;
            int i2 = this.j;
            int i3 = this.f17319b.d;
            this.m = new byte[i2 * i3];
            this.f17412l = this.f17411i * i3;
        }
        this.f17413n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void d() {
        if (this.k) {
            int i2 = this.f17413n;
            if (i2 > 0) {
                this.o += (long) (i2 / this.f17319b.d);
            }
            this.f17413n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void e() {
        this.m = Util.f;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i2;
        if (super.isEnded() && (i2 = this.f17413n) > 0) {
            f(i2).put(this.m, 0, this.f17413n).flip();
            this.f17413n = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        return super.isEnded() && this.f17413n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f17412l);
        this.o += (long) (iMin / this.f17319b.d);
        this.f17412l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f17412l > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.f17413n + i3) - this.m.length;
        ByteBuffer byteBufferF = f(length);
        int iJ = Util.j(length, 0, this.f17413n);
        byteBufferF.put(this.m, 0, iJ);
        int iJ2 = Util.j(length - iJ, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferF.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iJ2;
        int i5 = this.f17413n - iJ;
        this.f17413n = i5;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i5);
        byteBuffer.get(this.m, this.f17413n, i4);
        this.f17413n += i4;
        byteBufferF.flip();
    }
}
