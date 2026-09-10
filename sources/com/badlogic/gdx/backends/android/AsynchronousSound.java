package com.badlogic.gdx.backends.android;

import android.os.Handler;
import com.badlogic.gdx.audio.Sound;

/* JADX INFO: loaded from: classes.dex */
public class AsynchronousSound implements Sound {
    private final Handler handler;
    private final Sound sound;

    public AsynchronousSound(Sound sound, Handler handler) {
        this.sound = sound;
        this.handler = handler;
    }

    @Override // com.badlogic.gdx.audio.Sound, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.sound.dispose();
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop() {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.4
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.loop();
            }
        });
        return 0L;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause() {
        this.sound.pause();
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play() {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.1
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.play();
            }
        });
        return 0L;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume() {
        this.sound.resume();
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setLooping(long j, boolean z) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setPan(long j, float f, float f2) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setPitch(long j, float f) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setVolume(long j, float f) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop() {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.7
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.stop();
            }
        });
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(final float f) {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.5
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.loop(f);
            }
        });
        return 0L;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause(long j) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(final float f) {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.2
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.play(f);
            }
        });
        return 0L;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume(long j) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop(long j) {
        throw new UnsupportedOperationException("Asynchronous audio doesn't support sound id based operations.");
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(final float f, final float f2, final float f3) {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.6
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.loop(f, f2, f3);
            }
        });
        return 0L;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(final float f, final float f2, final float f3) {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AsynchronousSound.3
            @Override // java.lang.Runnable
            public void run() {
                AsynchronousSound.this.sound.play(f, f2, f3);
            }
        });
        return 0L;
    }
}
