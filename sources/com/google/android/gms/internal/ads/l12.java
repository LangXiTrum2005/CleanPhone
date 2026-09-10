package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z61 f16646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s6 f16647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f16648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioTrack f16649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d12 f16653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f16654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16656k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f16657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16664t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16665u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f16666v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f16667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f16669y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f16670z;

    public l12(z61 z61Var, s6 s6Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f16646a = z61Var;
        this.f16647b = s6Var;
        this.f16649d = audioTrack;
        try {
            this.f16657m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f16648c = new long[10];
        this.f16670z = C.TIME_UNSET;
        this.f16669y = C.TIME_UNSET;
        this.f16653h = new d12(audioTrack, z61Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f16650e = sampleRate;
        boolean zD = uu0.d(i10);
        this.f16652g = zD;
        this.f16651f = zD ? uu0.u(sampleRate, i12 / i11) : -9223372036854775807L;
        this.f16661q = 0L;
        this.f16662r = 0L;
        this.f16665u = C.TIME_UNSET;
        this.f16666v = C.TIME_UNSET;
        this.f16659o = 0L;
        this.f16658n = 0L;
        this.f16654i = 1.0f;
        this.f16655j = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0326  */
    /* JADX WARN: Code duplicated, block: B:101:0x0333  */
    /* JADX WARN: Code duplicated, block: B:103:0x033a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0357  */
    /* JADX WARN: Code duplicated, block: B:108:0x0359  */
    /* JADX WARN: Code duplicated, block: B:110:0x035c  */
    /* JADX WARN: Code duplicated, block: B:111:0x037a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0387  */
    /* JADX WARN: Code duplicated, block: B:115:0x0389  */
    /* JADX WARN: Code duplicated, block: B:120:0x0391  */
    /* JADX WARN: Code duplicated, block: B:123:0x039f  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0294  */
    /* JADX WARN: Code duplicated, block: B:75:0x0298  */
    /* JADX WARN: Code duplicated, block: B:77:0x029c  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0301  */
    /* JADX WARN: Code duplicated, block: B:95:0x030f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0316  */
    /* JADX WARN: Code duplicated, block: B:98:0x031c  */
    public final long a() {
        AudioTrack audioTrack;
        d12 d12Var;
        s6 s6Var;
        float f10;
        long j10;
        int i10;
        long jNanoTime;
        int i11;
        l12 l12Var;
        long jC;
        int playState;
        long j11;
        long j12;
        long jX;
        long j13;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        AudioTimestamp audioTimestamp;
        float f11;
        int i16;
        int i17;
        AudioTimestamp audioTimestamp2;
        long j14;
        long j15;
        long j16;
        int i18;
        Method method;
        Method method2;
        AudioTrack audioTrack2 = this.f16649d;
        int playState2 = audioTrack2.getPlayState();
        d12 d12Var2 = this.f16653h;
        s6 s6Var2 = this.f16647b;
        float f12 = this.f16654i;
        if (playState2 == 3) {
            s6Var2.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            j10 = 1000;
            if (jNanoTime2 - this.l >= 30000) {
                long jU = uu0.u(this.f16650e, d());
                if (jU != 0) {
                    int i19 = this.f16663s;
                    if (f12 == 1.0f) {
                        i13 = 1;
                    } else {
                        i13 = 1;
                        jU = Math.round(jU / ((double) f12));
                    }
                    long[] jArr = this.f16648c;
                    jArr[i19] = jU - jNanoTime2;
                    this.f16663s = (this.f16663s + 1) % 10;
                    int i20 = this.f16664t;
                    if (i20 < 10) {
                        this.f16664t = i20 + 1;
                    }
                    this.l = jNanoTime2;
                    this.f16656k = 0L;
                    int i21 = 0;
                    while (true) {
                        int i22 = this.f16664t;
                        d12Var = d12Var2;
                        i14 = 2;
                        if (i21 >= i22) {
                            break;
                        }
                        this.f16656k = (jArr[i21] / ((long) i22)) + this.f16656k;
                        i21++;
                        d12Var2 = d12Var;
                    }
                } else {
                    audioTrack = audioTrack2;
                    d12Var = d12Var2;
                    s6Var = s6Var2;
                }
                f10 = f12;
            } else {
                i13 = 1;
                d12Var = d12Var2;
                i14 = 2;
            }
            long j17 = this.f16658n;
            if (!this.f16652g || (method = this.f16657m) == null) {
                i15 = i14;
            } else {
                int i23 = i14;
                if (jNanoTime2 - this.f16659o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str = uu0.f20901a;
                        long jIntValue = ((long) num.intValue()) * 1000;
                        i15 = i23;
                        try {
                            long j18 = jIntValue - this.f16651f;
                            this.f16658n = j18;
                            long jMax = Math.max(j18, 0L);
                            this.f16658n = jMax;
                            if (jMax > 10000000) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 41);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(jMax);
                                v71.y("AudioTrackAudioOutput", sb2.toString());
                                this.f16658n = 0L;
                            }
                        } catch (Exception unused) {
                            method2 = null;
                            this.f16657m = method2;
                        }
                    } catch (Exception unused2) {
                        i15 = i23;
                        method2 = null;
                    }
                    this.f16659o = jNanoTime2;
                } else {
                    i15 = i23;
                }
            }
            int i24 = j17 != this.f16658n ? i13 : 0;
            long jC2 = c(jNanoTime2);
            z61 z61Var = (z61) d12Var.f13360i;
            int i25 = d12Var.f13352a;
            sa saVar = (sa) d12Var.f13359h;
            if (i24 == 0) {
                audioTrack = audioTrack2;
                s6Var = s6Var2;
                if (jNanoTime2 - d12Var.f13356e < d12Var.f13355d) {
                    f10 = f12;
                }
            } else {
                audioTrack = audioTrack2;
                s6Var = s6Var2;
            }
            d12Var.f13356e = jNanoTime2;
            AudioTrack audioTrack3 = (AudioTrack) saVar.f19925d;
            AudioTimestamp audioTimestamp3 = (AudioTimestamp) saVar.f19926e;
            boolean timestamp = audioTrack3.getTimestamp(audioTimestamp3);
            if (timestamp) {
                long j19 = audioTimestamp3.framePosition;
                if (saVar.f19923b > j19) {
                    saVar.f19922a++;
                }
                saVar.f19923b = j19;
                saVar.f19924c = j19 + (saVar.f19922a << 32);
            }
            if (timestamp) {
                long j20 = audioTimestamp3.nanoTime / 1000;
                z10 = timestamp;
                long jX2 = uu0.x(jNanoTime2 - (((AudioTimestamp) saVar.f19926e).nanoTime / 1000), f12) + uu0.u(i25, saVar.f19924c);
                if (Math.abs(j20 - jNanoTime2) > 5000000) {
                    long j21 = saVar.f19924c;
                    long jD = ((j12) z61Var.f22523a).d();
                    audioTimestamp = audioTimestamp3;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j21).length() + 52 + String.valueOf(j20).length() + 2 + String.valueOf(jNanoTime2).length() + 2 + String.valueOf(jC2).length() + 2 + String.valueOf(jD).length());
                    f11 = f12;
                    q4.a.r(sb3, "Spurious audio timestamp (system clock mismatch): ", j21, ", ");
                    sb3.append(j20);
                    q4.a.r(sb3, ", ", jNanoTime2, ", ");
                    sb3.append(jC2);
                    sb3.append(", ");
                    sb3.append(jD);
                    v71.y("AudioTrackAudioOutput", sb3.toString());
                    d12Var = d12Var;
                    d12Var.b(4);
                    i16 = i25;
                } else {
                    audioTimestamp = audioTimestamp3;
                    f11 = f12;
                    if (Math.abs(jX2 - jC2) <= 5000000) {
                        i16 = i25;
                        if (d12Var.f13353b == 4) {
                            d12Var = d12Var;
                            i10 = 0;
                            d12Var.b(0);
                        }
                        i17 = d12Var.f13353b;
                        if (i17 != 0) {
                            audioTimestamp2 = audioTimestamp;
                            f10 = f11;
                            if (z10) {
                                j14 = audioTimestamp2.nanoTime;
                                if (j14 / 1000 >= d12Var.f13354c) {
                                    d12Var.f13357f = saVar.f19924c;
                                    d12Var.f13358g = j14 / 1000;
                                    d12Var.b(1);
                                }
                            } else if (jNanoTime2 - d12Var.f13354c > 500000) {
                                d12Var.b(3);
                            }
                        } else if (i17 != i13) {
                            if (i17 != i15) {
                                if (i17 == 3 && z10) {
                                    d12Var.b(i10);
                                }
                            } else if (!z10) {
                                d12Var.b(i10);
                            }
                            f10 = f11;
                        } else if (z10) {
                            j15 = saVar.f19924c;
                            j16 = d12Var.f13357f;
                            if (j15 <= j16) {
                                f10 = f11;
                            } else {
                                i18 = i16;
                                f10 = f11;
                                if (Math.abs((uu0.x(jNanoTime2 - (((AudioTimestamp) saVar.f19926e).nanoTime / 1000), f10) + uu0.u(i18, saVar.f19924c)) - (uu0.x(jNanoTime2 - d12Var.f13358g, f10) + uu0.u(i18, j16))) < 1000) {
                                    d12Var.b(2);
                                }
                            }
                            if (jNanoTime2 - d12Var.f13354c > 2000000) {
                                d12Var.b(3);
                            } else {
                                d12Var.f13357f = saVar.f19924c;
                                d12Var.f13358g = audioTimestamp.nanoTime / 1000;
                            }
                        } else {
                            f10 = f11;
                            i10 = 0;
                            d12Var.b(0);
                        }
                        s6Var.getClass();
                        jNanoTime = System.nanoTime() / j10;
                        if (d12Var.f13353b == 2) {
                            i11 = 1;
                        } else {
                            i11 = i10;
                        }
                        if (i11 != 0) {
                            sa saVar2 = (sa) d12Var.f13359h;
                            jC = uu0.x(jNanoTime - (((AudioTimestamp) saVar2.f19926e).nanoTime / j10), f10) + uu0.u(d12Var.f13352a, saVar2.f19924c);
                            l12Var = this;
                        } else {
                            l12Var = this;
                            jC = l12Var.c(jNanoTime);
                        }
                        playState = audioTrack.getPlayState();
                        if (playState == 3) {
                            if (i11 == 0 || ((i12 = d12Var.f13353b) != 0 && i12 != 1)) {
                                l12Var.b(jC);
                            }
                            j11 = l12Var.f16670z;
                            if (j11 != C.TIME_UNSET) {
                                j12 = jC - l12Var.f16669y;
                                jX = uu0.x(jNanoTime - j11, f10);
                                j13 = l12Var.f16669y + jX;
                                long jAbs = Math.abs(j13 - jC);
                                if (j12 != 0 && jAbs < 1000000) {
                                    long j22 = (jX * 10) / 100;
                                    jC = Math.max(j13 - j22, Math.min(jC, j13 + j22));
                                }
                            }
                            l12Var.f16670z = jNanoTime;
                            l12Var.f16669y = jC;
                        } else if (playState == 1) {
                            l12Var.b(jC);
                            return jC;
                        }
                        return jC;
                    }
                    d12Var = d12Var;
                    long j23 = saVar.f19924c;
                    long jD2 = ((j12) z61Var.f22523a).d();
                    i16 = i25;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j23).length() + 54 + String.valueOf(j20).length() + 2 + String.valueOf(jNanoTime2).length() + 2 + String.valueOf(jC2).length() + 2 + String.valueOf(jD2).length());
                    q4.a.r(sb4, "Spurious audio timestamp (frame position mismatch): ", j23, ", ");
                    sb4.append(j20);
                    q4.a.r(sb4, ", ", jNanoTime2, ", ");
                    sb4.append(jC2);
                    sb4.append(", ");
                    sb4.append(jD2);
                    v71.y("AudioTrackAudioOutput", sb4.toString());
                    d12Var.b(4);
                }
            } else {
                z10 = timestamp;
                audioTimestamp = audioTimestamp3;
                f11 = f12;
                i16 = i25;
                d12Var = d12Var;
            }
            d12Var = d12Var;
            i10 = 0;
            i17 = d12Var.f13353b;
            if (i17 != 0) {
                audioTimestamp2 = audioTimestamp;
                f10 = f11;
                if (z10) {
                    j14 = audioTimestamp2.nanoTime;
                    if (j14 / 1000 >= d12Var.f13354c) {
                        d12Var.f13357f = saVar.f19924c;
                        d12Var.f13358g = j14 / 1000;
                        d12Var.b(1);
                    }
                } else if (jNanoTime2 - d12Var.f13354c > 500000) {
                    d12Var.b(3);
                }
            } else if (i17 != i13) {
                if (i17 != i15) {
                    if (i17 == 3) {
                        d12Var.b(i10);
                    }
                } else if (!z10) {
                    d12Var.b(i10);
                }
                f10 = f11;
            } else if (z10) {
                j15 = saVar.f19924c;
                j16 = d12Var.f13357f;
                if (j15 <= j16) {
                    f10 = f11;
                } else {
                    i18 = i16;
                    f10 = f11;
                    if (Math.abs((uu0.x(jNanoTime2 - (((AudioTimestamp) saVar.f19926e).nanoTime / 1000), f10) + uu0.u(i18, saVar.f19924c)) - (uu0.x(jNanoTime2 - d12Var.f13358g, f10) + uu0.u(i18, j16))) < 1000) {
                        d12Var.b(2);
                    }
                }
                if (jNanoTime2 - d12Var.f13354c > 2000000) {
                    d12Var.b(3);
                } else {
                    d12Var.f13357f = saVar.f19924c;
                    d12Var.f13358g = audioTimestamp.nanoTime / 1000;
                }
            } else {
                f10 = f11;
                i10 = 0;
                d12Var.b(0);
            }
            s6Var.getClass();
            jNanoTime = System.nanoTime() / j10;
            if (d12Var.f13353b == 2) {
                i11 = 1;
            } else {
                i11 = i10;
            }
            if (i11 != 0) {
                sa saVar3 = (sa) d12Var.f13359h;
                jC = uu0.x(jNanoTime - (((AudioTimestamp) saVar3.f19926e).nanoTime / j10), f10) + uu0.u(d12Var.f13352a, saVar3.f19924c);
                l12Var = this;
            } else {
                l12Var = this;
                jC = l12Var.c(jNanoTime);
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (i11 == 0) {
                    l12Var.b(jC);
                } else {
                    l12Var.b(jC);
                }
                j11 = l12Var.f16670z;
                if (j11 != C.TIME_UNSET) {
                    j12 = jC - l12Var.f16669y;
                    jX = uu0.x(jNanoTime - j11, f10);
                    j13 = l12Var.f16669y + jX;
                    long jAbs2 = Math.abs(j13 - jC);
                    if (j12 != 0) {
                        long j24 = (jX * 10) / 100;
                        jC = Math.max(j13 - j24, Math.min(jC, j13 + j24));
                    }
                }
                l12Var.f16670z = jNanoTime;
                l12Var.f16669y = jC;
            } else if (playState == 1) {
                l12Var.b(jC);
                return jC;
            }
            return jC;
        }
        audioTrack = audioTrack2;
        d12Var = d12Var2;
        s6Var = s6Var2;
        f10 = f12;
        j10 = 1000;
        i10 = 0;
        s6Var.getClass();
        jNanoTime = System.nanoTime() / j10;
        if (d12Var.f13353b == 2) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        if (i11 != 0) {
            sa saVar4 = (sa) d12Var.f13359h;
            jC = uu0.x(jNanoTime - (((AudioTimestamp) saVar4.f19926e).nanoTime / j10), f10) + uu0.u(d12Var.f13352a, saVar4.f19924c);
            l12Var = this;
        } else {
            l12Var = this;
            jC = l12Var.c(jNanoTime);
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (i11 == 0) {
                l12Var.b(jC);
            } else {
                l12Var.b(jC);
            }
            j11 = l12Var.f16670z;
            if (j11 != C.TIME_UNSET) {
                j12 = jC - l12Var.f16669y;
                jX = uu0.x(jNanoTime - j11, f10);
                j13 = l12Var.f16669y + jX;
                long jAbs3 = Math.abs(j13 - jC);
                if (j12 != 0) {
                    long j25 = (jX * 10) / 100;
                    jC = Math.max(j13 - j25, Math.min(jC, j13 + j25));
                }
            }
            l12Var.f16670z = jNanoTime;
            l12Var.f16669y = jC;
        } else if (playState == 1) {
            l12Var.b(jC);
            return jC;
        }
        return jC;
    }

    public final void b(long j10) {
        long j11 = this.f16655j;
        if (j11 == C.TIME_UNSET || j10 < j11) {
            return;
        }
        long jRound = j10 - j11;
        String str = uu0.f20901a;
        float f10 = this.f16654i;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long jS = uu0.s(jRound);
        this.f16647b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - jS;
        this.f16655j = C.TIME_UNSET;
        j12 j12Var = (j12) this.f16646a.f22523a;
        mk0 mk0Var = j12Var.f15925i;
        mk0Var.getClass();
        if (Thread.currentThread() == ((Thread) mk0Var.f17461c)) {
            mk0 mk0Var2 = j12Var.f15925i;
            q2 q2Var = new q2();
            q2Var.f18888a = jCurrentTimeMillis;
            mk0Var2.i(-1, q2Var);
            mk0Var2.j();
        }
    }

    public final long c(long j10) {
        long jX;
        int i10 = this.f16664t;
        int i11 = this.f16650e;
        if (i10 == 0) {
            jX = this.f16665u != C.TIME_UNSET ? uu0.u(i11, e()) : uu0.u(i11, d());
        } else {
            jX = uu0.x(j10 + this.f16656k, this.f16654i);
        }
        long jMax = Math.max(0L, jX - this.f16658n);
        return this.f16665u != C.TIME_UNSET ? Math.min(uu0.u(i11, this.f16668x), jMax) : jMax;
    }

    public final long d() {
        if (this.f16665u != C.TIME_UNSET) {
            return Math.min(this.f16668x, e());
        }
        this.f16647b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f16660p >= 5) {
            AudioTrack audioTrack = this.f16649d;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f16661q > playbackHeadPosition) {
                    this.f16662r++;
                }
                this.f16661q = playbackHeadPosition;
            }
            this.f16660p = jElapsedRealtime;
        }
        return this.f16661q + (this.f16662r << 32);
    }

    public final long e() {
        if (this.f16649d.getPlayState() == 2) {
            return this.f16667w;
        }
        this.f16647b.getClass();
        return this.f16667w + uu0.v(uu0.x(uu0.t(SystemClock.elapsedRealtime()) - this.f16665u, this.f16654i), this.f16650e, 1000000L, RoundingMode.UP);
    }
}
