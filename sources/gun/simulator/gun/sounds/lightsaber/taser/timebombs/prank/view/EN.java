package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface EN {
    boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i);

    boolean secureDecodersExplicit();
}
