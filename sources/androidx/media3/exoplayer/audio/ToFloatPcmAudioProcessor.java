package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class ToFloatPcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f6183i = Float.floatToIntBits(Float.NaN);

    public static void g(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f6183i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat b(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.f5563c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new AudioProcessor.AudioFormat(audioFormat.f5561a, audioFormat.f5562b, 4) : AudioProcessor.AudioFormat.f5560e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferF;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f5564b.f5563c;
        if (i3 == 21) {
            byteBufferF = f((i2 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferF);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferF = f(i2);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferF);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferF = f((i2 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferF);
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferF = f(i2);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferF);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
