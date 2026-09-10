package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.AudioFormat f17319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.AudioFormat f17320c;
    public AudioProcessor.AudioFormat d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.AudioFormat f17321e;
    public ByteBuffer f;
    public ByteBuffer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17322h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f17286a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f17287e;
        this.d = audioFormat;
        this.f17321e = audioFormat;
        this.f17319b = audioFormat;
        this.f17320c = audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) {
        this.d = audioFormat;
        this.f17321e = b(audioFormat);
        return isActive() ? this.f17321e : AudioProcessor.AudioFormat.f17287e;
    }

    public AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) {
        return AudioProcessor.AudioFormat.f17287e;
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

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.f17286a;
        this.f17322h = false;
        this.f17319b = this.d;
        this.f17320c = this.f17321e;
        c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.f17286a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f17321e != AudioProcessor.AudioFormat.f17287e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return this.f17322h && this.g == AudioProcessor.f17286a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f17322h = true;
        d();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f = AudioProcessor.f17286a;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f17287e;
        this.d = audioFormat;
        this.f17321e = audioFormat;
        this.f17319b = audioFormat;
        this.f17320c = audioFormat;
        e();
    }
}
