package com.badlogic.gdx.backends.android;

import android.media.AudioTrack;
import com.badlogic.gdx.audio.AudioDevice;

/* JADX INFO: loaded from: classes.dex */
class AndroidAudioDevice implements AudioDevice {
    private short[] buffer = new short[1024];
    private final boolean isMono;
    private final int latency;
    private final AudioTrack track;

    public AndroidAudioDevice(int i, boolean z) {
        this.isMono = z;
        int minBufferSize = AudioTrack.getMinBufferSize(i, z ? 4 : 12, 2);
        AudioTrack audioTrack = new AudioTrack(3, i, z ? 4 : 12, 2, minBufferSize, 1);
        this.track = audioTrack;
        audioTrack.play();
        this.latency = minBufferSize / (z ? 1 : 2);
    }

    @Override // com.badlogic.gdx.audio.AudioDevice, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.track.stop();
        this.track.release();
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public int getLatency() {
        return this.latency;
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public boolean isMono() {
        return this.isMono;
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public void pause() {
        if (this.track.getPlayState() == 3) {
            this.track.pause();
        }
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public void resume() {
        if (this.track.getPlayState() == 2) {
            this.track.play();
        }
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public void setVolume(float f) {
        this.track.setStereoVolume(f, f);
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public void writeSamples(short[] sArr, int i, int i2) {
        int iWrite = this.track.write(sArr, i, i2);
        while (iWrite != i2) {
            iWrite += this.track.write(sArr, i + iWrite, i2 - iWrite);
        }
    }

    @Override // com.badlogic.gdx.audio.AudioDevice
    public void writeSamples(float[] fArr, int i, int i2) {
        if (this.buffer.length < fArr.length) {
            this.buffer = new short[fArr.length];
        }
        int i3 = i + i2;
        int i4 = 0;
        while (i < i3) {
            float f = fArr[i];
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < -1.0f) {
                f = -1.0f;
            }
            this.buffer[i4] = (short) (f * 32767.0f);
            i++;
            i4++;
        }
        int iWrite = this.track.write(this.buffer, 0, i2);
        while (iWrite != i2) {
            iWrite += this.track.write(this.buffer, iWrite, i2 - iWrite);
        }
    }
}
