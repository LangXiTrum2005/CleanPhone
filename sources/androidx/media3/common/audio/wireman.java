package androidx.media3.common.audio;

import com.inmobi.media.core.config.models.AdConfig;
import decarock.grimness;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ToInt16PcmAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman extends saneness {
    @Override // androidx.media3.common.audio.saneness
    public AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = attabalVar.f10780dern;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new AudioProcessor.attabal(attabalVar.f10779attabal, attabalVar.f10781saneness, 2) : AudioProcessor.attabal.f10778marial;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f10809saneness.f10780dern;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferCompetently = competently(i);
        int i3 = this.f10809saneness.f10780dern;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferCompetently.put((byte) 0);
                byteBufferCompetently.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sTriweekly = (short) (grimness.triweekly(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferCompetently.put((byte) (sTriweekly & 255));
                byteBufferCompetently.put((byte) ((sTriweekly >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferCompetently.put(byteBuffer.get(iPosition + 1));
                byteBufferCompetently.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferCompetently.put(byteBuffer.get(iPosition + 2));
                byteBufferCompetently.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferCompetently.put(byteBuffer.get(iPosition + 1));
                byteBufferCompetently.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferCompetently.put(byteBuffer.get(iPosition + 1));
                byteBufferCompetently.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferCompetently.put(byteBuffer.get(iPosition + 1));
                byteBufferCompetently.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferCompetently.flip();
    }
}
