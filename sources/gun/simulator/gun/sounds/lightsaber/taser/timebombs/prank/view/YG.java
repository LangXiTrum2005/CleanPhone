package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class YG implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4012a;
    public final JT b;
    public final Uh0 c;
    public InterfaceC4326pd0 d;
    public String e;
    public C4619sw f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public YG(String str) {
        this.f4012a = str;
        JT jt = new JT(1024);
        this.b = jt;
        this.c = new Uh0(jt.f3266a, 2, (Object) null);
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) throws KT {
        int i;
        boolean zH;
        FW.t(this.d);
        while (jt.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    JT jt2 = this.b;
                    Uh0 uh0 = this.c;
                    if (i2 == 2) {
                        int iT = ((this.j & (-225)) << 8) | jt.t();
                        this.i = iT;
                        if (iT > jt2.f3266a.length) {
                            jt2.B(iT);
                            byte[] bArr = jt2.f3266a;
                            uh0.getClass();
                            uh0.o(bArr, bArr.length);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(jt.a(), this.i - this.h);
                        jt.d(uh0.d, this.h, iMin);
                        int i3 = this.h + iMin;
                        this.h = i3;
                        if (i3 == this.i) {
                            uh0.p(0);
                            if (uh0.h()) {
                                if (this.l) {
                                }
                                this.g = 0;
                            } else {
                                this.l = true;
                                int i4 = uh0.i(1);
                                int i5 = i4 == 1 ? uh0.i(1) : 0;
                                this.m = i5;
                                if (i5 != 0) {
                                    throw KT.a(null, null);
                                }
                                if (i4 == 1) {
                                    uh0.i((uh0.i(2) + 1) * 8);
                                }
                                if (!uh0.h()) {
                                    throw KT.a(null, null);
                                }
                                this.n = uh0.i(6);
                                int i6 = uh0.i(4);
                                int i7 = uh0.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw KT.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = uh0.g();
                                    int iB = uh0.b();
                                    C3129c c3129cA0 = AbstractC2845Vx.a0(uh0, true);
                                    this.u = c3129cA0.f4197a;
                                    this.r = c3129cA0.b;
                                    this.t = c3129cA0.c;
                                    int iB2 = iB - uh0.b();
                                    uh0.p(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    uh0.j(bArr2, iB2);
                                    C4531rw c4531rw = new C4531rw();
                                    c4531rw.f4954a = this.e;
                                    c4531rw.k = MimeTypes.AUDIO_AAC;
                                    c4531rw.h = this.u;
                                    c4531rw.x = this.t;
                                    c4531rw.y = this.r;
                                    c4531rw.m = Collections.singletonList(bArr2);
                                    c4531rw.c = this.f4012a;
                                    C4619sw c4619sw = new C4619sw(c4531rw);
                                    if (!c4619sw.equals(this.f)) {
                                        this.f = c4619sw;
                                        this.s = 1024000000 / ((long) c4619sw.z);
                                        this.d.e(c4619sw);
                                    }
                                } else {
                                    int i8 = uh0.i((uh0.i(2) + 1) * 8);
                                    int iB3 = uh0.b();
                                    C3129c c3129cA1 = AbstractC2845Vx.a0(uh0, true);
                                    this.u = c3129cA1.f4197a;
                                    this.r = c3129cA1.b;
                                    this.t = c3129cA1.c;
                                    uh0.s(i8 - (iB3 - uh0.b()));
                                }
                                int i9 = uh0.i(3);
                                this.o = i9;
                                if (i9 == 0) {
                                    uh0.s(8);
                                } else if (i9 == 1) {
                                    uh0.s(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    uh0.s(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    uh0.s(1);
                                }
                                boolean zH2 = uh0.h();
                                this.p = zH2;
                                this.q = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.q = uh0.i((uh0.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = uh0.h();
                                            this.q = (this.q << 8) + ((long) uh0.i(8));
                                        } while (zH);
                                    }
                                }
                                if (uh0.h()) {
                                    uh0.s(8);
                                }
                            }
                            if (this.m != 0) {
                                throw KT.a(null, null);
                            }
                            if (this.n != 0) {
                                throw KT.a(null, null);
                            }
                            if (this.o != 0) {
                                throw KT.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = uh0.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = uh0.g();
                            if ((iG2 & 7) == 0) {
                                jt2.E(iG2 >> 3);
                            } else {
                                uh0.j(jt2.f3266a, i10 * 8);
                                jt2.E(0);
                            }
                            this.d.d(i10, jt2);
                            long j = this.k;
                            if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                this.d.a(j, 1, i10, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                uh0.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iT2 = jt.t();
                    if ((iT2 & 224) == 224) {
                        this.j = iT2;
                        this.g = 2;
                    } else if (iT2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (jt.t() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.d = interfaceC4353pt.track(c4416qe0.d, 1);
        c4416qe0.b();
        this.e = c4416qe0.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.g = 0;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
