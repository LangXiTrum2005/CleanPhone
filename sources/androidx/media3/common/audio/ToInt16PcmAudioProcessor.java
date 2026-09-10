package androidx.media3.common.audio;

import androidx.media3.common.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.f5563c;
        if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 2 ? new AudioProcessor.AudioFormat(audioFormat.f5561a, audioFormat.f5562b, 2) : AudioProcessor.AudioFormat.f5560e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f5564b.f5563c;
        if (i3 == 3) {
            i2 *= 2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else {
            if (i3 != 21) {
                if (i3 == 22) {
                    i2 /= 2;
                } else if (i3 != 268435456) {
                    if (i3 != 1342177280) {
                        if (i3 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i2 /= 2;
                    }
                }
            }
            i2 /= 3;
            i2 *= 2;
        }
        ByteBuffer byteBufferF = f(i2);
        int i4 = this.f5564b.f5563c;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferF.put((byte) 0);
                byteBufferF.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                short sI = (short) (Util.i(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferF.put((byte) (sI & 255));
                byteBufferF.put((byte) ((sI >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 21) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i4 == 22) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                byteBufferF.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i4 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
