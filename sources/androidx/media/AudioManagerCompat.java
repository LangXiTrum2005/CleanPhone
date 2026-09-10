package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class AudioManagerCompat {

    public static class Api21Impl {
        public static boolean a(AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }
    }

    public static class Api26Impl {
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static class Api28Impl {
        public static int a(AudioManager audioManager, int i2) {
            return audioManager.getStreamMinVolume(i2);
        }
    }
}
