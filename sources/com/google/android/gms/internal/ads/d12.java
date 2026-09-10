package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13360i;

    public d12(AudioTrack audioTrack, z61 z61Var) {
        this.f13359h = new sa(audioTrack);
        this.f13352a = audioTrack.getSampleRate();
        this.f13360i = z61Var;
        b(0);
    }

    public void a(int i10) {
        this.f13353b = i10;
        if (i10 == 0) {
            this.f13356e = 0L;
            this.f13357f = -1L;
            this.f13358g = C.TIME_UNSET;
            this.f13354c = System.nanoTime() / 1000;
            this.f13355d = Xa.f27908s;
            return;
        }
        if (i10 == 1) {
            this.f13355d = Xa.f27908s;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f13355d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f13355d = 500000L;
        }
    }

    public void b(int i10) {
        this.f13353b = i10;
        long j10 = Xa.f27908s;
        if (i10 == 0) {
            this.f13356e = 0L;
            this.f13357f = -1L;
            this.f13358g = C.TIME_UNSET;
            this.f13354c = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f13355d = Xa.f27908s;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f13355d = j10;
    }

    public d12(AudioTrack audioTrack, oa.k0 k0Var) {
        this.f13359h = new r1.p(audioTrack);
        this.f13352a = audioTrack.getSampleRate();
        this.f13360i = k0Var;
        a(0);
    }
}
