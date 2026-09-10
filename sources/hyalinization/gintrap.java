package hyalinization;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap extends androidx.media3.common.audio.saneness {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int[] f28054cutely;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int[] f28055taiyuan;

    @Override // androidx.media3.common.audio.saneness
    public void beachfront() {
        this.f28054cutely = null;
        this.f28055taiyuan = null;
    }

    @Override // androidx.media3.common.audio.saneness
    public AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f28055taiyuan;
        if (iArr == null) {
            return AudioProcessor.attabal.f10778marial;
        }
        if (attabalVar.f10780dern != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
        }
        boolean z = attabalVar.f10781saneness != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= attabalVar.f10781saneness) {
                throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.attabal(attabalVar.f10779attabal, iArr.length, 2) : AudioProcessor.attabal.f10778marial;
    }

    public void impromptu(int[] iArr) {
        this.f28055taiyuan = iArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) decarock.attabal.marial(this.f28054cutely);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferCompetently = competently(((iLimit - iPosition) / this.f10809saneness.f10782wireman) * this.f10806dern.f10782wireman);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferCompetently.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f10809saneness.f10782wireman;
        }
        byteBuffer.position(iLimit);
        byteBufferCompetently.flip();
    }

    @Override // androidx.media3.common.audio.saneness
    public void wireman() {
        this.f28054cutely = this.f28055taiyuan;
    }
}
