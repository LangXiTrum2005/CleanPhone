package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class TrimmingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6184i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6185l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6186n;
    public long o;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f5563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.k = true;
        return (this.f6184i == 0 && this.j == 0) ? AudioProcessor.AudioFormat.f5560e : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void c() {
        if (this.k) {
            this.k = false;
            int i2 = this.j;
            int i3 = this.f5564b.d;
            this.m = new byte[i2 * i3];
            this.f6185l = this.f6184i * i3;
        }
        this.f6186n = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void d() {
        if (this.k) {
            int i2 = this.f6186n;
            if (i2 > 0) {
                this.o += (long) (i2 / this.f5564b.d);
            }
            this.f6186n = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void e() {
        this.m = Util.f;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i2;
        if (super.isEnded() && (i2 = this.f6186n) > 0) {
            f(i2).put(this.m, 0, this.f6186n).flip();
            this.f6186n = 0;
        }
        return super.getOutput();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        return super.isEnded() && this.f6186n == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f6185l);
        this.o += (long) (iMin / this.f5564b.d);
        this.f6185l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f6185l > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.f6186n + i3) - this.m.length;
        ByteBuffer byteBufferF = f(length);
        int iJ = Util.j(length, 0, this.f6186n);
        byteBufferF.put(this.m, 0, iJ);
        int iJ2 = Util.j(length - iJ, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferF.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iJ2;
        int i5 = this.f6186n - iJ;
        this.f6186n = i5;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i5);
        byteBuffer.get(this.m, this.f6186n, i4);
        this.f6186n += i4;
        byteBufferF.flip();
    }
}
