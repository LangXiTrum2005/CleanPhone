package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness implements AudioProcessor {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ByteBuffer f10804beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ByteBuffer f10805competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public AudioProcessor.attabal f10806dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f10807impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public AudioProcessor.attabal f10808marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public AudioProcessor.attabal f10809saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public AudioProcessor.attabal f10810wireman;

    public saneness() {
        ByteBuffer byteBuffer = AudioProcessor.f10777attabal;
        this.f10804beachfront = byteBuffer;
        this.f10805competently = byteBuffer;
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10810wireman = attabalVar;
        this.f10808marial = attabalVar;
        this.f10809saneness = attabalVar;
        this.f10806dern = attabalVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.attabal attabal(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f10810wireman = attabalVar;
        this.f10808marial = dern(attabalVar);
        return isActive() ? this.f10808marial : AudioProcessor.attabal.f10778marial;
    }

    public final ByteBuffer competently(int i) {
        if (this.f10804beachfront.capacity() < i) {
            this.f10804beachfront = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10804beachfront.clear();
        }
        ByteBuffer byteBuffer = this.f10804beachfront;
        this.f10805competently = byteBuffer;
        return byteBuffer;
    }

    public abstract AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f10805competently = AudioProcessor.f10777attabal;
        this.f10807impromptu = false;
        this.f10809saneness = this.f10810wireman;
        this.f10806dern = this.f10808marial;
        wireman();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10805competently;
        this.f10805competently = AudioProcessor.f10777attabal;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f10808marial != AudioProcessor.attabal.f10778marial;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.f10807impromptu && this.f10805competently == AudioProcessor.f10777attabal;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f10807impromptu = true;
        marial();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f10804beachfront = AudioProcessor.f10777attabal;
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10810wireman = attabalVar;
        this.f10808marial = attabalVar;
        this.f10809saneness = attabalVar;
        this.f10806dern = attabalVar;
        beachfront();
    }

    public final boolean saneness() {
        return this.f10805competently.hasRemaining();
    }

    public void beachfront() {
    }

    public void marial() {
    }

    public void wireman() {
    }
}
