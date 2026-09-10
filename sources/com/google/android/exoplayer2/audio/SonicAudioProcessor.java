package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class SonicAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17404c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.AudioFormat f17405e;
    public AudioProcessor.AudioFormat f;
    public AudioProcessor.AudioFormat g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.AudioFormat f17406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17407i;
    public Sonic j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f17408l;
    public ByteBuffer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17409n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17410p;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f17290c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i2 = this.f17403b;
        if (i2 == -1) {
            i2 = audioFormat.f17288a;
        }
        this.f17405e = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i2, audioFormat.f17289b, 2);
        this.f = audioFormat2;
        this.f17407i = true;
        return audioFormat2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.f17405e;
            this.g = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f;
            this.f17406h = audioFormat2;
            if (this.f17407i) {
                this.j = new Sonic(audioFormat.f17288a, audioFormat.f17289b, this.f17404c, this.d, audioFormat2.f17288a);
            } else {
                Sonic sonic = this.j;
                if (sonic != null) {
                    sonic.k = 0;
                    sonic.m = 0;
                    sonic.o = 0;
                    sonic.f17401p = 0;
                    sonic.q = 0;
                    sonic.r = 0;
                    sonic.s = 0;
                    sonic.t = 0;
                    sonic.f17402u = 0;
                    sonic.v = 0;
                }
            }
        }
        this.m = AudioProcessor.f17286a;
        this.f17409n = 0L;
        this.o = 0L;
        this.f17410p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i2 = sonic.m;
            int i3 = sonic.f17394b;
            int i4 = i2 * i3 * 2;
            if (i4 > 0) {
                if (this.k.capacity() < i4) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f17408l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f17408l.clear();
                }
                ShortBuffer shortBuffer = this.f17408l;
                int iMin = Math.min(shortBuffer.remaining() / i3, sonic.m);
                int i5 = iMin * i3;
                shortBuffer.put(sonic.f17399l, 0, i5);
                int i6 = sonic.m - iMin;
                sonic.m = i6;
                short[] sArr = sonic.f17399l;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i3);
                this.o += (long) i4;
                this.k.limit(i4);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.f17286a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f.f17288a != -1) {
            return Math.abs(this.f17404c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f17288a != this.f17405e.f17288a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f17410p) {
            return false;
        }
        Sonic sonic = this.j;
        return sonic == null || (sonic.m * sonic.f17394b) * 2 == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i2 = sonic.k;
            float f = sonic.f17395c;
            float f2 = sonic.d;
            int i3 = sonic.m + ((int) ((((i2 / (f / f2)) + sonic.o) / (sonic.f17396e * f2)) + 0.5f));
            short[] sArr = sonic.j;
            int i4 = sonic.f17397h * 2;
            sonic.j = sonic.c(sArr, i2, i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = sonic.f17394b;
                if (i5 >= i4 * i6) {
                    break;
                }
                sonic.j[(i6 * i2) + i5] = 0;
                i5++;
            }
            sonic.k = i4 + sonic.k;
            sonic.f();
            if (sonic.m > i3) {
                sonic.m = i3;
            }
            sonic.k = 0;
            sonic.r = 0;
            sonic.o = 0;
        }
        this.f17410p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.j;
            sonic.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17409n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i2 = sonic.f17394b;
            int i3 = iRemaining2 / i2;
            short[] sArrC = sonic.c(sonic.j, sonic.k, i3);
            sonic.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, sonic.k * i2, ((i3 * i2) * 2) / 2);
            sonic.k += i3;
            sonic.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f17404c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f17287e;
        this.f17405e = audioFormat;
        this.f = audioFormat;
        this.g = audioFormat;
        this.f17406h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f17286a;
        this.k = byteBuffer;
        this.f17408l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f17403b = -1;
        this.f17407i = false;
        this.j = null;
        this.f17409n = 0L;
        this.o = 0L;
        this.f17410p = false;
    }
}
