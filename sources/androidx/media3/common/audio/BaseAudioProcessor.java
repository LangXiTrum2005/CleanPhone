package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.AudioFormat f5564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.AudioFormat f5565c;
    public AudioProcessor.AudioFormat d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.AudioFormat f5566e;
    public ByteBuffer f;
    public ByteBuffer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5567h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f5559a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
        this.d = audioFormat;
        this.f5566e = audioFormat;
        this.f5564b = audioFormat;
        this.f5565c = audioFormat;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) {
        this.d = audioFormat;
        this.f5566e = b(audioFormat);
        return isActive() ? this.f5566e : AudioProcessor.AudioFormat.f5560e;
    }

    public AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) {
        return AudioProcessor.AudioFormat.f5560e;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final ByteBuffer f(int i2) {
        if (this.f.capacity() < i2) {
            this.f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.f5559a;
        this.f5567h = false;
        this.f5564b = this.d;
        this.f5565c = this.f5566e;
        c();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.f5559a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f5566e != AudioProcessor.AudioFormat.f5560e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.f5567h && this.g == AudioProcessor.f5559a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f5567h = true;
        d();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f = AudioProcessor.f5559a;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
        this.d = audioFormat;
        this.f5566e = audioFormat;
        this.f5564b = audioFormat;
        this.f5565c = audioFormat;
        e();
    }
}
