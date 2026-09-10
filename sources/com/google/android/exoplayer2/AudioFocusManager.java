package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
final class AudioFocusManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f16990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioFocusListener f16991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlayerControl f16992c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16993e = 1.0f;

    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        public final Handler X;

        public AudioFocusListener(Handler handler) {
            this.X = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i2) {
            this.X.post(new Runnable() { // from class: com.google.android.exoplayer2.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    audioFocusManager.getClass();
                    int i3 = i2;
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2) {
                            audioFocusManager.b(3);
                            return;
                        }
                        AudioFocusManager.PlayerControl playerControl = audioFocusManager.f16992c;
                        if (playerControl != null) {
                            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                            boolean playWhenReady = exoPlayerImpl.getPlayWhenReady();
                            exoPlayerImpl.w(0, playWhenReady ? 2 : 1, playWhenReady);
                        }
                        audioFocusManager.b(2);
                        return;
                    }
                    if (i3 == -1) {
                        AudioFocusManager.PlayerControl playerControl2 = audioFocusManager.f16992c;
                        if (playerControl2 != null) {
                            ExoPlayerImpl exoPlayerImpl2 = ExoPlayerImpl.this;
                            boolean playWhenReady2 = exoPlayerImpl2.getPlayWhenReady();
                            exoPlayerImpl2.w(-1, playWhenReady2 ? 2 : 1, playWhenReady2);
                        }
                        audioFocusManager.a();
                        return;
                    }
                    if (i3 != 1) {
                        Z.s(i3, "Unknown focus change type: ", "AudioFocusManager");
                        return;
                    }
                    audioFocusManager.b(1);
                    AudioFocusManager.PlayerControl playerControl3 = audioFocusManager.f16992c;
                    if (playerControl3 != null) {
                        ExoPlayerImpl exoPlayerImpl3 = ExoPlayerImpl.this;
                        exoPlayerImpl3.w(1, 1, exoPlayerImpl3.getPlayWhenReady());
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
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f16990a = audioManager;
        this.f16992c = playerControl;
        this.f16991b = new AudioFocusListener(handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        int i2 = Util.f18979a;
        AudioManager audioManager = this.f16990a;
        if (i2 < 26) {
            audioManager.abandonAudioFocus(this.f16991b);
        }
        b(0);
    }

    public final void b(int i2) {
        if (this.d == i2) {
            return;
        }
        this.d = i2;
        float f = i2 == 3 ? 0.2f : 1.0f;
        if (this.f16993e == f) {
            return;
        }
        this.f16993e = f;
        PlayerControl playerControl = this.f16992c;
        if (playerControl != null) {
            int i3 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.t(1, 2, Float.valueOf(exoPlayerImpl.f17043U * exoPlayerImpl.x.f16993e));
        }
    }

    public final int c(int i2, boolean z2) {
        a();
        return z2 ? 1 : -1;
    }
}
