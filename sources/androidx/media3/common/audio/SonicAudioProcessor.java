package androidx.media3.common.audio;

import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public class SonicAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5579c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.AudioFormat f5580e;
    public AudioProcessor.AudioFormat f;
    public AudioProcessor.AudioFormat g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.AudioFormat f5581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5582i;
    public Sonic j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f5583l;
    public ByteBuffer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5584n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5585p;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f5563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i2 = this.f5578b;
        if (i2 == -1) {
            i2 = audioFormat.f5561a;
        }
        this.f5580e = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i2, audioFormat.f5562b, 2);
        this.f = audioFormat2;
        this.f5582i = true;
        return audioFormat2;
    }

    public final long b(long j) {
        if (this.o < 1024) {
            return (long) (((double) this.f5579c) * j);
        }
        long j2 = this.f5584n;
        Sonic sonic = this.j;
        sonic.getClass();
        long j3 = j2 - ((long) ((sonic.k * sonic.f5569b) * 2));
        int i2 = this.f5581h.f5561a;
        int i3 = this.g.f5561a;
        return i2 == i3 ? Util.O(j, j3, this.o, RoundingMode.FLOOR) : Util.O(j, j3 * ((long) i2), this.o * ((long) i3), RoundingMode.FLOOR);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.f5580e;
            this.g = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f;
            this.f5581h = audioFormat2;
            if (this.f5582i) {
                this.j = new Sonic(audioFormat.f5561a, audioFormat.f5562b, this.f5579c, this.d, audioFormat2.f5561a);
            } else {
                Sonic sonic = this.j;
                if (sonic != null) {
                    sonic.k = 0;
                    sonic.m = 0;
                    sonic.o = 0;
                    sonic.f5576p = 0;
                    sonic.q = 0;
                    sonic.r = 0;
                    sonic.s = 0;
                    sonic.t = 0;
                    sonic.f5577u = 0;
                    sonic.v = 0;
                }
            }
        }
        this.m = AudioProcessor.f5559a;
        this.f5584n = 0L;
        this.o = 0L;
        this.f5585p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i2 = sonic.m;
            int i3 = sonic.f5569b;
            int i4 = i2 * i3 * 2;
            if (i4 > 0) {
                if (this.k.capacity() < i4) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f5583l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f5583l.clear();
                }
                ShortBuffer shortBuffer = this.f5583l;
                int iMin = Math.min(shortBuffer.remaining() / i3, sonic.m);
                int i5 = iMin * i3;
                shortBuffer.put(sonic.f5574l, 0, i5);
                int i6 = sonic.m - iMin;
                sonic.m = i6;
                short[] sArr = sonic.f5574l;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i3);
                this.o += (long) i4;
                this.k.limit(i4);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.f5559a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f.f5561a != -1) {
            return Math.abs(this.f5579c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f5561a != this.f5580e.f5561a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f5585p) {
            return false;
        }
        Sonic sonic = this.j;
        return sonic == null || (sonic.m * sonic.f5569b) * 2 == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i2 = sonic.k;
            float f = sonic.f5570c;
            float f2 = sonic.d;
            int i3 = sonic.m + ((int) ((((i2 / (f / f2)) + sonic.o) / (sonic.f5571e * f2)) + 0.5f));
            short[] sArr = sonic.j;
            int i4 = sonic.f5572h * 2;
            sonic.j = sonic.c(sArr, i2, i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = sonic.f5569b;
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
        this.f5585p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.j;
            sonic.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f5584n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i2 = sonic.f5569b;
            int i3 = iRemaining2 / i2;
            short[] sArrC = sonic.c(sonic.j, sonic.k, i3);
            sonic.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, sonic.k * i2, ((i3 * i2) * 2) / 2);
            sonic.k += i3;
            sonic.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f5579c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
        this.f5580e = audioFormat;
        this.f = audioFormat;
        this.g = audioFormat;
        this.f5581h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f5559a;
        this.k = byteBuffer;
        this.f5583l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f5578b = -1;
        this.f5582i = false;
        this.j = null;
        this.f5584n = 0L;
        this.o = 0L;
        this.f5585p = false;
    }
}
