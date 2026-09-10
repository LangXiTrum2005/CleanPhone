package com.badlogic.gdx.backends.android;

import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class DisabledAndroidAudio implements AndroidAudio {
    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
    }

    @Override // com.badlogic.gdx.Audio
    public String[] getAvailableOutputDevices() {
        return new String[0];
    }

    @Override // com.badlogic.gdx.Audio
    public AudioDevice newAudioDevice(int i, boolean z) {
        throw new GdxRuntimeException("Android audio is not enabled by the application config");
    }

    @Override // com.badlogic.gdx.Audio
    public AudioRecorder newAudioRecorder(int i, boolean z) {
        throw new GdxRuntimeException("Android audio is not enabled by the application config");
    }

    @Override // com.badlogic.gdx.Audio
    public Music newMusic(FileHandle fileHandle) {
        throw new GdxRuntimeException("Android audio is not enabled by the application config");
    }

    @Override // com.badlogic.gdx.Audio
    public Sound newSound(FileHandle fileHandle) {
        throw new GdxRuntimeException("Android audio is not enabled by the application config");
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void notifyMusicDisposed(AndroidMusic androidMusic) {
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void pause() {
    }

    @Override // com.badlogic.gdx.backends.android.AndroidAudio
    public void resume() {
    }

    @Override // com.badlogic.gdx.Audio
    public boolean switchOutputDevice(String str) {
        return false;
    }
}
