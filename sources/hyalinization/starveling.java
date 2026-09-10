package hyalinization;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class starveling extends androidx.media3.common.audio.saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f28104apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f28105cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f28106formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public byte[] f28107impassible = decarock.grimness.f25081beachfront;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f28108kowloon;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f28109taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f28110triweekly;

    @Override // androidx.media3.common.audio.saneness
    public void beachfront() {
        this.f28107impassible = decarock.grimness.f25081beachfront;
    }

    public void cutely(int i, int i2) {
        this.f28109taiyuan = i;
        this.f28105cutely = i2;
    }

    @Override // androidx.media3.common.audio.saneness
    public AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (attabalVar.f10780dern != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
        }
        this.f28104apical = true;
        return (this.f28109taiyuan == 0 && this.f28105cutely == 0) ? AudioProcessor.attabal.f10778marial : attabalVar;
    }

    @Override // androidx.media3.common.audio.saneness, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.f28110triweekly) > 0) {
            competently(i).put(this.f28107impassible, 0, this.f28110triweekly).flip();
            this.f28110triweekly = 0;
        }
        return super.getOutput();
    }

    public long impromptu() {
        return this.f28108kowloon;
    }

    @Override // androidx.media3.common.audio.saneness, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.f28110triweekly == 0;
    }

    @Override // androidx.media3.common.audio.saneness
    public void marial() {
        if (this.f28104apical) {
            int i = this.f28110triweekly;
            if (i > 0) {
                this.f28108kowloon += (long) (i / this.f10809saneness.f10782wireman);
            }
            this.f28110triweekly = 0;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f28106formularize);
        this.f28108kowloon += (long) (iMin / this.f10809saneness.f10782wireman);
        this.f28106formularize -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f28106formularize > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f28110triweekly + i2) - this.f28107impassible.length;
        ByteBuffer byteBufferCompetently = competently(length);
        int iKowloon = decarock.grimness.kowloon(length, 0, this.f28110triweekly);
        byteBufferCompetently.put(this.f28107impassible, 0, iKowloon);
        int iKowloon2 = decarock.grimness.kowloon(length - iKowloon, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iKowloon2);
        byteBufferCompetently.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iKowloon2;
        int i4 = this.f28110triweekly - iKowloon;
        this.f28110triweekly = i4;
        byte[] bArr = this.f28107impassible;
        System.arraycopy(bArr, iKowloon, bArr, 0, i4);
        byteBuffer.get(this.f28107impassible, this.f28110triweekly, i3);
        this.f28110triweekly += i3;
        byteBufferCompetently.flip();
    }

    public void taiyuan() {
        this.f28108kowloon = 0L;
    }

    @Override // androidx.media3.common.audio.saneness
    public void wireman() {
        if (this.f28104apical) {
            this.f28104apical = false;
            int i = this.f28105cutely;
            int i2 = this.f10809saneness.f10782wireman;
            this.f28107impassible = new byte[i * i2];
            this.f28106formularize = this.f28109taiyuan * i2;
        }
        this.f28110triweekly = 0;
    }
}
