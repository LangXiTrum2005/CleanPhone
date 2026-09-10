package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;

/* JADX INFO: loaded from: classes.dex */
public class AsynchronousAndroidAudio extends DefaultAndroidAudio {
    private final Handler handler;
    private final HandlerThread handlerThread;

    public AsynchronousAndroidAudio(Context context, AndroidApplicationConfiguration androidApplicationConfiguration) {
        super(context, androidApplicationConfiguration);
        HandlerThread handlerThread = new HandlerThread("libGDX Sound Management");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    @Override // com.badlogic.gdx.backends.android.DefaultAndroidAudio, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        super.dispose();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.badlogic.gdx.backends.android.DefaultAndroidAudio, com.badlogic.gdx.Audio
    public Sound newSound(FileHandle fileHandle) {
        return new AsynchronousSound(super.newSound(fileHandle), this.handler);
    }
}
