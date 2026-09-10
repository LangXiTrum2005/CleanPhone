package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
final class AudioFocusManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f5817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioFocusListener f5818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlayerControl f5819c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5820e = 1.0f;

    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        public final Handler X;

        public AudioFocusListener(Handler handler) {
            this.X = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i2) {
            this.X.post(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    audioFocusManager.getClass();
                    int i3 = i2;
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2) {
                            audioFocusManager.b(4);
                            return;
                        }
                        AudioFocusManager.PlayerControl playerControl = audioFocusManager.f5819c;
                        if (playerControl != null) {
                            playerControl.v(0);
                        }
                        audioFocusManager.b(3);
                        return;
                    }
                    if (i3 == -1) {
                        AudioFocusManager.PlayerControl playerControl2 = audioFocusManager.f5819c;
                        if (playerControl2 != null) {
                            playerControl2.v(-1);
                        }
                        audioFocusManager.a();
                        audioFocusManager.b(1);
                        return;
                    }
                    if (i3 != 1) {
                        androidx.datastore.preferences.protobuf.a.C(i3, "Unknown focus change type: ", "AudioFocusManager");
                        return;
                    }
                    audioFocusManager.b(2);
                    AudioFocusManager.PlayerControl playerControl3 = audioFocusManager.f5819c;
                    if (playerControl3 != null) {
                        playerControl3.v(1);
                    }
                }
            });
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void v(int i2);

        void w();
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f5817a = audioManager;
        this.f5819c = playerControl;
        this.f5818b = new AudioFocusListener(handler);
        this.d = 0;
    }

    public final void a() {
        int i2 = this.d;
        if (i2 == 1 || i2 == 0) {
            return;
        }
        int i3 = Util.f5683a;
        AudioManager audioManager = this.f5817a;
        if (i3 >= 26) {
            return;
        }
        audioManager.abandonAudioFocus(this.f5818b);
    }

    public final void b(int i2) {
        if (this.d == i2) {
            return;
        }
        this.d = i2;
        float f = i2 == 4 ? 0.2f : 1.0f;
        if (this.f5820e == f) {
            return;
        }
        this.f5820e = f;
        PlayerControl playerControl = this.f5819c;
        if (playerControl != null) {
            playerControl.w();
        }
    }

    public final int c(int i2, boolean z2) {
        a();
        b(0);
        return 1;
    }
}
