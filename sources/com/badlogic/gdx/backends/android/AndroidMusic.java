package com.badlogic.gdx.backends.android;

import android.media.MediaPlayer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class AndroidMusic implements Music, MediaPlayer.OnCompletionListener {
    private final AndroidAudio audio;
    private MediaPlayer player;
    private boolean isPrepared = true;
    protected boolean wasPlaying = false;
    private float volume = 1.0f;
    protected Music.OnCompletionListener onCompletionListener = null;

    public AndroidMusic(AndroidAudio androidAudio, MediaPlayer mediaPlayer) {
        this.audio = androidAudio;
        this.player = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
    }

    @Override // com.badlogic.gdx.audio.Music, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            try {
                mediaPlayer.release();
            } finally {
                this.player = null;
                this.onCompletionListener = null;
                this.audio.notifyMusicDisposed(this);
            }
        } catch (Throwable unused) {
            Gdx.app.log("AndroidMusic", "error while disposing AndroidMusic instance, non-fatal");
        }
    }

    public float getDuration() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return 0.0f;
        }
        return mediaPlayer.getDuration() / 1000.0f;
    }

    @Override // com.badlogic.gdx.audio.Music
    public float getPosition() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return 0.0f;
        }
        return mediaPlayer.getCurrentPosition() / 1000.0f;
    }

    @Override // com.badlogic.gdx.audio.Music
    public float getVolume() {
        return this.volume;
    }

    @Override // com.badlogic.gdx.audio.Music
    public boolean isLooping() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            return mediaPlayer.isLooping();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.badlogic.gdx.audio.Music
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.onCompletionListener != null) {
            Gdx.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidMusic.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidMusic androidMusic = AndroidMusic.this;
                    Music.OnCompletionListener onCompletionListener = androidMusic.onCompletionListener;
                    if (onCompletionListener != null) {
                        onCompletionListener.onCompletion(androidMusic);
                    }
                }
            });
        }
    }

    @Override // com.badlogic.gdx.audio.Music
    public void pause() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                this.player.pause();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        this.wasPlaying = false;
    }

    @Override // com.badlogic.gdx.audio.Music
    public void play() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (!this.isPrepared) {
                mediaPlayer.prepare();
                this.isPrepared = true;
            }
            this.player.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setLooping(boolean z) {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setOnCompletionListener(Music.OnCompletionListener onCompletionListener) {
        this.onCompletionListener = onCompletionListener;
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setPan(float f, float f2) {
        float fAbs;
        float fAbs2;
        if (this.player == null) {
            return;
        }
        if (f < 0.0f) {
            fAbs = (1.0f - Math.abs(f)) * f2;
            fAbs2 = f2;
        } else if (f > 0.0f) {
            fAbs2 = (1.0f - Math.abs(f)) * f2;
            fAbs = f2;
        } else {
            fAbs = f2;
            fAbs2 = fAbs;
        }
        this.player.setVolume(fAbs2, fAbs);
        this.volume = f2;
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setPosition(float f) {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (!this.isPrepared) {
                mediaPlayer.prepare();
                this.isPrepared = true;
            }
            this.player.seekTo((int) (f * 1000.0f));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.badlogic.gdx.audio.Music
    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setVolume(f, f);
        this.volume = f;
    }

    @Override // com.badlogic.gdx.audio.Music
    public void stop() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.stop();
        this.isPrepared = false;
    }
}
