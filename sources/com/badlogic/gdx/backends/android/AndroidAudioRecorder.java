package com.badlogic.gdx.backends.android;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class AndroidAudioRecorder implements AudioRecorder {
    private AudioRecord recorder;

    @SuppressLint({"MissingPermission"})
    public AndroidAudioRecorder(int i, boolean z) {
        int i2 = z ? 16 : 12;
        AudioRecord audioRecord = new AudioRecord(1, i, i2, 2, AudioRecord.getMinBufferSize(i, i2, 2));
        this.recorder = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new GdxRuntimeException("Unable to initialize AudioRecorder.\nDo you have the RECORD_AUDIO permission?");
        }
        this.recorder.startRecording();
    }

    @Override // com.badlogic.gdx.audio.AudioRecorder, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.recorder.stop();
        this.recorder.release();
    }

    @Override // com.badlogic.gdx.audio.AudioRecorder
    public void read(short[] sArr, int i, int i2) {
        int i3 = 0;
        while (i3 != i2) {
            i3 += this.recorder.read(sArr, i + i3, i2 - i3);
        }
    }
}
