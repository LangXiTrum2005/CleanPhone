package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17003c;
    public long d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17004e = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17005h = -9223372036854775807L;
    public float k = 0.97f;
    public float j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17007l = 1.0f;
    public long m = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17006i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17008n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public static final class Builder {
    }

    public DefaultLivePlaybackSpeedControl(long j, long j2, float f) {
        this.f17001a = j;
        this.f17002b = j2;
        this.f17003c = f;
    }

    public final void a() {
        long j = this.d;
        if (j != -9223372036854775807L) {
            long j2 = this.f17004e;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.g;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f17005h;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.f17006i = j;
        this.f17008n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    public final void b(long j) {
        this.f17004e = j;
        a();
    }
}
