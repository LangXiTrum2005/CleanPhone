package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.TimeUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public class FPSLogger {
    int bound;
    long startTime;

    public FPSLogger() {
        this(Integer.MAX_VALUE);
    }

    public void log() {
        int framesPerSecond;
        long jNanoTime = TimeUtils.nanoTime();
        if (jNanoTime - this.startTime <= C.NANOS_PER_SECOND || (framesPerSecond = Gdx.graphics.getFramesPerSecond()) >= this.bound) {
            return;
        }
        Gdx.app.log("FPSLogger", "fps: " + framesPerSecond);
        this.startTime = jNanoTime;
    }

    public void setBound(int i) {
        this.bound = i;
        this.startTime = TimeUtils.nanoTime();
    }

    public FPSLogger(int i) {
        this.bound = i;
        this.startTime = TimeUtils.nanoTime();
    }
}
