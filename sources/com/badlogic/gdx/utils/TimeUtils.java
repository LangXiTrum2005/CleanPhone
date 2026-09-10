package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public final class TimeUtils {
    private static final long nanosPerMilli = 1000000;

    public static long millis() {
        return System.currentTimeMillis();
    }

    public static long millisToNanos(long j) {
        return j * 1000000;
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static long nanosToMillis(long j) {
        return j / 1000000;
    }

    public static long timeSinceMillis(long j) {
        return millis() - j;
    }

    public static long timeSinceNanos(long j) {
        return nanoTime() - j;
    }
}
