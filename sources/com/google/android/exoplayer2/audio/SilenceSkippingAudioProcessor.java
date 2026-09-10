package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17389i = 150000;
    public final long j = 20000;
    public final short k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17390l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f17391n;
    public byte[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17392p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public SilenceSkippingAudioProcessor() {
        byte[] bArr = Util.f;
        this.f17391n = bArr;
        this.o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f17290c == 2) {
            return this.m ? audioFormat : AudioProcessor.AudioFormat.f17287e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void c() {
        if (this.m) {
            AudioProcessor.AudioFormat audioFormat = this.f17319b;
            int i2 = audioFormat.d;
            this.f17390l = i2;
            int i3 = audioFormat.f17288a;
            int i4 = ((int) ((this.f17389i * ((long) i3)) / 1000000)) * i2;
            if (this.f17391n.length != i4) {
                this.f17391n = new byte[i4];
            }
            int i5 = ((int) ((this.j * ((long) i3)) / 1000000)) * i2;
            this.r = i5;
            if (this.o.length != i5) {
                this.o = new byte[i5];
            }
        }
        this.f17392p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void d() {
        int i2 = this.q;
        if (i2 > 0) {
            h(this.f17391n, i2);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.r / this.f17390l);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void e() {
        this.m = false;
        this.r = 0;
        byte[] bArr = Util.f;
        this.f17391n = bArr;
        this.o = bArr;
    }

    public final int g(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i2 = this.f17390l;
                return (iPosition / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    public final void h(byte[] bArr, int i2) {
        f(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.s = true;
        }
    }

    public final void i(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.r);
        int i3 = this.r - iMin;
        System.arraycopy(bArr, i2 - i3, this.o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.o, i3, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i2 = this.f17392p;
            if (i2 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f17391n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i3 = this.f17390l;
                            iPosition = androidx.datastore.preferences.protobuf.a.a(iLimit2, i3, i3, i3);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f17392p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    f(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i2 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iG = g(byteBuffer);
                int iPosition2 = iG - byteBuffer.position();
                byte[] bArr = this.f17391n;
                int length = bArr.length;
                int i4 = this.q;
                int i5 = length - i4;
                if (iG >= iLimit3 || iPosition2 >= i5) {
                    int iMin = Math.min(iPosition2, i5);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f17391n, this.q, iMin);
                    int i6 = this.q + iMin;
                    this.q = i6;
                    byte[] bArr2 = this.f17391n;
                    if (i6 == bArr2.length) {
                        if (this.s) {
                            h(bArr2, this.r);
                            this.t += (long) ((this.q - (this.r * 2)) / this.f17390l);
                        } else {
                            this.t += (long) ((i6 - this.r) / this.f17390l);
                        }
                        i(byteBuffer, this.f17391n, this.q);
                        this.q = 0;
                        this.f17392p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    h(bArr, i4);
                    this.q = 0;
                    this.f17392p = 0;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iG2 = g(byteBuffer);
                byteBuffer.limit(iG2);
                this.t += (long) (byteBuffer.remaining() / this.f17390l);
                i(byteBuffer, this.o, this.r);
                if (iG2 < iLimit4) {
                    h(this.o, this.r);
                    this.f17392p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }
}
