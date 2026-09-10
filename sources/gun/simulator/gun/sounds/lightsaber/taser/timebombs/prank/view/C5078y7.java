package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5078y7 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5046xm f5262a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public C4990x7 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public C5078y7(C5046xm c5046xm) {
        this.f5262a = c5046xm;
        if (Ug0.f3833a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    public final long a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return Math.min(this.B, this.A + ((Ug0.w((jElapsedRealtime * 1000) - j, this.j) * ((long) this.g)) / 1000000));
        }
        if (jElapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (Ug0.f3833a > 29) {
                    if (this.t > playbackHeadPosition) {
                        this.u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                    this.z = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    if (this.t > playbackHeadPosition) {
                        this.u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (this.z == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.z = jElapsedRealtime;
                }
            }
            this.s = jElapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    public final boolean b(long j) {
        if (j <= a()) {
            if (this.h) {
                AudioTrack audioTrack = this.c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final void c() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
