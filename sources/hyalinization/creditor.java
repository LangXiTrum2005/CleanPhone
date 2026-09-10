package hyalinization;

import androidx.media3.common.audio.AudioProcessor;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ToFloatPcmAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class creditor extends androidx.media3.common.audio.saneness {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int f28036taiyuan = Float.floatToIntBits(Float.NaN);

    public static void impromptu(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f28036taiyuan) {
            iFloatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.saneness
    public AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = attabalVar.f10780dern;
        if (decarock.grimness.palmyra(i)) {
            return i != 4 ? new AudioProcessor.attabal(attabalVar.f10779attabal, attabalVar.f10781saneness, 4) : AudioProcessor.attabal.f10778marial;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferCompetently;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f10809saneness.f10780dern;
        if (i2 == 21) {
            byteBufferCompetently = competently((i / 3) * 4);
            while (iPosition < iLimit) {
                impromptu(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferCompetently);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferCompetently = competently(i);
            while (iPosition < iLimit) {
                impromptu((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferCompetently);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferCompetently = competently((i / 3) * 4);
            while (iPosition < iLimit) {
                impromptu(((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferCompetently);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferCompetently = competently(i);
            while (iPosition < iLimit) {
                impromptu((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferCompetently);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferCompetently.flip();
    }
}
