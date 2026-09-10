package com.badlogic.gdx.backends.android;

import android.media.AudioManager;
import android.media.SoundPool;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.IntArray;

/* JADX INFO: loaded from: classes.dex */
final class AndroidSound implements Sound {
    final AudioManager manager;
    final int soundId;
    final SoundPool soundPool;
    final IntArray streamIds = new IntArray(8);

    public AndroidSound(SoundPool soundPool, AudioManager audioManager, int i) {
        this.soundPool = soundPool;
        this.manager = audioManager;
        this.soundId = i;
    }

    @Override // com.badlogic.gdx.audio.Sound, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.soundPool.unload(this.soundId);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop() {
        return loop(1.0f);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause() {
        this.soundPool.autoPause();
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play() {
        return play(1.0f);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume() {
        this.soundPool.autoResume();
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setLooping(long j, boolean z) {
        int i = (int) j;
        this.soundPool.pause(i);
        this.soundPool.setLoop(i, z ? -1 : 0);
        if (z) {
            this.soundPool.setPriority(i, 2);
        } else {
            this.soundPool.setPriority(i, 1);
        }
        this.soundPool.resume(i);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setPan(long j, float f, float f2) {
        float fAbs;
        if (f < 0.0f) {
            fAbs = (1.0f - Math.abs(f)) * f2;
        } else if (f > 0.0f) {
            fAbs = f2;
            f2 = (1.0f - Math.abs(f)) * f2;
        } else {
            fAbs = f2;
        }
        this.soundPool.setVolume((int) j, f2, fAbs);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setPitch(long j, float f) {
        this.soundPool.setRate((int) j, f);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void setVolume(long j, float f) {
        this.soundPool.setVolume((int) j, f, f);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop() {
        int i = this.streamIds.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.soundPool.stop(this.streamIds.get(i2));
        }
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float f) {
        IntArray intArray = this.streamIds;
        if (intArray.size == 8) {
            intArray.pop();
        }
        int iPlay = this.soundPool.play(this.soundId, f, f, 2, -1, 1.0f);
        if (iPlay == 0) {
            return -1L;
        }
        this.streamIds.insert(0, iPlay);
        return iPlay;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause(long j) {
        this.soundPool.pause((int) j);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float f) {
        IntArray intArray = this.streamIds;
        if (intArray.size == 8) {
            intArray.pop();
        }
        int iPlay = this.soundPool.play(this.soundId, f, f, 1, 0, 1.0f);
        if (iPlay == 0) {
            return -1L;
        }
        this.streamIds.insert(0, iPlay);
        return iPlay;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume(long j) {
        this.soundPool.resume((int) j);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop(long j) {
        this.soundPool.stop((int) j);
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float f, float f2, float f3) {
        float fAbs;
        float fAbs2;
        IntArray intArray = this.streamIds;
        if (intArray.size == 8) {
            intArray.pop();
        }
        if (f3 < 0.0f) {
            fAbs = f;
            fAbs2 = (1.0f - Math.abs(f3)) * f;
        } else if (f3 > 0.0f) {
            fAbs2 = f;
            fAbs = (1.0f - Math.abs(f3)) * f;
        } else {
            fAbs = f;
            fAbs2 = fAbs;
        }
        int iPlay = this.soundPool.play(this.soundId, fAbs, fAbs2, 2, -1, f2);
        if (iPlay == 0) {
            return -1L;
        }
        this.streamIds.insert(0, iPlay);
        return iPlay;
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float f, float f2, float f3) {
        float fAbs;
        float fAbs2;
        IntArray intArray = this.streamIds;
        if (intArray.size == 8) {
            intArray.pop();
        }
        if (f3 < 0.0f) {
            fAbs = f;
            fAbs2 = (1.0f - Math.abs(f3)) * f;
        } else if (f3 > 0.0f) {
            fAbs2 = f;
            fAbs = (1.0f - Math.abs(f3)) * f;
        } else {
            fAbs = f;
            fAbs2 = fAbs;
        }
        int iPlay = this.soundPool.play(this.soundId, fAbs, fAbs2, 1, 0, f2);
        if (iPlay == 0) {
            return -1L;
        }
        this.streamIds.insert(0, iPlay);
        return iPlay;
    }
}
