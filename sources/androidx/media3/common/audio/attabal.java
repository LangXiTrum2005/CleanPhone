package androidx.media3.common.audio;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AudioProcessingPipeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f10783attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f10784beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public AudioProcessor.attabal f10786marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public AudioProcessor.attabal f10788wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<AudioProcessor> f10787saneness = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ByteBuffer[] f10785dern = new ByteBuffer[0];

    public attabal(ImmutableList<AudioProcessor> immutableList) {
        this.f10783attabal = immutableList;
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10788wireman = attabalVar;
        this.f10786marial = attabalVar;
        this.f10784beachfront = false;
    }

    public AudioProcessor.attabal attabal(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (attabalVar.equals(AudioProcessor.attabal.f10778marial)) {
            throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
        }
        for (int i = 0; i < this.f10783attabal.size(); i++) {
            AudioProcessor audioProcessor = this.f10783attabal.get(i);
            AudioProcessor.attabal attabalVarAttabal = audioProcessor.attabal(attabalVar);
            if (audioProcessor.isActive()) {
                decarock.attabal.competently(!attabalVarAttabal.equals(AudioProcessor.attabal.f10778marial));
                attabalVar = attabalVarAttabal;
            }
        }
        this.f10786marial = attabalVar;
        return attabalVar;
    }

    public boolean beachfront() {
        return !this.f10787saneness.isEmpty();
    }

    public final void competently(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= dern(); i++) {
                if (!this.f10785dern[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f10787saneness.get(i);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f10785dern[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f10777attabal;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.f10785dern[i] = audioProcessor.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f10785dern[i].hasRemaining();
                    } else if (!this.f10785dern[i].hasRemaining() && i < dern()) {
                        this.f10787saneness.get(i + 1).queueEndOfStream();
                    }
                }
            }
        }
    }

    public void cutely() {
        for (int i = 0; i < this.f10783attabal.size(); i++) {
            AudioProcessor audioProcessor = this.f10783attabal.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f10785dern = new ByteBuffer[0];
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10788wireman = attabalVar;
        this.f10786marial = attabalVar;
        this.f10784beachfront = false;
    }

    public final int dern() {
        return this.f10785dern.length - 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        if (this.f10783attabal.size() != attabalVar.f10783attabal.size()) {
            return false;
        }
        for (int i = 0; i < this.f10783attabal.size(); i++) {
            if (this.f10783attabal.get(i) != attabalVar.f10783attabal.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f10783attabal.hashCode();
    }

    public void impromptu() {
        if (!beachfront() || this.f10784beachfront) {
            return;
        }
        this.f10784beachfront = true;
        this.f10787saneness.get(0).queueEndOfStream();
    }

    public boolean marial() {
        return this.f10784beachfront && this.f10787saneness.get(dern()).isEnded() && !this.f10785dern[dern()].hasRemaining();
    }

    public void saneness() {
        this.f10787saneness.clear();
        this.f10788wireman = this.f10786marial;
        this.f10784beachfront = false;
        for (int i = 0; i < this.f10783attabal.size(); i++) {
            AudioProcessor audioProcessor = this.f10783attabal.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f10787saneness.add(audioProcessor);
            }
        }
        this.f10785dern = new ByteBuffer[this.f10787saneness.size()];
        for (int i2 = 0; i2 <= dern(); i2++) {
            this.f10785dern[i2] = this.f10787saneness.get(i2).getOutput();
        }
    }

    public void taiyuan(ByteBuffer byteBuffer) {
        if (!beachfront() || this.f10784beachfront) {
            return;
        }
        competently(byteBuffer);
    }

    public ByteBuffer wireman() {
        if (!beachfront()) {
            return AudioProcessor.f10777attabal;
        }
        ByteBuffer byteBuffer = this.f10785dern[dern()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        competently(AudioProcessor.f10777attabal);
        return this.f10785dern[dern()];
    }
}
