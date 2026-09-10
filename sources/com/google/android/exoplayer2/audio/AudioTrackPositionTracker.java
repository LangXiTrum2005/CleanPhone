package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class AudioTrackPositionTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f17303A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f17304B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17305E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f17306F;
    public long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Listener f17307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f17309c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17310e;
    public AudioTimestampPoller f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17312i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17313l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f17314n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17315p;
    public boolean q;
    public long r;
    public long s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17316u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17317w;
    public int x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f17318z;

    public interface Listener {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f17307a = listener;
        if (Util.f18979a >= 18) {
            try {
                this.f17314n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f17308b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    public final long a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f17304B, this.f17303A + ((Util.r((jElapsedRealtime * 1000) - j, this.j) * ((long) this.g)) / 1000000));
        }
        if (jElapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.f17309c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f17311h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (Util.f18979a > 29) {
                    if (this.t > playbackHeadPosition) {
                        this.f17316u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                    this.f17318z = -9223372036854775807L;
                    if (this.t > playbackHeadPosition) {
                        this.f17316u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (this.f17318z == -9223372036854775807L) {
                    this.f17318z = jElapsedRealtime;
                }
            }
            this.s = jElapsedRealtime;
        }
        return this.t + (this.f17316u << 32);
    }

    public final boolean b(long j) {
        if (j > a()) {
            return true;
        }
        if (!this.f17311h) {
            return false;
        }
        AudioTrack audioTrack = this.f17309c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final void c() {
        this.f17313l = 0L;
        this.x = 0;
        this.f17317w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
