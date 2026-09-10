package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessingPipeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5557b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f5558c = new ByteBuffer[0];
    public boolean d;

    public AudioProcessingPipeline(ImmutableList immutableList) {
        this.f5556a = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
        this.d = false;
    }

    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.equals(AudioProcessor.AudioFormat.f5560e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f5556a;
            if (i2 >= immutableList.size()) {
                return audioFormat;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i2);
            AudioProcessor.AudioFormat audioFormatA = audioProcessor.a(audioFormat);
            if (audioProcessor.isActive()) {
                Assertions.e(!audioFormatA.equals(AudioProcessor.AudioFormat.f5560e));
                audioFormat = audioFormatA;
            }
            i2++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f5557b;
        arrayList.clear();
        this.d = false;
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f5556a;
            if (i2 >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i2);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i2++;
        }
        this.f5558c = new ByteBuffer[arrayList.size()];
        for (int i3 = 0; i3 <= c(); i3++) {
            this.f5558c[i3] = ((AudioProcessor) arrayList.get(i3)).getOutput();
        }
    }

    public final int c() {
        return this.f5558c.length - 1;
    }

    public final boolean d() {
        return this.d && ((AudioProcessor) this.f5557b.get(c())).isEnded() && !this.f5558c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f5557b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        ImmutableList immutableList = this.f5556a;
        if (immutableList.size() != audioProcessingPipeline.f5556a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            if (immutableList.get(i2) != audioProcessingPipeline.f5556a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z2;
        for (boolean z3 = true; z3; z3 = z2) {
            z2 = false;
            for (int i2 = 0; i2 <= c(); i2++) {
                if (!this.f5558c[i2].hasRemaining()) {
                    ArrayList arrayList = this.f5557b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i2);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.f5558c[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f5559a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.f5558c[i2] = audioProcessor.getOutput();
                        z2 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f5558c[i2].hasRemaining();
                    } else if (!this.f5558c[i2].hasRemaining() && i2 < c()) {
                        ((AudioProcessor) arrayList.get(i2 + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f5556a.hashCode();
    }
}
