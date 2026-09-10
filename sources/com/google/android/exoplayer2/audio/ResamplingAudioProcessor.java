package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ResamplingAudioProcessor extends BaseAudioProcessor {
    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.f17290c;
        if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 2 ? new AudioProcessor.AudioFormat(audioFormat.f17288a, audioFormat.f17289b, 2) : AudioProcessor.AudioFormat.f17287e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f17319b.f17290c;
        if (i3 == 3) {
            i2 *= 2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else if (i3 != 268435456) {
            if (i3 != 536870912) {
                if (i3 != 805306368) {
                    throw new IllegalStateException();
                }
                i2 /= 2;
            } else {
                i2 /= 3;
                i2 *= 2;
            }
        }
        ByteBuffer byteBufferF = f(i2);
        int i4 = this.f17319b.f17290c;
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
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i4 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                byteBufferF.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
