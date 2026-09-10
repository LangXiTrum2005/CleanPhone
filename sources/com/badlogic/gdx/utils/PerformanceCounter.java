package com.badlogic.gdx.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.FloatCounter;

/* JADX INFO: loaded from: classes.dex */
public class PerformanceCounter {
    private static final float nano2seconds = 1.0E-9f;
    public float current;
    private long lastTick;
    public final FloatCounter load;
    public final String name;
    private long startTime;
    public final FloatCounter time;
    public boolean valid;

    public PerformanceCounter(String str) {
        this(str, 5);
    }

    public void reset() {
        this.time.reset();
        this.load.reset();
        this.startTime = 0L;
        this.lastTick = 0L;
        this.current = 0.0f;
        this.valid = false;
    }

    public void start() {
        this.startTime = TimeUtils.nanoTime();
        this.valid = false;
    }

    public void stop() {
        if (this.startTime > 0) {
            this.current = ((TimeUtils.nanoTime() - this.startTime) * 1.0E-9f) + this.current;
            this.startTime = 0L;
            this.valid = true;
        }
    }

    public void tick() {
        long jNanoTime = TimeUtils.nanoTime();
        long j = this.lastTick;
        if (j > 0) {
            tick((jNanoTime - j) * 1.0E-9f);
        }
        this.lastTick = jNanoTime;
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public PerformanceCounter(String str, int i) {
        this.startTime = 0L;
        this.lastTick = 0L;
        this.current = 0.0f;
        this.valid = false;
        this.name = str;
        this.time = new FloatCounter(i);
        this.load = new FloatCounter(1);
    }

    public StringBuilder toString(StringBuilder stringBuilder) {
        stringBuilder.append(this.name).append(": [time: ").append(this.time.value).append(", load: ").append(this.load.value).append("]");
        return stringBuilder;
    }

    public void tick(float f) {
        if (!this.valid) {
            Gdx.app.error("PerformanceCounter", "Invalid data, check if you called PerformanceCounter#stop()");
            return;
        }
        this.time.put(this.current);
        float f2 = f == 0.0f ? 0.0f : this.current / f;
        FloatCounter floatCounter = this.load;
        if (f <= 1.0f) {
            f2 = (f2 * f) + ((1.0f - f) * floatCounter.latest);
        }
        floatCounter.put(f2);
        this.current = 0.0f;
        this.valid = false;
    }
}
