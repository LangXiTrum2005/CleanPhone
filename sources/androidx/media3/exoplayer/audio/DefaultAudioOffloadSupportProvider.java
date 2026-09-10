package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f6116b;

    public static final class Api29 {
        public static AudioOffloadSupport a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z2) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return AudioOffloadSupport.d;
            }
            AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
            builder.f6077a = true;
            builder.f6079c = z2;
            return builder.a();
        }
    }

    public static final class Api31 {
        public static AudioOffloadSupport a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z2) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.d;
            }
            AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
            boolean z3 = Util.f5683a > 32 && playbackOffloadSupport == 2;
            builder.f6077a = true;
            builder.f6078b = z3;
            builder.f6079c = z2;
            return builder.a();
        }
    }

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.f6115a = context;
    }
}
